// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ManagedInstanceInstanceHealth}
 */
public final class ManagedInstanceInstanceHealth extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ManagedInstanceInstanceHealth)
    ManagedInstanceInstanceHealthOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ManagedInstanceInstanceHealth.newBuilder() to construct.
  private ManagedInstanceInstanceHealth(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ManagedInstanceInstanceHealth() {
    detailedHealthState_ = "";
    healthCheck_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ManagedInstanceInstanceHealth();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ManagedInstanceInstanceHealth_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ManagedInstanceInstanceHealth_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ManagedInstanceInstanceHealth.class, com.google.cloud.compute.v1.ManagedInstanceInstanceHealth.Builder.class);
  }

  /**
   * <pre>
   * [Output Only] The current detailed instance health state.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.ManagedInstanceInstanceHealth.DetailedHealthState}
   */
  public enum DetailedHealthState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_DETAILED_HEALTH_STATE = 0;</code>
     */
    UNDEFINED_DETAILED_HEALTH_STATE(0),
    /**
     * <pre>
     * The instance is being drained. The existing connections to the instance have time to complete, but the new ones are being refused.
     * </pre>
     *
     * <code>DRAINING = 480455402;</code>
     */
    DRAINING(480455402),
    /**
     * <pre>
     * The instance is reachable i.e. a connection to the application health checking endpoint can be established, and conforms to the requirements defined by the health check.
     * </pre>
     *
     * <code>HEALTHY = 439801213;</code>
     */
    HEALTHY(439801213),
    /**
     * <pre>
     * The instance is unreachable i.e. a connection to the application health checking endpoint cannot be established, or the server does not respond within the specified timeout.
     * </pre>
     *
     * <code>TIMEOUT = 477813057;</code>
     */
    TIMEOUT(477813057),
    /**
     * <pre>
     * The instance is reachable, but does not conform to the requirements defined by the health check.
     * </pre>
     *
     * <code>UNHEALTHY = 462118084;</code>
     */
    UNHEALTHY(462118084),
    /**
     * <pre>
     * The health checking system is aware of the instance but its health is not known at the moment.
     * </pre>
     *
     * <code>UNKNOWN = 433141802;</code>
     */
    UNKNOWN(433141802),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_DETAILED_HEALTH_STATE = 0;</code>
     */
    public static final int UNDEFINED_DETAILED_HEALTH_STATE_VALUE = 0;
    /**
     * <pre>
     * The instance is being drained. The existing connections to the instance have time to complete, but the new ones are being refused.
     * </pre>
     *
     * <code>DRAINING = 480455402;</code>
     */
    public static final int DRAINING_VALUE = 480455402;
    /**
     * <pre>
     * The instance is reachable i.e. a connection to the application health checking endpoint can be established, and conforms to the requirements defined by the health check.
     * </pre>
     *
     * <code>HEALTHY = 439801213;</code>
     */
    public static final int HEALTHY_VALUE = 439801213;
    /**
     * <pre>
     * The instance is unreachable i.e. a connection to the application health checking endpoint cannot be established, or the server does not respond within the specified timeout.
     * </pre>
     *
     * <code>TIMEOUT = 477813057;</code>
     */
    public static final int TIMEOUT_VALUE = 477813057;
    /**
     * <pre>
     * The instance is reachable, but does not conform to the requirements defined by the health check.
     * </pre>
     *
     * <code>UNHEALTHY = 462118084;</code>
     */
    public static final int UNHEALTHY_VALUE = 462118084;
    /**
     * <pre>
     * The health checking system is aware of the instance but its health is not known at the moment.
     * </pre>
     *
     * <code>UNKNOWN = 433141802;</code>
     */
    public static final int UNKNOWN_VALUE = 433141802;


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
    public static DetailedHealthState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DetailedHealthState forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_DETAILED_HEALTH_STATE;
        case 480455402: return DRAINING;
        case 439801213: return HEALTHY;
        case 477813057: return TIMEOUT;
        case 462118084: return UNHEALTHY;
        case 433141802: return UNKNOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DetailedHealthState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DetailedHealthState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DetailedHealthState>() {
            public DetailedHealthState findValueByNumber(int number) {
              return DetailedHealthState.forNumber(number);
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
      return com.google.cloud.compute.v1.ManagedInstanceInstanceHealth.getDescriptor().getEnumTypes().get(0);
    }

    private static final DetailedHealthState[] VALUES = values();

    public static DetailedHealthState valueOf(
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

    private DetailedHealthState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.ManagedInstanceInstanceHealth.DetailedHealthState)
  }

  private int bitField0_;
  public static final int DETAILED_HEALTH_STATE_FIELD_NUMBER = 510470173;
  @SuppressWarnings("serial")
  private volatile java.lang.Object detailedHealthState_ = "";
  /**
   * <pre>
   * [Output Only] The current detailed instance health state.
   * Check the DetailedHealthState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string detailed_health_state = 510470173;</code>
   * @return Whether the detailedHealthState field is set.
   */
  @java.lang.Override
  public boolean hasDetailedHealthState() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * [Output Only] The current detailed instance health state.
   * Check the DetailedHealthState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string detailed_health_state = 510470173;</code>
   * @return The detailedHealthState.
   */
  @java.lang.Override
  public java.lang.String getDetailedHealthState() {
    java.lang.Object ref = detailedHealthState_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      detailedHealthState_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output Only] The current detailed instance health state.
   * Check the DetailedHealthState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string detailed_health_state = 510470173;</code>
   * @return The bytes for detailedHealthState.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDetailedHealthStateBytes() {
    java.lang.Object ref = detailedHealthState_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      detailedHealthState_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEALTH_CHECK_FIELD_NUMBER = 308876645;
  @SuppressWarnings("serial")
  private volatile java.lang.Object healthCheck_ = "";
  /**
   * <pre>
   * [Output Only] The URL for the health check that verifies whether the instance is healthy.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   * @return Whether the healthCheck field is set.
   */
  @java.lang.Override
  public boolean hasHealthCheck() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * [Output Only] The URL for the health check that verifies whether the instance is healthy.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   * @return The healthCheck.
   */
  @java.lang.Override
  public java.lang.String getHealthCheck() {
    java.lang.Object ref = healthCheck_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      healthCheck_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output Only] The URL for the health check that verifies whether the instance is healthy.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   * @return The bytes for healthCheck.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHealthCheckBytes() {
    java.lang.Object ref = healthCheck_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      healthCheck_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 308876645, healthCheck_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 510470173, detailedHealthState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(308876645, healthCheck_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(510470173, detailedHealthState_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ManagedInstanceInstanceHealth)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ManagedInstanceInstanceHealth other = (com.google.cloud.compute.v1.ManagedInstanceInstanceHealth) obj;

    if (hasDetailedHealthState() != other.hasDetailedHealthState()) return false;
    if (hasDetailedHealthState()) {
      if (!getDetailedHealthState()
          .equals(other.getDetailedHealthState())) return false;
    }
    if (hasHealthCheck() != other.hasHealthCheck()) return false;
    if (hasHealthCheck()) {
      if (!getHealthCheck()
          .equals(other.getHealthCheck())) return false;
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
    if (hasDetailedHealthState()) {
      hash = (37 * hash) + DETAILED_HEALTH_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getDetailedHealthState().hashCode();
    }
    if (hasHealthCheck()) {
      hash = (37 * hash) + HEALTH_CHECK_FIELD_NUMBER;
      hash = (53 * hash) + getHealthCheck().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.ManagedInstanceInstanceHealth prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.ManagedInstanceInstanceHealth}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ManagedInstanceInstanceHealth)
      com.google.cloud.compute.v1.ManagedInstanceInstanceHealthOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ManagedInstanceInstanceHealth_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ManagedInstanceInstanceHealth_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ManagedInstanceInstanceHealth.class, com.google.cloud.compute.v1.ManagedInstanceInstanceHealth.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ManagedInstanceInstanceHealth.newBuilder()
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
      detailedHealthState_ = "";
      healthCheck_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ManagedInstanceInstanceHealth_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ManagedInstanceInstanceHealth getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ManagedInstanceInstanceHealth.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ManagedInstanceInstanceHealth build() {
      com.google.cloud.compute.v1.ManagedInstanceInstanceHealth result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ManagedInstanceInstanceHealth buildPartial() {
      com.google.cloud.compute.v1.ManagedInstanceInstanceHealth result = new com.google.cloud.compute.v1.ManagedInstanceInstanceHealth(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.ManagedInstanceInstanceHealth result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.detailedHealthState_ = detailedHealthState_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.healthCheck_ = healthCheck_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.compute.v1.ManagedInstanceInstanceHealth) {
        return mergeFrom((com.google.cloud.compute.v1.ManagedInstanceInstanceHealth)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ManagedInstanceInstanceHealth other) {
      if (other == com.google.cloud.compute.v1.ManagedInstanceInstanceHealth.getDefaultInstance()) return this;
      if (other.hasDetailedHealthState()) {
        detailedHealthState_ = other.detailedHealthState_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasHealthCheck()) {
        healthCheck_ = other.healthCheck_;
        bitField0_ |= 0x00000002;
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
            case -1823954134: {
              healthCheck_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case -1823954134
            case -211205910: {
              detailedHealthState_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -211205910
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

    private java.lang.Object detailedHealthState_ = "";
    /**
     * <pre>
     * [Output Only] The current detailed instance health state.
     * Check the DetailedHealthState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string detailed_health_state = 510470173;</code>
     * @return Whether the detailedHealthState field is set.
     */
    public boolean hasDetailedHealthState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * [Output Only] The current detailed instance health state.
     * Check the DetailedHealthState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string detailed_health_state = 510470173;</code>
     * @return The detailedHealthState.
     */
    public java.lang.String getDetailedHealthState() {
      java.lang.Object ref = detailedHealthState_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        detailedHealthState_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] The current detailed instance health state.
     * Check the DetailedHealthState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string detailed_health_state = 510470173;</code>
     * @return The bytes for detailedHealthState.
     */
    public com.google.protobuf.ByteString
        getDetailedHealthStateBytes() {
      java.lang.Object ref = detailedHealthState_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        detailedHealthState_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] The current detailed instance health state.
     * Check the DetailedHealthState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string detailed_health_state = 510470173;</code>
     * @param value The detailedHealthState to set.
     * @return This builder for chaining.
     */
    public Builder setDetailedHealthState(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      detailedHealthState_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] The current detailed instance health state.
     * Check the DetailedHealthState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string detailed_health_state = 510470173;</code>
     * @return This builder for chaining.
     */
    public Builder clearDetailedHealthState() {
      detailedHealthState_ = getDefaultInstance().getDetailedHealthState();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] The current detailed instance health state.
     * Check the DetailedHealthState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string detailed_health_state = 510470173;</code>
     * @param value The bytes for detailedHealthState to set.
     * @return This builder for chaining.
     */
    public Builder setDetailedHealthStateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      detailedHealthState_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object healthCheck_ = "";
    /**
     * <pre>
     * [Output Only] The URL for the health check that verifies whether the instance is healthy.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     * @return Whether the healthCheck field is set.
     */
    public boolean hasHealthCheck() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * [Output Only] The URL for the health check that verifies whether the instance is healthy.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     * @return The healthCheck.
     */
    public java.lang.String getHealthCheck() {
      java.lang.Object ref = healthCheck_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        healthCheck_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] The URL for the health check that verifies whether the instance is healthy.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     * @return The bytes for healthCheck.
     */
    public com.google.protobuf.ByteString
        getHealthCheckBytes() {
      java.lang.Object ref = healthCheck_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        healthCheck_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] The URL for the health check that verifies whether the instance is healthy.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     * @param value The healthCheck to set.
     * @return This builder for chaining.
     */
    public Builder setHealthCheck(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      healthCheck_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] The URL for the health check that verifies whether the instance is healthy.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     * @return This builder for chaining.
     */
    public Builder clearHealthCheck() {
      healthCheck_ = getDefaultInstance().getHealthCheck();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] The URL for the health check that verifies whether the instance is healthy.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     * @param value The bytes for healthCheck to set.
     * @return This builder for chaining.
     */
    public Builder setHealthCheckBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      healthCheck_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ManagedInstanceInstanceHealth)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ManagedInstanceInstanceHealth)
  private static final com.google.cloud.compute.v1.ManagedInstanceInstanceHealth DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ManagedInstanceInstanceHealth();
  }

  public static com.google.cloud.compute.v1.ManagedInstanceInstanceHealth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagedInstanceInstanceHealth>
      PARSER = new com.google.protobuf.AbstractParser<ManagedInstanceInstanceHealth>() {
    @java.lang.Override
    public ManagedInstanceInstanceHealth parsePartialFrom(
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

  public static com.google.protobuf.Parser<ManagedInstanceInstanceHealth> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagedInstanceInstanceHealth> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ManagedInstanceInstanceHealth getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

