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

import com.google.cloud.compute.v1.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.fail;


public class SmokeInstancesTest extends BaseTest {
    private static InstancesClient instancesClient;
    private static ZoneOperationsClient operationsClient;
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
    private static final String INSTANCE = generateRandomName();

    @BeforeClass
    public static void setUp() throws IOException {
        InstancesSettings instanceSettings = InstancesSettings.newBuilder()
                .build();
        instancesClient = InstancesClient.create(instanceSettings);
        ZoneOperationsSettings zoneOperationsSettings = ZoneOperationsSettings.newBuilder().build();
        operationsClient = ZoneOperationsClient.create(zoneOperationsSettings);

    }

    @AfterClass
    public static void tearDown() {
        instancesClient.delete(DEFAULT_PROJECT, DEFAULT_ZONE, INSTANCE);
        instancesClient.close();
    }

    @Test
    public void testInsertInstance(){
        Instance instanceResource =
                Instance.newBuilder()
                        .setName(INSTANCE)
                        .setMachineType(MACHINE_TYPE)
                        .addDisks(DISK)
                        .addNetworkInterfaces(NETWORK_INTERFACE)
                        .build();
        Operation insertResponse = instancesClient.insert(DEFAULT_PROJECT, DEFAULT_ZONE, instanceResource);
        waitUntilStatusChangeTo(insertResponse, Operation.Status.DONE);
        Instance resultInstance = getInstance();
        assertInstanceDetails(resultInstance);
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

