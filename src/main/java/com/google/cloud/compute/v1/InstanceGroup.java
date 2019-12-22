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
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/**
 * Represents an Instance Group resource.
 *
 * <p>Instance Groups can be used to configure a target for load balancing.
 *
 * <p>Instance groups can either be managed or unmanaged.
 *
 * <p>To create managed instance groups, use the instanceGroupManager or regionInstanceGroupManager
 * resource instead.
 *
 * <p>Use zonal unmanaged instance groups if you need to apply load balancing to groups of
 * heterogeneous instances or if you need to manage the instances yourself. You cannot create
 * regional unmanaged instance groups.
 *
 * <p>For more information, read Instance groups.
 *
 * <p>(== resource_for beta.instanceGroups ==) (== resource_for v1.instanceGroups ==) (==
 * resource_for beta.regionInstanceGroups ==) (== resource_for v1.regionInstanceGroups ==)
 */
public final class InstanceGroup implements ApiMessage {
  private final String creationTimestamp;
  private final String description;
  private final String fingerprint;
  private final String id;
  private final String kind;
  private final String name;
  private final List<NamedPort> namedPorts;
  private final String network;
  private final String region;
  private final String selfLink;
  private final Integer size;
  private final String subnetwork;
  private final String zone;

  private InstanceGroup() {
    this.creationTimestamp = null;
    this.description = null;
    this.fingerprint = null;
    this.id = null;
    this.kind = null;
    this.name = null;
    this.namedPorts = null;
    this.network = null;
    this.region = null;
    this.selfLink = null;
    this.size = null;
    this.subnetwork = null;
    this.zone = null;
  }

