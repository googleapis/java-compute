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

import static com.google.cloud.compute.v1.SecurityPolicyClient.ListSecurityPoliciesPagedResponse;

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
import com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.DeleteSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.GetSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest;
import com.google.cloud.compute.v1.SecurityPolicy;
import com.google.cloud.compute.v1.SecurityPolicyList;
import com.google.cloud.compute.v1.SecurityPolicyRule;
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
 * Settings class to configure an instance of {@link SecurityPolicyStub}.
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
 * <p>For example, to set the total timeout of addRuleSecurityPolicy to 30 seconds:
 *
 * <pre>
 * <code>
 * SecurityPolicyStubSettings.Builder securityPolicySettingsBuilder =
 *     SecurityPolicyStubSettings.newBuilder();
 * securityPolicySettingsBuilder.addRuleSecurityPolicySettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * SecurityPolicyStubSettings securityPolicySettings = securityPolicySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class SecurityPolicyStubSettings extends StubSettings<SecurityPolicyStubSettings> {
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

  private final UnaryCallSettings<AddRuleSecurityPolicyHttpRequest, Operation>
      addRuleSecurityPolicySettings;
  private final UnaryCallSettings<DeleteSecurityPolicyHttpRequest, Operation>
      deleteSecurityPolicySettings;
  private final UnaryCallSettings<GetSecurityPolicyHttpRequest, SecurityPolicy>
      getSecurityPolicySettings;
  private final UnaryCallSettings<GetRuleSecurityPolicyHttpRequest, SecurityPolicyRule>
      getRuleSecurityPolicySettings;
  private final UnaryCallSettings<InsertSecurityPolicyHttpRequest, Operation>
      insertSecurityPolicySettings;
  private final PagedCallSettings<
          ListSecurityPoliciesHttpRequest, SecurityPolicyList, ListSecurityPoliciesPagedResponse>
      listSecurityPoliciesSettings;
  private final UnaryCallSettings<PatchSecurityPolicyHttpRequest, Operation>
      patchSecurityPolicySettings;
  private final UnaryCallSettings<PatchRuleSecurityPolicyHttpRequest, Operation>
      patchRuleSecurityPolicySettings;
  private final UnaryCallSettings<RemoveRuleSecurityPolicyHttpRequest, Operation>
      removeRuleSecurityPolicySettings;

  /** Returns the object with the settings used for calls to addRuleSecurityPolicy. */
  public UnaryCallSettings<AddRuleSecurityPolicyHttpRequest, Operation>
      addRuleSecurityPolicySettings() {
    return addRuleSecurityPolicySettings;
  }

  /** Returns the object with the settings used for calls to deleteSecurityPolicy. */
  public UnaryCallSettings<DeleteSecurityPolicyHttpRequest, Operation>
      deleteSecurityPolicySettings() {
    return deleteSecurityPolicySettings;
  }

  /** Returns the object with the settings used for calls to getSecurityPolicy. */
  public UnaryCallSettings<GetSecurityPolicyHttpRequest, SecurityPolicy>
      getSecurityPolicySettings() {
    return getSecurityPolicySettings;
  }

  /** Returns the object with the settings used for calls to getRuleSecurityPolicy. */
  public UnaryCallSettings<GetRuleSecurityPolicyHttpRequest, SecurityPolicyRule>
      getRuleSecurityPolicySettings() {
    return getRuleSecurityPolicySettings;
  }

  /** Returns the object with the settings used for calls to insertSecurityPolicy. */
  public UnaryCallSettings<InsertSecurityPolicyHttpRequest, Operation>
      insertSecurityPolicySettings() {
    return insertSecurityPolicySettings;
  }

  /** Returns the object with the settings used for calls to listSecurityPolicies. */
  public PagedCallSettings<
          ListSecurityPoliciesHttpRequest, SecurityPolicyList, ListSecurityPoliciesPagedResponse>
      listSecurityPoliciesSettings() {
    return listSecurityPoliciesSettings;
  }

  /** Returns the object with the settings used for calls to patchSecurityPolicy. */
  public UnaryCallSettings<PatchSecurityPolicyHttpRequest, Operation>
      patchSecurityPolicySettings() {
    return patchSecurityPolicySettings;
  }

  /** Returns the object with the settings used for calls to patchRuleSecurityPolicy. */
  public UnaryCallSettings<PatchRuleSecurityPolicyHttpRequest, Operation>
      patchRuleSecurityPolicySettings() {
    return patchRuleSecurityPolicySettings;
  }

  /** Returns the object with the settings used for calls to removeRuleSecurityPolicy. */
  public UnaryCallSettings<RemoveRuleSecurityPolicyHttpRequest, Operation>
      removeRuleSecurityPolicySettings() {
    return removeRuleSecurityPolicySettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SecurityPolicyStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonSecurityPolicyStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(SecurityPolicyStubSettings.class))
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

  protected SecurityPolicyStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    addRuleSecurityPolicySettings = settingsBuilder.addRuleSecurityPolicySettings().build();
    deleteSecurityPolicySettings = settingsBuilder.deleteSecurityPolicySettings().build();
    getSecurityPolicySettings = settingsBuilder.getSecurityPolicySettings().build();
    getRuleSecurityPolicySettings = settingsBuilder.getRuleSecurityPolicySettings().build();
    insertSecurityPolicySettings = settingsBuilder.insertSecurityPolicySettings().build();
    listSecurityPoliciesSettings = settingsBuilder.listSecurityPoliciesSettings().build();
    patchSecurityPolicySettings = settingsBuilder.patchSecurityPolicySettings().build();
    patchRuleSecurityPolicySettings = settingsBuilder.patchRuleSecurityPolicySettings().build();
    removeRuleSecurityPolicySettings = settingsBuilder.removeRuleSecurityPolicySettings().build();
  }

  private static final PagedListDescriptor<
          ListSecurityPoliciesHttpRequest, SecurityPolicyList, SecurityPolicy>
      LIST_SECURITY_POLICIES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListSecurityPoliciesHttpRequest, SecurityPolicyList, SecurityPolicy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSecurityPoliciesHttpRequest injectToken(
                ListSecurityPoliciesHttpRequest payload, String token) {
              return ListSecurityPoliciesHttpRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListSecurityPoliciesHttpRequest injectPageSize(
                ListSecurityPoliciesHttpRequest payload, int pageSize) {
              return ListSecurityPoliciesHttpRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListSecurityPoliciesHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(SecurityPolicyList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SecurityPolicy> extractResources(SecurityPolicyList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<SecurityPolicy>of();
            }
          };

  private static final PagedListResponseFactory<
          ListSecurityPoliciesHttpRequest, SecurityPolicyList, ListSecurityPoliciesPagedResponse>
      LIST_SECURITY_POLICIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSecurityPoliciesHttpRequest,
              SecurityPolicyList,
              ListSecurityPoliciesPagedResponse>() {
            @Override
            public ApiFuture<ListSecurityPoliciesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSecurityPoliciesHttpRequest, SecurityPolicyList> callable,
                ListSecurityPoliciesHttpRequest request,
                ApiCallContext context,
                ApiFuture<SecurityPolicyList> futureResponse) {
              PageContext<ListSecurityPoliciesHttpRequest, SecurityPolicyList, SecurityPolicy>
                  pageContext =
                      PageContext.create(
                          callable, LIST_SECURITY_POLICIES_PAGE_STR_DESC, request, context);
              return ListSecurityPoliciesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for SecurityPolicyStubSettings. */
  public static class Builder extends StubSettings.Builder<SecurityPolicyStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<AddRuleSecurityPolicyHttpRequest, Operation>
        addRuleSecurityPolicySettings;
    private final UnaryCallSettings.Builder<DeleteSecurityPolicyHttpRequest, Operation>
        deleteSecurityPolicySettings;
    private final UnaryCallSettings.Builder<GetSecurityPolicyHttpRequest, SecurityPolicy>
        getSecurityPolicySettings;
    private final UnaryCallSettings.Builder<GetRuleSecurityPolicyHttpRequest, SecurityPolicyRule>
        getRuleSecurityPolicySettings;
    private final UnaryCallSettings.Builder<InsertSecurityPolicyHttpRequest, Operation>
        insertSecurityPolicySettings;
    private final PagedCallSettings.Builder<
            ListSecurityPoliciesHttpRequest, SecurityPolicyList, ListSecurityPoliciesPagedResponse>
        listSecurityPoliciesSettings;
    private final UnaryCallSettings.Builder<PatchSecurityPolicyHttpRequest, Operation>
        patchSecurityPolicySettings;
    private final UnaryCallSettings.Builder<PatchRuleSecurityPolicyHttpRequest, Operation>
        patchRuleSecurityPolicySettings;
    private final UnaryCallSettings.Builder<RemoveRuleSecurityPolicyHttpRequest, Operation>
        removeRuleSecurityPolicySettings;

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

      addRuleSecurityPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deleteSecurityPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getSecurityPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getRuleSecurityPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertSecurityPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listSecurityPoliciesSettings =
          PagedCallSettings.newBuilder(LIST_SECURITY_POLICIES_PAGE_STR_FACT);

      patchSecurityPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      patchRuleSecurityPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      removeRuleSecurityPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              addRuleSecurityPolicySettings,
              deleteSecurityPolicySettings,
              getSecurityPolicySettings,
              getRuleSecurityPolicySettings,
              insertSecurityPolicySettings,
              listSecurityPoliciesSettings,
              patchSecurityPolicySettings,
              patchRuleSecurityPolicySettings,
              removeRuleSecurityPolicySettings);

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
          .addRuleSecurityPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteSecurityPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getSecurityPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getRuleSecurityPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertSecurityPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listSecurityPoliciesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchSecurityPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchRuleSecurityPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .removeRuleSecurityPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(SecurityPolicyStubSettings settings) {
      super(settings);

      addRuleSecurityPolicySettings = settings.addRuleSecurityPolicySettings.toBuilder();
      deleteSecurityPolicySettings = settings.deleteSecurityPolicySettings.toBuilder();
      getSecurityPolicySettings = settings.getSecurityPolicySettings.toBuilder();
      getRuleSecurityPolicySettings = settings.getRuleSecurityPolicySettings.toBuilder();
      insertSecurityPolicySettings = settings.insertSecurityPolicySettings.toBuilder();
      listSecurityPoliciesSettings = settings.listSecurityPoliciesSettings.toBuilder();
      patchSecurityPolicySettings = settings.patchSecurityPolicySettings.toBuilder();
      patchRuleSecurityPolicySettings = settings.patchRuleSecurityPolicySettings.toBuilder();
      removeRuleSecurityPolicySettings = settings.removeRuleSecurityPolicySettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              addRuleSecurityPolicySettings,
              deleteSecurityPolicySettings,
              getSecurityPolicySettings,
              getRuleSecurityPolicySettings,
              insertSecurityPolicySettings,
              listSecurityPoliciesSettings,
              patchSecurityPolicySettings,
              patchRuleSecurityPolicySettings,
              removeRuleSecurityPolicySettings);
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

    /** Returns the builder for the settings used for calls to addRuleSecurityPolicy. */
    public UnaryCallSettings.Builder<AddRuleSecurityPolicyHttpRequest, Operation>
        addRuleSecurityPolicySettings() {
      return addRuleSecurityPolicySettings;
    }

    /** Returns the builder for the settings used for calls to deleteSecurityPolicy. */
    public UnaryCallSettings.Builder<DeleteSecurityPolicyHttpRequest, Operation>
        deleteSecurityPolicySettings() {
      return deleteSecurityPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getSecurityPolicy. */
    public UnaryCallSettings.Builder<GetSecurityPolicyHttpRequest, SecurityPolicy>
        getSecurityPolicySettings() {
      return getSecurityPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getRuleSecurityPolicy. */
    public UnaryCallSettings.Builder<GetRuleSecurityPolicyHttpRequest, SecurityPolicyRule>
        getRuleSecurityPolicySettings() {
      return getRuleSecurityPolicySettings;
    }

    /** Returns the builder for the settings used for calls to insertSecurityPolicy. */
    public UnaryCallSettings.Builder<InsertSecurityPolicyHttpRequest, Operation>
        insertSecurityPolicySettings() {
      return insertSecurityPolicySettings;
    }

    /** Returns the builder for the settings used for calls to listSecurityPolicies. */
    public PagedCallSettings.Builder<
            ListSecurityPoliciesHttpRequest, SecurityPolicyList, ListSecurityPoliciesPagedResponse>
        listSecurityPoliciesSettings() {
      return listSecurityPoliciesSettings;
    }

    /** Returns the builder for the settings used for calls to patchSecurityPolicy. */
    public UnaryCallSettings.Builder<PatchSecurityPolicyHttpRequest, Operation>
        patchSecurityPolicySettings() {
      return patchSecurityPolicySettings;
    }

    /** Returns the builder for the settings used for calls to patchRuleSecurityPolicy. */
    public UnaryCallSettings.Builder<PatchRuleSecurityPolicyHttpRequest, Operation>
        patchRuleSecurityPolicySettings() {
      return patchRuleSecurityPolicySettings;
    }

    /** Returns the builder for the settings used for calls to removeRuleSecurityPolicy. */
    public UnaryCallSettings.Builder<RemoveRuleSecurityPolicyHttpRequest, Operation>
        removeRuleSecurityPolicySettings() {
      return removeRuleSecurityPolicySettings;
    }

    @Override
    public SecurityPolicyStubSettings build() throws IOException {
      return new SecurityPolicyStubSettings(this);
    }
  }
}
