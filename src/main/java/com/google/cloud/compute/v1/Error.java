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
 * [Output Only] If errors are generated during processing of the operation, this field will be
 * populated.
 */
public final class Error implements ApiMessage {
  private final List<Errors> errors;

  private Error() {
    this.errors = null;
  }

  private Error(List<Errors> errors) {
    this.errors = errors;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("errors".equals(fieldName)) {
      return errors;
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

  /** [Output Only] The array of errors encountered while processing this operation. */
  public List<Errors> getErrorsList() {
    return errors;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(Error prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Error getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final Error DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new Error();
  }

  public static class Builder {
    private List<Errors> errors;

    Builder() {}

    public Builder mergeFrom(Error other) {
      if (other == Error.getDefaultInstance()) return this;
      if (other.getErrorsList() != null) {
        this.errors = other.errors;
      }
      return this;
    }

    Builder(Error source) {
      this.errors = source.errors;
    }

    /** [Output Only] The array of errors encountered while processing this operation. */
    public List<Errors> getErrorsList() {
      return errors;
    }

    /** [Output Only] The array of errors encountered while processing this operation. */
    public Builder addAllErrors(List<Errors> errors) {
      if (this.errors == null) {
        this.errors = new LinkedList<>();
      }
      this.errors.addAll(errors);
      return this;
    }

    /** [Output Only] The array of errors encountered while processing this operation. */
    public Builder addErrors(Errors errors) {
      if (this.errors == null) {
        this.errors = new LinkedList<>();
      }
      this.errors.add(errors);
      return this;
    }

    public Error build() {
      return new Error(errors);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllErrors(this.errors);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Error{" + "errors=" + errors + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Error) {
      Error that = (Error) o;
      return Objects.equals(this.errors, that.getErrorsList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }
}
