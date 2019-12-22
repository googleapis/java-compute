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
import com.google.cloud.compute.v1.stub.HealthCheckStub;
import com.google.cloud.compute.v1.stub.HealthCheckStubSettings;
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
 * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
 *   ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
 *   Operation response = healthCheckClient.deleteHealthCheck(healthCheck);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the healthCheckClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
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
 * <p>This class can be customized by passing in a custom instance of HealthCheckSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * HealthCheckSettings healthCheckSettings =
 *     HealthCheckSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * HealthCheckClient healthCheckClient =
 *     HealthCheckClient.create(healthCheckSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * HealthCheckSettings healthCheckSettings =
 *     HealthCheckSettings.newBuilder().setEndpoint(myEndpoint).build();
 * HealthCheckClient healthCheckClient =
 *     HealthCheckClient.create(healthCheckSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class HealthCheckClient implements BackgroundResource {
  private final HealthCheckSettings settings;
  private final HealthCheckStub stub;

  /** Constructs an instance of HealthCheckClient with default settings. */
  public static final HealthCheckClient create() throws IOException {
    return create(HealthCheckSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of HealthCheckClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final HealthCheckClient create(HealthCheckSettings settings) throws IOException {
    return new HealthCheckClient(settings);
  }

  /**
   * Constructs an instance of HealthCheckClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use HealthCheckSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final HealthCheckClient create(HealthCheckStub stub) {
    return new HealthCheckClient(stub);
  }

  /**
   * Constructs an instance of HealthCheckClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HealthCheckClient(HealthCheckSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((HealthCheckStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected HealthCheckClient(HealthCheckStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final HealthCheckSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public HealthCheckStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all HealthCheck resources, regional and global, available to the
   * specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (HealthChecksScopedList element : healthCheckClient.aggregatedListHealthChecks(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Name of the project scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListHealthChecksPagedResponse aggregatedListHealthChecks(
      ProjectName project) {
    AggregatedListHealthChecksHttpRequest request =
        AggregatedListHealthChecksHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return aggregatedListHealthChecks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all HealthCheck resources, regional and global, available to the
   * specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (HealthChecksScopedList element : healthCheckClient.aggregatedListHealthChecks(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Name of the project scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListHealthChecksPagedResponse aggregatedListHealthChecks(String project) {
    AggregatedListHealthChecksHttpRequest request =
        AggregatedListHealthChecksHttpRequest.newBuilder().setProject(project).build();
    return aggregatedListHealthChecks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all HealthCheck resources, regional and global, available to the
   * specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   AggregatedListHealthChecksHttpRequest request = AggregatedListHealthChecksHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (HealthChecksScopedList element : healthCheckClient.aggregatedListHealthChecks(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListHealthChecksPagedResponse aggregatedListHealthChecks(
      AggregatedListHealthChecksHttpRequest request) {
    return aggregatedListHealthChecksPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all HealthCheck resources, regional and global, available to the
   * specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   AggregatedListHealthChecksHttpRequest request = AggregatedListHealthChecksHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;AggregatedListHealthChecksPagedResponse&gt; future = healthCheckClient.aggregatedListHealthChecksPagedCallable().futureCall(request);
   *   // Do something
   *   for (HealthChecksScopedList element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<
          AggregatedListHealthChecksHttpRequest, AggregatedListHealthChecksPagedResponse>
      aggregatedListHealthChecksPagedCallable() {
    return stub.aggregatedListHealthChecksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of all HealthCheck resources, regional and global, available to the
   * specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   AggregatedListHealthChecksHttpRequest request = AggregatedListHealthChecksHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     HealthChecksAggregatedList response = healthCheckClient.aggregatedListHealthChecksCallable().call(request);
   *     for (HealthChecksScopedList element : response.getItemsMap()) {
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
  public final UnaryCallable<AggregatedListHealthChecksHttpRequest, HealthChecksAggregatedList>
      aggregatedListHealthChecksCallable() {
    return stub.aggregatedListHealthChecksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HealthCheck resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
   *   Operation response = healthCheckClient.deleteHealthCheck(healthCheck);
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteHealthCheck(ProjectGlobalHealthCheckName healthCheck) {

    DeleteHealthCheckHttpRequest request =
        DeleteHealthCheckHttpRequest.newBuilder()
            .setHealthCheck(healthCheck == null ? null : healthCheck.toString())
            .build();
    return deleteHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HealthCheck resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
   *   Operation response = healthCheckClient.deleteHealthCheck(healthCheck.toString());
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteHealthCheck(String healthCheck) {

    DeleteHealthCheckHttpRequest request =
        DeleteHealthCheckHttpRequest.newBuilder().setHealthCheck(healthCheck).build();
    return deleteHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HealthCheck resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = ProjectGlobalHealthCheckName.format("[PROJECT]", "[HEALTH_CHECK]");
   *   DeleteHealthCheckHttpRequest request = DeleteHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   Operation response = healthCheckClient.deleteHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteHealthCheck(DeleteHealthCheckHttpRequest request) {
    return deleteHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified HealthCheck resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = ProjectGlobalHealthCheckName.format("[PROJECT]", "[HEALTH_CHECK]");
   *   DeleteHealthCheckHttpRequest request = DeleteHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = healthCheckClient.deleteHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteHealthCheckHttpRequest, Operation> deleteHealthCheckCallable() {
    return stub.deleteHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HealthCheck resource. Gets a list of available health checks by making a
   * list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck response = healthCheckClient.getHealthCheck(healthCheck);
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final HealthCheck getHealthCheck(ProjectGlobalHealthCheckName healthCheck) {

    GetHealthCheckHttpRequest request =
        GetHealthCheckHttpRequest.newBuilder()
            .setHealthCheck(healthCheck == null ? null : healthCheck.toString())
            .build();
    return getHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HealthCheck resource. Gets a list of available health checks by making a
   * list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck response = healthCheckClient.getHealthCheck(healthCheck.toString());
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final HealthCheck getHealthCheck(String healthCheck) {

    GetHealthCheckHttpRequest request =
        GetHealthCheckHttpRequest.newBuilder().setHealthCheck(healthCheck).build();
    return getHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HealthCheck resource. Gets a list of available health checks by making a
   * list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = ProjectGlobalHealthCheckName.format("[PROJECT]", "[HEALTH_CHECK]");
   *   GetHealthCheckHttpRequest request = GetHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   HealthCheck response = healthCheckClient.getHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final HealthCheck getHealthCheck(GetHealthCheckHttpRequest request) {
    return getHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified HealthCheck resource. Gets a list of available health checks by making a
   * list() request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = ProjectGlobalHealthCheckName.format("[PROJECT]", "[HEALTH_CHECK]");
   *   GetHealthCheckHttpRequest request = GetHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .build();
   *   ApiFuture&lt;HealthCheck&gt; future = healthCheckClient.getHealthCheckCallable().futureCall(request);
   *   // Do something
   *   HealthCheck response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetHealthCheckHttpRequest, HealthCheck> getHealthCheckCallable() {
    return stub.getHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HealthCheck resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   Operation response = healthCheckClient.insertHealthCheck(project, healthCheckResource);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param healthCheckResource Represents a Health Check resource.
   *     <p>Health checks are used for most GCP load balancers and managed instance group
   *     auto-healing. For more information, read Health Check Concepts.
   *     <p>To perform health checks on network load balancers, you must use either httpHealthChecks
   *     or httpsHealthChecks.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertHealthCheck(ProjectName project, HealthCheck healthCheckResource) {

    InsertHealthCheckHttpRequest request =
        InsertHealthCheckHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setHealthCheckResource(healthCheckResource)
            .build();
    return insertHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HealthCheck resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   Operation response = healthCheckClient.insertHealthCheck(project.toString(), healthCheckResource);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param healthCheckResource Represents a Health Check resource.
   *     <p>Health checks are used for most GCP load balancers and managed instance group
   *     auto-healing. For more information, read Health Check Concepts.
   *     <p>To perform health checks on network load balancers, you must use either httpHealthChecks
   *     or httpsHealthChecks.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertHealthCheck(String project, HealthCheck healthCheckResource) {

    InsertHealthCheckHttpRequest request =
        InsertHealthCheckHttpRequest.newBuilder()
            .setProject(project)
            .setHealthCheckResource(healthCheckResource)
            .build();
    return insertHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HealthCheck resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   InsertHealthCheckHttpRequest request = InsertHealthCheckHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setHealthCheckResource(healthCheckResource)
   *     .build();
   *   Operation response = healthCheckClient.insertHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertHealthCheck(InsertHealthCheckHttpRequest request) {
    return insertHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a HealthCheck resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   InsertHealthCheckHttpRequest request = InsertHealthCheckHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .setHealthCheckResource(healthCheckResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = healthCheckClient.insertHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertHealthCheckHttpRequest, Operation> insertHealthCheckCallable() {
    return stub.insertHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HealthCheck resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (HealthCheck element : healthCheckClient.listHealthChecks(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListHealthChecksPagedResponse listHealthChecks(ProjectName project) {
    ListHealthChecksHttpRequest request =
        ListHealthChecksHttpRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .build();
    return listHealthChecks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HealthCheck resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (HealthCheck element : healthCheckClient.listHealthChecks(project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListHealthChecksPagedResponse listHealthChecks(String project) {
    ListHealthChecksHttpRequest request =
        ListHealthChecksHttpRequest.newBuilder().setProject(project).build();
    return listHealthChecks(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HealthCheck resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListHealthChecksHttpRequest request = ListHealthChecksHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   for (HealthCheck element : healthCheckClient.listHealthChecks(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListHealthChecksPagedResponse listHealthChecks(ListHealthChecksHttpRequest request) {
    return listHealthChecksPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HealthCheck resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListHealthChecksHttpRequest request = ListHealthChecksHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;ListHealthChecksPagedResponse&gt; future = healthCheckClient.listHealthChecksPagedCallable().futureCall(request);
   *   // Do something
   *   for (HealthCheck element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListHealthChecksHttpRequest, ListHealthChecksPagedResponse>
      listHealthChecksPagedCallable() {
    return stub.listHealthChecksPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of HealthCheck resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   ListHealthChecksHttpRequest request = ListHealthChecksHttpRequest.newBuilder()
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     HealthCheckList response = healthCheckClient.listHealthChecksCallable().call(request);
   *     for (HealthCheck element : response.getItemsList()) {
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
  public final UnaryCallable<ListHealthChecksHttpRequest, HealthCheckList>
      listHealthChecksCallable() {
    return stub.listHealthChecksCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   * This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   Operation response = healthCheckClient.patchHealthCheck(healthCheck, healthCheckResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to patch.
   * @param healthCheckResource Represents a Health Check resource.
   *     <p>Health checks are used for most GCP load balancers and managed instance group
   *     auto-healing. For more information, read Health Check Concepts.
   *     <p>To perform health checks on network load balancers, you must use either httpHealthChecks
   *     or httpsHealthChecks.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchHealthCheck(
      ProjectGlobalHealthCheckName healthCheck,
      HealthCheck healthCheckResource,
      List<String> fieldMask) {

    PatchHealthCheckHttpRequest request =
        PatchHealthCheckHttpRequest.newBuilder()
            .setHealthCheck(healthCheck == null ? null : healthCheck.toString())
            .setHealthCheckResource(healthCheckResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   * This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   Operation response = healthCheckClient.patchHealthCheck(healthCheck.toString(), healthCheckResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to patch.
   * @param healthCheckResource Represents a Health Check resource.
   *     <p>Health checks are used for most GCP load balancers and managed instance group
   *     auto-healing. For more information, read Health Check Concepts.
   *     <p>To perform health checks on network load balancers, you must use either httpHealthChecks
   *     or httpsHealthChecks.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchHealthCheck(
      String healthCheck, HealthCheck healthCheckResource, List<String> fieldMask) {

    PatchHealthCheckHttpRequest request =
        PatchHealthCheckHttpRequest.newBuilder()
            .setHealthCheck(healthCheck)
            .setHealthCheckResource(healthCheckResource)
            .addAllFieldMask(fieldMask)
            .build();
    return patchHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   * This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = ProjectGlobalHealthCheckName.format("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchHealthCheckHttpRequest request = PatchHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .setHealthCheckResource(healthCheckResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   Operation response = healthCheckClient.patchHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation patchHealthCheck(PatchHealthCheckHttpRequest request) {
    return patchHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   * This method supports PATCH semantics and uses the JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = ProjectGlobalHealthCheckName.format("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   PatchHealthCheckHttpRequest request = PatchHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .setHealthCheckResource(healthCheckResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = healthCheckClient.patchHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<PatchHealthCheckHttpRequest, Operation> patchHealthCheckCallable() {
    return stub.patchHealthCheckCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   Operation response = healthCheckClient.updateHealthCheck(healthCheck, healthCheckResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to update.
   * @param healthCheckResource Represents a Health Check resource.
   *     <p>Health checks are used for most GCP load balancers and managed instance group
   *     auto-healing. For more information, read Health Check Concepts.
   *     <p>To perform health checks on network load balancers, you must use either httpHealthChecks
   *     or httpsHealthChecks.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateHealthCheck(
      ProjectGlobalHealthCheckName healthCheck,
      HealthCheck healthCheckResource,
      List<String> fieldMask) {

    UpdateHealthCheckHttpRequest request =
        UpdateHealthCheckHttpRequest.newBuilder()
            .setHealthCheck(healthCheck == null ? null : healthCheck.toString())
            .setHealthCheckResource(healthCheckResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updateHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   Operation response = healthCheckClient.updateHealthCheck(healthCheck.toString(), healthCheckResource, fieldMask);
   * }
   * </code></pre>
   *
   * @param healthCheck Name of the HealthCheck resource to update.
   * @param healthCheckResource Represents a Health Check resource.
   *     <p>Health checks are used for most GCP load balancers and managed instance group
   *     auto-healing. For more information, read Health Check Concepts.
   *     <p>To perform health checks on network load balancers, you must use either httpHealthChecks
   *     or httpsHealthChecks.
   * @param fieldMask The fields that should be serialized (even if they have empty values). If the
   *     containing message object has a non-null fieldmask, then all the fields in the field mask
   *     (and only those fields in the field mask) will be serialized. If the containing object does
   *     not have a fieldmask, then only non-empty fields will be serialized.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateHealthCheck(
      String healthCheck, HealthCheck healthCheckResource, List<String> fieldMask) {

    UpdateHealthCheckHttpRequest request =
        UpdateHealthCheckHttpRequest.newBuilder()
            .setHealthCheck(healthCheck)
            .setHealthCheckResource(healthCheckResource)
            .addAllFieldMask(fieldMask)
            .build();
    return updateHealthCheck(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = ProjectGlobalHealthCheckName.format("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateHealthCheckHttpRequest request = UpdateHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .setHealthCheckResource(healthCheckResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   Operation response = healthCheckClient.updateHealthCheck(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation updateHealthCheck(UpdateHealthCheckHttpRequest request) {
    return updateHealthCheckCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates a HealthCheck resource in the specified project using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
   *   String formattedHealthCheck = ProjectGlobalHealthCheckName.format("[PROJECT]", "[HEALTH_CHECK]");
   *   HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
   *   List&lt;String&gt; fieldMask = new ArrayList&lt;&gt;();
   *   UpdateHealthCheckHttpRequest request = UpdateHealthCheckHttpRequest.newBuilder()
   *     .setHealthCheck(formattedHealthCheck)
   *     .setHealthCheckResource(healthCheckResource)
   *     .addAllFieldMask(fieldMask)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = healthCheckClient.updateHealthCheckCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<UpdateHealthCheckHttpRequest, Operation> updateHealthCheckCallable() {
    return stub.updateHealthCheckCallable();
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

  public static class AggregatedListHealthChecksPagedResponse
      extends AbstractPagedListResponse<
          AggregatedListHealthChecksHttpRequest,
          HealthChecksAggregatedList,
          HealthChecksScopedList,
          AggregatedListHealthChecksPage,
          AggregatedListHealthChecksFixedSizeCollection> {

    public static ApiFuture<AggregatedListHealthChecksPagedResponse> createAsync(
        PageContext<
                AggregatedListHealthChecksHttpRequest,
                HealthChecksAggregatedList,
                HealthChecksScopedList>
            context,
        ApiFuture<HealthChecksAggregatedList> futureResponse) {
      ApiFuture<AggregatedListHealthChecksPage> futurePage =
          AggregatedListHealthChecksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<
              AggregatedListHealthChecksPage, AggregatedListHealthChecksPagedResponse>() {
            @Override
            public AggregatedListHealthChecksPagedResponse apply(
                AggregatedListHealthChecksPage input) {
              return new AggregatedListHealthChecksPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private AggregatedListHealthChecksPagedResponse(AggregatedListHealthChecksPage page) {
      super(page, AggregatedListHealthChecksFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class AggregatedListHealthChecksPage
      extends AbstractPage<
          AggregatedListHealthChecksHttpRequest,
          HealthChecksAggregatedList,
          HealthChecksScopedList,
          AggregatedListHealthChecksPage> {

    private AggregatedListHealthChecksPage(
        PageContext<
                AggregatedListHealthChecksHttpRequest,
                HealthChecksAggregatedList,
                HealthChecksScopedList>
            context,
        HealthChecksAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListHealthChecksPage createEmptyPage() {
      return new AggregatedListHealthChecksPage(null, null);
    }

    @Override
    protected AggregatedListHealthChecksPage createPage(
        PageContext<
                AggregatedListHealthChecksHttpRequest,
                HealthChecksAggregatedList,
                HealthChecksScopedList>
            context,
        HealthChecksAggregatedList response) {
      return new AggregatedListHealthChecksPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListHealthChecksPage> createPageAsync(
        PageContext<
                AggregatedListHealthChecksHttpRequest,
                HealthChecksAggregatedList,
                HealthChecksScopedList>
            context,
        ApiFuture<HealthChecksAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class AggregatedListHealthChecksFixedSizeCollection
      extends AbstractFixedSizeCollection<
          AggregatedListHealthChecksHttpRequest,
          HealthChecksAggregatedList,
          HealthChecksScopedList,
          AggregatedListHealthChecksPage,
          AggregatedListHealthChecksFixedSizeCollection> {

    private AggregatedListHealthChecksFixedSizeCollection(
        List<AggregatedListHealthChecksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListHealthChecksFixedSizeCollection createEmptyCollection() {
      return new AggregatedListHealthChecksFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListHealthChecksFixedSizeCollection createCollection(
        List<AggregatedListHealthChecksPage> pages, int collectionSize) {
      return new AggregatedListHealthChecksFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListHealthChecksPagedResponse
      extends AbstractPagedListResponse<
          ListHealthChecksHttpRequest,
          HealthCheckList,
          HealthCheck,
          ListHealthChecksPage,
          ListHealthChecksFixedSizeCollection> {

    public static ApiFuture<ListHealthChecksPagedResponse> createAsync(
        PageContext<ListHealthChecksHttpRequest, HealthCheckList, HealthCheck> context,
        ApiFuture<HealthCheckList> futureResponse) {
      ApiFuture<ListHealthChecksPage> futurePage =
          ListHealthChecksPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListHealthChecksPage, ListHealthChecksPagedResponse>() {
            @Override
            public ListHealthChecksPagedResponse apply(ListHealthChecksPage input) {
              return new ListHealthChecksPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListHealthChecksPagedResponse(ListHealthChecksPage page) {
      super(page, ListHealthChecksFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListHealthChecksPage
      extends AbstractPage<
          ListHealthChecksHttpRequest, HealthCheckList, HealthCheck, ListHealthChecksPage> {

    private ListHealthChecksPage(
        PageContext<ListHealthChecksHttpRequest, HealthCheckList, HealthCheck> context,
        HealthCheckList response) {
      super(context, response);
    }

    private static ListHealthChecksPage createEmptyPage() {
      return new ListHealthChecksPage(null, null);
    }

    @Override
    protected ListHealthChecksPage createPage(
        PageContext<ListHealthChecksHttpRequest, HealthCheckList, HealthCheck> context,
        HealthCheckList response) {
      return new ListHealthChecksPage(context, response);
    }

    @Override
    public ApiFuture<ListHealthChecksPage> createPageAsync(
        PageContext<ListHealthChecksHttpRequest, HealthCheckList, HealthCheck> context,
        ApiFuture<HealthCheckList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListHealthChecksFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListHealthChecksHttpRequest,
          HealthCheckList,
          HealthCheck,
          ListHealthChecksPage,
          ListHealthChecksFixedSizeCollection> {

    private ListHealthChecksFixedSizeCollection(
        List<ListHealthChecksPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListHealthChecksFixedSizeCollection createEmptyCollection() {
      return new ListHealthChecksFixedSizeCollection(null, 0);
    }

    @Override
    protected ListHealthChecksFixedSizeCollection createCollection(
        List<ListHealthChecksPage> pages, int collectionSize) {
      return new ListHealthChecksFixedSizeCollection(pages, collectionSize);
    }
  }
}
