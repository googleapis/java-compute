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

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.MachineImagesStub;
import com.google.cloud.compute.v1.stub.MachineImagesStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The MachineImages API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
 *   String project = "project-309310695";
 *   String machineImage = "machineImage1817774420";
 *   MachineImage response = machineImagesClient.get(project, machineImage);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the MachineImagesClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of MachineImagesSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * MachineImagesSettings machineImagesSettings =
 *     MachineImagesSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * MachineImagesClient machineImagesClient = MachineImagesClient.create(machineImagesSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * MachineImagesSettings machineImagesSettings =
 *     MachineImagesSettings.newBuilder().setEndpoint(myEndpoint).build();
 * MachineImagesClient machineImagesClient = MachineImagesClient.create(machineImagesSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class MachineImagesClient implements BackgroundResource {
  private final MachineImagesSettings settings;
  private final MachineImagesStub stub;

  /** Constructs an instance of MachineImagesClient with default settings. */
  public static final MachineImagesClient create() throws IOException {
    return create(MachineImagesSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of MachineImagesClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final MachineImagesClient create(MachineImagesSettings settings)
      throws IOException {
    return new MachineImagesClient(settings);
  }

  /**
   * Constructs an instance of MachineImagesClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(MachineImagesSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final MachineImagesClient create(MachineImagesStub stub) {
    return new MachineImagesClient(stub);
  }

  /**
   * Constructs an instance of MachineImagesClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected MachineImagesClient(MachineImagesSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((MachineImagesStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected MachineImagesClient(MachineImagesStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final MachineImagesSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public MachineImagesStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified machine image. Deleting a machine image is permanent and cannot be
   * undone.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   String project = "project-309310695";
   *   String machineImage = "machineImage1817774420";
   *   Operation response = machineImagesClient.deleteAsync(project, machineImage).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param machineImage The name of the machine image to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      String project, String machineImage) {
    DeleteMachineImageRequest request =
        DeleteMachineImageRequest.newBuilder()
            .setProject(project)
            .setMachineImage(machineImage)
            .build();
    return deleteAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified machine image. Deleting a machine image is permanent and cannot be
   * undone.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   DeleteMachineImageRequest request =
   *       DeleteMachineImageRequest.newBuilder()
   *           .setMachineImage("machineImage1817774420")
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = machineImagesClient.deleteAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Operation, Operation> deleteAsync(
      DeleteMachineImageRequest request) {
    return deleteOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified machine image. Deleting a machine image is permanent and cannot be
   * undone.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   DeleteMachineImageRequest request =
   *       DeleteMachineImageRequest.newBuilder()
   *           .setMachineImage("machineImage1817774420")
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       machineImagesClient.deleteOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteMachineImageRequest, Operation, Operation>
      deleteOperationCallable() {
    return stub.deleteOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified machine image. Deleting a machine image is permanent and cannot be
   * undone.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   DeleteMachineImageRequest request =
   *       DeleteMachineImageRequest.newBuilder()
   *           .setMachineImage("machineImage1817774420")
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future = machineImagesClient.deleteCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteMachineImageRequest, Operation> deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified machine image. Gets a list of available machine images by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   String project = "project-309310695";
   *   String machineImage = "machineImage1817774420";
   *   MachineImage response = machineImagesClient.get(project, machineImage);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param machineImage The name of the machine image.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MachineImage get(String project, String machineImage) {
    GetMachineImageRequest request =
        GetMachineImageRequest.newBuilder()
            .setProject(project)
            .setMachineImage(machineImage)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified machine image. Gets a list of available machine images by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   GetMachineImageRequest request =
   *       GetMachineImageRequest.newBuilder()
   *           .setMachineImage("machineImage1817774420")
   *           .setProject("project-309310695")
   *           .build();
   *   MachineImage response = machineImagesClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MachineImage get(GetMachineImageRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified machine image. Gets a list of available machine images by making a list()
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   GetMachineImageRequest request =
   *       GetMachineImageRequest.newBuilder()
   *           .setMachineImage("machineImage1817774420")
   *           .setProject("project-309310695")
   *           .build();
   *   ApiFuture<MachineImage> future = machineImagesClient.getCallable().futureCall(request);
   *   // Do something.
   *   MachineImage response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetMachineImageRequest, MachineImage> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   String project = "project-309310695";
   *   String resource = "resource-341064690";
   *   Policy response = machineImagesClient.getIamPolicy(project, resource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param resource Name or id of the resource for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(String project, String resource) {
    GetIamPolicyMachineImageRequest request =
        GetIamPolicyMachineImageRequest.newBuilder()
            .setProject(project)
            .setResource(resource)
            .build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   GetIamPolicyMachineImageRequest request =
   *       GetIamPolicyMachineImageRequest.newBuilder()
   *           .setOptionsRequestedPolicyVersion(-574521795)
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   Policy response = machineImagesClient.getIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyMachineImageRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   GetIamPolicyMachineImageRequest request =
   *       GetIamPolicyMachineImageRequest.newBuilder()
   *           .setOptionsRequestedPolicyVersion(-574521795)
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   ApiFuture<Policy> future = machineImagesClient.getIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIamPolicyMachineImageRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a machine image in the specified project using the data that is included in the
   * request. If you are creating a new machine image to update an existing instance, your new
   * machine image should use the same network or, if applicable, the same subnetwork as the
   * original instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   String project = "project-309310695";
   *   MachineImage machineImageResource = MachineImage.newBuilder().build();
   *   Operation response = machineImagesClient.insertAsync(project, machineImageResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param machineImageResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      String project, MachineImage machineImageResource) {
    InsertMachineImageRequest request =
        InsertMachineImageRequest.newBuilder()
            .setProject(project)
            .setMachineImageResource(machineImageResource)
            .build();
    return insertAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a machine image in the specified project using the data that is included in the
   * request. If you are creating a new machine image to update an existing instance, your new
   * machine image should use the same network or, if applicable, the same subnetwork as the
   * original instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   InsertMachineImageRequest request =
   *       InsertMachineImageRequest.newBuilder()
   *           .setMachineImageResource(MachineImage.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setSourceInstance("sourceInstance-808380976")
   *           .build();
   *   Operation response = machineImagesClient.insertAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Operation, Operation> insertAsync(
      InsertMachineImageRequest request) {
    return insertOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a machine image in the specified project using the data that is included in the
   * request. If you are creating a new machine image to update an existing instance, your new
   * machine image should use the same network or, if applicable, the same subnetwork as the
   * original instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   InsertMachineImageRequest request =
   *       InsertMachineImageRequest.newBuilder()
   *           .setMachineImageResource(MachineImage.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setSourceInstance("sourceInstance-808380976")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       machineImagesClient.insertOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<InsertMachineImageRequest, Operation, Operation>
      insertOperationCallable() {
    return stub.insertOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a machine image in the specified project using the data that is included in the
   * request. If you are creating a new machine image to update an existing instance, your new
   * machine image should use the same network or, if applicable, the same subnetwork as the
   * original instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   InsertMachineImageRequest request =
   *       InsertMachineImageRequest.newBuilder()
   *           .setMachineImageResource(MachineImage.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setSourceInstance("sourceInstance-808380976")
   *           .build();
   *   ApiFuture<Operation> future = machineImagesClient.insertCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InsertMachineImageRequest, Operation> insertCallable() {
    return stub.insertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of machine images that are contained within the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   String project = "project-309310695";
   *   for (MachineImage element : machineImagesClient.list(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project) {
    ListMachineImagesRequest request =
        ListMachineImagesRequest.newBuilder().setProject(project).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of machine images that are contained within the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   ListMachineImagesRequest request =
   *       ListMachineImagesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (MachineImage element : machineImagesClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListMachineImagesRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of machine images that are contained within the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   ListMachineImagesRequest request =
   *       ListMachineImagesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<MachineImage> future = machineImagesClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (MachineImage element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListMachineImagesRequest, ListPagedResponse> listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of machine images that are contained within the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   ListMachineImagesRequest request =
   *       ListMachineImagesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     MachineImageList response = machineImagesClient.listCallable().call(request);
   *     for (MachineImage element : response.getResponsesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListMachineImagesRequest, MachineImageList> listCallable() {
    return stub.listCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   String project = "project-309310695";
   *   String resource = "resource-341064690";
   *   GlobalSetPolicyRequest globalSetPolicyRequestResource =
   *       GlobalSetPolicyRequest.newBuilder().build();
   *   Policy response =
   *       machineImagesClient.setIamPolicy(project, resource, globalSetPolicyRequestResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param resource Name or id of the resource for this request.
   * @param globalSetPolicyRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(
      String project, String resource, GlobalSetPolicyRequest globalSetPolicyRequestResource) {
    SetIamPolicyMachineImageRequest request =
        SetIamPolicyMachineImageRequest.newBuilder()
            .setProject(project)
            .setResource(resource)
            .setGlobalSetPolicyRequestResource(globalSetPolicyRequestResource)
            .build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   SetIamPolicyMachineImageRequest request =
   *       SetIamPolicyMachineImageRequest.newBuilder()
   *           .setGlobalSetPolicyRequestResource(GlobalSetPolicyRequest.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   Policy response = machineImagesClient.setIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyMachineImageRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   SetIamPolicyMachineImageRequest request =
   *       SetIamPolicyMachineImageRequest.newBuilder()
   *           .setGlobalSetPolicyRequestResource(GlobalSetPolicyRequest.newBuilder().build())
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .build();
   *   ApiFuture<Policy> future = machineImagesClient.setIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetIamPolicyMachineImageRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   String project = "project-309310695";
   *   String resource = "resource-341064690";
   *   TestPermissionsRequest testPermissionsRequestResource =
   *       TestPermissionsRequest.newBuilder().build();
   *   TestPermissionsResponse response =
   *       machineImagesClient.testIamPermissions(project, resource, testPermissionsRequestResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param resource Name or id of the resource for this request.
   * @param testPermissionsRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestPermissionsResponse testIamPermissions(
      String project, String resource, TestPermissionsRequest testPermissionsRequestResource) {
    TestIamPermissionsMachineImageRequest request =
        TestIamPermissionsMachineImageRequest.newBuilder()
            .setProject(project)
            .setResource(resource)
            .setTestPermissionsRequestResource(testPermissionsRequestResource)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   TestIamPermissionsMachineImageRequest request =
   *       TestIamPermissionsMachineImageRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .setTestPermissionsRequestResource(TestPermissionsRequest.newBuilder().build())
   *           .build();
   *   TestPermissionsResponse response = machineImagesClient.testIamPermissions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestPermissionsResponse testIamPermissions(
      TestIamPermissionsMachineImageRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (MachineImagesClient machineImagesClient = MachineImagesClient.create()) {
   *   TestIamPermissionsMachineImageRequest request =
   *       TestIamPermissionsMachineImageRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setResource("resource-341064690")
   *           .setTestPermissionsRequestResource(TestPermissionsRequest.newBuilder().build())
   *           .build();
   *   ApiFuture<TestPermissionsResponse> future =
   *       machineImagesClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<TestIamPermissionsMachineImageRequest, TestPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListPagedResponse
      extends AbstractPagedListResponse<
          ListMachineImagesRequest, MachineImageList, MachineImage, ListPage,
          ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<ListMachineImagesRequest, MachineImageList, MachineImage> context,
        ApiFuture<MachineImageList> futureResponse) {
      ApiFuture<ListPage> futurePage =
          ListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListPagedResponse(ListPage page) {
      super(page, ListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPage
      extends AbstractPage<ListMachineImagesRequest, MachineImageList, MachineImage, ListPage> {

    private ListPage(
        PageContext<ListMachineImagesRequest, MachineImageList, MachineImage> context,
        MachineImageList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<ListMachineImagesRequest, MachineImageList, MachineImage> context,
        MachineImageList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<ListMachineImagesRequest, MachineImageList, MachineImage> context,
        ApiFuture<MachineImageList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListMachineImagesRequest, MachineImageList, MachineImage, ListPage,
          ListFixedSizeCollection> {

    private ListFixedSizeCollection(List<ListPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFixedSizeCollection createEmptyCollection() {
      return new ListFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFixedSizeCollection createCollection(List<ListPage> pages, int collectionSize) {
      return new ListFixedSizeCollection(pages, collectionSize);
    }
  }
}