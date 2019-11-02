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
/** Configuration parameters of autoscaling based on load balancing. */
public final class AutoscalingPolicyLoadBalancingUtilization implements ApiMessage {
  private final Double utilizationTarget;

  private AutoscalingPolicyLoadBalancingUtilization() {
    this.utilizationTarget = null;
  }

  private AutoscalingPolicyLoadBalancingUtilization(Double utilizationTarget) {
    this.utilizationTarget = utilizationTarget;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("utilizationTarget".equals(fieldName)) {
      return utilizationTarget;
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
   * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that
   * autoscaler should maintain. Must be a positive float value. If not defined, the default is 0.8.
   */
  public Double getUtilizationTarget() {
    return utilizationTarget;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(AutoscalingPolicyLoadBalancingUtilization prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static AutoscalingPolicyLoadBalancingUtilization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final AutoscalingPolicyLoadBalancingUtilization DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new AutoscalingPolicyLoadBalancingUtilization();
  }

  public static class Builder {
    private Double utilizationTarget;

    Builder() {}

    public Builder mergeFrom(AutoscalingPolicyLoadBalancingUtilization other) {
      if (other == AutoscalingPolicyLoadBalancingUtilization.getDefaultInstance()) return this;
      if (other.getUtilizationTarget() != null) {
        this.utilizationTarget = other.utilizationTarget;
      }
      return this;
    }

    Builder(AutoscalingPolicyLoadBalancingUtilization source) {
      this.utilizationTarget = source.utilizationTarget;
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that
     * autoscaler should maintain. Must be a positive float value. If not defined, the default is
     * 0.8.
     */
    public Double getUtilizationTarget() {
      return utilizationTarget;
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that
     * autoscaler should maintain. Must be a positive float value. If not defined, the default is
     * 0.8.
     */
    public Builder setUtilizationTarget(Double utilizationTarget) {
      this.utilizationTarget = utilizationTarget;
      return this;
    }

    public AutoscalingPolicyLoadBalancingUtilization build() {
      return new AutoscalingPolicyLoadBalancingUtilization(utilizationTarget);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setUtilizationTarget(this.utilizationTarget);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "AutoscalingPolicyLoadBalancingUtilization{"
        + "utilizationTarget="
        + utilizationTarget
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AutoscalingPolicyLoadBalancingUtilization) {
      AutoscalingPolicyLoadBalancingUtilization that =
          (AutoscalingPolicyLoadBalancingUtilization) o;
      return Objects.equals(this.utilizationTarget, that.getUtilizationTarget());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(utilizationTarget);
  }
}
