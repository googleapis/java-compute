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

import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstancesClient;
import com.google.cloud.compute.v1.InstancesSettings;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class PaginationTest extends BaseTest{
    private static InstancesClient instancesClient;

    @BeforeClass
    public static void setUp() throws IOException {
        InstancesSettings instanceSettings = InstancesSettings.newBuilder().build();
        instancesClient = InstancesClient.create(instanceSettings);
    }

    @AfterClass
    public static void tearDown() {
        instancesClient.close();
    }

    @Test
    public void testPagination() {
        InstancesClient.ListPagedResponse response = instancesClient.list(DEFAULT_PROJECT, DEFAULT_ZONE);
        for (Instance element : response.iterateAll()) {
            System.out.println(element.toString());
        }
    }
    public void testPaginationMaxResults(){}
    public void testPaginationSize(){}
    public void testPaginationMapResponses(){}
}
