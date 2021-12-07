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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface InstanceGroupManagerUpdatePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
   * </pre>
   *
   * <code>optional string instance_redistribution_type = 292630424;</code>
   *
   * @return Whether the instanceRedistributionType field is set.
   */
  boolean hasInstanceRedistributionType();
  /**
   *
   *
   * <pre>
   * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
   * </pre>
   *
   * <code>optional string instance_redistribution_type = 292630424;</code>
   *
   * @return The instanceRedistributionType.
   */
  java.lang.String getInstanceRedistributionType();
  /**
   *
   *
   * <pre>
   * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
   * </pre>
   *
   * <code>optional string instance_redistribution_type = 292630424;</code>
   *
   * @return The bytes for instanceRedistributionType.
   */
  com.google.protobuf.ByteString getInstanceRedistributionTypeBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_surge = 302572691;</code>
   *
   * @return Whether the maxSurge field is set.
   */
  boolean hasMaxSurge();
  /**
   *
   *
   * <pre>
   * The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_surge = 302572691;</code>
   *
   * @return The maxSurge.
   */
  com.google.cloud.compute.v1.FixedOrPercent getMaxSurge();
  /**
   *
   *
   * <pre>
   * The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_surge = 302572691;</code>
   */
  com.google.cloud.compute.v1.FixedOrPercentOrBuilder getMaxSurgeOrBuilder();

  /**
   *
   *
   * <pre>
   * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance's status is RUNNING. - If there is a health check on the instance group, the instance's health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_unavailable = 404940277;</code>
   *
   * @return Whether the maxUnavailable field is set.
   */
  boolean hasMaxUnavailable();
  /**
   *
   *
   * <pre>
   * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance's status is RUNNING. - If there is a health check on the instance group, the instance's health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_unavailable = 404940277;</code>
   *
   * @return The maxUnavailable.
   */
  com.google.cloud.compute.v1.FixedOrPercent getMaxUnavailable();
  /**
   *
   *
   * <pre>
   * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance's status is RUNNING. - If there is a health check on the instance group, the instance's health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_unavailable = 404940277;</code>
   */
  com.google.cloud.compute.v1.FixedOrPercentOrBuilder getMaxUnavailableOrBuilder();

  /**
   *
   *
   * <pre>
   * Minimal action to be taken on an instance. You can specify either RESTART to restart existing instances or REPLACE to delete and create new instances from the target template. If you specify a RESTART, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   *
   * @return Whether the minimalAction field is set.
   */
  boolean hasMinimalAction();
  /**
   *
   *
   * <pre>
   * Minimal action to be taken on an instance. You can specify either RESTART to restart existing instances or REPLACE to delete and create new instances from the target template. If you specify a RESTART, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   *
   * @return The minimalAction.
   */
  java.lang.String getMinimalAction();
  /**
   *
   *
   * <pre>
   * Minimal action to be taken on an instance. You can specify either RESTART to restart existing instances or REPLACE to delete and create new instances from the target template. If you specify a RESTART, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   *
   * @return The bytes for minimalAction.
   */
  com.google.protobuf.ByteString getMinimalActionBytes();

  /**
   *
   *
   * <pre>
   * What action should be used to replace instances. See minimal_action.REPLACE
   * </pre>
   *
   * <code>optional string replacement_method = 505931694;</code>
   *
   * @return Whether the replacementMethod field is set.
   */
  boolean hasReplacementMethod();
  /**
   *
   *
   * <pre>
   * What action should be used to replace instances. See minimal_action.REPLACE
   * </pre>
   *
   * <code>optional string replacement_method = 505931694;</code>
   *
   * @return The replacementMethod.
   */
  java.lang.String getReplacementMethod();
  /**
   *
   *
   * <pre>
   * What action should be used to replace instances. See minimal_action.REPLACE
   * </pre>
   *
   * <code>optional string replacement_method = 505931694;</code>
   *
   * @return The bytes for replacementMethod.
   */
  com.google.protobuf.ByteString getReplacementMethodBytes();

  /**
   *
   *
   * <pre>
   * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();
}
