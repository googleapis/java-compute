// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface RegionDisksAddResourcePoliciesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RegionDisksAddResourcePoliciesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource policies to be added to this disk.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   * @return A list containing the resourcePolicies.
   */
  java.util.List<java.lang.String>
      getResourcePoliciesList();
  /**
   * <pre>
   * Resource policies to be added to this disk.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   * @return The count of resourcePolicies.
   */
  int getResourcePoliciesCount();
  /**
   * <pre>
   * Resource policies to be added to this disk.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   * @param index The index of the element to return.
   * @return The resourcePolicies at the given index.
   */
  java.lang.String getResourcePolicies(int index);
  /**
   * <pre>
   * Resource policies to be added to this disk.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   * @param index The index of the value to return.
   * @return The bytes of the resourcePolicies at the given index.
   */
  com.google.protobuf.ByteString
      getResourcePoliciesBytes(int index);
}
