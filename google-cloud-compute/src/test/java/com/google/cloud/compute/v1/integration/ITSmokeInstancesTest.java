/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1.integration;

import static junit.framework.TestCase.fail;

import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.NotFoundException;
import com.google.cloud.compute.v1.Allowed;
import com.google.cloud.compute.v1.AttachedDisk;
import com.google.cloud.compute.v1.AttachedDiskInitializeParams;
import com.google.cloud.compute.v1.Firewall;
import com.google.cloud.compute.v1.FirewallsClient;
import com.google.cloud.compute.v1.GetInstanceRequest;
import com.google.cloud.compute.v1.Image;
import com.google.cloud.compute.v1.ImagesClient;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstanceGroupManager;
import com.google.cloud.compute.v1.InstanceGroupManagersClient;
import com.google.cloud.compute.v1.InstanceTemplate;
import com.google.cloud.compute.v1.InstanceTemplatesClient;
import com.google.cloud.compute.v1.InstancesClient;
import com.google.cloud.compute.v1.InstancesScopedList;
import com.google.cloud.compute.v1.InstancesSettings;
import com.google.cloud.compute.v1.NetworkInterface;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.ShieldedInstanceConfig;
import com.google.cloud.compute.v1.ZoneOperationsClient;
import com.google.cloud.compute.v1.ZoneOperationsSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ITSmokeInstancesTest extends BaseTest {
  private static InstancesClient instancesClient;
  private static ZoneOperationsClient operationsClient;
  private static List<Instance> instances;
  private static final String DEFAULT_IMAGE =
      "projects/debian-cloud/global/images/family/debian-10";
  private static final AttachedDisk DISK =
      AttachedDisk.newBuilder()
          .setBoot(true)
          .setAutoDelete(true)
          .setType(AttachedDisk.Type.PERSISTENT)
          .setInitializeParams(
              AttachedDiskInitializeParams.newBuilder().setSourceImage(DEFAULT_IMAGE).build())
          .build();
  private static final String MACHINE_TYPE =
      "https://www.googleapis.com/compute/v1/projects/"
          + DEFAULT_PROJECT
          + "/zones/us-central1-a/machineTypes/n1-standard-1";
  private static final NetworkInterface NETWORK_INTERFACE =
      NetworkInterface.newBuilder().setName("default").build();
  private static String INSTANCE;

  @BeforeClass
  public static void setUp() throws IOException {
    instances = new ArrayList<>();
    InstancesSettings instanceSettings = InstancesSettings.newBuilder().build();
    instancesClient = InstancesClient.create(instanceSettings);
    ZoneOperationsSettings zoneOperationsSettings = ZoneOperationsSettings.newBuilder().build();
    operationsClient = ZoneOperationsClient.create(zoneOperationsSettings);
  }

  @Before
  public void setUpMethod() {
    INSTANCE = generateRandomName("instance");
  }

  @AfterClass
  public static void tearDown() {
    for (Instance instance : instances) {
      instancesClient.delete(DEFAULT_PROJECT, DEFAULT_ZONE, instance.getName());
    }
    instancesClient.close();
  }

  @Test
  public void testInsertInstance() {
    Instance resultInstance = insertInstance();
    assertInstanceDetails(resultInstance);
  }

  @Test
  public void testUpdateInstanceDescToEmpty() {
    // We test here: 1)set body field to an empty string
    //               2)unset body field
    Instance resultInstance = insertInstance();
    Assert.assertEquals("test", resultInstance.getDescription());
    Assert.assertEquals(0, resultInstance.getScheduling().getMinNodeCpus());
    Instance descInstance = resultInstance.toBuilder().setDescription("").build();
    Operation updateOp =
        instancesClient.update(DEFAULT_PROJECT, DEFAULT_ZONE, INSTANCE, descInstance);
    waitUntilStatusChangeTo(updateOp);
    Instance updated = getInstance();
    assertInstanceDetails(updated);
    Assert.assertEquals("", updated.getDescription());
    Assert.assertEquals(0, resultInstance.getScheduling().getMinNodeCpus());
  }

  @Test
  public void testResizeGroupToZero() throws IOException {
    // We test here: 1)set body field to zero
    //               2)set query param to zero
    List<String> instanceGroupManagersToClean = new ArrayList<>();
    List<String> instanceTemplatesToClean = new ArrayList<>();
    InstanceTemplatesClient instanceTemplatesClient = InstanceTemplatesClient.create();
    InstanceGroupManagersClient instanceGroupManagersClient = InstanceGroupManagersClient.create();
    String templateName = generateRandomName("template");
    String instanceGroupManagerName = generateRandomName("igm");
    Instance instance = insertInstance();
    InstanceTemplate instanceTemplate =
        InstanceTemplate.newBuilder()
            .setSourceInstance(instance.getSelfLink())
            .setName(templateName)
            .build();
    Operation insertOperation = instanceTemplatesClient.insert(DEFAULT_PROJECT, instanceTemplate);
    waitGlobalOperation(insertOperation);
    instanceTemplatesToClean.add(templateName);
    try {
      InstanceGroupManager instanceGroupManager =
          InstanceGroupManager.newBuilder()
              .setName(instanceGroupManagerName)
              .setBaseInstanceName("java-gapic")
              .setInstanceTemplate(insertOperation.getTargetLink())
              .setTargetSize(0)
              .build();
      Operation igmOperation =
          instanceGroupManagersClient.insert(DEFAULT_PROJECT, DEFAULT_ZONE, instanceGroupManager);
      waitUntilStatusChangeTo(igmOperation);
      instanceGroupManagersToClean.add(instanceGroupManagerName);
      InstanceGroupManager fetched =
          instanceGroupManagersClient.get(DEFAULT_PROJECT, DEFAULT_ZONE, instanceGroupManagerName);
      Assert.assertEquals(0, fetched.getTargetSize());

      Operation resize =
          instanceGroupManagersClient.resize(
              DEFAULT_PROJECT, DEFAULT_ZONE, instanceGroupManagerName, 1);
      waitUntilStatusChangeTo(resize);

      InstanceGroupManager resizedIGM =
          instanceGroupManagersClient.get(DEFAULT_PROJECT, DEFAULT_ZONE, instanceGroupManagerName);
      Assert.assertEquals(1, resizedIGM.getTargetSize());

      Operation resizeOp =
          instanceGroupManagersClient.resize(
              DEFAULT_PROJECT, DEFAULT_ZONE, instanceGroupManagerName, 0);
      waitUntilStatusChangeTo(resizeOp);

      InstanceGroupManager instanceGroupManagerResized =
          instanceGroupManagersClient.get(DEFAULT_PROJECT, DEFAULT_ZONE, instanceGroupManagerName);
      Assert.assertEquals(0, instanceGroupManagerResized.getTargetSize());

    } finally {
      for (String name : instanceGroupManagersToClean) {
        Operation deleteOperation =
            instanceGroupManagersClient.delete(DEFAULT_PROJECT, DEFAULT_ZONE, name);
        waitUntilStatusChangeTo(deleteOperation);
      }
      for (String name : instanceTemplatesToClean) {
        Operation deleteOperation = instanceTemplatesClient.delete(DEFAULT_PROJECT, name);
        waitGlobalOperation(deleteOperation);
      }
    }
  }

  @Test
  public void testAggregatedList() {
    insertInstance();
    boolean presented = false;
    InstancesClient.AggregatedListPagedResponse response =
        instancesClient.aggregatedList(DEFAULT_PROJECT);
    for (Map.Entry<String, InstancesScopedList> entry : response.iterateAll()) {
      if (entry.getKey().equals("zones/" + DEFAULT_ZONE)) {
        for (Instance instance : entry.getValue().getInstancesList()) {
          if (instance.getName().equals(INSTANCE)) {
            presented = true;
            assertInstanceDetails(instance);
          }
        }
      }
    }
    Assert.assertTrue(presented);
  }

  @Test
  public void testDefaultClient() throws IOException {
    InstancesClient defaultClient = InstancesClient.create();
    Instance instanceResource =
        Instance.newBuilder()
            .setName(INSTANCE)
            .setMachineType(MACHINE_TYPE)
            .addDisks(DISK)
            .addNetworkInterfaces(NETWORK_INTERFACE)
            .build();
    Operation operation = defaultClient.insert(DEFAULT_PROJECT, DEFAULT_ZONE, instanceResource);
    waitUntilStatusChangeTo(operation);
    instances.add(instanceResource);
    assertInstanceDetails(getInstance());
  }

  @Test
  public void testDefaultResource() {
    Instance instanceResource = Instance.newBuilder().build();
    try {
      instancesClient.insert(DEFAULT_PROJECT, DEFAULT_ZONE, instanceResource);
      fail("Did not catch the exception");
    } catch (InvalidArgumentException ex) {
      String message = "Bad Request";
      Assert.assertEquals(message, ex.getMessage());
    }
  }

  @Test
  public void testApiError() {
    try {
      getInstance();
      fail("Did not catch the exception");
    } catch (NotFoundException ex) {
      String message = "Not Found";
      Assert.assertEquals(message, ex.getMessage());
    }
  }

  @Test
  public void testInt64() throws IOException {
    // we want to test a field with format:int64
    String name = generateRandomName("image");
    List<String> licenseCodes = Collections.singletonList("5543610867827062957");
    String sourceImage = "projects/debian-cloud/global/images/debian-10-buster-v20210721";
    ImagesClient imagesClient = ImagesClient.create();
    Image image =
        Image.newBuilder()
            .setName(name)
            .addAllLicenseCodes(licenseCodes)
            .setSourceImage(sourceImage)
            .build();
    try {
      Operation op = imagesClient.insert(DEFAULT_PROJECT, image);
      waitGlobalOperation(op);

      Image fetched = imagesClient.get(DEFAULT_PROJECT, name);
      Assert.assertEquals(licenseCodes, fetched.getLicenseCodesList());
    } finally {
      imagesClient.delete(DEFAULT_PROJECT, name);
    }
  }

  @Test
  public void testCapitalLetterField() throws IOException {
    // we want to test a field like "IPProtocol"
    String name = generateRandomName("fw-rule");
    FirewallsClient firewallsClient = FirewallsClient.create();
    Firewall firewall =
        Firewall.newBuilder()
            .setName(name)
            .addAllowed(Allowed.newBuilder().setIPProtocol("tcp").addPorts("80").build())
            .addSourceRanges("0.0.0.0/0")
            .build();
    try {
      Operation op = firewallsClient.insert(DEFAULT_PROJECT, firewall);
      waitGlobalOperation(op);

      Firewall fetched = firewallsClient.get(DEFAULT_PROJECT, name);
      Assert.assertEquals(name, fetched.getName());
      Assert.assertEquals("tcp", fetched.getAllowed(0).getIPProtocol());
    } finally {
      firewallsClient.delete(DEFAULT_PROJECT, name);
    }
  }

  @Ignore("Patch is not supported")
  @Test
  public void testPatch() {
    Instance resultInstance = insertInstance();
    Assert.assertFalse(resultInstance.getShieldedInstanceConfig().getEnableSecureBoot());
    Operation op = instancesClient.stop(DEFAULT_PROJECT, DEFAULT_ZONE, INSTANCE);
    waitUntilStatusChangeTo(op);
    ShieldedInstanceConfig shieldedInstanceConfigResource =
        ShieldedInstanceConfig.newBuilder().setEnableSecureBoot(true).build();
    Operation opPatch =
        instancesClient.updateShieldedInstanceConfig(
            DEFAULT_PROJECT, DEFAULT_ZONE, INSTANCE, shieldedInstanceConfigResource);
    waitUntilStatusChangeTo(opPatch);
    Instance updInstance = getInstance();
    Assert.assertTrue(updInstance.getShieldedInstanceConfig().getEnableSecureBoot());
  }

  private Instance insertInstance() {
    Instance instanceResource =
        Instance.newBuilder()
            .setName(INSTANCE)
            .setMachineType(MACHINE_TYPE)
            .addDisks(DISK)
            .addNetworkInterfaces(NETWORK_INTERFACE)
            .setDescription("test")
            .build();
    Operation insertResponse =
        instancesClient.insert(DEFAULT_PROJECT, DEFAULT_ZONE, instanceResource);
    waitUntilStatusChangeTo(insertResponse);
    instances.add(instanceResource);
    return getInstance();
  }

  private Instance getInstance() {
    GetInstanceRequest request =
        GetInstanceRequest.newBuilder()
            .setProject(DEFAULT_PROJECT)
            .setZone(DEFAULT_ZONE)
            .setInstance(INSTANCE)
            .build();
    return instancesClient.get(request);
  }

  private void assertInstanceDetails(Instance instance) {
    Assert.assertNotNull(instance);
    Assert.assertEquals(instance.getName(), INSTANCE);
    Assert.assertNotNull(instance.getFingerprint());
    Assert.assertEquals(instance.getMachineType(), MACHINE_TYPE);
    Assert.assertEquals(instance.getDisksCount(), 1);
    Assert.assertEquals(instance.getDisksList().get(0).getType(), AttachedDisk.Type.PERSISTENT);
    Assert.assertEquals(instance.getNetworkInterfacesCount(), 1);
  }

  private void waitUntilStatusChangeTo(Operation operation) {
    long startTime = System.currentTimeMillis();
    while (true) {
      if ((System.currentTimeMillis() - startTime) > 200000) {
        fail("Operation " + operation.getName() + " took more than 200 sec to finish");
      }
      Operation tempOperation =
          operationsClient.get(DEFAULT_PROJECT, DEFAULT_ZONE, operation.getName());
      if (tempOperation.getStatus().equals(Operation.Status.UNRECOGNIZED)) {
        fail("Unexpected operation status: UNRECOGNIZED");
        break;
      }
      if (tempOperation.getStatus().equals(Operation.Status.UNDEFINED_STATUS)) {
        fail("Unexpected operation status: UNDEFINED_STATUS");
        break;
      }
      if (tempOperation.getStatus().equals(Operation.Status.DONE)) {
        break;
      }
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        fail("Interrupted");
      }
    }
  }
}
