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

public interface FirewallPolicyRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.FirewallPolicyRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502.
   * </pre>
   *
   * <code>optional string action = 187661878;</code>
   *
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   *
   *
   * <pre>
   * The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502.
   * </pre>
   *
   * <code>optional string action = 187661878;</code>
   *
   * @return The action.
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502.
   * </pre>
   *
   * <code>optional string action = 187661878;</code>
   *
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString getActionBytes();

  /**
   *
   *
   * <pre>
   * An optional description for this resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description for this resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description for this resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The direction in which this rule applies.
   * Check the Direction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string direction = 111150975;</code>
   *
   * @return Whether the direction field is set.
   */
  boolean hasDirection();
  /**
   *
   *
   * <pre>
   * The direction in which this rule applies.
   * Check the Direction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string direction = 111150975;</code>
   *
   * @return The direction.
   */
  java.lang.String getDirection();
  /**
   *
   *
   * <pre>
   * The direction in which this rule applies.
   * Check the Direction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string direction = 111150975;</code>
   *
   * @return The bytes for direction.
   */
  com.google.protobuf.ByteString getDirectionBytes();

  /**
   *
   *
   * <pre>
   * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
   * </pre>
   *
   * <code>optional bool disabled = 270940796;</code>
   *
   * @return Whether the disabled field is set.
   */
  boolean hasDisabled();
  /**
   *
   *
   * <pre>
   * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
   * </pre>
   *
   * <code>optional bool disabled = 270940796;</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
   * </pre>
   *
   * <code>optional bool enable_logging = 295396515;</code>
   *
   * @return Whether the enableLogging field is set.
   */
  boolean hasEnableLogging();
  /**
   *
   *
   * <pre>
   * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
   * </pre>
   *
   * <code>optional bool enable_logging = 295396515;</code>
   *
   * @return The enableLogging.
   */
  boolean getEnableLogging();

  /**
   *
   *
   * <pre>
   * [Output only] Type of the resource. Always compute#firewallPolicyRule for firewall policy rules
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output only] Type of the resource. Always compute#firewallPolicyRule for firewall policy rules
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output only] Type of the resource. Always compute#firewallPolicyRule for firewall policy rules
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FirewallPolicyRuleMatcher match = 103668165;</code>
   *
   * @return Whether the match field is set.
   */
  boolean hasMatch();
  /**
   *
   *
   * <pre>
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FirewallPolicyRuleMatcher match = 103668165;</code>
   *
   * @return The match.
   */
  com.google.cloud.compute.v1.FirewallPolicyRuleMatcher getMatch();
  /**
   *
   *
   * <pre>
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FirewallPolicyRuleMatcher match = 103668165;</code>
   */
  com.google.cloud.compute.v1.FirewallPolicyRuleMatcherOrBuilder getMatchOrBuilder();

  /**
   *
   *
   * <pre>
   * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   *
   *
   * <pre>
   * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   *
   * @return The priority.
   */
  int getPriority();

  /**
   *
   *
   * <pre>
   * [Output Only] Calculation of the complexity of a single firewall policy rule.
   * </pre>
   *
   * <code>optional int32 rule_tuple_count = 388342037;</code>
   *
   * @return Whether the ruleTupleCount field is set.
   */
  boolean hasRuleTupleCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Calculation of the complexity of a single firewall policy rule.
   * </pre>
   *
   * <code>optional int32 rule_tuple_count = 388342037;</code>
   *
   * @return The ruleTupleCount.
   */
  int getRuleTupleCount();

  /**
   *
   *
   * <pre>
   * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
   * </pre>
   *
   * <code>repeated string target_resources = 528230647;</code>
   *
   * @return A list containing the targetResources.
   */
  java.util.List<java.lang.String> getTargetResourcesList();
  /**
   *
   *
   * <pre>
   * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
   * </pre>
   *
   * <code>repeated string target_resources = 528230647;</code>
   *
   * @return The count of targetResources.
   */
  int getTargetResourcesCount();
  /**
   *
   *
   * <pre>
   * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
   * </pre>
   *
   * <code>repeated string target_resources = 528230647;</code>
   *
   * @param index The index of the element to return.
   * @return The targetResources at the given index.
   */
  java.lang.String getTargetResources(int index);
  /**
   *
   *
   * <pre>
   * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the organization will receive the rule.
   * </pre>
   *
   * <code>repeated string target_resources = 528230647;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetResources at the given index.
   */
  com.google.protobuf.ByteString getTargetResourcesBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of service accounts indicating the sets of instances that are applied with this rule.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 457639710;</code>
   *
   * @return A list containing the targetServiceAccounts.
   */
  java.util.List<java.lang.String> getTargetServiceAccountsList();
  /**
   *
   *
   * <pre>
   * A list of service accounts indicating the sets of instances that are applied with this rule.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 457639710;</code>
   *
   * @return The count of targetServiceAccounts.
   */
  int getTargetServiceAccountsCount();
  /**
   *
   *
   * <pre>
   * A list of service accounts indicating the sets of instances that are applied with this rule.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 457639710;</code>
   *
   * @param index The index of the element to return.
   * @return The targetServiceAccounts at the given index.
   */
  java.lang.String getTargetServiceAccounts(int index);
  /**
   *
   *
   * <pre>
   * A list of service accounts indicating the sets of instances that are applied with this rule.
   * </pre>
   *
   * <code>repeated string target_service_accounts = 457639710;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the targetServiceAccounts at the given index.
   */
  com.google.protobuf.ByteString getTargetServiceAccountsBytes(int index);
}