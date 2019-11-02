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
public final class TargetPoolsRemoveHealthCheckRequest implements ApiMessage {
  private final List<HealthCheckReference> healthChecks;

  private TargetPoolsRemoveHealthCheckRequest() {
    this.healthChecks = null;
  }

  private TargetPoolsRemoveHealthCheckRequest(List<HealthCheckReference> healthChecks) {
    this.healthChecks = healthChecks;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("healthChecks".equals(fieldName)) {
      return healthChecks;
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
   * Health check URL to be removed. This can be a full or valid partial URL. For example, the
   * following are valid URLs: -
   * https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check -
   * projects/project/global/httpHealthChecks/health-check - global/httpHealthChecks/health-check
   */
  public List<HealthCheckReference> getHealthChecksList() {
    return healthChecks;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(TargetPoolsRemoveHealthCheckRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TargetPoolsRemoveHealthCheckRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final TargetPoolsRemoveHealthCheckRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new TargetPoolsRemoveHealthCheckRequest();
  }

  public static class Builder {
    private List<HealthCheckReference> healthChecks;

    Builder() {}

    public Builder mergeFrom(TargetPoolsRemoveHealthCheckRequest other) {
      if (other == TargetPoolsRemoveHealthCheckRequest.getDefaultInstance()) return this;
      if (other.getHealthChecksList() != null) {
        this.healthChecks = other.healthChecks;
      }
      return this;
    }

    Builder(TargetPoolsRemoveHealthCheckRequest source) {
      this.healthChecks = source.healthChecks;
    }

    /**
     * Health check URL to be removed. This can be a full or valid partial URL. For example, the
     * following are valid URLs: -
     * https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
     * - projects/project/global/httpHealthChecks/health-check -
     * global/httpHealthChecks/health-check
     */
    public List<HealthCheckReference> getHealthChecksList() {
      return healthChecks;
    }

    /**
     * Health check URL to be removed. This can be a full or valid partial URL. For example, the
     * following are valid URLs: -
     * https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
     * - projects/project/global/httpHealthChecks/health-check -
     * global/httpHealthChecks/health-check
     */
    public Builder addAllHealthChecks(List<HealthCheckReference> healthChecks) {
      if (this.healthChecks == null) {
        this.healthChecks = new LinkedList<>();
      }
      this.healthChecks.addAll(healthChecks);
      return this;
    }

    /**
     * Health check URL to be removed. This can be a full or valid partial URL. For example, the
     * following are valid URLs: -
     * https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check
     * - projects/project/global/httpHealthChecks/health-check -
     * global/httpHealthChecks/health-check
     */
    public Builder addHealthChecks(HealthCheckReference healthChecks) {
      if (this.healthChecks == null) {
        this.healthChecks = new LinkedList<>();
      }
      this.healthChecks.add(healthChecks);
      return this;
    }

    public TargetPoolsRemoveHealthCheckRequest build() {
      return new TargetPoolsRemoveHealthCheckRequest(healthChecks);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllHealthChecks(this.healthChecks);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TargetPoolsRemoveHealthCheckRequest{" + "healthChecks=" + healthChecks + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TargetPoolsRemoveHealthCheckRequest) {
      TargetPoolsRemoveHealthCheckRequest that = (TargetPoolsRemoveHealthCheckRequest) o;
      return Objects.equals(this.healthChecks, that.getHealthChecksList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthChecks);
  }
}
