// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest}
 */
public final class NetworkEndpointGroupsAttachEndpointsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest)
    NetworkEndpointGroupsAttachEndpointsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NetworkEndpointGroupsAttachEndpointsRequest.newBuilder() to construct.
  private NetworkEndpointGroupsAttachEndpointsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetworkEndpointGroupsAttachEndpointsRequest() {
    networkEndpoints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NetworkEndpointGroupsAttachEndpointsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NetworkEndpointGroupsAttachEndpointsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 1198802282: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              networkEndpoints_ = new java.util.ArrayList<com.google.cloud.compute.v1.NetworkEndpoint>();
              mutable_bitField0_ |= 0x00000001;
            }
            networkEndpoints_.add(
                input.readMessage(com.google.cloud.compute.v1.NetworkEndpoint.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        networkEndpoints_ = java.util.Collections.unmodifiableList(networkEndpoints_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupsAttachEndpointsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupsAttachEndpointsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest.class, com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest.Builder.class);
  }

  public static final int NETWORK_ENDPOINTS_FIELD_NUMBER = 149850285;
  private java.util.List<com.google.cloud.compute.v1.NetworkEndpoint> networkEndpoints_;
  /**
   * <pre>
   * The list of network endpoints to be attached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.NetworkEndpoint> getNetworkEndpointsList() {
    return networkEndpoints_;
  }
  /**
   * <pre>
   * The list of network endpoints to be attached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.NetworkEndpointOrBuilder> 
      getNetworkEndpointsOrBuilderList() {
    return networkEndpoints_;
  }
  /**
   * <pre>
   * The list of network endpoints to be attached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  @java.lang.Override
  public int getNetworkEndpointsCount() {
    return networkEndpoints_.size();
  }
  /**
   * <pre>
   * The list of network endpoints to be attached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpoint getNetworkEndpoints(int index) {
    return networkEndpoints_.get(index);
  }
  /**
   * <pre>
   * The list of network endpoints to be attached.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpointOrBuilder getNetworkEndpointsOrBuilder(
      int index) {
    return networkEndpoints_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < networkEndpoints_.size(); i++) {
      output.writeMessage(149850285, networkEndpoints_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < networkEndpoints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(149850285, networkEndpoints_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest other = (com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest) obj;

    if (!getNetworkEndpointsList()
        .equals(other.getNetworkEndpointsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getNetworkEndpointsCount() > 0) {
      hash = (37 * hash) + NETWORK_ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkEndpointsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest)
      com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupsAttachEndpointsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupsAttachEndpointsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest.class, com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getNetworkEndpointsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (networkEndpointsBuilder_ == null) {
        networkEndpoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        networkEndpointsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupsAttachEndpointsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest build() {
      com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest buildPartial() {
      com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest result = new com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest(this);
      int from_bitField0_ = bitField0_;
      if (networkEndpointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          networkEndpoints_ = java.util.Collections.unmodifiableList(networkEndpoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.networkEndpoints_ = networkEndpoints_;
      } else {
        result.networkEndpoints_ = networkEndpointsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest) {
        return mergeFrom((com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest other) {
      if (other == com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest.getDefaultInstance()) return this;
      if (networkEndpointsBuilder_ == null) {
        if (!other.networkEndpoints_.isEmpty()) {
          if (networkEndpoints_.isEmpty()) {
            networkEndpoints_ = other.networkEndpoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNetworkEndpointsIsMutable();
            networkEndpoints_.addAll(other.networkEndpoints_);
          }
          onChanged();
        }
      } else {
        if (!other.networkEndpoints_.isEmpty()) {
          if (networkEndpointsBuilder_.isEmpty()) {
            networkEndpointsBuilder_.dispose();
            networkEndpointsBuilder_ = null;
            networkEndpoints_ = other.networkEndpoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            networkEndpointsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNetworkEndpointsFieldBuilder() : null;
          } else {
            networkEndpointsBuilder_.addAllMessages(other.networkEndpoints_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.compute.v1.NetworkEndpoint> networkEndpoints_ =
      java.util.Collections.emptyList();
    private void ensureNetworkEndpointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        networkEndpoints_ = new java.util.ArrayList<com.google.cloud.compute.v1.NetworkEndpoint>(networkEndpoints_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.NetworkEndpoint, com.google.cloud.compute.v1.NetworkEndpoint.Builder, com.google.cloud.compute.v1.NetworkEndpointOrBuilder> networkEndpointsBuilder_;

    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.NetworkEndpoint> getNetworkEndpointsList() {
      if (networkEndpointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(networkEndpoints_);
      } else {
        return networkEndpointsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public int getNetworkEndpointsCount() {
      if (networkEndpointsBuilder_ == null) {
        return networkEndpoints_.size();
      } else {
        return networkEndpointsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public com.google.cloud.compute.v1.NetworkEndpoint getNetworkEndpoints(int index) {
      if (networkEndpointsBuilder_ == null) {
        return networkEndpoints_.get(index);
      } else {
        return networkEndpointsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder setNetworkEndpoints(
        int index, com.google.cloud.compute.v1.NetworkEndpoint value) {
      if (networkEndpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.set(index, value);
        onChanged();
      } else {
        networkEndpointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder setNetworkEndpoints(
        int index, com.google.cloud.compute.v1.NetworkEndpoint.Builder builderForValue) {
      if (networkEndpointsBuilder_ == null) {
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        networkEndpointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder addNetworkEndpoints(com.google.cloud.compute.v1.NetworkEndpoint value) {
      if (networkEndpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.add(value);
        onChanged();
      } else {
        networkEndpointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder addNetworkEndpoints(
        int index, com.google.cloud.compute.v1.NetworkEndpoint value) {
      if (networkEndpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.add(index, value);
        onChanged();
      } else {
        networkEndpointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder addNetworkEndpoints(
        com.google.cloud.compute.v1.NetworkEndpoint.Builder builderForValue) {
      if (networkEndpointsBuilder_ == null) {
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.add(builderForValue.build());
        onChanged();
      } else {
        networkEndpointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder addNetworkEndpoints(
        int index, com.google.cloud.compute.v1.NetworkEndpoint.Builder builderForValue) {
      if (networkEndpointsBuilder_ == null) {
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        networkEndpointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder addAllNetworkEndpoints(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.NetworkEndpoint> values) {
      if (networkEndpointsBuilder_ == null) {
        ensureNetworkEndpointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, networkEndpoints_);
        onChanged();
      } else {
        networkEndpointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder clearNetworkEndpoints() {
      if (networkEndpointsBuilder_ == null) {
        networkEndpoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        networkEndpointsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public Builder removeNetworkEndpoints(int index) {
      if (networkEndpointsBuilder_ == null) {
        ensureNetworkEndpointsIsMutable();
        networkEndpoints_.remove(index);
        onChanged();
      } else {
        networkEndpointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public com.google.cloud.compute.v1.NetworkEndpoint.Builder getNetworkEndpointsBuilder(
        int index) {
      return getNetworkEndpointsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public com.google.cloud.compute.v1.NetworkEndpointOrBuilder getNetworkEndpointsOrBuilder(
        int index) {
      if (networkEndpointsBuilder_ == null) {
        return networkEndpoints_.get(index);  } else {
        return networkEndpointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.NetworkEndpointOrBuilder> 
         getNetworkEndpointsOrBuilderList() {
      if (networkEndpointsBuilder_ != null) {
        return networkEndpointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(networkEndpoints_);
      }
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public com.google.cloud.compute.v1.NetworkEndpoint.Builder addNetworkEndpointsBuilder() {
      return getNetworkEndpointsFieldBuilder().addBuilder(
          com.google.cloud.compute.v1.NetworkEndpoint.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public com.google.cloud.compute.v1.NetworkEndpoint.Builder addNetworkEndpointsBuilder(
        int index) {
      return getNetworkEndpointsFieldBuilder().addBuilder(
          index, com.google.cloud.compute.v1.NetworkEndpoint.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of network endpoints to be attached.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NetworkEndpoint network_endpoints = 149850285;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.NetworkEndpoint.Builder> 
         getNetworkEndpointsBuilderList() {
      return getNetworkEndpointsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.NetworkEndpoint, com.google.cloud.compute.v1.NetworkEndpoint.Builder, com.google.cloud.compute.v1.NetworkEndpointOrBuilder> 
        getNetworkEndpointsFieldBuilder() {
      if (networkEndpointsBuilder_ == null) {
        networkEndpointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.NetworkEndpoint, com.google.cloud.compute.v1.NetworkEndpoint.Builder, com.google.cloud.compute.v1.NetworkEndpointOrBuilder>(
                networkEndpoints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        networkEndpoints_ = null;
      }
      return networkEndpointsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest)
  private static final com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest();
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkEndpointGroupsAttachEndpointsRequest>
      PARSER = new com.google.protobuf.AbstractParser<NetworkEndpointGroupsAttachEndpointsRequest>() {
    @java.lang.Override
    public NetworkEndpointGroupsAttachEndpointsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NetworkEndpointGroupsAttachEndpointsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NetworkEndpointGroupsAttachEndpointsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkEndpointGroupsAttachEndpointsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

