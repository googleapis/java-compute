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
 * Protobuf type {@code google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit}
 */
public final class ServiceAttachmentConsumerProjectLimit
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit)
    ServiceAttachmentConsumerProjectLimitOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ServiceAttachmentConsumerProjectLimit.newBuilder() to construct.
  private ServiceAttachmentConsumerProjectLimit(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ServiceAttachmentConsumerProjectLimit() {
    networkUrl_ = "";
    projectIdOrNum_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ServiceAttachmentConsumerProjectLimit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ServiceAttachmentConsumerProjectLimit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ServiceAttachmentConsumerProjectLimit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit.class,
            com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit.Builder.class);
  }

  private int bitField0_;
  public static final int CONNECTION_LIMIT_FIELD_NUMBER = 131403546;
  private int connectionLimit_;
  /**
   *
   *
   * <pre>
   * The value of the limit to set.
   * </pre>
   *
   * <code>optional uint32 connection_limit = 131403546;</code>
   *
   * @return Whether the connectionLimit field is set.
   */
  @java.lang.Override
  public boolean hasConnectionLimit() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The value of the limit to set.
   * </pre>
   *
   * <code>optional uint32 connection_limit = 131403546;</code>
   *
   * @return The connectionLimit.
   */
  @java.lang.Override
  public int getConnectionLimit() {
    return connectionLimit_;
  }

  public static final int NETWORK_URL_FIELD_NUMBER = 207194078;
  private volatile java.lang.Object networkUrl_;
  /**
   *
   *
   * <pre>
   * The network URL for the network to set the limit for.
   * </pre>
   *
   * <code>optional string network_url = 207194078;</code>
   *
   * @return Whether the networkUrl field is set.
   */
  @java.lang.Override
  public boolean hasNetworkUrl() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The network URL for the network to set the limit for.
   * </pre>
   *
   * <code>optional string network_url = 207194078;</code>
   *
   * @return The networkUrl.
   */
  @java.lang.Override
  public java.lang.String getNetworkUrl() {
    java.lang.Object ref = networkUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      networkUrl_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The network URL for the network to set the limit for.
   * </pre>
   *
   * <code>optional string network_url = 207194078;</code>
   *
   * @return The bytes for networkUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNetworkUrlBytes() {
    java.lang.Object ref = networkUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      networkUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_ID_OR_NUM_FIELD_NUMBER = 349783336;
  private volatile java.lang.Object projectIdOrNum_;
  /**
   *
   *
   * <pre>
   * The project id or number for the project to set the limit for.
   * </pre>
   *
   * <code>optional string project_id_or_num = 349783336;</code>
   *
   * @return Whether the projectIdOrNum field is set.
   */
  @java.lang.Override
  public boolean hasProjectIdOrNum() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * The project id or number for the project to set the limit for.
   * </pre>
   *
   * <code>optional string project_id_or_num = 349783336;</code>
   *
   * @return The projectIdOrNum.
   */
  @java.lang.Override
  public java.lang.String getProjectIdOrNum() {
    java.lang.Object ref = projectIdOrNum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectIdOrNum_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The project id or number for the project to set the limit for.
   * </pre>
   *
   * <code>optional string project_id_or_num = 349783336;</code>
   *
   * @return The bytes for projectIdOrNum.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectIdOrNumBytes() {
    java.lang.Object ref = projectIdOrNum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectIdOrNum_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeUInt32(131403546, connectionLimit_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 207194078, networkUrl_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 349783336, projectIdOrNum_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeUInt32Size(131403546, connectionLimit_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(207194078, networkUrl_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(349783336, projectIdOrNum_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit other =
        (com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit) obj;

    if (hasConnectionLimit() != other.hasConnectionLimit()) return false;
    if (hasConnectionLimit()) {
      if (getConnectionLimit() != other.getConnectionLimit()) return false;
    }
    if (hasNetworkUrl() != other.hasNetworkUrl()) return false;
    if (hasNetworkUrl()) {
      if (!getNetworkUrl().equals(other.getNetworkUrl())) return false;
    }
    if (hasProjectIdOrNum() != other.hasProjectIdOrNum()) return false;
    if (hasProjectIdOrNum()) {
      if (!getProjectIdOrNum().equals(other.getProjectIdOrNum())) return false;
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
    if (hasConnectionLimit()) {
      hash = (37 * hash) + CONNECTION_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getConnectionLimit();
    }
    if (hasNetworkUrl()) {
      hash = (37 * hash) + NETWORK_URL_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkUrl().hashCode();
    }
    if (hasProjectIdOrNum()) {
      hash = (37 * hash) + PROJECT_ID_OR_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getProjectIdOrNum().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit parseFrom(
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
      com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit)
      com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ServiceAttachmentConsumerProjectLimit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ServiceAttachmentConsumerProjectLimit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit.class,
              com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      connectionLimit_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      networkUrl_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      projectIdOrNum_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ServiceAttachmentConsumerProjectLimit_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit build() {
      com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit buildPartial() {
      com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit result =
          new com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.connectionLimit_ = connectionLimit_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.networkUrl_ = networkUrl_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.projectIdOrNum_ = projectIdOrNum_;
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
      if (other instanceof com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit) {
        return mergeFrom((com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit other) {
      if (other
          == com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit.getDefaultInstance())
        return this;
      if (other.hasConnectionLimit()) {
        setConnectionLimit(other.getConnectionLimit());
      }
      if (other.hasNetworkUrl()) {
        bitField0_ |= 0x00000002;
        networkUrl_ = other.networkUrl_;
        onChanged();
      }
      if (other.hasProjectIdOrNum()) {
        bitField0_ |= 0x00000004;
        projectIdOrNum_ = other.projectIdOrNum_;
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
            case 1051228368:
              {
                connectionLimit_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 1051228368
            case 1657552626:
              {
                networkUrl_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 1657552626
            case -1496700606:
              {
                projectIdOrNum_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case -1496700606
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

    private int connectionLimit_;
    /**
     *
     *
     * <pre>
     * The value of the limit to set.
     * </pre>
     *
     * <code>optional uint32 connection_limit = 131403546;</code>
     *
     * @return Whether the connectionLimit field is set.
     */
    @java.lang.Override
    public boolean hasConnectionLimit() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The value of the limit to set.
     * </pre>
     *
     * <code>optional uint32 connection_limit = 131403546;</code>
     *
     * @return The connectionLimit.
     */
    @java.lang.Override
    public int getConnectionLimit() {
      return connectionLimit_;
    }
    /**
     *
     *
     * <pre>
     * The value of the limit to set.
     * </pre>
     *
     * <code>optional uint32 connection_limit = 131403546;</code>
     *
     * @param value The connectionLimit to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionLimit(int value) {
      bitField0_ |= 0x00000001;
      connectionLimit_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the limit to set.
     * </pre>
     *
     * <code>optional uint32 connection_limit = 131403546;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConnectionLimit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      connectionLimit_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object networkUrl_ = "";
    /**
     *
     *
     * <pre>
     * The network URL for the network to set the limit for.
     * </pre>
     *
     * <code>optional string network_url = 207194078;</code>
     *
     * @return Whether the networkUrl field is set.
     */
    public boolean hasNetworkUrl() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The network URL for the network to set the limit for.
     * </pre>
     *
     * <code>optional string network_url = 207194078;</code>
     *
     * @return The networkUrl.
     */
    public java.lang.String getNetworkUrl() {
      java.lang.Object ref = networkUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        networkUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The network URL for the network to set the limit for.
     * </pre>
     *
     * <code>optional string network_url = 207194078;</code>
     *
     * @return The bytes for networkUrl.
     */
    public com.google.protobuf.ByteString getNetworkUrlBytes() {
      java.lang.Object ref = networkUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        networkUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The network URL for the network to set the limit for.
     * </pre>
     *
     * <code>optional string network_url = 207194078;</code>
     *
     * @param value The networkUrl to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      networkUrl_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The network URL for the network to set the limit for.
     * </pre>
     *
     * <code>optional string network_url = 207194078;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNetworkUrl() {
      bitField0_ = (bitField0_ & ~0x00000002);
      networkUrl_ = getDefaultInstance().getNetworkUrl();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The network URL for the network to set the limit for.
     * </pre>
     *
     * <code>optional string network_url = 207194078;</code>
     *
     * @param value The bytes for networkUrl to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      networkUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object projectIdOrNum_ = "";
    /**
     *
     *
     * <pre>
     * The project id or number for the project to set the limit for.
     * </pre>
     *
     * <code>optional string project_id_or_num = 349783336;</code>
     *
     * @return Whether the projectIdOrNum field is set.
     */
    public boolean hasProjectIdOrNum() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The project id or number for the project to set the limit for.
     * </pre>
     *
     * <code>optional string project_id_or_num = 349783336;</code>
     *
     * @return The projectIdOrNum.
     */
    public java.lang.String getProjectIdOrNum() {
      java.lang.Object ref = projectIdOrNum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectIdOrNum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The project id or number for the project to set the limit for.
     * </pre>
     *
     * <code>optional string project_id_or_num = 349783336;</code>
     *
     * @return The bytes for projectIdOrNum.
     */
    public com.google.protobuf.ByteString getProjectIdOrNumBytes() {
      java.lang.Object ref = projectIdOrNum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectIdOrNum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The project id or number for the project to set the limit for.
     * </pre>
     *
     * <code>optional string project_id_or_num = 349783336;</code>
     *
     * @param value The projectIdOrNum to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdOrNum(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      projectIdOrNum_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The project id or number for the project to set the limit for.
     * </pre>
     *
     * <code>optional string project_id_or_num = 349783336;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectIdOrNum() {
      bitField0_ = (bitField0_ & ~0x00000004);
      projectIdOrNum_ = getDefaultInstance().getProjectIdOrNum();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The project id or number for the project to set the limit for.
     * </pre>
     *
     * <code>optional string project_id_or_num = 349783336;</code>
     *
     * @param value The bytes for projectIdOrNum to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdOrNumBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      projectIdOrNum_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit)
  private static final com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit();
  }

  public static com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceAttachmentConsumerProjectLimit> PARSER =
      new com.google.protobuf.AbstractParser<ServiceAttachmentConsumerProjectLimit>() {
        @java.lang.Override
        public ServiceAttachmentConsumerProjectLimit parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServiceAttachmentConsumerProjectLimit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceAttachmentConsumerProjectLimit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ServiceAttachmentConsumerProjectLimit
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
