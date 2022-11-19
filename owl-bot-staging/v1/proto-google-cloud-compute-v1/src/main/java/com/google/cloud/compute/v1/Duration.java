// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * A Duration represents a fixed-length span of time represented as a count of seconds and fractions of seconds at nanosecond resolution. It is independent of any calendar and concepts like "day" or "month". Range is approximately 10,000 years.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.Duration}
 */
public final class Duration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.Duration)
    DurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Duration.newBuilder() to construct.
  private Duration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Duration() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Duration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Duration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Duration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.Duration.class, com.google.cloud.compute.v1.Duration.Builder.class);
  }

  private int bitField0_;
  public static final int NANOS_FIELD_NUMBER = 104586303;
  private int nanos_;
  /**
   * <pre>
   * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are represented with a 0 `seconds` field and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 104586303;</code>
   * @return Whether the nanos field is set.
   */
  @java.lang.Override
  public boolean hasNanos() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are represented with a 0 `seconds` field and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
   * </pre>
   *
   * <code>optional int32 nanos = 104586303;</code>
   * @return The nanos.
   */
  @java.lang.Override
  public int getNanos() {
    return nanos_;
  }

  public static final int SECONDS_FIELD_NUMBER = 359484031;
  private long seconds_;
  /**
   * <pre>
   * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
   * </pre>
   *
   * <code>optional int64 seconds = 359484031;</code>
   * @return Whether the seconds field is set.
   */
  @java.lang.Override
  public boolean hasSeconds() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
   * </pre>
   *
   * <code>optional int64 seconds = 359484031;</code>
   * @return The seconds.
   */
  @java.lang.Override
  public long getSeconds() {
    return seconds_;
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
      output.writeInt32(104586303, nanos_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(359484031, seconds_);
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
        .computeInt32Size(104586303, nanos_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(359484031, seconds_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.Duration)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.Duration other = (com.google.cloud.compute.v1.Duration) obj;

    if (hasNanos() != other.hasNanos()) return false;
    if (hasNanos()) {
      if (getNanos()
          != other.getNanos()) return false;
    }
    if (hasSeconds() != other.hasSeconds()) return false;
    if (hasSeconds()) {
      if (getSeconds()
          != other.getSeconds()) return false;
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
    if (hasNanos()) {
      hash = (37 * hash) + NANOS_FIELD_NUMBER;
      hash = (53 * hash) + getNanos();
    }
    if (hasSeconds()) {
      hash = (37 * hash) + SECONDS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSeconds());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.Duration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Duration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Duration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Duration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Duration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Duration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Duration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.Duration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Duration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.Duration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Duration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.Duration parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.Duration prototype) {
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
   * A Duration represents a fixed-length span of time represented as a count of seconds and fractions of seconds at nanosecond resolution. It is independent of any calendar and concepts like "day" or "month". Range is approximately 10,000 years.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.Duration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.Duration)
      com.google.cloud.compute.v1.DurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Duration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Duration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.Duration.class, com.google.cloud.compute.v1.Duration.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.Duration.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      nanos_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      seconds_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Duration_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Duration getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.Duration.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Duration build() {
      com.google.cloud.compute.v1.Duration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Duration buildPartial() {
      com.google.cloud.compute.v1.Duration result = new com.google.cloud.compute.v1.Duration(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nanos_ = nanos_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.seconds_ = seconds_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.compute.v1.Duration) {
        return mergeFrom((com.google.cloud.compute.v1.Duration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.Duration other) {
      if (other == com.google.cloud.compute.v1.Duration.getDefaultInstance()) return this;
      if (other.hasNanos()) {
        setNanos(other.getNanos());
      }
      if (other.hasSeconds()) {
        setSeconds(other.getSeconds());
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
            case 836690424: {
              nanos_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 836690424
            case -1419095048: {
              seconds_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case -1419095048
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

    private int nanos_ ;
    /**
     * <pre>
     * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are represented with a 0 `seconds` field and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 104586303;</code>
     * @return Whether the nanos field is set.
     */
    @java.lang.Override
    public boolean hasNanos() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are represented with a 0 `seconds` field and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 104586303;</code>
     * @return The nanos.
     */
    @java.lang.Override
    public int getNanos() {
      return nanos_;
    }
    /**
     * <pre>
     * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are represented with a 0 `seconds` field and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 104586303;</code>
     * @param value The nanos to set.
     * @return This builder for chaining.
     */
    public Builder setNanos(int value) {
      bitField0_ |= 0x00000001;
      nanos_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are represented with a 0 `seconds` field and a positive `nanos` field. Must be from 0 to 999,999,999 inclusive.
     * </pre>
     *
     * <code>optional int32 nanos = 104586303;</code>
     * @return This builder for chaining.
     */
    public Builder clearNanos() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nanos_ = 0;
      onChanged();
      return this;
    }

    private long seconds_ ;
    /**
     * <pre>
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * </pre>
     *
     * <code>optional int64 seconds = 359484031;</code>
     * @return Whether the seconds field is set.
     */
    @java.lang.Override
    public boolean hasSeconds() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * </pre>
     *
     * <code>optional int64 seconds = 359484031;</code>
     * @return The seconds.
     */
    @java.lang.Override
    public long getSeconds() {
      return seconds_;
    }
    /**
     * <pre>
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * </pre>
     *
     * <code>optional int64 seconds = 359484031;</code>
     * @param value The seconds to set.
     * @return This builder for chaining.
     */
    public Builder setSeconds(long value) {
      bitField0_ |= 0x00000002;
      seconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * </pre>
     *
     * <code>optional int64 seconds = 359484031;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeconds() {
      bitField0_ = (bitField0_ & ~0x00000002);
      seconds_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.Duration)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.Duration)
  private static final com.google.cloud.compute.v1.Duration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.Duration();
  }

  public static com.google.cloud.compute.v1.Duration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Duration>
      PARSER = new com.google.protobuf.AbstractParser<Duration>() {
    @java.lang.Override
    public Duration parsePartialFrom(
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

  public static com.google.protobuf.Parser<Duration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Duration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.Duration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

