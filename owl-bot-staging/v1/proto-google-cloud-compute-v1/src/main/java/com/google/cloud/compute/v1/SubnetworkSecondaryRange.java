// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Represents a secondary IP range of a subnetwork.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SubnetworkSecondaryRange}
 */
public final class SubnetworkSecondaryRange extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SubnetworkSecondaryRange)
    SubnetworkSecondaryRangeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubnetworkSecondaryRange.newBuilder() to construct.
  private SubnetworkSecondaryRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubnetworkSecondaryRange() {
    ipCidrRange_ = "";
    rangeName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubnetworkSecondaryRange();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SubnetworkSecondaryRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SubnetworkSecondaryRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SubnetworkSecondaryRange.class, com.google.cloud.compute.v1.SubnetworkSecondaryRange.Builder.class);
  }

  private int bitField0_;
  public static final int IP_CIDR_RANGE_FIELD_NUMBER = 98117322;
  private volatile java.lang.Object ipCidrRange_;
  /**
   * <pre>
   * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   * @return Whether the ipCidrRange field is set.
   */
  @java.lang.Override
  public boolean hasIpCidrRange() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   * @return The ipCidrRange.
   */
  @java.lang.Override
  public java.lang.String getIpCidrRange() {
    java.lang.Object ref = ipCidrRange_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipCidrRange_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   * @return The bytes for ipCidrRange.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpCidrRangeBytes() {
    java.lang.Object ref = ipCidrRange_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipCidrRange_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RANGE_NAME_FIELD_NUMBER = 332216397;
  private volatile java.lang.Object rangeName_;
  /**
   * <pre>
   * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
   * </pre>
   *
   * <code>optional string range_name = 332216397;</code>
   * @return Whether the rangeName field is set.
   */
  @java.lang.Override
  public boolean hasRangeName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
   * </pre>
   *
   * <code>optional string range_name = 332216397;</code>
   * @return The rangeName.
   */
  @java.lang.Override
  public java.lang.String getRangeName() {
    java.lang.Object ref = rangeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rangeName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
   * </pre>
   *
   * <code>optional string range_name = 332216397;</code>
   * @return The bytes for rangeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRangeNameBytes() {
    java.lang.Object ref = rangeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rangeName_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 98117322, ipCidrRange_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 332216397, rangeName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(98117322, ipCidrRange_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(332216397, rangeName_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.SubnetworkSecondaryRange)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SubnetworkSecondaryRange other = (com.google.cloud.compute.v1.SubnetworkSecondaryRange) obj;

    if (hasIpCidrRange() != other.hasIpCidrRange()) return false;
    if (hasIpCidrRange()) {
      if (!getIpCidrRange()
          .equals(other.getIpCidrRange())) return false;
    }
    if (hasRangeName() != other.hasRangeName()) return false;
    if (hasRangeName()) {
      if (!getRangeName()
          .equals(other.getRangeName())) return false;
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
    if (hasIpCidrRange()) {
      hash = (37 * hash) + IP_CIDR_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + getIpCidrRange().hashCode();
    }
    if (hasRangeName()) {
      hash = (37 * hash) + RANGE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getRangeName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.SubnetworkSecondaryRange prototype) {
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
   * Represents a secondary IP range of a subnetwork.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SubnetworkSecondaryRange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SubnetworkSecondaryRange)
      com.google.cloud.compute.v1.SubnetworkSecondaryRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SubnetworkSecondaryRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SubnetworkSecondaryRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SubnetworkSecondaryRange.class, com.google.cloud.compute.v1.SubnetworkSecondaryRange.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SubnetworkSecondaryRange.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      ipCidrRange_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      rangeName_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SubnetworkSecondaryRange_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SubnetworkSecondaryRange getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SubnetworkSecondaryRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SubnetworkSecondaryRange build() {
      com.google.cloud.compute.v1.SubnetworkSecondaryRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SubnetworkSecondaryRange buildPartial() {
      com.google.cloud.compute.v1.SubnetworkSecondaryRange result = new com.google.cloud.compute.v1.SubnetworkSecondaryRange(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.ipCidrRange_ = ipCidrRange_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.rangeName_ = rangeName_;
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
      if (other instanceof com.google.cloud.compute.v1.SubnetworkSecondaryRange) {
        return mergeFrom((com.google.cloud.compute.v1.SubnetworkSecondaryRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SubnetworkSecondaryRange other) {
      if (other == com.google.cloud.compute.v1.SubnetworkSecondaryRange.getDefaultInstance()) return this;
      if (other.hasIpCidrRange()) {
        bitField0_ |= 0x00000001;
        ipCidrRange_ = other.ipCidrRange_;
        onChanged();
      }
      if (other.hasRangeName()) {
        bitField0_ |= 0x00000002;
        rangeName_ = other.rangeName_;
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
            case 784938578: {
              ipCidrRange_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 784938578
            case -1637236118: {
              rangeName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case -1637236118
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

    private java.lang.Object ipCidrRange_ = "";
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     * @return Whether the ipCidrRange field is set.
     */
    public boolean hasIpCidrRange() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     * @return The ipCidrRange.
     */
    public java.lang.String getIpCidrRange() {
      java.lang.Object ref = ipCidrRange_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipCidrRange_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     * @return The bytes for ipCidrRange.
     */
    public com.google.protobuf.ByteString
        getIpCidrRangeBytes() {
      java.lang.Object ref = ipCidrRange_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipCidrRange_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     * @param value The ipCidrRange to set.
     * @return This builder for chaining.
     */
    public Builder setIpCidrRange(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      ipCidrRange_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpCidrRange() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ipCidrRange_ = getDefaultInstance().getIpCidrRange();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * </pre>
     *
     * <code>optional string ip_cidr_range = 98117322;</code>
     * @param value The bytes for ipCidrRange to set.
     * @return This builder for chaining.
     */
    public Builder setIpCidrRangeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      ipCidrRange_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object rangeName_ = "";
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * </pre>
     *
     * <code>optional string range_name = 332216397;</code>
     * @return Whether the rangeName field is set.
     */
    public boolean hasRangeName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * </pre>
     *
     * <code>optional string range_name = 332216397;</code>
     * @return The rangeName.
     */
    public java.lang.String getRangeName() {
      java.lang.Object ref = rangeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rangeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * </pre>
     *
     * <code>optional string range_name = 332216397;</code>
     * @return The bytes for rangeName.
     */
    public com.google.protobuf.ByteString
        getRangeNameBytes() {
      java.lang.Object ref = rangeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rangeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * </pre>
     *
     * <code>optional string range_name = 332216397;</code>
     * @param value The rangeName to set.
     * @return This builder for chaining.
     */
    public Builder setRangeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      rangeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * </pre>
     *
     * <code>optional string range_name = 332216397;</code>
     * @return This builder for chaining.
     */
    public Builder clearRangeName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rangeName_ = getDefaultInstance().getRangeName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * </pre>
     *
     * <code>optional string range_name = 332216397;</code>
     * @param value The bytes for rangeName to set.
     * @return This builder for chaining.
     */
    public Builder setRangeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      rangeName_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SubnetworkSecondaryRange)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SubnetworkSecondaryRange)
  private static final com.google.cloud.compute.v1.SubnetworkSecondaryRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SubnetworkSecondaryRange();
  }

  public static com.google.cloud.compute.v1.SubnetworkSecondaryRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubnetworkSecondaryRange>
      PARSER = new com.google.protobuf.AbstractParser<SubnetworkSecondaryRange>() {
    @java.lang.Override
    public SubnetworkSecondaryRange parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubnetworkSecondaryRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubnetworkSecondaryRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SubnetworkSecondaryRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

