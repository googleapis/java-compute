/*
 * Copyright 2018 Google LLC
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
public final class Rule implements ApiMessage {
  private final String action;
  private final List<Condition> conditions;
  private final String description;
  private final List<String> ins;
  private final List<LogConfig> logConfigs;
  private final List<String> notIns;
  private final List<String> permissions;

  private Rule() {
    this.action = null;
    this.conditions = null;
    this.description = null;
    this.ins = null;
    this.logConfigs = null;
    this.notIns = null;
    this.permissions = null;
  }

  private Rule(
      String action,
      List<Condition> conditions,
      String description,
      List<String> ins,
      List<LogConfig> logConfigs,
      List<String> notIns,
      List<String> permissions) {
    this.action = action;
    this.conditions = conditions;
    this.description = description;
    this.ins = ins;
    this.logConfigs = logConfigs;
    this.notIns = notIns;
    this.permissions = permissions;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if (fieldName.equals("action")) {
      return action;
    }
    if (fieldName.equals("conditions")) {
      return conditions;
    }
    if (fieldName.equals("description")) {
      return description;
    }
    if (fieldName.equals("ins")) {
      return ins;
    }
    if (fieldName.equals("logConfigs")) {
      return logConfigs;
    }
    if (fieldName.equals("notIns")) {
      return notIns;
    }
    if (fieldName.equals("permissions")) {
      return permissions;
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
  public List<String> getFieldMask() {
    return null;
  }

  public String getAction() {
    return action;
  }

  public List<Condition> getConditionsList() {
    return conditions;
  }

  public String getDescription() {
    return description;
  }

  public List<String> getInsList() {
    return ins;
  }

  public List<LogConfig> getLogConfigsList() {
    return logConfigs;
  }

  public List<String> getNotInsList() {
    return notIns;
  }

  public List<String> getPermissionsList() {
    return permissions;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(Rule prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static Rule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final Rule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new Rule();
  }

  public static class Builder {
    private String action;
    private List<Condition> conditions;
    private String description;
    private List<String> ins;
    private List<LogConfig> logConfigs;
    private List<String> notIns;
    private List<String> permissions;

    Builder() {}

    public Builder mergeFrom(Rule other) {
      if (other == Rule.getDefaultInstance()) return this;
      if (other.getAction() != null) {
        this.action = other.action;
      }
      if (other.getConditionsList() != null) {
        this.conditions = other.conditions;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getInsList() != null) {
        this.ins = other.ins;
      }
      if (other.getLogConfigsList() != null) {
        this.logConfigs = other.logConfigs;
      }
      if (other.getNotInsList() != null) {
        this.notIns = other.notIns;
      }
      if (other.getPermissionsList() != null) {
        this.permissions = other.permissions;
      }
      return this;
    }

    Builder(Rule source) {
      this.action = source.action;
      this.conditions = source.conditions;
      this.description = source.description;
      this.ins = source.ins;
      this.logConfigs = source.logConfigs;
      this.notIns = source.notIns;
      this.permissions = source.permissions;
    }

    public String getAction() {
      return action;
    }

    public Builder setAction(String action) {
      this.action = action;
      return this;
    }

    public List<Condition> getConditionsList() {
      return conditions;
    }

    public Builder addAllConditions(List<Condition> conditions) {
      if (this.conditions == null) {
        this.conditions = new LinkedList<>();
      }
      this.conditions.addAll(conditions);
      return this;
    }

    public Builder addConditions(Condition conditions) {
      if (this.conditions == null) {
        this.conditions = new LinkedList<>();
      }
      this.conditions.add(conditions);
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public List<String> getInsList() {
      return ins;
    }

    public Builder addAllIns(List<String> ins) {
      if (this.ins == null) {
        this.ins = new LinkedList<>();
      }
      this.ins.addAll(ins);
      return this;
    }

    public Builder addIns(String ins) {
      if (this.ins == null) {
        this.ins = new LinkedList<>();
      }
      this.ins.add(ins);
      return this;
    }

    public List<LogConfig> getLogConfigsList() {
      return logConfigs;
    }

    public Builder addAllLogConfigs(List<LogConfig> logConfigs) {
      if (this.logConfigs == null) {
        this.logConfigs = new LinkedList<>();
      }
      this.logConfigs.addAll(logConfigs);
      return this;
    }

    public Builder addLogConfigs(LogConfig logConfigs) {
      if (this.logConfigs == null) {
        this.logConfigs = new LinkedList<>();
      }
      this.logConfigs.add(logConfigs);
      return this;
    }

    public List<String> getNotInsList() {
      return notIns;
    }

    public Builder addAllNotIns(List<String> notIns) {
      if (this.notIns == null) {
        this.notIns = new LinkedList<>();
      }
      this.notIns.addAll(notIns);
      return this;
    }

    public Builder addNotIns(String notIns) {
      if (this.notIns == null) {
        this.notIns = new LinkedList<>();
      }
      this.notIns.add(notIns);
      return this;
    }

    public List<String> getPermissionsList() {
      return permissions;
    }

    public Builder addAllPermissions(List<String> permissions) {
      if (this.permissions == null) {
        this.permissions = new LinkedList<>();
      }
      this.permissions.addAll(permissions);
      return this;
    }

    public Builder addPermissions(String permissions) {
      if (this.permissions == null) {
        this.permissions = new LinkedList<>();
      }
      this.permissions.add(permissions);
      return this;
    }

    public Rule build() {

      return new Rule(action, conditions, description, ins, logConfigs, notIns, permissions);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAction(this.action);
      newBuilder.addAllConditions(this.conditions);
      newBuilder.setDescription(this.description);
      newBuilder.addAllIns(this.ins);
      newBuilder.addAllLogConfigs(this.logConfigs);
      newBuilder.addAllNotIns(this.notIns);
      newBuilder.addAllPermissions(this.permissions);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "Rule{"
        + "action="
        + action
        + ", "
        + "conditions="
        + conditions
        + ", "
        + "description="
        + description
        + ", "
        + "ins="
        + ins
        + ", "
        + "logConfigs="
        + logConfigs
        + ", "
        + "notIns="
        + notIns
        + ", "
        + "permissions="
        + permissions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Rule) {
      Rule that = (Rule) o;
      return Objects.equals(this.action, that.getAction())
          && Objects.equals(this.conditions, that.getConditionsList())
          && Objects.equals(this.description, that.getDescription())
          && Objects.equals(this.ins, that.getInsList())
          && Objects.equals(this.logConfigs, that.getLogConfigsList())
          && Objects.equals(this.notIns, that.getNotInsList())
          && Objects.equals(this.permissions, that.getPermissionsList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, conditions, description, ins, logConfigs, notIns, permissions);
  }
}