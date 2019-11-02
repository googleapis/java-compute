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
public final class BackendServicesScopedList implements ApiMessage {
  private final List<BackendService> backendServices;
  private final Warning warning;

  private BackendServicesScopedList() {
    this.backendServices = null;
    this.warning = null;
  }

  private BackendServicesScopedList(List<BackendService> backendServices, Warning warning) {
    this.backendServices = backendServices;
    this.warning = warning;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("backendServices".equals(fieldName)) {
      return backendServices;
    }
    if ("warning".equals(fieldName)) {
      return warning;
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

  /** A list of BackendServices contained in this scope. */
  public List<BackendService> getBackendServicesList() {
    return backendServices;
  }

  /** Informational warning which replaces the list of backend services when the list is empty. */
  public Warning getWarning() {
    return warning;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(BackendServicesScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static BackendServicesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final BackendServicesScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new BackendServicesScopedList();
  }

  public static class Builder {
    private List<BackendService> backendServices;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(BackendServicesScopedList other) {
      if (other == BackendServicesScopedList.getDefaultInstance()) return this;
      if (other.getBackendServicesList() != null) {
        this.backendServices = other.backendServices;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(BackendServicesScopedList source) {
      this.backendServices = source.backendServices;
      this.warning = source.warning;
    }

    /** A list of BackendServices contained in this scope. */
    public List<BackendService> getBackendServicesList() {
      return backendServices;
    }

    /** A list of BackendServices contained in this scope. */
    public Builder addAllBackendServices(List<BackendService> backendServices) {
      if (this.backendServices == null) {
        this.backendServices = new LinkedList<>();
      }
      this.backendServices.addAll(backendServices);
      return this;
    }

    /** A list of BackendServices contained in this scope. */
    public Builder addBackendServices(BackendService backendServices) {
      if (this.backendServices == null) {
        this.backendServices = new LinkedList<>();
      }
      this.backendServices.add(backendServices);
      return this;
    }

    /** Informational warning which replaces the list of backend services when the list is empty. */
    public Warning getWarning() {
      return warning;
    }

    /** Informational warning which replaces the list of backend services when the list is empty. */
    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }

    public BackendServicesScopedList build() {

      return new BackendServicesScopedList(backendServices, warning);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllBackendServices(this.backendServices);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "BackendServicesScopedList{"
        + "backendServices="
        + backendServices
        + ", "
        + "warning="
        + warning
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BackendServicesScopedList) {
      BackendServicesScopedList that = (BackendServicesScopedList) o;
      return Objects.equals(this.backendServices, that.getBackendServicesList())
          && Objects.equals(this.warning, that.getWarning());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendServices, warning);
  }
}
