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
public final class ForwardingRulesScopedList implements ApiMessage {
  private final List<ForwardingRule> forwardingRules;
  private final Warning warning;

  private ForwardingRulesScopedList() {
    this.forwardingRules = null;
    this.warning = null;
  }

  private ForwardingRulesScopedList(List<ForwardingRule> forwardingRules, Warning warning) {
    this.forwardingRules = forwardingRules;
    this.warning = warning;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("forwardingRules".equals(fieldName)) {
      return forwardingRules;
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

  /** A list of forwarding rules contained in this scope. */
  public List<ForwardingRule> getForwardingRulesList() {
    return forwardingRules;
  }

  /** Informational warning which replaces the list of forwarding rules when the list is empty. */
  public Warning getWarning() {
    return warning;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ForwardingRulesScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ForwardingRulesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ForwardingRulesScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ForwardingRulesScopedList();
  }

  public static class Builder {
    private List<ForwardingRule> forwardingRules;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(ForwardingRulesScopedList other) {
      if (other == ForwardingRulesScopedList.getDefaultInstance()) return this;
      if (other.getForwardingRulesList() != null) {
        this.forwardingRules = other.forwardingRules;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(ForwardingRulesScopedList source) {
      this.forwardingRules = source.forwardingRules;
      this.warning = source.warning;
    }

    /** A list of forwarding rules contained in this scope. */
    public List<ForwardingRule> getForwardingRulesList() {
      return forwardingRules;
    }

    /** A list of forwarding rules contained in this scope. */
    public Builder addAllForwardingRules(List<ForwardingRule> forwardingRules) {
      if (this.forwardingRules == null) {
        this.forwardingRules = new LinkedList<>();
      }
      this.forwardingRules.addAll(forwardingRules);
      return this;
    }

    /** A list of forwarding rules contained in this scope. */
    public Builder addForwardingRules(ForwardingRule forwardingRules) {
      if (this.forwardingRules == null) {
        this.forwardingRules = new LinkedList<>();
      }
      this.forwardingRules.add(forwardingRules);
      return this;
    }

    /** Informational warning which replaces the list of forwarding rules when the list is empty. */
    public Warning getWarning() {
      return warning;
    }

    /** Informational warning which replaces the list of forwarding rules when the list is empty. */
    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }

    public ForwardingRulesScopedList build() {

      return new ForwardingRulesScopedList(forwardingRules, warning);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllForwardingRules(this.forwardingRules);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ForwardingRulesScopedList{"
        + "forwardingRules="
        + forwardingRules
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
    if (o instanceof ForwardingRulesScopedList) {
      ForwardingRulesScopedList that = (ForwardingRulesScopedList) o;
      return Objects.equals(this.forwardingRules, that.getForwardingRulesList())
          && Objects.equals(this.warning, that.getWarning());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(forwardingRules, warning);
  }
}
