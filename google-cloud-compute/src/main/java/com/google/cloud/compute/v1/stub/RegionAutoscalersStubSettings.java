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

package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.RegionAutoscalersClient.ListPagedResponse;

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
import com.google.cloud.compute.v1.Autoscaler;
import com.google.cloud.compute.v1.DeleteRegionAutoscalerRequest;
import com.google.cloud.compute.v1.GetRegionAutoscalerRequest;
import com.google.cloud.compute.v1.InsertRegionAutoscalerRequest;
import com.google.cloud.compute.v1.ListRegionAutoscalersRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchRegionAutoscalerRequest;
import com.google.cloud.compute.v1.RegionAutoscalerList;
import com.google.cloud.compute.v1.UpdateRegionAutoscalerRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link RegionAutoscalersStub}.
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
 * <p>For example, to set the total timeout of delete to 30 seconds:
 *
 * <pre>{@code
 * RegionAutoscalersStubSettings.Builder regionAutoscalersSettingsBuilder =
 *     RegionAutoscalersStubSettings.newBuilder();
 * regionAutoscalersSettingsBuilder
 *     .deleteSettings()
 *     .setRetrySettings(
 *         regionAutoscalersSettingsBuilder
 *             .deleteSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * RegionAutoscalersStubSettings regionAutoscalersSettings =
 *     regionAutoscalersSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class RegionAutoscalersStubSettings extends StubSettings<RegionAutoscalersStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/cloud-platform")
          .build();

  private final UnaryCallSettings<DeleteRegionAutoscalerRequest, Operation> deleteSettings;
  private final UnaryCallSettings<GetRegionAutoscalerRequest, Autoscaler> getSettings;
  private final UnaryCallSettings<InsertRegionAutoscalerRequest, Operation> insertSettings;
  private final PagedCallSettings<
          ListRegionAutoscalersRequest, RegionAutoscalerList, ListPagedResponse>
      listSettings;
  private final UnaryCallSettings<PatchRegionAutoscalerRequest, Operation> patchSettings;
  private final UnaryCallSettings<UpdateRegionAutoscalerRequest, Operation> updateSettings;

  private static final PagedListDescriptor<
          ListRegionAutoscalersRequest, RegionAutoscalerList, Autoscaler>
      LIST_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListRegionAutoscalersRequest, RegionAutoscalerList, Autoscaler>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRegionAutoscalersRequest injectToken(
                ListRegionAutoscalersRequest payload, String token) {
              return ListRegionAutoscalersRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListRegionAutoscalersRequest injectPageSize(
                ListRegionAutoscalersRequest payload, int pageSize) {
              return ListRegionAutoscalersRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListRegionAutoscalersRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(RegionAutoscalerList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Autoscaler> extractResources(RegionAutoscalerList payload) {
              return payload.getItemsList() == null
                  ? ImmutableList.<Autoscaler>of()
                  : payload.getItemsList();
            }
          };

  private static final PagedListResponseFactory<
          ListRegionAutoscalersRequest, RegionAutoscalerList, ListPagedResponse>
      LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRegionAutoscalersRequest, RegionAutoscalerList, ListPagedResponse>() {
            @Override
            public ApiFuture<ListPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListRegionAutoscalersRequest, RegionAutoscalerList> callable,
                ListRegionAutoscalersRequest request,
                ApiCallContext context,
                ApiFuture<RegionAutoscalerList> futureResponse) {
              PageContext<ListRegionAutoscalersRequest, RegionAutoscalerList, Autoscaler>
                  pageContext = PageContext.create(callable, LIST_PAGE_STR_DESC, request, context);
              return ListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteRegionAutoscalerRequest, Operation> deleteSettings() {
    return deleteSettings;
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetRegionAutoscalerRequest, Autoscaler> getSettings() {
    return getSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertRegionAutoscalerRequest, Operation> insertSettings() {
    return insertSettings;
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<ListRegionAutoscalersRequest, RegionAutoscalerList, ListPagedResponse>
      listSettings() {
    return listSettings;
  }

  /** Returns the object with the settings used for calls to patch. */
  public UnaryCallSettings<PatchRegionAutoscalerRequest, Operation> patchSettings() {
    return patchSettings;
  }

  /** Returns the object with the settings used for calls to update. */
  public UnaryCallSettings<UpdateRegionAutoscalerRequest, Operation> updateSettings() {
    return updateSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RegionAutoscalersStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonRegionAutoscalersStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "compute.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "compute.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(RegionAutoscalersStubSettings.class))
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

  protected RegionAutoscalersStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteSettings = settingsBuilder.deleteSettings().build();
    getSettings = settingsBuilder.getSettings().build();
    insertSettings = settingsBuilder.insertSettings().build();
    listSettings = settingsBuilder.listSettings().build();
    patchSettings = settingsBuilder.patchSettings().build();
    updateSettings = settingsBuilder.updateSettings().build();
  }

  /** Builder for RegionAutoscalersStubSettings. */
  public static class Builder extends StubSettings.Builder<RegionAutoscalersStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<DeleteRegionAutoscalerRequest, Operation>
        deleteSettings;
    private final UnaryCallSettings.Builder<GetRegionAutoscalerRequest, Autoscaler> getSettings;
    private final UnaryCallSettings.Builder<InsertRegionAutoscalerRequest, Operation>
        insertSettings;
    private final PagedCallSettings.Builder<
            ListRegionAutoscalersRequest, RegionAutoscalerList, ListPagedResponse>
        listSettings;
    private final UnaryCallSettings.Builder<PatchRegionAutoscalerRequest, Operation> patchSettings;
    private final UnaryCallSettings.Builder<UpdateRegionAutoscalerRequest, Operation>
        updateSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(600000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(600000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      deleteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      insertSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listSettings = PagedCallSettings.newBuilder(LIST_PAGE_STR_FACT);
      patchSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteSettings,
              getSettings,
              insertSettings,
              listSettings,
              patchSettings,
              updateSettings);
      initDefaults(this);
    }

    protected Builder(RegionAutoscalersStubSettings settings) {
      super(settings);

      deleteSettings = settings.deleteSettings.toBuilder();
      getSettings = settings.getSettings.toBuilder();
      insertSettings = settings.insertSettings.toBuilder();
      listSettings = settings.listSettings.toBuilder();
      patchSettings = settings.patchSettings.toBuilder();
      updateSettings = settings.updateSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteSettings,
              getSettings,
              insertSettings,
              listSettings,
              patchSettings,
              updateSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .deleteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .insertSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .patchSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
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

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteRegionAutoscalerRequest, Operation> deleteSettings() {
      return deleteSettings;
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetRegionAutoscalerRequest, Autoscaler> getSettings() {
      return getSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertRegionAutoscalerRequest, Operation> insertSettings() {
      return insertSettings;
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListRegionAutoscalersRequest, RegionAutoscalerList, ListPagedResponse>
        listSettings() {
      return listSettings;
    }

    /** Returns the builder for the settings used for calls to patch. */
    public UnaryCallSettings.Builder<PatchRegionAutoscalerRequest, Operation> patchSettings() {
      return patchSettings;
    }

    /** Returns the builder for the settings used for calls to update. */
    public UnaryCallSettings.Builder<UpdateRegionAutoscalerRequest, Operation> updateSettings() {
      return updateSettings;
    }

    @Override
    public RegionAutoscalersStubSettings build() throws IOException {
      return new RegionAutoscalersStubSettings(this);
    }
  }
}
