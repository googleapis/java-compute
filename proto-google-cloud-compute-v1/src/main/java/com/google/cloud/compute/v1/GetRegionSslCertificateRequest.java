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
 * A request message for RegionSslCertificates.Get. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GetRegionSslCertificateRequest}
 */
public final class GetRegionSslCertificateRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GetRegionSslCertificateRequest)
    GetRegionSslCertificateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetRegionSslCertificateRequest.newBuilder() to construct.
  private GetRegionSslCertificateRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetRegionSslCertificateRequest() {
    project_ = "";
    region_ = "";
    sslCertificate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetRegionSslCertificateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_GetRegionSslCertificateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_GetRegionSslCertificateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GetRegionSslCertificateRequest.class,
            com.google.cloud.compute.v1.GetRegionSslCertificateRequest.Builder.class);
  }

  public static final int PROJECT_FIELD_NUMBER = 227560217;

  @SuppressWarnings("serial")
  private volatile java.lang.Object project_ = "";
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGION_FIELD_NUMBER = 138946292;

  @SuppressWarnings("serial")
  private volatile java.lang.Object region_ = "";
  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The region.
   */
  @java.lang.Override
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for region.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      region_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSL_CERTIFICATE_FIELD_NUMBER = 46443492;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sslCertificate_ = "";
  /**
   *
   *
   * <pre>
   * Name of the SslCertificate resource to return.
   * </pre>
   *
   * <code>string ssl_certificate = 46443492 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sslCertificate.
   */
  @java.lang.Override
  public java.lang.String getSslCertificate() {
    java.lang.Object ref = sslCertificate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sslCertificate_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the SslCertificate resource to return.
   * </pre>
   *
   * <code>string ssl_certificate = 46443492 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for sslCertificate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSslCertificateBytes() {
    java.lang.Object ref = sslCertificate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sslCertificate_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sslCertificate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 46443492, sslCertificate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 138946292, region_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sslCertificate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(46443492, sslCertificate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(138946292, region_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.GetRegionSslCertificateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GetRegionSslCertificateRequest other =
        (com.google.cloud.compute.v1.GetRegionSslCertificateRequest) obj;

    if (!getProject().equals(other.getProject())) return false;
    if (!getRegion().equals(other.getRegion())) return false;
    if (!getSslCertificate().equals(other.getSslCertificate())) return false;
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
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + getRegion().hashCode();
    hash = (37 * hash) + SSL_CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + getSslCertificate().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest parseFrom(
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
      com.google.cloud.compute.v1.GetRegionSslCertificateRequest prototype) {
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
   * A request message for RegionSslCertificates.Get. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GetRegionSslCertificateRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GetRegionSslCertificateRequest)
      com.google.cloud.compute.v1.GetRegionSslCertificateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GetRegionSslCertificateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GetRegionSslCertificateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GetRegionSslCertificateRequest.class,
              com.google.cloud.compute.v1.GetRegionSslCertificateRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GetRegionSslCertificateRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      project_ = "";
      region_ = "";
      sslCertificate_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GetRegionSslCertificateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetRegionSslCertificateRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GetRegionSslCertificateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetRegionSslCertificateRequest build() {
      com.google.cloud.compute.v1.GetRegionSslCertificateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetRegionSslCertificateRequest buildPartial() {
      com.google.cloud.compute.v1.GetRegionSslCertificateRequest result =
          new com.google.cloud.compute.v1.GetRegionSslCertificateRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.GetRegionSslCertificateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.project_ = project_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.region_ = region_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sslCertificate_ = sslCertificate_;
      }
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
      if (other instanceof com.google.cloud.compute.v1.GetRegionSslCertificateRequest) {
        return mergeFrom((com.google.cloud.compute.v1.GetRegionSslCertificateRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GetRegionSslCertificateRequest other) {
      if (other == com.google.cloud.compute.v1.GetRegionSslCertificateRequest.getDefaultInstance())
        return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRegion().isEmpty()) {
        region_ = other.region_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSslCertificate().isEmpty()) {
        sslCertificate_ = other.sslCertificate_;
        bitField0_ |= 0x00000004;
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
            case 371547938:
              {
                sslCertificate_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 371547938
            case 1111570338:
              {
                region_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 1111570338
            case 1820481738:
              {
                project_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 1820481738
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

    private java.lang.Object project_ = "";
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      project_ = getDefaultInstance().getProject();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object region_ = "";
    /**
     *
     *
     * <pre>
     * Name of the region scoping this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The region.
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the region scoping this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for region.
     */
    public com.google.protobuf.ByteString getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the region scoping this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      region_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the region scoping this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      region_ = getDefaultInstance().getRegion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the region scoping this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      region_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object sslCertificate_ = "";
    /**
     *
     *
     * <pre>
     * Name of the SslCertificate resource to return.
     * </pre>
     *
     * <code>string ssl_certificate = 46443492 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The sslCertificate.
     */
    public java.lang.String getSslCertificate() {
      java.lang.Object ref = sslCertificate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sslCertificate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the SslCertificate resource to return.
     * </pre>
     *
     * <code>string ssl_certificate = 46443492 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for sslCertificate.
     */
    public com.google.protobuf.ByteString getSslCertificateBytes() {
      java.lang.Object ref = sslCertificate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sslCertificate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the SslCertificate resource to return.
     * </pre>
     *
     * <code>string ssl_certificate = 46443492 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The sslCertificate to set.
     * @return This builder for chaining.
     */
    public Builder setSslCertificate(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sslCertificate_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the SslCertificate resource to return.
     * </pre>
     *
     * <code>string ssl_certificate = 46443492 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSslCertificate() {
      sslCertificate_ = getDefaultInstance().getSslCertificate();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the SslCertificate resource to return.
     * </pre>
     *
     * <code>string ssl_certificate = 46443492 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for sslCertificate to set.
     * @return This builder for chaining.
     */
    public Builder setSslCertificateBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sslCertificate_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GetRegionSslCertificateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GetRegionSslCertificateRequest)
  private static final com.google.cloud.compute.v1.GetRegionSslCertificateRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GetRegionSslCertificateRequest();
  }

  public static com.google.cloud.compute.v1.GetRegionSslCertificateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRegionSslCertificateRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetRegionSslCertificateRequest>() {
        @java.lang.Override
        public GetRegionSslCertificateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetRegionSslCertificateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRegionSslCertificateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GetRegionSslCertificateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
