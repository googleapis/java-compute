// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface DiskParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DiskParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  int getResourceManagerTagsCount();
  /**
   * <pre>
   * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  boolean containsResourceManagerTags(
      java.lang.String key);
  /**
   * Use {@link #getResourceManagerTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getResourceManagerTags();
  /**
   * <pre>
   * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getResourceManagerTagsMap();
  /**
   * <pre>
   * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  /* nullable */
java.lang.String getResourceManagerTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Resource manager tags to be bound to the disk. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  java.lang.String getResourceManagerTagsOrThrow(
      java.lang.String key);
}