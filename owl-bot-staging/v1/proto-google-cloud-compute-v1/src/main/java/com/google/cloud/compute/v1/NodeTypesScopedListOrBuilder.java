// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NodeTypesScopedListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeTypesScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] A list of node types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NodeType> 
      getNodeTypesList();
  /**
   * <pre>
   * [Output Only] A list of node types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
   */
  com.google.cloud.compute.v1.NodeType getNodeTypes(int index);
  /**
   * <pre>
   * [Output Only] A list of node types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
   */
  int getNodeTypesCount();
  /**
   * <pre>
   * [Output Only] A list of node types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NodeTypeOrBuilder> 
      getNodeTypesOrBuilderList();
  /**
   * <pre>
   * [Output Only] A list of node types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
   */
  com.google.cloud.compute.v1.NodeTypeOrBuilder getNodeTypesOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] An informational warning that appears when the node types list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * [Output Only] An informational warning that appears when the node types list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   * <pre>
   * [Output Only] An informational warning that appears when the node types list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
