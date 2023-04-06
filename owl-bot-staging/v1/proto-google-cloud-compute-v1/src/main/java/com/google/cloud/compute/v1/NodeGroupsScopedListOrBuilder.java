// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NodeGroupsScopedListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeGroupsScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] A list of node groups contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeGroup node_groups = 73188017;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NodeGroup> 
      getNodeGroupsList();
  /**
   * <pre>
   * [Output Only] A list of node groups contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeGroup node_groups = 73188017;</code>
   */
  com.google.cloud.compute.v1.NodeGroup getNodeGroups(int index);
  /**
   * <pre>
   * [Output Only] A list of node groups contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeGroup node_groups = 73188017;</code>
   */
  int getNodeGroupsCount();
  /**
   * <pre>
   * [Output Only] A list of node groups contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeGroup node_groups = 73188017;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NodeGroupOrBuilder> 
      getNodeGroupsOrBuilderList();
  /**
   * <pre>
   * [Output Only] A list of node groups contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeGroup node_groups = 73188017;</code>
   */
  com.google.cloud.compute.v1.NodeGroupOrBuilder getNodeGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] An informational warning that appears when the nodeGroup list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * [Output Only] An informational warning that appears when the nodeGroup list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   * <pre>
   * [Output Only] An informational warning that appears when the nodeGroup list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
