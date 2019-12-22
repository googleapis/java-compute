/*
 * Copyright 2019 Google LLC
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
package com.google.cloud.compute.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.TargetHttpProxyStub;
import com.google.cloud.compute.v1.stub.TargetHttpProxyStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Creates and runs virtual machines on Google Cloud Platform.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
 *   ProjectGlobalTargetHttpProxyName targetHttpProxy = ProjectGlobalTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
 *   Operation response = targetHttpProxyClient.deleteTargetHttpProxy(targetHttpProxy);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the targetHttpProxyClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of TargetHttpProxySettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * TargetHttpProxySettings targetHttpProxySettings =
 *     TargetHttpProxySettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * TargetHttpProxyClient targetHttpProxyClient =
 *     TargetHttpProxyClient.create(targetHttpProxySettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * TargetHttpProxySettings targetHttpProxySettings =
 *     TargetHttpProxySettings.newBuilder().setEndpoint(myEndpoint).build();
 * TargetHttpProxyClient targetHttpProxyClient =
 *     TargetHttpProxyClient.create(targetHttpProxySettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class TargetHttpProxyClient implements BackgroundResource {
  private final TargetHttpProxySettings settings;
  private final TargetHttpProxyStub stub;

  /** Constructs an instance of TargetHttpProxyClient with default settings. */
  public static final TargetHttpProxyClient create() throws IOException {
    return create(TargetHttpProxySettings.newBuilder().build());
  }

  /**
   * Constructs an instance of TargetHttpProxyClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final TargetHttpProxyClient create(TargetHttpProxySettings settings)
      throws IOException {
    return new TargetHttpProxyClient(settings);
  }

  /**
   * Constructs an instance of TargetHttpProxyClient, using the given stub for making calls. This is
   * for advanced usage - prefer to use TargetHttpProxySettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final TargetHttpProxyClient create(TargetHttpProxyStub stub) {
    return new TargetHttpProxyClient(stub);
  }

  /**
   * Constructs an instance of TargetHttpProxyClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected TargetHttpProxyClient(TargetHttpProxySettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((TargetHttpProxyStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected TargetHttpProxyClient(TargetHttpProxyStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final TargetHttpProxySettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetHttpProxyStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all TargetHttpProxy resources, regional and global, available to the
   * specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetHttpProxiesScopedList element : targetHttpProxyClient.aggregatedListTargetHttpProxies(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Name of the project scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetHttpProxiesPagedResponse aggregatedListTargetHttpProxies(
      ProjectName project) {
    AggregatedListTargetHttpProxiesHttpRequest request =
        AggregatedListTargetHttpProxiesHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return aggregatedListTargetHttpProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all TargetHttpProxy resources, regional and global, available to the
   * specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetHttpProxiesScopedList element : targetHttpProxyClient.aggregatedListTargetHttpProxies(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Name of the project scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetHttpProxiesPagedResponse aggregatedListTargetHttpProxies(
      String project) {
    AggregatedListTargetHttpProxiesHttpRequest request =
        AggregatedListTargetHttpProxiesHttpRequest.newBuilder().setProject(project).build();
    return aggregatedListTargetHttpProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all TargetHttpProxy resources, regional and global, available to the
   * specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   AggregatedListTargetHttpProxiesHttpRequest request = AggregatedListTargetHttpProxiesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (TargetHttpProxiesScopedList element : targetHttpProxyClient.aggregatedListTargetHttpProxies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListTargetHttpProxiesPagedResponse aggregatedListTargetHttpProxies(
      AggregatedListTargetHttpProxiesHttpRequest request) {
    return aggregatedListTargetHttpProxiesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all TargetHttpProxy resources, regional and global, available to the
   * specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   AggregatedListTargetHttpProxiesHttpRequest request = AggregatedListTargetHttpProxiesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;AggregatedListTargetHttpProxiesPagedResponse&gt; future = targetHttpProxyClient.aggregatedListTargetHttpProxiesPagedCallable().futureCall(request);
   *   // Do something
   *   for (TargetHttpProxiesScopedList element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<
          AggregatedListTargetHttpProxiesHttpRequest, AggregatedListTargetHttpProxiesPagedResponse>
      aggregatedListTargetHttpProxiesPagedCallable() {
    return stub.aggregatedListTargetHttpProxiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all TargetHttpProxy resources, regional and global, available to the
   * specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   AggregatedListTargetHttpProxiesHttpRequest request = AggregatedListTargetHttpProxiesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     TargetHttpProxyAggregatedList response = targetHttpProxyClient.aggregatedListTargetHttpProxiesCallable().call(request);
   *     for (TargetHttpProxiesScopedList element : response.getItemsMap()) {
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
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<
          AggregatedListTargetHttpProxiesHttpRequest, TargetHttpProxyAggregatedList>
      aggregatedListTargetHttpProxiesCallable() {
    return stub.aggregatedListTargetHttpProxiesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectGlobalTargetHttpProxyName targetHttpProxy = ProjectGlobalTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   Operation response = targetHttpProxyClient.deleteTargetHttpProxy(targetHttpProxy);
   * }
   * </code></pre>
   *
   * @param targetHttpProxy Name of the TargetHttpProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetHttpProxy(ProjectGlobalTargetHttpProxyName targetHttpProxy) {

    DeleteTargetHttpProxyHttpRequest request =
        DeleteTargetHttpProxyHttpRequest.newBuilder()
            .setTargetHttpProxy(targetHttpProxy == null ? null : targetHttpProxy.toString())
            .build();
    return deleteTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectGlobalTargetHttpProxyName targetHttpProxy = ProjectGlobalTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   Operation response = targetHttpProxyClient.deleteTargetHttpProxy(targetHttpProxy.toString());
   * }
   * </code></pre>
   *
   * @param targetHttpProxy Name of the TargetHttpProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetHttpProxy(String targetHttpProxy) {

    DeleteTargetHttpProxyHttpRequest request =
        DeleteTargetHttpProxyHttpRequest.newBuilder().setTargetHttpProxy(targetHttpProxy).build();
    return deleteTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedTargetHttpProxy = ProjectGlobalTargetHttpProxyName.format("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   DeleteTargetHttpProxyHttpRequest request = DeleteTargetHttpProxyHttpRequest.newBuilder()
   *     .setTargetHttpProxy(formattedTargetHttpProxy)
   *     .build();
   *   Operation response = targetHttpProxyClient.deleteTargetHttpProxy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteTargetHttpProxy(DeleteTargetHttpProxyHttpRequest request) {
    return deleteTargetHttpProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified TargetHttpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedTargetHttpProxy = ProjectGlobalTargetHttpProxyName.format("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   DeleteTargetHttpProxyHttpRequest request = DeleteTargetHttpProxyHttpRequest.newBuilder()
   *     .setTargetHttpProxy(formattedTargetHttpProxy)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpProxyClient.deleteTargetHttpProxyCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteTargetHttpProxyHttpRequest, Operation>
      deleteTargetHttpProxyCallable() {
    return stub.deleteTargetHttpProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpProxy resource. Gets a list of available target HTTP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectGlobalTargetHttpProxyName targetHttpProxy = ProjectGlobalTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   TargetHttpProxy response = targetHttpProxyClient.getTargetHttpProxy(targetHttpProxy);
   * }
   * </code></pre>
   *
   * @param targetHttpProxy Name of the TargetHttpProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetHttpProxy getTargetHttpProxy(
      ProjectGlobalTargetHttpProxyName targetHttpProxy) {

    GetTargetHttpProxyHttpRequest request =
        GetTargetHttpProxyHttpRequest.newBuilder()
            .setTargetHttpProxy(targetHttpProxy == null ? null : targetHttpProxy.toString())
            .build();
    return getTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpProxy resource. Gets a list of available target HTTP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectGlobalTargetHttpProxyName targetHttpProxy = ProjectGlobalTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   TargetHttpProxy response = targetHttpProxyClient.getTargetHttpProxy(targetHttpProxy.toString());
   * }
   * </code></pre>
   *
   * @param targetHttpProxy Name of the TargetHttpProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetHttpProxy getTargetHttpProxy(String targetHttpProxy) {

    GetTargetHttpProxyHttpRequest request =
        GetTargetHttpProxyHttpRequest.newBuilder().setTargetHttpProxy(targetHttpProxy).build();
    return getTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpProxy resource. Gets a list of available target HTTP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedTargetHttpProxy = ProjectGlobalTargetHttpProxyName.format("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   GetTargetHttpProxyHttpRequest request = GetTargetHttpProxyHttpRequest.newBuilder()
   *     .setTargetHttpProxy(formattedTargetHttpProxy)
   *     .build();
   *   TargetHttpProxy response = targetHttpProxyClient.getTargetHttpProxy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final TargetHttpProxy getTargetHttpProxy(GetTargetHttpProxyHttpRequest request) {
    return getTargetHttpProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified TargetHttpProxy resource. Gets a list of available target HTTP proxies by
   * making a list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedTargetHttpProxy = ProjectGlobalTargetHttpProxyName.format("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   GetTargetHttpProxyHttpRequest request = GetTargetHttpProxyHttpRequest.newBuilder()
   *     .setTargetHttpProxy(formattedTargetHttpProxy)
   *     .build();
   *   ApiFuture&lt;TargetHttpProxy&gt; future = targetHttpProxyClient.getTargetHttpProxyCallable().futureCall(request);
   *   // Do something
   *   TargetHttpProxy response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetTargetHttpProxyHttpRequest, TargetHttpProxy>
      getTargetHttpProxyCallable() {
    return stub.getTargetHttpProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetHttpProxy targetHttpProxyResource = TargetHttpProxy.newBuilder().build();
   *   Operation response = targetHttpProxyClient.insertTargetHttpProxy(project, targetHttpProxyResource);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetHttpProxyResource Represents a Target HTTP Proxy resource.
   *     <p>A target HTTP proxy is a component of GCP HTTP load balancers. Forwarding rules
   *     reference a target HTTP proxy, and the target proxy then references a URL map. For more
   *     information, read Using Target Proxies and Forwarding rule concepts. (== resource_for
   *     beta.targetHttpProxies ==) (== resource_for v1.targetHttpProxies ==) (== resource_for
   *     beta.regionTargetHttpProxies ==) (== resource_for v1.regionTargetHttpProxies ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetHttpProxy(
      ProjectName project, TargetHttpProxy targetHttpProxyResource) {

    InsertTargetHttpProxyHttpRequest request =
        InsertTargetHttpProxyHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setTargetHttpProxyResource(targetHttpProxyResource)
            .build();
    return insertTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   TargetHttpProxy targetHttpProxyResource = TargetHttpProxy.newBuilder().build();
   *   Operation response = targetHttpProxyClient.insertTargetHttpProxy(project.toString(), targetHttpProxyResource);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param targetHttpProxyResource Represents a Target HTTP Proxy resource.
   *     <p>A target HTTP proxy is a component of GCP HTTP load balancers. Forwarding rules
   *     reference a target HTTP proxy, and the target proxy then references a URL map. For more
   *     information, read Using Target Proxies and Forwarding rule concepts. (== resource_for
   *     beta.targetHttpProxies ==) (== resource_for v1.targetHttpProxies ==) (== resource_for
   *     beta.regionTargetHttpProxies ==) (== resource_for v1.regionTargetHttpProxies ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetHttpProxy(
      String project, TargetHttpProxy targetHttpProxyResource) {

    InsertTargetHttpProxyHttpRequest request =
        InsertTargetHttpProxyHttpRequest.newBuilder()
            .setProject(project)
            .setTargetHttpProxyResource(targetHttpProxyResource)
            .build();
    return insertTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   TargetHttpProxy targetHttpProxyResource = TargetHttpProxy.newBuilder().build();
   *   InsertTargetHttpProxyHttpRequest request = InsertTargetHttpProxyHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setTargetHttpProxyResource(targetHttpProxyResource)
   *     .build();
   *   Operation response = targetHttpProxyClient.insertTargetHttpProxy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertTargetHttpProxy(InsertTargetHttpProxyHttpRequest request) {
    return insertTargetHttpProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a TargetHttpProxy resource in the specified project using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   TargetHttpProxy targetHttpProxyResource = TargetHttpProxy.newBuilder().build();
   *   InsertTargetHttpProxyHttpRequest request = InsertTargetHttpProxyHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setTargetHttpProxyResource(targetHttpProxyResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpProxyClient.insertTargetHttpProxyCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertTargetHttpProxyHttpRequest, Operation>
      insertTargetHttpProxyCallable() {
    return stub.insertTargetHttpProxyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetHttpProxy element : targetHttpProxyClient.listTargetHttpProxies(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetHttpProxiesPagedResponse listTargetHttpProxies(ProjectName project) {
    ListTargetHttpProxiesHttpRequest request =
        ListTargetHttpProxiesHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return listTargetHttpProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (TargetHttpProxy element : targetHttpProxyClient.listTargetHttpProxies(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetHttpProxiesPagedResponse listTargetHttpProxies(String project) {
    ListTargetHttpProxiesHttpRequest request =
        ListTargetHttpProxiesHttpRequest.newBuilder().setProject(project).build();
    return listTargetHttpProxies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListTargetHttpProxiesHttpRequest request = ListTargetHttpProxiesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (TargetHttpProxy element : targetHttpProxyClient.listTargetHttpProxies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListTargetHttpProxiesPagedResponse listTargetHttpProxies(
      ListTargetHttpProxiesHttpRequest request) {
    return listTargetHttpProxiesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListTargetHttpProxiesHttpRequest request = ListTargetHttpProxiesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;ListTargetHttpProxiesPagedResponse&gt; future = targetHttpProxyClient.listTargetHttpProxiesPagedCallable().futureCall(request);
   *   // Do something
   *   for (TargetHttpProxy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetHttpProxiesHttpRequest, ListTargetHttpProxiesPagedResponse>
      listTargetHttpProxiesPagedCallable() {
    return stub.listTargetHttpProxiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListTargetHttpProxiesHttpRequest request = ListTargetHttpProxiesHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     TargetHttpProxyList response = targetHttpProxyClient.listTargetHttpProxiesCallable().call(request);
   *     for (TargetHttpProxy element : response.getItemsList()) {
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
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList>
      listTargetHttpProxiesCallable() {
    return stub.listTargetHttpProxiesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectTargetHttpProxyName targetHttpProxy = ProjectTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
   *   Operation response = targetHttpProxyClient.setUrlMapTargetHttpProxy(targetHttpProxy, urlMapReferenceResource);
   * }
   * </code></pre>
   *
   * @param targetHttpProxy Name of the TargetHttpProxy to set a URL map for.
   * @param urlMapReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setUrlMapTargetHttpProxy(
      ProjectTargetHttpProxyName targetHttpProxy, UrlMapReference urlMapReferenceResource) {

    SetUrlMapTargetHttpProxyHttpRequest request =
        SetUrlMapTargetHttpProxyHttpRequest.newBuilder()
            .setTargetHttpProxy(targetHttpProxy == null ? null : targetHttpProxy.toString())
            .setUrlMapReferenceResource(urlMapReferenceResource)
            .build();
    return setUrlMapTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   ProjectTargetHttpProxyName targetHttpProxy = ProjectTargetHttpProxyName.of("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
   *   Operation response = targetHttpProxyClient.setUrlMapTargetHttpProxy(targetHttpProxy.toString(), urlMapReferenceResource);
   * }
   * </code></pre>
   *
   * @param targetHttpProxy Name of the TargetHttpProxy to set a URL map for.
   * @param urlMapReferenceResource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setUrlMapTargetHttpProxy(
      String targetHttpProxy, UrlMapReference urlMapReferenceResource) {

    SetUrlMapTargetHttpProxyHttpRequest request =
        SetUrlMapTargetHttpProxyHttpRequest.newBuilder()
            .setTargetHttpProxy(targetHttpProxy)
            .setUrlMapReferenceResource(urlMapReferenceResource)
            .build();
    return setUrlMapTargetHttpProxy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedTargetHttpProxy = ProjectTargetHttpProxyName.format("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
   *   SetUrlMapTargetHttpProxyHttpRequest request = SetUrlMapTargetHttpProxyHttpRequest.newBuilder()
   *     .setTargetHttpProxy(formattedTargetHttpProxy)
   *     .setUrlMapReferenceResource(urlMapReferenceResource)
   *     .build();
   *   Operation response = targetHttpProxyClient.setUrlMapTargetHttpProxy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation setUrlMapTargetHttpProxy(SetUrlMapTargetHttpProxyHttpRequest request) {
    return setUrlMapTargetHttpProxyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Changes the URL map for TargetHttpProxy.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (TargetHttpProxyClient targetHttpProxyClient = TargetHttpProxyClient.create()) {
   *   String formattedTargetHttpProxy = ProjectTargetHttpProxyName.format("[PROJECT]", "[TARGET_HTTP_PROXY]");
   *   UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
   *   SetUrlMapTargetHttpProxyHttpRequest request = SetUrlMapTargetHttpProxyHttpRequest.newBuilder()
   *     .setTargetHttpProxy(formattedTargetHttpProxy)
   *     .setUrlMapReferenceResource(urlMapReferenceResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = targetHttpProxyClient.setUrlMapTargetHttpProxyCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<SetUrlMapTargetHttpProxyHttpRequest, Operation>
      setUrlMapTargetHttpProxyCallable() {
    return stub.setUrlMapTargetHttpProxyCallable();
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

  public static class AggregatedListTargetHttpProxiesPagedResponse
      extends AbstractPagedListResponse<
          AggregatedListTargetHttpProxiesHttpRequest,
          TargetHttpProxyAggregatedList,
          TargetHttpProxiesScopedList,
          AggregatedListTargetHttpProxiesPage,
          AggregatedListTargetHttpProxiesFixedSizeCollection> {

    public static ApiFuture<AggregatedListTargetHttpProxiesPagedResponse> createAsync(
        PageContext<
                AggregatedListTargetHttpProxiesHttpRequest,
                TargetHttpProxyAggregatedList,
                TargetHttpProxiesScopedList>
            context,
        ApiFuture<TargetHttpProxyAggregatedList> futureResponse) {
      ApiFuture<AggregatedListTargetHttpProxiesPage> futurePage =
          AggregatedListTargetHttpProxiesPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<
              AggregatedListTargetHttpProxiesPage, AggregatedListTargetHttpProxiesPagedResponse>() {
            @Override
            public AggregatedListTargetHttpProxiesPagedResponse apply(
                AggregatedListTargetHttpProxiesPage input) {
              return new AggregatedListTargetHttpProxiesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private AggregatedListTargetHttpProxiesPagedResponse(AggregatedListTargetHttpProxiesPage page) {
      super(page, AggregatedListTargetHttpProxiesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class AggregatedListTargetHttpProxiesPage
      extends AbstractPage<
          AggregatedListTargetHttpProxiesHttpRequest,
          TargetHttpProxyAggregatedList,
          TargetHttpProxiesScopedList,
          AggregatedListTargetHttpProxiesPage> {

    private AggregatedListTargetHttpProxiesPage(
        PageContext<
                AggregatedListTargetHttpProxiesHttpRequest,
                TargetHttpProxyAggregatedList,
                TargetHttpProxiesScopedList>
            context,
        TargetHttpProxyAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListTargetHttpProxiesPage createEmptyPage() {
      return new AggregatedListTargetHttpProxiesPage(null, null);
    }

    @Override
    protected AggregatedListTargetHttpProxiesPage createPage(
        PageContext<
                AggregatedListTargetHttpProxiesHttpRequest,
                TargetHttpProxyAggregatedList,
                TargetHttpProxiesScopedList>
            context,
        TargetHttpProxyAggregatedList response) {
      return new AggregatedListTargetHttpProxiesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListTargetHttpProxiesPage> createPageAsync(
        PageContext<
                AggregatedListTargetHttpProxiesHttpRequest,
                TargetHttpProxyAggregatedList,
                TargetHttpProxiesScopedList>
            context,
        ApiFuture<TargetHttpProxyAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class AggregatedListTargetHttpProxiesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          AggregatedListTargetHttpProxiesHttpRequest,
          TargetHttpProxyAggregatedList,
          TargetHttpProxiesScopedList,
          AggregatedListTargetHttpProxiesPage,
          AggregatedListTargetHttpProxiesFixedSizeCollection> {

    private AggregatedListTargetHttpProxiesFixedSizeCollection(
        List<AggregatedListTargetHttpProxiesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListTargetHttpProxiesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListTargetHttpProxiesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListTargetHttpProxiesFixedSizeCollection createCollection(
        List<AggregatedListTargetHttpProxiesPage> pages, int collectionSize) {
      return new AggregatedListTargetHttpProxiesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListTargetHttpProxiesPagedResponse
      extends AbstractPagedListResponse<
          ListTargetHttpProxiesHttpRequest,
          TargetHttpProxyList,
          TargetHttpProxy,
          ListTargetHttpProxiesPage,
          ListTargetHttpProxiesFixedSizeCollection> {

    public static ApiFuture<ListTargetHttpProxiesPagedResponse> createAsync(
        PageContext<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy> context,
        ApiFuture<TargetHttpProxyList> futureResponse) {
      ApiFuture<ListTargetHttpProxiesPage> futurePage =
          ListTargetHttpProxiesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTargetHttpProxiesPage, ListTargetHttpProxiesPagedResponse>() {
            @Override
            public ListTargetHttpProxiesPagedResponse apply(ListTargetHttpProxiesPage input) {
              return new ListTargetHttpProxiesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListTargetHttpProxiesPagedResponse(ListTargetHttpProxiesPage page) {
      super(page, ListTargetHttpProxiesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListTargetHttpProxiesPage
      extends AbstractPage<
          ListTargetHttpProxiesHttpRequest,
          TargetHttpProxyList,
          TargetHttpProxy,
          ListTargetHttpProxiesPage> {

    private ListTargetHttpProxiesPage(
        PageContext<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy> context,
        TargetHttpProxyList response) {
      super(context, response);
    }

    private static ListTargetHttpProxiesPage createEmptyPage() {
      return new ListTargetHttpProxiesPage(null, null);
    }

    @Override
    protected ListTargetHttpProxiesPage createPage(
        PageContext<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy> context,
        TargetHttpProxyList response) {
      return new ListTargetHttpProxiesPage(context, response);
    }

    @Override
    public ApiFuture<ListTargetHttpProxiesPage> createPageAsync(
        PageContext<ListTargetHttpProxiesHttpRequest, TargetHttpProxyList, TargetHttpProxy> context,
        ApiFuture<TargetHttpProxyList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListTargetHttpProxiesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTargetHttpProxiesHttpRequest,
          TargetHttpProxyList,
          TargetHttpProxy,
          ListTargetHttpProxiesPage,
          ListTargetHttpProxiesFixedSizeCollection> {

    private ListTargetHttpProxiesFixedSizeCollection(
        List<ListTargetHttpProxiesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTargetHttpProxiesFixedSizeCollection createEmptyCollection() {
      return new ListTargetHttpProxiesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTargetHttpProxiesFixedSizeCollection createCollection(
        List<ListTargetHttpProxiesPage> pages, int collectionSize) {
      return new ListTargetHttpProxiesFixedSizeCollection(pages, collectionSize);
    }
  }
}
