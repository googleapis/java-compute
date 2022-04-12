// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SecurityPolicyAdaptiveProtectionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If set to true, enables Cloud Armor Machine Learning.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;</code>
   * @return Whether the layer7DdosDefenseConfig field is set.
   */
  boolean hasLayer7DdosDefenseConfig();
  /**
   * <pre>
   * If set to true, enables Cloud Armor Machine Learning.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;</code>
   * @return The layer7DdosDefenseConfig.
   */
  com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig getLayer7DdosDefenseConfig();
  /**
   * <pre>
   * If set to true, enables Cloud Armor Machine Learning.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig layer7_ddos_defense_config = 437316771;</code>
   */
  com.google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigOrBuilder getLayer7DdosDefenseConfigOrBuilder();
}
