// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface WarningsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Warnings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
   * Check the Code enum for the list of possible values.
   * </pre>
   *
   * <code>optional string code = 3059181;</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * [Output Only] A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
   * Check the Code enum for the list of possible values.
   * </pre>
   *
   * <code>optional string code = 3059181;</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <pre>
   * [Output Only] A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
   * Check the Code enum for the list of possible values.
   * </pre>
   *
   * <code>optional string code = 3059181;</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <pre>
   * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" } 
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Data data = 3076010;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Data> 
      getDataList();
  /**
   * <pre>
   * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" } 
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Data data = 3076010;</code>
   */
  com.google.cloud.compute.v1.Data getData(int index);
  /**
   * <pre>
   * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" } 
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Data data = 3076010;</code>
   */
  int getDataCount();
  /**
   * <pre>
   * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" } 
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Data data = 3076010;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.DataOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" } 
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Data data = 3076010;</code>
   */
  com.google.cloud.compute.v1.DataOrBuilder getDataOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] A human-readable description of the warning code.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * [Output Only] A human-readable description of the warning code.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * [Output Only] A human-readable description of the warning code.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
