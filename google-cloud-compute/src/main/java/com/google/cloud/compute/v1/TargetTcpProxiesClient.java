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
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.TargetTcpProxiesStub;
import com.google.cloud.compute.v1.stub.TargetTcpProxiesStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The TargetTcpProxies API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
 *   String project = "project-309310695";
 *   String targetTcpProxy = "targetTcpProxy-337144898";
 *   Operation response = targetTcpProxiesClient.delete(project, targetTcpProxy);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the TargetTcpProxiesClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of TargetTcpProxiesSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * TargetTcpProxiesSettings targetTcpProxiesSettings =
 *     TargetTcpProxiesSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetTcpProxiesClient targetTcpProxiesClient =
 *     TargetTcpProxiesClient.create(targetTcpProxiesSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * TargetTcpProxiesSettings targetTcpProxiesSettings =
 *     TargetTcpProxiesSettings.newBuilder().setEndpoint(myEndpoint).build();
 * TargetTcpProxiesClient targetTcpProxiesClient =
 *     TargetTcpProxiesClient.create(targetTcpProxiesSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class TargetTcpProxiesClient implements BackgroundResource {
  private final TargetTcpProxiesSettings settings;
  private final TargetTcpProxiesStub stub;

  /** Constructs an instance of TargetTcpProxiesClient with default settings. */
  public static final TargetTcpProxiesClient create() throws IOException {
    return create(TargetTcpProxiesSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TargetTcpProxiesClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final TargetTcpProxiesClient create(TargetTcpProxiesSettings settings)
      throws IOException {
    return new TargetTcpProxiesClient(settings);
  }

  /**
   * Constructs an instance of TargetTcpProxiesClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(TargetTcpProxiesSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final TargetTcpProxiesClient create(TargetTcpProxiesStub stub) {
    return new TargetTcpProxiesClient(stub);
  }

  /**
   * Constructs an instance of TargetTcpProxiesClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected TargetTcpProxiesClient(TargetTcpProxiesSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((TargetTcpProxiesStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected TargetTcpProxiesClient(TargetTcpProxiesStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetTcpProxiesSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetTcpProxiesStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified TargetTcpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   String targetTcpProxy = "targetTcpProxy-337144898";
   *   Operation response = targetTcpProxiesClient.delete(project, targetTcpProxy);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param targetTcpProxy Name of the TargetTcpProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation delete(String project, String targetTcpProxy) {
    DeleteTargetTcpProxyRequest request =
        DeleteTargetTcpProxyRequest.newBuilder()
            .setProject(project)
            .setTargetTcpProxy(targetTcpProxy)
            .build();
    return delete(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified TargetTcpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   DeleteTargetTcpProxyRequest request =
   *       DeleteTargetTcpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setTargetTcpProxy("targetTcpProxy-337144898")
   *           .build();
   *   Operation response = targetTcpProxiesClient.delete(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation delete(DeleteTargetTcpProxyRequest request) {
    return deleteCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified TargetTcpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   DeleteTargetTcpProxyRequest request =
   *       DeleteTargetTcpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setTargetTcpProxy("targetTcpProxy-337144898")
   *           .build();
   *   ApiFuture<Operation> future = targetTcpProxiesClient.deleteCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteTargetTcpProxyRequest, Operation> deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   String targetTcpProxy = "targetTcpProxy-337144898";
   *   TargetTcpProxy response = targetTcpProxiesClient.get(project, targetTcpProxy);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param targetTcpProxy Name of the TargetTcpProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TargetTcpProxy get(String project, String targetTcpProxy) {
    GetTargetTcpProxyRequest request =
        GetTargetTcpProxyRequest.newBuilder()
            .setProject(project)
            .setTargetTcpProxy(targetTcpProxy)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   GetTargetTcpProxyRequest request =
   *       GetTargetTcpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setTargetTcpProxy("targetTcpProxy-337144898")
   *           .build();
   *   TargetTcpProxy response = targetTcpProxiesClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TargetTcpProxy get(GetTargetTcpProxyRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   GetTargetTcpProxyRequest request =
   *       GetTargetTcpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setTargetTcpProxy("targetTcpProxy-337144898")
   *           .build();
   *   ApiFuture<TargetTcpProxy> future = targetTcpProxiesClient.getCallable().futureCall(request);
   *   // Do something.
   *   TargetTcpProxy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetTargetTcpProxyRequest, TargetTcpProxy> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a TargetTcpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   TargetTcpProxy targetTcpProxyResource = TargetTcpProxy.newBuilder().build();
   *   Operation response = targetTcpProxiesClient.insert(project, targetTcpProxyResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param targetTcpProxyResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation insert(String project, TargetTcpProxy targetTcpProxyResource) {
    InsertTargetTcpProxyRequest request =
        InsertTargetTcpProxyRequest.newBuilder()
            .setProject(project)
            .setTargetTcpProxyResource(targetTcpProxyResource)
            .build();
    return insert(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a TargetTcpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   InsertTargetTcpProxyRequest request =
   *       InsertTargetTcpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setTargetTcpProxyResource(TargetTcpProxy.newBuilder().build())
   *           .build();
   *   Operation response = targetTcpProxiesClient.insert(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation insert(InsertTargetTcpProxyRequest request) {
    return insertCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a TargetTcpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   InsertTargetTcpProxyRequest request =
   *       InsertTargetTcpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setTargetTcpProxyResource(TargetTcpProxy.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future = targetTcpProxiesClient.insertCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InsertTargetTcpProxyRequest, Operation> insertCallable() {
    return stub.insertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of TargetTcpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   for (TargetTcpProxy element : targetTcpProxiesClient.list(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project) {
    ListTargetTcpProxiesRequest request =
        ListTargetTcpProxiesRequest.newBuilder().setProject(project).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of TargetTcpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   ListTargetTcpProxiesRequest request =
   *       ListTargetTcpProxiesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (TargetTcpProxy element : targetTcpProxiesClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListTargetTcpProxiesRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of TargetTcpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   ListTargetTcpProxiesRequest request =
   *       ListTargetTcpProxiesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<TargetTcpProxy> future =
   *       targetTcpProxiesClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (TargetTcpProxy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListTargetTcpProxiesRequest, ListPagedResponse> listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of TargetTcpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   ListTargetTcpProxiesRequest request =
   *       ListTargetTcpProxiesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     TargetTcpProxyList response = targetTcpProxiesClient.listCallable().call(request);
   *     for (TargetTcpProxy element : response.getResponsesList()) {
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
  public final UnaryCallable<ListTargetTcpProxiesRequest, TargetTcpProxyList> listCallable() {
    return stub.listCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Changes the BackendService for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   String targetTcpProxy = "targetTcpProxy-337144898";
   *   TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource =
   *       TargetTcpProxiesSetBackendServiceRequest.newBuilder().build();
   *   Operation response =
   *       targetTcpProxiesClient.setBackendService(
   *           project, targetTcpProxy, targetTcpProxiesSetBackendServiceRequestResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param targetTcpProxy Name of the TargetTcpProxy resource whose BackendService resource is to
   *     be set.
   * @param targetTcpProxiesSetBackendServiceRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation setBackendService(
      String project,
      String targetTcpProxy,
      TargetTcpProxiesSetBackendServiceRequest targetTcpProxiesSetBackendServiceRequestResource) {
    SetBackendServiceTargetTcpProxyRequest request =
        SetBackendServiceTargetTcpProxyRequest.newBuilder()
            .setProject(project)
            .setTargetTcpProxy(targetTcpProxy)
            .setTargetTcpProxiesSetBackendServiceRequestResource(
                targetTcpProxiesSetBackendServiceRequestResource)
            .build();
    return setBackendService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Changes the BackendService for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   SetBackendServiceTargetTcpProxyRequest request =
   *       SetBackendServiceTargetTcpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setTargetTcpProxiesSetBackendServiceRequestResource(
   *               TargetTcpProxiesSetBackendServiceRequest.newBuilder().build())
   *           .setTargetTcpProxy("targetTcpProxy-337144898")
   *           .build();
   *   Operation response = targetTcpProxiesClient.setBackendService(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation setBackendService(SetBackendServiceTargetTcpProxyRequest request) {
    return setBackendServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Changes the BackendService for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   SetBackendServiceTargetTcpProxyRequest request =
   *       SetBackendServiceTargetTcpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setTargetTcpProxiesSetBackendServiceRequestResource(
   *               TargetTcpProxiesSetBackendServiceRequest.newBuilder().build())
   *           .setTargetTcpProxy("targetTcpProxy-337144898")
   *           .build();
   *   ApiFuture<Operation> future =
   *       targetTcpProxiesClient.setBackendServiceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetBackendServiceTargetTcpProxyRequest, Operation>
      setBackendServiceCallable() {
    return stub.setBackendServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Changes the ProxyHeaderType for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   String targetTcpProxy = "targetTcpProxy-337144898";
   *   TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource =
   *       TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build();
   *   Operation response =
   *       targetTcpProxiesClient.setProxyHeader(
   *           project, targetTcpProxy, targetTcpProxiesSetProxyHeaderRequestResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param targetTcpProxy Name of the TargetTcpProxy resource whose ProxyHeader is to be set.
   * @param targetTcpProxiesSetProxyHeaderRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation setProxyHeader(
      String project,
      String targetTcpProxy,
      TargetTcpProxiesSetProxyHeaderRequest targetTcpProxiesSetProxyHeaderRequestResource) {
    SetProxyHeaderTargetTcpProxyRequest request =
        SetProxyHeaderTargetTcpProxyRequest.newBuilder()
            .setProject(project)
            .setTargetTcpProxy(targetTcpProxy)
            .setTargetTcpProxiesSetProxyHeaderRequestResource(
                targetTcpProxiesSetProxyHeaderRequestResource)
            .build();
    return setProxyHeader(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Changes the ProxyHeaderType for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   SetProxyHeaderTargetTcpProxyRequest request =
   *       SetProxyHeaderTargetTcpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setTargetTcpProxiesSetProxyHeaderRequestResource(
   *               TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build())
   *           .setTargetTcpProxy("targetTcpProxy-337144898")
   *           .build();
   *   Operation response = targetTcpProxiesClient.setProxyHeader(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation setProxyHeader(SetProxyHeaderTargetTcpProxyRequest request) {
    return setProxyHeaderCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Changes the ProxyHeaderType for TargetTcpProxy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (TargetTcpProxiesClient targetTcpProxiesClient = TargetTcpProxiesClient.create()) {
   *   SetProxyHeaderTargetTcpProxyRequest request =
   *       SetProxyHeaderTargetTcpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRequestId("requestId693933066")
   *           .setTargetTcpProxiesSetProxyHeaderRequestResource(
   *               TargetTcpProxiesSetProxyHeaderRequest.newBuilder().build())
   *           .setTargetTcpProxy("targetTcpProxy-337144898")
   *           .build();
   *   ApiFuture<Operation> future =
   *       targetTcpProxiesClient.setProxyHeaderCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetProxyHeaderTargetTcpProxyRequest, Operation>
      setProxyHeaderCallable() {
    return stub.setProxyHeaderCallable();
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
          ListTargetTcpProxiesRequest,
          TargetTcpProxyList,
          TargetTcpProxy,
          ListPage,
          ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<ListTargetTcpProxiesRequest, TargetTcpProxyList, TargetTcpProxy> context,
        ApiFuture<TargetTcpProxyList> futureResponse) {
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
      extends AbstractPage<
          ListTargetTcpProxiesRequest, TargetTcpProxyList, TargetTcpProxy, ListPage> {

    private ListPage(
        PageContext<ListTargetTcpProxiesRequest, TargetTcpProxyList, TargetTcpProxy> context,
        TargetTcpProxyList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<ListTargetTcpProxiesRequest, TargetTcpProxyList, TargetTcpProxy> context,
        TargetTcpProxyList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<ListTargetTcpProxiesRequest, TargetTcpProxyList, TargetTcpProxy> context,
        ApiFuture<TargetTcpProxyList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTargetTcpProxiesRequest,
          TargetTcpProxyList,
          TargetTcpProxy,
          ListPage,
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
