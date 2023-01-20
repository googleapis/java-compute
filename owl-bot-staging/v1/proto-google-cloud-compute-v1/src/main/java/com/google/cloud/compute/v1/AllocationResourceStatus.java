// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.AllocationResourceStatus}
 */
public final class AllocationResourceStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AllocationResourceStatus)
    AllocationResourceStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllocationResourceStatus.newBuilder() to construct.
  private AllocationResourceStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllocationResourceStatus() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AllocationResourceStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationResourceStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationResourceStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AllocationResourceStatus.class, com.google.cloud.compute.v1.AllocationResourceStatus.Builder.class);
  }

  private int bitField0_;
  public static final int SPECIFIC_SKU_ALLOCATION_FIELD_NUMBER = 196231151;
  private com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specificSkuAllocation_;
  /**
   * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
   * @return Whether the specificSkuAllocation field is set.
   */
  @java.lang.Override
  public boolean hasSpecificSkuAllocation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
   * @return The specificSkuAllocation.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation getSpecificSkuAllocation() {
    return specificSkuAllocation_ == null ? com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.getDefaultInstance() : specificSkuAllocation_;
  }
  /**
   * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocationOrBuilder getSpecificSkuAllocationOrBuilder() {
    return specificSkuAllocation_ == null ? com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.getDefaultInstance() : specificSkuAllocation_;
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
      output.writeMessage(196231151, getSpecificSkuAllocation());
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
        .computeMessageSize(196231151, getSpecificSkuAllocation());
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
    if (!(obj instanceof com.google.cloud.compute.v1.AllocationResourceStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AllocationResourceStatus other = (com.google.cloud.compute.v1.AllocationResourceStatus) obj;

    if (hasSpecificSkuAllocation() != other.hasSpecificSkuAllocation()) return false;
    if (hasSpecificSkuAllocation()) {
      if (!getSpecificSkuAllocation()
          .equals(other.getSpecificSkuAllocation())) return false;
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
    if (hasSpecificSkuAllocation()) {
      hash = (37 * hash) + SPECIFIC_SKU_ALLOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getSpecificSkuAllocation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AllocationResourceStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.AllocationResourceStatus parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.AllocationResourceStatus prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.AllocationResourceStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AllocationResourceStatus)
      com.google.cloud.compute.v1.AllocationResourceStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationResourceStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationResourceStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AllocationResourceStatus.class, com.google.cloud.compute.v1.AllocationResourceStatus.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AllocationResourceStatus.newBuilder()
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
        getSpecificSkuAllocationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      specificSkuAllocation_ = null;
      if (specificSkuAllocationBuilder_ != null) {
        specificSkuAllocationBuilder_.dispose();
        specificSkuAllocationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_AllocationResourceStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationResourceStatus getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AllocationResourceStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationResourceStatus build() {
      com.google.cloud.compute.v1.AllocationResourceStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AllocationResourceStatus buildPartial() {
      com.google.cloud.compute.v1.AllocationResourceStatus result = new com.google.cloud.compute.v1.AllocationResourceStatus(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.AllocationResourceStatus result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.specificSkuAllocation_ = specificSkuAllocationBuilder_ == null
            ? specificSkuAllocation_
            : specificSkuAllocationBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.AllocationResourceStatus) {
        return mergeFrom((com.google.cloud.compute.v1.AllocationResourceStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AllocationResourceStatus other) {
      if (other == com.google.cloud.compute.v1.AllocationResourceStatus.getDefaultInstance()) return this;
      if (other.hasSpecificSkuAllocation()) {
        mergeSpecificSkuAllocation(other.getSpecificSkuAllocation());
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
            case 1569849210: {
              input.readMessage(
                  getSpecificSkuAllocationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 1569849210
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

    private com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specificSkuAllocation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation, com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.Builder, com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocationOrBuilder> specificSkuAllocationBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
     * @return Whether the specificSkuAllocation field is set.
     */
    public boolean hasSpecificSkuAllocation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
     * @return The specificSkuAllocation.
     */
    public com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation getSpecificSkuAllocation() {
      if (specificSkuAllocationBuilder_ == null) {
        return specificSkuAllocation_ == null ? com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.getDefaultInstance() : specificSkuAllocation_;
      } else {
        return specificSkuAllocationBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
     */
    public Builder setSpecificSkuAllocation(com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation value) {
      if (specificSkuAllocationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        specificSkuAllocation_ = value;
      } else {
        specificSkuAllocationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
     */
    public Builder setSpecificSkuAllocation(
        com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.Builder builderForValue) {
      if (specificSkuAllocationBuilder_ == null) {
        specificSkuAllocation_ = builderForValue.build();
      } else {
        specificSkuAllocationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
     */
    public Builder mergeSpecificSkuAllocation(com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation value) {
      if (specificSkuAllocationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          specificSkuAllocation_ != null &&
          specificSkuAllocation_ != com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.getDefaultInstance()) {
          getSpecificSkuAllocationBuilder().mergeFrom(value);
        } else {
          specificSkuAllocation_ = value;
        }
      } else {
        specificSkuAllocationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
     */
    public Builder clearSpecificSkuAllocation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      specificSkuAllocation_ = null;
      if (specificSkuAllocationBuilder_ != null) {
        specificSkuAllocationBuilder_.dispose();
        specificSkuAllocationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
     */
    public com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.Builder getSpecificSkuAllocationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSpecificSkuAllocationFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
     */
    public com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocationOrBuilder getSpecificSkuAllocationOrBuilder() {
      if (specificSkuAllocationBuilder_ != null) {
        return specificSkuAllocationBuilder_.getMessageOrBuilder();
      } else {
        return specificSkuAllocation_ == null ?
            com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.getDefaultInstance() : specificSkuAllocation_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation specific_sku_allocation = 196231151;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation, com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.Builder, com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocationOrBuilder> 
        getSpecificSkuAllocationFieldBuilder() {
      if (specificSkuAllocationBuilder_ == null) {
        specificSkuAllocationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation, com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocation.Builder, com.google.cloud.compute.v1.AllocationResourceStatusSpecificSKUAllocationOrBuilder>(
                getSpecificSkuAllocation(),
                getParentForChildren(),
                isClean());
        specificSkuAllocation_ = null;
      }
      return specificSkuAllocationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AllocationResourceStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AllocationResourceStatus)
  private static final com.google.cloud.compute.v1.AllocationResourceStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AllocationResourceStatus();
  }

  public static com.google.cloud.compute.v1.AllocationResourceStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllocationResourceStatus>
      PARSER = new com.google.protobuf.AbstractParser<AllocationResourceStatus>() {
    @java.lang.Override
    public AllocationResourceStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<AllocationResourceStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllocationResourceStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AllocationResourceStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
