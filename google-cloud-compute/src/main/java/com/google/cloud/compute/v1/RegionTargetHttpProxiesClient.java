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
import com.google.cloud.compute.v1.stub.RegionTargetHttpProxiesStub;
import com.google.cloud.compute.v1.stub.RegionTargetHttpProxiesStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The RegionTargetHttpProxies API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
 *     RegionTargetHttpProxiesClient.create()) {
 *   String project = "project-309310695";
 *   String region = "region-934795532";
 *   String targetHttpProxy = "targetHttpProxy-1944074187";
 *   Operation response = regionTargetHttpProxiesClient.delete(project, region, targetHttpProxy);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the RegionTargetHttpProxiesClient object to clean up
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
 * <p>This class can be customized by passing in a custom instance of
 * RegionTargetHttpProxiesSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * RegionTargetHttpProxiesSettings regionTargetHttpProxiesSettings =
 *     RegionTargetHttpProxiesSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
 *     RegionTargetHttpProxiesClient.create(regionTargetHttpProxiesSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * RegionTargetHttpProxiesSettings regionTargetHttpProxiesSettings =
 *     RegionTargetHttpProxiesSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
 *     RegionTargetHttpProxiesClient.create(regionTargetHttpProxiesSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class RegionTargetHttpProxiesClient implements BackgroundResource {
  private final RegionTargetHttpProxiesSettings settings;
  private final RegionTargetHttpProxiesStub stub;

  /** Constructs an instance of RegionTargetHttpProxiesClient with default settings. */
  public static final RegionTargetHttpProxiesClient create() throws IOException {
    return create(RegionTargetHttpProxiesSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RegionTargetHttpProxiesClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RegionTargetHttpProxiesClient create(RegionTargetHttpProxiesSettings settings)
      throws IOException {
    return new RegionTargetHttpProxiesClient(settings);
  }

  /**
   * Constructs an instance of RegionTargetHttpProxiesClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(RegionTargetHttpProxiesSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final RegionTargetHttpProxiesClient create(RegionTargetHttpProxiesStub stub) {
    return new RegionTargetHttpProxiesClient(stub);
  }

  /**
   * Constructs an instance of RegionTargetHttpProxiesClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected RegionTargetHttpProxiesClient(RegionTargetHttpProxiesSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((RegionTargetHttpProxiesStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected RegionTargetHttpProxiesClient(RegionTargetHttpProxiesStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionTargetHttpProxiesSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RegionTargetHttpProxiesStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified TargetHttpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String targetHttpProxy = "targetHttpProxy-1944074187";
   *   Operation response = regionTargetHttpProxiesClient.delete(project, region, targetHttpProxy);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region scoping this request.
   * @param targetHttpProxy Name of the TargetHttpProxy resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation delete(String project, String region, String targetHttpProxy) {
    DeleteRegionTargetHttpProxyRequest request =
        DeleteRegionTargetHttpProxyRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setTargetHttpProxy(targetHttpProxy)
            .build();
    return delete(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified TargetHttpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   DeleteRegionTargetHttpProxyRequest request =
   *       DeleteRegionTargetHttpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setTargetHttpProxy("targetHttpProxy-1944074187")
   *           .build();
   *   Operation response = regionTargetHttpProxiesClient.delete(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation delete(DeleteRegionTargetHttpProxyRequest request) {
    return deleteCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified TargetHttpProxy resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   DeleteRegionTargetHttpProxyRequest request =
   *       DeleteRegionTargetHttpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setTargetHttpProxy("targetHttpProxy-1944074187")
   *           .build();
   *   ApiFuture<Operation> future =
   *       regionTargetHttpProxiesClient.deleteCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteRegionTargetHttpProxyRequest, Operation> deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified TargetHttpProxy resource in the specified region. Gets a list of
   * available target HTTP proxies by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String targetHttpProxy = "targetHttpProxy-1944074187";
   *   TargetHttpProxy response =
   *       regionTargetHttpProxiesClient.get(project, region, targetHttpProxy);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region scoping this request.
   * @param targetHttpProxy Name of the TargetHttpProxy resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TargetHttpProxy get(String project, String region, String targetHttpProxy) {
    GetRegionTargetHttpProxyRequest request =
        GetRegionTargetHttpProxyRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setTargetHttpProxy(targetHttpProxy)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified TargetHttpProxy resource in the specified region. Gets a list of
   * available target HTTP proxies by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   GetRegionTargetHttpProxyRequest request =
   *       GetRegionTargetHttpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setTargetHttpProxy("targetHttpProxy-1944074187")
   *           .build();
   *   TargetHttpProxy response = regionTargetHttpProxiesClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TargetHttpProxy get(GetRegionTargetHttpProxyRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified TargetHttpProxy resource in the specified region. Gets a list of
   * available target HTTP proxies by making a list() request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   GetRegionTargetHttpProxyRequest request =
   *       GetRegionTargetHttpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setTargetHttpProxy("targetHttpProxy-1944074187")
   *           .build();
   *   ApiFuture<TargetHttpProxy> future =
   *       regionTargetHttpProxiesClient.getCallable().futureCall(request);
   *   // Do something.
   *   TargetHttpProxy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetRegionTargetHttpProxyRequest, TargetHttpProxy> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a TargetHttpProxy resource in the specified project and region using the data included
   * in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   TargetHttpProxy targetHttpProxyResource = TargetHttpProxy.newBuilder().build();
   *   Operation response =
   *       regionTargetHttpProxiesClient.insert(project, region, targetHttpProxyResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region scoping this request.
   * @param targetHttpProxyResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation insert(
      String project, String region, TargetHttpProxy targetHttpProxyResource) {
    InsertRegionTargetHttpProxyRequest request =
        InsertRegionTargetHttpProxyRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setTargetHttpProxyResource(targetHttpProxyResource)
            .build();
    return insert(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a TargetHttpProxy resource in the specified project and region using the data included
   * in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   InsertRegionTargetHttpProxyRequest request =
   *       InsertRegionTargetHttpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setTargetHttpProxyResource(TargetHttpProxy.newBuilder().build())
   *           .build();
   *   Operation response = regionTargetHttpProxiesClient.insert(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation insert(InsertRegionTargetHttpProxyRequest request) {
    return insertCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a TargetHttpProxy resource in the specified project and region using the data included
   * in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   InsertRegionTargetHttpProxyRequest request =
   *       InsertRegionTargetHttpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setTargetHttpProxyResource(TargetHttpProxy.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       regionTargetHttpProxiesClient.insertCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InsertRegionTargetHttpProxyRequest, Operation> insertCallable() {
    return stub.insertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project in the
   * specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   for (TargetHttpProxy element :
   *       regionTargetHttpProxiesClient.list(project, region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project, String region) {
    ListRegionTargetHttpProxiesRequest request =
        ListRegionTargetHttpProxiesRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project in the
   * specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   ListRegionTargetHttpProxiesRequest request =
   *       ListRegionTargetHttpProxiesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (TargetHttpProxy element : regionTargetHttpProxiesClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListRegionTargetHttpProxiesRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project in the
   * specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   ListRegionTargetHttpProxiesRequest request =
   *       ListRegionTargetHttpProxiesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<TargetHttpProxy> future =
   *       regionTargetHttpProxiesClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (TargetHttpProxy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRegionTargetHttpProxiesRequest, ListPagedResponse>
      listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the list of TargetHttpProxy resources available to the specified project in the
   * specified region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   ListRegionTargetHttpProxiesRequest request =
   *       ListRegionTargetHttpProxiesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     TargetHttpProxyList response = regionTargetHttpProxiesClient.listCallable().call(request);
   *     for (TargetHttpProxy element : response.getResponsesList()) {
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
  public final UnaryCallable<ListRegionTargetHttpProxiesRequest, TargetHttpProxyList>
      listCallable() {
    return stub.listCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Changes the URL map for TargetHttpProxy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String targetHttpProxy = "targetHttpProxy-1944074187";
   *   UrlMapReference urlMapReferenceResource = UrlMapReference.newBuilder().build();
   *   Operation response =
   *       regionTargetHttpProxiesClient.setUrlMap(
   *           project, region, targetHttpProxy, urlMapReferenceResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region scoping this request.
   * @param targetHttpProxy Name of the TargetHttpProxy to set a URL map for.
   * @param urlMapReferenceResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation setUrlMap(
      String project,
      String region,
      String targetHttpProxy,
      UrlMapReference urlMapReferenceResource) {
    SetUrlMapRegionTargetHttpProxyRequest request =
        SetUrlMapRegionTargetHttpProxyRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setTargetHttpProxy(targetHttpProxy)
            .setUrlMapReferenceResource(urlMapReferenceResource)
            .build();
    return setUrlMap(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Changes the URL map for TargetHttpProxy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   SetUrlMapRegionTargetHttpProxyRequest request =
   *       SetUrlMapRegionTargetHttpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setTargetHttpProxy("targetHttpProxy-1944074187")
   *           .setUrlMapReferenceResource(UrlMapReference.newBuilder().build())
   *           .build();
   *   Operation response = regionTargetHttpProxiesClient.setUrlMap(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation setUrlMap(SetUrlMapRegionTargetHttpProxyRequest request) {
    return setUrlMapCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Changes the URL map for TargetHttpProxy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (RegionTargetHttpProxiesClient regionTargetHttpProxiesClient =
   *     RegionTargetHttpProxiesClient.create()) {
   *   SetUrlMapRegionTargetHttpProxyRequest request =
   *       SetUrlMapRegionTargetHttpProxyRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setTargetHttpProxy("targetHttpProxy-1944074187")
   *           .setUrlMapReferenceResource(UrlMapReference.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       regionTargetHttpProxiesClient.setUrlMapCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetUrlMapRegionTargetHttpProxyRequest, Operation> setUrlMapCallable() {
    return stub.setUrlMapCallable();
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
          ListRegionTargetHttpProxiesRequest,
          TargetHttpProxyList,
          TargetHttpProxy,
          ListPage,
          ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<ListRegionTargetHttpProxiesRequest, TargetHttpProxyList, TargetHttpProxy>
            context,
        ApiFuture<TargetHttpProxyList> futureResponse) {
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
          ListRegionTargetHttpProxiesRequest, TargetHttpProxyList, TargetHttpProxy, ListPage> {

    private ListPage(
        PageContext<ListRegionTargetHttpProxiesRequest, TargetHttpProxyList, TargetHttpProxy>
            context,
        TargetHttpProxyList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<ListRegionTargetHttpProxiesRequest, TargetHttpProxyList, TargetHttpProxy>
            context,
        TargetHttpProxyList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<ListRegionTargetHttpProxiesRequest, TargetHttpProxyList, TargetHttpProxy>
            context,
        ApiFuture<TargetHttpProxyList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRegionTargetHttpProxiesRequest,
          TargetHttpProxyList,
          TargetHttpProxy,
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
