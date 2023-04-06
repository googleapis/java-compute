// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest}
 */
public final class NetworkEndpointGroupsListEndpointsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)
    NetworkEndpointGroupsListEndpointsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NetworkEndpointGroupsListEndpointsRequest.newBuilder() to construct.
  private NetworkEndpointGroupsListEndpointsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetworkEndpointGroupsListEndpointsRequest() {
    healthStatus_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NetworkEndpointGroupsListEndpointsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupsListEndpointsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupsListEndpointsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.class, com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.Builder.class);
  }

  /**
   * <pre>
   * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus}
   */
  public enum HealthStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_HEALTH_STATUS = 0;</code>
     */
    UNDEFINED_HEALTH_STATUS(0),
    /**
     * <pre>
     * Show the health status for each network endpoint. Impacts latency of the call.
     * </pre>
     *
     * <code>SHOW = 2544381;</code>
     */
    SHOW(2544381),
    /**
     * <pre>
     * Health status for network endpoints will not be provided.
     * </pre>
     *
     * <code>SKIP = 2547071;</code>
     */
    SKIP(2547071),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_HEALTH_STATUS = 0;</code>
     */
    public static final int UNDEFINED_HEALTH_STATUS_VALUE = 0;
    /**
     * <pre>
     * Show the health status for each network endpoint. Impacts latency of the call.
     * </pre>
     *
     * <code>SHOW = 2544381;</code>
     */
    public static final int SHOW_VALUE = 2544381;
    /**
     * <pre>
     * Health status for network endpoints will not be provided.
     * </pre>
     *
     * <code>SKIP = 2547071;</code>
     */
    public static final int SKIP_VALUE = 2547071;


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
    public static HealthStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HealthStatus forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_HEALTH_STATUS;
        case 2544381: return SHOW;
        case 2547071: return SKIP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HealthStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HealthStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HealthStatus>() {
            public HealthStatus findValueByNumber(int number) {
              return HealthStatus.forNumber(number);
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
      return com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final HealthStatus[] VALUES = values();

    public static HealthStatus valueOf(
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

    private HealthStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.HealthStatus)
  }

  private int bitField0_;
  public static final int HEALTH_STATUS_FIELD_NUMBER = 380545845;
  @SuppressWarnings("serial")
  private volatile java.lang.Object healthStatus_ = "";
  /**
   * <pre>
   * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
   * Check the HealthStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string health_status = 380545845;</code>
   * @return Whether the healthStatus field is set.
   */
  @java.lang.Override
  public boolean hasHealthStatus() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
   * Check the HealthStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string health_status = 380545845;</code>
   * @return The healthStatus.
   */
  @java.lang.Override
  public java.lang.String getHealthStatus() {
    java.lang.Object ref = healthStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      healthStatus_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
   * Check the HealthStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string health_status = 380545845;</code>
   * @return The bytes for healthStatus.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHealthStatusBytes() {
    java.lang.Object ref = healthStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      healthStatus_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 380545845, healthStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(380545845, healthStatus_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest other = (com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest) obj;

    if (hasHealthStatus() != other.hasHealthStatus()) return false;
    if (hasHealthStatus()) {
      if (!getHealthStatus()
          .equals(other.getHealthStatus())) return false;
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
    if (hasHealthStatus()) {
      hash = (37 * hash) + HEALTH_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getHealthStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)
      com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupsListEndpointsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupsListEndpointsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.class, com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.newBuilder()
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
      healthStatus_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NetworkEndpointGroupsListEndpointsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest build() {
      com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest buildPartial() {
      com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest result = new com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.healthStatus_ = healthStatus_;
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
      if (other instanceof com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest) {
        return mergeFrom((com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest other) {
      if (other == com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest.getDefaultInstance()) return this;
      if (other.hasHealthStatus()) {
        healthStatus_ = other.healthStatus_;
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
            case -1250600534: {
              healthStatus_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -1250600534
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

    private java.lang.Object healthStatus_ = "";
    /**
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * Check the HealthStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string health_status = 380545845;</code>
     * @return Whether the healthStatus field is set.
     */
    public boolean hasHealthStatus() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * Check the HealthStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string health_status = 380545845;</code>
     * @return The healthStatus.
     */
    public java.lang.String getHealthStatus() {
      java.lang.Object ref = healthStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        healthStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * Check the HealthStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string health_status = 380545845;</code>
     * @return The bytes for healthStatus.
     */
    public com.google.protobuf.ByteString
        getHealthStatusBytes() {
      java.lang.Object ref = healthStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        healthStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * Check the HealthStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string health_status = 380545845;</code>
     * @param value The healthStatus to set.
     * @return This builder for chaining.
     */
    public Builder setHealthStatus(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      healthStatus_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * Check the HealthStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string health_status = 380545845;</code>
     * @return This builder for chaining.
     */
    public Builder clearHealthStatus() {
      healthStatus_ = getDefaultInstance().getHealthStatus();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
     * Check the HealthStatus enum for the list of possible values.
     * </pre>
     *
     * <code>optional string health_status = 380545845;</code>
     * @param value The bytes for healthStatus to set.
     * @return This builder for chaining.
     */
    public Builder setHealthStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      healthStatus_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest)
  private static final com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest();
  }

  public static com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkEndpointGroupsListEndpointsRequest>
      PARSER = new com.google.protobuf.AbstractParser<NetworkEndpointGroupsListEndpointsRequest>() {
    @java.lang.Override
    public NetworkEndpointGroupsListEndpointsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworkEndpointGroupsListEndpointsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkEndpointGroupsListEndpointsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

