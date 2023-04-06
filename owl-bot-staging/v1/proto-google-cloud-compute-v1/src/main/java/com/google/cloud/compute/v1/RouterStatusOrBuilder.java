// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface RouterStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Best routes for this router's network.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route best_routes = 395826693;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Route> 
      getBestRoutesList();
  /**
   * <pre>
   * Best routes for this router's network.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route best_routes = 395826693;</code>
   */
  com.google.cloud.compute.v1.Route getBestRoutes(int index);
  /**
   * <pre>
   * Best routes for this router's network.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route best_routes = 395826693;</code>
   */
  int getBestRoutesCount();
  /**
   * <pre>
   * Best routes for this router's network.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route best_routes = 395826693;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouteOrBuilder> 
      getBestRoutesOrBuilderList();
  /**
   * <pre>
   * Best routes for this router's network.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route best_routes = 395826693;</code>
   */
  com.google.cloud.compute.v1.RouteOrBuilder getBestRoutesOrBuilder(
      int index);

  /**
   * <pre>
   * Best routes learned by this router.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route best_routes_for_router = 119389689;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Route> 
      getBestRoutesForRouterList();
  /**
   * <pre>
   * Best routes learned by this router.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route best_routes_for_router = 119389689;</code>
   */
  com.google.cloud.compute.v1.Route getBestRoutesForRouter(int index);
  /**
   * <pre>
   * Best routes learned by this router.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route best_routes_for_router = 119389689;</code>
   */
  int getBestRoutesForRouterCount();
  /**
   * <pre>
   * Best routes learned by this router.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route best_routes_for_router = 119389689;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouteOrBuilder> 
      getBestRoutesForRouterOrBuilderList();
  /**
   * <pre>
   * Best routes learned by this router.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Route best_routes_for_router = 119389689;</code>
   */
  com.google.cloud.compute.v1.RouteOrBuilder getBestRoutesForRouterOrBuilder(
      int index);

  /**
   * <code>repeated .google.cloud.compute.v1.RouterStatusBgpPeerStatus bgp_peer_status = 218459131;</code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterStatusBgpPeerStatus> 
      getBgpPeerStatusList();
  /**
   * <code>repeated .google.cloud.compute.v1.RouterStatusBgpPeerStatus bgp_peer_status = 218459131;</code>
   */
  com.google.cloud.compute.v1.RouterStatusBgpPeerStatus getBgpPeerStatus(int index);
  /**
   * <code>repeated .google.cloud.compute.v1.RouterStatusBgpPeerStatus bgp_peer_status = 218459131;</code>
   */
  int getBgpPeerStatusCount();
  /**
   * <code>repeated .google.cloud.compute.v1.RouterStatusBgpPeerStatus bgp_peer_status = 218459131;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterStatusBgpPeerStatusOrBuilder> 
      getBgpPeerStatusOrBuilderList();
  /**
   * <code>repeated .google.cloud.compute.v1.RouterStatusBgpPeerStatus bgp_peer_status = 218459131;</code>
   */
  com.google.cloud.compute.v1.RouterStatusBgpPeerStatusOrBuilder getBgpPeerStatusOrBuilder(
      int index);

  /**
   * <code>repeated .google.cloud.compute.v1.RouterStatusNatStatus nat_status = 63098064;</code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterStatusNatStatus> 
      getNatStatusList();
  /**
   * <code>repeated .google.cloud.compute.v1.RouterStatusNatStatus nat_status = 63098064;</code>
   */
  com.google.cloud.compute.v1.RouterStatusNatStatus getNatStatus(int index);
  /**
   * <code>repeated .google.cloud.compute.v1.RouterStatusNatStatus nat_status = 63098064;</code>
   */
  int getNatStatusCount();
  /**
   * <code>repeated .google.cloud.compute.v1.RouterStatusNatStatus nat_status = 63098064;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterStatusNatStatusOrBuilder> 
      getNatStatusOrBuilderList();
  /**
   * <code>repeated .google.cloud.compute.v1.RouterStatusNatStatus nat_status = 63098064;</code>
   */
  com.google.cloud.compute.v1.RouterStatusNatStatusOrBuilder getNatStatusOrBuilder(
      int index);

  /**
   * <pre>
   * URI of the network to which this router belongs.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   * <pre>
   * URI of the network to which this router belongs.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * URI of the network to which this router belongs.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();
}
