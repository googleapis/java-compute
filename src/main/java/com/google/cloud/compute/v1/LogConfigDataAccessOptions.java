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
/** Write a Data Access (Gin) log */
public final class LogConfigDataAccessOptions implements ApiMessage {
  private final String logMode;

  private LogConfigDataAccessOptions() {
    this.logMode = null;
  }

  private LogConfigDataAccessOptions(String logMode) {
    this.logMode = logMode;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("logMode".equals(fieldName)) {
      return logMode;
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
   * Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant only
   * in the LocalIAM implementation, for now.
   */
  public String getLogMode() {
    return logMode;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(LogConfigDataAccessOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static LogConfigDataAccessOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final LogConfigDataAccessOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new LogConfigDataAccessOptions();
  }

  public static class Builder {
    private String logMode;

    Builder() {}

    public Builder mergeFrom(LogConfigDataAccessOptions other) {
      if (other == LogConfigDataAccessOptions.getDefaultInstance()) return this;
      if (other.getLogMode() != null) {
        this.logMode = other.logMode;
      }
      return this;
    }

    Builder(LogConfigDataAccessOptions source) {
      this.logMode = source.logMode;
    }

    /**
     * Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant
     * only in the LocalIAM implementation, for now.
     */
    public String getLogMode() {
      return logMode;
    }

    /**
     * Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant
     * only in the LocalIAM implementation, for now.
     */
    public Builder setLogMode(String logMode) {
      this.logMode = logMode;
      return this;
    }

    public LogConfigDataAccessOptions build() {
      return new LogConfigDataAccessOptions(logMode);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setLogMode(this.logMode);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "LogConfigDataAccessOptions{" + "logMode=" + logMode + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof LogConfigDataAccessOptions) {
      LogConfigDataAccessOptions that = (LogConfigDataAccessOptions) o;
      return Objects.equals(this.logMode, that.getLogMode());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(logMode);
  }
}
