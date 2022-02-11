// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ResourcePolicySnapshotSchedulePolicyScheduleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicySchedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
   * @return Whether the dailySchedule field is set.
   */
  boolean hasDailySchedule();
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
   * @return The dailySchedule.
   */
  com.google.cloud.compute.v1.ResourcePolicyDailyCycle getDailySchedule();
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyDailyCycle daily_schedule = 86159869;</code>
   */
  com.google.cloud.compute.v1.ResourcePolicyDailyCycleOrBuilder getDailyScheduleOrBuilder();

  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
   * @return Whether the hourlySchedule field is set.
   */
  boolean hasHourlySchedule();
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
   * @return The hourlySchedule.
   */
  com.google.cloud.compute.v1.ResourcePolicyHourlyCycle getHourlySchedule();
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyHourlyCycle hourly_schedule = 38328485;</code>
   */
  com.google.cloud.compute.v1.ResourcePolicyHourlyCycleOrBuilder getHourlyScheduleOrBuilder();

  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
   * @return Whether the weeklySchedule field is set.
   */
  boolean hasWeeklySchedule();
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
   * @return The weeklySchedule.
   */
  com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle getWeeklySchedule();
  /**
   * <code>optional .google.cloud.compute.v1.ResourcePolicyWeeklyCycle weekly_schedule = 359548053;</code>
   */
  com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleOrBuilder getWeeklyScheduleOrBuilder();
}
