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

public interface UrlRewriteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UrlRewrite)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Prior to forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite.
   * The value must be between 1 and 255 characters.
   * </pre>
   *
   * <code>string host_rewrite = 159819253;</code>
   *
   * @return Whether the hostRewrite field is set.
   */
  boolean hasHostRewrite();
  /**
   *
   *
   * <pre>
   * Prior to forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite.
   * The value must be between 1 and 255 characters.
   * </pre>
   *
   * <code>string host_rewrite = 159819253;</code>
   *
   * @return The hostRewrite.
   */
  java.lang.String getHostRewrite();
  /**
   *
   *
   * <pre>
   * Prior to forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite.
   * The value must be between 1 and 255 characters.
   * </pre>
   *
   * <code>string host_rewrite = 159819253;</code>
   *
   * @return The bytes for hostRewrite.
   */
  com.google.protobuf.ByteString getHostRewriteBytes();

  /**
   *
   *
   * <pre>
   * Prior to forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite.
   * The value must be between 1 and 1024 characters.
   * </pre>
   *
   * <code>string path_prefix_rewrite = 41186361;</code>
   *
   * @return Whether the pathPrefixRewrite field is set.
   */
  boolean hasPathPrefixRewrite();
  /**
   *
   *
   * <pre>
   * Prior to forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite.
   * The value must be between 1 and 1024 characters.
   * </pre>
   *
   * <code>string path_prefix_rewrite = 41186361;</code>
   *
   * @return The pathPrefixRewrite.
   */
  java.lang.String getPathPrefixRewrite();
  /**
   *
   *
   * <pre>
   * Prior to forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite.
   * The value must be between 1 and 1024 characters.
   * </pre>
   *
   * <code>string path_prefix_rewrite = 41186361;</code>
   *
   * @return The bytes for pathPrefixRewrite.
   */
  com.google.protobuf.ByteString getPathPrefixRewriteBytes();
}