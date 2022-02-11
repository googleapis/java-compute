// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ResourcePolicyDailyCycleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicyDailyCycle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Defines a schedule with units measured in months. The value determines how many months pass between the start of each cycle.
   * </pre>
   *
   * <code>optional int32 days_in_cycle = 369790004;</code>
   * @return Whether the daysInCycle field is set.
   */
  boolean hasDaysInCycle();
  /**
   * <pre>
   * Defines a schedule with units measured in months. The value determines how many months pass between the start of each cycle.
   * </pre>
   *
   * <code>optional int32 days_in_cycle = 369790004;</code>
   * @return The daysInCycle.
   */
  int getDaysInCycle();

  /**
   * <pre>
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <pre>
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   * @return The duration.
   */
  java.lang.String getDuration();
  /**
   * <pre>
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   * @return The bytes for duration.
   */
  com.google.protobuf.ByteString
      getDurationBytes();

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