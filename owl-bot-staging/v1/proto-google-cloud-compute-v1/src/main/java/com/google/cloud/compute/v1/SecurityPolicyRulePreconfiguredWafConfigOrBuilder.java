// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SecurityPolicyRulePreconfiguredWafConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SecurityPolicyRulePreconfiguredWafConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of exclusions to apply during preconfigured WAF evaluation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SecurityPolicyRulePreconfiguredWafConfigExclusion exclusions = 208665701;</code>
   */
  java.util.List<com.google.cloud.compute.v1.SecurityPolicyRulePreconfiguredWafConfigExclusion> 
      getExclusionsList();
  /**
   * <pre>
   * A list of exclusions to apply during preconfigured WAF evaluation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SecurityPolicyRulePreconfiguredWafConfigExclusion exclusions = 208665701;</code>
   */
  com.google.cloud.compute.v1.SecurityPolicyRulePreconfiguredWafConfigExclusion getExclusions(int index);
  /**
   * <pre>
   * A list of exclusions to apply during preconfigured WAF evaluation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SecurityPolicyRulePreconfiguredWafConfigExclusion exclusions = 208665701;</code>
   */
  int getExclusionsCount();
  /**
   * <pre>
   * A list of exclusions to apply during preconfigured WAF evaluation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SecurityPolicyRulePreconfiguredWafConfigExclusion exclusions = 208665701;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.SecurityPolicyRulePreconfiguredWafConfigExclusionOrBuilder> 
      getExclusionsOrBuilderList();
  /**
   * <pre>
   * A list of exclusions to apply during preconfigured WAF evaluation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SecurityPolicyRulePreconfiguredWafConfigExclusion exclusions = 208665701;</code>
   */
  com.google.cloud.compute.v1.SecurityPolicyRulePreconfiguredWafConfigExclusionOrBuilder getExclusionsOrBuilder(
      int index);
}
