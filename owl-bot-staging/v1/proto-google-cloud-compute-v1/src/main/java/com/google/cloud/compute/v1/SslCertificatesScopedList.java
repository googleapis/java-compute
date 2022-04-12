// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SslCertificatesScopedList}
 */
public final class SslCertificatesScopedList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SslCertificatesScopedList)
    SslCertificatesScopedListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SslCertificatesScopedList.newBuilder() to construct.
  private SslCertificatesScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SslCertificatesScopedList() {
    sslCertificates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SslCertificatesScopedList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SslCertificatesScopedList(
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
          case 405634274: {
            com.google.cloud.compute.v1.Warning.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = warning_.toBuilder();
            }
            warning_ = input.readMessage(com.google.cloud.compute.v1.Warning.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(warning_);
              warning_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case -1366914950: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              sslCertificates_ = new java.util.ArrayList<com.google.cloud.compute.v1.SslCertificate>();
              mutable_bitField0_ |= 0x00000001;
            }
            sslCertificates_.add(
                input.readMessage(com.google.cloud.compute.v1.SslCertificate.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        sslCertificates_ = java.util.Collections.unmodifiableList(sslCertificates_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SslCertificatesScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SslCertificatesScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SslCertificatesScopedList.class, com.google.cloud.compute.v1.SslCertificatesScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int SSL_CERTIFICATES_FIELD_NUMBER = 366006543;
  private java.util.List<com.google.cloud.compute.v1.SslCertificate> sslCertificates_;
  /**
   * <pre>
   * List of SslCertificates contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.SslCertificate> getSslCertificatesList() {
    return sslCertificates_;
  }
  /**
   * <pre>
   * List of SslCertificates contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.SslCertificateOrBuilder> 
      getSslCertificatesOrBuilderList() {
    return sslCertificates_;
  }
  /**
   * <pre>
   * List of SslCertificates contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
   */
  @java.lang.Override
  public int getSslCertificatesCount() {
    return sslCertificates_.size();
  }
  /**
   * <pre>
   * List of SslCertificates contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.SslCertificate getSslCertificates(int index) {
    return sslCertificates_.get(index);
  }
  /**
   * <pre>
   * List of SslCertificates contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.SslCertificateOrBuilder getSslCertificatesOrBuilder(
      int index) {
    return sslCertificates_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;
  /**
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Warning getWarning() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
  }
  /**
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
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
      output.writeMessage(50704284, getWarning());
    }
    for (int i = 0; i < sslCertificates_.size(); i++) {
      output.writeMessage(366006543, sslCertificates_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(50704284, getWarning());
    }
    for (int i = 0; i < sslCertificates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(366006543, sslCertificates_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.SslCertificatesScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SslCertificatesScopedList other = (com.google.cloud.compute.v1.SslCertificatesScopedList) obj;

    if (!getSslCertificatesList()
        .equals(other.getSslCertificatesList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning()
          .equals(other.getWarning())) return false;
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
    if (getSslCertificatesCount() > 0) {
      hash = (37 * hash) + SSL_CERTIFICATES_FIELD_NUMBER;
      hash = (53 * hash) + getSslCertificatesList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SslCertificatesScopedList parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.SslCertificatesScopedList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.SslCertificatesScopedList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SslCertificatesScopedList)
      com.google.cloud.compute.v1.SslCertificatesScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SslCertificatesScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SslCertificatesScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SslCertificatesScopedList.class, com.google.cloud.compute.v1.SslCertificatesScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SslCertificatesScopedList.newBuilder()
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
        getSslCertificatesFieldBuilder();
        getWarningFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sslCertificatesBuilder_ == null) {
        sslCertificates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        sslCertificatesBuilder_.clear();
      }
      if (warningBuilder_ == null) {
        warning_ = null;
      } else {
        warningBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SslCertificatesScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SslCertificatesScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SslCertificatesScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SslCertificatesScopedList build() {
      com.google.cloud.compute.v1.SslCertificatesScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SslCertificatesScopedList buildPartial() {
      com.google.cloud.compute.v1.SslCertificatesScopedList result = new com.google.cloud.compute.v1.SslCertificatesScopedList(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (sslCertificatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sslCertificates_ = java.util.Collections.unmodifiableList(sslCertificates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sslCertificates_ = sslCertificates_;
      } else {
        result.sslCertificates_ = sslCertificatesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (warningBuilder_ == null) {
          result.warning_ = warning_;
        } else {
          result.warning_ = warningBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.compute.v1.SslCertificatesScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.SslCertificatesScopedList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SslCertificatesScopedList other) {
      if (other == com.google.cloud.compute.v1.SslCertificatesScopedList.getDefaultInstance()) return this;
      if (sslCertificatesBuilder_ == null) {
        if (!other.sslCertificates_.isEmpty()) {
          if (sslCertificates_.isEmpty()) {
            sslCertificates_ = other.sslCertificates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSslCertificatesIsMutable();
            sslCertificates_.addAll(other.sslCertificates_);
          }
          onChanged();
        }
      } else {
        if (!other.sslCertificates_.isEmpty()) {
          if (sslCertificatesBuilder_.isEmpty()) {
            sslCertificatesBuilder_.dispose();
            sslCertificatesBuilder_ = null;
            sslCertificates_ = other.sslCertificates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sslCertificatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSslCertificatesFieldBuilder() : null;
          } else {
            sslCertificatesBuilder_.addAllMessages(other.sslCertificates_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
      com.google.cloud.compute.v1.SslCertificatesScopedList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.SslCertificatesScopedList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.compute.v1.SslCertificate> sslCertificates_ =
      java.util.Collections.emptyList();
    private void ensureSslCertificatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sslCertificates_ = new java.util.ArrayList<com.google.cloud.compute.v1.SslCertificate>(sslCertificates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.SslCertificate, com.google.cloud.compute.v1.SslCertificate.Builder, com.google.cloud.compute.v1.SslCertificateOrBuilder> sslCertificatesBuilder_;

    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.SslCertificate> getSslCertificatesList() {
      if (sslCertificatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sslCertificates_);
      } else {
        return sslCertificatesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public int getSslCertificatesCount() {
      if (sslCertificatesBuilder_ == null) {
        return sslCertificates_.size();
      } else {
        return sslCertificatesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public com.google.cloud.compute.v1.SslCertificate getSslCertificates(int index) {
      if (sslCertificatesBuilder_ == null) {
        return sslCertificates_.get(index);
      } else {
        return sslCertificatesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public Builder setSslCertificates(
        int index, com.google.cloud.compute.v1.SslCertificate value) {
      if (sslCertificatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSslCertificatesIsMutable();
        sslCertificates_.set(index, value);
        onChanged();
      } else {
        sslCertificatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public Builder setSslCertificates(
        int index, com.google.cloud.compute.v1.SslCertificate.Builder builderForValue) {
      if (sslCertificatesBuilder_ == null) {
        ensureSslCertificatesIsMutable();
        sslCertificates_.set(index, builderForValue.build());
        onChanged();
      } else {
        sslCertificatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public Builder addSslCertificates(com.google.cloud.compute.v1.SslCertificate value) {
      if (sslCertificatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSslCertificatesIsMutable();
        sslCertificates_.add(value);
        onChanged();
      } else {
        sslCertificatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public Builder addSslCertificates(
        int index, com.google.cloud.compute.v1.SslCertificate value) {
      if (sslCertificatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSslCertificatesIsMutable();
        sslCertificates_.add(index, value);
        onChanged();
      } else {
        sslCertificatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public Builder addSslCertificates(
        com.google.cloud.compute.v1.SslCertificate.Builder builderForValue) {
      if (sslCertificatesBuilder_ == null) {
        ensureSslCertificatesIsMutable();
        sslCertificates_.add(builderForValue.build());
        onChanged();
      } else {
        sslCertificatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public Builder addSslCertificates(
        int index, com.google.cloud.compute.v1.SslCertificate.Builder builderForValue) {
      if (sslCertificatesBuilder_ == null) {
        ensureSslCertificatesIsMutable();
        sslCertificates_.add(index, builderForValue.build());
        onChanged();
      } else {
        sslCertificatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public Builder addAllSslCertificates(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.SslCertificate> values) {
      if (sslCertificatesBuilder_ == null) {
        ensureSslCertificatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sslCertificates_);
        onChanged();
      } else {
        sslCertificatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public Builder clearSslCertificates() {
      if (sslCertificatesBuilder_ == null) {
        sslCertificates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sslCertificatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public Builder removeSslCertificates(int index) {
      if (sslCertificatesBuilder_ == null) {
        ensureSslCertificatesIsMutable();
        sslCertificates_.remove(index);
        onChanged();
      } else {
        sslCertificatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public com.google.cloud.compute.v1.SslCertificate.Builder getSslCertificatesBuilder(
        int index) {
      return getSslCertificatesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public com.google.cloud.compute.v1.SslCertificateOrBuilder getSslCertificatesOrBuilder(
        int index) {
      if (sslCertificatesBuilder_ == null) {
        return sslCertificates_.get(index);  } else {
        return sslCertificatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.SslCertificateOrBuilder> 
         getSslCertificatesOrBuilderList() {
      if (sslCertificatesBuilder_ != null) {
        return sslCertificatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sslCertificates_);
      }
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public com.google.cloud.compute.v1.SslCertificate.Builder addSslCertificatesBuilder() {
      return getSslCertificatesFieldBuilder().addBuilder(
          com.google.cloud.compute.v1.SslCertificate.getDefaultInstance());
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public com.google.cloud.compute.v1.SslCertificate.Builder addSslCertificatesBuilder(
        int index) {
      return getSslCertificatesFieldBuilder().addBuilder(
          index, com.google.cloud.compute.v1.SslCertificate.getDefaultInstance());
    }
    /**
     * <pre>
     * List of SslCertificates contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.SslCertificate ssl_certificates = 366006543;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.SslCertificate.Builder> 
         getSslCertificatesBuilderList() {
      return getSslCertificatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.SslCertificate, com.google.cloud.compute.v1.SslCertificate.Builder, com.google.cloud.compute.v1.SslCertificateOrBuilder> 
        getSslCertificatesFieldBuilder() {
      if (sslCertificatesBuilder_ == null) {
        sslCertificatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.SslCertificate, com.google.cloud.compute.v1.SslCertificate.Builder, com.google.cloud.compute.v1.SslCertificateOrBuilder>(
                sslCertificates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        sslCertificates_ = null;
      }
      return sslCertificatesBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Warning, com.google.cloud.compute.v1.Warning.Builder, com.google.cloud.compute.v1.WarningOrBuilder> warningBuilder_;
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     * @return The warning.
     */
    public com.google.cloud.compute.v1.Warning getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
        onChanged();
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(
        com.google.cloud.compute.v1.Warning.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
        onChanged();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder mergeWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            warning_ != null &&
            warning_ != com.google.cloud.compute.v1.Warning.getDefaultInstance()) {
          warning_ =
            com.google.cloud.compute.v1.Warning.newBuilder(warning_).mergeFrom(value).buildPartial();
        } else {
          warning_ = value;
        }
        onChanged();
      } else {
        warningBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder clearWarning() {
      if (warningBuilder_ == null) {
        warning_ = null;
        onChanged();
      } else {
        warningBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.Warning.Builder getWarningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null ?
            com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
      }
    }
    /**
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Warning, com.google.cloud.compute.v1.Warning.Builder, com.google.cloud.compute.v1.WarningOrBuilder> 
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning, com.google.cloud.compute.v1.Warning.Builder, com.google.cloud.compute.v1.WarningOrBuilder>(
                getWarning(),
                getParentForChildren(),
                isClean());
        warning_ = null;
      }
      return warningBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SslCertificatesScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SslCertificatesScopedList)
  private static final com.google.cloud.compute.v1.SslCertificatesScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SslCertificatesScopedList();
  }

  public static com.google.cloud.compute.v1.SslCertificatesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SslCertificatesScopedList>
      PARSER = new com.google.protobuf.AbstractParser<SslCertificatesScopedList>() {
    @java.lang.Override
    public SslCertificatesScopedList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SslCertificatesScopedList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SslCertificatesScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SslCertificatesScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SslCertificatesScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

