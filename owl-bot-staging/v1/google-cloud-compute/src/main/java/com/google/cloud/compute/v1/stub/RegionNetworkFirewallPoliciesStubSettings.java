/*
 * Copyright 2022 Google LLC
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

import static com.google.cloud.compute.v1.RegionNetworkFirewallPoliciesClient.ListPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.httpjson.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AddAssociationRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.AddRuleRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.CloneRulesRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.DeleteRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.FirewallPolicy;
import com.google.cloud.compute.v1.FirewallPolicyAssociation;
import com.google.cloud.compute.v1.FirewallPolicyList;
import com.google.cloud.compute.v1.FirewallPolicyRule;
import com.google.cloud.compute.v1.GetAssociationRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.GetEffectiveFirewallsRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.GetIamPolicyRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.GetRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.InsertRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.ListRegionNetworkFirewallPoliciesRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.PatchRuleRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.Policy;
import com.google.cloud.compute.v1.RegionNetworkFirewallPoliciesGetEffectiveFirewallsResponse;
import com.google.cloud.compute.v1.RemoveAssociationRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.RemoveRuleRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.SetIamPolicyRegionNetworkFirewallPolicyRequest;
import com.google.cloud.compute.v1.TestIamPermissionsRegionNetworkFirewallPolicyRequest;
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
 * Settings class to configure an instance of {@link RegionNetworkFirewallPoliciesStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (compute.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of get to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * RegionNetworkFirewallPoliciesStubSettings.Builder regionNetworkFirewallPoliciesSettingsBuilder =
 *     RegionNetworkFirewallPoliciesStubSettings.newBuilder();
 * regionNetworkFirewallPoliciesSettingsBuilder
 *     .getSettings()
 *     .setRetrySettings(
 *         regionNetworkFirewallPoliciesSettingsBuilder
 *             .getSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * RegionNetworkFirewallPoliciesStubSettings regionNetworkFirewallPoliciesSettings =
 *     regionNetworkFirewallPoliciesSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class RegionNetworkFirewallPoliciesStubSettings
    extends StubSettings<RegionNetworkFirewallPoliciesStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/cloud-platform")
          .build();

  private final UnaryCallSettings<AddAssociationRegionNetworkFirewallPolicyRequest, Operation>
      addAssociationSettings;
  private final OperationCallSettings<
          AddAssociationRegionNetworkFirewallPolicyRequest, Operation, Operation>
      addAssociationOperationSettings;
  private final UnaryCallSettings<AddRuleRegionNetworkFirewallPolicyRequest, Operation>
      addRuleSettings;
  private final OperationCallSettings<
          AddRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
      addRuleOperationSettings;
  private final UnaryCallSettings<CloneRulesRegionNetworkFirewallPolicyRequest, Operation>
      cloneRulesSettings;
  private final OperationCallSettings<
          CloneRulesRegionNetworkFirewallPolicyRequest, Operation, Operation>
      cloneRulesOperationSettings;
  private final UnaryCallSettings<DeleteRegionNetworkFirewallPolicyRequest, Operation>
      deleteSettings;
  private final OperationCallSettings<
          DeleteRegionNetworkFirewallPolicyRequest, Operation, Operation>
      deleteOperationSettings;
  private final UnaryCallSettings<GetRegionNetworkFirewallPolicyRequest, FirewallPolicy>
      getSettings;
  private final UnaryCallSettings<
          GetAssociationRegionNetworkFirewallPolicyRequest, FirewallPolicyAssociation>
      getAssociationSettings;
  private final UnaryCallSettings<
          GetEffectiveFirewallsRegionNetworkFirewallPolicyRequest,
          RegionNetworkFirewallPoliciesGetEffectiveFirewallsResponse>
      getEffectiveFirewallsSettings;
  private final UnaryCallSettings<GetIamPolicyRegionNetworkFirewallPolicyRequest, Policy>
      getIamPolicySettings;
  private final UnaryCallSettings<GetRuleRegionNetworkFirewallPolicyRequest, FirewallPolicyRule>
      getRuleSettings;
  private final UnaryCallSettings<InsertRegionNetworkFirewallPolicyRequest, Operation>
      insertSettings;
  private final OperationCallSettings<
          InsertRegionNetworkFirewallPolicyRequest, Operation, Operation>
      insertOperationSettings;
  private final PagedCallSettings<
          ListRegionNetworkFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>
      listSettings;
  private final UnaryCallSettings<PatchRegionNetworkFirewallPolicyRequest, Operation> patchSettings;
  private final OperationCallSettings<PatchRegionNetworkFirewallPolicyRequest, Operation, Operation>
      patchOperationSettings;
  private final UnaryCallSettings<PatchRuleRegionNetworkFirewallPolicyRequest, Operation>
      patchRuleSettings;
  private final OperationCallSettings<
          PatchRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
      patchRuleOperationSettings;
  private final UnaryCallSettings<RemoveAssociationRegionNetworkFirewallPolicyRequest, Operation>
      removeAssociationSettings;
  private final OperationCallSettings<
          RemoveAssociationRegionNetworkFirewallPolicyRequest, Operation, Operation>
      removeAssociationOperationSettings;
  private final UnaryCallSettings<RemoveRuleRegionNetworkFirewallPolicyRequest, Operation>
      removeRuleSettings;
  private final OperationCallSettings<
          RemoveRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
      removeRuleOperationSettings;
  private final UnaryCallSettings<SetIamPolicyRegionNetworkFirewallPolicyRequest, Policy>
      setIamPolicySettings;
  private final UnaryCallSettings<
          TestIamPermissionsRegionNetworkFirewallPolicyRequest, TestPermissionsResponse>
      testIamPermissionsSettings;

  private static final PagedListDescriptor<
          ListRegionNetworkFirewallPoliciesRequest, FirewallPolicyList, FirewallPolicy>
      LIST_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListRegionNetworkFirewallPoliciesRequest, FirewallPolicyList, FirewallPolicy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRegionNetworkFirewallPoliciesRequest injectToken(
                ListRegionNetworkFirewallPoliciesRequest payload, String token) {
              return ListRegionNetworkFirewallPoliciesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListRegionNetworkFirewallPoliciesRequest injectPageSize(
                ListRegionNetworkFirewallPoliciesRequest payload, int pageSize) {
              return ListRegionNetworkFirewallPoliciesRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListRegionNetworkFirewallPoliciesRequest payload) {
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
          ListRegionNetworkFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>
      LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRegionNetworkFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>() {
            @Override
            public ApiFuture<ListPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListRegionNetworkFirewallPoliciesRequest, FirewallPolicyList>
                    callable,
                ListRegionNetworkFirewallPoliciesRequest request,
                ApiCallContext context,
                ApiFuture<FirewallPolicyList> futureResponse) {
              PageContext<
                      ListRegionNetworkFirewallPoliciesRequest, FirewallPolicyList, FirewallPolicy>
                  pageContext = PageContext.create(callable, LIST_PAGE_STR_DESC, request, context);
              return ListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to addAssociation. */
  public UnaryCallSettings<AddAssociationRegionNetworkFirewallPolicyRequest, Operation>
      addAssociationSettings() {
    return addAssociationSettings;
  }

  /** Returns the object with the settings used for calls to addAssociation. */
  public OperationCallSettings<
          AddAssociationRegionNetworkFirewallPolicyRequest, Operation, Operation>
      addAssociationOperationSettings() {
    return addAssociationOperationSettings;
  }

  /** Returns the object with the settings used for calls to addRule. */
  public UnaryCallSettings<AddRuleRegionNetworkFirewallPolicyRequest, Operation> addRuleSettings() {
    return addRuleSettings;
  }

  /** Returns the object with the settings used for calls to addRule. */
  public OperationCallSettings<AddRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
      addRuleOperationSettings() {
    return addRuleOperationSettings;
  }

  /** Returns the object with the settings used for calls to cloneRules. */
  public UnaryCallSettings<CloneRulesRegionNetworkFirewallPolicyRequest, Operation>
      cloneRulesSettings() {
    return cloneRulesSettings;
  }

  /** Returns the object with the settings used for calls to cloneRules. */
  public OperationCallSettings<CloneRulesRegionNetworkFirewallPolicyRequest, Operation, Operation>
      cloneRulesOperationSettings() {
    return cloneRulesOperationSettings;
  }

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteRegionNetworkFirewallPolicyRequest, Operation> deleteSettings() {
    return deleteSettings;
  }

  /** Returns the object with the settings used for calls to delete. */
  public OperationCallSettings<DeleteRegionNetworkFirewallPolicyRequest, Operation, Operation>
      deleteOperationSettings() {
    return deleteOperationSettings;
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetRegionNetworkFirewallPolicyRequest, FirewallPolicy> getSettings() {
    return getSettings;
  }

  /** Returns the object with the settings used for calls to getAssociation. */
  public UnaryCallSettings<
          GetAssociationRegionNetworkFirewallPolicyRequest, FirewallPolicyAssociation>
      getAssociationSettings() {
    return getAssociationSettings;
  }

  /** Returns the object with the settings used for calls to getEffectiveFirewalls. */
  public UnaryCallSettings<
          GetEffectiveFirewallsRegionNetworkFirewallPolicyRequest,
          RegionNetworkFirewallPoliciesGetEffectiveFirewallsResponse>
      getEffectiveFirewallsSettings() {
    return getEffectiveFirewallsSettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRegionNetworkFirewallPolicyRequest, Policy>
      getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to getRule. */
  public UnaryCallSettings<GetRuleRegionNetworkFirewallPolicyRequest, FirewallPolicyRule>
      getRuleSettings() {
    return getRuleSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertRegionNetworkFirewallPolicyRequest, Operation> insertSettings() {
    return insertSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public OperationCallSettings<InsertRegionNetworkFirewallPolicyRequest, Operation, Operation>
      insertOperationSettings() {
    return insertOperationSettings;
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<
          ListRegionNetworkFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>
      listSettings() {
    return listSettings;
  }

  /** Returns the object with the settings used for calls to patch. */
  public UnaryCallSettings<PatchRegionNetworkFirewallPolicyRequest, Operation> patchSettings() {
    return patchSettings;
  }

  /** Returns the object with the settings used for calls to patch. */
  public OperationCallSettings<PatchRegionNetworkFirewallPolicyRequest, Operation, Operation>
      patchOperationSettings() {
    return patchOperationSettings;
  }

  /** Returns the object with the settings used for calls to patchRule. */
  public UnaryCallSettings<PatchRuleRegionNetworkFirewallPolicyRequest, Operation>
      patchRuleSettings() {
    return patchRuleSettings;
  }

  /** Returns the object with the settings used for calls to patchRule. */
  public OperationCallSettings<PatchRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
      patchRuleOperationSettings() {
    return patchRuleOperationSettings;
  }

  /** Returns the object with the settings used for calls to removeAssociation. */
  public UnaryCallSettings<RemoveAssociationRegionNetworkFirewallPolicyRequest, Operation>
      removeAssociationSettings() {
    return removeAssociationSettings;
  }

  /** Returns the object with the settings used for calls to removeAssociation. */
  public OperationCallSettings<
          RemoveAssociationRegionNetworkFirewallPolicyRequest, Operation, Operation>
      removeAssociationOperationSettings() {
    return removeAssociationOperationSettings;
  }

  /** Returns the object with the settings used for calls to removeRule. */
  public UnaryCallSettings<RemoveRuleRegionNetworkFirewallPolicyRequest, Operation>
      removeRuleSettings() {
    return removeRuleSettings;
  }

  /** Returns the object with the settings used for calls to removeRule. */
  public OperationCallSettings<RemoveRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
      removeRuleOperationSettings() {
    return removeRuleOperationSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRegionNetworkFirewallPolicyRequest, Policy>
      setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<
          TestIamPermissionsRegionNetworkFirewallPolicyRequest, TestPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  public RegionNetworkFirewallPoliciesStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonRegionNetworkFirewallPoliciesStub.create(this);
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
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
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
            "gapic",
            GaxProperties.getLibraryVersion(RegionNetworkFirewallPoliciesStubSettings.class))
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

  protected RegionNetworkFirewallPoliciesStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    addAssociationSettings = settingsBuilder.addAssociationSettings().build();
    addAssociationOperationSettings = settingsBuilder.addAssociationOperationSettings().build();
    addRuleSettings = settingsBuilder.addRuleSettings().build();
    addRuleOperationSettings = settingsBuilder.addRuleOperationSettings().build();
    cloneRulesSettings = settingsBuilder.cloneRulesSettings().build();
    cloneRulesOperationSettings = settingsBuilder.cloneRulesOperationSettings().build();
    deleteSettings = settingsBuilder.deleteSettings().build();
    deleteOperationSettings = settingsBuilder.deleteOperationSettings().build();
    getSettings = settingsBuilder.getSettings().build();
    getAssociationSettings = settingsBuilder.getAssociationSettings().build();
    getEffectiveFirewallsSettings = settingsBuilder.getEffectiveFirewallsSettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    getRuleSettings = settingsBuilder.getRuleSettings().build();
    insertSettings = settingsBuilder.insertSettings().build();
    insertOperationSettings = settingsBuilder.insertOperationSettings().build();
    listSettings = settingsBuilder.listSettings().build();
    patchSettings = settingsBuilder.patchSettings().build();
    patchOperationSettings = settingsBuilder.patchOperationSettings().build();
    patchRuleSettings = settingsBuilder.patchRuleSettings().build();
    patchRuleOperationSettings = settingsBuilder.patchRuleOperationSettings().build();
    removeAssociationSettings = settingsBuilder.removeAssociationSettings().build();
    removeAssociationOperationSettings =
        settingsBuilder.removeAssociationOperationSettings().build();
    removeRuleSettings = settingsBuilder.removeRuleSettings().build();
    removeRuleOperationSettings = settingsBuilder.removeRuleOperationSettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
  }

  /** Builder for RegionNetworkFirewallPoliciesStubSettings. */
  public static class Builder
      extends StubSettings.Builder<RegionNetworkFirewallPoliciesStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<
            AddAssociationRegionNetworkFirewallPolicyRequest, Operation>
        addAssociationSettings;
    private final OperationCallSettings.Builder<
            AddAssociationRegionNetworkFirewallPolicyRequest, Operation, Operation>
        addAssociationOperationSettings;
    private final UnaryCallSettings.Builder<AddRuleRegionNetworkFirewallPolicyRequest, Operation>
        addRuleSettings;
    private final OperationCallSettings.Builder<
            AddRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
        addRuleOperationSettings;
    private final UnaryCallSettings.Builder<CloneRulesRegionNetworkFirewallPolicyRequest, Operation>
        cloneRulesSettings;
    private final OperationCallSettings.Builder<
            CloneRulesRegionNetworkFirewallPolicyRequest, Operation, Operation>
        cloneRulesOperationSettings;
    private final UnaryCallSettings.Builder<DeleteRegionNetworkFirewallPolicyRequest, Operation>
        deleteSettings;
    private final OperationCallSettings.Builder<
            DeleteRegionNetworkFirewallPolicyRequest, Operation, Operation>
        deleteOperationSettings;
    private final UnaryCallSettings.Builder<GetRegionNetworkFirewallPolicyRequest, FirewallPolicy>
        getSettings;
    private final UnaryCallSettings.Builder<
            GetAssociationRegionNetworkFirewallPolicyRequest, FirewallPolicyAssociation>
        getAssociationSettings;
    private final UnaryCallSettings.Builder<
            GetEffectiveFirewallsRegionNetworkFirewallPolicyRequest,
            RegionNetworkFirewallPoliciesGetEffectiveFirewallsResponse>
        getEffectiveFirewallsSettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRegionNetworkFirewallPolicyRequest, Policy>
        getIamPolicySettings;
    private final UnaryCallSettings.Builder<
            GetRuleRegionNetworkFirewallPolicyRequest, FirewallPolicyRule>
        getRuleSettings;
    private final UnaryCallSettings.Builder<InsertRegionNetworkFirewallPolicyRequest, Operation>
        insertSettings;
    private final OperationCallSettings.Builder<
            InsertRegionNetworkFirewallPolicyRequest, Operation, Operation>
        insertOperationSettings;
    private final PagedCallSettings.Builder<
            ListRegionNetworkFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>
        listSettings;
    private final UnaryCallSettings.Builder<PatchRegionNetworkFirewallPolicyRequest, Operation>
        patchSettings;
    private final OperationCallSettings.Builder<
            PatchRegionNetworkFirewallPolicyRequest, Operation, Operation>
        patchOperationSettings;
    private final UnaryCallSettings.Builder<PatchRuleRegionNetworkFirewallPolicyRequest, Operation>
        patchRuleSettings;
    private final OperationCallSettings.Builder<
            PatchRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
        patchRuleOperationSettings;
    private final UnaryCallSettings.Builder<
            RemoveAssociationRegionNetworkFirewallPolicyRequest, Operation>
        removeAssociationSettings;
    private final OperationCallSettings.Builder<
            RemoveAssociationRegionNetworkFirewallPolicyRequest, Operation, Operation>
        removeAssociationOperationSettings;
    private final UnaryCallSettings.Builder<RemoveRuleRegionNetworkFirewallPolicyRequest, Operation>
        removeRuleSettings;
    private final OperationCallSettings.Builder<
            RemoveRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
        removeRuleOperationSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRegionNetworkFirewallPolicyRequest, Policy>
        setIamPolicySettings;
    private final UnaryCallSettings.Builder<
            TestIamPermissionsRegionNetworkFirewallPolicyRequest, TestPermissionsResponse>
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
      addAssociationOperationSettings = OperationCallSettings.newBuilder();
      addRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      addRuleOperationSettings = OperationCallSettings.newBuilder();
      cloneRulesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      cloneRulesOperationSettings = OperationCallSettings.newBuilder();
      deleteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteOperationSettings = OperationCallSettings.newBuilder();
      getSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getAssociationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getEffectiveFirewallsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      insertSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      insertOperationSettings = OperationCallSettings.newBuilder();
      listSettings = PagedCallSettings.newBuilder(LIST_PAGE_STR_FACT);
      patchSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      patchOperationSettings = OperationCallSettings.newBuilder();
      patchRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      patchRuleOperationSettings = OperationCallSettings.newBuilder();
      removeAssociationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      removeAssociationOperationSettings = OperationCallSettings.newBuilder();
      removeRuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      removeRuleOperationSettings = OperationCallSettings.newBuilder();
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
              getEffectiveFirewallsSettings,
              getIamPolicySettings,
              getRuleSettings,
              insertSettings,
              listSettings,
              patchSettings,
              patchRuleSettings,
              removeAssociationSettings,
              removeRuleSettings,
              setIamPolicySettings,
              testIamPermissionsSettings);
      initDefaults(this);
    }

    protected Builder(RegionNetworkFirewallPoliciesStubSettings settings) {
      super(settings);

      addAssociationSettings = settings.addAssociationSettings.toBuilder();
      addAssociationOperationSettings = settings.addAssociationOperationSettings.toBuilder();
      addRuleSettings = settings.addRuleSettings.toBuilder();
      addRuleOperationSettings = settings.addRuleOperationSettings.toBuilder();
      cloneRulesSettings = settings.cloneRulesSettings.toBuilder();
      cloneRulesOperationSettings = settings.cloneRulesOperationSettings.toBuilder();
      deleteSettings = settings.deleteSettings.toBuilder();
      deleteOperationSettings = settings.deleteOperationSettings.toBuilder();
      getSettings = settings.getSettings.toBuilder();
      getAssociationSettings = settings.getAssociationSettings.toBuilder();
      getEffectiveFirewallsSettings = settings.getEffectiveFirewallsSettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      getRuleSettings = settings.getRuleSettings.toBuilder();
      insertSettings = settings.insertSettings.toBuilder();
      insertOperationSettings = settings.insertOperationSettings.toBuilder();
      listSettings = settings.listSettings.toBuilder();
      patchSettings = settings.patchSettings.toBuilder();
      patchOperationSettings = settings.patchOperationSettings.toBuilder();
      patchRuleSettings = settings.patchRuleSettings.toBuilder();
      patchRuleOperationSettings = settings.patchRuleOperationSettings.toBuilder();
      removeAssociationSettings = settings.removeAssociationSettings.toBuilder();
      removeAssociationOperationSettings = settings.removeAssociationOperationSettings.toBuilder();
      removeRuleSettings = settings.removeRuleSettings.toBuilder();
      removeRuleOperationSettings = settings.removeRuleOperationSettings.toBuilder();
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
              getEffectiveFirewallsSettings,
              getIamPolicySettings,
              getRuleSettings,
              insertSettings,
              listSettings,
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
          .getEffectiveFirewallsSettings()
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

      builder
          .addAssociationOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<AddAssociationRegionNetworkFirewallPolicyRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(20000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(600000L))
                      .build()));

      builder
          .addRuleOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<AddRuleRegionNetworkFirewallPolicyRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(20000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(600000L))
                      .build()));

      builder
          .cloneRulesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CloneRulesRegionNetworkFirewallPolicyRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(20000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(600000L))
                      .build()));

      builder
          .deleteOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteRegionNetworkFirewallPolicyRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(20000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(600000L))
                      .build()));

      builder
          .insertOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<InsertRegionNetworkFirewallPolicyRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(20000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(600000L))
                      .build()));

      builder
          .patchOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PatchRegionNetworkFirewallPolicyRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(20000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(600000L))
                      .build()));

      builder
          .patchRuleOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PatchRuleRegionNetworkFirewallPolicyRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(20000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(600000L))
                      .build()));

      builder
          .removeAssociationOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RemoveAssociationRegionNetworkFirewallPolicyRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(20000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(600000L))
                      .build()));

      builder
          .removeRuleOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RemoveRuleRegionNetworkFirewallPolicyRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(20000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(600000L))
                      .build()));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to addAssociation. */
    public UnaryCallSettings.Builder<AddAssociationRegionNetworkFirewallPolicyRequest, Operation>
        addAssociationSettings() {
      return addAssociationSettings;
    }

    /** Returns the builder for the settings used for calls to addAssociation. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            AddAssociationRegionNetworkFirewallPolicyRequest, Operation, Operation>
        addAssociationOperationSettings() {
      return addAssociationOperationSettings;
    }

    /** Returns the builder for the settings used for calls to addRule. */
    public UnaryCallSettings.Builder<AddRuleRegionNetworkFirewallPolicyRequest, Operation>
        addRuleSettings() {
      return addRuleSettings;
    }

    /** Returns the builder for the settings used for calls to addRule. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            AddRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
        addRuleOperationSettings() {
      return addRuleOperationSettings;
    }

    /** Returns the builder for the settings used for calls to cloneRules. */
    public UnaryCallSettings.Builder<CloneRulesRegionNetworkFirewallPolicyRequest, Operation>
        cloneRulesSettings() {
      return cloneRulesSettings;
    }

    /** Returns the builder for the settings used for calls to cloneRules. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            CloneRulesRegionNetworkFirewallPolicyRequest, Operation, Operation>
        cloneRulesOperationSettings() {
      return cloneRulesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteRegionNetworkFirewallPolicyRequest, Operation>
        deleteSettings() {
      return deleteSettings;
    }

    /** Returns the builder for the settings used for calls to delete. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeleteRegionNetworkFirewallPolicyRequest, Operation, Operation>
        deleteOperationSettings() {
      return deleteOperationSettings;
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetRegionNetworkFirewallPolicyRequest, FirewallPolicy>
        getSettings() {
      return getSettings;
    }

    /** Returns the builder for the settings used for calls to getAssociation. */
    public UnaryCallSettings.Builder<
            GetAssociationRegionNetworkFirewallPolicyRequest, FirewallPolicyAssociation>
        getAssociationSettings() {
      return getAssociationSettings;
    }

    /** Returns the builder for the settings used for calls to getEffectiveFirewalls. */
    public UnaryCallSettings.Builder<
            GetEffectiveFirewallsRegionNetworkFirewallPolicyRequest,
            RegionNetworkFirewallPoliciesGetEffectiveFirewallsResponse>
        getEffectiveFirewallsSettings() {
      return getEffectiveFirewallsSettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRegionNetworkFirewallPolicyRequest, Policy>
        getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getRule. */
    public UnaryCallSettings.Builder<GetRuleRegionNetworkFirewallPolicyRequest, FirewallPolicyRule>
        getRuleSettings() {
      return getRuleSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertRegionNetworkFirewallPolicyRequest, Operation>
        insertSettings() {
      return insertSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            InsertRegionNetworkFirewallPolicyRequest, Operation, Operation>
        insertOperationSettings() {
      return insertOperationSettings;
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListRegionNetworkFirewallPoliciesRequest, FirewallPolicyList, ListPagedResponse>
        listSettings() {
      return listSettings;
    }

    /** Returns the builder for the settings used for calls to patch. */
    public UnaryCallSettings.Builder<PatchRegionNetworkFirewallPolicyRequest, Operation>
        patchSettings() {
      return patchSettings;
    }

    /** Returns the builder for the settings used for calls to patch. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            PatchRegionNetworkFirewallPolicyRequest, Operation, Operation>
        patchOperationSettings() {
      return patchOperationSettings;
    }

    /** Returns the builder for the settings used for calls to patchRule. */
    public UnaryCallSettings.Builder<PatchRuleRegionNetworkFirewallPolicyRequest, Operation>
        patchRuleSettings() {
      return patchRuleSettings;
    }

    /** Returns the builder for the settings used for calls to patchRule. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            PatchRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
        patchRuleOperationSettings() {
      return patchRuleOperationSettings;
    }

    /** Returns the builder for the settings used for calls to removeAssociation. */
    public UnaryCallSettings.Builder<RemoveAssociationRegionNetworkFirewallPolicyRequest, Operation>
        removeAssociationSettings() {
      return removeAssociationSettings;
    }

    /** Returns the builder for the settings used for calls to removeAssociation. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            RemoveAssociationRegionNetworkFirewallPolicyRequest, Operation, Operation>
        removeAssociationOperationSettings() {
      return removeAssociationOperationSettings;
    }

    /** Returns the builder for the settings used for calls to removeRule. */
    public UnaryCallSettings.Builder<RemoveRuleRegionNetworkFirewallPolicyRequest, Operation>
        removeRuleSettings() {
      return removeRuleSettings;
    }

    /** Returns the builder for the settings used for calls to removeRule. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            RemoveRuleRegionNetworkFirewallPolicyRequest, Operation, Operation>
        removeRuleOperationSettings() {
      return removeRuleOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRegionNetworkFirewallPolicyRequest, Policy>
        setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<
            TestIamPermissionsRegionNetworkFirewallPolicyRequest, TestPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    @Override
    public RegionNetworkFirewallPoliciesStubSettings build() throws IOException {
      return new RegionNetworkFirewallPoliciesStubSettings(this);
    }
  }
}
