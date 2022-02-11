// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * The spec for modifying the path before sending the request to the matched backend service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.UrlRewrite}
 */
public final class UrlRewrite extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.UrlRewrite)
    UrlRewriteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UrlRewrite.newBuilder() to construct.
  private UrlRewrite(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UrlRewrite() {
    hostRewrite_ = "";
    pathPrefixRewrite_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UrlRewrite();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UrlRewrite(
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
          case 329490890: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            pathPrefixRewrite_ = s;
            break;
          }
          case 1278554026: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            hostRewrite_ = s;
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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_UrlRewrite_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_UrlRewrite_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.UrlRewrite.class, com.google.cloud.compute.v1.UrlRewrite.Builder.class);
  }

  private int bitField0_;
  public static final int HOST_REWRITE_FIELD_NUMBER = 159819253;
  private volatile java.lang.Object hostRewrite_;
  /**
   * <pre>
   * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
   * </pre>
   *
   * <code>optional string host_rewrite = 159819253;</code>
   * @return Whether the hostRewrite field is set.
   */
  @java.lang.Override
  public boolean hasHostRewrite() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
   * </pre>
   *
   * <code>optional string host_rewrite = 159819253;</code>
   * @return The hostRewrite.
   */
  @java.lang.Override
  public java.lang.String getHostRewrite() {
    java.lang.Object ref = hostRewrite_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostRewrite_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
   * </pre>
   *
   * <code>optional string host_rewrite = 159819253;</code>
   * @return The bytes for hostRewrite.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostRewriteBytes() {
    java.lang.Object ref = hostRewrite_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostRewrite_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_PREFIX_REWRITE_FIELD_NUMBER = 41186361;
  private volatile java.lang.Object pathPrefixRewrite_;
  /**
   * <pre>
   * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string path_prefix_rewrite = 41186361;</code>
   * @return Whether the pathPrefixRewrite field is set.
   */
  @java.lang.Override
  public boolean hasPathPrefixRewrite() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string path_prefix_rewrite = 41186361;</code>
   * @return The pathPrefixRewrite.
   */
  @java.lang.Override
  public java.lang.String getPathPrefixRewrite() {
    java.lang.Object ref = pathPrefixRewrite_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pathPrefixRewrite_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
   * </pre>
   *
   * <code>optional string path_prefix_rewrite = 41186361;</code>
   * @return The bytes for pathPrefixRewrite.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathPrefixRewriteBytes() {
    java.lang.Object ref = pathPrefixRewrite_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pathPrefixRewrite_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 41186361, pathPrefixRewrite_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 159819253, hostRewrite_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(41186361, pathPrefixRewrite_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(159819253, hostRewrite_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.UrlRewrite)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.UrlRewrite other = (com.google.cloud.compute.v1.UrlRewrite) obj;

    if (hasHostRewrite() != other.hasHostRewrite()) return false;
    if (hasHostRewrite()) {
      if (!getHostRewrite()
          .equals(other.getHostRewrite())) return false;
    }
    if (hasPathPrefixRewrite() != other.hasPathPrefixRewrite()) return false;
    if (hasPathPrefixRewrite()) {
      if (!getPathPrefixRewrite()
          .equals(other.getPathPrefixRewrite())) return false;
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
    if (hasHostRewrite()) {
      hash = (37 * hash) + HOST_REWRITE_FIELD_NUMBER;
      hash = (53 * hash) + getHostRewrite().hashCode();
    }
    if (hasPathPrefixRewrite()) {
      hash = (37 * hash) + PATH_PREFIX_REWRITE_FIELD_NUMBER;
      hash = (53 * hash) + getPathPrefixRewrite().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.UrlRewrite parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.UrlRewrite parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.UrlRewrite prototype) {
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
   * The spec for modifying the path before sending the request to the matched backend service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.UrlRewrite}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.UrlRewrite)
      com.google.cloud.compute.v1.UrlRewriteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_UrlRewrite_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_UrlRewrite_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.UrlRewrite.class, com.google.cloud.compute.v1.UrlRewrite.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.UrlRewrite.newBuilder()
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
      hostRewrite_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      pathPrefixRewrite_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_UrlRewrite_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UrlRewrite getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.UrlRewrite.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UrlRewrite build() {
      com.google.cloud.compute.v1.UrlRewrite result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.UrlRewrite buildPartial() {
      com.google.cloud.compute.v1.UrlRewrite result = new com.google.cloud.compute.v1.UrlRewrite(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.hostRewrite_ = hostRewrite_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.pathPrefixRewrite_ = pathPrefixRewrite_;
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
      if (other instanceof com.google.cloud.compute.v1.UrlRewrite) {
        return mergeFrom((com.google.cloud.compute.v1.UrlRewrite)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.UrlRewrite other) {
      if (other == com.google.cloud.compute.v1.UrlRewrite.getDefaultInstance()) return this;
      if (other.hasHostRewrite()) {
        bitField0_ |= 0x00000001;
        hostRewrite_ = other.hostRewrite_;
        onChanged();
      }
      if (other.hasPathPrefixRewrite()) {
        bitField0_ |= 0x00000002;
        pathPrefixRewrite_ = other.pathPrefixRewrite_;
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
      com.google.cloud.compute.v1.UrlRewrite parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.UrlRewrite) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object hostRewrite_ = "";
    /**
     * <pre>
     * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
     * </pre>
     *
     * <code>optional string host_rewrite = 159819253;</code>
     * @return Whether the hostRewrite field is set.
     */
    public boolean hasHostRewrite() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
     * </pre>
     *
     * <code>optional string host_rewrite = 159819253;</code>
     * @return The hostRewrite.
     */
    public java.lang.String getHostRewrite() {
      java.lang.Object ref = hostRewrite_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostRewrite_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
     * </pre>
     *
     * <code>optional string host_rewrite = 159819253;</code>
     * @return The bytes for hostRewrite.
     */
    public com.google.protobuf.ByteString
        getHostRewriteBytes() {
      java.lang.Object ref = hostRewrite_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostRewrite_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
     * </pre>
     *
     * <code>optional string host_rewrite = 159819253;</code>
     * @param value The hostRewrite to set.
     * @return This builder for chaining.
     */
    public Builder setHostRewrite(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      hostRewrite_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
     * </pre>
     *
     * <code>optional string host_rewrite = 159819253;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostRewrite() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hostRewrite_ = getDefaultInstance().getHostRewrite();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
     * </pre>
     *
     * <code>optional string host_rewrite = 159819253;</code>
     * @param value The bytes for hostRewrite to set.
     * @return This builder for chaining.
     */
    public Builder setHostRewriteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      hostRewrite_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pathPrefixRewrite_ = "";
    /**
     * <pre>
     * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
     * </pre>
     *
     * <code>optional string path_prefix_rewrite = 41186361;</code>
     * @return Whether the pathPrefixRewrite field is set.
     */
    public boolean hasPathPrefixRewrite() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
     * </pre>
     *
     * <code>optional string path_prefix_rewrite = 41186361;</code>
     * @return The pathPrefixRewrite.
     */
    public java.lang.String getPathPrefixRewrite() {
      java.lang.Object ref = pathPrefixRewrite_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pathPrefixRewrite_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
     * </pre>
     *
     * <code>optional string path_prefix_rewrite = 41186361;</code>
     * @return The bytes for pathPrefixRewrite.
     */
    public com.google.protobuf.ByteString
        getPathPrefixRewriteBytes() {
      java.lang.Object ref = pathPrefixRewrite_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pathPrefixRewrite_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
     * </pre>
     *
     * <code>optional string path_prefix_rewrite = 41186361;</code>
     * @param value The pathPrefixRewrite to set.
     * @return This builder for chaining.
     */
    public Builder setPathPrefixRewrite(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      pathPrefixRewrite_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
     * </pre>
     *
     * <code>optional string path_prefix_rewrite = 41186361;</code>
     * @return This builder for chaining.
     */
    public Builder clearPathPrefixRewrite() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pathPrefixRewrite_ = getDefaultInstance().getPathPrefixRewrite();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
     * </pre>
     *
     * <code>optional string path_prefix_rewrite = 41186361;</code>
     * @param value The bytes for pathPrefixRewrite to set.
     * @return This builder for chaining.
     */
    public Builder setPathPrefixRewriteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      pathPrefixRewrite_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.UrlRewrite)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.UrlRewrite)
  private static final com.google.cloud.compute.v1.UrlRewrite DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.UrlRewrite();
  }

  public static com.google.cloud.compute.v1.UrlRewrite getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UrlRewrite>
      PARSER = new com.google.protobuf.AbstractParser<UrlRewrite>() {
    @java.lang.Override
    public UrlRewrite parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UrlRewrite(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UrlRewrite> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UrlRewrite> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.UrlRewrite getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

