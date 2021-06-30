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

import static com.google.cloud.compute.v1.FirewallPoliciesClient.ListPagedResponse;

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
import com.google.cloud.compute.v1.AddAssociationFirewallPolicyRequest;
import com.google.cloud.compute.v1.AddRuleFirewallPolicyRequest;
import com.google.cloud.compute.v1.CloneRulesFirewallPolicyRequest;
import com.google.cloud.compute.v1.DeleteFirewallPolicyRequest;
import com.google.cloud.compute.v1.FirewallPoliciesListAssociationsResponse;
import com.google.cloud.compute.v1.FirewallPolicy;
import com.google.cloud.compute.v1.FirewallPolicyAssociation;
import com.google.cloud.compute.v1.FirewallPolicyList;
import com.google.cloud.compute.v1.FirewallPolicyRule;
import com.google.cloud.compute.v1.GetAssociationFirewallPolicyRequest;
import com.google.cloud.compute.v1.GetFirewallPolicyRequest;
import com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest;
import com.google.cloud.compute.v1.GetRuleFirewallPolicyRequest;
import com.google.cloud.compute.v1.InsertFirewallPolicyRequest;
import com.google.cloud.compute.v1.ListAssociationsFirewallPolicyRequest;
import com.google.cloud.compute.v1.ListFirewallPoliciesRequest;
import com.google.cloud.compute.v1.MoveFirewallPolicyRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchFirewallPolicyRequest;
import com.google.cloud.compute.v1.PatchRuleFirewallPolicyRequest;
import com.google.cloud.compute.v1.Policy;
import com.google.cloud.compute.v1.RemoveAssociationFirewallPolicyRequest;
import com.google.cloud.compute.v1.RemoveRuleFirewallPolicyRequest;
import com.google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest;
import com.google.cloud.compute.v1.TestIamPermissionsFirewallPolicyRequest;
import com.google.cloud.compute.v1.TestPermissionsResponse;
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
 * Settings class to configure an instance of {@link FirewallPoliciesStub}.
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
 * <p>For example, to set the total timeout of addAssociation to 30 seconds:
 *
 * <pre>{@code
 * FirewallPoliciesStubSettings.Builder firewallPoliciesSettingsBuilder =
 *     FirewallPoliciesStubSettings.newBuilder();
 * firewallPoliciesSettingsBuilder
 *     .addAssociationSettings()
 *     .setRetrySettings(
 *         firewallPoliciesSettingsBuilder
 *             .addAssociationSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * FirewallPoliciesStubSettings firewallPoliciesSettings = firewallPoliciesSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class FirewallPoliciesStubSettings extends StubSettings<FirewallPoliciesStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/cloud-platform")
          .build();

  private final UnaryCallSettings<AddAssociationFirewallPolicyRequest, Operation>
      addAssociationSettings;
  private final UnaryCallSettings<AddRuleFirewallPolicyRequest, Operation> addRuleSettings;
  private final UnaryCallSettings<CloneRulesFirewallPolicyRequest, Operation> cloneRulesSettings;
  private final UnaryCallSettings<DeleteFirewallPolicyRequest, Operation> deleteSettings;
  private final UnaryCallSettings<GetFirewallPolicyRequest, FirewallPolicy> getSettings;
  private final UnaryCallSettings<GetAssociationFirewallPolicyRequest, FirewallPolicyAssociation>
      getAssociationSettings;
  private final UnaryCallSettings<GetIamPolicyFirewallPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<GetRuleFirewallPolicyRequest, FirewallPolicyRule> getRuleSettings;
  private final UnaryCallSettings<InsertFirewallPolicyRequest, Operation> insertSettings;
  private final PagedCallSettings<
          ListFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>
      listSettings;
  private final UnaryCallSettings<
          ListAssociationsFirewallPolicyRequest, FirewallPoliciesListAssociationsResponse>
      listAssociationsSettings;
  private final UnaryCallSettings<MoveFirewallPolicyRequest, Operation> moveSettings;
  private final UnaryCallSettings<PatchFirewallPolicyRequest, Operation> patchSettings;
  private final UnaryCallSettings<PatchRuleFirewallPolicyRequest, Operation> patchRuleSettings;
  private final UnaryCallSettings<RemoveAssociationFirewallPolicyRequest, Operation>
      removeAssociationSettings;
  private final UnaryCallSettings<RemoveRuleFirewallPolicyRequest, Operation> removeRuleSettings;
  private final UnaryCallSettings<SetIamPolicyFirewallPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsFirewallPolicyRequest, TestPermissionsResponse>
      testIamPermissionsSettings;

  private static final PagedListDescriptor<
          ListFirewallPoliciesRequest, FirewallPolicyList, FirewallPolicy>
      LIST_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListFirewallPoliciesRequest, FirewallPolicyList, FirewallPolicy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListFirewallPoliciesRequest injectToken(
                ListFirewallPoliciesRequest payload, String token) {
              return ListFirewallPoliciesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListFirewallPoliciesRequest injectPageSize(
                ListFirewallPoliciesRequest payload, int pageSize) {
              return ListFirewallPoliciesRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListFirewallPoliciesRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(FirewallPolicyList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<FirewallPolicy> extractResources(FirewallPolicyList payload) {
              return payload.getItemsList() == null
                  ? ImmutableList.<FirewallPolicy>of()
                  : payload.getItemsList();
            }
          };

  private static final PagedListResponseFactory<
          ListFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>
      LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>() {
            @Override
            public ApiFuture<ListPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListFirewallPoliciesRequest, FirewallPolicyList> callable,
                ListFirewallPoliciesRequest request,
                ApiCallContext context,
                ApiFuture<FirewallPolicyList> futureResponse) {
              PageContext<ListFirewallPoliciesRequest, FirewallPolicyList, FirewallPolicy>
                  pageContext = PageContext.create(callable, LIST_PAGE_STR_DESC, request, context);
              return ListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to addAssociation. */
  public UnaryCallSettings<AddAssociationFirewallPolicyRequest, Operation>
      addAssociationSettings() {
    return addAssociationSettings;
  }

  /** Returns the object with the settings used for calls to addRule. */
  public UnaryCallSettings<AddRuleFirewallPolicyRequest, Operation> addRuleSettings() {
    return addRuleSettings;
  }

  /** Returns the object with the settings used for calls to cloneRules. */
  public UnaryCallSettings<CloneRulesFirewallPolicyRequest, Operation> cloneRulesSettings() {
    return cloneRulesSettings;
  }

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteFirewallPolicyRequest, Operation> deleteSettings() {
    return deleteSettings;
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetFirewallPolicyRequest, FirewallPolicy> getSettings() {
    return getSettings;
  }

  /** Returns the object with the settings used for calls to getAssociation. */
  public UnaryCallSettings<GetAssociationFirewallPolicyRequest, FirewallPolicyAssociation>
      getAssociationSettings() {
    return getAssociationSettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyFirewallPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to getRule. */
  public UnaryCallSettings<GetRuleFirewallPolicyRequest, FirewallPolicyRule> getRuleSettings() {
    return getRuleSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertFirewallPolicyRequest, Operation> insertSettings() {
    return insertSettings;
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<ListFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>
      listSettings() {
    return listSettings;
  }

  /** Returns the object with the settings used for calls to listAssociations. */
  public UnaryCallSettings<
          ListAssociationsFirewallPolicyRequest, FirewallPoliciesListAssociationsResponse>
      listAssociationsSettings() {
    return listAssociationsSettings;
  }

  /** Returns the object with the settings used for calls to move. */
  public UnaryCallSettings<MoveFirewallPolicyRequest, Operation> moveSettings() {
    return moveSettings;
  }

  /** Returns the object with the settings used for calls to patch. */
  public UnaryCallSettings<PatchFirewallPolicyRequest, Operation> patchSettings() {
    return patchSettings;
  }

  /** Returns the object with the settings used for calls to patchRule. */
  public UnaryCallSettings<PatchRuleFirewallPolicyRequest, Operation> patchRuleSettings() {
    return patchRuleSettings;
  }

  /** Returns the object with the settings used for calls to removeAssociation. */
  public UnaryCallSettings<RemoveAssociationFirewallPolicyRequest, Operation>
      removeAssociationSettings() {
    return removeAssociationSettings;
  }

  /** Returns the object with the settings used for calls to removeRule. */
  public UnaryCallSettings<RemoveRuleFirewallPolicyRequest, Operation> removeRuleSettings() {
    return removeRuleSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyFirewallPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsFirewallPolicyRequest, TestPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public FirewallPoliciesStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonFirewallPoliciesStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(FirewallPoliciesStubSettings.class))
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

  protected FirewallPoliciesStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    addAssociationSettings = settingsBuilder.addAssociationSettings().build();
    addRuleSettings = settingsBuilder.addRuleSettings().build();
    cloneRulesSettings = settingsBuilder.cloneRulesSettings().build();
    deleteSettings = settingsBuilder.deleteSettings().build();
    getSettings = settingsBuilder.getSettings().build();
    getAssociationSettings = settingsBuilder.getAssociationSettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    getRuleSettings = settingsBuilder.getRuleSettings().build();
    insertSettings = settingsBuilder.insertSettings().build();
    listSettings = settingsBuilder.listSettings().build();
    listAssociationsSettings = settingsBuilder.listAssociationsSettings().build();
    moveSettings = settingsBuilder.moveSettings().build();
    patchSettings = settingsBuilder.patchSettings().build();
    patchRuleSettings = settingsBuilder.patchRuleSettings().build();
    removeAssociationSettings = settingsBuilder.removeAssociationSettings().build();
    removeRuleSettings = settingsBuilder.removeRuleSettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
  }

  /** Builder for FirewallPoliciesStubSettings. */
  public static class Builder extends StubSettings.Builder<FirewallPoliciesStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<AddAssociationFirewallPolicyRequest, Operation>
        addAssociationSettings;
    private final UnaryCallSettings.Builder<AddRuleFirewallPolicyRequest, Operation>
        addRuleSettings;
    private final UnaryCallSettings.Builder<CloneRulesFirewallPolicyRequest, Operation>
        cloneRulesSettings;
    private final UnaryCallSettings.Builder<DeleteFirewallPolicyRequest, Operation> deleteSettings;
    private final UnaryCallSettings.Builder<GetFirewallPolicyRequest, FirewallPolicy> getSettings;
    private final UnaryCallSettings.Builder<
            GetAssociationFirewallPolicyRequest, FirewallPolicyAssociation>
        getAssociationSettings;
    private final UnaryCallSettings.Builder<GetIamPolicyFirewallPolicyRequest, Policy>
        getIamPolicySettings;
    private final UnaryCallSettings.Builder<GetRuleFirewallPolicyRequest, FirewallPolicyRule>
        getRuleSettings;
    private final UnaryCallSettings.Builder<InsertFirewallPolicyRequest, Operation> insertSettings;
    private final PagedCallSettings.Builder<
            ListFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>
        listSettings;
    private final UnaryCallSettings.Builder<
            ListAssociationsFirewallPolicyRequest, FirewallPoliciesListAssociationsResponse>
        listAssociationsSettings;
    private final UnaryCallSettings.Builder<MoveFirewallPolicyRequest, Operation> moveSettings;
    private final UnaryCallSettings.Builder<PatchFirewallPolicyRequest, Operation> patchSettings;
    private final UnaryCallSettings.Builder<PatchRuleFirewallPolicyRequest, Operation>
        patchRuleSettings;
    private final UnaryCallSettings.Builder<RemoveAssociationFirewallPolicyRequest, Operation>
        removeAssociationSettings;
    private final UnaryCallSettings.Builder<RemoveRuleFirewallPolicyRequest, Operation>
        removeRuleSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyFirewallPolicyRequest, Policy>
        setIamPolicySettings;
    private final UnaryCallSettings.Builder<
            TestIamPermissionsFirewallPolicyRequest, TestPermissionsResponse>
        testIamPermissionsSettings;
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

      addAssociationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      addRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      cloneRulesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getAssociationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      insertSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listSettings = PagedCallSettings.newBuilder(LIST_PAGE_STR_FACT);
      listAssociationsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      moveSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      patchSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      patchRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      removeAssociationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      removeRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              addAssociationSettings,
              addRuleSettings,
              cloneRulesSettings,
              deleteSettings,
              getSettings,
              getAssociationSettings,
              getIamPolicySettings,
              getRuleSettings,
              insertSettings,
              listSettings,
              listAssociationsSettings,
              moveSettings,
              patchSettings,
              patchRuleSettings,
              removeAssociationSettings,
              removeRuleSettings,
              setIamPolicySettings,
              testIamPermissionsSettings);
      initDefaults(this);
    }

    protected Builder(FirewallPoliciesStubSettings settings) {
      super(settings);

      addAssociationSettings = settings.addAssociationSettings.toBuilder();
      addRuleSettings = settings.addRuleSettings.toBuilder();
      cloneRulesSettings = settings.cloneRulesSettings.toBuilder();
      deleteSettings = settings.deleteSettings.toBuilder();
      getSettings = settings.getSettings.toBuilder();
      getAssociationSettings = settings.getAssociationSettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      getRuleSettings = settings.getRuleSettings.toBuilder();
      insertSettings = settings.insertSettings.toBuilder();
      listSettings = settings.listSettings.toBuilder();
      listAssociationsSettings = settings.listAssociationsSettings.toBuilder();
      moveSettings = settings.moveSettings.toBuilder();
      patchSettings = settings.patchSettings.toBuilder();
      patchRuleSettings = settings.patchRuleSettings.toBuilder();
      removeAssociationSettings = settings.removeAssociationSettings.toBuilder();
      removeRuleSettings = settings.removeRuleSettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              addAssociationSettings,
              addRuleSettings,
              cloneRulesSettings,
              deleteSettings,
              getSettings,
              getAssociationSettings,
              getIamPolicySettings,
              getRuleSettings,
              insertSettings,
              listSettings,
              listAssociationsSettings,
              moveSettings,
              patchSettings,
              patchRuleSettings,
              removeAssociationSettings,
              removeRuleSettings,
              setIamPolicySettings,
              testIamPermissionsSettings);
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
          .addAssociationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .addRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .cloneRulesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getAssociationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getRuleSettings()
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
          .listAssociationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .moveSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .patchSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .patchRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .removeAssociationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .removeRuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .testIamPermissionsSettings()
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

    /** Returns the builder for the settings used for calls to addAssociation. */
    public UnaryCallSettings.Builder<AddAssociationFirewallPolicyRequest, Operation>
        addAssociationSettings() {
      return addAssociationSettings;
    }

    /** Returns the builder for the settings used for calls to addRule. */
    public UnaryCallSettings.Builder<AddRuleFirewallPolicyRequest, Operation> addRuleSettings() {
      return addRuleSettings;
    }

    /** Returns the builder for the settings used for calls to cloneRules. */
    public UnaryCallSettings.Builder<CloneRulesFirewallPolicyRequest, Operation>
        cloneRulesSettings() {
      return cloneRulesSettings;
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteFirewallPolicyRequest, Operation> deleteSettings() {
      return deleteSettings;
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetFirewallPolicyRequest, FirewallPolicy> getSettings() {
      return getSettings;
    }

    /** Returns the builder for the settings used for calls to getAssociation. */
    public UnaryCallSettings.Builder<GetAssociationFirewallPolicyRequest, FirewallPolicyAssociation>
        getAssociationSettings() {
      return getAssociationSettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyFirewallPolicyRequest, Policy>
        getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getRule. */
    public UnaryCallSettings.Builder<GetRuleFirewallPolicyRequest, FirewallPolicyRule>
        getRuleSettings() {
      return getRuleSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertFirewallPolicyRequest, Operation> insertSettings() {
      return insertSettings;
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>
        listSettings() {
      return listSettings;
    }

    /** Returns the builder for the settings used for calls to listAssociations. */
    public UnaryCallSettings.Builder<
            ListAssociationsFirewallPolicyRequest, FirewallPoliciesListAssociationsResponse>
        listAssociationsSettings() {
      return listAssociationsSettings;
    }

    /** Returns the builder for the settings used for calls to move. */
    public UnaryCallSettings.Builder<MoveFirewallPolicyRequest, Operation> moveSettings() {
      return moveSettings;
    }

    /** Returns the builder for the settings used for calls to patch. */
    public UnaryCallSettings.Builder<PatchFirewallPolicyRequest, Operation> patchSettings() {
      return patchSettings;
    }

    /** Returns the builder for the settings used for calls to patchRule. */
    public UnaryCallSettings.Builder<PatchRuleFirewallPolicyRequest, Operation>
        patchRuleSettings() {
      return patchRuleSettings;
    }

    /** Returns the builder for the settings used for calls to removeAssociation. */
    public UnaryCallSettings.Builder<RemoveAssociationFirewallPolicyRequest, Operation>
        removeAssociationSettings() {
      return removeAssociationSettings;
    }

    /** Returns the builder for the settings used for calls to removeRule. */
    public UnaryCallSettings.Builder<RemoveRuleFirewallPolicyRequest, Operation>
        removeRuleSettings() {
      return removeRuleSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyFirewallPolicyRequest, Policy>
        setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<
            TestIamPermissionsFirewallPolicyRequest, TestPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    @Override
    public FirewallPoliciesStubSettings build() throws IOException {
      return new FirewallPoliciesStubSettings(this);
    }
  }
}
