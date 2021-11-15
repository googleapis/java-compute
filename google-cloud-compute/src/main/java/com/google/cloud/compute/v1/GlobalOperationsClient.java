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
import com.google.cloud.compute.v1.stub.GlobalOperationsStub;
import com.google.cloud.compute.v1.stub.GlobalOperationsStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The GlobalOperations API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
 *   String project = "project-309310695";
 *   String operation = "operation1662702951";
 *   DeleteGlobalOperationResponse response = globalOperationsClient.delete(project, operation);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the GlobalOperationsClient object to clean up resources
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
 * <p>This class can be customized by passing in a custom instance of GlobalOperationsSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * GlobalOperationsSettings globalOperationsSettings =
 *     GlobalOperationsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GlobalOperationsClient globalOperationsClient =
 *     GlobalOperationsClient.create(globalOperationsSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * GlobalOperationsSettings globalOperationsSettings =
 *     GlobalOperationsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * GlobalOperationsClient globalOperationsClient =
 *     GlobalOperationsClient.create(globalOperationsSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class GlobalOperationsClient implements BackgroundResource {
  private final GlobalOperationsSettings settings;
  private final GlobalOperationsStub stub;

  /** Constructs an instance of GlobalOperationsClient with default settings. */
  public static final GlobalOperationsClient create() throws IOException {
    return create(GlobalOperationsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of GlobalOperationsClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final GlobalOperationsClient create(GlobalOperationsSettings settings)
      throws IOException {
    return new GlobalOperationsClient(settings);
  }

  /**
   * Constructs an instance of GlobalOperationsClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(GlobalOperationsSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final GlobalOperationsClient create(GlobalOperationsStub stub) {
    return new GlobalOperationsClient(stub);
  }

  /**
   * Constructs an instance of GlobalOperationsClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GlobalOperationsClient(GlobalOperationsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((GlobalOperationsStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected GlobalOperationsClient(GlobalOperationsStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GlobalOperationsSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public GlobalOperationsStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an aggregated list of all operations.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   String project = "project-309310695";
   *   for (Map.Entry<String, OperationsScopedList> element :
   *       globalOperationsClient.aggregatedList(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AggregatedListPagedResponse aggregatedList(String project) {
    AggregatedListGlobalOperationsRequest request =
        AggregatedListGlobalOperationsRequest.newBuilder().setProject(project).build();
    return aggregatedList(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an aggregated list of all operations.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   AggregatedListGlobalOperationsRequest request =
   *       AggregatedListGlobalOperationsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setIncludeAllScopes(true)
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (Map.Entry<String, OperationsScopedList> element :
   *       globalOperationsClient.aggregatedList(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AggregatedListPagedResponse aggregatedList(
      AggregatedListGlobalOperationsRequest request) {
    return aggregatedListPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an aggregated list of all operations.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   AggregatedListGlobalOperationsRequest request =
   *       AggregatedListGlobalOperationsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setIncludeAllScopes(true)
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<Map.Entry<String, OperationsScopedList>> future =
   *       globalOperationsClient.aggregatedListPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Map.Entry<String, OperationsScopedList> element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<AggregatedListGlobalOperationsRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    return stub.aggregatedListPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an aggregated list of all operations.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   AggregatedListGlobalOperationsRequest request =
   *       AggregatedListGlobalOperationsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setIncludeAllScopes(true)
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     OperationAggregatedList response =
   *         globalOperationsClient.aggregatedListCallable().call(request);
   *     for (Map.Entry<String, OperationsScopedList> element : response.getResponsesList()) {
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
  public final UnaryCallable<AggregatedListGlobalOperationsRequest, OperationAggregatedList>
      aggregatedListCallable() {
    return stub.aggregatedListCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Operations resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   String project = "project-309310695";
   *   String operation = "operation1662702951";
   *   DeleteGlobalOperationResponse response = globalOperationsClient.delete(project, operation);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param operation Name of the Operations resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DeleteGlobalOperationResponse delete(String project, String operation) {
    DeleteGlobalOperationRequest request =
        DeleteGlobalOperationRequest.newBuilder()
            .setProject(project)
            .setOperation(operation)
            .build();
    return delete(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Operations resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   DeleteGlobalOperationRequest request =
   *       DeleteGlobalOperationRequest.newBuilder()
   *           .setOperation("operation1662702951")
   *           .setProject("project-309310695")
   *           .build();
   *   DeleteGlobalOperationResponse response = globalOperationsClient.delete(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DeleteGlobalOperationResponse delete(DeleteGlobalOperationRequest request) {
    return deleteCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Operations resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   DeleteGlobalOperationRequest request =
   *       DeleteGlobalOperationRequest.newBuilder()
   *           .setOperation("operation1662702951")
   *           .setProject("project-309310695")
   *           .build();
   *   ApiFuture<DeleteGlobalOperationResponse> future =
   *       globalOperationsClient.deleteCallable().futureCall(request);
   *   // Do something.
   *   DeleteGlobalOperationResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteGlobalOperationRequest, DeleteGlobalOperationResponse>
      deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified Operations resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   String project = "project-309310695";
   *   String operation = "operation1662702951";
   *   Operation response = globalOperationsClient.get(project, operation);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param operation Name of the Operations resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation get(String project, String operation) {
    GetGlobalOperationRequest request =
        GetGlobalOperationRequest.newBuilder().setProject(project).setOperation(operation).build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified Operations resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   GetGlobalOperationRequest request =
   *       GetGlobalOperationRequest.newBuilder()
   *           .setOperation("operation1662702951")
   *           .setProject("project-309310695")
   *           .build();
   *   Operation response = globalOperationsClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation get(GetGlobalOperationRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified Operations resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   GetGlobalOperationRequest request =
   *       GetGlobalOperationRequest.newBuilder()
   *           .setOperation("operation1662702951")
   *           .setProject("project-309310695")
   *           .build();
   *   ApiFuture<Operation> future = globalOperationsClient.getCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetGlobalOperationRequest, Operation> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of Operation resources contained within the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   String project = "project-309310695";
   *   for (Operation element : globalOperationsClient.list(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project) {
    ListGlobalOperationsRequest request =
        ListGlobalOperationsRequest.newBuilder().setProject(project).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of Operation resources contained within the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   ListGlobalOperationsRequest request =
   *       ListGlobalOperationsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (Operation element : globalOperationsClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListGlobalOperationsRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of Operation resources contained within the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   ListGlobalOperationsRequest request =
   *       ListGlobalOperationsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<Operation> future = globalOperationsClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Operation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListGlobalOperationsRequest, ListPagedResponse> listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of Operation resources contained within the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   ListGlobalOperationsRequest request =
   *       ListGlobalOperationsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     OperationList response = globalOperationsClient.listCallable().call(request);
   *     for (Operation element : response.getResponsesList()) {
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
  public final UnaryCallable<ListGlobalOperationsRequest, OperationList> listCallable() {
    return stub.listCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Waits for the specified Operation resource to return as `DONE` or for the request to approach
   * the 2 minute deadline, and retrieves the specified Operation resource. This method differs from
   * the `GET` method in that it waits for no more than the default deadline (2 minutes) and then
   * returns the current state of the operation, which might be `DONE` or still in progress. This
   * method is called on a best-effort basis. Specifically: - In uncommon cases, when the server is
   * overloaded, the request might return before the default deadline is reached, or might return
   * after zero seconds. - If the default deadline is reached, there is no guarantee that the
   * operation is actually done when the method returns. Be prepared to retry if the operation is
   * not `DONE`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   String project = "project-309310695";
   *   String operation = "operation1662702951";
   *   Operation response = globalOperationsClient.wait(project, operation);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param operation Name of the Operations resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation wait(String project, String operation) {
    WaitGlobalOperationRequest request =
        WaitGlobalOperationRequest.newBuilder().setProject(project).setOperation(operation).build();
    return wait(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Waits for the specified Operation resource to return as `DONE` or for the request to approach
   * the 2 minute deadline, and retrieves the specified Operation resource. This method differs from
   * the `GET` method in that it waits for no more than the default deadline (2 minutes) and then
   * returns the current state of the operation, which might be `DONE` or still in progress. This
   * method is called on a best-effort basis. Specifically: - In uncommon cases, when the server is
   * overloaded, the request might return before the default deadline is reached, or might return
   * after zero seconds. - If the default deadline is reached, there is no guarantee that the
   * operation is actually done when the method returns. Be prepared to retry if the operation is
   * not `DONE`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   WaitGlobalOperationRequest request =
   *       WaitGlobalOperationRequest.newBuilder()
   *           .setOperation("operation1662702951")
   *           .setProject("project-309310695")
   *           .build();
   *   Operation response = globalOperationsClient.wait(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation wait(WaitGlobalOperationRequest request) {
    return waitCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Waits for the specified Operation resource to return as `DONE` or for the request to approach
   * the 2 minute deadline, and retrieves the specified Operation resource. This method differs from
   * the `GET` method in that it waits for no more than the default deadline (2 minutes) and then
   * returns the current state of the operation, which might be `DONE` or still in progress. This
   * method is called on a best-effort basis. Specifically: - In uncommon cases, when the server is
   * overloaded, the request might return before the default deadline is reached, or might return
   * after zero seconds. - If the default deadline is reached, there is no guarantee that the
   * operation is actually done when the method returns. Be prepared to retry if the operation is
   * not `DONE`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GlobalOperationsClient globalOperationsClient = GlobalOperationsClient.create()) {
   *   WaitGlobalOperationRequest request =
   *       WaitGlobalOperationRequest.newBuilder()
   *           .setOperation("operation1662702951")
   *           .setProject("project-309310695")
   *           .build();
   *   ApiFuture<Operation> future = globalOperationsClient.waitCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<WaitGlobalOperationRequest, Operation> waitCallable() {
    return stub.waitCallable();
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

  public static class AggregatedListPagedResponse
      extends AbstractPagedListResponse<
          AggregatedListGlobalOperationsRequest,
          OperationAggregatedList,
          Map.Entry<String, OperationsScopedList>,
          AggregatedListPage,
          AggregatedListFixedSizeCollection> {

    public static ApiFuture<AggregatedListPagedResponse> createAsync(
        PageContext<
                AggregatedListGlobalOperationsRequest,
                OperationAggregatedList,
                Map.Entry<String, OperationsScopedList>>
            context,
        ApiFuture<OperationAggregatedList> futureResponse) {
      ApiFuture<AggregatedListPage> futurePage =
          AggregatedListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new AggregatedListPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private AggregatedListPagedResponse(AggregatedListPage page) {
      super(page, AggregatedListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class AggregatedListPage
      extends AbstractPage<
          AggregatedListGlobalOperationsRequest,
          OperationAggregatedList,
          Map.Entry<String, OperationsScopedList>,
          AggregatedListPage> {

    private AggregatedListPage(
        PageContext<
                AggregatedListGlobalOperationsRequest,
                OperationAggregatedList,
                Map.Entry<String, OperationsScopedList>>
            context,
        OperationAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListPage createEmptyPage() {
      return new AggregatedListPage(null, null);
    }

    @Override
    protected AggregatedListPage createPage(
        PageContext<
                AggregatedListGlobalOperationsRequest,
                OperationAggregatedList,
                Map.Entry<String, OperationsScopedList>>
            context,
        OperationAggregatedList response) {
      return new AggregatedListPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListPage> createPageAsync(
        PageContext<
                AggregatedListGlobalOperationsRequest,
                OperationAggregatedList,
                Map.Entry<String, OperationsScopedList>>
            context,
        ApiFuture<OperationAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class AggregatedListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          AggregatedListGlobalOperationsRequest,
          OperationAggregatedList,
          Map.Entry<String, OperationsScopedList>,
          AggregatedListPage,
          AggregatedListFixedSizeCollection> {

    private AggregatedListFixedSizeCollection(List<AggregatedListPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListFixedSizeCollection createEmptyCollection() {
      return new AggregatedListFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListFixedSizeCollection createCollection(
        List<AggregatedListPage> pages, int collectionSize) {
      return new AggregatedListFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListPagedResponse
      extends AbstractPagedListResponse<
          ListGlobalOperationsRequest,
          OperationList,
          Operation,
          ListPage,
          ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<ListGlobalOperationsRequest, OperationList, Operation> context,
        ApiFuture<OperationList> futureResponse) {
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
      extends AbstractPage<ListGlobalOperationsRequest, OperationList, Operation, ListPage> {

    private ListPage(
        PageContext<ListGlobalOperationsRequest, OperationList, Operation> context,
        OperationList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<ListGlobalOperationsRequest, OperationList, Operation> context,
        OperationList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<ListGlobalOperationsRequest, OperationList, Operation> context,
        ApiFuture<OperationList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListGlobalOperationsRequest,
          OperationList,
          Operation,
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
