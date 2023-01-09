// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * This is deprecated and has no effect. Do not use.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.LogConfigDataAccessOptions}
 */
public final class LogConfigDataAccessOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.LogConfigDataAccessOptions)
    LogConfigDataAccessOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogConfigDataAccessOptions.newBuilder() to construct.
  private LogConfigDataAccessOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogConfigDataAccessOptions() {
    logMode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogConfigDataAccessOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LogConfigDataAccessOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LogConfigDataAccessOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.LogConfigDataAccessOptions.class, com.google.cloud.compute.v1.LogConfigDataAccessOptions.Builder.class);
  }

  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode}
   */
  public enum LogMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOG_MODE = 0;</code>
     */
    UNDEFINED_LOG_MODE(0),
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>LOG_FAIL_CLOSED = 360469778;</code>
     */
    LOG_FAIL_CLOSED(360469778),
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>LOG_MODE_UNSPECIFIED = 88160822;</code>
     */
    LOG_MODE_UNSPECIFIED(88160822),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOG_MODE = 0;</code>
     */
    public static final int UNDEFINED_LOG_MODE_VALUE = 0;
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>LOG_FAIL_CLOSED = 360469778;</code>
     */
    public static final int LOG_FAIL_CLOSED_VALUE = 360469778;
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>LOG_MODE_UNSPECIFIED = 88160822;</code>
     */
    public static final int LOG_MODE_UNSPECIFIED_VALUE = 88160822;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LogMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LogMode forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_LOG_MODE;
        case 360469778: return LOG_FAIL_CLOSED;
        case 88160822: return LOG_MODE_UNSPECIFIED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LogMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LogMode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LogMode>() {
            public LogMode findValueByNumber(int number) {
              return LogMode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDescriptor().getEnumTypes().get(0);
    }

    private static final LogMode[] VALUES = values();

    public static LogMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LogMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.LogConfigDataAccessOptions.LogMode)
  }

  private int bitField0_;
  public static final int LOG_MODE_FIELD_NUMBER = 402897342;
  private volatile java.lang.Object logMode_;
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the LogMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_mode = 402897342;</code>
   * @return Whether the logMode field is set.
   */
  @java.lang.Override
  public boolean hasLogMode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the LogMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_mode = 402897342;</code>
   * @return The logMode.
   */
  @java.lang.Override
  public java.lang.String getLogMode() {
    java.lang.Object ref = logMode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logMode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the LogMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_mode = 402897342;</code>
   * @return The bytes for logMode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogModeBytes() {
    java.lang.Object ref = logMode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logMode_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 402897342, logMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(402897342, logMode_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.LogConfigDataAccessOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.LogConfigDataAccessOptions other = (com.google.cloud.compute.v1.LogConfigDataAccessOptions) obj;

    if (hasLogMode() != other.hasLogMode()) return false;
    if (hasLogMode()) {
      if (!getLogMode()
          .equals(other.getLogMode())) return false;
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
    if (hasLogMode()) {
      hash = (37 * hash) + LOG_MODE_FIELD_NUMBER;
      hash = (53 * hash) + getLogMode().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.LogConfigDataAccessOptions prototype) {
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
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.LogConfigDataAccessOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.LogConfigDataAccessOptions)
      com.google.cloud.compute.v1.LogConfigDataAccessOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LogConfigDataAccessOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LogConfigDataAccessOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.LogConfigDataAccessOptions.class, com.google.cloud.compute.v1.LogConfigDataAccessOptions.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.LogConfigDataAccessOptions.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      logMode_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LogConfigDataAccessOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigDataAccessOptions getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigDataAccessOptions build() {
      com.google.cloud.compute.v1.LogConfigDataAccessOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfigDataAccessOptions buildPartial() {
      com.google.cloud.compute.v1.LogConfigDataAccessOptions result = new com.google.cloud.compute.v1.LogConfigDataAccessOptions(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.logMode_ = logMode_;
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
      if (other instanceof com.google.cloud.compute.v1.LogConfigDataAccessOptions) {
        return mergeFrom((com.google.cloud.compute.v1.LogConfigDataAccessOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.LogConfigDataAccessOptions other) {
      if (other == com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDefaultInstance()) return this;
      if (other.hasLogMode()) {
        bitField0_ |= 0x00000001;
        logMode_ = other.logMode_;
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
            case -1071788558: {
              logMode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -1071788558
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

    private java.lang.Object logMode_ = "";
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * Check the LogMode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_mode = 402897342;</code>
     * @return Whether the logMode field is set.
     */
    public boolean hasLogMode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * Check the LogMode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_mode = 402897342;</code>
     * @return The logMode.
     */
    public java.lang.String getLogMode() {
      java.lang.Object ref = logMode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logMode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * Check the LogMode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_mode = 402897342;</code>
     * @return The bytes for logMode.
     */
    public com.google.protobuf.ByteString
        getLogModeBytes() {
      java.lang.Object ref = logMode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logMode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * Check the LogMode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_mode = 402897342;</code>
     * @param value The logMode to set.
     * @return This builder for chaining.
     */
    public Builder setLogMode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      logMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * Check the LogMode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_mode = 402897342;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      logMode_ = getDefaultInstance().getLogMode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * Check the LogMode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_mode = 402897342;</code>
     * @param value The bytes for logMode to set.
     * @return This builder for chaining.
     */
    public Builder setLogModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      logMode_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.LogConfigDataAccessOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.LogConfigDataAccessOptions)
  private static final com.google.cloud.compute.v1.LogConfigDataAccessOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.LogConfigDataAccessOptions();
  }

  public static com.google.cloud.compute.v1.LogConfigDataAccessOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogConfigDataAccessOptions>
      PARSER = new com.google.protobuf.AbstractParser<LogConfigDataAccessOptions>() {
    @java.lang.Override
    public LogConfigDataAccessOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogConfigDataAccessOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogConfigDataAccessOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigDataAccessOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

