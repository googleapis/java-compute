// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetRuleSecurityPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetRuleSecurityPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The priority of the rule to get from the security policy.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <pre>
   * The priority of the rule to get from the security policy.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Name of the security policy to which the queried rule belongs.
   * </pre>
   *
   * <code>string security_policy = 171082513 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The securityPolicy.
   */
  java.lang.String getSecurityPolicy();
  /**
   * <pre>
   * Name of the security policy to which the queried rule belongs.
   * </pre>
   *
   * <code>string security_policy = 171082513 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for securityPolicy.
   */
  com.google.protobuf.ByteString
      getSecurityPolicyBytes();
}
