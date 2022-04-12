// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface OperationsScopedListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.OperationsScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] A list of operations contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Operation operations = 4184044;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Operation> 
      getOperationsList();
  /**
   * <pre>
   * [Output Only] A list of operations contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Operation operations = 4184044;</code>
   */
  com.google.cloud.compute.v1.Operation getOperations(int index);
  /**
   * <pre>
   * [Output Only] A list of operations contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Operation operations = 4184044;</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * [Output Only] A list of operations contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Operation operations = 4184044;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.OperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * [Output Only] A list of operations contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Operation operations = 4184044;</code>
   */
  com.google.cloud.compute.v1.OperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] Informational warning which replaces the list of operations when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * [Output Only] Informational warning which replaces the list of operations when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   * <pre>
   * [Output Only] Informational warning which replaces the list of operations when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
