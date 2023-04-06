// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface RemovePeeringNetworkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RemovePeeringNetworkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the network resource to remove peering from.
   * </pre>
   *
   * <code>string network = 232872494 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * Name of the network resource to remove peering from.
   * </pre>
   *
   * <code>string network = 232872494 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworksRemovePeeringRequest networks_remove_peering_request_resource = 421162494 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the networksRemovePeeringRequestResource field is set.
   */
  boolean hasNetworksRemovePeeringRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworksRemovePeeringRequest networks_remove_peering_request_resource = 421162494 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The networksRemovePeeringRequestResource.
   */
  com.google.cloud.compute.v1.NetworksRemovePeeringRequest getNetworksRemovePeeringRequestResource();
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.NetworksRemovePeeringRequest networks_remove_peering_request_resource = 421162494 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.compute.v1.NetworksRemovePeeringRequestOrBuilder getNetworksRemovePeeringRequestResourceOrBuilder();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return Whether the requestId field is set.
   */
  boolean hasRequestId();
  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
