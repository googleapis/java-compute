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
package com.google.cloud.compute.v1.integration;

import com.google.api.core.ApiFuture;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.cloud.compute.v1.*;
import com.google.api.pathtemplate.ValidationException;
import com.google.api.gax.rpc.AbortedException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Before;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.fail;


public class SmokeInstancesTest extends BaseTest {
    private static InstancesClient instancesClient;
    private static ZoneOperationsClient operationsClient;
    private static List<Instance> instances;
    private static final String DEFAULT_IMAGE =
            "https://www.googleapis.com/compute/v1/projects/debian-cloud/global/images/debian-7-wheezy-v20150710";
    private static final AttachedDisk DISK =
            AttachedDisk.newBuilder()
                    .setBoot(true)
                    .setAutoDelete(true)
                    .setType(AttachedDisk.Type.PERSISTENT)
                    .setInitializeParams(
                            AttachedDiskInitializeParams.newBuilder().setSourceImage(DEFAULT_IMAGE).build())
                    .build();
    private static final String MACHINE_TYPE = "https://www.googleapis.com/compute/v1/projects/cloudsdktest/zones/us-central1-a/machineTypes/n1-standard-1";
    private static final NetworkInterface NETWORK_INTERFACE =
            NetworkInterface.newBuilder().setName("default").build();
    private static String INSTANCE;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void setUp() throws IOException {
        instances = new ArrayList<>();
        InstancesSettings instanceSettings = InstancesSettings.newBuilder()
                .build();
        instancesClient = InstancesClient.create(instanceSettings);
        ZoneOperationsSettings zoneOperationsSettings = ZoneOperationsSettings.newBuilder().build();
        operationsClient = ZoneOperationsClient.create(zoneOperationsSettings);

    }

    @Before
    public void setUpMethod(){
        INSTANCE = generateRandomName();
    }

    @AfterClass
    public static void tearDown() {
        for (Instance instance: instances){
            instancesClient.delete(DEFAULT_PROJECT, DEFAULT_ZONE, instance.getName());
        }
        instancesClient.close();
    }

    @Test
    public void testInsertInstance(){
        Instance resultInstance = insertInstance();
        assertInstanceDetails(resultInstance);
    }


    @Test
    public void testAggregatedList(){
        insertInstance();
        boolean presented = Boolean.FALSE;
        InstancesClient.AggregatedListPagedResponse response = instancesClient.aggregatedList(DEFAULT_PROJECT);
        for (Map.Entry<String, InstancesScopedList> entry: response.iterateAll()){
            if (entry.getKey().equals("zones/us-central1-a")){
                for (Instance instance: entry.getValue().getInstancesList()){
                    if (instance.getName().equals(INSTANCE)){
                        presented = Boolean.TRUE;
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
        Instance instanceResource = Instance.newBuilder()
                .setName(INSTANCE)
                .setMachineType(MACHINE_TYPE)
                .addDisks(DISK)
                .addNetworkInterfaces(NETWORK_INTERFACE)
                .build();;
        Operation operation = defaultClient.insert(DEFAULT_PROJECT, DEFAULT_ZONE, instanceResource);
        waitUntilStatusChangeTo(operation, Operation.Status.DONE);
        instances.add(instanceResource);
        assertInstanceDetails(getInstance());
    }

    @Test(expected= InvalidArgumentException.class)
    public void testDefaultInstance(){
        Instance instanceResource = Instance.newBuilder().build();
        Operation operation = instancesClient.insert(DEFAULT_PROJECT, DEFAULT_ZONE, instanceResource);
        waitUntilStatusChangeTo(operation, Operation.Status.DONE);
        instances.add(instanceResource);
        assertInstanceDetails(getInstance());
    }

    //@Test(expected = ValidationException.class)
    public void testEmptyZone(){
        Instance instanceResource =
                Instance.newBuilder().build();
        InsertInstanceRequest request = InsertInstanceRequest.newBuilder().setInstanceResource(instanceResource)
                .setProject(DEFAULT_PROJECT).build();
        instancesClient.insert(request);

    }

    //@Test(expected = ValidationException.class)
    public void testEmptyProjectValue(){
        Instance instanceResource =
                Instance.newBuilder().build();
        InsertInstanceRequest request = InsertInstanceRequest.newBuilder().setInstanceResource(instanceResource).
                build();
        instancesClient.insert(request);
    }

    //@Test LRO feature is not finished.
    public void testFutureInsert() throws InterruptedException, ExecutionException {
        Instance instanceResource =
                Instance.newBuilder()
                        .setName(INSTANCE)
                        .setMachineType(MACHINE_TYPE)
                        .addDisks(DISK)
                        .addNetworkInterfaces(NETWORK_INTERFACE)
                        .build();
        InsertInstanceRequest request = InsertInstanceRequest.newBuilder().
                setProject(DEFAULT_PROJECT).
                setZone(DEFAULT_ZONE).
                setInstanceResource(instanceResource).
                build();
        ApiFuture<Operation> future = instancesClient.insertCallable().futureCall(request);
        Operation response = future.get();
        Assert.assertEquals(response.getStatus(), Operation.Status.DONE);
        assertInstanceDetails(getInstance());
    }

    //@Test
    public void testApiError(){
        insertInstance();
        Instance instanceResource =
                Instance.newBuilder()
                        .setName(INSTANCE)
                        .setMachineType(MACHINE_TYPE)
                        .addDisks(DISK)
                        .addNetworkInterfaces(NETWORK_INTERFACE)
                        .build();
        thrown.expect(AbortedException.class);
        thrown.expectMessage("Conflict");
        Operation insertResponse = instancesClient.insert(DEFAULT_PROJECT, DEFAULT_ZONE, instanceResource);
    }


    private Instance insertInstance(){
        Instance instanceResource =
                Instance.newBuilder()
                        .setName(INSTANCE)
                        .setMachineType(MACHINE_TYPE)
                        .addDisks(DISK)
                        .addNetworkInterfaces(NETWORK_INTERFACE)
                        .build();
        Operation insertResponse = instancesClient.insert(DEFAULT_PROJECT, DEFAULT_ZONE, instanceResource);
        waitUntilStatusChangeTo(insertResponse, Operation.Status.DONE);
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

    private void waitUntilStatusChangeTo(Operation operation, Operation.Status status) {
        while (true) {
            Operation tempOperation = operationsClient.get(DEFAULT_PROJECT, DEFAULT_ZONE, operation.getName());
            if (tempOperation.getStatus().equals(Operation.Status.UNRECOGNIZED)) {
                fail("Unexpected operation status: UNRECOGNIZED");
                break;
            }
            if (tempOperation.getStatus().equals(Operation.Status.UNDEFINED_STATUS)) {
                fail("Unexpected operation status: UNDEFINED_STATUS");
                break;
            }
            if (tempOperation.getStatus().equals(status)) {
                break;
            }
        }
    }
}

