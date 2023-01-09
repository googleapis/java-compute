// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * The information about the HTTP Cookie on which the hash function is based for load balancing policies that use a consistent hash.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie}
 */
public final class ConsistentHashLoadBalancerSettingsHttpCookie extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie)
    ConsistentHashLoadBalancerSettingsHttpCookieOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsistentHashLoadBalancerSettingsHttpCookie.newBuilder() to construct.
  private ConsistentHashLoadBalancerSettingsHttpCookie(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsistentHashLoadBalancerSettingsHttpCookie() {
    name_ = "";
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsistentHashLoadBalancerSettingsHttpCookie();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ConsistentHashLoadBalancerSettingsHttpCookie_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ConsistentHashLoadBalancerSettingsHttpCookie_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie.class, com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 3373707;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Name of the cookie.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Name of the cookie.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the cookie.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 3433509;
  private volatile java.lang.Object path_;
  /**
   * <pre>
   * Path to set for the cookie.
   * </pre>
   *
   * <code>optional string path = 3433509;</code>
   * @return Whether the path field is set.
   */
  @java.lang.Override
  public boolean hasPath() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Path to set for the cookie.
   * </pre>
   *
   * <code>optional string path = 3433509;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path to set for the cookie.
   * </pre>
   *
   * <code>optional string path = 3433509;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TTL_FIELD_NUMBER = 115180;
  private com.google.cloud.compute.v1.Duration ttl_;
  /**
   * <pre>
   * Lifetime of the cookie.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
   * @return Whether the ttl field is set.
   */
  @java.lang.Override
  public boolean hasTtl() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Lifetime of the cookie.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
   * @return The ttl.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Duration getTtl() {
    return ttl_ == null ? com.google.cloud.compute.v1.Duration.getDefaultInstance() : ttl_;
  }
  /**
   * <pre>
   * Lifetime of the cookie.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.DurationOrBuilder getTtlOrBuilder() {
    return ttl_ == null ? com.google.cloud.compute.v1.Duration.getDefaultInstance() : ttl_;
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
      output.writeMessage(115180, getTtl());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3373707, name_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3433509, path_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(115180, getTtl());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3373707, name_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3433509, path_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie other = (com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie) obj;

    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasPath() != other.hasPath()) return false;
    if (hasPath()) {
      if (!getPath()
          .equals(other.getPath())) return false;
    }
    if (hasTtl() != other.hasTtl()) return false;
    if (hasTtl()) {
      if (!getTtl()
          .equals(other.getTtl())) return false;
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
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasPath()) {
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
    }
    if (hasTtl()) {
      hash = (37 * hash) + TTL_FIELD_NUMBER;
      hash = (53 * hash) + getTtl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie prototype) {
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
   * The information about the HTTP Cookie on which the hash function is based for load balancing policies that use a consistent hash.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie)
      com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookieOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ConsistentHashLoadBalancerSettingsHttpCookie_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ConsistentHashLoadBalancerSettingsHttpCookie_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie.class, com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie.newBuilder()
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
        getTtlFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      path_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (ttlBuilder_ == null) {
        ttl_ = null;
      } else {
        ttlBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ConsistentHashLoadBalancerSettingsHttpCookie_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie build() {
      com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie buildPartial() {
      com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie result = new com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.path_ = path_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (ttlBuilder_ == null) {
          result.ttl_ = ttl_;
        } else {
          result.ttl_ = ttlBuilder_.build();
        }
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie) {
        return mergeFrom((com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie other) {
      if (other == com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie.getDefaultInstance()) return this;
      if (other.hasName()) {
        bitField0_ |= 0x00000001;
        name_ = other.name_;
        onChanged();
      }
      if (other.hasPath()) {
        bitField0_ |= 0x00000002;
        path_ = other.path_;
        onChanged();
      }
      if (other.hasTtl()) {
        mergeTtl(other.getTtl());
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
            case 921442: {
              input.readMessage(
                  getTtlFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 921442
            case 26989658: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26989658
            case 27468074: {
              path_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 27468074
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the cookie.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Name of the cookie.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the cookie.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the cookie.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the cookie.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the cookie.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * Path to set for the cookie.
     * </pre>
     *
     * <code>optional string path = 3433509;</code>
     * @return Whether the path field is set.
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Path to set for the cookie.
     * </pre>
     *
     * <code>optional string path = 3433509;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path to set for the cookie.
     * </pre>
     *
     * <code>optional string path = 3433509;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path to set for the cookie.
     * </pre>
     *
     * <code>optional string path = 3433509;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to set for the cookie.
     * </pre>
     *
     * <code>optional string path = 3433509;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      bitField0_ = (bitField0_ & ~0x00000002);
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to set for the cookie.
     * </pre>
     *
     * <code>optional string path = 3433509;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      path_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.Duration ttl_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Duration, com.google.cloud.compute.v1.Duration.Builder, com.google.cloud.compute.v1.DurationOrBuilder> ttlBuilder_;
    /**
     * <pre>
     * Lifetime of the cookie.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
     * @return Whether the ttl field is set.
     */
    public boolean hasTtl() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Lifetime of the cookie.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
     * @return The ttl.
     */
    public com.google.cloud.compute.v1.Duration getTtl() {
      if (ttlBuilder_ == null) {
        return ttl_ == null ? com.google.cloud.compute.v1.Duration.getDefaultInstance() : ttl_;
      } else {
        return ttlBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Lifetime of the cookie.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
     */
    public Builder setTtl(com.google.cloud.compute.v1.Duration value) {
      if (ttlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ttl_ = value;
        onChanged();
      } else {
        ttlBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * Lifetime of the cookie.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
     */
    public Builder setTtl(
        com.google.cloud.compute.v1.Duration.Builder builderForValue) {
      if (ttlBuilder_ == null) {
        ttl_ = builderForValue.build();
        onChanged();
      } else {
        ttlBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * Lifetime of the cookie.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
     */
    public Builder mergeTtl(com.google.cloud.compute.v1.Duration value) {
      if (ttlBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            ttl_ != null &&
            ttl_ != com.google.cloud.compute.v1.Duration.getDefaultInstance()) {
          ttl_ =
            com.google.cloud.compute.v1.Duration.newBuilder(ttl_).mergeFrom(value).buildPartial();
        } else {
          ttl_ = value;
        }
        onChanged();
      } else {
        ttlBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * Lifetime of the cookie.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
     */
    public Builder clearTtl() {
      if (ttlBuilder_ == null) {
        ttl_ = null;
        onChanged();
      } else {
        ttlBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <pre>
     * Lifetime of the cookie.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
     */
    public com.google.cloud.compute.v1.Duration.Builder getTtlBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getTtlFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Lifetime of the cookie.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
     */
    public com.google.cloud.compute.v1.DurationOrBuilder getTtlOrBuilder() {
      if (ttlBuilder_ != null) {
        return ttlBuilder_.getMessageOrBuilder();
      } else {
        return ttl_ == null ?
            com.google.cloud.compute.v1.Duration.getDefaultInstance() : ttl_;
      }
    }
    /**
     * <pre>
     * Lifetime of the cookie.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Duration ttl = 115180;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Duration, com.google.cloud.compute.v1.Duration.Builder, com.google.cloud.compute.v1.DurationOrBuilder> 
        getTtlFieldBuilder() {
      if (ttlBuilder_ == null) {
        ttlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Duration, com.google.cloud.compute.v1.Duration.Builder, com.google.cloud.compute.v1.DurationOrBuilder>(
                getTtl(),
                getParentForChildren(),
                isClean());
        ttl_ = null;
      }
      return ttlBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie)
  private static final com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie();
  }

  public static com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsistentHashLoadBalancerSettingsHttpCookie>
      PARSER = new com.google.protobuf.AbstractParser<ConsistentHashLoadBalancerSettingsHttpCookie>() {
    @java.lang.Override
    public ConsistentHashLoadBalancerSettingsHttpCookie parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConsistentHashLoadBalancerSettingsHttpCookie> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsistentHashLoadBalancerSettingsHttpCookie> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ConsistentHashLoadBalancerSettingsHttpCookie getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

