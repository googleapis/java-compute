/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.RegionDisksClient.ListPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.compute.v1.stub.HttpJsonRegionDisksStub;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class RegionDisksClientTest {
  private static MockHttpService mockService;
  private static RegionDisksClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonRegionDisksStub.getMethodDescriptors(),
            RegionDisksSettings.getDefaultEndpoint());
    RegionDisksSettings settings =
        RegionDisksSettings.newBuilder()
            .setTransportChannelProvider(
                RegionDisksSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = RegionDisksClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void addResourcePoliciesTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(1386087020)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setStartTime("startTime-2129294769")
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    String disk = "disk3083677";
    RegionDisksAddResourcePoliciesRequest regionDisksAddResourcePoliciesRequestResource =
        RegionDisksAddResourcePoliciesRequest.newBuilder().build();

    Operation actualResponse =
        client.addResourcePolicies(
            project, region, disk, regionDisksAddResourcePoliciesRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void addResourcePoliciesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      String disk = "disk3083677";
      RegionDisksAddResourcePoliciesRequest regionDisksAddResourcePoliciesRequestResource =
          RegionDisksAddResourcePoliciesRequest.newBuilder().build();
      client.addResourcePolicies(
          project, region, disk, regionDisksAddResourcePoliciesRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createSnapshotTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(1386087020)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setStartTime("startTime-2129294769")
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    String disk = "disk3083677";
    Snapshot snapshotResource = Snapshot.newBuilder().build();

    Operation actualResponse = client.createSnapshot(project, region, disk, snapshotResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createSnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      String disk = "disk3083677";
      Snapshot snapshotResource = Snapshot.newBuilder().build();
      client.createSnapshot(project, region, disk, snapshotResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(1386087020)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setStartTime("startTime-2129294769")
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    String disk = "disk3083677";

    Operation actualResponse = client.delete(project, region, disk);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      String disk = "disk3083677";
      client.delete(project, region, disk);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTest() throws Exception {
    Disk expectedResponse =
        Disk.newBuilder()
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setDiskEncryptionKey(CustomerEncryptionKey.newBuilder().build())
            .addAllGuestOsFeatures(new ArrayList<GuestOsFeature>())
            .setId(3355)
            .setKind("kind3292052")
            .setLabelFingerprint("labelFingerprint379449680")
            .putAllLabels(new HashMap<String, String>())
            .setLastAttachTimestamp("lastAttachTimestamp628457179")
            .setLastDetachTimestamp("lastDetachTimestamp-150409907")
            .addAllLicenseCodes(new ArrayList<Long>())
            .addAllLicenses(new ArrayList<String>())
            .setLocationHint("locationHint-58650660")
            .setName("name3373707")
            .setOptions("options-1249474914")
            .setPhysicalBlockSizeBytes(-1190604793)
            .setProvisionedIops(1260510932)
            .setRegion("region-934795532")
            .addAllReplicaZones(new ArrayList<String>())
            .addAllResourcePolicies(new ArrayList<String>())
            .setSatisfiesPzs(true)
            .setSelfLink("selfLink1191800166")
            .setSizeGb(2105542105)
            .setSourceDisk("sourceDisk-1111923624")
            .setSourceDiskId("sourceDiskId888256403")
            .setSourceImage("sourceImage-105174528")
            .setSourceImageEncryptionKey(CustomerEncryptionKey.newBuilder().build())
            .setSourceImageId("sourceImageId2006496059")
            .setSourceSnapshot("sourceSnapshot-1078634753")
            .setSourceSnapshotEncryptionKey(CustomerEncryptionKey.newBuilder().build())
            .setSourceSnapshotId("sourceSnapshotId-1480876934")
            .setSourceStorageObject("sourceStorageObject1498862911")
            .setType("type3575610")
            .addAllUsers(new ArrayList<String>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    String disk = "disk3083677";

    Disk actualResponse = client.get(project, region, disk);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      String disk = "disk3083677";
      client.get(project, region, disk);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .addAllBindings(new ArrayList<Binding>())
            .setEtag("etag3123477")
            .setIamOwned(true)
            .addAllRules(new ArrayList<Rule>())
            .setVersion(351608024)
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    String resource = "resource-341064690";

    Policy actualResponse = client.getIamPolicy(project, region, resource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getIamPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      String resource = "resource-341064690";
      client.getIamPolicy(project, region, resource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void insertTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(1386087020)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setStartTime("startTime-2129294769")
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    Disk diskResource = Disk.newBuilder().build();

    Operation actualResponse = client.insert(project, region, diskResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void insertExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      Disk diskResource = Disk.newBuilder().build();
      client.insert(project, region, diskResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listTest() throws Exception {
    Disk responsesElement = Disk.newBuilder().build();
    DiskList expectedResponse =
        DiskList.newBuilder()
            .setNextPageToken("")
            .addAllItems(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";

    ListPagedResponse pagedListResponse = client.list(project, region);

    List<Disk> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getItemsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      client.list(project, region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void removeResourcePoliciesTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(1386087020)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setStartTime("startTime-2129294769")
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    String disk = "disk3083677";
    RegionDisksRemoveResourcePoliciesRequest regionDisksRemoveResourcePoliciesRequestResource =
        RegionDisksRemoveResourcePoliciesRequest.newBuilder().build();

    Operation actualResponse =
        client.removeResourcePolicies(
            project, region, disk, regionDisksRemoveResourcePoliciesRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void removeResourcePoliciesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      String disk = "disk3083677";
      RegionDisksRemoveResourcePoliciesRequest regionDisksRemoveResourcePoliciesRequestResource =
          RegionDisksRemoveResourcePoliciesRequest.newBuilder().build();
      client.removeResourcePolicies(
          project, region, disk, regionDisksRemoveResourcePoliciesRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void resizeTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(1386087020)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setStartTime("startTime-2129294769")
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    String disk = "disk3083677";
    RegionDisksResizeRequest regionDisksResizeRequestResource =
        RegionDisksResizeRequest.newBuilder().build();

    Operation actualResponse =
        client.resize(project, region, disk, regionDisksResizeRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void resizeExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      String disk = "disk3083677";
      RegionDisksResizeRequest regionDisksResizeRequestResource =
          RegionDisksResizeRequest.newBuilder().build();
      client.resize(project, region, disk, regionDisksResizeRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void setIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .addAllBindings(new ArrayList<Binding>())
            .setEtag("etag3123477")
            .setIamOwned(true)
            .addAllRules(new ArrayList<Rule>())
            .setVersion(351608024)
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    String resource = "resource-341064690";
    RegionSetPolicyRequest regionSetPolicyRequestResource =
        RegionSetPolicyRequest.newBuilder().build();

    Policy actualResponse =
        client.setIamPolicy(project, region, resource, regionSetPolicyRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void setIamPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      String resource = "resource-341064690";
      RegionSetPolicyRequest regionSetPolicyRequestResource =
          RegionSetPolicyRequest.newBuilder().build();
      client.setIamPolicy(project, region, resource, regionSetPolicyRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void setLabelsTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setClientOperationId("clientOperationId-1230366697")
            .setCreationTimestamp("creationTimestamp-370203401")
            .setDescription("description-1724546052")
            .setEndTime("endTime-1607243192")
            .setError(Error.newBuilder().build())
            .setHttpErrorMessage("httpErrorMessage1577303431")
            .setHttpErrorStatusCode(1386087020)
            .setId(3355)
            .setInsertTime("insertTime966165798")
            .setKind("kind3292052")
            .setName("name3373707")
            .setOperationGroupId("operationGroupId1716161683")
            .setOperationType("operationType91999553")
            .setProgress(-1001078227)
            .setRegion("region-934795532")
            .setSelfLink("selfLink1191800166")
            .setStartTime("startTime-2129294769")
            .setStatusMessage("statusMessage-958704715")
            .setTargetId(-815576439)
            .setTargetLink("targetLink486368555")
            .setUser("user3599307")
            .addAllWarnings(new ArrayList<Warnings>())
            .setZone("zone3744684")
            .build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    String resource = "resource-341064690";
    RegionSetLabelsRequest regionSetLabelsRequestResource =
        RegionSetLabelsRequest.newBuilder().build();

    Operation actualResponse =
        client.setLabels(project, region, resource, regionSetLabelsRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void setLabelsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      String resource = "resource-341064690";
      RegionSetLabelsRequest regionSetLabelsRequestResource =
          RegionSetLabelsRequest.newBuilder().build();
      client.setLabels(project, region, resource, regionSetLabelsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void testIamPermissionsTest() throws Exception {
    TestPermissionsResponse expectedResponse =
        TestPermissionsResponse.newBuilder().addAllPermissions(new ArrayList<String>()).build();
    mockService.addResponse(expectedResponse);

    String project = "project-309310695";
    String region = "region-934795532";
    String resource = "resource-341064690";
    TestPermissionsRequest testPermissionsRequestResource =
        TestPermissionsRequest.newBuilder().build();

    TestPermissionsResponse actualResponse =
        client.testIamPermissions(project, region, resource, testPermissionsRequestResource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void testIamPermissionsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String project = "project-309310695";
      String region = "region-934795532";
      String resource = "resource-341064690";
      TestPermissionsRequest testPermissionsRequestResource =
          TestPermissionsRequest.newBuilder().build();
      client.testIamPermissions(project, region, resource, testPermissionsRequestResource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
