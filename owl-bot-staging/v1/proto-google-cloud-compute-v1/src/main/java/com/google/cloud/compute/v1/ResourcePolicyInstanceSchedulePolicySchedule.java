// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Schedule for an instance operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule}
 */
public final class ResourcePolicyInstanceSchedulePolicySchedule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule)
    ResourcePolicyInstanceSchedulePolicyScheduleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourcePolicyInstanceSchedulePolicySchedule.newBuilder() to construct.
  private ResourcePolicyInstanceSchedulePolicySchedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourcePolicyInstanceSchedulePolicySchedule() {
    schedule_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourcePolicyInstanceSchedulePolicySchedule();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyInstanceSchedulePolicySchedule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyInstanceSchedulePolicySchedule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule.class, com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule.Builder.class);
  }

  private int bitField0_;
  public static final int SCHEDULE_FIELD_NUMBER = 375820951;
  @SuppressWarnings("serial")
  private volatile java.lang.Object schedule_ = "";
  /**
   * <pre>
   * Specifies the frequency for the operation, using the unix-cron format.
   * </pre>
   *
   * <code>optional string schedule = 375820951;</code>
   * @return Whether the schedule field is set.
   */
  @java.lang.Override
  public boolean hasSchedule() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Specifies the frequency for the operation, using the unix-cron format.
   * </pre>
   *
   * <code>optional string schedule = 375820951;</code>
   * @return The schedule.
   */
  @java.lang.Override
  public java.lang.String getSchedule() {
    java.lang.Object ref = schedule_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schedule_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the frequency for the operation, using the unix-cron format.
   * </pre>
   *
   * <code>optional string schedule = 375820951;</code>
   * @return The bytes for schedule.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScheduleBytes() {
    java.lang.Object ref = schedule_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      schedule_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 375820951, schedule_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(375820951, schedule_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule other = (com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule) obj;

    if (hasSchedule() != other.hasSchedule()) return false;
    if (hasSchedule()) {
      if (!getSchedule()
          .equals(other.getSchedule())) return false;
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
    if (hasSchedule()) {
      hash = (37 * hash) + SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getSchedule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule prototype) {
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
   * Schedule for an instance operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule)
      com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicyScheduleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyInstanceSchedulePolicySchedule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyInstanceSchedulePolicySchedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule.class, com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      schedule_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyInstanceSchedulePolicySchedule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule build() {
      com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule buildPartial() {
      com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule result = new com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schedule_ = schedule_;
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
      if (other instanceof com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule) {
        return mergeFrom((com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule other) {
      if (other == com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule.getDefaultInstance()) return this;
      if (other.hasSchedule()) {
        schedule_ = other.schedule_;
        bitField0_ |= 0x00000001;
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
            case -1288399686: {
              schedule_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -1288399686
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

    private java.lang.Object schedule_ = "";
    /**
     * <pre>
     * Specifies the frequency for the operation, using the unix-cron format.
     * </pre>
     *
     * <code>optional string schedule = 375820951;</code>
     * @return Whether the schedule field is set.
     */
    public boolean hasSchedule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Specifies the frequency for the operation, using the unix-cron format.
     * </pre>
     *
     * <code>optional string schedule = 375820951;</code>
     * @return The schedule.
     */
    public java.lang.String getSchedule() {
      java.lang.Object ref = schedule_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schedule_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the frequency for the operation, using the unix-cron format.
     * </pre>
     *
     * <code>optional string schedule = 375820951;</code>
     * @return The bytes for schedule.
     */
    public com.google.protobuf.ByteString
        getScheduleBytes() {
      java.lang.Object ref = schedule_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        schedule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the frequency for the operation, using the unix-cron format.
     * </pre>
     *
     * <code>optional string schedule = 375820951;</code>
     * @param value The schedule to set.
     * @return This builder for chaining.
     */
    public Builder setSchedule(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      schedule_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the frequency for the operation, using the unix-cron format.
     * </pre>
     *
     * <code>optional string schedule = 375820951;</code>
     * @return This builder for chaining.
     */
    public Builder clearSchedule() {
      schedule_ = getDefaultInstance().getSchedule();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the frequency for the operation, using the unix-cron format.
     * </pre>
     *
     * <code>optional string schedule = 375820951;</code>
     * @param value The bytes for schedule to set.
     * @return This builder for chaining.
     */
    public Builder setScheduleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      schedule_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule)
  private static final com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule();
  }

  public static com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourcePolicyInstanceSchedulePolicySchedule>
      PARSER = new com.google.protobuf.AbstractParser<ResourcePolicyInstanceSchedulePolicySchedule>() {
    @java.lang.Override
    public ResourcePolicyInstanceSchedulePolicySchedule parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourcePolicyInstanceSchedulePolicySchedule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourcePolicyInstanceSchedulePolicySchedule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

