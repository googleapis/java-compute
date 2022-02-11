// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.LocalDisk}
 */
public final class LocalDisk extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.LocalDisk)
    LocalDiskOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocalDisk.newBuilder() to construct.
  private LocalDisk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocalDisk() {
    diskType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocalDisk();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LocalDisk(
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
          case 744072418: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000004;
            diskType_ = s;
            break;
          }
          case 1463467880: {
            bitField0_ |= 0x00000001;
            diskCount_ = input.readInt32();
            break;
          }
          case -1764857416: {
            bitField0_ |= 0x00000002;
            diskSizeGb_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LocalDisk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LocalDisk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.LocalDisk.class, com.google.cloud.compute.v1.LocalDisk.Builder.class);
  }

  private int bitField0_;
  public static final int DISK_COUNT_FIELD_NUMBER = 182933485;
  private int diskCount_;
  /**
   * <pre>
   * Specifies the number of such disks.
   * </pre>
   *
   * <code>optional int32 disk_count = 182933485;</code>
   * @return Whether the diskCount field is set.
   */
  @java.lang.Override
  public boolean hasDiskCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Specifies the number of such disks.
   * </pre>
   *
   * <code>optional int32 disk_count = 182933485;</code>
   * @return The diskCount.
   */
  @java.lang.Override
  public int getDiskCount() {
    return diskCount_;
  }

  public static final int DISK_SIZE_GB_FIELD_NUMBER = 316263735;
  private int diskSizeGb_;
  /**
   * <pre>
   * Specifies the size of the disk in base-2 GB.
   * </pre>
   *
   * <code>optional int32 disk_size_gb = 316263735;</code>
   * @return Whether the diskSizeGb field is set.
   */
  @java.lang.Override
  public boolean hasDiskSizeGb() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Specifies the size of the disk in base-2 GB.
   * </pre>
   *
   * <code>optional int32 disk_size_gb = 316263735;</code>
   * @return The diskSizeGb.
   */
  @java.lang.Override
  public int getDiskSizeGb() {
    return diskSizeGb_;
  }

  public static final int DISK_TYPE_FIELD_NUMBER = 93009052;
  private volatile java.lang.Object diskType_;
  /**
   * <pre>
   * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
   * </pre>
   *
   * <code>optional string disk_type = 93009052;</code>
   * @return Whether the diskType field is set.
   */
  @java.lang.Override
  public boolean hasDiskType() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
   * </pre>
   *
   * <code>optional string disk_type = 93009052;</code>
   * @return The diskType.
   */
  @java.lang.Override
  public java.lang.String getDiskType() {
    java.lang.Object ref = diskType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diskType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
   * </pre>
   *
   * <code>optional string disk_type = 93009052;</code>
   * @return The bytes for diskType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDiskTypeBytes() {
    java.lang.Object ref = diskType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      diskType_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 93009052, diskType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(182933485, diskCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(316263735, diskSizeGb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(93009052, diskType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(182933485, diskCount_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(316263735, diskSizeGb_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.LocalDisk)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.LocalDisk other = (com.google.cloud.compute.v1.LocalDisk) obj;

    if (hasDiskCount() != other.hasDiskCount()) return false;
    if (hasDiskCount()) {
      if (getDiskCount()
          != other.getDiskCount()) return false;
    }
    if (hasDiskSizeGb() != other.hasDiskSizeGb()) return false;
    if (hasDiskSizeGb()) {
      if (getDiskSizeGb()
          != other.getDiskSizeGb()) return false;
    }
    if (hasDiskType() != other.hasDiskType()) return false;
    if (hasDiskType()) {
      if (!getDiskType()
          .equals(other.getDiskType())) return false;
    }
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
    if (hasDiskCount()) {
      hash = (37 * hash) + DISK_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getDiskCount();
    }
    if (hasDiskSizeGb()) {
      hash = (37 * hash) + DISK_SIZE_GB_FIELD_NUMBER;
      hash = (53 * hash) + getDiskSizeGb();
    }
    if (hasDiskType()) {
      hash = (37 * hash) + DISK_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getDiskType().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.LocalDisk parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LocalDisk parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.LocalDisk prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.LocalDisk}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.LocalDisk)
      com.google.cloud.compute.v1.LocalDiskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LocalDisk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LocalDisk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.LocalDisk.class, com.google.cloud.compute.v1.LocalDisk.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.LocalDisk.newBuilder()
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
      diskCount_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      diskSizeGb_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      diskType_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LocalDisk_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LocalDisk getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.LocalDisk.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LocalDisk build() {
      com.google.cloud.compute.v1.LocalDisk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LocalDisk buildPartial() {
      com.google.cloud.compute.v1.LocalDisk result = new com.google.cloud.compute.v1.LocalDisk(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.diskCount_ = diskCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.diskSizeGb_ = diskSizeGb_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.diskType_ = diskType_;
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
      if (other instanceof com.google.cloud.compute.v1.LocalDisk) {
        return mergeFrom((com.google.cloud.compute.v1.LocalDisk)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.LocalDisk other) {
      if (other == com.google.cloud.compute.v1.LocalDisk.getDefaultInstance()) return this;
      if (other.hasDiskCount()) {
        setDiskCount(other.getDiskCount());
      }
      if (other.hasDiskSizeGb()) {
        setDiskSizeGb(other.getDiskSizeGb());
      }
      if (other.hasDiskType()) {
        bitField0_ |= 0x00000004;
        diskType_ = other.diskType_;
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
      com.google.cloud.compute.v1.LocalDisk parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.LocalDisk) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int diskCount_ ;
    /**
     * <pre>
     * Specifies the number of such disks.
     * </pre>
     *
     * <code>optional int32 disk_count = 182933485;</code>
     * @return Whether the diskCount field is set.
     */
    @java.lang.Override
    public boolean hasDiskCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Specifies the number of such disks.
     * </pre>
     *
     * <code>optional int32 disk_count = 182933485;</code>
     * @return The diskCount.
     */
    @java.lang.Override
    public int getDiskCount() {
      return diskCount_;
    }
    /**
     * <pre>
     * Specifies the number of such disks.
     * </pre>
     *
     * <code>optional int32 disk_count = 182933485;</code>
     * @param value The diskCount to set.
     * @return This builder for chaining.
     */
    public Builder setDiskCount(int value) {
      bitField0_ |= 0x00000001;
      diskCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the number of such disks.
     * </pre>
     *
     * <code>optional int32 disk_count = 182933485;</code>
     * @return This builder for chaining.
     */
    public Builder clearDiskCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      diskCount_ = 0;
      onChanged();
      return this;
    }

    private int diskSizeGb_ ;
    /**
     * <pre>
     * Specifies the size of the disk in base-2 GB.
     * </pre>
     *
     * <code>optional int32 disk_size_gb = 316263735;</code>
     * @return Whether the diskSizeGb field is set.
     */
    @java.lang.Override
    public boolean hasDiskSizeGb() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Specifies the size of the disk in base-2 GB.
     * </pre>
     *
     * <code>optional int32 disk_size_gb = 316263735;</code>
     * @return The diskSizeGb.
     */
    @java.lang.Override
    public int getDiskSizeGb() {
      return diskSizeGb_;
    }
    /**
     * <pre>
     * Specifies the size of the disk in base-2 GB.
     * </pre>
     *
     * <code>optional int32 disk_size_gb = 316263735;</code>
     * @param value The diskSizeGb to set.
     * @return This builder for chaining.
     */
    public Builder setDiskSizeGb(int value) {
      bitField0_ |= 0x00000002;
      diskSizeGb_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the size of the disk in base-2 GB.
     * </pre>
     *
     * <code>optional int32 disk_size_gb = 316263735;</code>
     * @return This builder for chaining.
     */
    public Builder clearDiskSizeGb() {
      bitField0_ = (bitField0_ & ~0x00000002);
      diskSizeGb_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object diskType_ = "";
    /**
     * <pre>
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * </pre>
     *
     * <code>optional string disk_type = 93009052;</code>
     * @return Whether the diskType field is set.
     */
    public boolean hasDiskType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * </pre>
     *
     * <code>optional string disk_type = 93009052;</code>
     * @return The diskType.
     */
    public java.lang.String getDiskType() {
      java.lang.Object ref = diskType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diskType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * </pre>
     *
     * <code>optional string disk_type = 93009052;</code>
     * @return The bytes for diskType.
     */
    public com.google.protobuf.ByteString
        getDiskTypeBytes() {
      java.lang.Object ref = diskType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        diskType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * </pre>
     *
     * <code>optional string disk_type = 93009052;</code>
     * @param value The diskType to set.
     * @return This builder for chaining.
     */
    public Builder setDiskType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      diskType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * </pre>
     *
     * <code>optional string disk_type = 93009052;</code>
     * @return This builder for chaining.
     */
    public Builder clearDiskType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      diskType_ = getDefaultInstance().getDiskType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * </pre>
     *
     * <code>optional string disk_type = 93009052;</code>
     * @param value The bytes for diskType to set.
     * @return This builder for chaining.
     */
    public Builder setDiskTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      diskType_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.LocalDisk)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.LocalDisk)
  private static final com.google.cloud.compute.v1.LocalDisk DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.LocalDisk();
  }

  public static com.google.cloud.compute.v1.LocalDisk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocalDisk>
      PARSER = new com.google.protobuf.AbstractParser<LocalDisk>() {
    @java.lang.Override
    public LocalDisk parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LocalDisk(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocalDisk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalDisk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.LocalDisk getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

