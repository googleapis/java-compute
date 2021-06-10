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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.InstanceGroupManagersClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagersClient.ListErrorsPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagersClient.ListManagedInstancesPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagersClient.ListPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagersClient.ListPerInstanceConfigsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersRequest;
import com.google.cloud.compute.v1.ApplyUpdatesToInstancesInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.CreateInstancesInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.DeleteInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.DeletePerInstanceConfigsInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.GetInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.InsertInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.InstanceGroupManager;
import com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList;
import com.google.cloud.compute.v1.InstanceGroupManagerList;
import com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse;
import com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse;
import com.google.cloud.compute.v1.InstanceGroupManagersListPerInstanceConfigsResp;
import com.google.cloud.compute.v1.InstanceGroupManagersScopedList;
import com.google.cloud.compute.v1.InstanceManagedByIgmError;
import com.google.cloud.compute.v1.ListErrorsInstanceGroupManagersRequest;
import com.google.cloud.compute.v1.ListInstanceGroupManagersRequest;
import com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersRequest;
import com.google.cloud.compute.v1.ListPerInstanceConfigsInstanceGroupManagersRequest;
import com.google.cloud.compute.v1.ManagedInstance;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.PatchPerInstanceConfigsInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.PerInstanceConfig;
import com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.ResizeInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.UpdatePerInstanceConfigsInstanceGroupManagerRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link InstanceGroupManagersStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (compute.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of abandonInstances to 30 seconds:
 *
 * <pre>
 * <code>
 * InstanceGroupManagersStubSettings.Builder instanceGroupManagersSettingsBuilder =
 *     InstanceGroupManagersStubSettings.newBuilder();
 * instanceGroupManagersSettingsBuilder
 *     .abandonInstancesSettings()
 *     .setRetrySettings(
 *         instanceGroupManagersSettingsBuilder.abandonInstancesSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * InstanceGroupManagersStubSettings instanceGroupManagersSettings = instanceGroupManagersSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class InstanceGroupManagersStubSettings
    extends StubSettings<InstanceGroupManagersStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .build();

  private final UnaryCallSettings<AbandonInstancesInstanceGroupManagerRequest, Operation>
      abandonInstancesSettings;
  private final PagedCallSettings<
          AggregatedListInstanceGroupManagersRequest,
          InstanceGroupManagerAggregatedList,
          AggregatedListPagedResponse>
      aggregatedListSettings;
  private final UnaryCallSettings<ApplyUpdatesToInstancesInstanceGroupManagerRequest, Operation>
      applyUpdatesToInstancesSettings;
  private final UnaryCallSettings<CreateInstancesInstanceGroupManagerRequest, Operation>
      createInstancesSettings;
  private final UnaryCallSettings<DeleteInstanceGroupManagerRequest, Operation> deleteSettings;
  private final UnaryCallSettings<DeleteInstancesInstanceGroupManagerRequest, Operation>
      deleteInstancesSettings;
  private final UnaryCallSettings<DeletePerInstanceConfigsInstanceGroupManagerRequest, Operation>
      deletePerInstanceConfigsSettings;
  private final UnaryCallSettings<GetInstanceGroupManagerRequest, InstanceGroupManager> getSettings;
  private final UnaryCallSettings<InsertInstanceGroupManagerRequest, Operation> insertSettings;
  private final PagedCallSettings<
          ListInstanceGroupManagersRequest, InstanceGroupManagerList, ListPagedResponse>
      listSettings;
  private final PagedCallSettings<
          ListErrorsInstanceGroupManagersRequest,
          InstanceGroupManagersListErrorsResponse,
          ListErrorsPagedResponse>
      listErrorsSettings;
  private final PagedCallSettings<
          ListManagedInstancesInstanceGroupManagersRequest,
          InstanceGroupManagersListManagedInstancesResponse,
          ListManagedInstancesPagedResponse>
      listManagedInstancesSettings;
  private final PagedCallSettings<
          ListPerInstanceConfigsInstanceGroupManagersRequest,
          InstanceGroupManagersListPerInstanceConfigsResp,
          ListPerInstanceConfigsPagedResponse>
      listPerInstanceConfigsSettings;
  private final UnaryCallSettings<PatchInstanceGroupManagerRequest, Operation> patchSettings;
  private final UnaryCallSettings<PatchPerInstanceConfigsInstanceGroupManagerRequest, Operation>
      patchPerInstanceConfigsSettings;
  private final UnaryCallSettings<RecreateInstancesInstanceGroupManagerRequest, Operation>
      recreateInstancesSettings;
  private final UnaryCallSettings<ResizeInstanceGroupManagerRequest, Operation> resizeSettings;
  private final UnaryCallSettings<SetInstanceTemplateInstanceGroupManagerRequest, Operation>
      setInstanceTemplateSettings;
  private final UnaryCallSettings<SetTargetPoolsInstanceGroupManagerRequest, Operation>
      setTargetPoolsSettings;
  private final UnaryCallSettings<UpdatePerInstanceConfigsInstanceGroupManagerRequest, Operation>
      updatePerInstanceConfigsSettings;

  /** Returns the object with the settings used for calls to abandonInstances. */
  public UnaryCallSettings<AbandonInstancesInstanceGroupManagerRequest, Operation>
      abandonInstancesSettings() {
    return abandonInstancesSettings;
  }

  /** Returns the object with the settings used for calls to aggregatedList. */
  public PagedCallSettings<
          AggregatedListInstanceGroupManagersRequest,
          InstanceGroupManagerAggregatedList,
          AggregatedListPagedResponse>
      aggregatedListSettings() {
    return aggregatedListSettings;
  }

  /** Returns the object with the settings used for calls to applyUpdatesToInstances. */
  public UnaryCallSettings<ApplyUpdatesToInstancesInstanceGroupManagerRequest, Operation>
      applyUpdatesToInstancesSettings() {
    return applyUpdatesToInstancesSettings;
  }

  /** Returns the object with the settings used for calls to createInstances. */
  public UnaryCallSettings<CreateInstancesInstanceGroupManagerRequest, Operation>
      createInstancesSettings() {
    return createInstancesSettings;
  }

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteInstanceGroupManagerRequest, Operation> deleteSettings() {
    return deleteSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstances. */
  public UnaryCallSettings<DeleteInstancesInstanceGroupManagerRequest, Operation>
      deleteInstancesSettings() {
    return deleteInstancesSettings;
  }

  /** Returns the object with the settings used for calls to deletePerInstanceConfigs. */
  public UnaryCallSettings<DeletePerInstanceConfigsInstanceGroupManagerRequest, Operation>
      deletePerInstanceConfigsSettings() {
    return deletePerInstanceConfigsSettings;
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetInstanceGroupManagerRequest, InstanceGroupManager> getSettings() {
    return getSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertInstanceGroupManagerRequest, Operation> insertSettings() {
    return insertSettings;
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<
          ListInstanceGroupManagersRequest, InstanceGroupManagerList, ListPagedResponse>
      listSettings() {
    return listSettings;
  }

  /** Returns the object with the settings used for calls to listErrors. */
  public PagedCallSettings<
          ListErrorsInstanceGroupManagersRequest,
          InstanceGroupManagersListErrorsResponse,
          ListErrorsPagedResponse>
      listErrorsSettings() {
    return listErrorsSettings;
  }

  /** Returns the object with the settings used for calls to listManagedInstances. */
  public PagedCallSettings<
          ListManagedInstancesInstanceGroupManagersRequest,
          InstanceGroupManagersListManagedInstancesResponse,
          ListManagedInstancesPagedResponse>
      listManagedInstancesSettings() {
    return listManagedInstancesSettings;
  }

  /** Returns the object with the settings used for calls to listPerInstanceConfigs. */
  public PagedCallSettings<
          ListPerInstanceConfigsInstanceGroupManagersRequest,
          InstanceGroupManagersListPerInstanceConfigsResp,
          ListPerInstanceConfigsPagedResponse>
      listPerInstanceConfigsSettings() {
    return listPerInstanceConfigsSettings;
  }

  /** Returns the object with the settings used for calls to patch. */
  public UnaryCallSettings<PatchInstanceGroupManagerRequest, Operation> patchSettings() {
    return patchSettings;
  }

  /** Returns the object with the settings used for calls to patchPerInstanceConfigs. */
  public UnaryCallSettings<PatchPerInstanceConfigsInstanceGroupManagerRequest, Operation>
      patchPerInstanceConfigsSettings() {
    return patchPerInstanceConfigsSettings;
  }

  /** Returns the object with the settings used for calls to recreateInstances. */
  public UnaryCallSettings<RecreateInstancesInstanceGroupManagerRequest, Operation>
      recreateInstancesSettings() {
    return recreateInstancesSettings;
  }

  /** Returns the object with the settings used for calls to resize. */
  public UnaryCallSettings<ResizeInstanceGroupManagerRequest, Operation> resizeSettings() {
    return resizeSettings;
  }

  /** Returns the object with the settings used for calls to setInstanceTemplate. */
  public UnaryCallSettings<SetInstanceTemplateInstanceGroupManagerRequest, Operation>
      setInstanceTemplateSettings() {
    return setInstanceTemplateSettings;
  }

  /** Returns the object with the settings used for calls to setTargetPools. */
  public UnaryCallSettings<SetTargetPoolsInstanceGroupManagerRequest, Operation>
      setTargetPoolsSettings() {
    return setTargetPoolsSettings;
  }

  /** Returns the object with the settings used for calls to updatePerInstanceConfigs. */
  public UnaryCallSettings<UpdatePerInstanceConfigsInstanceGroupManagerRequest, Operation>
      updatePerInstanceConfigsSettings() {
    return updatePerInstanceConfigsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public InstanceGroupManagersStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonInstanceGroupManagersStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "compute.googleapis.com";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(InstanceGroupManagersStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected InstanceGroupManagersStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    abandonInstancesSettings = settingsBuilder.abandonInstancesSettings().build();
    aggregatedListSettings = settingsBuilder.aggregatedListSettings().build();
    applyUpdatesToInstancesSettings = settingsBuilder.applyUpdatesToInstancesSettings().build();
    createInstancesSettings = settingsBuilder.createInstancesSettings().build();
    deleteSettings = settingsBuilder.deleteSettings().build();
    deleteInstancesSettings = settingsBuilder.deleteInstancesSettings().build();
    deletePerInstanceConfigsSettings = settingsBuilder.deletePerInstanceConfigsSettings().build();
    getSettings = settingsBuilder.getSettings().build();
    insertSettings = settingsBuilder.insertSettings().build();
    listSettings = settingsBuilder.listSettings().build();
    listErrorsSettings = settingsBuilder.listErrorsSettings().build();
    listManagedInstancesSettings = settingsBuilder.listManagedInstancesSettings().build();
    listPerInstanceConfigsSettings = settingsBuilder.listPerInstanceConfigsSettings().build();
    patchSettings = settingsBuilder.patchSettings().build();
    patchPerInstanceConfigsSettings = settingsBuilder.patchPerInstanceConfigsSettings().build();
    recreateInstancesSettings = settingsBuilder.recreateInstancesSettings().build();
    resizeSettings = settingsBuilder.resizeSettings().build();
    setInstanceTemplateSettings = settingsBuilder.setInstanceTemplateSettings().build();
    setTargetPoolsSettings = settingsBuilder.setTargetPoolsSettings().build();
    updatePerInstanceConfigsSettings = settingsBuilder.updatePerInstanceConfigsSettings().build();
  }

  private static final PagedListDescriptor<
          AggregatedListInstanceGroupManagersRequest,
          InstanceGroupManagerAggregatedList,
          Entry<String, InstanceGroupManagersScopedList>>
      AGGREGATED_LIST_PAGE_STR_DESC =
          new PagedListDescriptor<
              AggregatedListInstanceGroupManagersRequest,
              InstanceGroupManagerAggregatedList,
              Entry<String, InstanceGroupManagersScopedList>>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public AggregatedListInstanceGroupManagersRequest injectToken(
                AggregatedListInstanceGroupManagersRequest payload, String token) {
              return AggregatedListInstanceGroupManagersRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public AggregatedListInstanceGroupManagersRequest injectPageSize(
                AggregatedListInstanceGroupManagersRequest payload, int pageSize) {
              return AggregatedListInstanceGroupManagersRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(AggregatedListInstanceGroupManagersRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceGroupManagerAggregatedList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Entry<String, InstanceGroupManagersScopedList>> extractResources(
                InstanceGroupManagerAggregatedList payload) {
              return payload.getItemsMap() != null
                  ? payload.getItemsMap().entrySet()
                  : ImmutableList.<Entry<String, InstanceGroupManagersScopedList>>of();
            }
          };

  private static final PagedListDescriptor<
          ListInstanceGroupManagersRequest, InstanceGroupManagerList, InstanceGroupManager>
      LIST_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListInstanceGroupManagersRequest, InstanceGroupManagerList, InstanceGroupManager>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListInstanceGroupManagersRequest injectToken(
                ListInstanceGroupManagersRequest payload, String token) {
              return ListInstanceGroupManagersRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListInstanceGroupManagersRequest injectPageSize(
                ListInstanceGroupManagersRequest payload, int pageSize) {
              return ListInstanceGroupManagersRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListInstanceGroupManagersRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceGroupManagerList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceGroupManager> extractResources(
                InstanceGroupManagerList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<InstanceGroupManager>of();
            }
          };

  private static final PagedListDescriptor<
          ListErrorsInstanceGroupManagersRequest,
          InstanceGroupManagersListErrorsResponse,
          InstanceManagedByIgmError>
      LIST_ERRORS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListErrorsInstanceGroupManagersRequest,
              InstanceGroupManagersListErrorsResponse,
              InstanceManagedByIgmError>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListErrorsInstanceGroupManagersRequest injectToken(
                ListErrorsInstanceGroupManagersRequest payload, String token) {
              return ListErrorsInstanceGroupManagersRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListErrorsInstanceGroupManagersRequest injectPageSize(
                ListErrorsInstanceGroupManagersRequest payload, int pageSize) {
              return ListErrorsInstanceGroupManagersRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListErrorsInstanceGroupManagersRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(InstanceGroupManagersListErrorsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceManagedByIgmError> extractResources(
                InstanceGroupManagersListErrorsResponse payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<InstanceManagedByIgmError>of();
            }
          };

  private static final PagedListDescriptor<
          ListManagedInstancesInstanceGroupManagersRequest,
          InstanceGroupManagersListManagedInstancesResponse,
          ManagedInstance>
      LIST_MANAGED_INSTANCES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListManagedInstancesInstanceGroupManagersRequest,
              InstanceGroupManagersListManagedInstancesResponse,
              ManagedInstance>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListManagedInstancesInstanceGroupManagersRequest injectToken(
                ListManagedInstancesInstanceGroupManagersRequest payload, String token) {
              return ListManagedInstancesInstanceGroupManagersRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListManagedInstancesInstanceGroupManagersRequest injectPageSize(
                ListManagedInstancesInstanceGroupManagersRequest payload, int pageSize) {
              return ListManagedInstancesInstanceGroupManagersRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListManagedInstancesInstanceGroupManagersRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(
                InstanceGroupManagersListManagedInstancesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ManagedInstance> extractResources(
                InstanceGroupManagersListManagedInstancesResponse payload) {
              return payload.getManagedInstancesList() != null
                  ? payload.getManagedInstancesList()
                  : ImmutableList.<ManagedInstance>of();
            }
          };

  private static final PagedListDescriptor<
          ListPerInstanceConfigsInstanceGroupManagersRequest,
          InstanceGroupManagersListPerInstanceConfigsResp,
          PerInstanceConfig>
      LIST_PER_INSTANCE_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListPerInstanceConfigsInstanceGroupManagersRequest,
              InstanceGroupManagersListPerInstanceConfigsResp,
              PerInstanceConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPerInstanceConfigsInstanceGroupManagersRequest injectToken(
                ListPerInstanceConfigsInstanceGroupManagersRequest payload, String token) {
              return ListPerInstanceConfigsInstanceGroupManagersRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListPerInstanceConfigsInstanceGroupManagersRequest injectPageSize(
                ListPerInstanceConfigsInstanceGroupManagersRequest payload, int pageSize) {
              return ListPerInstanceConfigsInstanceGroupManagersRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListPerInstanceConfigsInstanceGroupManagersRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(
                InstanceGroupManagersListPerInstanceConfigsResp payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<PerInstanceConfig> extractResources(
                InstanceGroupManagersListPerInstanceConfigsResp payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<PerInstanceConfig>of();
            }
          };

  private static final PagedListResponseFactory<
          AggregatedListInstanceGroupManagersRequest,
          InstanceGroupManagerAggregatedList,
          AggregatedListPagedResponse>
      AGGREGATED_LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              AggregatedListInstanceGroupManagersRequest,
              InstanceGroupManagerAggregatedList,
              AggregatedListPagedResponse>() {
            @Override
            public ApiFuture<AggregatedListPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        AggregatedListInstanceGroupManagersRequest,
                        InstanceGroupManagerAggregatedList>
                    callable,
                AggregatedListInstanceGroupManagersRequest request,
                ApiCallContext context,
                ApiFuture<InstanceGroupManagerAggregatedList> futureResponse) {
              PageContext<
                      AggregatedListInstanceGroupManagersRequest,
                      InstanceGroupManagerAggregatedList,
                      Entry<String, InstanceGroupManagersScopedList>>
                  pageContext =
                      PageContext.create(callable, AGGREGATED_LIST_PAGE_STR_DESC, request, context);
              return AggregatedListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListInstanceGroupManagersRequest, InstanceGroupManagerList, ListPagedResponse>
      LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListInstanceGroupManagersRequest, InstanceGroupManagerList, ListPagedResponse>() {
            @Override
            public ApiFuture<ListPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListInstanceGroupManagersRequest, InstanceGroupManagerList> callable,
                ListInstanceGroupManagersRequest request,
                ApiCallContext context,
                ApiFuture<InstanceGroupManagerList> futureResponse) {
              PageContext<
                      ListInstanceGroupManagersRequest,
                      InstanceGroupManagerList,
                      InstanceGroupManager>
                  pageContext = PageContext.create(callable, LIST_PAGE_STR_DESC, request, context);
              return ListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListErrorsInstanceGroupManagersRequest,
          InstanceGroupManagersListErrorsResponse,
          ListErrorsPagedResponse>
      LIST_ERRORS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListErrorsInstanceGroupManagersRequest,
              InstanceGroupManagersListErrorsResponse,
              ListErrorsPagedResponse>() {
            @Override
            public ApiFuture<ListErrorsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListErrorsInstanceGroupManagersRequest,
                        InstanceGroupManagersListErrorsResponse>
                    callable,
                ListErrorsInstanceGroupManagersRequest request,
                ApiCallContext context,
                ApiFuture<InstanceGroupManagersListErrorsResponse> futureResponse) {
              PageContext<
                      ListErrorsInstanceGroupManagersRequest,
                      InstanceGroupManagersListErrorsResponse,
                      InstanceManagedByIgmError>
                  pageContext =
                      PageContext.create(callable, LIST_ERRORS_PAGE_STR_DESC, request, context);
              return ListErrorsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListManagedInstancesInstanceGroupManagersRequest,
          InstanceGroupManagersListManagedInstancesResponse,
          ListManagedInstancesPagedResponse>
      LIST_MANAGED_INSTANCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListManagedInstancesInstanceGroupManagersRequest,
              InstanceGroupManagersListManagedInstancesResponse,
              ListManagedInstancesPagedResponse>() {
            @Override
            public ApiFuture<ListManagedInstancesPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListManagedInstancesInstanceGroupManagersRequest,
                        InstanceGroupManagersListManagedInstancesResponse>
                    callable,
                ListManagedInstancesInstanceGroupManagersRequest request,
                ApiCallContext context,
                ApiFuture<InstanceGroupManagersListManagedInstancesResponse> futureResponse) {
              PageContext<
                      ListManagedInstancesInstanceGroupManagersRequest,
                      InstanceGroupManagersListManagedInstancesResponse,
                      ManagedInstance>
                  pageContext =
                      PageContext.create(
                          callable, LIST_MANAGED_INSTANCES_PAGE_STR_DESC, request, context);
              return ListManagedInstancesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPerInstanceConfigsInstanceGroupManagersRequest,
          InstanceGroupManagersListPerInstanceConfigsResp,
          ListPerInstanceConfigsPagedResponse>
      LIST_PER_INSTANCE_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPerInstanceConfigsInstanceGroupManagersRequest,
              InstanceGroupManagersListPerInstanceConfigsResp,
              ListPerInstanceConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListPerInstanceConfigsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListPerInstanceConfigsInstanceGroupManagersRequest,
                        InstanceGroupManagersListPerInstanceConfigsResp>
                    callable,
                ListPerInstanceConfigsInstanceGroupManagersRequest request,
                ApiCallContext context,
                ApiFuture<InstanceGroupManagersListPerInstanceConfigsResp> futureResponse) {
              PageContext<
                      ListPerInstanceConfigsInstanceGroupManagersRequest,
                      InstanceGroupManagersListPerInstanceConfigsResp,
                      PerInstanceConfig>
                  pageContext =
                      PageContext.create(
                          callable, LIST_PER_INSTANCE_CONFIGS_PAGE_STR_DESC, request, context);
              return ListPerInstanceConfigsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for InstanceGroupManagersStubSettings. */
  public static class Builder
      extends StubSettings.Builder<InstanceGroupManagersStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<AbandonInstancesInstanceGroupManagerRequest, Operation>
        abandonInstancesSettings;
    private final PagedCallSettings.Builder<
            AggregatedListInstanceGroupManagersRequest,
            InstanceGroupManagerAggregatedList,
            AggregatedListPagedResponse>
        aggregatedListSettings;
    private final UnaryCallSettings.Builder<
            ApplyUpdatesToInstancesInstanceGroupManagerRequest, Operation>
        applyUpdatesToInstancesSettings;
    private final UnaryCallSettings.Builder<CreateInstancesInstanceGroupManagerRequest, Operation>
        createInstancesSettings;
    private final UnaryCallSettings.Builder<DeleteInstanceGroupManagerRequest, Operation>
        deleteSettings;
    private final UnaryCallSettings.Builder<DeleteInstancesInstanceGroupManagerRequest, Operation>
        deleteInstancesSettings;
    private final UnaryCallSettings.Builder<
            DeletePerInstanceConfigsInstanceGroupManagerRequest, Operation>
        deletePerInstanceConfigsSettings;
    private final UnaryCallSettings.Builder<GetInstanceGroupManagerRequest, InstanceGroupManager>
        getSettings;
    private final UnaryCallSettings.Builder<InsertInstanceGroupManagerRequest, Operation>
        insertSettings;
    private final PagedCallSettings.Builder<
            ListInstanceGroupManagersRequest, InstanceGroupManagerList, ListPagedResponse>
        listSettings;
    private final PagedCallSettings.Builder<
            ListErrorsInstanceGroupManagersRequest,
            InstanceGroupManagersListErrorsResponse,
            ListErrorsPagedResponse>
        listErrorsSettings;
    private final PagedCallSettings.Builder<
            ListManagedInstancesInstanceGroupManagersRequest,
            InstanceGroupManagersListManagedInstancesResponse,
            ListManagedInstancesPagedResponse>
        listManagedInstancesSettings;
    private final PagedCallSettings.Builder<
            ListPerInstanceConfigsInstanceGroupManagersRequest,
            InstanceGroupManagersListPerInstanceConfigsResp,
            ListPerInstanceConfigsPagedResponse>
        listPerInstanceConfigsSettings;
    private final UnaryCallSettings.Builder<PatchInstanceGroupManagerRequest, Operation>
        patchSettings;
    private final UnaryCallSettings.Builder<
            PatchPerInstanceConfigsInstanceGroupManagerRequest, Operation>
        patchPerInstanceConfigsSettings;
    private final UnaryCallSettings.Builder<RecreateInstancesInstanceGroupManagerRequest, Operation>
        recreateInstancesSettings;
    private final UnaryCallSettings.Builder<ResizeInstanceGroupManagerRequest, Operation>
        resizeSettings;
    private final UnaryCallSettings.Builder<
            SetInstanceTemplateInstanceGroupManagerRequest, Operation>
        setInstanceTemplateSettings;
    private final UnaryCallSettings.Builder<SetTargetPoolsInstanceGroupManagerRequest, Operation>
        setTargetPoolsSettings;
    private final UnaryCallSettings.Builder<
            UpdatePerInstanceConfigsInstanceGroupManagerRequest, Operation>
        updatePerInstanceConfigsSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      abandonInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      aggregatedListSettings = PagedCallSettings.newBuilder(AGGREGATED_LIST_PAGE_STR_FACT);

      applyUpdatesToInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deletePerInstanceConfigsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listSettings = PagedCallSettings.newBuilder(LIST_PAGE_STR_FACT);

      listErrorsSettings = PagedCallSettings.newBuilder(LIST_ERRORS_PAGE_STR_FACT);

      listManagedInstancesSettings =
          PagedCallSettings.newBuilder(LIST_MANAGED_INSTANCES_PAGE_STR_FACT);

      listPerInstanceConfigsSettings =
          PagedCallSettings.newBuilder(LIST_PER_INSTANCE_CONFIGS_PAGE_STR_FACT);

      patchSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      patchPerInstanceConfigsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      recreateInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      resizeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setInstanceTemplateSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      setTargetPoolsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updatePerInstanceConfigsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              abandonInstancesSettings,
              aggregatedListSettings,
              applyUpdatesToInstancesSettings,
              createInstancesSettings,
              deleteSettings,
              deleteInstancesSettings,
              deletePerInstanceConfigsSettings,
              getSettings,
              insertSettings,
              listSettings,
              listErrorsSettings,
              listManagedInstancesSettings,
              listPerInstanceConfigsSettings,
              patchSettings,
              patchPerInstanceConfigsSettings,
              recreateInstancesSettings,
              resizeSettings,
              setInstanceTemplateSettings,
              setTargetPoolsSettings,
              updatePerInstanceConfigsSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .abandonInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .aggregatedListSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .applyUpdatesToInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deletePerInstanceConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listErrorsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listManagedInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listPerInstanceConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchPerInstanceConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .recreateInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .resizeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setInstanceTemplateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .setTargetPoolsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updatePerInstanceConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(InstanceGroupManagersStubSettings settings) {
      super(settings);

      abandonInstancesSettings = settings.abandonInstancesSettings.toBuilder();
      aggregatedListSettings = settings.aggregatedListSettings.toBuilder();
      applyUpdatesToInstancesSettings = settings.applyUpdatesToInstancesSettings.toBuilder();
      createInstancesSettings = settings.createInstancesSettings.toBuilder();
      deleteSettings = settings.deleteSettings.toBuilder();
      deleteInstancesSettings = settings.deleteInstancesSettings.toBuilder();
      deletePerInstanceConfigsSettings = settings.deletePerInstanceConfigsSettings.toBuilder();
      getSettings = settings.getSettings.toBuilder();
      insertSettings = settings.insertSettings.toBuilder();
      listSettings = settings.listSettings.toBuilder();
      listErrorsSettings = settings.listErrorsSettings.toBuilder();
      listManagedInstancesSettings = settings.listManagedInstancesSettings.toBuilder();
      listPerInstanceConfigsSettings = settings.listPerInstanceConfigsSettings.toBuilder();
      patchSettings = settings.patchSettings.toBuilder();
      patchPerInstanceConfigsSettings = settings.patchPerInstanceConfigsSettings.toBuilder();
      recreateInstancesSettings = settings.recreateInstancesSettings.toBuilder();
      resizeSettings = settings.resizeSettings.toBuilder();
      setInstanceTemplateSettings = settings.setInstanceTemplateSettings.toBuilder();
      setTargetPoolsSettings = settings.setTargetPoolsSettings.toBuilder();
      updatePerInstanceConfigsSettings = settings.updatePerInstanceConfigsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              abandonInstancesSettings,
              aggregatedListSettings,
              applyUpdatesToInstancesSettings,
              createInstancesSettings,
              deleteSettings,
              deleteInstancesSettings,
              deletePerInstanceConfigsSettings,
              getSettings,
              insertSettings,
              listSettings,
              listErrorsSettings,
              listManagedInstancesSettings,
              listPerInstanceConfigsSettings,
              patchSettings,
              patchPerInstanceConfigsSettings,
              recreateInstancesSettings,
              resizeSettings,
              setInstanceTemplateSettings,
              setTargetPoolsSettings,
              updatePerInstanceConfigsSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to abandonInstances. */
    public UnaryCallSettings.Builder<AbandonInstancesInstanceGroupManagerRequest, Operation>
        abandonInstancesSettings() {
      return abandonInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to aggregatedList. */
    public PagedCallSettings.Builder<
            AggregatedListInstanceGroupManagersRequest,
            InstanceGroupManagerAggregatedList,
            AggregatedListPagedResponse>
        aggregatedListSettings() {
      return aggregatedListSettings;
    }

    /** Returns the builder for the settings used for calls to applyUpdatesToInstances. */
    public UnaryCallSettings.Builder<ApplyUpdatesToInstancesInstanceGroupManagerRequest, Operation>
        applyUpdatesToInstancesSettings() {
      return applyUpdatesToInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to createInstances. */
    public UnaryCallSettings.Builder<CreateInstancesInstanceGroupManagerRequest, Operation>
        createInstancesSettings() {
      return createInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteInstanceGroupManagerRequest, Operation>
        deleteSettings() {
      return deleteSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstances. */
    public UnaryCallSettings.Builder<DeleteInstancesInstanceGroupManagerRequest, Operation>
        deleteInstancesSettings() {
      return deleteInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to deletePerInstanceConfigs. */
    public UnaryCallSettings.Builder<DeletePerInstanceConfigsInstanceGroupManagerRequest, Operation>
        deletePerInstanceConfigsSettings() {
      return deletePerInstanceConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetInstanceGroupManagerRequest, InstanceGroupManager>
        getSettings() {
      return getSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertInstanceGroupManagerRequest, Operation>
        insertSettings() {
      return insertSettings;
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListInstanceGroupManagersRequest, InstanceGroupManagerList, ListPagedResponse>
        listSettings() {
      return listSettings;
    }

    /** Returns the builder for the settings used for calls to listErrors. */
    public PagedCallSettings.Builder<
            ListErrorsInstanceGroupManagersRequest,
            InstanceGroupManagersListErrorsResponse,
            ListErrorsPagedResponse>
        listErrorsSettings() {
      return listErrorsSettings;
    }

    /** Returns the builder for the settings used for calls to listManagedInstances. */
    public PagedCallSettings.Builder<
            ListManagedInstancesInstanceGroupManagersRequest,
            InstanceGroupManagersListManagedInstancesResponse,
            ListManagedInstancesPagedResponse>
        listManagedInstancesSettings() {
      return listManagedInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to listPerInstanceConfigs. */
    public PagedCallSettings.Builder<
            ListPerInstanceConfigsInstanceGroupManagersRequest,
            InstanceGroupManagersListPerInstanceConfigsResp,
            ListPerInstanceConfigsPagedResponse>
        listPerInstanceConfigsSettings() {
      return listPerInstanceConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to patch. */
    public UnaryCallSettings.Builder<PatchInstanceGroupManagerRequest, Operation> patchSettings() {
      return patchSettings;
    }

    /** Returns the builder for the settings used for calls to patchPerInstanceConfigs. */
    public UnaryCallSettings.Builder<PatchPerInstanceConfigsInstanceGroupManagerRequest, Operation>
        patchPerInstanceConfigsSettings() {
      return patchPerInstanceConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to recreateInstances. */
    public UnaryCallSettings.Builder<RecreateInstancesInstanceGroupManagerRequest, Operation>
        recreateInstancesSettings() {
      return recreateInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to resize. */
    public UnaryCallSettings.Builder<ResizeInstanceGroupManagerRequest, Operation>
        resizeSettings() {
      return resizeSettings;
    }

    /** Returns the builder for the settings used for calls to setInstanceTemplate. */
    public UnaryCallSettings.Builder<SetInstanceTemplateInstanceGroupManagerRequest, Operation>
        setInstanceTemplateSettings() {
      return setInstanceTemplateSettings;
    }

    /** Returns the builder for the settings used for calls to setTargetPools. */
    public UnaryCallSettings.Builder<SetTargetPoolsInstanceGroupManagerRequest, Operation>
        setTargetPoolsSettings() {
      return setTargetPoolsSettings;
    }

    /** Returns the builder for the settings used for calls to updatePerInstanceConfigs. */
    public UnaryCallSettings.Builder<UpdatePerInstanceConfigsInstanceGroupManagerRequest, Operation>
        updatePerInstanceConfigsSettings() {
      return updatePerInstanceConfigsSettings;
    }

    @Override
    public InstanceGroupManagersStubSettings build() throws IOException {
      return new InstanceGroupManagersStubSettings(this);
    }
  }
}