// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetNetworkAttachmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetNetworkAttachmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the NetworkAttachment resource to return.
   * </pre>
   *
   * <code>string network_attachment = 224644052 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The networkAttachment.
   */
  java.lang.String getNetworkAttachment();
  /**
   * <pre>
   * Name of the NetworkAttachment resource to return.
   * </pre>
   *
   * <code>string network_attachment = 224644052 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for networkAttachment.
   */
  com.google.protobuf.ByteString
      getNetworkAttachmentBytes();

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
   * Name of the region of this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Name of the region of this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();
}
