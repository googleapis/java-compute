// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NodeGroupMaintenanceWindowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeGroupMaintenanceWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
   * @return Whether the maintenanceDuration field is set.
   */
  boolean hasMaintenanceDuration();
  /**
   * <pre>
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
   * @return The maintenanceDuration.
   */
  com.google.cloud.compute.v1.Duration getMaintenanceDuration();
  /**
   * <pre>
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
   */
  com.google.cloud.compute.v1.DurationOrBuilder getMaintenanceDurationOrBuilder();

  /**
   * <pre>
   * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();
}
