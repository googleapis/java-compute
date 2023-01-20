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

public interface SetIamPolicyFirewallPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SetIamPolicyFirewallPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the globalOrganizationSetPolicyRequestResource field is set.
   */
  boolean hasGlobalOrganizationSetPolicyRequestResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The globalOrganizationSetPolicyRequestResource.
   */
  com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest
      getGlobalOrganizationSetPolicyRequestResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest global_organization_set_policy_request_resource = 177408606 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.compute.v1.GlobalOrganizationSetPolicyRequestOrBuilder
      getGlobalOrganizationSetPolicyRequestResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();
}
