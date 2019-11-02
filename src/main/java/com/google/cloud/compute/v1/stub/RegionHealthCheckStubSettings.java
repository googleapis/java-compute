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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.RegionHealthCheckClient.ListRegionHealthChecksPagedResponse;

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
import com.google.cloud.compute.v1.DeleteRegionHealthCheckHttpRequest;
import com.google.cloud.compute.v1.GetRegionHealthCheckHttpRequest;
import com.google.cloud.compute.v1.HealthCheck;
import com.google.cloud.compute.v1.HealthCheckList;
import com.google.cloud.compute.v1.InsertRegionHealthCheckHttpRequest;
import com.google.cloud.compute.v1.ListRegionHealthChecksHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchRegionHealthCheckHttpRequest;
import com.google.cloud.compute.v1.UpdateRegionHealthCheckHttpRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link RegionHealthCheckStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://compute.googleapis.com/compute/v1/projects/) and
 *       default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of deleteRegionHealthCheck to 30 seconds:
 *
 * <pre>
 * <code>
 * RegionHealthCheckStubSettings.Builder regionHealthCheckSettingsBuilder =
 *     RegionHealthCheckStubSettings.newBuilder();
 * regionHealthCheckSettingsBuilder.deleteRegionHealthCheckSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * RegionHealthCheckStubSettings regionHealthCheckSettings = regionHealthCheckSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RegionHealthCheckStubSettings extends StubSettings<RegionHealthCheckStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .add("https://www.googleapis.com/auth/devstorage.full_control")
          .add("https://www.googleapis.com/auth/devstorage.read_only")
          .add("https://www.googleapis.com/auth/devstorage.read_write")
          .build();

  private final UnaryCallSettings<DeleteRegionHealthCheckHttpRequest, Operation>
      deleteRegionHealthCheckSettings;
  private final UnaryCallSettings<GetRegionHealthCheckHttpRequest, HealthCheck>
      getRegionHealthCheckSettings;
  private final UnaryCallSettings<InsertRegionHealthCheckHttpRequest, Operation>
      insertRegionHealthCheckSettings;
  private final PagedCallSettings<
          ListRegionHealthChecksHttpRequest, HealthCheckList, ListRegionHealthChecksPagedResponse>
      listRegionHealthChecksSettings;
  private final UnaryCallSettings<PatchRegionHealthCheckHttpRequest, Operation>
      patchRegionHealthCheckSettings;
  private final UnaryCallSettings<UpdateRegionHealthCheckHttpRequest, Operation>
      updateRegionHealthCheckSettings;

  /** Returns the object with the settings used for calls to deleteRegionHealthCheck. */
  public UnaryCallSettings<DeleteRegionHealthCheckHttpRequest, Operation>
      deleteRegionHealthCheckSettings() {
    return deleteRegionHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to getRegionHealthCheck. */
  public UnaryCallSettings<GetRegionHealthCheckHttpRequest, HealthCheck>
      getRegionHealthCheckSettings() {
    return getRegionHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to insertRegionHealthCheck. */
  public UnaryCallSettings<InsertRegionHealthCheckHttpRequest, Operation>
      insertRegionHealthCheckSettings() {
    return insertRegionHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to listRegionHealthChecks. */
  public PagedCallSettings<
          ListRegionHealthChecksHttpRequest, HealthCheckList, ListRegionHealthChecksPagedResponse>
      listRegionHealthChecksSettings() {
    return listRegionHealthChecksSettings;
  }

  /** Returns the object with the settings used for calls to patchRegionHealthCheck. */
  public UnaryCallSettings<PatchRegionHealthCheckHttpRequest, Operation>
      patchRegionHealthCheckSettings() {
    return patchRegionHealthCheckSettings;
  }

  /** Returns the object with the settings used for calls to updateRegionHealthCheck. */
  public UnaryCallSettings<UpdateRegionHealthCheckHttpRequest, Operation>
      updateRegionHealthCheckSettings() {
    return updateRegionHealthCheckSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RegionHealthCheckStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonRegionHealthCheckStub.create(this);
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
    return "https://compute.googleapis.com/compute/v1/projects/";
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
            "gapic", GaxProperties.getLibraryVersion(RegionHealthCheckStubSettings.class))
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

  protected RegionHealthCheckStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteRegionHealthCheckSettings = settingsBuilder.deleteRegionHealthCheckSettings().build();
    getRegionHealthCheckSettings = settingsBuilder.getRegionHealthCheckSettings().build();
    insertRegionHealthCheckSettings = settingsBuilder.insertRegionHealthCheckSettings().build();
    listRegionHealthChecksSettings = settingsBuilder.listRegionHealthChecksSettings().build();
    patchRegionHealthCheckSettings = settingsBuilder.patchRegionHealthCheckSettings().build();
    updateRegionHealthCheckSettings = settingsBuilder.updateRegionHealthCheckSettings().build();
  }

  private static final PagedListDescriptor<
          ListRegionHealthChecksHttpRequest, HealthCheckList, HealthCheck>
      LIST_REGION_HEALTH_CHECKS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListRegionHealthChecksHttpRequest, HealthCheckList, HealthCheck>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRegionHealthChecksHttpRequest injectToken(
                ListRegionHealthChecksHttpRequest payload, String token) {
              return ListRegionHealthChecksHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListRegionHealthChecksHttpRequest injectPageSize(
                ListRegionHealthChecksHttpRequest payload, int pageSize) {
              return ListRegionHealthChecksHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListRegionHealthChecksHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(HealthCheckList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<HealthCheck> extractResources(HealthCheckList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<HealthCheck>of();
            }
          };

  private static final PagedListResponseFactory<
          ListRegionHealthChecksHttpRequest, HealthCheckList, ListRegionHealthChecksPagedResponse>
      LIST_REGION_HEALTH_CHECKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRegionHealthChecksHttpRequest,
              HealthCheckList,
              ListRegionHealthChecksPagedResponse>() {
            @Override
            public ApiFuture<ListRegionHealthChecksPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListRegionHealthChecksHttpRequest, HealthCheckList> callable,
                ListRegionHealthChecksHttpRequest request,
                ApiCallContext context,
                ApiFuture<HealthCheckList> futureResponse) {
              PageContext<ListRegionHealthChecksHttpRequest, HealthCheckList, HealthCheck>
                  pageContext =
                      PageContext.create(
                          callable, LIST_REGION_HEALTH_CHECKS_PAGE_STR_DESC, request, context);
              return ListRegionHealthChecksPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for RegionHealthCheckStubSettings. */
  public static class Builder extends StubSettings.Builder<RegionHealthCheckStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteRegionHealthCheckHttpRequest, Operation>
        deleteRegionHealthCheckSettings;
    private final UnaryCallSettings.Builder<GetRegionHealthCheckHttpRequest, HealthCheck>
        getRegionHealthCheckSettings;
    private final UnaryCallSettings.Builder<InsertRegionHealthCheckHttpRequest, Operation>
        insertRegionHealthCheckSettings;
    private final PagedCallSettings.Builder<
            ListRegionHealthChecksHttpRequest, HealthCheckList, ListRegionHealthChecksPagedResponse>
        listRegionHealthChecksSettings;
    private final UnaryCallSettings.Builder<PatchRegionHealthCheckHttpRequest, Operation>
        patchRegionHealthCheckSettings;
    private final UnaryCallSettings.Builder<UpdateRegionHealthCheckHttpRequest, Operation>
        updateRegionHealthCheckSettings;

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

      deleteRegionHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getRegionHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertRegionHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listRegionHealthChecksSettings =
          PagedCallSettings.newBuilder(LIST_REGION_HEALTH_CHECKS_PAGE_STR_FACT);

      patchRegionHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updateRegionHealthCheckSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteRegionHealthCheckSettings,
              getRegionHealthCheckSettings,
              insertRegionHealthCheckSettings,
              listRegionHealthChecksSettings,
              patchRegionHealthCheckSettings,
              updateRegionHealthCheckSettings);

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
          .deleteRegionHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getRegionHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertRegionHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listRegionHealthChecksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchRegionHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updateRegionHealthCheckSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(RegionHealthCheckStubSettings settings) {
      super(settings);

      deleteRegionHealthCheckSettings = settings.deleteRegionHealthCheckSettings.toBuilder();
      getRegionHealthCheckSettings = settings.getRegionHealthCheckSettings.toBuilder();
      insertRegionHealthCheckSettings = settings.insertRegionHealthCheckSettings.toBuilder();
      listRegionHealthChecksSettings = settings.listRegionHealthChecksSettings.toBuilder();
      patchRegionHealthCheckSettings = settings.patchRegionHealthCheckSettings.toBuilder();
      updateRegionHealthCheckSettings = settings.updateRegionHealthCheckSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteRegionHealthCheckSettings,
              getRegionHealthCheckSettings,
              insertRegionHealthCheckSettings,
              listRegionHealthChecksSettings,
              patchRegionHealthCheckSettings,
              updateRegionHealthCheckSettings);
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

    /** Returns the builder for the settings used for calls to deleteRegionHealthCheck. */
    public UnaryCallSettings.Builder<DeleteRegionHealthCheckHttpRequest, Operation>
        deleteRegionHealthCheckSettings() {
      return deleteRegionHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to getRegionHealthCheck. */
    public UnaryCallSettings.Builder<GetRegionHealthCheckHttpRequest, HealthCheck>
        getRegionHealthCheckSettings() {
      return getRegionHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to insertRegionHealthCheck. */
    public UnaryCallSettings.Builder<InsertRegionHealthCheckHttpRequest, Operation>
        insertRegionHealthCheckSettings() {
      return insertRegionHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to listRegionHealthChecks. */
    public PagedCallSettings.Builder<
            ListRegionHealthChecksHttpRequest, HealthCheckList, ListRegionHealthChecksPagedResponse>
        listRegionHealthChecksSettings() {
      return listRegionHealthChecksSettings;
    }

    /** Returns the builder for the settings used for calls to patchRegionHealthCheck. */
    public UnaryCallSettings.Builder<PatchRegionHealthCheckHttpRequest, Operation>
        patchRegionHealthCheckSettings() {
      return patchRegionHealthCheckSettings;
    }

    /** Returns the builder for the settings used for calls to updateRegionHealthCheck. */
    public UnaryCallSettings.Builder<UpdateRegionHealthCheckHttpRequest, Operation>
        updateRegionHealthCheckSettings() {
      return updateRegionHealthCheckSettings;
    }

    @Override
    public RegionHealthCheckStubSettings build() throws IOException {
      return new RegionHealthCheckStubSettings(this);
    }
  }
}
