// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface InstanceGroupManagersListErrorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] The list of errors of the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
   */
  java.util.List<com.google.cloud.compute.v1.InstanceManagedByIgmError> 
      getItemsList();
  /**
   * <pre>
   * [Output Only] The list of errors of the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
   */
  com.google.cloud.compute.v1.InstanceManagedByIgmError getItems(int index);
  /**
   * <pre>
   * [Output Only] The list of errors of the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * [Output Only] The list of errors of the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.InstanceManagedByIgmErrorOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * [Output Only] The list of errors of the managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceManagedByIgmError items = 100526016;</code>
   */
  com.google.cloud.compute.v1.InstanceManagedByIgmErrorOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   * @return Whether the nextPageToken field is set.
   */
  boolean hasNextPageToken();
  /**
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}