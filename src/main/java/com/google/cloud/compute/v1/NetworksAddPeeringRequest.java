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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class NetworksAddPeeringRequest implements ApiMessage {
  private final Boolean autoCreateRoutes;
  private final String name;
  private final NetworkPeering networkPeering;
  private final String peerNetwork;

  private NetworksAddPeeringRequest() {
    this.autoCreateRoutes = null;
    this.name = null;
    this.networkPeering = null;
    this.peerNetwork = null;
  }

  private NetworksAddPeeringRequest(
      Boolean autoCreateRoutes, String name, NetworkPeering networkPeering, String peerNetwork) {
    this.autoCreateRoutes = autoCreateRoutes;
    this.name = name;
    this.networkPeering = networkPeering;
    this.peerNetwork = peerNetwork;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("autoCreateRoutes".equals(fieldName)) {
      return autoCreateRoutes;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("networkPeering".equals(fieldName)) {
      return networkPeering;
    }
    if ("peerNetwork".equals(fieldName)) {
      return peerNetwork;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /**
   * This field will be deprecated soon. Use exchange_subnet_routes in network_peering instead.
   * Indicates whether full mesh connectivity is created and managed automatically between peered
   * networks. Currently this field should always be true since Google Compute Engine will
   * automatically create and manage subnetwork routes between two networks when peering state is
   * ACTIVE.
   */
  public Boolean getAutoCreateRoutes() {
    return autoCreateRoutes;
  }

  /** Name of the peering, which should conform to RFC1035. */
  public String getName() {
    return name;
  }

  /**
   * Network peering parameters. In order to specify route policies for peering using import and
   * export custom routes, you must specify all peering related parameters (name, peer network,
   * exchange_subnet_routes) in the network_peering field. The corresponding fields in
   * NetworksAddPeeringRequest will be deprecated soon.
   */
  public NetworkPeering getNetworkPeering() {
    return networkPeering;
  }

  /**
   * URL of the peer network. It can be either full URL or partial URL. The peer network may belong
   * to a different project. If the partial URL does not contain project, it is assumed that the
   * peer network is in the same project as the current network.
   */
  public String getPeerNetwork() {
    return peerNetwork;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(NetworksAddPeeringRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static NetworksAddPeeringRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final NetworksAddPeeringRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new NetworksAddPeeringRequest();
  }

  public static class Builder {
    private Boolean autoCreateRoutes;
    private String name;
    private NetworkPeering networkPeering;
    private String peerNetwork;

    Builder() {}

    public Builder mergeFrom(NetworksAddPeeringRequest other) {
      if (other == NetworksAddPeeringRequest.getDefaultInstance()) return this;
      if (other.getAutoCreateRoutes() != null) {
        this.autoCreateRoutes = other.autoCreateRoutes;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getNetworkPeering() != null) {
        this.networkPeering = other.networkPeering;
      }
      if (other.getPeerNetwork() != null) {
        this.peerNetwork = other.peerNetwork;
      }
      return this;
    }

    Builder(NetworksAddPeeringRequest source) {
      this.autoCreateRoutes = source.autoCreateRoutes;
      this.name = source.name;
      this.networkPeering = source.networkPeering;
      this.peerNetwork = source.peerNetwork;
    }

    /**
     * This field will be deprecated soon. Use exchange_subnet_routes in network_peering instead.
     * Indicates whether full mesh connectivity is created and managed automatically between peered
     * networks. Currently this field should always be true since Google Compute Engine will
     * automatically create and manage subnetwork routes between two networks when peering state is
     * ACTIVE.
     */
    public Boolean getAutoCreateRoutes() {
      return autoCreateRoutes;
    }

    /**
     * This field will be deprecated soon. Use exchange_subnet_routes in network_peering instead.
     * Indicates whether full mesh connectivity is created and managed automatically between peered
     * networks. Currently this field should always be true since Google Compute Engine will
     * automatically create and manage subnetwork routes between two networks when peering state is
     * ACTIVE.
     */
    public Builder setAutoCreateRoutes(Boolean autoCreateRoutes) {
      this.autoCreateRoutes = autoCreateRoutes;
      return this;
    }

    /** Name of the peering, which should conform to RFC1035. */
    public String getName() {
      return name;
    }

    /** Name of the peering, which should conform to RFC1035. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * Network peering parameters. In order to specify route policies for peering using import and
     * export custom routes, you must specify all peering related parameters (name, peer network,
     * exchange_subnet_routes) in the network_peering field. The corresponding fields in
     * NetworksAddPeeringRequest will be deprecated soon.
     */
    public NetworkPeering getNetworkPeering() {
      return networkPeering;
    }

    /**
     * Network peering parameters. In order to specify route policies for peering using import and
     * export custom routes, you must specify all peering related parameters (name, peer network,
     * exchange_subnet_routes) in the network_peering field. The corresponding fields in
     * NetworksAddPeeringRequest will be deprecated soon.
     */
    public Builder setNetworkPeering(NetworkPeering networkPeering) {
      this.networkPeering = networkPeering;
      return this;
    }

    /**
     * URL of the peer network. It can be either full URL or partial URL. The peer network may
     * belong to a different project. If the partial URL does not contain project, it is assumed
     * that the peer network is in the same project as the current network.
     */
    public String getPeerNetwork() {
      return peerNetwork;
    }

    /**
     * URL of the peer network. It can be either full URL or partial URL. The peer network may
     * belong to a different project. If the partial URL does not contain project, it is assumed
     * that the peer network is in the same project as the current network.
     */
    public Builder setPeerNetwork(String peerNetwork) {
      this.peerNetwork = peerNetwork;
      return this;
    }

    public NetworksAddPeeringRequest build() {

      return new NetworksAddPeeringRequest(autoCreateRoutes, name, networkPeering, peerNetwork);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAutoCreateRoutes(this.autoCreateRoutes);
      newBuilder.setName(this.name);
      newBuilder.setNetworkPeering(this.networkPeering);
      newBuilder.setPeerNetwork(this.peerNetwork);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "NetworksAddPeeringRequest{"
        + "autoCreateRoutes="
        + autoCreateRoutes
        + ", "
        + "name="
        + name
        + ", "
        + "networkPeering="
        + networkPeering
        + ", "
        + "peerNetwork="
        + peerNetwork
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NetworksAddPeeringRequest) {
      NetworksAddPeeringRequest that = (NetworksAddPeeringRequest) o;
      return Objects.equals(this.autoCreateRoutes, that.getAutoCreateRoutes())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.networkPeering, that.getNetworkPeering())
          && Objects.equals(this.peerNetwork, that.getPeerNetwork());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCreateRoutes, name, networkPeering, peerNetwork);
  }
}
