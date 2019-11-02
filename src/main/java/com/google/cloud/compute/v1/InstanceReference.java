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
public final class InstanceReference implements ApiMessage {
  private final String instance;

  private InstanceReference() {
    this.instance = null;
  }

  private InstanceReference(String instance) {
    this.instance = instance;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("instance".equals(fieldName)) {
      return instance;
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

  /** The URL for a specific instance. */
  public String getInstance() {
    return instance;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(InstanceReference prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final InstanceReference DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new InstanceReference();
  }

  public static class Builder {
    private String instance;

    Builder() {}

    public Builder mergeFrom(InstanceReference other) {
      if (other == InstanceReference.getDefaultInstance()) return this;
      if (other.getInstance() != null) {
        this.instance = other.instance;
      }
      return this;
    }

    Builder(InstanceReference source) {
      this.instance = source.instance;
    }

    /** The URL for a specific instance. */
    public String getInstance() {
      return instance;
    }

    /** The URL for a specific instance. */
    public Builder setInstance(String instance) {
      this.instance = instance;
      return this;
    }

    public InstanceReference build() {
      return new InstanceReference(instance);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setInstance(this.instance);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstanceReference{" + "instance=" + instance + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceReference) {
      InstanceReference that = (InstanceReference) o;
      return Objects.equals(this.instance, that.getInstance());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(instance);
  }
}
