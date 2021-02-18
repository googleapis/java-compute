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
import com.google.common.collect.Lists;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ITPaginationTest extends BaseTest {
  private static ZonesClient zonesClient;

  @BeforeClass
  public static void setUp() throws IOException {
    ZonesSettings zoneSettings = ZonesSettings.newBuilder().build();
    zonesClient = ZonesClient.create(zoneSettings);
  }

  @AfterClass
  public static void tearDown() {
    zonesClient.close();
  }

  @Test
  public void testList() {
    ZonesClient.ListPagedResponse response = zonesClient.list(DEFAULT_PROJECT);
    boolean presented = false;
    for (Zone element : response.iterateAll()) {
      if (element.getName().equals(DEFAULT_ZONE)) {
        presented = true;
      }
    }
    Assert.assertTrue(presented);
  }

  @Test
  public void testPaginationMaxResults() {
    ListZonesRequest listZonesRequest =
        ListZonesRequest.newBuilder().setProject(DEFAULT_PROJECT).setMaxResults(15).build();
    ZonesClient.ListPagedResponse response = zonesClient.list(listZonesRequest);
    ZonesClient.ListPage listPage = response.getPage();
    Assert.assertEquals(15, Lists.newArrayList(listPage.getValues()).size());
  }

  @Test
  public void testPaginationNextPage() {
    ListZonesRequest listZonesRequest =
        ListZonesRequest.newBuilder().setProject(DEFAULT_PROJECT).setMaxResults(15).build();
    ZonesClient.ListPagedResponse response = zonesClient.list(listZonesRequest);
    ZonesClient.ListPage listPage = response.getPage();
    ZonesClient.ListPage nextPage = listPage.getNextPage();
    Assert.assertNotEquals(listPage, nextPage);
  }

  @Test
  public void testPaginationNextPageSize() {
    ListZonesRequest listZonesRequest =
        ListZonesRequest.newBuilder().setProject(DEFAULT_PROJECT).setMaxResults(15).build();
    ZonesClient.ListPagedResponse response = zonesClient.list(listZonesRequest);
    ZonesClient.ListPage listPage = response.getPage();
    ZonesClient.ListPage nextPage = listPage.getNextPage(20);
    Assert.assertEquals(20, Lists.newArrayList(nextPage.getValues()).size());
  }

  @Test
  public void testPaginationNextToken() {
    ListZonesRequest listZonesRequest =
        ListZonesRequest.newBuilder().setProject(DEFAULT_PROJECT).setMaxResults(15).build();
    ZonesClient.ListPagedResponse response = zonesClient.list(listZonesRequest);
    ZonesClient.ListPage listPage = response.getPage();
    String nextPageToken = listPage.getNextPageToken();
    ZonesClient.ListPage nextPage = listPage.getNextPage();

    ListZonesRequest listZonesRequestToken =
        ListZonesRequest.newBuilder()
            .setProject(DEFAULT_PROJECT)
            .setMaxResults(15)
            .setPageToken(nextPageToken)
            .build();
    ZonesClient.ListPagedResponse responseToken = zonesClient.list(listZonesRequestToken);
    ZonesClient.ListPage nextPageWithToken = responseToken.getPage();
    Assert.assertEquals(
        Lists.newArrayList(nextPage.getValues()),
        Lists.newArrayList(nextPageWithToken.getValues()));
  }

  @Test
  public void testPaginationIterating() {
    ListZonesRequest listZonesRequest =
        ListZonesRequest.newBuilder().setProject(DEFAULT_PROJECT).setMaxResults(1).build();
    ZonesClient.ListPagedResponse response = zonesClient.list(listZonesRequest);
    boolean presented = false;
    for (Zone element : response.iterateAll()) {
      if (element.getName().equals(DEFAULT_ZONE)) {
        presented = true;
      }
    }
    Assert.assertTrue(presented);
  }
}
