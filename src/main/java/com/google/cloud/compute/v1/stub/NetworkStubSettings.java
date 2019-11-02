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

import static com.google.cloud.compute.v1.NetworkClient.ListNetworksPagedResponse;

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
import com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest;
import com.google.cloud.compute.v1.DeleteNetworkHttpRequest;
import com.google.cloud.compute.v1.GetNetworkHttpRequest;
import com.google.cloud.compute.v1.InsertNetworkHttpRequest;
import com.google.cloud.compute.v1.ListNetworksHttpRequest;
import com.google.cloud.compute.v1.Network;
import com.google.cloud.compute.v1.NetworkList;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchNetworkHttpRequest;
import com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest;
import com.google.cloud.compute.v1.SwitchToCustomModeNetworkHttpRequest;
import com.google.cloud.compute.v1.UpdatePeeringNetworkHttpRequest;
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
 * Settings class to configure an instance of {@link NetworkStub}.
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
 * <p>For example, to set the total timeout of addPeeringNetwork to 30 seconds:
 *
 * <pre>
 * <code>
 * NetworkStubSettings.Builder networkSettingsBuilder =
 *     NetworkStubSettings.newBuilder();
 * networkSettingsBuilder.addPeeringNetworkSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * NetworkStubSettings networkSettings = networkSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class NetworkStubSettings extends StubSettings<NetworkStubSettings> {
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

  private final UnaryCallSettings<AddPeeringNetworkHttpRequest, Operation>
      addPeeringNetworkSettings;
  private final UnaryCallSettings<DeleteNetworkHttpRequest, Operation> deleteNetworkSettings;
  private final UnaryCallSettings<GetNetworkHttpRequest, Network> getNetworkSettings;
  private final UnaryCallSettings<InsertNetworkHttpRequest, Operation> insertNetworkSettings;
  private final PagedCallSettings<ListNetworksHttpRequest, NetworkList, ListNetworksPagedResponse>
      listNetworksSettings;
  private final UnaryCallSettings<PatchNetworkHttpRequest, Operation> patchNetworkSettings;
  private final UnaryCallSettings<RemovePeeringNetworkHttpRequest, Operation>
      removePeeringNetworkSettings;
  private final UnaryCallSettings<SwitchToCustomModeNetworkHttpRequest, Operation>
      switchToCustomModeNetworkSettings;
  private final UnaryCallSettings<UpdatePeeringNetworkHttpRequest, Operation>
      updatePeeringNetworkSettings;

  /** Returns the object with the settings used for calls to addPeeringNetwork. */
  public UnaryCallSettings<AddPeeringNetworkHttpRequest, Operation> addPeeringNetworkSettings() {
    return addPeeringNetworkSettings;
  }

  /** Returns the object with the settings used for calls to deleteNetwork. */
  public UnaryCallSettings<DeleteNetworkHttpRequest, Operation> deleteNetworkSettings() {
    return deleteNetworkSettings;
  }

  /** Returns the object with the settings used for calls to getNetwork. */
  public UnaryCallSettings<GetNetworkHttpRequest, Network> getNetworkSettings() {
    return getNetworkSettings;
  }

  /** Returns the object with the settings used for calls to insertNetwork. */
  public UnaryCallSettings<InsertNetworkHttpRequest, Operation> insertNetworkSettings() {
    return insertNetworkSettings;
  }

  /** Returns the object with the settings used for calls to listNetworks. */
  public PagedCallSettings<ListNetworksHttpRequest, NetworkList, ListNetworksPagedResponse>
      listNetworksSettings() {
    return listNetworksSettings;
  }

  /** Returns the object with the settings used for calls to patchNetwork. */
  public UnaryCallSettings<PatchNetworkHttpRequest, Operation> patchNetworkSettings() {
    return patchNetworkSettings;
  }

  /** Returns the object with the settings used for calls to removePeeringNetwork. */
  public UnaryCallSettings<RemovePeeringNetworkHttpRequest, Operation>
      removePeeringNetworkSettings() {
    return removePeeringNetworkSettings;
  }

  /** Returns the object with the settings used for calls to switchToCustomModeNetwork. */
  public UnaryCallSettings<SwitchToCustomModeNetworkHttpRequest, Operation>
      switchToCustomModeNetworkSettings() {
    return switchToCustomModeNetworkSettings;
  }

  /** Returns the object with the settings used for calls to updatePeeringNetwork. */
  public UnaryCallSettings<UpdatePeeringNetworkHttpRequest, Operation>
      updatePeeringNetworkSettings() {
    return updatePeeringNetworkSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public NetworkStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonNetworkStub.create(this);
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
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(NetworkStubSettings.class))
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

  protected NetworkStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    addPeeringNetworkSettings = settingsBuilder.addPeeringNetworkSettings().build();
    deleteNetworkSettings = settingsBuilder.deleteNetworkSettings().build();
    getNetworkSettings = settingsBuilder.getNetworkSettings().build();
    insertNetworkSettings = settingsBuilder.insertNetworkSettings().build();
    listNetworksSettings = settingsBuilder.listNetworksSettings().build();
    patchNetworkSettings = settingsBuilder.patchNetworkSettings().build();
    removePeeringNetworkSettings = settingsBuilder.removePeeringNetworkSettings().build();
    switchToCustomModeNetworkSettings = settingsBuilder.switchToCustomModeNetworkSettings().build();
    updatePeeringNetworkSettings = settingsBuilder.updatePeeringNetworkSettings().build();
  }

  private static final PagedListDescriptor<ListNetworksHttpRequest, NetworkList, Network>
      LIST_NETWORKS_PAGE_STR_DESC =
          new PagedListDescriptor<ListNetworksHttpRequest, NetworkList, Network>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListNetworksHttpRequest injectToken(
                ListNetworksHttpRequest payload, String token) {
              return ListNetworksHttpRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListNetworksHttpRequest injectPageSize(
                ListNetworksHttpRequest payload, int pageSize) {
              return ListNetworksHttpRequest.newBuilder(payload).setMaxResults(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListNetworksHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(NetworkList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Network> extractResources(NetworkList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<Network>of();
            }
          };

  private static final PagedListResponseFactory<
          ListNetworksHttpRequest, NetworkList, ListNetworksPagedResponse>
      LIST_NETWORKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListNetworksHttpRequest, NetworkList, ListNetworksPagedResponse>() {
            @Override
            public ApiFuture<ListNetworksPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListNetworksHttpRequest, NetworkList> callable,
                ListNetworksHttpRequest request,
                ApiCallContext context,
                ApiFuture<NetworkList> futureResponse) {
              PageContext<ListNetworksHttpRequest, NetworkList, Network> pageContext =
                  PageContext.create(callable, LIST_NETWORKS_PAGE_STR_DESC, request, context);
              return ListNetworksPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for NetworkStubSettings. */
  public static class Builder extends StubSettings.Builder<NetworkStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<AddPeeringNetworkHttpRequest, Operation>
        addPeeringNetworkSettings;
    private final UnaryCallSettings.Builder<DeleteNetworkHttpRequest, Operation>
        deleteNetworkSettings;
    private final UnaryCallSettings.Builder<GetNetworkHttpRequest, Network> getNetworkSettings;
    private final UnaryCallSettings.Builder<InsertNetworkHttpRequest, Operation>
        insertNetworkSettings;
    private final PagedCallSettings.Builder<
            ListNetworksHttpRequest, NetworkList, ListNetworksPagedResponse>
        listNetworksSettings;
    private final UnaryCallSettings.Builder<PatchNetworkHttpRequest, Operation>
        patchNetworkSettings;
    private final UnaryCallSettings.Builder<RemovePeeringNetworkHttpRequest, Operation>
        removePeeringNetworkSettings;
    private final UnaryCallSettings.Builder<SwitchToCustomModeNetworkHttpRequest, Operation>
        switchToCustomModeNetworkSettings;
    private final UnaryCallSettings.Builder<UpdatePeeringNetworkHttpRequest, Operation>
        updatePeeringNetworkSettings;

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

      addPeeringNetworkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteNetworkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getNetworkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertNetworkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listNetworksSettings = PagedCallSettings.newBuilder(LIST_NETWORKS_PAGE_STR_FACT);

      patchNetworkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      removePeeringNetworkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      switchToCustomModeNetworkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      updatePeeringNetworkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              addPeeringNetworkSettings,
              deleteNetworkSettings,
              getNetworkSettings,
              insertNetworkSettings,
              listNetworksSettings,
              patchNetworkSettings,
              removePeeringNetworkSettings,
              switchToCustomModeNetworkSettings,
              updatePeeringNetworkSettings);

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
          .addPeeringNetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteNetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getNetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertNetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listNetworksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchNetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .removePeeringNetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .switchToCustomModeNetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updatePeeringNetworkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(NetworkStubSettings settings) {
      super(settings);

      addPeeringNetworkSettings = settings.addPeeringNetworkSettings.toBuilder();
      deleteNetworkSettings = settings.deleteNetworkSettings.toBuilder();
      getNetworkSettings = settings.getNetworkSettings.toBuilder();
      insertNetworkSettings = settings.insertNetworkSettings.toBuilder();
      listNetworksSettings = settings.listNetworksSettings.toBuilder();
      patchNetworkSettings = settings.patchNetworkSettings.toBuilder();
      removePeeringNetworkSettings = settings.removePeeringNetworkSettings.toBuilder();
      switchToCustomModeNetworkSettings = settings.switchToCustomModeNetworkSettings.toBuilder();
      updatePeeringNetworkSettings = settings.updatePeeringNetworkSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              addPeeringNetworkSettings,
              deleteNetworkSettings,
              getNetworkSettings,
              insertNetworkSettings,
              listNetworksSettings,
              patchNetworkSettings,
              removePeeringNetworkSettings,
              switchToCustomModeNetworkSettings,
              updatePeeringNetworkSettings);
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

    /** Returns the builder for the settings used for calls to addPeeringNetwork. */
    public UnaryCallSettings.Builder<AddPeeringNetworkHttpRequest, Operation>
        addPeeringNetworkSettings() {
      return addPeeringNetworkSettings;
    }

    /** Returns the builder for the settings used for calls to deleteNetwork. */
    public UnaryCallSettings.Builder<DeleteNetworkHttpRequest, Operation> deleteNetworkSettings() {
      return deleteNetworkSettings;
    }

    /** Returns the builder for the settings used for calls to getNetwork. */
    public UnaryCallSettings.Builder<GetNetworkHttpRequest, Network> getNetworkSettings() {
      return getNetworkSettings;
    }

    /** Returns the builder for the settings used for calls to insertNetwork. */
    public UnaryCallSettings.Builder<InsertNetworkHttpRequest, Operation> insertNetworkSettings() {
      return insertNetworkSettings;
    }

    /** Returns the builder for the settings used for calls to listNetworks. */
    public PagedCallSettings.Builder<
            ListNetworksHttpRequest, NetworkList, ListNetworksPagedResponse>
        listNetworksSettings() {
      return listNetworksSettings;
    }

    /** Returns the builder for the settings used for calls to patchNetwork. */
    public UnaryCallSettings.Builder<PatchNetworkHttpRequest, Operation> patchNetworkSettings() {
      return patchNetworkSettings;
    }

    /** Returns the builder for the settings used for calls to removePeeringNetwork. */
    public UnaryCallSettings.Builder<RemovePeeringNetworkHttpRequest, Operation>
        removePeeringNetworkSettings() {
      return removePeeringNetworkSettings;
    }

    /** Returns the builder for the settings used for calls to switchToCustomModeNetwork. */
    public UnaryCallSettings.Builder<SwitchToCustomModeNetworkHttpRequest, Operation>
        switchToCustomModeNetworkSettings() {
      return switchToCustomModeNetworkSettings;
    }

    /** Returns the builder for the settings used for calls to updatePeeringNetwork. */
    public UnaryCallSettings.Builder<UpdatePeeringNetworkHttpRequest, Operation>
        updatePeeringNetworkSettings() {
      return updatePeeringNetworkSettings;
    }

    @Override
    public NetworkStubSettings build() throws IOException {
      return new NetworkStubSettings(this);
    }
  }
}
