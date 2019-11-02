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
public final class TargetInstancesScopedList implements ApiMessage {
  private final List<TargetInstance> targetInstances;
  private final Warning warning;

  private TargetInstancesScopedList() {
    this.targetInstances = null;
    this.warning = null;
  }

  private TargetInstancesScopedList(List<TargetInstance> targetInstances, Warning warning) {
    this.targetInstances = targetInstances;
    this.warning = warning;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("targetInstances".equals(fieldName)) {
      return targetInstances;
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

  /** A list of target instances contained in this scope. */
  public List<TargetInstance> getTargetInstancesList() {
    return targetInstances;
  }

  /** Informational warning which replaces the list of addresses when the list is empty. */
  public Warning getWarning() {
    return warning;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(TargetInstancesScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static TargetInstancesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final TargetInstancesScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new TargetInstancesScopedList();
  }

  public static class Builder {
    private List<TargetInstance> targetInstances;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(TargetInstancesScopedList other) {
      if (other == TargetInstancesScopedList.getDefaultInstance()) return this;
      if (other.getTargetInstancesList() != null) {
        this.targetInstances = other.targetInstances;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(TargetInstancesScopedList source) {
      this.targetInstances = source.targetInstances;
      this.warning = source.warning;
    }

    /** A list of target instances contained in this scope. */
    public List<TargetInstance> getTargetInstancesList() {
      return targetInstances;
    }

    /** A list of target instances contained in this scope. */
    public Builder addAllTargetInstances(List<TargetInstance> targetInstances) {
      if (this.targetInstances == null) {
        this.targetInstances = new LinkedList<>();
      }
      this.targetInstances.addAll(targetInstances);
      return this;
    }

    /** A list of target instances contained in this scope. */
    public Builder addTargetInstances(TargetInstance targetInstances) {
      if (this.targetInstances == null) {
        this.targetInstances = new LinkedList<>();
      }
      this.targetInstances.add(targetInstances);
      return this;
    }

    /** Informational warning which replaces the list of addresses when the list is empty. */
    public Warning getWarning() {
      return warning;
    }

    /** Informational warning which replaces the list of addresses when the list is empty. */
    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }

    public TargetInstancesScopedList build() {

      return new TargetInstancesScopedList(targetInstances, warning);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllTargetInstances(this.targetInstances);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "TargetInstancesScopedList{"
        + "targetInstances="
        + targetInstances
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
    if (o instanceof TargetInstancesScopedList) {
      TargetInstancesScopedList that = (TargetInstancesScopedList) o;
      return Objects.equals(this.targetInstances, that.getTargetInstancesList())
          && Objects.equals(this.warning, that.getWarning());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetInstances, warning);
  }
}
