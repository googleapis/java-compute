// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest}
 */
public final class RegionInstanceGroupManagersAbandonInstancesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest)
    RegionInstanceGroupManagersAbandonInstancesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder() to construct.
  private RegionInstanceGroupManagersAbandonInstancesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegionInstanceGroupManagersAbandonInstancesRequest() {
    instances_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegionInstanceGroupManagersAbandonInstancesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegionInstanceGroupManagersAbandonInstancesRequest(
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
          case 232780786: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              instances_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            instances_.add(s);
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
        instances_ = instances_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersAbandonInstancesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersAbandonInstancesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest.class, com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest.Builder.class);
  }

  public static final int INSTANCES_FIELD_NUMBER = 29097598;
  private com.google.protobuf.LazyStringList instances_;
  /**
   * <pre>
   * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @return A list containing the instances.
   */
  public com.google.protobuf.ProtocolStringList
      getInstancesList() {
    return instances_;
  }
  /**
   * <pre>
   * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @return The count of instances.
   */
  public int getInstancesCount() {
    return instances_.size();
  }
  /**
   * <pre>
   * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @param index The index of the element to return.
   * @return The instances at the given index.
   */
  public java.lang.String getInstances(int index) {
    return instances_.get(index);
  }
  /**
   * <pre>
   * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   * @param index The index of the value to return.
   * @return The bytes of the instances at the given index.
   */
  public com.google.protobuf.ByteString
      getInstancesBytes(int index) {
    return instances_.getByteString(index);
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
    for (int i = 0; i < instances_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 29097598, instances_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < instances_.size(); i++) {
        dataSize += computeStringSizeNoTag(instances_.getRaw(i));
      }
      size += dataSize;
      size += 4 * getInstancesList().size();
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
    if (!(obj instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest other = (com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest) obj;

    if (!getInstancesList()
        .equals(other.getInstancesList())) return false;
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
    if (getInstancesCount() > 0) {
      hash = (37 * hash) + INSTANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInstancesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest)
      com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersAbandonInstancesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersAbandonInstancesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest.class, com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      instances_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersAbandonInstancesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest build() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest buildPartial() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest result = new com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        instances_ = instances_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.instances_ = instances_;
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
      if (other instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest) {
        return mergeFrom((com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest other) {
      if (other == com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest.getDefaultInstance()) return this;
      if (!other.instances_.isEmpty()) {
        if (instances_.isEmpty()) {
          instances_ = other.instances_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureInstancesIsMutable();
          instances_.addAll(other.instances_);
        }
        onChanged();
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
      com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList instances_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureInstancesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        instances_ = new com.google.protobuf.LazyStringArrayList(instances_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     * @return A list containing the instances.
     */
    public com.google.protobuf.ProtocolStringList
        getInstancesList() {
      return instances_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     * @return The count of instances.
     */
    public int getInstancesCount() {
      return instances_.size();
    }
    /**
     * <pre>
     * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     * @param index The index of the element to return.
     * @return The instances at the given index.
     */
    public java.lang.String getInstances(int index) {
      return instances_.get(index);
    }
    /**
     * <pre>
     * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     * @param index The index of the value to return.
     * @return The bytes of the instances at the given index.
     */
    public com.google.protobuf.ByteString
        getInstancesBytes(int index) {
      return instances_.getByteString(index);
    }
    /**
     * <pre>
     * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     * @param index The index to set the value at.
     * @param value The instances to set.
     * @return This builder for chaining.
     */
    public Builder setInstances(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureInstancesIsMutable();
      instances_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     * @param value The instances to add.
     * @return This builder for chaining.
     */
    public Builder addInstances(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureInstancesIsMutable();
      instances_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     * @param values The instances to add.
     * @return This builder for chaining.
     */
    public Builder addAllInstances(
        java.lang.Iterable<java.lang.String> values) {
      ensureInstancesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, instances_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstances() {
      instances_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
     * </pre>
     *
     * <code>repeated string instances = 29097598;</code>
     * @param value The bytes of the instances to add.
     * @return This builder for chaining.
     */
    public Builder addInstancesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureInstancesIsMutable();
      instances_.add(value);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest)
  private static final com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest();
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegionInstanceGroupManagersAbandonInstancesRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegionInstanceGroupManagersAbandonInstancesRequest>() {
    @java.lang.Override
    public RegionInstanceGroupManagersAbandonInstancesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegionInstanceGroupManagersAbandonInstancesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegionInstanceGroupManagersAbandonInstancesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegionInstanceGroupManagersAbandonInstancesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

