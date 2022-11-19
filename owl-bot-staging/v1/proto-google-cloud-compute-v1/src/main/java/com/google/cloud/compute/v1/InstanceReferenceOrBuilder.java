// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface InstanceReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URL for a specific instance. &#64;required compute.instancegroups.addInstances/removeInstances
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * The URL for a specific instance. &#64;required compute.instancegroups.addInstances/removeInstances
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * The URL for a specific instance. &#64;required compute.instancegroups.addInstances/removeInstances
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();
}
