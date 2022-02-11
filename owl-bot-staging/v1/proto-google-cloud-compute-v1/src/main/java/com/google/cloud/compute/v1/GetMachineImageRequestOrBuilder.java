// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetMachineImageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetMachineImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the machine image.
   * </pre>
   *
   * <code>string machine_image = 69189475 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The machineImage.
   */
  java.lang.String getMachineImage();
  /**
   * <pre>
   * The name of the machine image.
   * </pre>
   *
   * <code>string machine_image = 69189475 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for machineImage.
   */
  com.google.protobuf.ByteString
      getMachineImageBytes();

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