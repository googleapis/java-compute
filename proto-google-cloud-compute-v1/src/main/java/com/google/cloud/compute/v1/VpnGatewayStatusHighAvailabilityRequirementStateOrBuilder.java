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

public interface VpnGatewayStatusHighAvailabilityRequirementStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.VpnGatewayStatusHighAvailabilityRequirementState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Indicates the high availability requirement state for the VPN connection. Valid values are CONNECTION_REDUNDANCY_MET, CONNECTION_REDUNDANCY_NOT_MET.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * Indicates the high availability requirement state for the VPN connection. Valid values are CONNECTION_REDUNDANCY_MET, CONNECTION_REDUNDANCY_NOT_MET.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return The state.
   */
  java.lang.String getState();
  /**
   *
   *
   * <pre>
   * Indicates the high availability requirement state for the VPN connection. Valid values are CONNECTION_REDUNDANCY_MET, CONNECTION_REDUNDANCY_NOT_MET.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString getStateBytes();

  /**
   *
   *
   * <pre>
   * Indicates the reason why the VPN connection does not meet the high availability redundancy criteria/requirement. Valid values is INCOMPLETE_TUNNELS_COVERAGE.
   * Check the UnsatisfiedReason enum for the list of possible values.
   * </pre>
   *
   * <code>optional string unsatisfied_reason = 55016330;</code>
   *
   * @return Whether the unsatisfiedReason field is set.
   */
  boolean hasUnsatisfiedReason();
  /**
   *
   *
   * <pre>
   * Indicates the reason why the VPN connection does not meet the high availability redundancy criteria/requirement. Valid values is INCOMPLETE_TUNNELS_COVERAGE.
   * Check the UnsatisfiedReason enum for the list of possible values.
   * </pre>
   *
   * <code>optional string unsatisfied_reason = 55016330;</code>
   *
   * @return The unsatisfiedReason.
   */
  java.lang.String getUnsatisfiedReason();
  /**
   *
   *
   * <pre>
   * Indicates the reason why the VPN connection does not meet the high availability redundancy criteria/requirement. Valid values is INCOMPLETE_TUNNELS_COVERAGE.
   * Check the UnsatisfiedReason enum for the list of possible values.
   * </pre>
   *
   * <code>optional string unsatisfied_reason = 55016330;</code>
   *
   * @return The bytes for unsatisfiedReason.
   */
  com.google.protobuf.ByteString getUnsatisfiedReasonBytes();
}