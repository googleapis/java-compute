// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface LocationPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LocationPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Location configurations mapped by location name. Currently only zone names are supported and must be represented as valid internal URLs, such as zones/us-central1-a.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.LocationPolicyLocation&gt; locations = 413423454;</code>
   */
  int getLocationsCount();
  /**
   * <pre>
   * Location configurations mapped by location name. Currently only zone names are supported and must be represented as valid internal URLs, such as zones/us-central1-a.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.LocationPolicyLocation&gt; locations = 413423454;</code>
   */
  boolean containsLocations(
      java.lang.String key);
  /**
   * Use {@link #getLocationsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.LocationPolicyLocation>
  getLocations();
  /**
   * <pre>
   * Location configurations mapped by location name. Currently only zone names are supported and must be represented as valid internal URLs, such as zones/us-central1-a.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.LocationPolicyLocation&gt; locations = 413423454;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.LocationPolicyLocation>
  getLocationsMap();
  /**
   * <pre>
   * Location configurations mapped by location name. Currently only zone names are supported and must be represented as valid internal URLs, such as zones/us-central1-a.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.LocationPolicyLocation&gt; locations = 413423454;</code>
   */

  /* nullable */
com.google.cloud.compute.v1.LocationPolicyLocation getLocationsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.compute.v1.LocationPolicyLocation defaultValue);
  /**
   * <pre>
   * Location configurations mapped by location name. Currently only zone names are supported and must be represented as valid internal URLs, such as zones/us-central1-a.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.LocationPolicyLocation&gt; locations = 413423454;</code>
   */

  com.google.cloud.compute.v1.LocationPolicyLocation getLocationsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Strategy for distributing VMs across zones in a region.
   * Check the TargetShape enum for the list of possible values.
   * </pre>
   *
   * <code>optional string target_shape = 338621299;</code>
   * @return Whether the targetShape field is set.
   */
  boolean hasTargetShape();
  /**
   * <pre>
   * Strategy for distributing VMs across zones in a region.
   * Check the TargetShape enum for the list of possible values.
   * </pre>
   *
   * <code>optional string target_shape = 338621299;</code>
   * @return The targetShape.
   */
  java.lang.String getTargetShape();
  /**
   * <pre>
   * Strategy for distributing VMs across zones in a region.
   * Check the TargetShape enum for the list of possible values.
   * </pre>
   *
   * <code>optional string target_shape = 338621299;</code>
   * @return The bytes for targetShape.
   */
  com.google.protobuf.ByteString
      getTargetShapeBytes();
}
