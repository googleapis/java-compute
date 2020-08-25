/*
 * Copyright 2020 Google LLC
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
/** A Managed Instance resource. */
public final class ManagedInstance implements ApiMessage {
  private final String currentAction;
  private final String id;
  private final String instance;
  private final List<ManagedInstanceInstanceHealth> instanceHealth;
  private final String instanceStatus;
  private final ManagedInstanceLastAttempt lastAttempt;
  private final PreservedState preservedStateFromConfig;
  private final PreservedState preservedStateFromPolicy;
  private final ManagedInstanceVersion version;

  private ManagedInstance() {
    this.currentAction = null;
    this.id = null;
    this.instance = null;
    this.instanceHealth = null;
    this.instanceStatus = null;
    this.lastAttempt = null;
    this.preservedStateFromConfig = null;
    this.preservedStateFromPolicy = null;
    this.version = null;
  }

  private ManagedInstance(
      String currentAction,
      String id,
      String instance,
      List<ManagedInstanceInstanceHealth> instanceHealth,
      String instanceStatus,
      ManagedInstanceLastAttempt lastAttempt,
      PreservedState preservedStateFromConfig,
      PreservedState preservedStateFromPolicy,
      ManagedInstanceVersion version) {
    this.currentAction = currentAction;
    this.id = id;
    this.instance = instance;
    this.instanceHealth = instanceHealth;
    this.instanceStatus = instanceStatus;
    this.lastAttempt = lastAttempt;
    this.preservedStateFromConfig = preservedStateFromConfig;
    this.preservedStateFromPolicy = preservedStateFromPolicy;
    this.version = version;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("currentAction".equals(fieldName)) {
      return currentAction;
    }
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("instance".equals(fieldName)) {
      return instance;
    }
    if ("instanceHealth".equals(fieldName)) {
      return instanceHealth;
    }
    if ("instanceStatus".equals(fieldName)) {
      return instanceStatus;
    }
    if ("lastAttempt".equals(fieldName)) {
      return lastAttempt;
    }
    if ("preservedStateFromConfig".equals(fieldName)) {
      return preservedStateFromConfig;
    }
    if ("preservedStateFromPolicy".equals(fieldName)) {
      return preservedStateFromPolicy;
    }
    if ("version".equals(fieldName)) {
      return version;
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
   * [Output Only] The current action that the managed instance group has scheduled for the
   * instance. Possible values: - NONE The instance is running, and the managed instance group does
   * not have any scheduled actions for this instance. - CREATING The managed instance group is
   * creating this instance. If the group fails to create this instance, it will try again until it
   * is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting to create
   * this instance only once. If the group fails to create this instance, it does not try again and
   * the group's targetSize value is decreased instead. - RECREATING The managed instance group is
   * recreating this instance. - DELETING The managed instance group is permanently deleting this
   * instance. - ABANDONING The managed instance group is abandoning this instance. The instance
   * will be removed from the instance group and from any target pools that are associated with this
   * group. - RESTARTING The managed instance group is restarting the instance. - REFRESHING The
   * managed instance group is applying configuration changes to the instance without stopping it.
   * For example, the group can update the target pool list for an instance without stopping that
   * instance. - VERIFYING The managed instance group has created the instance and it is in the
   * process of being verified.
   */
  public String getCurrentAction() {
    return currentAction;
  }

  /**
   * [Output only] The unique identifier for this resource. This field is empty when instance does
   * not exist.
   */
  public String getId() {
    return id;
  }

  /**
   * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet been
   * created.
   */
  public String getInstance() {
    return instance;
  }

  /** [Output Only] Health state of the instance per health-check. */
  public List<ManagedInstanceInstanceHealth> getInstanceHealthList() {
    return instanceHealth;
  }

  /**
   * [Output Only] The status of the instance. This field is empty when the instance does not exist.
   */
  public String getInstanceStatus() {
    return instanceStatus;
  }

  /** [Output Only] Information about the last attempt to create or delete the instance. */
  public ManagedInstanceLastAttempt getLastAttempt() {
    return lastAttempt;
  }

  /** [Output Only] Preserved state applied from per-instance config for this instance. */
  public PreservedState getPreservedStateFromConfig() {
    return preservedStateFromConfig;
  }

  /** [Output Only] Preserved state generated based on stateful policy for this instance. */
  public PreservedState getPreservedStateFromPolicy() {
    return preservedStateFromPolicy;
  }

  /** [Output Only] Intended version of this instance. */
  public ManagedInstanceVersion getVersion() {
    return version;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(ManagedInstance prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static ManagedInstance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final ManagedInstance DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new ManagedInstance();
  }

  public static class Builder {
    private String currentAction;
    private String id;
    private String instance;
    private List<ManagedInstanceInstanceHealth> instanceHealth;
    private String instanceStatus;
    private ManagedInstanceLastAttempt lastAttempt;
    private PreservedState preservedStateFromConfig;
    private PreservedState preservedStateFromPolicy;
    private ManagedInstanceVersion version;

    Builder() {}

    public Builder mergeFrom(ManagedInstance other) {
      if (other == ManagedInstance.getDefaultInstance()) return this;
      if (other.getCurrentAction() != null) {
        this.currentAction = other.currentAction;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getInstance() != null) {
        this.instance = other.instance;
      }
      if (other.getInstanceHealthList() != null) {
        this.instanceHealth = other.instanceHealth;
      }
      if (other.getInstanceStatus() != null) {
        this.instanceStatus = other.instanceStatus;
      }
      if (other.getLastAttempt() != null) {
        this.lastAttempt = other.lastAttempt;
      }
      if (other.getPreservedStateFromConfig() != null) {
        this.preservedStateFromConfig = other.preservedStateFromConfig;
      }
      if (other.getPreservedStateFromPolicy() != null) {
        this.preservedStateFromPolicy = other.preservedStateFromPolicy;
      }
      if (other.getVersion() != null) {
        this.version = other.version;
      }
      return this;
    }

    Builder(ManagedInstance source) {
      this.currentAction = source.currentAction;
      this.id = source.id;
      this.instance = source.instance;
      this.instanceHealth = source.instanceHealth;
      this.instanceStatus = source.instanceStatus;
      this.lastAttempt = source.lastAttempt;
      this.preservedStateFromConfig = source.preservedStateFromConfig;
      this.preservedStateFromPolicy = source.preservedStateFromPolicy;
      this.version = source.version;
    }

    /**
     * [Output Only] The current action that the managed instance group has scheduled for the
     * instance. Possible values: - NONE The instance is running, and the managed instance group
     * does not have any scheduled actions for this instance. - CREATING The managed instance group
     * is creating this instance. If the group fails to create this instance, it will try again
     * until it is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting
     * to create this instance only once. If the group fails to create this instance, it does not
     * try again and the group's targetSize value is decreased instead. - RECREATING The managed
     * instance group is recreating this instance. - DELETING The managed instance group is
     * permanently deleting this instance. - ABANDONING The managed instance group is abandoning
     * this instance. The instance will be removed from the instance group and from any target pools
     * that are associated with this group. - RESTARTING The managed instance group is restarting
     * the instance. - REFRESHING The managed instance group is applying configuration changes to
     * the instance without stopping it. For example, the group can update the target pool list for
     * an instance without stopping that instance. - VERIFYING The managed instance group has
     * created the instance and it is in the process of being verified.
     */
    public String getCurrentAction() {
      return currentAction;
    }

    /**
     * [Output Only] The current action that the managed instance group has scheduled for the
     * instance. Possible values: - NONE The instance is running, and the managed instance group
     * does not have any scheduled actions for this instance. - CREATING The managed instance group
     * is creating this instance. If the group fails to create this instance, it will try again
     * until it is successful. - CREATING_WITHOUT_RETRIES The managed instance group is attempting
     * to create this instance only once. If the group fails to create this instance, it does not
     * try again and the group's targetSize value is decreased instead. - RECREATING The managed
     * instance group is recreating this instance. - DELETING The managed instance group is
     * permanently deleting this instance. - ABANDONING The managed instance group is abandoning
     * this instance. The instance will be removed from the instance group and from any target pools
     * that are associated with this group. - RESTARTING The managed instance group is restarting
     * the instance. - REFRESHING The managed instance group is applying configuration changes to
     * the instance without stopping it. For example, the group can update the target pool list for
     * an instance without stopping that instance. - VERIFYING The managed instance group has
     * created the instance and it is in the process of being verified.
     */
    public Builder setCurrentAction(String currentAction) {
      this.currentAction = currentAction;
      return this;
    }

    /**
     * [Output only] The unique identifier for this resource. This field is empty when instance does
     * not exist.
     */
    public String getId() {
      return id;
    }

    /**
     * [Output only] The unique identifier for this resource. This field is empty when instance does
     * not exist.
     */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /**
     * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet
     * been created.
     */
    public String getInstance() {
      return instance;
    }

    /**
     * [Output Only] The URL of the instance. The URL can exist even if the instance has not yet
     * been created.
     */
    public Builder setInstance(String instance) {
      this.instance = instance;
      return this;
    }

    /** [Output Only] Health state of the instance per health-check. */
    public List<ManagedInstanceInstanceHealth> getInstanceHealthList() {
      return instanceHealth;
    }

    /** [Output Only] Health state of the instance per health-check. */
    public Builder addAllInstanceHealth(List<ManagedInstanceInstanceHealth> instanceHealth) {
      if (this.instanceHealth == null) {
        this.instanceHealth = new LinkedList<>();
      }
      this.instanceHealth.addAll(instanceHealth);
      return this;
    }

    /** [Output Only] Health state of the instance per health-check. */
    public Builder addInstanceHealth(ManagedInstanceInstanceHealth instanceHealth) {
      if (this.instanceHealth == null) {
        this.instanceHealth = new LinkedList<>();
      }
      this.instanceHealth.add(instanceHealth);
      return this;
    }

    /**
     * [Output Only] The status of the instance. This field is empty when the instance does not
     * exist.
     */
    public String getInstanceStatus() {
      return instanceStatus;
    }

    /**
     * [Output Only] The status of the instance. This field is empty when the instance does not
     * exist.
     */
    public Builder setInstanceStatus(String instanceStatus) {
      this.instanceStatus = instanceStatus;
      return this;
    }

    /** [Output Only] Information about the last attempt to create or delete the instance. */
    public ManagedInstanceLastAttempt getLastAttempt() {
      return lastAttempt;
    }

    /** [Output Only] Information about the last attempt to create or delete the instance. */
    public Builder setLastAttempt(ManagedInstanceLastAttempt lastAttempt) {
      this.lastAttempt = lastAttempt;
      return this;
    }

    /** [Output Only] Preserved state applied from per-instance config for this instance. */
    public PreservedState getPreservedStateFromConfig() {
      return preservedStateFromConfig;
    }

    /** [Output Only] Preserved state applied from per-instance config for this instance. */
    public Builder setPreservedStateFromConfig(PreservedState preservedStateFromConfig) {
      this.preservedStateFromConfig = preservedStateFromConfig;
      return this;
    }

    /** [Output Only] Preserved state generated based on stateful policy for this instance. */
    public PreservedState getPreservedStateFromPolicy() {
      return preservedStateFromPolicy;
    }

    /** [Output Only] Preserved state generated based on stateful policy for this instance. */
    public Builder setPreservedStateFromPolicy(PreservedState preservedStateFromPolicy) {
      this.preservedStateFromPolicy = preservedStateFromPolicy;
      return this;
    }

    /** [Output Only] Intended version of this instance. */
    public ManagedInstanceVersion getVersion() {
      return version;
    }

    /** [Output Only] Intended version of this instance. */
    public Builder setVersion(ManagedInstanceVersion version) {
      this.version = version;
      return this;
    }

    public ManagedInstance build() {

      return new ManagedInstance(
          currentAction,
          id,
          instance,
          instanceHealth,
          instanceStatus,
          lastAttempt,
          preservedStateFromConfig,
          preservedStateFromPolicy,
          version);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCurrentAction(this.currentAction);
      newBuilder.setId(this.id);
      newBuilder.setInstance(this.instance);
      newBuilder.addAllInstanceHealth(this.instanceHealth);
      newBuilder.setInstanceStatus(this.instanceStatus);
      newBuilder.setLastAttempt(this.lastAttempt);
      newBuilder.setPreservedStateFromConfig(this.preservedStateFromConfig);
      newBuilder.setPreservedStateFromPolicy(this.preservedStateFromPolicy);
      newBuilder.setVersion(this.version);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "ManagedInstance{"
        + "currentAction="
        + currentAction
        + ", "
        + "id="
        + id
        + ", "
        + "instance="
        + instance
        + ", "
        + "instanceHealth="
        + instanceHealth
        + ", "
        + "instanceStatus="
        + instanceStatus
        + ", "
        + "lastAttempt="
        + lastAttempt
        + ", "
        + "preservedStateFromConfig="
        + preservedStateFromConfig
        + ", "
        + "preservedStateFromPolicy="
        + preservedStateFromPolicy
        + ", "
        + "version="
        + version
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ManagedInstance) {
      ManagedInstance that = (ManagedInstance) o;
      return Objects.equals(this.currentAction, that.getCurrentAction())
          && Objects.equals(this.id, that.getId())
          && Objects.equals(this.instance, that.getInstance())
          && Objects.equals(this.instanceHealth, that.getInstanceHealthList())
          && Objects.equals(this.instanceStatus, that.getInstanceStatus())
          && Objects.equals(this.lastAttempt, that.getLastAttempt())
          && Objects.equals(this.preservedStateFromConfig, that.getPreservedStateFromConfig())
          && Objects.equals(this.preservedStateFromPolicy, that.getPreservedStateFromPolicy())
          && Objects.equals(this.version, that.getVersion());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        currentAction,
        id,
        instance,
        instanceHealth,
        instanceStatus,
        lastAttempt,
        preservedStateFromConfig,
        preservedStateFromPolicy,
        version);
  }
}
