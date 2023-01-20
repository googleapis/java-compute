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
 * Time window specified for daily maintenance operations. GCE's internal maintenance will be performed within this window.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NodeGroupMaintenanceWindow}
 */
public final class NodeGroupMaintenanceWindow extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NodeGroupMaintenanceWindow)
    NodeGroupMaintenanceWindowOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NodeGroupMaintenanceWindow.newBuilder() to construct.
  private NodeGroupMaintenanceWindow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NodeGroupMaintenanceWindow() {
    startTime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NodeGroupMaintenanceWindow();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NodeGroupMaintenanceWindow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NodeGroupMaintenanceWindow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NodeGroupMaintenanceWindow.class,
            com.google.cloud.compute.v1.NodeGroupMaintenanceWindow.Builder.class);
  }

  private int bitField0_;
  public static final int MAINTENANCE_DURATION_FIELD_NUMBER = 525291840;
  private com.google.cloud.compute.v1.Duration maintenanceDuration_;
  /**
   *
   *
   * <pre>
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
   *
   * @return Whether the maintenanceDuration field is set.
   */
  @java.lang.Override
  public boolean hasMaintenanceDuration() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
   *
   * @return The maintenanceDuration.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Duration getMaintenanceDuration() {
    return maintenanceDuration_ == null
        ? com.google.cloud.compute.v1.Duration.getDefaultInstance()
        : maintenanceDuration_;
  }
  /**
   *
   *
   * <pre>
   * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.DurationOrBuilder getMaintenanceDurationOrBuilder() {
    return maintenanceDuration_ == null
        ? com.google.cloud.compute.v1.Duration.getDefaultInstance()
        : maintenanceDuration_;
  }

  public static final int START_TIME_FIELD_NUMBER = 37467274;

  @SuppressWarnings("serial")
  private volatile java.lang.Object startTime_ = "";
  /**
   *
   *
   * <pre>
   * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return The startTime.
   */
  @java.lang.Override
  public java.lang.String getStartTime() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startTime_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return The bytes for startTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStartTimeBytes() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      startTime_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 37467274, startTime_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(525291840, getMaintenanceDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(37467274, startTime_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              525291840, getMaintenanceDuration());
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
    if (!(obj instanceof com.google.cloud.compute.v1.NodeGroupMaintenanceWindow)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NodeGroupMaintenanceWindow other =
        (com.google.cloud.compute.v1.NodeGroupMaintenanceWindow) obj;

    if (hasMaintenanceDuration() != other.hasMaintenanceDuration()) return false;
    if (hasMaintenanceDuration()) {
      if (!getMaintenanceDuration().equals(other.getMaintenanceDuration())) return false;
    }
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime().equals(other.getStartTime())) return false;
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
    if (hasMaintenanceDuration()) {
      hash = (37 * hash) + MAINTENANCE_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getMaintenanceDuration().hashCode();
    }
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.compute.v1.NodeGroupMaintenanceWindow prototype) {
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
   * Time window specified for daily maintenance operations. GCE's internal maintenance will be performed within this window.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.NodeGroupMaintenanceWindow}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NodeGroupMaintenanceWindow)
      com.google.cloud.compute.v1.NodeGroupMaintenanceWindowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NodeGroupMaintenanceWindow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NodeGroupMaintenanceWindow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NodeGroupMaintenanceWindow.class,
              com.google.cloud.compute.v1.NodeGroupMaintenanceWindow.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NodeGroupMaintenanceWindow.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMaintenanceDurationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maintenanceDuration_ = null;
      if (maintenanceDurationBuilder_ != null) {
        maintenanceDurationBuilder_.dispose();
        maintenanceDurationBuilder_ = null;
      }
      startTime_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NodeGroupMaintenanceWindow_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupMaintenanceWindow getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NodeGroupMaintenanceWindow.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupMaintenanceWindow build() {
      com.google.cloud.compute.v1.NodeGroupMaintenanceWindow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupMaintenanceWindow buildPartial() {
      com.google.cloud.compute.v1.NodeGroupMaintenanceWindow result =
          new com.google.cloud.compute.v1.NodeGroupMaintenanceWindow(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.NodeGroupMaintenanceWindow result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maintenanceDuration_ =
            maintenanceDurationBuilder_ == null
                ? maintenanceDuration_
                : maintenanceDurationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startTime_ = startTime_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.NodeGroupMaintenanceWindow) {
        return mergeFrom((com.google.cloud.compute.v1.NodeGroupMaintenanceWindow) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NodeGroupMaintenanceWindow other) {
      if (other == com.google.cloud.compute.v1.NodeGroupMaintenanceWindow.getDefaultInstance())
        return this;
      if (other.hasMaintenanceDuration()) {
        mergeMaintenanceDuration(other.getMaintenanceDuration());
      }
      if (other.hasStartTime()) {
        startTime_ = other.startTime_;
        bitField0_ |= 0x00000002;
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
            case 299738194:
              {
                startTime_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 299738194
            case -92632574:
              {
                input.readMessage(
                    getMaintenanceDurationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case -92632574
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

    private com.google.cloud.compute.v1.Duration maintenanceDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Duration,
            com.google.cloud.compute.v1.Duration.Builder,
            com.google.cloud.compute.v1.DurationOrBuilder>
        maintenanceDurationBuilder_;
    /**
     *
     *
     * <pre>
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
     *
     * @return Whether the maintenanceDuration field is set.
     */
    public boolean hasMaintenanceDuration() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
     *
     * @return The maintenanceDuration.
     */
    public com.google.cloud.compute.v1.Duration getMaintenanceDuration() {
      if (maintenanceDurationBuilder_ == null) {
        return maintenanceDuration_ == null
            ? com.google.cloud.compute.v1.Duration.getDefaultInstance()
            : maintenanceDuration_;
      } else {
        return maintenanceDurationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
     */
    public Builder setMaintenanceDuration(com.google.cloud.compute.v1.Duration value) {
      if (maintenanceDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maintenanceDuration_ = value;
      } else {
        maintenanceDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
     */
    public Builder setMaintenanceDuration(
        com.google.cloud.compute.v1.Duration.Builder builderForValue) {
      if (maintenanceDurationBuilder_ == null) {
        maintenanceDuration_ = builderForValue.build();
      } else {
        maintenanceDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
     */
    public Builder mergeMaintenanceDuration(com.google.cloud.compute.v1.Duration value) {
      if (maintenanceDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && maintenanceDuration_ != null
            && maintenanceDuration_ != com.google.cloud.compute.v1.Duration.getDefaultInstance()) {
          getMaintenanceDurationBuilder().mergeFrom(value);
        } else {
          maintenanceDuration_ = value;
        }
      } else {
        maintenanceDurationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
     */
    public Builder clearMaintenanceDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maintenanceDuration_ = null;
      if (maintenanceDurationBuilder_ != null) {
        maintenanceDurationBuilder_.dispose();
        maintenanceDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
     */
    public com.google.cloud.compute.v1.Duration.Builder getMaintenanceDurationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMaintenanceDurationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
     */
    public com.google.cloud.compute.v1.DurationOrBuilder getMaintenanceDurationOrBuilder() {
      if (maintenanceDurationBuilder_ != null) {
        return maintenanceDurationBuilder_.getMessageOrBuilder();
      } else {
        return maintenanceDuration_ == null
            ? com.google.cloud.compute.v1.Duration.getDefaultInstance()
            : maintenanceDuration_;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration maintenance_duration = 525291840;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Duration,
            com.google.cloud.compute.v1.Duration.Builder,
            com.google.cloud.compute.v1.DurationOrBuilder>
        getMaintenanceDurationFieldBuilder() {
      if (maintenanceDurationBuilder_ == null) {
        maintenanceDurationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Duration,
                com.google.cloud.compute.v1.Duration.Builder,
                com.google.cloud.compute.v1.DurationOrBuilder>(
                getMaintenanceDuration(), getParentForChildren(), isClean());
        maintenanceDuration_ = null;
      }
      return maintenanceDurationBuilder_;
    }

    private java.lang.Object startTime_ = "";
    /**
     *
     *
     * <pre>
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     *
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     *
     * @return The startTime.
     */
    public java.lang.String getStartTime() {
      java.lang.Object ref = startTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     *
     * @return The bytes for startTime.
     */
    public com.google.protobuf.ByteString getStartTimeBytes() {
      java.lang.Object ref = startTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     *
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      startTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      startTime_ = getDefaultInstance().getStartTime();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     *
     * @param value The bytes for startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      startTime_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NodeGroupMaintenanceWindow)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NodeGroupMaintenanceWindow)
  private static final com.google.cloud.compute.v1.NodeGroupMaintenanceWindow DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NodeGroupMaintenanceWindow();
  }

  public static com.google.cloud.compute.v1.NodeGroupMaintenanceWindow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeGroupMaintenanceWindow> PARSER =
      new com.google.protobuf.AbstractParser<NodeGroupMaintenanceWindow>() {
        @java.lang.Override
        public NodeGroupMaintenanceWindow parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodeGroupMaintenanceWindow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeGroupMaintenanceWindow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NodeGroupMaintenanceWindow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
