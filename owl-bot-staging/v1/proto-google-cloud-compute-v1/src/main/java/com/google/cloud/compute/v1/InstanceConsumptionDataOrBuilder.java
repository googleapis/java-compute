// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface InstanceConsumptionDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceConsumptionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resources consumed by the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;</code>
   * @return Whether the consumptionInfo field is set.
   */
  boolean hasConsumptionInfo();
  /**
   * <pre>
   * Resources consumed by the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;</code>
   * @return The consumptionInfo.
   */
  com.google.cloud.compute.v1.InstanceConsumptionInfo getConsumptionInfo();
  /**
   * <pre>
   * Resources consumed by the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;</code>
   */
  com.google.cloud.compute.v1.InstanceConsumptionInfoOrBuilder getConsumptionInfoOrBuilder();

  /**
   * <pre>
   * Server-defined URL for the instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * Server-defined URL for the instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * Server-defined URL for the instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();
}
