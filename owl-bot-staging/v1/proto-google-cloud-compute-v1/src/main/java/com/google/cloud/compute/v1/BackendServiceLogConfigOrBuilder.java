// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface BackendServiceLogConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceLogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Denotes whether to enable logging for the load balancer traffic served by this backend service. The default value is false.
   * </pre>
   *
   * <code>optional bool enable = 311764355;</code>
   * @return Whether the enable field is set.
   */
  boolean hasEnable();
  /**
   * <pre>
   * Denotes whether to enable logging for the load balancer traffic served by this backend service. The default value is false.
   * </pre>
   *
   * <code>optional bool enable = 311764355;</code>
   * @return The enable.
   */
  boolean getEnable();

  /**
   * <pre>
   * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
   * </pre>
   *
   * <code>optional float sample_rate = 153193045;</code>
   * @return Whether the sampleRate field is set.
   */
  boolean hasSampleRate();
  /**
   * <pre>
   * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
   * </pre>
   *
   * <code>optional float sample_rate = 153193045;</code>
   * @return The sampleRate.
   */
  float getSampleRate();
}
