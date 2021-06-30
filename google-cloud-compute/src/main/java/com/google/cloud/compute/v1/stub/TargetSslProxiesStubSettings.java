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

import static com.google.cloud.compute.v1.TargetSslProxiesClient.ListPagedResponse;

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
import com.google.cloud.compute.v1.DeleteTargetSslProxyRequest;
import com.google.cloud.compute.v1.GetTargetSslProxyRequest;
import com.google.cloud.compute.v1.InsertTargetSslProxyRequest;
import com.google.cloud.compute.v1.ListTargetSslProxiesRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetBackendServiceTargetSslProxyRequest;
import com.google.cloud.compute.v1.SetProxyHeaderTargetSslProxyRequest;
import com.google.cloud.compute.v1.SetSslCertificatesTargetSslProxyRequest;
import com.google.cloud.compute.v1.SetSslPolicyTargetSslProxyRequest;
import com.google.cloud.compute.v1.TargetSslProxy;
import com.google.cloud.compute.v1.TargetSslProxyList;
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
 * Settings class to configure an instance of {@link TargetSslProxiesStub}.
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
 * TargetSslProxiesStubSettings.Builder targetSslProxiesSettingsBuilder =
 *     TargetSslProxiesStubSettings.newBuilder();
 * targetSslProxiesSettingsBuilder
 *     .deleteSettings()
 *     .setRetrySettings(
 *         targetSslProxiesSettingsBuilder
 *             .deleteSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * TargetSslProxiesStubSettings targetSslProxiesSettings = targetSslProxiesSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class TargetSslProxiesStubSettings extends StubSettings<TargetSslProxiesStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/cloud-platform")
          .build();

  private final UnaryCallSettings<DeleteTargetSslProxyRequest, Operation> deleteSettings;
  private final UnaryCallSettings<GetTargetSslProxyRequest, TargetSslProxy> getSettings;
  private final UnaryCallSettings<InsertTargetSslProxyRequest, Operation> insertSettings;
  private final PagedCallSettings<
          ListTargetSslProxiesRequest, TargetSslProxyList, ListPagedResponse>
      listSettings;
  private final UnaryCallSettings<SetBackendServiceTargetSslProxyRequest, Operation>
      setBackendServiceSettings;
  private final UnaryCallSettings<SetProxyHeaderTargetSslProxyRequest, Operation>
      setProxyHeaderSettings;
  private final UnaryCallSettings<SetSslCertificatesTargetSslProxyRequest, Operation>
      setSslCertificatesSettings;
  private final UnaryCallSettings<SetSslPolicyTargetSslProxyRequest, Operation>
      setSslPolicySettings;

  private static final PagedListDescriptor<
          ListTargetSslProxiesRequest, TargetSslProxyList, TargetSslProxy>
      LIST_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTargetSslProxiesRequest, TargetSslProxyList, TargetSslProxy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTargetSslProxiesRequest injectToken(
                ListTargetSslProxiesRequest payload, String token) {
              return ListTargetSslProxiesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTargetSslProxiesRequest injectPageSize(
                ListTargetSslProxiesRequest payload, int pageSize) {
              return ListTargetSslProxiesRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListTargetSslProxiesRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(TargetSslProxyList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TargetSslProxy> extractResources(TargetSslProxyList payload) {
              return payload.getItemsList() == null
                  ? ImmutableList.<TargetSslProxy>of()
                  : payload.getItemsList();
            }
          };

  private static final PagedListResponseFactory<
          ListTargetSslProxiesRequest, TargetSslProxyList, ListPagedResponse>
      LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTargetSslProxiesRequest, TargetSslProxyList, ListPagedResponse>() {
            @Override
            public ApiFuture<ListPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTargetSslProxiesRequest, TargetSslProxyList> callable,
                ListTargetSslProxiesRequest request,
                ApiCallContext context,
                ApiFuture<TargetSslProxyList> futureResponse) {
              PageContext<ListTargetSslProxiesRequest, TargetSslProxyList, TargetSslProxy>
                  pageContext = PageContext.create(callable, LIST_PAGE_STR_DESC, request, context);
              return ListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteTargetSslProxyRequest, Operation> deleteSettings() {
    return deleteSettings;
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetTargetSslProxyRequest, TargetSslProxy> getSettings() {
    return getSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertTargetSslProxyRequest, Operation> insertSettings() {
    return insertSettings;
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<ListTargetSslProxiesRequest, TargetSslProxyList, ListPagedResponse>
      listSettings() {
    return listSettings;
  }

  /** Returns the object with the settings used for calls to setBackendService. */
  public UnaryCallSettings<SetBackendServiceTargetSslProxyRequest, Operation>
      setBackendServiceSettings() {
    return setBackendServiceSettings;
  }

  /** Returns the object with the settings used for calls to setProxyHeader. */
  public UnaryCallSettings<SetProxyHeaderTargetSslProxyRequest, Operation>
      setProxyHeaderSettings() {
    return setProxyHeaderSettings;
  }

  /** Returns the object with the settings used for calls to setSslCertificates. */
  public UnaryCallSettings<SetSslCertificatesTargetSslProxyRequest, Operation>
      setSslCertificatesSettings() {
    return setSslCertificatesSettings;
  }

  /** Returns the object with the settings used for calls to setSslPolicy. */
  public UnaryCallSettings<SetSslPolicyTargetSslProxyRequest, Operation> setSslPolicySettings() {
    return setSslPolicySettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public TargetSslProxiesStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonTargetSslProxiesStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(TargetSslProxiesStubSettings.class))
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

  protected TargetSslProxiesStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteSettings = settingsBuilder.deleteSettings().build();
    getSettings = settingsBuilder.getSettings().build();
    insertSettings = settingsBuilder.insertSettings().build();
    listSettings = settingsBuilder.listSettings().build();
    setBackendServiceSettings = settingsBuilder.setBackendServiceSettings().build();
    setProxyHeaderSettings = settingsBuilder.setProxyHeaderSettings().build();
    setSslCertificatesSettings = settingsBuilder.setSslCertificatesSettings().build();
    setSslPolicySettings = settingsBuilder.setSslPolicySettings().build();
  }

  /** Builder for TargetSslProxiesStubSettings. */
  public static class Builder extends StubSettings.Builder<TargetSslProxiesStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<DeleteTargetSslProxyRequest, Operation> deleteSettings;
    private final UnaryCallSettings.Builder<GetTargetSslProxyRequest, TargetSslProxy> getSettings;
    private final UnaryCallSettings.Builder<InsertTargetSslProxyRequest, Operation> insertSettings;
    private final PagedCallSettings.Builder<
            ListTargetSslProxiesRequest, TargetSslProxyList, ListPagedResponse>
        listSettings;
    private final UnaryCallSettings.Builder<SetBackendServiceTargetSslProxyRequest, Operation>
        setBackendServiceSettings;
    private final UnaryCallSettings.Builder<SetProxyHeaderTargetSslProxyRequest, Operation>
        setProxyHeaderSettings;
    private final UnaryCallSettings.Builder<SetSslCertificatesTargetSslProxyRequest, Operation>
        setSslCertificatesSettings;
    private final UnaryCallSettings.Builder<SetSslPolicyTargetSslProxyRequest, Operation>
        setSslPolicySettings;
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
      setBackendServiceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setProxyHeaderSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setSslCertificatesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setSslPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteSettings,
              getSettings,
              insertSettings,
              listSettings,
              setBackendServiceSettings,
              setProxyHeaderSettings,
              setSslCertificatesSettings,
              setSslPolicySettings);
      initDefaults(this);
    }

    protected Builder(TargetSslProxiesStubSettings settings) {
      super(settings);

      deleteSettings = settings.deleteSettings.toBuilder();
      getSettings = settings.getSettings.toBuilder();
      insertSettings = settings.insertSettings.toBuilder();
      listSettings = settings.listSettings.toBuilder();
      setBackendServiceSettings = settings.setBackendServiceSettings.toBuilder();
      setProxyHeaderSettings = settings.setProxyHeaderSettings.toBuilder();
      setSslCertificatesSettings = settings.setSslCertificatesSettings.toBuilder();
      setSslPolicySettings = settings.setSslPolicySettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteSettings,
              getSettings,
              insertSettings,
              listSettings,
              setBackendServiceSettings,
              setProxyHeaderSettings,
              setSslCertificatesSettings,
              setSslPolicySettings);
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
          .setBackendServiceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .setProxyHeaderSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .setSslCertificatesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .setSslPolicySettings()
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
    public UnaryCallSettings.Builder<DeleteTargetSslProxyRequest, Operation> deleteSettings() {
      return deleteSettings;
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetTargetSslProxyRequest, TargetSslProxy> getSettings() {
      return getSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertTargetSslProxyRequest, Operation> insertSettings() {
      return insertSettings;
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListTargetSslProxiesRequest, TargetSslProxyList, ListPagedResponse>
        listSettings() {
      return listSettings;
    }

    /** Returns the builder for the settings used for calls to setBackendService. */
    public UnaryCallSettings.Builder<SetBackendServiceTargetSslProxyRequest, Operation>
        setBackendServiceSettings() {
      return setBackendServiceSettings;
    }

    /** Returns the builder for the settings used for calls to setProxyHeader. */
    public UnaryCallSettings.Builder<SetProxyHeaderTargetSslProxyRequest, Operation>
        setProxyHeaderSettings() {
      return setProxyHeaderSettings;
    }

    /** Returns the builder for the settings used for calls to setSslCertificates. */
    public UnaryCallSettings.Builder<SetSslCertificatesTargetSslProxyRequest, Operation>
        setSslCertificatesSettings() {
      return setSslCertificatesSettings;
    }

    /** Returns the builder for the settings used for calls to setSslPolicy. */
    public UnaryCallSettings.Builder<SetSslPolicyTargetSslProxyRequest, Operation>
        setSslPolicySettings() {
      return setSslPolicySettings;
    }

    @Override
    public TargetSslProxiesStubSettings build() throws IOException {
      return new TargetSslProxiesStubSettings(this);
    }
  }
}
