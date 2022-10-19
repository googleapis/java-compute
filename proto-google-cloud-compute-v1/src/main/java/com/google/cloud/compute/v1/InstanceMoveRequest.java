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

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceMoveRequest}
 */
public final class InstanceMoveRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceMoveRequest)
    InstanceMoveRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceMoveRequest.newBuilder() to construct.
  private InstanceMoveRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceMoveRequest() {
    destinationZone_ = "";
    targetInstance_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceMoveRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceMoveRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceMoveRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceMoveRequest.class,
            com.google.cloud.compute.v1.InstanceMoveRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DESTINATION_ZONE_FIELD_NUMBER = 131854653;
  private volatile java.lang.Object destinationZone_;
  /**
   *
   *
   * <pre>
   * The URL of the destination zone to move the instance. This can be a full or partial URL. For example, the following are all valid URLs to a zone: - https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone - zones/zone
   * </pre>
   *
   * <code>optional string destination_zone = 131854653;</code>
   *
   * @return Whether the destinationZone field is set.
   */
  @java.lang.Override
  public boolean hasDestinationZone() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The URL of the destination zone to move the instance. This can be a full or partial URL. For example, the following are all valid URLs to a zone: - https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone - zones/zone
   * </pre>
   *
   * <code>optional string destination_zone = 131854653;</code>
   *
   * @return The destinationZone.
   */
  @java.lang.Override
  public java.lang.String getDestinationZone() {
    java.lang.Object ref = destinationZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationZone_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URL of the destination zone to move the instance. This can be a full or partial URL. For example, the following are all valid URLs to a zone: - https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone - zones/zone
   * </pre>
   *
   * <code>optional string destination_zone = 131854653;</code>
   *
   * @return The bytes for destinationZone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDestinationZoneBytes() {
    java.lang.Object ref = destinationZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      destinationZone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_INSTANCE_FIELD_NUMBER = 289769347;
  private volatile java.lang.Object targetInstance_;
  /**
   *
   *
   * <pre>
   * The URL of the target instance to move. This can be a full or partial URL. For example, the following are all valid URLs to an instance: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
   * </pre>
   *
   * <code>optional string target_instance = 289769347;</code>
   *
   * @return Whether the targetInstance field is set.
   */
  @java.lang.Override
  public boolean hasTargetInstance() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The URL of the target instance to move. This can be a full or partial URL. For example, the following are all valid URLs to an instance: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
   * </pre>
   *
   * <code>optional string target_instance = 289769347;</code>
   *
   * @return The targetInstance.
   */
  @java.lang.Override
  public java.lang.String getTargetInstance() {
    java.lang.Object ref = targetInstance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetInstance_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URL of the target instance to move. This can be a full or partial URL. For example, the following are all valid URLs to an instance: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
   * </pre>
   *
   * <code>optional string target_instance = 289769347;</code>
   *
   * @return The bytes for targetInstance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTargetInstanceBytes() {
    java.lang.Object ref = targetInstance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      targetInstance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 131854653, destinationZone_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 289769347, targetInstance_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(131854653, destinationZone_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(289769347, targetInstance_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceMoveRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceMoveRequest other =
        (com.google.cloud.compute.v1.InstanceMoveRequest) obj;

    if (hasDestinationZone() != other.hasDestinationZone()) return false;
    if (hasDestinationZone()) {
      if (!getDestinationZone().equals(other.getDestinationZone())) return false;
    }
    if (hasTargetInstance() != other.hasTargetInstance()) return false;
    if (hasTargetInstance()) {
      if (!getTargetInstance().equals(other.getTargetInstance())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDestinationZone()) {
      hash = (37 * hash) + DESTINATION_ZONE_FIELD_NUMBER;
      hash = (53 * hash) + getDestinationZone().hashCode();
    }
    if (hasTargetInstance()) {
      hash = (37 * hash) + TARGET_INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getTargetInstance().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.compute.v1.InstanceMoveRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstanceMoveRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceMoveRequest)
      com.google.cloud.compute.v1.InstanceMoveRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceMoveRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceMoveRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceMoveRequest.class,
              com.google.cloud.compute.v1.InstanceMoveRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstanceMoveRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      destinationZone_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      targetInstance_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceMoveRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceMoveRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceMoveRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceMoveRequest build() {
      com.google.cloud.compute.v1.InstanceMoveRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceMoveRequest buildPartial() {
      com.google.cloud.compute.v1.InstanceMoveRequest result =
          new com.google.cloud.compute.v1.InstanceMoveRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.destinationZone_ = destinationZone_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.targetInstance_ = targetInstance_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.InstanceMoveRequest) {
        return mergeFrom((com.google.cloud.compute.v1.InstanceMoveRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstanceMoveRequest other) {
      if (other == com.google.cloud.compute.v1.InstanceMoveRequest.getDefaultInstance())
        return this;
      if (other.hasDestinationZone()) {
        bitField0_ |= 0x00000001;
        destinationZone_ = other.destinationZone_;
        onChanged();
      }
      if (other.hasTargetInstance()) {
        bitField0_ |= 0x00000002;
        targetInstance_ = other.targetInstance_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 1054837226:
              {
                destinationZone_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 1054837226
            case -1976812518:
              {
                targetInstance_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -1976812518
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object destinationZone_ = "";
    /**
     *
     *
     * <pre>
     * The URL of the destination zone to move the instance. This can be a full or partial URL. For example, the following are all valid URLs to a zone: - https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone - zones/zone
     * </pre>
     *
     * <code>optional string destination_zone = 131854653;</code>
     *
     * @return Whether the destinationZone field is set.
     */
    public boolean hasDestinationZone() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The URL of the destination zone to move the instance. This can be a full or partial URL. For example, the following are all valid URLs to a zone: - https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone - zones/zone
     * </pre>
     *
     * <code>optional string destination_zone = 131854653;</code>
     *
     * @return The destinationZone.
     */
    public java.lang.String getDestinationZone() {
      java.lang.Object ref = destinationZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL of the destination zone to move the instance. This can be a full or partial URL. For example, the following are all valid URLs to a zone: - https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone - zones/zone
     * </pre>
     *
     * <code>optional string destination_zone = 131854653;</code>
     *
     * @return The bytes for destinationZone.
     */
    public com.google.protobuf.ByteString getDestinationZoneBytes() {
      java.lang.Object ref = destinationZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        destinationZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL of the destination zone to move the instance. This can be a full or partial URL. For example, the following are all valid URLs to a zone: - https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone - zones/zone
     * </pre>
     *
     * <code>optional string destination_zone = 131854653;</code>
     *
     * @param value The destinationZone to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      destinationZone_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL of the destination zone to move the instance. This can be a full or partial URL. For example, the following are all valid URLs to a zone: - https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone - zones/zone
     * </pre>
     *
     * <code>optional string destination_zone = 131854653;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDestinationZone() {
      bitField0_ = (bitField0_ & ~0x00000001);
      destinationZone_ = getDefaultInstance().getDestinationZone();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL of the destination zone to move the instance. This can be a full or partial URL. For example, the following are all valid URLs to a zone: - https://www.googleapis.com/compute/v1/projects/project/zones/zone - projects/project/zones/zone - zones/zone
     * </pre>
     *
     * <code>optional string destination_zone = 131854653;</code>
     *
     * @param value The bytes for destinationZone to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      destinationZone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object targetInstance_ = "";
    /**
     *
     *
     * <pre>
     * The URL of the target instance to move. This can be a full or partial URL. For example, the following are all valid URLs to an instance: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * </pre>
     *
     * <code>optional string target_instance = 289769347;</code>
     *
     * @return Whether the targetInstance field is set.
     */
    public boolean hasTargetInstance() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The URL of the target instance to move. This can be a full or partial URL. For example, the following are all valid URLs to an instance: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * </pre>
     *
     * <code>optional string target_instance = 289769347;</code>
     *
     * @return The targetInstance.
     */
    public java.lang.String getTargetInstance() {
      java.lang.Object ref = targetInstance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetInstance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL of the target instance to move. This can be a full or partial URL. For example, the following are all valid URLs to an instance: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * </pre>
     *
     * <code>optional string target_instance = 289769347;</code>
     *
     * @return The bytes for targetInstance.
     */
    public com.google.protobuf.ByteString getTargetInstanceBytes() {
      java.lang.Object ref = targetInstance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        targetInstance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL of the target instance to move. This can be a full or partial URL. For example, the following are all valid URLs to an instance: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * </pre>
     *
     * <code>optional string target_instance = 289769347;</code>
     *
     * @param value The targetInstance to set.
     * @return This builder for chaining.
     */
    public Builder setTargetInstance(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      targetInstance_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL of the target instance to move. This can be a full or partial URL. For example, the following are all valid URLs to an instance: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * </pre>
     *
     * <code>optional string target_instance = 289769347;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetInstance() {
      bitField0_ = (bitField0_ & ~0x00000002);
      targetInstance_ = getDefaultInstance().getTargetInstance();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL of the target instance to move. This can be a full or partial URL. For example, the following are all valid URLs to an instance: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * </pre>
     *
     * <code>optional string target_instance = 289769347;</code>
     *
     * @param value The bytes for targetInstance to set.
     * @return This builder for chaining.
     */
    public Builder setTargetInstanceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      targetInstance_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceMoveRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceMoveRequest)
  private static final com.google.cloud.compute.v1.InstanceMoveRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceMoveRequest();
  }

  public static com.google.cloud.compute.v1.InstanceMoveRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceMoveRequest> PARSER =
      new com.google.protobuf.AbstractParser<InstanceMoveRequest>() {
        @java.lang.Override
        public InstanceMoveRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<InstanceMoveRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceMoveRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceMoveRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
