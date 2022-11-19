// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest}
 */
public final class RegionInstanceGroupManagersDeleteInstancesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest)
    RegionInstanceGroupManagersDeleteInstancesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegionInstanceGroupManagersDeleteInstancesRequest.newBuilder() to construct.
  private RegionInstanceGroupManagersDeleteInstancesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegionInstanceGroupManagersDeleteInstancesRequest() {
    instances_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegionInstanceGroupManagersDeleteInstancesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersDeleteInstancesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersDeleteInstancesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest.class, com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int INSTANCES_FIELD_NUMBER = 29097598;
  private com.google.protobuf.LazyStringList instances_;
  /**
   * <pre>
   * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
   * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
   * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
   * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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

  public static final int SKIP_INSTANCES_ON_VALIDATION_ERROR_FIELD_NUMBER = 40631073;
  private boolean skipInstancesOnValidationError_;
  /**
   * <pre>
   * Specifies whether the request should proceed despite the inclusion of instances that are not members of the group or that are already in the process of being deleted or abandoned. If this field is set to `false` and such an instance is specified in the request, the operation fails. The operation always fails if the request contains a malformed instance URL or a reference to an instance that exists in a zone or region other than the group's zone or region.
   * </pre>
   *
   * <code>optional bool skip_instances_on_validation_error = 40631073;</code>
   * @return Whether the skipInstancesOnValidationError field is set.
   */
  @java.lang.Override
  public boolean hasSkipInstancesOnValidationError() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Specifies whether the request should proceed despite the inclusion of instances that are not members of the group or that are already in the process of being deleted or abandoned. If this field is set to `false` and such an instance is specified in the request, the operation fails. The operation always fails if the request contains a malformed instance URL or a reference to an instance that exists in a zone or region other than the group's zone or region.
   * </pre>
   *
   * <code>optional bool skip_instances_on_validation_error = 40631073;</code>
   * @return The skipInstancesOnValidationError.
   */
  @java.lang.Override
  public boolean getSkipInstancesOnValidationError() {
    return skipInstancesOnValidationError_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(40631073, skipInstancesOnValidationError_);
    }
    getUnknownFields().writeTo(output);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(40631073, skipInstancesOnValidationError_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest other = (com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest) obj;

    if (!getInstancesList()
        .equals(other.getInstancesList())) return false;
    if (hasSkipInstancesOnValidationError() != other.hasSkipInstancesOnValidationError()) return false;
    if (hasSkipInstancesOnValidationError()) {
      if (getSkipInstancesOnValidationError()
          != other.getSkipInstancesOnValidationError()) return false;
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
    if (getInstancesCount() > 0) {
      hash = (37 * hash) + INSTANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInstancesList().hashCode();
    }
    if (hasSkipInstancesOnValidationError()) {
      hash = (37 * hash) + SKIP_INSTANCES_ON_VALIDATION_ERROR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSkipInstancesOnValidationError());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest)
      com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersDeleteInstancesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersDeleteInstancesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest.class, com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      instances_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      skipInstancesOnValidationError_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersDeleteInstancesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest build() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest buildPartial() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest result = new com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        instances_ = instances_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.instances_ = instances_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.skipInstancesOnValidationError_ = skipInstancesOnValidationError_;
        to_bitField0_ |= 0x00000001;
      }
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
      if (other instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest) {
        return mergeFrom((com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest other) {
      if (other == com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest.getDefaultInstance()) return this;
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
      if (other.hasSkipInstancesOnValidationError()) {
        setSkipInstancesOnValidationError(other.getSkipInstancesOnValidationError());
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
            case 232780786: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureInstancesIsMutable();
              instances_.add(s);
              break;
            } // case 232780786
            case 325048584: {
              skipInstancesOnValidationError_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 325048584
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

    private com.google.protobuf.LazyStringList instances_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureInstancesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        instances_ = new com.google.protobuf.LazyStringArrayList(instances_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
     * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
     * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
     * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
     * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
     * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
     * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
     * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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
     * The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
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

    private boolean skipInstancesOnValidationError_ ;
    /**
     * <pre>
     * Specifies whether the request should proceed despite the inclusion of instances that are not members of the group or that are already in the process of being deleted or abandoned. If this field is set to `false` and such an instance is specified in the request, the operation fails. The operation always fails if the request contains a malformed instance URL or a reference to an instance that exists in a zone or region other than the group's zone or region.
     * </pre>
     *
     * <code>optional bool skip_instances_on_validation_error = 40631073;</code>
     * @return Whether the skipInstancesOnValidationError field is set.
     */
    @java.lang.Override
    public boolean hasSkipInstancesOnValidationError() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Specifies whether the request should proceed despite the inclusion of instances that are not members of the group or that are already in the process of being deleted or abandoned. If this field is set to `false` and such an instance is specified in the request, the operation fails. The operation always fails if the request contains a malformed instance URL or a reference to an instance that exists in a zone or region other than the group's zone or region.
     * </pre>
     *
     * <code>optional bool skip_instances_on_validation_error = 40631073;</code>
     * @return The skipInstancesOnValidationError.
     */
    @java.lang.Override
    public boolean getSkipInstancesOnValidationError() {
      return skipInstancesOnValidationError_;
    }
    /**
     * <pre>
     * Specifies whether the request should proceed despite the inclusion of instances that are not members of the group or that are already in the process of being deleted or abandoned. If this field is set to `false` and such an instance is specified in the request, the operation fails. The operation always fails if the request contains a malformed instance URL or a reference to an instance that exists in a zone or region other than the group's zone or region.
     * </pre>
     *
     * <code>optional bool skip_instances_on_validation_error = 40631073;</code>
     * @param value The skipInstancesOnValidationError to set.
     * @return This builder for chaining.
     */
    public Builder setSkipInstancesOnValidationError(boolean value) {
      bitField0_ |= 0x00000002;
      skipInstancesOnValidationError_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies whether the request should proceed despite the inclusion of instances that are not members of the group or that are already in the process of being deleted or abandoned. If this field is set to `false` and such an instance is specified in the request, the operation fails. The operation always fails if the request contains a malformed instance URL or a reference to an instance that exists in a zone or region other than the group's zone or region.
     * </pre>
     *
     * <code>optional bool skip_instances_on_validation_error = 40631073;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkipInstancesOnValidationError() {
      bitField0_ = (bitField0_ & ~0x00000002);
      skipInstancesOnValidationError_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest)
  private static final com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest();
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegionInstanceGroupManagersDeleteInstancesRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegionInstanceGroupManagersDeleteInstancesRequest>() {
    @java.lang.Override
    public RegionInstanceGroupManagersDeleteInstancesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegionInstanceGroupManagersDeleteInstancesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegionInstanceGroupManagersDeleteInstancesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

