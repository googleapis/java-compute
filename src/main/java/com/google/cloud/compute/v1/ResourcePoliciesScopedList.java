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
public final class ResourcePoliciesScopedList implements ApiMessage {
  private final List<ResourcePolicy> resourcePolicies;
  private final Warning warning;

  private ResourcePoliciesScopedList() {
    this.resourcePolicies = null;
    this.warning = null;
  }

  private ResourcePoliciesScopedList(List<ResourcePolicy> resourcePolicies, Warning warning) {
    this.resourcePolicies = resourcePolicies;
    this.warning = warning;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("resourcePolicies".equals(fieldName)) {
      return resourcePolicies;
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

  /** A list of resourcePolicies contained in this scope. */
  public List<ResourcePolicy> getResourcePoliciesList() {
    return resourcePolicies;
  }

  /** Informational warning which replaces the list of resourcePolicies when the list is empty. */
  public Warning getWarning() {
    return warning;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ResourcePoliciesScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ResourcePoliciesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ResourcePoliciesScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ResourcePoliciesScopedList();
  }

  public static class Builder {
    private List<ResourcePolicy> resourcePolicies;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(ResourcePoliciesScopedList other) {
      if (other == ResourcePoliciesScopedList.getDefaultInstance()) return this;
      if (other.getResourcePoliciesList() != null) {
        this.resourcePolicies = other.resourcePolicies;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(ResourcePoliciesScopedList source) {
      this.resourcePolicies = source.resourcePolicies;
      this.warning = source.warning;
    }

    /** A list of resourcePolicies contained in this scope. */
    public List<ResourcePolicy> getResourcePoliciesList() {
      return resourcePolicies;
    }

    /** A list of resourcePolicies contained in this scope. */
    public Builder addAllResourcePolicies(List<ResourcePolicy> resourcePolicies) {
      if (this.resourcePolicies == null) {
        this.resourcePolicies = new LinkedList<>();
      }
      this.resourcePolicies.addAll(resourcePolicies);
      return this;
    }

    /** A list of resourcePolicies contained in this scope. */
    public Builder addResourcePolicies(ResourcePolicy resourcePolicies) {
      if (this.resourcePolicies == null) {
        this.resourcePolicies = new LinkedList<>();
      }
      this.resourcePolicies.add(resourcePolicies);
      return this;
    }

    /** Informational warning which replaces the list of resourcePolicies when the list is empty. */
    public Warning getWarning() {
      return warning;
    }

    /** Informational warning which replaces the list of resourcePolicies when the list is empty. */
    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }

    public ResourcePoliciesScopedList build() {

      return new ResourcePoliciesScopedList(resourcePolicies, warning);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllResourcePolicies(this.resourcePolicies);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ResourcePoliciesScopedList{"
        + "resourcePolicies="
        + resourcePolicies
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
    if (o instanceof ResourcePoliciesScopedList) {
      ResourcePoliciesScopedList that = (ResourcePoliciesScopedList) o;
      return Objects.equals(this.resourcePolicies, that.getResourcePoliciesList())
          && Objects.equals(this.warning, that.getWarning());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourcePolicies, warning);
  }
}
