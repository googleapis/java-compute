// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface AdvancedMachineFeaturesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AdvancedMachineFeatures)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether to enable nested virtualization or not (default is false).
   * </pre>
   *
   * <code>optional bool enable_nested_virtualization = 16639365;</code>
   * @return Whether the enableNestedVirtualization field is set.
   */
  boolean hasEnableNestedVirtualization();
  /**
   * <pre>
   * Whether to enable nested virtualization or not (default is false).
   * </pre>
   *
   * <code>optional bool enable_nested_virtualization = 16639365;</code>
   * @return The enableNestedVirtualization.
   */
  boolean getEnableNestedVirtualization();

  /**
   * <pre>
   * Whether to enable UEFI networking for instance creation.
   * </pre>
   *
   * <code>optional bool enable_uefi_networking = 334485668;</code>
   * @return Whether the enableUefiNetworking field is set.
   */
  boolean hasEnableUefiNetworking();
  /**
   * <pre>
   * Whether to enable UEFI networking for instance creation.
   * </pre>
   *
   * <code>optional bool enable_uefi_networking = 334485668;</code>
   * @return The enableUefiNetworking.
   */
  boolean getEnableUefiNetworking();

  /**
   * <pre>
   * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
   * </pre>
   *
   * <code>optional int32 threads_per_core = 352611671;</code>
   * @return Whether the threadsPerCore field is set.
   */
  boolean hasThreadsPerCore();
  /**
   * <pre>
   * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
   * </pre>
   *
   * <code>optional int32 threads_per_core = 352611671;</code>
   * @return The threadsPerCore.
   */
  int getThreadsPerCore();
}