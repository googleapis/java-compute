// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NetworksUpdatePeeringRequest}
 */
public final class NetworksUpdatePeeringRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NetworksUpdatePeeringRequest)
    NetworksUpdatePeeringRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NetworksUpdatePeeringRequest.newBuilder() to construct.
  private NetworksUpdatePeeringRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetworksUpdatePeeringRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NetworksUpdatePeeringRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworksUpdatePeeringRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworksUpdatePeeringRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.class, com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NETWORK_PEERING_FIELD_NUMBER = 328926767;
  private com.google.cloud.compute.v1.NetworkPeering networkPeering_;
  /**
   * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
   * @return Whether the networkPeering field is set.
   */
  @java.lang.Override
  public boolean hasNetworkPeering() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
   * @return The networkPeering.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkPeering getNetworkPeering() {
    return networkPeering_ == null ? com.google.cloud.compute.v1.NetworkPeering.getDefaultInstance() : networkPeering_;
  }
  /**
   * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkPeeringOrBuilder getNetworkPeeringOrBuilder() {
    return networkPeering_ == null ? com.google.cloud.compute.v1.NetworkPeering.getDefaultInstance() : networkPeering_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(328926767, getNetworkPeering());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(328926767, getNetworkPeering());
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
    if (!(obj instanceof com.google.cloud.compute.v1.NetworksUpdatePeeringRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NetworksUpdatePeeringRequest other = (com.google.cloud.compute.v1.NetworksUpdatePeeringRequest) obj;

    if (hasNetworkPeering() != other.hasNetworkPeering()) return false;
    if (hasNetworkPeering()) {
      if (!getNetworkPeering()
          .equals(other.getNetworkPeering())) return false;
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
    if (hasNetworkPeering()) {
      hash = (37 * hash) + NETWORK_PEERING_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkPeering().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.NetworksUpdatePeeringRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.NetworksUpdatePeeringRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NetworksUpdatePeeringRequest)
      com.google.cloud.compute.v1.NetworksUpdatePeeringRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworksUpdatePeeringRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworksUpdatePeeringRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.class, com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.newBuilder()
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
        getNetworkPeeringFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      networkPeering_ = null;
      if (networkPeeringBuilder_ != null) {
        networkPeeringBuilder_.dispose();
        networkPeeringBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworksUpdatePeeringRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworksUpdatePeeringRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworksUpdatePeeringRequest build() {
      com.google.cloud.compute.v1.NetworksUpdatePeeringRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworksUpdatePeeringRequest buildPartial() {
      com.google.cloud.compute.v1.NetworksUpdatePeeringRequest result = new com.google.cloud.compute.v1.NetworksUpdatePeeringRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.NetworksUpdatePeeringRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.networkPeering_ = networkPeeringBuilder_ == null
            ? networkPeering_
            : networkPeeringBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.NetworksUpdatePeeringRequest) {
        return mergeFrom((com.google.cloud.compute.v1.NetworksUpdatePeeringRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NetworksUpdatePeeringRequest other) {
      if (other == com.google.cloud.compute.v1.NetworksUpdatePeeringRequest.getDefaultInstance()) return this;
      if (other.hasNetworkPeering()) {
        mergeNetworkPeering(other.getNetworkPeering());
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
            case -1663553158: {
              input.readMessage(
                  getNetworkPeeringFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case -1663553158
            default: {
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

    private com.google.cloud.compute.v1.NetworkPeering networkPeering_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.NetworkPeering, com.google.cloud.compute.v1.NetworkPeering.Builder, com.google.cloud.compute.v1.NetworkPeeringOrBuilder> networkPeeringBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
     * @return Whether the networkPeering field is set.
     */
    public boolean hasNetworkPeering() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
     * @return The networkPeering.
     */
    public com.google.cloud.compute.v1.NetworkPeering getNetworkPeering() {
      if (networkPeeringBuilder_ == null) {
        return networkPeering_ == null ? com.google.cloud.compute.v1.NetworkPeering.getDefaultInstance() : networkPeering_;
      } else {
        return networkPeeringBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
     */
    public Builder setNetworkPeering(com.google.cloud.compute.v1.NetworkPeering value) {
      if (networkPeeringBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        networkPeering_ = value;
      } else {
        networkPeeringBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
     */
    public Builder setNetworkPeering(
        com.google.cloud.compute.v1.NetworkPeering.Builder builderForValue) {
      if (networkPeeringBuilder_ == null) {
        networkPeering_ = builderForValue.build();
      } else {
        networkPeeringBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
     */
    public Builder mergeNetworkPeering(com.google.cloud.compute.v1.NetworkPeering value) {
      if (networkPeeringBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          networkPeering_ != null &&
          networkPeering_ != com.google.cloud.compute.v1.NetworkPeering.getDefaultInstance()) {
          getNetworkPeeringBuilder().mergeFrom(value);
        } else {
          networkPeering_ = value;
        }
      } else {
        networkPeeringBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
     */
    public Builder clearNetworkPeering() {
      bitField0_ = (bitField0_ & ~0x00000001);
      networkPeering_ = null;
      if (networkPeeringBuilder_ != null) {
        networkPeeringBuilder_.dispose();
        networkPeeringBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
     */
    public com.google.cloud.compute.v1.NetworkPeering.Builder getNetworkPeeringBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNetworkPeeringFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
     */
    public com.google.cloud.compute.v1.NetworkPeeringOrBuilder getNetworkPeeringOrBuilder() {
      if (networkPeeringBuilder_ != null) {
        return networkPeeringBuilder_.getMessageOrBuilder();
      } else {
        return networkPeering_ == null ?
            com.google.cloud.compute.v1.NetworkPeering.getDefaultInstance() : networkPeering_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.NetworkPeering network_peering = 328926767;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.NetworkPeering, com.google.cloud.compute.v1.NetworkPeering.Builder, com.google.cloud.compute.v1.NetworkPeeringOrBuilder> 
        getNetworkPeeringFieldBuilder() {
      if (networkPeeringBuilder_ == null) {
        networkPeeringBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.NetworkPeering, com.google.cloud.compute.v1.NetworkPeering.Builder, com.google.cloud.compute.v1.NetworkPeeringOrBuilder>(
                getNetworkPeering(),
                getParentForChildren(),
                isClean());
        networkPeering_ = null;
      }
      return networkPeeringBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NetworksUpdatePeeringRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NetworksUpdatePeeringRequest)
  private static final com.google.cloud.compute.v1.NetworksUpdatePeeringRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NetworksUpdatePeeringRequest();
  }

  public static com.google.cloud.compute.v1.NetworksUpdatePeeringRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworksUpdatePeeringRequest>
      PARSER = new com.google.protobuf.AbstractParser<NetworksUpdatePeeringRequest>() {
    @java.lang.Override
    public NetworksUpdatePeeringRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworksUpdatePeeringRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworksUpdatePeeringRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NetworksUpdatePeeringRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

