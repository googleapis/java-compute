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

public interface GetHealthBackendServiceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetHealthBackendServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the BackendService resource to which the queried instance belongs.
   * </pre>
   *
   * <code>string backend_service = 306946058 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backendService.
   */
  java.lang.String getBackendService();
  /**
   *
   *
   * <pre>
   * Name of the BackendService resource to which the queried instance belongs.
   * </pre>
   *
   * <code>string backend_service = 306946058 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backendService.
   */
  com.google.protobuf.ByteString getBackendServiceBytes();

  /**
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the resourceGroupReferenceResource field is set.
   */
  boolean hasResourceGroupReferenceResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The resourceGroupReferenceResource.
   */
  com.google.cloud.compute.v1.ResourceGroupReference getResourceGroupReferenceResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ResourceGroupReference resource_group_reference_resource = 112951123 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.compute.v1.ResourceGroupReferenceOrBuilder
      getResourceGroupReferenceResourceOrBuilder();
}
