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

package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.RegionDiskTypesClient.ListPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.compute.v1.stub.RegionDiskTypesStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link RegionDiskTypesClient}.
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
 * RegionDiskTypesSettings.Builder regionDiskTypesSettingsBuilder =
 *     RegionDiskTypesSettings.newBuilder();
 * regionDiskTypesSettingsBuilder
 *     .getSettings()
 *     .setRetrySettings(
 *         regionDiskTypesSettingsBuilder
 *             .getSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * RegionDiskTypesSettings regionDiskTypesSettings = regionDiskTypesSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class RegionDiskTypesSettings extends ClientSettings<RegionDiskTypesSettings> {

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetRegionDiskTypeRequest, DiskType> getSettings() {
    return ((RegionDiskTypesStubSettings) getStubSettings()).getSettings();
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<ListRegionDiskTypesRequest, RegionDiskTypeList, ListPagedResponse>
      listSettings() {
    return ((RegionDiskTypesStubSettings) getStubSettings()).listSettings();
  }

  public static final RegionDiskTypesSettings create(RegionDiskTypesStubSettings stub)
      throws IOException {
    return new RegionDiskTypesSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return RegionDiskTypesStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return RegionDiskTypesStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return RegionDiskTypesStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return RegionDiskTypesStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return RegionDiskTypesStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return RegionDiskTypesStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return RegionDiskTypesStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected RegionDiskTypesSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for RegionDiskTypesSettings. */
  public static class Builder extends ClientSettings.Builder<RegionDiskTypesSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(RegionDiskTypesStubSettings.newBuilder(clientContext));
    }

    protected Builder(RegionDiskTypesSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(RegionDiskTypesStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(RegionDiskTypesStubSettings.newBuilder());
    }

    public RegionDiskTypesStubSettings.Builder getStubSettingsBuilder() {
      return ((RegionDiskTypesStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetRegionDiskTypeRequest, DiskType> getSettings() {
      return getStubSettingsBuilder().getSettings();
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListRegionDiskTypesRequest, RegionDiskTypeList, ListPagedResponse>
        listSettings() {
      return getStubSettingsBuilder().listSettings();
    }

    @Override
    public RegionDiskTypesSettings build() throws IOException {
      return new RegionDiskTypesSettings(this);
    }
  }
}
