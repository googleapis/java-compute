// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface UrlMapsValidateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UrlMapsValidateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Content of the UrlMap to be validated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UrlMap resource = 195806222;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * Content of the UrlMap to be validated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UrlMap resource = 195806222;</code>
   * @return The resource.
   */
  com.google.cloud.compute.v1.UrlMap getResource();
  /**
   * <pre>
   * Content of the UrlMap to be validated.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.UrlMap resource = 195806222;</code>
   */
  com.google.cloud.compute.v1.UrlMapOrBuilder getResourceOrBuilder();
}
