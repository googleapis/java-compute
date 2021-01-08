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
import com.google.cloud.compute.v1.stub.LicensesStub;
import com.google.cloud.compute.v1.stub.LicensesStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: The Licenses API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (LicensesClient licensesClient = LicensesClient.create()) {
 *   String project = "";
 *   String license = "";
 *   Operation response = licensesClient.delete(project, license);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the licensesClient object to clean up resources such as
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
 * <p>This class can be customized by passing in a custom instance of LicensesSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * LicensesSettings licensesSettings =
 *     LicensesSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * LicensesClient licensesClient =
 *     LicensesClient.create(licensesSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * LicensesSettings licensesSettings =
 *     LicensesSettings.newBuilder().setEndpoint(myEndpoint).build();
 * LicensesClient licensesClient =
 *     LicensesClient.create(licensesSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class LicensesClient implements BackgroundResource {
  private final LicensesSettings settings;
  private final LicensesStub stub;

  /** Constructs an instance of LicensesClient with default settings. */
  public static final LicensesClient create() throws IOException {
    return create(LicensesSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of LicensesClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final LicensesClient create(LicensesSettings settings) throws IOException {
    return new LicensesClient(settings);
  }

  /**
   * Constructs an instance of LicensesClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use LicensesSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final LicensesClient create(LicensesStub stub) {
    return new LicensesClient(stub);
  }

  /**
   * Constructs an instance of LicensesClient, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected LicensesClient(LicensesSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((LicensesStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected LicensesClient(LicensesStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final LicensesSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public LicensesStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified license. Caution This resource is intended for use only by third-party
   * partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   String license = "";
   *   Operation response = licensesClient.delete(project, license);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param license Name of the license resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation delete(String project, String license) {
    DeleteLicenseRequest request =
        DeleteLicenseRequest.newBuilder().setProject(project).setLicense(license).build();
    return delete(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified license. Caution This resource is intended for use only by third-party
   * partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String license = "";
   *   String project = "";
   *   DeleteLicenseRequest request = DeleteLicenseRequest.newBuilder()
   *     .setLicense(license)
   *     .setProject(project)
   *     .build();
   *   Operation response = licensesClient.delete(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation delete(DeleteLicenseRequest request) {
    return deleteCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes the specified license. Caution This resource is intended for use only by third-party
   * partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String license = "";
   *   String project = "";
   *   DeleteLicenseRequest request = DeleteLicenseRequest.newBuilder()
   *     .setLicense(license)
   *     .setProject(project)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = licensesClient.deleteCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteLicenseRequest, Operation> deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified License resource. Caution This resource is intended for use only by
   * third-party partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   String license = "";
   *   License response = licensesClient.get(project, license);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param license Name of the License resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final License get(String project, String license) {
    GetLicenseRequest request =
        GetLicenseRequest.newBuilder().setProject(project).setLicense(license).build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified License resource. Caution This resource is intended for use only by
   * third-party partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String license = "";
   *   String project = "";
   *   GetLicenseRequest request = GetLicenseRequest.newBuilder()
   *     .setLicense(license)
   *     .setProject(project)
   *     .build();
   *   License response = licensesClient.get(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final License get(GetLicenseRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the specified License resource. Caution This resource is intended for use only by
   * third-party partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String license = "";
   *   String project = "";
   *   GetLicenseRequest request = GetLicenseRequest.newBuilder()
   *     .setLicense(license)
   *     .setProject(project)
   *     .build();
   *   ApiFuture&lt;License&gt; future = licensesClient.getCallable().futureCall(request);
   *   // Do something
   *   License response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetLicenseRequest, License> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists. Caution This resource is intended for use only by third-party partners who are creating
   * Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   String resource = "";
   *   Policy response = licensesClient.getIamPolicy(project, resource);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param resource Name or id of the resource for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(String project, String resource) {
    GetIamPolicyLicenseRequest request =
        GetIamPolicyLicenseRequest.newBuilder().setProject(project).setResource(resource).build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists. Caution This resource is intended for use only by third-party partners who are creating
   * Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   String resource = "";
   *   GetIamPolicyLicenseRequest request = GetIamPolicyLicenseRequest.newBuilder()
   *     .setProject(project)
   *     .setResource(resource)
   *     .build();
   *   Policy response = licensesClient.getIamPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyLicenseRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the access control policy for a resource. May be empty if no such policy or resource
   * exists. Caution This resource is intended for use only by third-party partners who are creating
   * Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   String resource = "";
   *   GetIamPolicyLicenseRequest request = GetIamPolicyLicenseRequest.newBuilder()
   *     .setProject(project)
   *     .setResource(resource)
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = licensesClient.getIamPolicyCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetIamPolicyLicenseRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a License resource in the specified project. Caution This resource is intended for use
   * only by third-party partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   License licenseResource = License.newBuilder().build();
   *   Operation response = licensesClient.insert(project, licenseResource);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param licenseResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation insert(String project, License licenseResource) {
    InsertLicenseRequest request =
        InsertLicenseRequest.newBuilder()
            .setProject(project)
            .setLicenseResource(licenseResource)
            .build();
    return insert(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a License resource in the specified project. Caution This resource is intended for use
   * only by third-party partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   License licenseResource = License.newBuilder().build();
   *   String project = "";
   *   InsertLicenseRequest request = InsertLicenseRequest.newBuilder()
   *     .setLicenseResource(licenseResource)
   *     .setProject(project)
   *     .build();
   *   Operation response = licensesClient.insert(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation insert(InsertLicenseRequest request) {
    return insertCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a License resource in the specified project. Caution This resource is intended for use
   * only by third-party partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   License licenseResource = License.newBuilder().build();
   *   String project = "";
   *   InsertLicenseRequest request = InsertLicenseRequest.newBuilder()
   *     .setLicenseResource(licenseResource)
   *     .setProject(project)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = licensesClient.insertCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<InsertLicenseRequest, Operation> insertCallable() {
    return stub.insertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of licenses available in the specified project. This method does not get any
   * licenses that belong to other projects, including licenses attached to publicly-available
   * images, like Debian 9. If you want to get a list of publicly-available licenses, use this
   * method to make a request to the respective image project, such as debian-cloud or
   * windows-cloud. Caution This resource is intended for use only by third-party partners who are
   * creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   for (License element : licensesClient.list(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project) {
    ListLicensesRequest request = ListLicensesRequest.newBuilder().setProject(project).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of licenses available in the specified project. This method does not get any
   * licenses that belong to other projects, including licenses attached to publicly-available
   * images, like Debian 9. If you want to get a list of publicly-available licenses, use this
   * method to make a request to the respective image project, such as debian-cloud or
   * windows-cloud. Caution This resource is intended for use only by third-party partners who are
   * creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   ListLicensesRequest request = ListLicensesRequest.newBuilder()
   *     .setProject(project)
   *     .build();
   *   for (License element : licensesClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListLicensesRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of licenses available in the specified project. This method does not get any
   * licenses that belong to other projects, including licenses attached to publicly-available
   * images, like Debian 9. If you want to get a list of publicly-available licenses, use this
   * method to make a request to the respective image project, such as debian-cloud or
   * windows-cloud. Caution This resource is intended for use only by third-party partners who are
   * creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   ListLicensesRequest request = ListLicensesRequest.newBuilder()
   *     .setProject(project)
   *     .build();
   *   ApiFuture&lt;ListPagedResponse&gt; future = licensesClient.listPagedCallable().futureCall(request);
   *   // Do something
   *   for (License element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListLicensesRequest, ListPagedResponse> listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the list of licenses available in the specified project. This method does not get any
   * licenses that belong to other projects, including licenses attached to publicly-available
   * images, like Debian 9. If you want to get a list of publicly-available licenses, use this
   * method to make a request to the respective image project, such as debian-cloud or
   * windows-cloud. Caution This resource is intended for use only by third-party partners who are
   * creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   ListLicensesRequest request = ListLicensesRequest.newBuilder()
   *     .setProject(project)
   *     .build();
   *   while (true) {
   *     LicensesListResponse response = licensesClient.listCallable().call(request);
   *     for (License element : response.getItemsList()) {
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
  public final UnaryCallable<ListLicensesRequest, LicensesListResponse> listCallable() {
    return stub.listCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy. Caution
   * This resource is intended for use only by third-party partners who are creating Cloud
   * Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   String resource = "";
   *   GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
   *   Policy response = licensesClient.setIamPolicy(project, resource, globalSetPolicyRequestResource);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param resource Name or id of the resource for this request.
   * @param globalSetPolicyRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(
      String project, String resource, GlobalSetPolicyRequest globalSetPolicyRequestResource) {
    SetIamPolicyLicenseRequest request =
        SetIamPolicyLicenseRequest.newBuilder()
            .setProject(project)
            .setResource(resource)
            .setGlobalSetPolicyRequestResource(globalSetPolicyRequestResource)
            .build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy. Caution
   * This resource is intended for use only by third-party partners who are creating Cloud
   * Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
   *   String project = "";
   *   String resource = "";
   *   SetIamPolicyLicenseRequest request = SetIamPolicyLicenseRequest.newBuilder()
   *     .setGlobalSetPolicyRequestResource(globalSetPolicyRequestResource)
   *     .setProject(project)
   *     .setResource(resource)
   *     .build();
   *   Policy response = licensesClient.setIamPolicy(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyLicenseRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Sets the access control policy on the specified resource. Replaces any existing policy. Caution
   * This resource is intended for use only by third-party partners who are creating Cloud
   * Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
   *   String project = "";
   *   String resource = "";
   *   SetIamPolicyLicenseRequest request = SetIamPolicyLicenseRequest.newBuilder()
   *     .setGlobalSetPolicyRequestResource(globalSetPolicyRequestResource)
   *     .setProject(project)
   *     .setResource(resource)
   *     .build();
   *   ApiFuture&lt;Policy&gt; future = licensesClient.setIamPolicyCallable().futureCall(request);
   *   // Do something
   *   Policy response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<SetIamPolicyLicenseRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that a caller has on the specified resource. Caution This resource is
   * intended for use only by third-party partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   String resource = "";
   *   TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
   *   TestPermissionsResponse response = licensesClient.testIamPermissions(project, resource, testPermissionsRequestResource);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param resource Name or id of the resource for this request.
   * @param testPermissionsRequestResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestPermissionsResponse testIamPermissions(
      String project, String resource, TestPermissionsRequest testPermissionsRequestResource) {
    TestIamPermissionsLicenseRequest request =
        TestIamPermissionsLicenseRequest.newBuilder()
            .setProject(project)
            .setResource(resource)
            .setTestPermissionsRequestResource(testPermissionsRequestResource)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that a caller has on the specified resource. Caution This resource is
   * intended for use only by third-party partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   String resource = "";
   *   TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
   *   TestIamPermissionsLicenseRequest request = TestIamPermissionsLicenseRequest.newBuilder()
   *     .setProject(project)
   *     .setResource(resource)
   *     .setTestPermissionsRequestResource(testPermissionsRequestResource)
   *     .build();
   *   TestPermissionsResponse response = licensesClient.testIamPermissions(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestPermissionsResponse testIamPermissions(
      TestIamPermissionsLicenseRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns permissions that a caller has on the specified resource. Caution This resource is
   * intended for use only by third-party partners who are creating Cloud Marketplace images.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (LicensesClient licensesClient = LicensesClient.create()) {
   *   String project = "";
   *   String resource = "";
   *   TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
   *   TestIamPermissionsLicenseRequest request = TestIamPermissionsLicenseRequest.newBuilder()
   *     .setProject(project)
   *     .setResource(resource)
   *     .setTestPermissionsRequestResource(testPermissionsRequestResource)
   *     .build();
   *   ApiFuture&lt;TestPermissionsResponse&gt; future = licensesClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something
   *   TestPermissionsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<TestIamPermissionsLicenseRequest, TestPermissionsResponse>
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
          ListLicensesRequest, LicensesListResponse, License, ListPage, ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<ListLicensesRequest, LicensesListResponse, License> context,
        ApiFuture<LicensesListResponse> futureResponse) {
      ApiFuture<ListPage> futurePage =
          ListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListPage, ListPagedResponse>() {
            @Override
            public ListPagedResponse apply(ListPage input) {
              return new ListPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListPagedResponse(ListPage page) {
      super(page, ListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPage
      extends AbstractPage<ListLicensesRequest, LicensesListResponse, License, ListPage> {

    private ListPage(
        PageContext<ListLicensesRequest, LicensesListResponse, License> context,
        LicensesListResponse response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<ListLicensesRequest, LicensesListResponse, License> context,
        LicensesListResponse response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<ListLicensesRequest, LicensesListResponse, License> context,
        ApiFuture<LicensesListResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListLicensesRequest, LicensesListResponse, License, ListPage, ListFixedSizeCollection> {

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
