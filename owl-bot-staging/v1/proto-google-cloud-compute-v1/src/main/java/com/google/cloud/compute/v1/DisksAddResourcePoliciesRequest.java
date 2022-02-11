// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.DisksAddResourcePoliciesRequest}
 */
public final class DisksAddResourcePoliciesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.DisksAddResourcePoliciesRequest)
    DisksAddResourcePoliciesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DisksAddResourcePoliciesRequest.newBuilder() to construct.
  private DisksAddResourcePoliciesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DisksAddResourcePoliciesRequest() {
    resourcePolicies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DisksAddResourcePoliciesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DisksAddResourcePoliciesRequest(
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
          case 177763082: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              resourcePolicies_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            resourcePolicies_.add(s);
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
        resourcePolicies_ = resourcePolicies_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_DisksAddResourcePoliciesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_DisksAddResourcePoliciesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest.class, com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest.Builder.class);
  }

  public static final int RESOURCE_POLICIES_FIELD_NUMBER = 22220385;
  private com.google.protobuf.LazyStringList resourcePolicies_;
  /**
   * <pre>
   * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   * @return A list containing the resourcePolicies.
   */
  public com.google.protobuf.ProtocolStringList
      getResourcePoliciesList() {
    return resourcePolicies_;
  }
  /**
   * <pre>
   * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   * @return The count of resourcePolicies.
   */
  public int getResourcePoliciesCount() {
    return resourcePolicies_.size();
  }
  /**
   * <pre>
   * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   * @param index The index of the element to return.
   * @return The resourcePolicies at the given index.
   */
  public java.lang.String getResourcePolicies(int index) {
    return resourcePolicies_.get(index);
  }
  /**
   * <pre>
   * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   * @param index The index of the value to return.
   * @return The bytes of the resourcePolicies at the given index.
   */
  public com.google.protobuf.ByteString
      getResourcePoliciesBytes(int index) {
    return resourcePolicies_.getByteString(index);
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
    for (int i = 0; i < resourcePolicies_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 22220385, resourcePolicies_.getRaw(i));
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
      for (int i = 0; i < resourcePolicies_.size(); i++) {
        dataSize += computeStringSizeNoTag(resourcePolicies_.getRaw(i));
      }
      size += dataSize;
      size += 4 * getResourcePoliciesList().size();
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
    if (!(obj instanceof com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest other = (com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest) obj;

    if (!getResourcePoliciesList()
        .equals(other.getResourcePoliciesList())) return false;
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
    if (getResourcePoliciesCount() > 0) {
      hash = (37 * hash) + RESOURCE_POLICIES_FIELD_NUMBER;
      hash = (53 * hash) + getResourcePoliciesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.DisksAddResourcePoliciesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.DisksAddResourcePoliciesRequest)
      com.google.cloud.compute.v1.DisksAddResourcePoliciesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_DisksAddResourcePoliciesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_DisksAddResourcePoliciesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest.class, com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest.newBuilder()
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
      resourcePolicies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_DisksAddResourcePoliciesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest build() {
      com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest buildPartial() {
      com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest result = new com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        resourcePolicies_ = resourcePolicies_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.resourcePolicies_ = resourcePolicies_;
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
      if (other instanceof com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest) {
        return mergeFrom((com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest other) {
      if (other == com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest.getDefaultInstance()) return this;
      if (!other.resourcePolicies_.isEmpty()) {
        if (resourcePolicies_.isEmpty()) {
          resourcePolicies_ = other.resourcePolicies_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureResourcePoliciesIsMutable();
          resourcePolicies_.addAll(other.resourcePolicies_);
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
      com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList resourcePolicies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureResourcePoliciesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        resourcePolicies_ = new com.google.protobuf.LazyStringArrayList(resourcePolicies_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
     * </pre>
     *
     * <code>repeated string resource_policies = 22220385;</code>
     * @return A list containing the resourcePolicies.
     */
    public com.google.protobuf.ProtocolStringList
        getResourcePoliciesList() {
      return resourcePolicies_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
     * </pre>
     *
     * <code>repeated string resource_policies = 22220385;</code>
     * @return The count of resourcePolicies.
     */
    public int getResourcePoliciesCount() {
      return resourcePolicies_.size();
    }
    /**
     * <pre>
     * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
     * </pre>
     *
     * <code>repeated string resource_policies = 22220385;</code>
     * @param index The index of the element to return.
     * @return The resourcePolicies at the given index.
     */
    public java.lang.String getResourcePolicies(int index) {
      return resourcePolicies_.get(index);
    }
    /**
     * <pre>
     * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
     * </pre>
     *
     * <code>repeated string resource_policies = 22220385;</code>
     * @param index The index of the value to return.
     * @return The bytes of the resourcePolicies at the given index.
     */
    public com.google.protobuf.ByteString
        getResourcePoliciesBytes(int index) {
      return resourcePolicies_.getByteString(index);
    }
    /**
     * <pre>
     * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
     * </pre>
     *
     * <code>repeated string resource_policies = 22220385;</code>
     * @param index The index to set the value at.
     * @param value The resourcePolicies to set.
     * @return This builder for chaining.
     */
    public Builder setResourcePolicies(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureResourcePoliciesIsMutable();
      resourcePolicies_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
     * </pre>
     *
     * <code>repeated string resource_policies = 22220385;</code>
     * @param value The resourcePolicies to add.
     * @return This builder for chaining.
     */
    public Builder addResourcePolicies(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureResourcePoliciesIsMutable();
      resourcePolicies_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
     * </pre>
     *
     * <code>repeated string resource_policies = 22220385;</code>
     * @param values The resourcePolicies to add.
     * @return This builder for chaining.
     */
    public Builder addAllResourcePolicies(
        java.lang.Iterable<java.lang.String> values) {
      ensureResourcePoliciesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, resourcePolicies_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
     * </pre>
     *
     * <code>repeated string resource_policies = 22220385;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourcePolicies() {
      resourcePolicies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
     * </pre>
     *
     * <code>repeated string resource_policies = 22220385;</code>
     * @param value The bytes of the resourcePolicies to add.
     * @return This builder for chaining.
     */
    public Builder addResourcePoliciesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureResourcePoliciesIsMutable();
      resourcePolicies_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.DisksAddResourcePoliciesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.DisksAddResourcePoliciesRequest)
  private static final com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest();
  }

  public static com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DisksAddResourcePoliciesRequest>
      PARSER = new com.google.protobuf.AbstractParser<DisksAddResourcePoliciesRequest>() {
    @java.lang.Override
    public DisksAddResourcePoliciesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DisksAddResourcePoliciesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DisksAddResourcePoliciesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DisksAddResourcePoliciesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

