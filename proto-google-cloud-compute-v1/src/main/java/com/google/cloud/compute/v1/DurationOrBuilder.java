/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface DurationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Duration)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are represented with a 0 `seconds` field and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 104586303;</code>
   *
   * @return Whether the nanos field is set.
   */
  boolean hasNanos();
  /**
   *
   *
   * <pre>
   * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are represented with a 0 `seconds` field and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 104586303;</code>
   *
   * @return The nanos.
   */
  int getNanos();

  /**
   *
   *
   * <pre>
   * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
   * </pre>
   *
   * <code>optional int64 seconds = 359484031;</code>
   *
   * @return Whether the seconds field is set.
   */
  boolean hasSeconds();
  /**
   *
   *
   * <pre>
   * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
   * </pre>
   *
   * <code>optional int64 seconds = 359484031;</code>
   *
   * @return The seconds.
   */
  long getSeconds();
}
