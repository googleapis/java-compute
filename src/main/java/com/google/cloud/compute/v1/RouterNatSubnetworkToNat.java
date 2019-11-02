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
/** Defines the IP ranges that want to use NAT for a subnetwork. */
public final class RouterNatSubnetworkToNat implements ApiMessage {
  private final String name;
  private final List<String> secondaryIpRangeNames;
  private final List<String> sourceIpRangesToNat;

  private RouterNatSubnetworkToNat() {
    this.name = null;
    this.secondaryIpRangeNames = null;
    this.sourceIpRangesToNat = null;
  }

  private RouterNatSubnetworkToNat(
      String name, List<String> secondaryIpRangeNames, List<String> sourceIpRangesToNat) {
    this.name = name;
    this.secondaryIpRangeNames = secondaryIpRangeNames;
    this.sourceIpRangesToNat = sourceIpRangesToNat;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("secondaryIpRangeNames".equals(fieldName)) {
      return secondaryIpRangeNames;
    }
    if ("sourceIpRangesToNat".equals(fieldName)) {
      return sourceIpRangesToNat;
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

  /** URL for the subnetwork resource that will use NAT. */
  public String getName() {
    return name;
  }

  /**
   * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be
   * populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in
   * source_ip_ranges_to_nat.
   */
  public List<String> getSecondaryIpRangeNamesList() {
    return secondaryIpRangeNames;
  }

  /**
   * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid
   * except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is:
   * ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
   */
  public List<String> getSourceIpRangesToNatList() {
    return sourceIpRangesToNat;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(RouterNatSubnetworkToNat prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RouterNatSubnetworkToNat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final RouterNatSubnetworkToNat DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new RouterNatSubnetworkToNat();
  }

  public static class Builder {
    private String name;
    private List<String> secondaryIpRangeNames;
    private List<String> sourceIpRangesToNat;

    Builder() {}

    public Builder mergeFrom(RouterNatSubnetworkToNat other) {
      if (other == RouterNatSubnetworkToNat.getDefaultInstance()) return this;
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getSecondaryIpRangeNamesList() != null) {
        this.secondaryIpRangeNames = other.secondaryIpRangeNames;
      }
      if (other.getSourceIpRangesToNatList() != null) {
        this.sourceIpRangesToNat = other.sourceIpRangesToNat;
      }
      return this;
    }

    Builder(RouterNatSubnetworkToNat source) {
      this.name = source.name;
      this.secondaryIpRangeNames = source.secondaryIpRangeNames;
      this.sourceIpRangesToNat = source.sourceIpRangesToNat;
    }

    /** URL for the subnetwork resource that will use NAT. */
    public String getName() {
      return name;
    }

    /** URL for the subnetwork resource that will use NAT. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be
     * populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in
     * source_ip_ranges_to_nat.
     */
    public List<String> getSecondaryIpRangeNamesList() {
      return secondaryIpRangeNames;
    }

    /**
     * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be
     * populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in
     * source_ip_ranges_to_nat.
     */
    public Builder addAllSecondaryIpRangeNames(List<String> secondaryIpRangeNames) {
      if (this.secondaryIpRangeNames == null) {
        this.secondaryIpRangeNames = new LinkedList<>();
      }
      this.secondaryIpRangeNames.addAll(secondaryIpRangeNames);
      return this;
    }

    /**
     * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be
     * populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in
     * source_ip_ranges_to_nat.
     */
    public Builder addSecondaryIpRangeNames(String secondaryIpRangeNames) {
      if (this.secondaryIpRangeNames == null) {
        this.secondaryIpRangeNames = new LinkedList<>();
      }
      this.secondaryIpRangeNames.add(secondaryIpRangeNames);
      return this;
    }

    /**
     * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid
     * except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is:
     * ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
     */
    public List<String> getSourceIpRangesToNatList() {
      return sourceIpRangesToNat;
    }

    /**
     * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid
     * except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is:
     * ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
     */
    public Builder addAllSourceIpRangesToNat(List<String> sourceIpRangesToNat) {
      if (this.sourceIpRangesToNat == null) {
        this.sourceIpRangesToNat = new LinkedList<>();
      }
      this.sourceIpRangesToNat.addAll(sourceIpRangesToNat);
      return this;
    }

    /**
     * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid
     * except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is:
     * ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
     */
    public Builder addSourceIpRangesToNat(String sourceIpRangesToNat) {
      if (this.sourceIpRangesToNat == null) {
        this.sourceIpRangesToNat = new LinkedList<>();
      }
      this.sourceIpRangesToNat.add(sourceIpRangesToNat);
      return this;
    }

    public RouterNatSubnetworkToNat build() {

      return new RouterNatSubnetworkToNat(name, secondaryIpRangeNames, sourceIpRangesToNat);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setName(this.name);
      newBuilder.addAllSecondaryIpRangeNames(this.secondaryIpRangeNames);
      newBuilder.addAllSourceIpRangesToNat(this.sourceIpRangesToNat);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RouterNatSubnetworkToNat{"
        + "name="
        + name
        + ", "
        + "secondaryIpRangeNames="
        + secondaryIpRangeNames
        + ", "
        + "sourceIpRangesToNat="
        + sourceIpRangesToNat
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RouterNatSubnetworkToNat) {
      RouterNatSubnetworkToNat that = (RouterNatSubnetworkToNat) o;
      return Objects.equals(this.name, that.getName())
          && Objects.equals(this.secondaryIpRangeNames, that.getSecondaryIpRangeNamesList())
          && Objects.equals(this.sourceIpRangesToNat, that.getSourceIpRangesToNatList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, secondaryIpRangeNames, sourceIpRangesToNat);
  }
}
