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

public interface InstanceManagedByIgmErrorManagedInstanceErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceManagedByIgmErrorManagedInstanceError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Error code.
   * </pre>
   *
   * <code>string code = 3059181;</code>
   *
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   *
   *
   * <pre>
   * [Output Only] Error code.
   * </pre>
   *
   * <code>string code = 3059181;</code>
   *
   * @return The code.
   */
  java.lang.String getCode();
  /**
   *
   *
   * <pre>
   * [Output Only] Error code.
   * </pre>
   *
   * <code>string code = 3059181;</code>
   *
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString getCodeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Error message.
   * </pre>
   *
   * <code>string message = 418054151;</code>
   *
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] Error message.
   * </pre>
   *
   * <code>string message = 418054151;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] Error message.
   * </pre>
   *
   * <code>string message = 418054151;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();
}