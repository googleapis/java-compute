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

public interface ConsistentHashLoadBalancerSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ConsistentHashLoadBalancerSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Hash is based on HTTP Cookie. This field describes a HTTP cookie that will be used as the hash key for the consistent hash load balancer. If the cookie is not present, it will be generated. This field is applicable if the sessionAffinity is set to HTTP_COOKIE.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie http_cookie = 6673915;
   * </code>
   *
   * @return Whether the httpCookie field is set.
   */
  boolean hasHttpCookie();
  /**
   *
   *
   * <pre>
   * Hash is based on HTTP Cookie. This field describes a HTTP cookie that will be used as the hash key for the consistent hash load balancer. If the cookie is not present, it will be generated. This field is applicable if the sessionAffinity is set to HTTP_COOKIE.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie http_cookie = 6673915;
   * </code>
   *
   * @return The httpCookie.
   */
  com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie getHttpCookie();
  /**
   *
   *
   * <pre>
   * Hash is based on HTTP Cookie. This field describes a HTTP cookie that will be used as the hash key for the consistent hash load balancer. If the cookie is not present, it will be generated. This field is applicable if the sessionAffinity is set to HTTP_COOKIE.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie http_cookie = 6673915;
   * </code>
   */
  com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookieOrBuilder
      getHttpCookieOrBuilder();

  /**
   *
   *
   * <pre>
   * The hash based on the value of the specified header field. This field is applicable if the sessionAffinity is set to HEADER_FIELD.
   * </pre>
   *
   * <code>string http_header_name = 234798022;</code>
   *
   * @return The httpHeaderName.
   */
  java.lang.String getHttpHeaderName();
  /**
   *
   *
   * <pre>
   * The hash based on the value of the specified header field. This field is applicable if the sessionAffinity is set to HEADER_FIELD.
   * </pre>
   *
   * <code>string http_header_name = 234798022;</code>
   *
   * @return The bytes for httpHeaderName.
   */
  com.google.protobuf.ByteString getHttpHeaderNameBytes();

  /**
   *
   *
   * <pre>
   * The minimum number of virtual nodes to use for the hash ring. Defaults to 1024. Larger ring sizes result in more granular load distributions. If the number of hosts in the load balancing pool is larger than the ring size, each host will be assigned a single virtual node.
   * </pre>
   *
   * <code>string minimum_ring_size = 234380735;</code>
   *
   * @return The minimumRingSize.
   */
  java.lang.String getMinimumRingSize();
  /**
   *
   *
   * <pre>
   * The minimum number of virtual nodes to use for the hash ring. Defaults to 1024. Larger ring sizes result in more granular load distributions. If the number of hosts in the load balancing pool is larger than the ring size, each host will be assigned a single virtual node.
   * </pre>
   *
   * <code>string minimum_ring_size = 234380735;</code>
   *
   * @return The bytes for minimumRingSize.
   */
  com.google.protobuf.ByteString getMinimumRingSizeBytes();
}