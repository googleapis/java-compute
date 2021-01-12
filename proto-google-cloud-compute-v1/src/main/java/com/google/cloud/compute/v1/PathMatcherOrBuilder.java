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

public interface PathMatcherOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PathMatcher)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * defaultRouteAction takes effect when none of the  pathRules or routeRules match. The load balancer performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any  weightedBackendServices.
   * Only one of defaultRouteAction or defaultUrlRedirect must be set.
   * UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a pathMatcher's defaultRouteAction.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRouteAction default_route_action = 110484010;</code>
   *
   * @return Whether the defaultRouteAction field is set.
   */
  boolean hasDefaultRouteAction();
  /**
   *
   *
   * <pre>
   * defaultRouteAction takes effect when none of the  pathRules or routeRules match. The load balancer performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any  weightedBackendServices.
   * Only one of defaultRouteAction or defaultUrlRedirect must be set.
   * UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a pathMatcher's defaultRouteAction.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRouteAction default_route_action = 110484010;</code>
   *
   * @return The defaultRouteAction.
   */
  com.google.cloud.compute.v1.HttpRouteAction getDefaultRouteAction();
  /**
   *
   *
   * <pre>
   * defaultRouteAction takes effect when none of the  pathRules or routeRules match. The load balancer performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any  weightedBackendServices.
   * Only one of defaultRouteAction or defaultUrlRedirect must be set.
   * UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a pathMatcher's defaultRouteAction.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRouteAction default_route_action = 110484010;</code>
   */
  com.google.cloud.compute.v1.HttpRouteActionOrBuilder getDefaultRouteActionOrBuilder();

  /**
   *
   *
   * <pre>
   * The full or partial URL to the BackendService resource. This will be used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource:
   * - https://www.googleapis.com/compute/v1/projects/project/global/backendServices/backendService
   * - compute/v1/projects/project/global/backendServices/backendService
   * - global/backendServices/backendService  If defaultRouteAction is additionally specified, advanced routing actions like URL Rewrites, etc. take effect prior to sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified.
   * Only one of defaultService, defaultUrlRedirect  or defaultRouteAction.weightedBackendService must be set.
   * Authorization requires one or more of the following Google IAM permissions on the specified resource default_service:
   * - compute.backendBuckets.use
   * - compute.backendServices.use
   * </pre>
   *
   * <code>string default_service = 101806775;</code>
   *
   * @return The defaultService.
   */
  java.lang.String getDefaultService();
  /**
   *
   *
   * <pre>
   * The full or partial URL to the BackendService resource. This will be used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource:
   * - https://www.googleapis.com/compute/v1/projects/project/global/backendServices/backendService
   * - compute/v1/projects/project/global/backendServices/backendService
   * - global/backendServices/backendService  If defaultRouteAction is additionally specified, advanced routing actions like URL Rewrites, etc. take effect prior to sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified.
   * Only one of defaultService, defaultUrlRedirect  or defaultRouteAction.weightedBackendService must be set.
   * Authorization requires one or more of the following Google IAM permissions on the specified resource default_service:
   * - compute.backendBuckets.use
   * - compute.backendServices.use
   * </pre>
   *
   * <code>string default_service = 101806775;</code>
   *
   * @return The bytes for defaultService.
   */
  com.google.protobuf.ByteString getDefaultServiceBytes();

  /**
   *
   *
   * <pre>
   * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect.
   * If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRedirectAction default_url_redirect = 91067882;</code>
   *
   * @return Whether the defaultUrlRedirect field is set.
   */
  boolean hasDefaultUrlRedirect();
  /**
   *
   *
   * <pre>
   * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect.
   * If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRedirectAction default_url_redirect = 91067882;</code>
   *
   * @return The defaultUrlRedirect.
   */
  com.google.cloud.compute.v1.HttpRedirectAction getDefaultUrlRedirect();
  /**
   *
   *
   * <pre>
   * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect.
   * If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRedirectAction default_url_redirect = 91067882;</code>
   */
  com.google.cloud.compute.v1.HttpRedirectActionOrBuilder getDefaultUrlRedirectOrBuilder();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 154502140;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 154502140;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService.
   * HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap
   * Note that headerAction is not supported for Loadbalancers that have their loadBalancingScheme set to EXTERNAL.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpHeaderAction header_action = 59641896;</code>
   *
   * @return Whether the headerAction field is set.
   */
  boolean hasHeaderAction();
  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService.
   * HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap
   * Note that headerAction is not supported for Loadbalancers that have their loadBalancingScheme set to EXTERNAL.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpHeaderAction header_action = 59641896;</code>
   *
   * @return The headerAction.
   */
  com.google.cloud.compute.v1.HttpHeaderAction getHeaderAction();
  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService.
   * HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap
   * Note that headerAction is not supported for Loadbalancers that have their loadBalancingScheme set to EXTERNAL.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpHeaderAction header_action = 59641896;</code>
   */
  com.google.cloud.compute.v1.HttpHeaderActionOrBuilder getHeaderActionOrBuilder();

  /**
   *
   *
   * <pre>
   * The name to which this PathMatcher is referred by the HostRule.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name to which this PathMatcher is referred by the HostRule.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis.
   * For example: a pathRule with a path /a/b/c/&#42; will match before /a/b/&#42; irrespective of the order in which those paths appear in this list.
   * Within a given pathMatcher, only one of pathRules or routeRules must be set.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PathRule path_rules = 104439901;</code>
   */
  java.util.List<com.google.cloud.compute.v1.PathRule> getPathRulesList();
  /**
   *
   *
   * <pre>
   * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis.
   * For example: a pathRule with a path /a/b/c/&#42; will match before /a/b/&#42; irrespective of the order in which those paths appear in this list.
   * Within a given pathMatcher, only one of pathRules or routeRules must be set.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PathRule path_rules = 104439901;</code>
   */
  com.google.cloud.compute.v1.PathRule getPathRules(int index);
  /**
   *
   *
   * <pre>
   * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis.
   * For example: a pathRule with a path /a/b/c/&#42; will match before /a/b/&#42; irrespective of the order in which those paths appear in this list.
   * Within a given pathMatcher, only one of pathRules or routeRules must be set.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PathRule path_rules = 104439901;</code>
   */
  int getPathRulesCount();
  /**
   *
   *
   * <pre>
   * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis.
   * For example: a pathRule with a path /a/b/c/&#42; will match before /a/b/&#42; irrespective of the order in which those paths appear in this list.
   * Within a given pathMatcher, only one of pathRules or routeRules must be set.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PathRule path_rules = 104439901;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.PathRuleOrBuilder>
      getPathRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis.
   * For example: a pathRule with a path /a/b/c/&#42; will match before /a/b/&#42; irrespective of the order in which those paths appear in this list.
   * Within a given pathMatcher, only one of pathRules or routeRules must be set.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PathRule path_rules = 104439901;</code>
   */
  com.google.cloud.compute.v1.PathRuleOrBuilder getPathRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number.
   * Within a given pathMatcher, you can set only one of pathRules or routeRules.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRule route_rules = 107856769;</code>
   */
  java.util.List<com.google.cloud.compute.v1.HttpRouteRule> getRouteRulesList();
  /**
   *
   *
   * <pre>
   * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number.
   * Within a given pathMatcher, you can set only one of pathRules or routeRules.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRule route_rules = 107856769;</code>
   */
  com.google.cloud.compute.v1.HttpRouteRule getRouteRules(int index);
  /**
   *
   *
   * <pre>
   * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number.
   * Within a given pathMatcher, you can set only one of pathRules or routeRules.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRule route_rules = 107856769;</code>
   */
  int getRouteRulesCount();
  /**
   *
   *
   * <pre>
   * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number.
   * Within a given pathMatcher, you can set only one of pathRules or routeRules.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRule route_rules = 107856769;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HttpRouteRuleOrBuilder>
      getRouteRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number.
   * Within a given pathMatcher, you can set only one of pathRules or routeRules.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRule route_rules = 107856769;</code>
   */
  com.google.cloud.compute.v1.HttpRouteRuleOrBuilder getRouteRulesOrBuilder(int index);
}