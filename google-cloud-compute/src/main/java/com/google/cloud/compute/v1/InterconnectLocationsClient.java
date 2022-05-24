/*
 * Copyright 2022 Google LLC
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
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.InterconnectLocationsStub;
import com.google.cloud.compute.v1.stub.InterconnectLocationsStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The InterconnectLocations API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (InterconnectLocationsClient interconnectLocationsClient =
 *     InterconnectLocationsClient.create()) {
 *   String project = "project-309310695";
 *   String interconnectLocation = "interconnectLocation220117603";
 *   InterconnectLocation response =
 *       interconnectLocationsClient.get(project, interconnectLocation);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the InterconnectLocationsClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
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
 * <p>This class can be customized by passing in a custom instance of InterconnectLocationsSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * InterconnectLocationsSettings interconnectLocationsSettings =
 *     InterconnectLocationsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * InterconnectLocationsClient interconnectLocationsClient =
 *     InterconnectLocationsClient.create(interconnectLocationsSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * InterconnectLocationsSettings interconnectLocationsSettings =
 *     InterconnectLocationsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * InterconnectLocationsClient interconnectLocationsClient =
 *     InterconnectLocationsClient.create(interconnectLocationsSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class InterconnectLocationsClient implements BackgroundResource {
  private final InterconnectLocationsSettings settings;
  private final InterconnectLocationsStub stub;

  /** Constructs an instance of InterconnectLocationsClient with default settings. */
  public static final InterconnectLocationsClient create() throws IOException {
    return create(InterconnectLocationsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of InterconnectLocationsClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final InterconnectLocationsClient create(InterconnectLocationsSettings settings)
      throws IOException {
    return new InterconnectLocationsClient(settings);
  }

  /**
   * Constructs an instance of InterconnectLocationsClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(InterconnectLocationsSettings).
   */
  public static final InterconnectLocationsClient create(InterconnectLocationsStub stub) {
    return new InterconnectLocationsClient(stub);
  }

  /**
   * Constructs an instance of InterconnectLocationsClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected InterconnectLocationsClient(InterconnectLocationsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((InterconnectLocationsStubSettings) settings.getStubSettings()).createStub();
  }

  protected InterconnectLocationsClient(InterconnectLocationsStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final InterconnectLocationsSettings getSettings() {
    return settings;
  }

  public InterconnectLocationsStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the details for the specified interconnect location. Gets a list of available
   * interconnect locations by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (InterconnectLocationsClient interconnectLocationsClient =
   *     InterconnectLocationsClient.create()) {
   *   String project = "project-309310695";
   *   String interconnectLocation = "interconnectLocation220117603";
   *   InterconnectLocation response =
   *       interconnectLocationsClient.get(project, interconnectLocation);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param interconnectLocation Name of the interconnect location to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InterconnectLocation get(String project, String interconnectLocation) {
    GetInterconnectLocationRequest request =
        GetInterconnectLocationRequest.newBuilder()
            .setProject(project)
            .setInterconnectLocation(interconnectLocation)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the details for the specified interconnect location. Gets a list of available
   * interconnect locations by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (InterconnectLocationsClient interconnectLocationsClient =
   *     InterconnectLocationsClient.create()) {
   *   GetInterconnectLocationRequest request =
   *       GetInterconnectLocationRequest.newBuilder()
   *           .setInterconnectLocation("interconnectLocation220117603")
   *           .setProject("project-309310695")
   *           .build();
   *   InterconnectLocation response = interconnectLocationsClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InterconnectLocation get(GetInterconnectLocationRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the details for the specified interconnect location. Gets a list of available
   * interconnect locations by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (InterconnectLocationsClient interconnectLocationsClient =
   *     InterconnectLocationsClient.create()) {
   *   GetInterconnectLocationRequest request =
   *       GetInterconnectLocationRequest.newBuilder()
   *           .setInterconnectLocation("interconnectLocation220117603")
   *           .setProject("project-309310695")
   *           .build();
   *   ApiFuture<InterconnectLocation> future =
   *       interconnectLocationsClient.getCallable().futureCall(request);
   *   // Do something.
   *   InterconnectLocation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetInterconnectLocationRequest, InterconnectLocation> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of interconnect locations available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (InterconnectLocationsClient interconnectLocationsClient =
   *     InterconnectLocationsClient.create()) {
   *   String project = "project-309310695";
   *   for (InterconnectLocation element : interconnectLocationsClient.list(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project) {
    ListInterconnectLocationsRequest request =
        ListInterconnectLocationsRequest.newBuilder().setProject(project).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of interconnect locations available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (InterconnectLocationsClient interconnectLocationsClient =
   *     InterconnectLocationsClient.create()) {
   *   ListInterconnectLocationsRequest request =
   *       ListInterconnectLocationsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (InterconnectLocation element : interconnectLocationsClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListInterconnectLocationsRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of interconnect locations available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (InterconnectLocationsClient interconnectLocationsClient =
   *     InterconnectLocationsClient.create()) {
   *   ListInterconnectLocationsRequest request =
   *       ListInterconnectLocationsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<InterconnectLocation> future =
   *       interconnectLocationsClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (InterconnectLocation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListInterconnectLocationsRequest, ListPagedResponse>
      listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of interconnect locations available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated for illustrative purposes only.
   * // It may require modifications to work in your environment.
   * try (InterconnectLocationsClient interconnectLocationsClient =
   *     InterconnectLocationsClient.create()) {
   *   ListInterconnectLocationsRequest request =
   *       ListInterconnectLocationsRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     InterconnectLocationList response =
   *         interconnectLocationsClient.listCallable().call(request);
   *     for (InterconnectLocation element : response.getResponsesList()) {
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
  public final UnaryCallable<ListInterconnectLocationsRequest, InterconnectLocationList>
      listCallable() {
    return stub.listCallable();
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
          ListInterconnectLocationsRequest,
          InterconnectLocationList,
          InterconnectLocation,
          ListPage,
          ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<
                ListInterconnectLocationsRequest, InterconnectLocationList, InterconnectLocation>
            context,
        ApiFuture<InterconnectLocationList> futureResponse) {
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
          ListInterconnectLocationsRequest,
          InterconnectLocationList,
          InterconnectLocation,
          ListPage> {

    private ListPage(
        PageContext<
                ListInterconnectLocationsRequest, InterconnectLocationList, InterconnectLocation>
            context,
        InterconnectLocationList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<
                ListInterconnectLocationsRequest, InterconnectLocationList, InterconnectLocation>
            context,
        InterconnectLocationList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<
                ListInterconnectLocationsRequest, InterconnectLocationList, InterconnectLocation>
            context,
        ApiFuture<InterconnectLocationList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListInterconnectLocationsRequest,
          InterconnectLocationList,
          InterconnectLocation,
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
