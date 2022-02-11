// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface RegionInstanceGroupManagersRecreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @return A list containing the instances.
   */
  java.util.List<java.lang.String>
      getInstancesList();
  /**
   * <pre>
   * The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @return The count of instances.
   */
  int getInstancesCount();
  /**
   * <pre>
   * The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @param index The index of the element to return.
   * @return The instances at the given index.
   */
  java.lang.String getInstances(int index);
  /**
   * <pre>
   * The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @param index The index of the value to return.
   * @return The bytes of the instances at the given index.
   */
  com.google.protobuf.ByteString
      getInstancesBytes(int index);
}