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

public interface RouterStatusBgpPeerStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterStatusBgpPeerStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Routes that were advertised to the remote BGP peer
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route advertised_routes = 333393068;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Route> getAdvertisedRoutesList();
  /**
   *
   *
   * <pre>
   * Routes that were advertised to the remote BGP peer
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route advertised_routes = 333393068;</code>
   */
  com.google.cloud.compute.v1.Route getAdvertisedRoutes(int index);
  /**
   *
   *
   * <pre>
   * Routes that were advertised to the remote BGP peer
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route advertised_routes = 333393068;</code>
   */
  int getAdvertisedRoutesCount();
  /**
   *
   *
   * <pre>
   * Routes that were advertised to the remote BGP peer
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route advertised_routes = 333393068;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouteOrBuilder>
      getAdvertisedRoutesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Routes that were advertised to the remote BGP peer
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route advertised_routes = 333393068;</code>
   */
  com.google.cloud.compute.v1.RouteOrBuilder getAdvertisedRoutesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * IP address of the local BGP interface.
   * </pre>
   *
   * <code>string ip_address = 406272220;</code>
   *
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the local BGP interface.
   * </pre>
   *
   * <code>string ip_address = 406272220;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the local BGP interface.
   * </pre>
   *
   * <code>string ip_address = 406272220;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * URL of the VPN tunnel that this BGP peer controls.
   * </pre>
   *
   * <code>string linked_vpn_tunnel = 352296953;</code>
   *
   * @return Whether the linkedVpnTunnel field is set.
   */
  boolean hasLinkedVpnTunnel();
  /**
   *
   *
   * <pre>
   * URL of the VPN tunnel that this BGP peer controls.
   * </pre>
   *
   * <code>string linked_vpn_tunnel = 352296953;</code>
   *
   * @return The linkedVpnTunnel.
   */
  java.lang.String getLinkedVpnTunnel();
  /**
   *
   *
   * <pre>
   * URL of the VPN tunnel that this BGP peer controls.
   * </pre>
   *
   * <code>string linked_vpn_tunnel = 352296953;</code>
   *
   * @return The bytes for linkedVpnTunnel.
   */
  com.google.protobuf.ByteString getLinkedVpnTunnelBytes();

  /**
   *
   *
   * <pre>
   * Name of this BGP peer. Unique within the Routers resource.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of this BGP peer. Unique within the Routers resource.
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
   * Name of this BGP peer. Unique within the Routers resource.
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
   * Number of routes learned from the remote BGP Peer.
   * </pre>
   *
   * <code>uint32 num_learned_routes = 135457535;</code>
   *
   * @return Whether the numLearnedRoutes field is set.
   */
  boolean hasNumLearnedRoutes();
  /**
   *
   *
   * <pre>
   * Number of routes learned from the remote BGP Peer.
   * </pre>
   *
   * <code>uint32 num_learned_routes = 135457535;</code>
   *
   * @return The numLearnedRoutes.
   */
  int getNumLearnedRoutes();

  /**
   *
   *
   * <pre>
   * IP address of the remote BGP interface.
   * </pre>
   *
   * <code>string peer_ip_address = 207735769;</code>
   *
   * @return Whether the peerIpAddress field is set.
   */
  boolean hasPeerIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the remote BGP interface.
   * </pre>
   *
   * <code>string peer_ip_address = 207735769;</code>
   *
   * @return The peerIpAddress.
   */
  java.lang.String getPeerIpAddress();
  /**
   *
   *
   * <pre>
   * IP address of the remote BGP interface.
   * </pre>
   *
   * <code>string peer_ip_address = 207735769;</code>
   *
   * @return The bytes for peerIpAddress.
   */
  com.google.protobuf.ByteString getPeerIpAddressBytes();

  /**
   *
   *
   * <pre>
   * BGP state as specified in RFC1771.
   * </pre>
   *
   * <code>string state = 109757585;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * BGP state as specified in RFC1771.
   * </pre>
   *
   * <code>string state = 109757585;</code>
   *
   * @return The state.
   */
  java.lang.String getState();
  /**
   *
   *
   * <pre>
   * BGP state as specified in RFC1771.
   * </pre>
   *
   * <code>string state = 109757585;</code>
   *
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString getStateBytes();

  /**
   *
   *
   * <pre>
   * Status of the BGP peer: {UP, DOWN}
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterStatusBgpPeerStatus.Status status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Status of the BGP peer: {UP, DOWN}
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterStatusBgpPeerStatus.Status status = 181260274;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * Status of the BGP peer: {UP, DOWN}
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterStatusBgpPeerStatus.Status status = 181260274;</code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.RouterStatusBgpPeerStatus.Status getStatus();

  /**
   *
   *
   * <pre>
   * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59 seconds
   * </pre>
   *
   * <code>string uptime = 235379688;</code>
   *
   * @return Whether the uptime field is set.
   */
  boolean hasUptime();
  /**
   *
   *
   * <pre>
   * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59 seconds
   * </pre>
   *
   * <code>string uptime = 235379688;</code>
   *
   * @return The uptime.
   */
  java.lang.String getUptime();
  /**
   *
   *
   * <pre>
   * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59 seconds
   * </pre>
   *
   * <code>string uptime = 235379688;</code>
   *
   * @return The bytes for uptime.
   */
  com.google.protobuf.ByteString getUptimeBytes();

  /**
   *
   *
   * <pre>
   * Time this session has been up, in seconds. Format: 145
   * </pre>
   *
   * <code>string uptime_seconds = 104736040;</code>
   *
   * @return Whether the uptimeSeconds field is set.
   */
  boolean hasUptimeSeconds();
  /**
   *
   *
   * <pre>
   * Time this session has been up, in seconds. Format: 145
   * </pre>
   *
   * <code>string uptime_seconds = 104736040;</code>
   *
   * @return The uptimeSeconds.
   */
  java.lang.String getUptimeSeconds();
  /**
   *
   *
   * <pre>
   * Time this session has been up, in seconds. Format: 145
   * </pre>
   *
   * <code>string uptime_seconds = 104736040;</code>
   *
   * @return The bytes for uptimeSeconds.
   */
  com.google.protobuf.ByteString getUptimeSecondsBytes();
}
