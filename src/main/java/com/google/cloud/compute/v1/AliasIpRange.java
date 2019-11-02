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
/** An alias IP range attached to an instance's network interface. */
public final class AliasIpRange implements ApiMessage {
  private final String ipCidrRange;
  private final String subnetworkRangeName;

  private AliasIpRange() {
    this.ipCidrRange = null;
    this.subnetworkRangeName = null;
  }

  private AliasIpRange(String ipCidrRange, String subnetworkRangeName) {
    this.ipCidrRange = ipCidrRange;
    this.subnetworkRangeName = subnetworkRangeName;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("ipCidrRange".equals(fieldName)) {
      return ipCidrRange;
    }
    if ("subnetworkRangeName".equals(fieldName)) {
      return subnetworkRangeName;
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
   * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the
   * specified subnetwork and cannot contain IP addresses reserved by system or used by other
   * network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such
   * as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
   */
  public String getIpCidrRange() {
    return ipCidrRange;
  }

  /**
   * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not
   * specified, the primary range of the subnetwork is used.
   */
  public String getSubnetworkRangeName() {
    return subnetworkRangeName;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(AliasIpRange prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static AliasIpRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final AliasIpRange DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new AliasIpRange();
  }

  public static class Builder {
    private String ipCidrRange;
    private String subnetworkRangeName;

    Builder() {}

    public Builder mergeFrom(AliasIpRange other) {
      if (other == AliasIpRange.getDefaultInstance()) return this;
      if (other.getIpCidrRange() != null) {
        this.ipCidrRange = other.ipCidrRange;
      }
      if (other.getSubnetworkRangeName() != null) {
        this.subnetworkRangeName = other.subnetworkRangeName;
      }
      return this;
    }

    Builder(AliasIpRange source) {
      this.ipCidrRange = source.ipCidrRange;
      this.subnetworkRangeName = source.subnetworkRangeName;
    }

    /**
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the
     * specified subnetwork and cannot contain IP addresses reserved by system or used by other
     * network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such
     * as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     */
    public String getIpCidrRange() {
      return ipCidrRange;
    }

    /**
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the
     * specified subnetwork and cannot contain IP addresses reserved by system or used by other
     * network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such
     * as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     */
    public Builder setIpCidrRange(String ipCidrRange) {
      this.ipCidrRange = ipCidrRange;
      return this;
    }

    /**
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not
     * specified, the primary range of the subnetwork is used.
     */
    public String getSubnetworkRangeName() {
      return subnetworkRangeName;
    }

    /**
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not
     * specified, the primary range of the subnetwork is used.
     */
    public Builder setSubnetworkRangeName(String subnetworkRangeName) {
      this.subnetworkRangeName = subnetworkRangeName;
      return this;
    }

    public AliasIpRange build() {

      return new AliasIpRange(ipCidrRange, subnetworkRangeName);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setIpCidrRange(this.ipCidrRange);
      newBuilder.setSubnetworkRangeName(this.subnetworkRangeName);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "AliasIpRange{"
        + "ipCidrRange="
        + ipCidrRange
        + ", "
        + "subnetworkRangeName="
        + subnetworkRangeName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AliasIpRange) {
      AliasIpRange that = (AliasIpRange) o;
      return Objects.equals(this.ipCidrRange, that.getIpCidrRange())
          && Objects.equals(this.subnetworkRangeName, that.getSubnetworkRangeName());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipCidrRange, subnetworkRangeName);
  }
}
