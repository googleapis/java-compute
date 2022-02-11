// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * The available logging options for the load balancer traffic served by this backend service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.BackendServiceLogConfig}
 */
public final class BackendServiceLogConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.BackendServiceLogConfig)
    BackendServiceLogConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BackendServiceLogConfig.newBuilder() to construct.
  private BackendServiceLogConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BackendServiceLogConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BackendServiceLogConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BackendServiceLogConfig(
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
          case 1225544365: {
            bitField0_ |= 0x00000002;
            sampleRate_ = input.readFloat();
            break;
          }
          case -1800852456: {
            bitField0_ |= 0x00000001;
            enable_ = input.readBool();
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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BackendServiceLogConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BackendServiceLogConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.BackendServiceLogConfig.class, com.google.cloud.compute.v1.BackendServiceLogConfig.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLE_FIELD_NUMBER = 311764355;
  private boolean enable_;
  /**
   * <pre>
   * This field denotes whether to enable logging for the load balancer traffic served by this backend service.
   * </pre>
   *
   * <code>optional bool enable = 311764355;</code>
   * @return Whether the enable field is set.
   */
  @java.lang.Override
  public boolean hasEnable() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * This field denotes whether to enable logging for the load balancer traffic served by this backend service.
   * </pre>
   *
   * <code>optional bool enable = 311764355;</code>
   * @return The enable.
   */
  @java.lang.Override
  public boolean getEnable() {
    return enable_;
  }

  public static final int SAMPLE_RATE_FIELD_NUMBER = 153193045;
  private float sampleRate_;
  /**
   * <pre>
   * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
   * </pre>
   *
   * <code>optional float sample_rate = 153193045;</code>
   * @return Whether the sampleRate field is set.
   */
  @java.lang.Override
  public boolean hasSampleRate() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
   * </pre>
   *
   * <code>optional float sample_rate = 153193045;</code>
   * @return The sampleRate.
   */
  @java.lang.Override
  public float getSampleRate() {
    return sampleRate_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeFloat(153193045, sampleRate_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(311764355, enable_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(153193045, sampleRate_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(311764355, enable_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.BackendServiceLogConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.BackendServiceLogConfig other = (com.google.cloud.compute.v1.BackendServiceLogConfig) obj;

    if (hasEnable() != other.hasEnable()) return false;
    if (hasEnable()) {
      if (getEnable()
          != other.getEnable()) return false;
    }
    if (hasSampleRate() != other.hasSampleRate()) return false;
    if (hasSampleRate()) {
      if (java.lang.Float.floatToIntBits(getSampleRate())
          != java.lang.Float.floatToIntBits(
              other.getSampleRate())) return false;
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
    if (hasEnable()) {
      hash = (37 * hash) + ENABLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEnable());
    }
    if (hasSampleRate()) {
      hash = (37 * hash) + SAMPLE_RATE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getSampleRate());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.BackendServiceLogConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.BackendServiceLogConfig prototype) {
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
   * The available logging options for the load balancer traffic served by this backend service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.BackendServiceLogConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.BackendServiceLogConfig)
      com.google.cloud.compute.v1.BackendServiceLogConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BackendServiceLogConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BackendServiceLogConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.BackendServiceLogConfig.class, com.google.cloud.compute.v1.BackendServiceLogConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.BackendServiceLogConfig.newBuilder()
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
      enable_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      sampleRate_ = 0F;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BackendServiceLogConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceLogConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.BackendServiceLogConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceLogConfig build() {
      com.google.cloud.compute.v1.BackendServiceLogConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceLogConfig buildPartial() {
      com.google.cloud.compute.v1.BackendServiceLogConfig result = new com.google.cloud.compute.v1.BackendServiceLogConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enable_ = enable_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sampleRate_ = sampleRate_;
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
      if (other instanceof com.google.cloud.compute.v1.BackendServiceLogConfig) {
        return mergeFrom((com.google.cloud.compute.v1.BackendServiceLogConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.BackendServiceLogConfig other) {
      if (other == com.google.cloud.compute.v1.BackendServiceLogConfig.getDefaultInstance()) return this;
      if (other.hasEnable()) {
        setEnable(other.getEnable());
      }
      if (other.hasSampleRate()) {
        setSampleRate(other.getSampleRate());
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
      com.google.cloud.compute.v1.BackendServiceLogConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.BackendServiceLogConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean enable_ ;
    /**
     * <pre>
     * This field denotes whether to enable logging for the load balancer traffic served by this backend service.
     * </pre>
     *
     * <code>optional bool enable = 311764355;</code>
     * @return Whether the enable field is set.
     */
    @java.lang.Override
    public boolean hasEnable() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * This field denotes whether to enable logging for the load balancer traffic served by this backend service.
     * </pre>
     *
     * <code>optional bool enable = 311764355;</code>
     * @return The enable.
     */
    @java.lang.Override
    public boolean getEnable() {
      return enable_;
    }
    /**
     * <pre>
     * This field denotes whether to enable logging for the load balancer traffic served by this backend service.
     * </pre>
     *
     * <code>optional bool enable = 311764355;</code>
     * @param value The enable to set.
     * @return This builder for chaining.
     */
    public Builder setEnable(boolean value) {
      bitField0_ |= 0x00000001;
      enable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field denotes whether to enable logging for the load balancer traffic served by this backend service.
     * </pre>
     *
     * <code>optional bool enable = 311764355;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnable() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enable_ = false;
      onChanged();
      return this;
    }

    private float sampleRate_ ;
    /**
     * <pre>
     * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
     * </pre>
     *
     * <code>optional float sample_rate = 153193045;</code>
     * @return Whether the sampleRate field is set.
     */
    @java.lang.Override
    public boolean hasSampleRate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
     * </pre>
     *
     * <code>optional float sample_rate = 153193045;</code>
     * @return The sampleRate.
     */
    @java.lang.Override
    public float getSampleRate() {
      return sampleRate_;
    }
    /**
     * <pre>
     * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
     * </pre>
     *
     * <code>optional float sample_rate = 153193045;</code>
     * @param value The sampleRate to set.
     * @return This builder for chaining.
     */
    public Builder setSampleRate(float value) {
      bitField0_ |= 0x00000002;
      sampleRate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field can only be specified if logging is enabled for this backend service. The value of the field must be in [0, 1]. This configures the sampling rate of requests to the load balancer where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0.
     * </pre>
     *
     * <code>optional float sample_rate = 153193045;</code>
     * @return This builder for chaining.
     */
    public Builder clearSampleRate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sampleRate_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.BackendServiceLogConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.BackendServiceLogConfig)
  private static final com.google.cloud.compute.v1.BackendServiceLogConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.BackendServiceLogConfig();
  }

  public static com.google.cloud.compute.v1.BackendServiceLogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackendServiceLogConfig>
      PARSER = new com.google.protobuf.AbstractParser<BackendServiceLogConfig>() {
    @java.lang.Override
    public BackendServiceLogConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BackendServiceLogConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BackendServiceLogConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackendServiceLogConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.BackendServiceLogConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

