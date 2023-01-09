/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest}
 */
public final class RegionTargetHttpsProxiesSetSslCertificatesRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest)
    RegionTargetHttpsProxiesSetSslCertificatesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RegionTargetHttpsProxiesSetSslCertificatesRequest.newBuilder() to construct.
  private RegionTargetHttpsProxiesSetSslCertificatesRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RegionTargetHttpsProxiesSetSslCertificatesRequest() {
    sslCertificates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RegionTargetHttpsProxiesSetSslCertificatesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_RegionTargetHttpsProxiesSetSslCertificatesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_RegionTargetHttpsProxiesSetSslCertificatesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest.class,
            com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest.Builder
                .class);
  }

  public static final int SSL_CERTIFICATES_FIELD_NUMBER = 366006543;
  private com.google.protobuf.LazyStringList sslCertificates_;
  /**
   *
   *
   * <pre>
   * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 366006543;</code>
   *
   * @return A list containing the sslCertificates.
   */
  public com.google.protobuf.ProtocolStringList getSslCertificatesList() {
    return sslCertificates_;
  }
  /**
   *
   *
   * <pre>
   * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 366006543;</code>
   *
   * @return The count of sslCertificates.
   */
  public int getSslCertificatesCount() {
    return sslCertificates_.size();
  }
  /**
   *
   *
   * <pre>
   * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 366006543;</code>
   *
   * @param index The index of the element to return.
   * @return The sslCertificates at the given index.
   */
  public java.lang.String getSslCertificates(int index) {
    return sslCertificates_.get(index);
  }
  /**
   *
   *
   * <pre>
   * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
   * </pre>
   *
   * <code>repeated string ssl_certificates = 366006543;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sslCertificates at the given index.
   */
  public com.google.protobuf.ByteString getSslCertificatesBytes(int index) {
    return sslCertificates_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < sslCertificates_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 366006543, sslCertificates_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < sslCertificates_.size(); i++) {
        dataSize += computeStringSizeNoTag(sslCertificates_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getSslCertificatesList().size();
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
    if (!(obj
        instanceof com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest other =
        (com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest) obj;

    if (!getSslCertificatesList().equals(other.getSslCertificatesList())) return false;
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
    if (getSslCertificatesCount() > 0) {
      hash = (37 * hash) + SSL_CERTIFICATES_FIELD_NUMBER;
      hash = (53 * hash) + getSslCertificatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest)
      com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RegionTargetHttpsProxiesSetSslCertificatesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RegionTargetHttpsProxiesSetSslCertificatesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest.class,
              com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      sslCertificates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RegionTargetHttpsProxiesSetSslCertificatesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest build() {
      com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
        buildPartial() {
      com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest result =
          new com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        sslCertificates_ = sslCertificates_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.sslCertificates_ = sslCertificates_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other
          instanceof
          com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest) {
        return mergeFrom(
            (com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest other) {
      if (other
          == com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
              .getDefaultInstance()) return this;
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
            case -1366914950:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureSslCertificatesIsMutable();
                sslCertificates_.add(s);
                break;
              } // case -1366914950
            default:
              {
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

    private com.google.protobuf.LazyStringList sslCertificates_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureSslCertificatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sslCertificates_ = new com.google.protobuf.LazyStringArrayList(sslCertificates_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
     * </pre>
     *
     * <code>repeated string ssl_certificates = 366006543;</code>
     *
     * @return A list containing the sslCertificates.
     */
    public com.google.protobuf.ProtocolStringList getSslCertificatesList() {
      return sslCertificates_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
     * </pre>
     *
     * <code>repeated string ssl_certificates = 366006543;</code>
     *
     * @return The count of sslCertificates.
     */
    public int getSslCertificatesCount() {
      return sslCertificates_.size();
    }
    /**
     *
     *
     * <pre>
     * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
     * </pre>
     *
     * <code>repeated string ssl_certificates = 366006543;</code>
     *
     * @param index The index of the element to return.
     * @return The sslCertificates at the given index.
     */
    public java.lang.String getSslCertificates(int index) {
      return sslCertificates_.get(index);
    }
    /**
     *
     *
     * <pre>
     * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
     * </pre>
     *
     * <code>repeated string ssl_certificates = 366006543;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the sslCertificates at the given index.
     */
    public com.google.protobuf.ByteString getSslCertificatesBytes(int index) {
      return sslCertificates_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
     * </pre>
     *
     * <code>repeated string ssl_certificates = 366006543;</code>
     *
     * @param index The index to set the value at.
     * @param value The sslCertificates to set.
     * @return This builder for chaining.
     */
    public Builder setSslCertificates(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSslCertificatesIsMutable();
      sslCertificates_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
     * </pre>
     *
     * <code>repeated string ssl_certificates = 366006543;</code>
     *
     * @param value The sslCertificates to add.
     * @return This builder for chaining.
     */
    public Builder addSslCertificates(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSslCertificatesIsMutable();
      sslCertificates_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
     * </pre>
     *
     * <code>repeated string ssl_certificates = 366006543;</code>
     *
     * @param values The sslCertificates to add.
     * @return This builder for chaining.
     */
    public Builder addAllSslCertificates(java.lang.Iterable<java.lang.String> values) {
      ensureSslCertificatesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, sslCertificates_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
     * </pre>
     *
     * <code>repeated string ssl_certificates = 366006543;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSslCertificates() {
      sslCertificates_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * New set of SslCertificate resources to associate with this TargetHttpsProxy resource.
     * </pre>
     *
     * <code>repeated string ssl_certificates = 366006543;</code>
     *
     * @param value The bytes of the sslCertificates to add.
     * @return This builder for chaining.
     */
    public Builder addSslCertificatesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureSslCertificatesIsMutable();
      sslCertificates_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest)
  private static final com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest();
  }

  public static com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegionTargetHttpsProxiesSetSslCertificatesRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<
              RegionTargetHttpsProxiesSetSslCertificatesRequest>() {
            @java.lang.Override
            public RegionTargetHttpsProxiesSetSslCertificatesRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<RegionTargetHttpsProxiesSetSslCertificatesRequest>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegionTargetHttpsProxiesSetSslCertificatesRequest>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RegionTargetHttpsProxiesSetSslCertificatesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
