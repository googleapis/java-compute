// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetGlobalForwardingRuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetGlobalForwardingRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the ForwardingRule resource to return.
   * </pre>
   *
   * <code>string forwarding_rule = 269964030 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The forwardingRule.
   */
  java.lang.String getForwardingRule();
  /**
   * <pre>
   * Name of the ForwardingRule resource to return.
   * </pre>
   *
   * <code>string forwarding_rule = 269964030 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for forwardingRule.
   */
  com.google.protobuf.ByteString
      getForwardingRuleBytes();

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
}
