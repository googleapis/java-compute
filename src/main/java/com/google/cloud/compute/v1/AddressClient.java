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
import com.google.cloud.compute.v1.stub.AddressStub;
import com.google.cloud.compute.v1.stub.AddressStubSettings;
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
 * try (AddressClient addressClient = AddressClient.create()) {
 *   ProjectRegionAddressName address = ProjectRegionAddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
 *   Operation response = addressClient.deleteAddress(address);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the addressClient object to clean up resources such as
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
 * <p>This class can be customized by passing in a custom instance of AddressSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * AddressSettings addressSettings =
 *     AddressSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AddressClient addressClient =
 *     AddressClient.create(addressSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * AddressSettings addressSettings =
 *     AddressSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AddressClient addressClient =
 *     AddressClient.create(addressSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AddressClient implements BackgroundResource {
  private final AddressSettings settings;
  private final AddressStub stub;

  /** Constructs an instance of AddressClient with default settings. */
  public static final AddressClient create() throws IOException {
    return create(AddressSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AddressClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AddressClient create(AddressSettings settings) throws IOException {
    return new AddressClient(settings);
  }

  /**
   * Constructs an instance of AddressClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use AddressSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final AddressClient create(AddressStub stub) {
    return new AddressClient(stub);
  }

  /**
   * Constructs an instance of AddressClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected AddressClient(AddressSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AddressStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected AddressClient(AddressStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AddressSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AddressStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of addresses.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   Boolean includeAllScopes = false;
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (AddressesScopedList element : addressClient.aggregatedListAddresses(includeAllScopes, project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param includeAllScopes Indicates whether every visible scope for each scope type (zone,
   *     region, global) should be included in the response. For new resource types added after this
   *     field, the flag has no effect as new resource types will always include every visible scope
   *     for each scope type in response. For resource types which predate this field, if this flag
   *     is omitted or false, only scopes of the scope types where the resource type is expected to
   *     be found will be included.
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListAddressesPagedResponse aggregatedListAddresses(
      Boolean includeAllScopes, ProjectName project) {
    AggregatedListAddressesHttpRequest request =
        AggregatedListAddressesHttpRequest.newBuilder()
            .setIncludeAllScopes(includeAllScopes)
            .setProject(project == null ? null : project.toString())
            .build();
    return aggregatedListAddresses(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of addresses.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   Boolean includeAllScopes = false;
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   for (AddressesScopedList element : addressClient.aggregatedListAddresses(includeAllScopes, project.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param includeAllScopes Indicates whether every visible scope for each scope type (zone,
   *     region, global) should be included in the response. For new resource types added after this
   *     field, the flag has no effect as new resource types will always include every visible scope
   *     for each scope type in response. For resource types which predate this field, if this flag
   *     is omitted or false, only scopes of the scope types where the resource type is expected to
   *     be found will be included.
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListAddressesPagedResponse aggregatedListAddresses(
      Boolean includeAllScopes, String project) {
    AggregatedListAddressesHttpRequest request =
        AggregatedListAddressesHttpRequest.newBuilder()
            .setIncludeAllScopes(includeAllScopes)
            .setProject(project)
            .build();
    return aggregatedListAddresses(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of addresses.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   Boolean includeAllScopes = false;
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   AggregatedListAddressesHttpRequest request = AggregatedListAddressesHttpRequest.newBuilder()
   *     .setIncludeAllScopes(includeAllScopes)
   *     .setProject(formattedProject)
   *     .build();
   *   for (AddressesScopedList element : addressClient.aggregatedListAddresses(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final AggregatedListAddressesPagedResponse aggregatedListAddresses(
      AggregatedListAddressesHttpRequest request) {
    return aggregatedListAddressesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of addresses.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   Boolean includeAllScopes = false;
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   AggregatedListAddressesHttpRequest request = AggregatedListAddressesHttpRequest.newBuilder()
   *     .setIncludeAllScopes(includeAllScopes)
   *     .setProject(formattedProject)
   *     .build();
   *   ApiFuture&lt;AggregatedListAddressesPagedResponse&gt; future = addressClient.aggregatedListAddressesPagedCallable().futureCall(request);
   *   // Do something
   *   for (AddressesScopedList element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<
          AggregatedListAddressesHttpRequest, AggregatedListAddressesPagedResponse>
      aggregatedListAddressesPagedCallable() {
    return stub.aggregatedListAddressesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves an aggregated list of addresses.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   Boolean includeAllScopes = false;
   *   String formattedProject = ProjectName.format("[PROJECT]");
   *   AggregatedListAddressesHttpRequest request = AggregatedListAddressesHttpRequest.newBuilder()
   *     .setIncludeAllScopes(includeAllScopes)
   *     .setProject(formattedProject)
   *     .build();
   *   while (true) {
   *     AddressAggregatedList response = addressClient.aggregatedListAddressesCallable().call(request);
   *     for (AddressesScopedList element : response.getItemsMap()) {
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
  public final UnaryCallable<AggregatedListAddressesHttpRequest, AddressAggregatedList>
      aggregatedListAddressesCallable() {
    return stub.aggregatedListAddressesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectRegionAddressName address = ProjectRegionAddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   Operation response = addressClient.deleteAddress(address);
   * }
   * </code></pre>
   *
   * @param address Name of the address resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAddress(ProjectRegionAddressName address) {
    DeleteAddressHttpRequest request =
        DeleteAddressHttpRequest.newBuilder()
            .setAddress(address == null ? null : address.toString())
            .build();
    return deleteAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectRegionAddressName address = ProjectRegionAddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   Operation response = addressClient.deleteAddress(address.toString());
   * }
   * </code></pre>
   *
   * @param address Name of the address resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAddress(String address) {
    DeleteAddressHttpRequest request =
        DeleteAddressHttpRequest.newBuilder().setAddress(address).build();
    return deleteAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String formattedAddress = ProjectRegionAddressName.format("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   DeleteAddressHttpRequest request = DeleteAddressHttpRequest.newBuilder()
   *     .setAddress(formattedAddress)
   *     .build();
   *   Operation response = addressClient.deleteAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation deleteAddress(DeleteAddressHttpRequest request) {
    return deleteAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified address resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String formattedAddress = ProjectRegionAddressName.format("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   DeleteAddressHttpRequest request = DeleteAddressHttpRequest.newBuilder()
   *     .setAddress(formattedAddress)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = addressClient.deleteAddressCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<DeleteAddressHttpRequest, Operation> deleteAddressCallable() {
    return stub.deleteAddressCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectRegionAddressName address = ProjectRegionAddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   Address response = addressClient.getAddress(address);
   * }
   * </code></pre>
   *
   * @param address Name of the address resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Address getAddress(ProjectRegionAddressName address) {
    GetAddressHttpRequest request =
        GetAddressHttpRequest.newBuilder()
            .setAddress(address == null ? null : address.toString())
            .build();
    return getAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectRegionAddressName address = ProjectRegionAddressName.of("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   Address response = addressClient.getAddress(address.toString());
   * }
   * </code></pre>
   *
   * @param address Name of the address resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Address getAddress(String address) {
    GetAddressHttpRequest request = GetAddressHttpRequest.newBuilder().setAddress(address).build();
    return getAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String formattedAddress = ProjectRegionAddressName.format("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   GetAddressHttpRequest request = GetAddressHttpRequest.newBuilder()
   *     .setAddress(formattedAddress)
   *     .build();
   *   Address response = addressClient.getAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Address getAddress(GetAddressHttpRequest request) {
    return getAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified address resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String formattedAddress = ProjectRegionAddressName.format("[PROJECT]", "[REGION]", "[ADDRESS]");
   *   GetAddressHttpRequest request = GetAddressHttpRequest.newBuilder()
   *     .setAddress(formattedAddress)
   *     .build();
   *   ApiFuture&lt;Address&gt; future = addressClient.getAddressCallable().futureCall(request);
   *   // Do something
   *   Address response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<GetAddressHttpRequest, Address> getAddressCallable() {
    return stub.getAddressCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project by using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   Address addressResource = Address.newBuilder().build();
   *   Operation response = addressClient.insertAddress(region, addressResource);
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @param addressResource Use global external addresses for GFE-based external HTTP(S) load
   *     balancers in Premium Tier.
   *     <p>Use global internal addresses for reserved peering network range.
   *     <p>Use regional external addresses for the following resources:
   *     <p>- External IP addresses for VM instances - Regional external forwarding rules - Cloud
   *     NAT external IP addresses - GFE based LBs in Standard Tier - Network LBs in Premium or
   *     Standard Tier - Cloud VPN gateways (both Classic and HA)
   *     <p>Use regional internal IP addresses for subnet IP ranges (primary and secondary). This
   *     includes:
   *     <p>- Internal IP addresses for VM instances - Alias IP ranges of VM instances (/32 only) -
   *     Regional internal forwarding rules - Internal TCP/UDP load balancer addresses - Internal
   *     HTTP(S) load balancer addresses - Cloud DNS inbound forwarding IP addresses
   *     <p>For more information, read reserved IP address.
   *     <p>(== resource_for {$api_version}.addresses ==) (== resource_for
   *     {$api_version}.globalAddresses ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertAddress(ProjectRegionName region, Address addressResource) {
    InsertAddressHttpRequest request =
        InsertAddressHttpRequest.newBuilder()
            .setRegion(region == null ? null : region.toString())
            .setAddressResource(addressResource)
            .build();
    return insertAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project by using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   Address addressResource = Address.newBuilder().build();
   *   Operation response = addressClient.insertAddress(region.toString(), addressResource);
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @param addressResource Use global external addresses for GFE-based external HTTP(S) load
   *     balancers in Premium Tier.
   *     <p>Use global internal addresses for reserved peering network range.
   *     <p>Use regional external addresses for the following resources:
   *     <p>- External IP addresses for VM instances - Regional external forwarding rules - Cloud
   *     NAT external IP addresses - GFE based LBs in Standard Tier - Network LBs in Premium or
   *     Standard Tier - Cloud VPN gateways (both Classic and HA)
   *     <p>Use regional internal IP addresses for subnet IP ranges (primary and secondary). This
   *     includes:
   *     <p>- Internal IP addresses for VM instances - Alias IP ranges of VM instances (/32 only) -
   *     Regional internal forwarding rules - Internal TCP/UDP load balancer addresses - Internal
   *     HTTP(S) load balancer addresses - Cloud DNS inbound forwarding IP addresses
   *     <p>For more information, read reserved IP address.
   *     <p>(== resource_for {$api_version}.addresses ==) (== resource_for
   *     {$api_version}.globalAddresses ==)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertAddress(String region, Address addressResource) {
    InsertAddressHttpRequest request =
        InsertAddressHttpRequest.newBuilder()
            .setRegion(region)
            .setAddressResource(addressResource)
            .build();
    return insertAddress(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project by using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String formattedRegion = ProjectRegionName.format("[PROJECT]", "[REGION]");
   *   Address addressResource = Address.newBuilder().build();
   *   InsertAddressHttpRequest request = InsertAddressHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .setAddressResource(addressResource)
   *     .build();
   *   Operation response = addressClient.insertAddress(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final Operation insertAddress(InsertAddressHttpRequest request) {
    return insertAddressCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an address resource in the specified project by using the data included in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String formattedRegion = ProjectRegionName.format("[PROJECT]", "[REGION]");
   *   Address addressResource = Address.newBuilder().build();
   *   InsertAddressHttpRequest request = InsertAddressHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .setAddressResource(addressResource)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = addressClient.insertAddressCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<InsertAddressHttpRequest, Operation> insertAddressCallable() {
    return stub.insertAddressCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of addresses contained within the specified region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   for (Address element : addressClient.listAddresses(region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListAddressesPagedResponse listAddresses(ProjectRegionName region) {
    ListAddressesHttpRequest request =
        ListAddressesHttpRequest.newBuilder()
            .setRegion(region == null ? null : region.toString())
            .build();
    return listAddresses(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of addresses contained within the specified region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   ProjectRegionName region = ProjectRegionName.of("[PROJECT]", "[REGION]");
   *   for (Address element : addressClient.listAddresses(region.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListAddressesPagedResponse listAddresses(String region) {
    ListAddressesHttpRequest request =
        ListAddressesHttpRequest.newBuilder().setRegion(region).build();
    return listAddresses(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of addresses contained within the specified region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String formattedRegion = ProjectRegionName.format("[PROJECT]", "[REGION]");
   *   ListAddressesHttpRequest request = ListAddressesHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .build();
   *   for (Address element : addressClient.listAddresses(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi
  public final ListAddressesPagedResponse listAddresses(ListAddressesHttpRequest request) {
    return listAddressesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of addresses contained within the specified region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String formattedRegion = ProjectRegionName.format("[PROJECT]", "[REGION]");
   *   ListAddressesHttpRequest request = ListAddressesHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .build();
   *   ApiFuture&lt;ListAddressesPagedResponse&gt; future = addressClient.listAddressesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Address element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  @BetaApi
  public final UnaryCallable<ListAddressesHttpRequest, ListAddressesPagedResponse>
      listAddressesPagedCallable() {
    return stub.listAddressesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves a list of addresses contained within the specified region.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (AddressClient addressClient = AddressClient.create()) {
   *   String formattedRegion = ProjectRegionName.format("[PROJECT]", "[REGION]");
   *   ListAddressesHttpRequest request = ListAddressesHttpRequest.newBuilder()
   *     .setRegion(formattedRegion)
   *     .build();
   *   while (true) {
   *     AddressList response = addressClient.listAddressesCallable().call(request);
   *     for (Address element : response.getItemsList()) {
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
  public final UnaryCallable<ListAddressesHttpRequest, AddressList> listAddressesCallable() {
    return stub.listAddressesCallable();
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

  public static class AggregatedListAddressesPagedResponse
      extends AbstractPagedListResponse<
          AggregatedListAddressesHttpRequest,
          AddressAggregatedList,
          AddressesScopedList,
          AggregatedListAddressesPage,
          AggregatedListAddressesFixedSizeCollection> {

    public static ApiFuture<AggregatedListAddressesPagedResponse> createAsync(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, AddressesScopedList>
            context,
        ApiFuture<AddressAggregatedList> futureResponse) {
      ApiFuture<AggregatedListAddressesPage> futurePage =
          AggregatedListAddressesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<AggregatedListAddressesPage, AggregatedListAddressesPagedResponse>() {
            @Override
            public AggregatedListAddressesPagedResponse apply(AggregatedListAddressesPage input) {
              return new AggregatedListAddressesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private AggregatedListAddressesPagedResponse(AggregatedListAddressesPage page) {
      super(page, AggregatedListAddressesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class AggregatedListAddressesPage
      extends AbstractPage<
          AggregatedListAddressesHttpRequest,
          AddressAggregatedList,
          AddressesScopedList,
          AggregatedListAddressesPage> {

    private AggregatedListAddressesPage(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, AddressesScopedList>
            context,
        AddressAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListAddressesPage createEmptyPage() {
      return new AggregatedListAddressesPage(null, null);
    }

    @Override
    protected AggregatedListAddressesPage createPage(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, AddressesScopedList>
            context,
        AddressAggregatedList response) {
      return new AggregatedListAddressesPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListAddressesPage> createPageAsync(
        PageContext<AggregatedListAddressesHttpRequest, AddressAggregatedList, AddressesScopedList>
            context,
        ApiFuture<AddressAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class AggregatedListAddressesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          AggregatedListAddressesHttpRequest,
          AddressAggregatedList,
          AddressesScopedList,
          AggregatedListAddressesPage,
          AggregatedListAddressesFixedSizeCollection> {

    private AggregatedListAddressesFixedSizeCollection(
        List<AggregatedListAddressesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListAddressesFixedSizeCollection createEmptyCollection() {
      return new AggregatedListAddressesFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListAddressesFixedSizeCollection createCollection(
        List<AggregatedListAddressesPage> pages, int collectionSize) {
      return new AggregatedListAddressesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListAddressesPagedResponse
      extends AbstractPagedListResponse<
          ListAddressesHttpRequest,
          AddressList,
          Address,
          ListAddressesPage,
          ListAddressesFixedSizeCollection> {

    public static ApiFuture<ListAddressesPagedResponse> createAsync(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context,
        ApiFuture<AddressList> futureResponse) {
      ApiFuture<ListAddressesPage> futurePage =
          ListAddressesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListAddressesPage, ListAddressesPagedResponse>() {
            @Override
            public ListAddressesPagedResponse apply(ListAddressesPage input) {
              return new ListAddressesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListAddressesPagedResponse(ListAddressesPage page) {
      super(page, ListAddressesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAddressesPage
      extends AbstractPage<ListAddressesHttpRequest, AddressList, Address, ListAddressesPage> {

    private ListAddressesPage(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context, AddressList response) {
      super(context, response);
    }

    private static ListAddressesPage createEmptyPage() {
      return new ListAddressesPage(null, null);
    }

    @Override
    protected ListAddressesPage createPage(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context, AddressList response) {
      return new ListAddressesPage(context, response);
    }

    @Override
    public ApiFuture<ListAddressesPage> createPageAsync(
        PageContext<ListAddressesHttpRequest, AddressList, Address> context,
        ApiFuture<AddressList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAddressesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAddressesHttpRequest,
          AddressList,
          Address,
          ListAddressesPage,
          ListAddressesFixedSizeCollection> {

    private ListAddressesFixedSizeCollection(List<ListAddressesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAddressesFixedSizeCollection createEmptyCollection() {
      return new ListAddressesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAddressesFixedSizeCollection createCollection(
        List<ListAddressesPage> pages, int collectionSize) {
      return new ListAddressesFixedSizeCollection(pages, collectionSize);
    }
  }
}
