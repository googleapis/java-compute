// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest}
 */
public final class TargetHttpsProxiesSetQuicOverrideRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest)
    TargetHttpsProxiesSetQuicOverrideRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetHttpsProxiesSetQuicOverrideRequest.newBuilder() to construct.
  private TargetHttpsProxiesSetQuicOverrideRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetHttpsProxiesSetQuicOverrideRequest() {
    quicOverride_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TargetHttpsProxiesSetQuicOverrideRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TargetHttpsProxiesSetQuicOverrideRequest(
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
          case -642349718: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            quicOverride_ = s;
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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetHttpsProxiesSetQuicOverrideRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetHttpsProxiesSetQuicOverrideRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest.class, com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest.Builder.class);
  }

  /**
   * <pre>
   * QUIC policy for the TargetHttpsProxy resource.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest.QuicOverride}
   */
  public enum QuicOverride
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_QUIC_OVERRIDE = 0;</code>
     */
    UNDEFINED_QUIC_OVERRIDE(0),
    /**
     * <pre>
     * The load balancer will not attempt to negotiate QUIC with clients.
     * </pre>
     *
     * <code>DISABLE = 241807048;</code>
     */
    DISABLE(241807048),
    /**
     * <pre>
     * The load balancer will attempt to negotiate QUIC with clients.
     * </pre>
     *
     * <code>ENABLE = 438835587;</code>
     */
    ENABLE(438835587),
    /**
     * <pre>
     * No overrides to the default QUIC policy. This option is implicit if no QUIC override has been specified in the request.
     * </pre>
     *
     * <code>NONE = 2402104;</code>
     */
    NONE(2402104),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_QUIC_OVERRIDE = 0;</code>
     */
    public static final int UNDEFINED_QUIC_OVERRIDE_VALUE = 0;
    /**
     * <pre>
     * The load balancer will not attempt to negotiate QUIC with clients.
     * </pre>
     *
     * <code>DISABLE = 241807048;</code>
     */
    public static final int DISABLE_VALUE = 241807048;
    /**
     * <pre>
     * The load balancer will attempt to negotiate QUIC with clients.
     * </pre>
     *
     * <code>ENABLE = 438835587;</code>
     */
    public static final int ENABLE_VALUE = 438835587;
    /**
     * <pre>
     * No overrides to the default QUIC policy. This option is implicit if no QUIC override has been specified in the request.
     * </pre>
     *
     * <code>NONE = 2402104;</code>
     */
    public static final int NONE_VALUE = 2402104;


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
    public static QuicOverride valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static QuicOverride forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_QUIC_OVERRIDE;
        case 241807048: return DISABLE;
        case 438835587: return ENABLE;
        case 2402104: return NONE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<QuicOverride>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        QuicOverride> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<QuicOverride>() {
            public QuicOverride findValueByNumber(int number) {
              return QuicOverride.forNumber(number);
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
      return com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final QuicOverride[] VALUES = values();

    public static QuicOverride valueOf(
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

    private QuicOverride(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest.QuicOverride)
  }

  private int bitField0_;
  public static final int QUIC_OVERRIDE_FIELD_NUMBER = 456577197;
  private volatile java.lang.Object quicOverride_;
  /**
   * <pre>
   * QUIC policy for the TargetHttpsProxy resource.
   * Check the QuicOverride enum for the list of possible values.
   * </pre>
   *
   * <code>optional string quic_override = 456577197;</code>
   * @return Whether the quicOverride field is set.
   */
  @java.lang.Override
  public boolean hasQuicOverride() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * QUIC policy for the TargetHttpsProxy resource.
   * Check the QuicOverride enum for the list of possible values.
   * </pre>
   *
   * <code>optional string quic_override = 456577197;</code>
   * @return The quicOverride.
   */
  @java.lang.Override
  public java.lang.String getQuicOverride() {
    java.lang.Object ref = quicOverride_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      quicOverride_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * QUIC policy for the TargetHttpsProxy resource.
   * Check the QuicOverride enum for the list of possible values.
   * </pre>
   *
   * <code>optional string quic_override = 456577197;</code>
   * @return The bytes for quicOverride.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQuicOverrideBytes() {
    java.lang.Object ref = quicOverride_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      quicOverride_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 456577197, quicOverride_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(456577197, quicOverride_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest other = (com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest) obj;

    if (hasQuicOverride() != other.hasQuicOverride()) return false;
    if (hasQuicOverride()) {
      if (!getQuicOverride()
          .equals(other.getQuicOverride())) return false;
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
    if (hasQuicOverride()) {
      hash = (37 * hash) + QUIC_OVERRIDE_FIELD_NUMBER;
      hash = (53 * hash) + getQuicOverride().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest)
      com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetHttpsProxiesSetQuicOverrideRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetHttpsProxiesSetQuicOverrideRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest.class, com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest.newBuilder()
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
      quicOverride_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_TargetHttpsProxiesSetQuicOverrideRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest build() {
      com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest buildPartial() {
      com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest result = new com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.quicOverride_ = quicOverride_;
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
      if (other instanceof com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest) {
        return mergeFrom((com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest other) {
      if (other == com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest.getDefaultInstance()) return this;
      if (other.hasQuicOverride()) {
        bitField0_ |= 0x00000001;
        quicOverride_ = other.quicOverride_;
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
      com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object quicOverride_ = "";
    /**
     * <pre>
     * QUIC policy for the TargetHttpsProxy resource.
     * Check the QuicOverride enum for the list of possible values.
     * </pre>
     *
     * <code>optional string quic_override = 456577197;</code>
     * @return Whether the quicOverride field is set.
     */
    public boolean hasQuicOverride() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * QUIC policy for the TargetHttpsProxy resource.
     * Check the QuicOverride enum for the list of possible values.
     * </pre>
     *
     * <code>optional string quic_override = 456577197;</code>
     * @return The quicOverride.
     */
    public java.lang.String getQuicOverride() {
      java.lang.Object ref = quicOverride_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        quicOverride_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * QUIC policy for the TargetHttpsProxy resource.
     * Check the QuicOverride enum for the list of possible values.
     * </pre>
     *
     * <code>optional string quic_override = 456577197;</code>
     * @return The bytes for quicOverride.
     */
    public com.google.protobuf.ByteString
        getQuicOverrideBytes() {
      java.lang.Object ref = quicOverride_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        quicOverride_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * QUIC policy for the TargetHttpsProxy resource.
     * Check the QuicOverride enum for the list of possible values.
     * </pre>
     *
     * <code>optional string quic_override = 456577197;</code>
     * @param value The quicOverride to set.
     * @return This builder for chaining.
     */
    public Builder setQuicOverride(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      quicOverride_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * QUIC policy for the TargetHttpsProxy resource.
     * Check the QuicOverride enum for the list of possible values.
     * </pre>
     *
     * <code>optional string quic_override = 456577197;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuicOverride() {
      bitField0_ = (bitField0_ & ~0x00000001);
      quicOverride_ = getDefaultInstance().getQuicOverride();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * QUIC policy for the TargetHttpsProxy resource.
     * Check the QuicOverride enum for the list of possible values.
     * </pre>
     *
     * <code>optional string quic_override = 456577197;</code>
     * @param value The bytes for quicOverride to set.
     * @return This builder for chaining.
     */
    public Builder setQuicOverrideBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      quicOverride_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest)
  private static final com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest();
  }

  public static com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetHttpsProxiesSetQuicOverrideRequest>
      PARSER = new com.google.protobuf.AbstractParser<TargetHttpsProxiesSetQuicOverrideRequest>() {
    @java.lang.Override
    public TargetHttpsProxiesSetQuicOverrideRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TargetHttpsProxiesSetQuicOverrideRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TargetHttpsProxiesSetQuicOverrideRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetHttpsProxiesSetQuicOverrideRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.TargetHttpsProxiesSetQuicOverrideRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

