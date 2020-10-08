/*
 * Copyright 2020 Google LLC
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
package com.google.cloud.compute.v1.it;

import static com.google.common.truth.Truth.assertThat;

import com.google.api.gax.rpc.UnknownException;
import com.google.cloud.compute.v1.AttachedDisk;
import com.google.cloud.compute.v1.AttachedDiskInitializeParams;
import com.google.cloud.compute.v1.GetInstanceHttpRequest;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstanceClient;
import com.google.cloud.compute.v1.InstanceSettings;
import com.google.cloud.compute.v1.InstancesSetLabelsRequest;
import com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest;
import com.google.cloud.compute.v1.InstancesSetMachineTypeRequest;
import com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest;
import com.google.cloud.compute.v1.ListInstancesHttpRequest;
import com.google.cloud.compute.v1.NetworkInterface;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.ProjectZoneInstanceName;
import com.google.cloud.compute.v1.ProjectZoneInstanceResourceName;
import com.google.cloud.compute.v1.ProjectZoneMachineTypeName;
import com.google.cloud.compute.v1.SetDeletionProtectionInstanceHttpRequest;
import com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy;
import com.google.cloud.compute.v1.SimulateMaintenanceEventInstanceHttpRequest;
import com.google.cloud.compute.v1.StartInstanceHttpRequest;
import com.google.cloud.compute.v1.StopInstanceHttpRequest;
import com.google.cloud.compute.v1.UpdateInstanceHttpRequest;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ITInstanceTest extends BaseTest {
  private static final String DEFAULT_IMAGE =
      "https://www.googleapis.com/compute/v1/projects/debian-cloud/global/images/debian-7-wheezy-v20150710";
  private static final String INSTANCE = TestHelper.getTestUniqueName("instance");
  private static final String FORMATTED_INSTANCE =
      ProjectZoneInstanceName.format(INSTANCE, DEFAULT_PROJECT, ZONE);
  private static final String MACHINE_TYPE =
      ProjectZoneMachineTypeName.of("n1-standard-1", DEFAULT_PROJECT, ZONE).toString();
  private static final String[] STATUS = {"RUNNING", "STOPPING"};
  private static final AttachedDisk DISK =
      AttachedDisk.newBuilder()
          .setBoot(true)
          .setAutoDelete(true)
          .setType("PERSISTENT")
          .setInitializeParams(
              AttachedDiskInitializeParams.newBuilder().setSourceImage(DEFAULT_IMAGE).build())
          .build();
  private static final NetworkInterface NETWORK_INTERFACE =
      NetworkInterface.newBuilder().setName("default").build();

  private static InstanceClient instanceClient;

  @BeforeClass
  public static void setUp() throws IOException {
    InstanceSettings instanceSettings =
        InstanceSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    instanceClient = InstanceClient.create(instanceSettings);
    Instance instanceResource =
        Instance.newBuilder()
            .setName(INSTANCE)
            .setMachineType(MACHINE_TYPE)
            .addDisks(DISK)
            .addNetworkInterfaces(NETWORK_INTERFACE)
            .build();
    instanceClient.insertInstance(PROJECT_ZONE_NAME.toString(), instanceResource);
  }

  @AfterClass
  public static void tearDown() {
    instanceClient.deleteInstance(FORMATTED_INSTANCE);
    instanceClient.close();
  }

  @Test
  public void getInstanceTest() {
    assertInstanceDetails(getInstance());
  }

  @Test
  @SuppressWarnings("all")
  public void listInstancesTest() {
    ListInstancesHttpRequest instancesHttpRequest =
        ListInstancesHttpRequest.newBuilder().setZone(PROJECT_ZONE_NAME.toString()).build();
    for (Instance instance : instanceClient.listInstances(instancesHttpRequest).iterateAll()) {
      if (instance.getName().equals(INSTANCE)) {
        assertInstanceDetails(instance);
      }
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateInstanceTest() {
    String description = "updated description";
    List<String> fieldMask =
        Arrays.asList(
            "name",
            "machineType",
            "disks",
            "networkInterfaces",
            "metadata",
            "fingerprint",
            "description");
    Instance instance = getInstance();
    assertInstanceDetails(instance);
    UpdateInstanceHttpRequest request =
        UpdateInstanceHttpRequest.newBuilder()
            .setMostDisruptiveAllowedAction("REFRESH")
            .setMinimalAction(null)
            .setInstance(FORMATTED_INSTANCE)
            .setInstanceResource(
                instance
                    .toBuilder()
                    .setDescription(description)
                    .setFingerprint(getInstance().getFingerprint())
                    .build())
            .addAllFieldMask(fieldMask)
            .build();
    waitUntilStatusChangeTo(STATUS[0]);
    instanceClient.updateInstance(request);
    Instance updatedInstance;
    while (true) {
      updatedInstance = getInstance();
      if (updatedInstance.getDescription().equals(description)) {
        break;
      }
    }
    assertInstanceDetails(updatedInstance);
    assertThat(updatedInstance.getDescription()).isEqualTo(description);
  }

  @Test
  @SuppressWarnings("all")
  public void instanceStartStopTest() {
    StopInstanceHttpRequest stopInstanceHttpRequest =
        StopInstanceHttpRequest.newBuilder().setInstance(FORMATTED_INSTANCE).build();
    Operation stopOperation = instanceClient.stopInstance(stopInstanceHttpRequest);
    waitUntilStatusChangeTo(STATUS[1]);
    assertThat(stopOperation.getOperationType()).isEqualTo("stop");
    assertThat(getInstance().getStatus()).isEqualTo(STATUS[1]);

    StartInstanceHttpRequest startInstanceHttpRequest =
        StartInstanceHttpRequest.newBuilder().setInstance(FORMATTED_INSTANCE).build();
    Operation startOperation = instanceClient.startInstance(startInstanceHttpRequest);
    waitUntilStatusChangeTo(STATUS[0]);
    assertThat(startOperation.getOperationType()).isEqualTo("start");
    assertThat(getInstance().getStatus()).isEqualTo(STATUS[0]);
  }

  @Test
  @SuppressWarnings("all")
  public void setSchedulingInstanceTest() {
    ShieldedInstanceIntegrityPolicy shieldedInstanceIntegrityPolicyResource =
        ShieldedInstanceIntegrityPolicy.newBuilder().setUpdateAutoLearnPolicy(true).build();
    List<String> fieldMask = new ArrayList<>();
    try {
      Operation operation =
          instanceClient.setShieldedInstanceIntegrityPolicyInstance(
              FORMATTED_INSTANCE, shieldedInstanceIntegrityPolicyResource, fieldMask);
      Assert.fail();
    } catch (UnknownException ex) {
      assertThat(ex.getCause().getMessage()).isEqualTo("HTTP method PATCH not supported");
    }
  }

  @Test
  @SuppressWarnings("all")
  public void simulateMaintenanceEventInstanceTest() {
    SimulateMaintenanceEventInstanceHttpRequest request =
        SimulateMaintenanceEventInstanceHttpRequest.newBuilder()
            .setInstance(FORMATTED_INSTANCE)
            .build();
    Operation operation = instanceClient.simulateMaintenanceEventInstance(request);
    assertOperationDetails(operation, "simulateMaintenanceEvent");
    assertThat(getInstance().getName()).isEqualTo(INSTANCE);
  }

  @Test
  @SuppressWarnings("all")
  public void setDeletionProtectionInstanceTest() {
    String resource =
        ProjectZoneInstanceResourceName.of(DEFAULT_PROJECT, INSTANCE, ZONE).toString();
    SetDeletionProtectionInstanceHttpRequest request =
        SetDeletionProtectionInstanceHttpRequest.newBuilder()
            .setResource(resource)
            .setDeletionProtection(false)
            .build();
    Operation response = instanceClient.setDeletionProtectionInstance(resource, false);
    assertOperationDetails(response, "setDeletionProtection");
    Instance instance = getInstance();
    assertThat(instance.getName()).isEqualTo(INSTANCE);
    assertThat(instance.getDeletionProtection()).isFalse();
  }

  @Test
  @SuppressWarnings("all")
  public void setLabelsInstanceTest() {
    String key1 = "key-" + UUID.randomUUID().toString();
    String key2 = "key-" + UUID.randomUUID().toString();
    Map<String, String> labels = ImmutableMap.of(key1, "label-1", key2, "label-2");
    InstancesSetLabelsRequest instancesSetLabelsRequestResource =
        InstancesSetLabelsRequest.newBuilder()
            .setLabelFingerprint(getInstance().getLabelFingerprint())
            .putAllLabels(labels)
            .build();
    Operation operation =
        instanceClient.setLabelsInstance(FORMATTED_INSTANCE, instancesSetLabelsRequestResource);
    assertOperationDetails(operation, "setLabels");
    assertThat(getInstance().getLabelFingerprint()).isNotNull();
  }

  @Test
  @SuppressWarnings("all")
  public void setMachineResourcesInstanceTest() {
    InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource =
        InstancesSetMachineResourcesRequest.getDefaultInstance();
    Operation operation =
        instanceClient.setMachineResourcesInstance(
            FORMATTED_INSTANCE, instancesSetMachineResourcesRequestResource);
    assertOperationDetails(operation, "setMachineResources");
  }

  @Test
  @SuppressWarnings("all")
  public void setMachineTypeInstanceTest() {
    InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource =
        InstancesSetMachineTypeRequest.newBuilder().setMachineType(MACHINE_TYPE).build();
    Operation operation =
        instanceClient.setMachineTypeInstance(
            FORMATTED_INSTANCE, instancesSetMachineTypeRequestResource);
    assertOperationDetails(operation, "setMachineType");
    assertThat(getInstance().getMachineType().contains("machineTypes/n1-standard-1")).isTrue();
  }

  @Test
  @SuppressWarnings("all")
  public void setMinCpuPlatformInstanceTest() {
    String minCpuPlatform = "Intel Haswell";
    InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource =
        InstancesSetMinCpuPlatformRequest.newBuilder().setMinCpuPlatform(minCpuPlatform).build();
    Operation operation =
        instanceClient.setMinCpuPlatformInstance(
            FORMATTED_INSTANCE, instancesSetMinCpuPlatformRequestResource);
    assertOperationDetails(operation, "setMinCpuPlatform");
    assertThat(getInstance().getCpuPlatform()).isEqualTo(minCpuPlatform);
  }

  private Instance getInstance() {
    GetInstanceHttpRequest httpRequest =
        GetInstanceHttpRequest.newBuilder().setInstance(FORMATTED_INSTANCE).build();
    return instanceClient.getInstance(httpRequest);
  }

  private void waitUntilStatusChangeTo(String status) {
    while (true) {
      Instance instance = getInstance();
      if (instance.getStatus().equals(status)) {
        break;
      }
    }
  }

  private void assertInstanceDetails(Instance instance) {
    assertThat(instance).isNotNull();
    assertThat(instance.getName()).isEqualTo(INSTANCE);
    assertThat(instance.getFingerprint()).isNotNull();
    assertThat(instance.getDeletionProtection()).isFalse();
    assertThat(instance.getMachineType().contains("n1-standard-1")).isTrue();
    assertThat(instance.getNetworkInterfacesList().size()).isEqualTo(1);
    assertThat(instance.getDisksList().size()).isEqualTo(1);
  }

  private void assertOperationDetails(Operation operation, String operationType) {
    assertThat(operation.getId()).isNotNull();
    assertThat(operation.getOperationType()).isEqualTo(operationType);
    assertThat(operation.getTargetLink().contains(INSTANCE)).isTrue();
    assertThat(operation.getZone().contains("us-central1-a")).isTrue();
  }
}
