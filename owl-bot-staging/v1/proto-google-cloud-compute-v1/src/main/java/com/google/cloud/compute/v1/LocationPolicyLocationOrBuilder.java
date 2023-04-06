// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface LocationPolicyLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LocationPolicyLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Constraints that the caller requires on the result distribution in this zone.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;</code>
   * @return Whether the constraints field is set.
   */
  boolean hasConstraints();
  /**
   * <pre>
   * Constraints that the caller requires on the result distribution in this zone.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;</code>
   * @return The constraints.
   */
  com.google.cloud.compute.v1.LocationPolicyLocationConstraints getConstraints();
  /**
   * <pre>
   * Constraints that the caller requires on the result distribution in this zone.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LocationPolicyLocationConstraints constraints = 3909174;</code>
   */
  com.google.cloud.compute.v1.LocationPolicyLocationConstraintsOrBuilder getConstraintsOrBuilder();

  /**
   * <pre>
   * Preference for a given location. Set to either ALLOW or DENY.
   * Check the Preference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string preference = 150781147;</code>
   * @return Whether the preference field is set.
   */
  boolean hasPreference();
  /**
   * <pre>
   * Preference for a given location. Set to either ALLOW or DENY.
   * Check the Preference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string preference = 150781147;</code>
   * @return The preference.
   */
  java.lang.String getPreference();
  /**
   * <pre>
   * Preference for a given location. Set to either ALLOW or DENY.
   * Check the Preference enum for the list of possible values.
   * </pre>
   *
   * <code>optional string preference = 150781147;</code>
   * @return The bytes for preference.
   */
  com.google.protobuf.ByteString
      getPreferenceBytes();
}