  private InstanceGroup(
      String creationTimestamp,
      String description,
      String fingerprint,
      String id,
      String kind,
      String name,
      List<NamedPort> namedPorts,
      String network,
      String region,
      String selfLink,
      Integer size,
      String subnetwork,
      String zone) {
    this.creationTimestamp = creationTimestamp;
    this.description = description;
    this.fingerprint = fingerprint;
    this.id = id;
    this.kind = kind;
    this.name = name;
    this.namedPorts = namedPorts;
    this.network = network;
    this.region = region;
    this.selfLink = selfLink;
    this.size = size;
    this.subnetwork = subnetwork;
    this.zone = zone;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("creationTimestamp".equals(fieldName)) {
      return creationTimestamp;
    }
    if ("description".equals(fieldName)) {
      return description;
    }
    if ("fingerprint".equals(fieldName)) {
      return fingerprint;
    }
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("namedPorts".equals(fieldName)) {
      return namedPorts;
    }
    if ("network".equals(fieldName)) {
      return network;
    }
    if ("region".equals(fieldName)) {
      return region;
    }
    if ("selfLink".equals(fieldName)) {
      return selfLink;
    }
    if ("size".equals(fieldName)) {
      return size;
    }
    if ("subnetwork".equals(fieldName)) {
      return subnetwork;
    }
    if ("zone".equals(fieldName)) {
      return zone;
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

  /** [Output Only] The creation timestamp for this instance group in RFC3339 text format. */
  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   */
  public String getDescription() {
    return description;
  }

  /**
   * [Output Only] The fingerprint of the named ports. The system uses this fingerprint to detect
   * conflicts when multiple users change the named ports concurrently.
   */
  public String getFingerprint() {
    return fingerprint;
  }

  /** [Output Only] A unique identifier for this instance group, generated by the server. */
  public String getId() {
    return id;
  }

  /** [Output Only] The resource type, which is always compute#instanceGroup for instance groups. */
  public String getKind() {
    return kind;
  }

  /**
   * The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
   */
  public String getName() {
    return name;
  }

  /**
   * Assigns a name to a port number. For example: {name: "http", port: 80}
   *
   * <p>This allows the system to reference ports by the assigned name instead of a port number.
   * Named ports can also contain multiple ports. For example: [{name: "http", port: 80},{name:
   * "http", port: 8080}]
   *
   * <p>Named ports apply to all instances in this instance group.
   */
  public List<NamedPort> getNamedPortsList() {
    return namedPorts;
  }

  /** The URL of the network to which all instances in the instance group belong. */
  public String getNetwork() {
    return network;
  }

  /**
   * [Output Only] The URL of the region where the instance group is located (for regional
   * resources).
   */
  public String getRegion() {
    return region;
  }

  /** [Output Only] The URL for this instance group. The server generates this URL. */
  public String getSelfLink() {
    return selfLink;
  }

  /** [Output Only] The total number of instances in the instance group. */
  public Integer getSize() {
    return size;
  }

  /**
   * [Output Only] The URL of the subnetwork to which all instances in the instance group belong.
   */
  public String getSubnetwork() {
    return subnetwork;
  }

  /**
   * [Output Only] The URL of the zone where the instance group is located (for zonal resources).
   */
  public String getZone() {
    return zone;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(InstanceGroup prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final InstanceGroup DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new InstanceGroup();
  }

  public static class Builder {
    private String creationTimestamp;
    private String description;
    private String fingerprint;
    private String id;
    private String kind;
    private String name;
    private List<NamedPort> namedPorts;
    private String network;
    private String region;
    private String selfLink;
    private Integer size;
    private String subnetwork;
    private String zone;

    Builder() {}

    public Builder mergeFrom(InstanceGroup other) {
      if (other == InstanceGroup.getDefaultInstance()) return this;
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getFingerprint() != null) {
        this.fingerprint = other.fingerprint;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getNamedPortsList() != null) {
        this.namedPorts = other.namedPorts;
      }
      if (other.getNetwork() != null) {
        this.network = other.network;
      }
      if (other.getRegion() != null) {
        this.region = other.region;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getSize() != null) {
        this.size = other.size;
      }
      if (other.getSubnetwork() != null) {
        this.subnetwork = other.subnetwork;
      }
      if (other.getZone() != null) {
        this.zone = other.zone;
      }
      return this;
    }

    Builder(InstanceGroup source) {
      this.creationTimestamp = source.creationTimestamp;
      this.description = source.description;
      this.fingerprint = source.fingerprint;
      this.id = source.id;
      this.kind = source.kind;
      this.name = source.name;
      this.namedPorts = source.namedPorts;
      this.network = source.network;
      this.region = source.region;
      this.selfLink = source.selfLink;
      this.size = source.size;
      this.subnetwork = source.subnetwork;
      this.zone = source.zone;
    }

    /** [Output Only] The creation timestamp for this instance group in RFC3339 text format. */
    public String getCreationTimestamp() {
      return creationTimestamp;
    }

    /** [Output Only] The creation timestamp for this instance group in RFC3339 text format. */
    public Builder setCreationTimestamp(String creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     */
    public String getDescription() {
      return description;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * [Output Only] The fingerprint of the named ports. The system uses this fingerprint to detect
     * conflicts when multiple users change the named ports concurrently.
     */
    public String getFingerprint() {
      return fingerprint;
    }

    /**
     * [Output Only] The fingerprint of the named ports. The system uses this fingerprint to detect
     * conflicts when multiple users change the named ports concurrently.
     */
    public Builder setFingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
      return this;
    }

    /** [Output Only] A unique identifier for this instance group, generated by the server. */
    public String getId() {
      return id;
    }

    /** [Output Only] A unique identifier for this instance group, generated by the server. */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /**
     * [Output Only] The resource type, which is always compute#instanceGroup for instance groups.
     */
    public String getKind() {
      return kind;
    }

    /**
     * [Output Only] The resource type, which is always compute#instanceGroup for instance groups.
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * The name of the instance group. The name must be 1-63 characters long, and comply with
     * RFC1035.
     */
    public String getName() {
      return name;
    }

    /**
     * The name of the instance group. The name must be 1-63 characters long, and comply with
     * RFC1035.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * Assigns a name to a port number. For example: {name: "http", port: 80}
     *
     * <p>This allows the system to reference ports by the assigned name instead of a port number.
     * Named ports can also contain multiple ports. For example: [{name: "http", port: 80},{name:
     * "http", port: 8080}]
     *
     * <p>Named ports apply to all instances in this instance group.
     */
    public List<NamedPort> getNamedPortsList() {
      return namedPorts;
    }

    /**
     * Assigns a name to a port number. For example: {name: "http", port: 80}
     *
     * <p>This allows the system to reference ports by the assigned name instead of a port number.
     * Named ports can also contain multiple ports. For example: [{name: "http", port: 80},{name:
     * "http", port: 8080}]
     *
     * <p>Named ports apply to all instances in this instance group.
     */
    public Builder addAllNamedPorts(List<NamedPort> namedPorts) {
      if (this.namedPorts == null) {
        this.namedPorts = new LinkedList<>();
      }
      this.namedPorts.addAll(namedPorts);
      return this;
    }

    /**
     * Assigns a name to a port number. For example: {name: "http", port: 80}
     *
     * <p>This allows the system to reference ports by the assigned name instead of a port number.
     * Named ports can also contain multiple ports. For example: [{name: "http", port: 80},{name:
     * "http", port: 8080}]
     *
     * <p>Named ports apply to all instances in this instance group.
     */
    public Builder addNamedPorts(NamedPort namedPorts) {
      if (this.namedPorts == null) {
        this.namedPorts = new LinkedList<>();
      }
      this.namedPorts.add(namedPorts);
      return this;
    }

    /** The URL of the network to which all instances in the instance group belong. */
    public String getNetwork() {
      return network;
    }

    /** The URL of the network to which all instances in the instance group belong. */
    public Builder setNetwork(String network) {
      this.network = network;
      return this;
    }

    /**
     * [Output Only] The URL of the region where the instance group is located (for regional
     * resources).
     */
    public String getRegion() {
      return region;
    }

    /**
     * [Output Only] The URL of the region where the instance group is located (for regional
     * resources).
     */
    public Builder setRegion(String region) {
      this.region = region;
      return this;
    }

    /** [Output Only] The URL for this instance group. The server generates this URL. */
    public String getSelfLink() {
      return selfLink;
    }

    /** [Output Only] The URL for this instance group. The server generates this URL. */
    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    /** [Output Only] The total number of instances in the instance group. */
    public Integer getSize() {
      return size;
    }

    /** [Output Only] The total number of instances in the instance group. */
    public Builder setSize(Integer size) {
      this.size = size;
      return this;
    }

    /**
     * [Output Only] The URL of the subnetwork to which all instances in the instance group belong.
     */
    public String getSubnetwork() {
      return subnetwork;
    }

    /**
     * [Output Only] The URL of the subnetwork to which all instances in the instance group belong.
     */
    public Builder setSubnetwork(String subnetwork) {
      this.subnetwork = subnetwork;
      return this;
    }

    /**
     * [Output Only] The URL of the zone where the instance group is located (for zonal resources).
     */
    public String getZone() {
      return zone;
    }

    /**
     * [Output Only] The URL of the zone where the instance group is located (for zonal resources).
     */
    public Builder setZone(String zone) {
      this.zone = zone;
      return this;
    }

    public InstanceGroup build() {

      return new InstanceGroup(
          creationTimestamp,
          description,
          fingerprint,
          id,
          kind,
          name,
          namedPorts,
          network,
          region,
          selfLink,
          size,
          subnetwork,
          zone);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDescription(this.description);
      newBuilder.setFingerprint(this.fingerprint);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.addAllNamedPorts(this.namedPorts);
      newBuilder.setNetwork(this.network);
      newBuilder.setRegion(this.region);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setSize(this.size);
      newBuilder.setSubnetwork(this.subnetwork);
      newBuilder.setZone(this.zone);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstanceGroup{"
        + "creationTimestamp="
        + creationTimestamp
        + ", "
        + "description="
        + description
        + ", "
        + "fingerprint="
        + fingerprint
        + ", "
        + "id="
        + id
        + ", "
        + "kind="
        + kind
        + ", "
        + "name="
        + name
        + ", "
        + "namedPorts="
        + namedPorts
        + ", "
        + "network="
        + network
        + ", "
        + "region="
        + region
        + ", "
        + "selfLink="
        + selfLink
        + ", "
        + "size="
        + size
        + ", "
        + "subnetwork="
        + subnetwork
        + ", "
        + "zone="
        + zone
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceGroup) {
      InstanceGroup that = (InstanceGroup) o;
      return Objects.equals(this.creationTimestamp, that.getCreationTimestamp())
          && Objects.equals(this.description, that.getDescription())
          && Objects.equals(this.fingerprint, that.getFingerprint())
          && Objects.equals(this.id, that.getId())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.namedPorts, that.getNamedPortsList())
          && Objects.equals(this.network, that.getNetwork())
          && Objects.equals(this.region, that.getRegion())
          && Objects.equals(this.selfLink, that.getSelfLink())
          && Objects.equals(this.size, that.getSize())
          && Objects.equals(this.subnetwork, that.getSubnetwork())
          && Objects.equals(this.zone, that.getZone());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        creationTimestamp,
        description,
        fingerprint,
        id,
        kind,
        name,
        namedPorts,
        network,
        region,
        selfLink,
        size,
        subnetwork,
        zone);
  }
}
