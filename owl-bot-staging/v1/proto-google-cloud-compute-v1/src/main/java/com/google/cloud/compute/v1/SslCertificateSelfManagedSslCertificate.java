// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Configuration and status of a self-managed SSL certificate.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate}
 */
public final class SslCertificateSelfManagedSslCertificate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate)
    SslCertificateSelfManagedSslCertificateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SslCertificateSelfManagedSslCertificate.newBuilder() to construct.
  private SslCertificateSelfManagedSslCertificate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SslCertificateSelfManagedSslCertificate() {
    certificate_ = "";
    privateKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SslCertificateSelfManagedSslCertificate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SslCertificateSelfManagedSslCertificate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SslCertificateSelfManagedSslCertificate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate.class, com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate.Builder.class);
  }

  private int bitField0_;
  public static final int CERTIFICATE_FIELD_NUMBER = 341787031;
  @SuppressWarnings("serial")
  private volatile java.lang.Object certificate_ = "";
  /**
   * <pre>
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
   * </pre>
   *
   * <code>optional string certificate = 341787031;</code>
   * @return Whether the certificate field is set.
   */
  @java.lang.Override
  public boolean hasCertificate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
   * </pre>
   *
   * <code>optional string certificate = 341787031;</code>
   * @return The certificate.
   */
  @java.lang.Override
  public java.lang.String getCertificate() {
    java.lang.Object ref = certificate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      certificate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
   * </pre>
   *
   * <code>optional string certificate = 341787031;</code>
   * @return The bytes for certificate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCertificateBytes() {
    java.lang.Object ref = certificate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      certificate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIVATE_KEY_FIELD_NUMBER = 361331107;
  @SuppressWarnings("serial")
  private volatile java.lang.Object privateKey_ = "";
  /**
   * <pre>
   * A write-only private key in PEM format. Only insert requests will include this field.
   * </pre>
   *
   * <code>optional string private_key = 361331107;</code>
   * @return Whether the privateKey field is set.
   */
  @java.lang.Override
  public boolean hasPrivateKey() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * A write-only private key in PEM format. Only insert requests will include this field.
   * </pre>
   *
   * <code>optional string private_key = 361331107;</code>
   * @return The privateKey.
   */
  @java.lang.Override
  public java.lang.String getPrivateKey() {
    java.lang.Object ref = privateKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      privateKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A write-only private key in PEM format. Only insert requests will include this field.
   * </pre>
   *
   * <code>optional string private_key = 361331107;</code>
   * @return The bytes for privateKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrivateKeyBytes() {
    java.lang.Object ref = privateKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      privateKey_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 341787031, certificate_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 361331107, privateKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(341787031, certificate_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(361331107, privateKey_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate other = (com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate) obj;

    if (hasCertificate() != other.hasCertificate()) return false;
    if (hasCertificate()) {
      if (!getCertificate()
          .equals(other.getCertificate())) return false;
    }
    if (hasPrivateKey() != other.hasPrivateKey()) return false;
    if (hasPrivateKey()) {
      if (!getPrivateKey()
          .equals(other.getPrivateKey())) return false;
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
    if (hasCertificate()) {
      hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
      hash = (53 * hash) + getCertificate().hashCode();
    }
    if (hasPrivateKey()) {
      hash = (37 * hash) + PRIVATE_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getPrivateKey().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate prototype) {
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
   * Configuration and status of a self-managed SSL certificate.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate)
      com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SslCertificateSelfManagedSslCertificate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SslCertificateSelfManagedSslCertificate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate.class, com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate.newBuilder()
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
      certificate_ = "";
      privateKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SslCertificateSelfManagedSslCertificate_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate build() {
      com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate buildPartial() {
      com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate result = new com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.certificate_ = certificate_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.privateKey_ = privateKey_;
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
      if (other instanceof com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate) {
        return mergeFrom((com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate other) {
      if (other == com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate.getDefaultInstance()) return this;
      if (other.hasCertificate()) {
        certificate_ = other.certificate_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPrivateKey()) {
        privateKey_ = other.privateKey_;
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
            case -1560671046: {
              certificate_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case -1560671046
            case -1404318438: {
              privateKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case -1404318438
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

    private java.lang.Object certificate_ = "";
    /**
     * <pre>
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * </pre>
     *
     * <code>optional string certificate = 341787031;</code>
     * @return Whether the certificate field is set.
     */
    public boolean hasCertificate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * </pre>
     *
     * <code>optional string certificate = 341787031;</code>
     * @return The certificate.
     */
    public java.lang.String getCertificate() {
      java.lang.Object ref = certificate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        certificate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * </pre>
     *
     * <code>optional string certificate = 341787031;</code>
     * @return The bytes for certificate.
     */
    public com.google.protobuf.ByteString
        getCertificateBytes() {
      java.lang.Object ref = certificate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        certificate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * </pre>
     *
     * <code>optional string certificate = 341787031;</code>
     * @param value The certificate to set.
     * @return This builder for chaining.
     */
    public Builder setCertificate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      certificate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * </pre>
     *
     * <code>optional string certificate = 341787031;</code>
     * @return This builder for chaining.
     */
    public Builder clearCertificate() {
      certificate_ = getDefaultInstance().getCertificate();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * </pre>
     *
     * <code>optional string certificate = 341787031;</code>
     * @param value The bytes for certificate to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      certificate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object privateKey_ = "";
    /**
     * <pre>
     * A write-only private key in PEM format. Only insert requests will include this field.
     * </pre>
     *
     * <code>optional string private_key = 361331107;</code>
     * @return Whether the privateKey field is set.
     */
    public boolean hasPrivateKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A write-only private key in PEM format. Only insert requests will include this field.
     * </pre>
     *
     * <code>optional string private_key = 361331107;</code>
     * @return The privateKey.
     */
    public java.lang.String getPrivateKey() {
      java.lang.Object ref = privateKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        privateKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A write-only private key in PEM format. Only insert requests will include this field.
     * </pre>
     *
     * <code>optional string private_key = 361331107;</code>
     * @return The bytes for privateKey.
     */
    public com.google.protobuf.ByteString
        getPrivateKeyBytes() {
      java.lang.Object ref = privateKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        privateKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A write-only private key in PEM format. Only insert requests will include this field.
     * </pre>
     *
     * <code>optional string private_key = 361331107;</code>
     * @param value The privateKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      privateKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A write-only private key in PEM format. Only insert requests will include this field.
     * </pre>
     *
     * <code>optional string private_key = 361331107;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrivateKey() {
      privateKey_ = getDefaultInstance().getPrivateKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A write-only private key in PEM format. Only insert requests will include this field.
     * </pre>
     *
     * <code>optional string private_key = 361331107;</code>
     * @param value The bytes for privateKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      privateKey_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate)
  private static final com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate();
  }

  public static com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SslCertificateSelfManagedSslCertificate>
      PARSER = new com.google.protobuf.AbstractParser<SslCertificateSelfManagedSslCertificate>() {
    @java.lang.Override
    public SslCertificateSelfManagedSslCertificate parsePartialFrom(
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

  public static com.google.protobuf.Parser<SslCertificateSelfManagedSslCertificate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SslCertificateSelfManagedSslCertificate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

