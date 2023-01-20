// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetLicenseRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetLicenseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the License resource to return.
   * </pre>
   *
   * <code>string license = 166757441 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The license.
   */
  java.lang.String getLicense();
  /**
   * <pre>
   * Name of the License resource to return.
   * </pre>
   *
   * <code>string license = 166757441 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for license.
   */
  com.google.protobuf.ByteString
      getLicenseBytes();

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