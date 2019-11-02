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
public final class ResourceGroupReference implements ApiMessage {
  private final String group;

  private ResourceGroupReference() {
    this.group = null;
  }

  private ResourceGroupReference(String group) {
    this.group = group;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("group".equals(fieldName)) {
      return group;
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
   * A URI referencing one of the instance groups or network endpoint groups listed in the backend
   * service.
   */
  public String getGroup() {
    return group;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ResourceGroupReference prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ResourceGroupReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ResourceGroupReference DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ResourceGroupReference();
  }

  public static class Builder {
    private String group;

    Builder() {}

    public Builder mergeFrom(ResourceGroupReference other) {
      if (other == ResourceGroupReference.getDefaultInstance()) return this;
      if (other.getGroup() != null) {
        this.group = other.group;
      }
      return this;
    }

    Builder(ResourceGroupReference source) {
      this.group = source.group;
    }

    /**
     * A URI referencing one of the instance groups or network endpoint groups listed in the backend
     * service.
     */
    public String getGroup() {
      return group;
    }

    /**
     * A URI referencing one of the instance groups or network endpoint groups listed in the backend
     * service.
     */
    public Builder setGroup(String group) {
      this.group = group;
      return this;
    }

    public ResourceGroupReference build() {
      return new ResourceGroupReference(group);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setGroup(this.group);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ResourceGroupReference{" + "group=" + group + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ResourceGroupReference) {
      ResourceGroupReference that = (ResourceGroupReference) o;
      return Objects.equals(this.group, that.getGroup());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(group);
  }
}
