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
public final class BackendServiceGroupHealth implements ApiMessage {
  private final List<HealthStatus> healthStatus;
  private final String kind;

  private BackendServiceGroupHealth() {
    this.healthStatus = null;
    this.kind = null;
  }

  private BackendServiceGroupHealth(List<HealthStatus> healthStatus, String kind) {
    this.healthStatus = healthStatus;
    this.kind = kind;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("healthStatus".equals(fieldName)) {
      return healthStatus;
    }
    if ("kind".equals(fieldName)) {
      return kind;
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
   * Health state of the backend instances or endpoints in requested instance or network endpoint
   * group, determined based on configured health checks.
   */
  public List<HealthStatus> getHealthStatusList() {
    return healthStatus;
  }

  /**
   * [Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of
   * backend services.
   */
  public String getKind() {
    return kind;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(BackendServiceGroupHealth prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static BackendServiceGroupHealth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final BackendServiceGroupHealth DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new BackendServiceGroupHealth();
  }

  public static class Builder {
    private List<HealthStatus> healthStatus;
    private String kind;

    Builder() {}

    public Builder mergeFrom(BackendServiceGroupHealth other) {
      if (other == BackendServiceGroupHealth.getDefaultInstance()) return this;
      if (other.getHealthStatusList() != null) {
        this.healthStatus = other.healthStatus;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      return this;
    }

    Builder(BackendServiceGroupHealth source) {
      this.healthStatus = source.healthStatus;
      this.kind = source.kind;
    }

    /**
     * Health state of the backend instances or endpoints in requested instance or network endpoint
     * group, determined based on configured health checks.
     */
    public List<HealthStatus> getHealthStatusList() {
      return healthStatus;
    }

    /**
     * Health state of the backend instances or endpoints in requested instance or network endpoint
     * group, determined based on configured health checks.
     */
    public Builder addAllHealthStatus(List<HealthStatus> healthStatus) {
      if (this.healthStatus == null) {
        this.healthStatus = new LinkedList<>();
      }
      this.healthStatus.addAll(healthStatus);
      return this;
    }

    /**
     * Health state of the backend instances or endpoints in requested instance or network endpoint
     * group, determined based on configured health checks.
     */
    public Builder addHealthStatus(HealthStatus healthStatus) {
      if (this.healthStatus == null) {
        this.healthStatus = new LinkedList<>();
      }
      this.healthStatus.add(healthStatus);
      return this;
    }

    /**
     * [Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of
     * backend services.
     */
    public String getKind() {
      return kind;
    }

    /**
     * [Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of
     * backend services.
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public BackendServiceGroupHealth build() {

      return new BackendServiceGroupHealth(healthStatus, kind);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllHealthStatus(this.healthStatus);
      newBuilder.setKind(this.kind);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "BackendServiceGroupHealth{"
        + "healthStatus="
        + healthStatus
        + ", "
        + "kind="
        + kind
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BackendServiceGroupHealth) {
      BackendServiceGroupHealth that = (BackendServiceGroupHealth) o;
      return Objects.equals(this.healthStatus, that.getHealthStatusList())
          && Objects.equals(this.kind, that.getKind());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthStatus, kind);
  }
}
