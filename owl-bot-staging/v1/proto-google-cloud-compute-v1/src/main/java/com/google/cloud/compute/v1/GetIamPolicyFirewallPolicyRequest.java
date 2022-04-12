// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * A request message for FirewallPolicies.GetIamPolicy. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest}
 */
public final class GetIamPolicyFirewallPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest)
    GetIamPolicyFirewallPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetIamPolicyFirewallPolicyRequest.newBuilder() to construct.
  private GetIamPolicyFirewallPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetIamPolicyFirewallPolicyRequest() {
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetIamPolicyFirewallPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetIamPolicyFirewallPolicyRequest(
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
          case 1566449778: {
            java.lang.String s = input.readStringRequireUtf8();

            resource_ = s;
            break;
          }
          case -301207064: {
            bitField0_ |= 0x00000001;
            optionsRequestedPolicyVersion_ = input.readInt32();
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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetIamPolicyFirewallPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetIamPolicyFirewallPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest.class, com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int OPTIONS_REQUESTED_POLICY_VERSION_FIELD_NUMBER = 499220029;
  private int optionsRequestedPolicyVersion_;
  /**
   * <pre>
   * Requested IAM Policy version.
   * </pre>
   *
   * <code>optional int32 options_requested_policy_version = 499220029;</code>
   * @return Whether the optionsRequestedPolicyVersion field is set.
   */
  @java.lang.Override
  public boolean hasOptionsRequestedPolicyVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Requested IAM Policy version.
   * </pre>
   *
   * <code>optional int32 options_requested_policy_version = 499220029;</code>
   * @return The optionsRequestedPolicyVersion.
   */
  @java.lang.Override
  public int getOptionsRequestedPolicyVersion() {
    return optionsRequestedPolicyVersion_;
  }

  public static final int RESOURCE_FIELD_NUMBER = 195806222;
  private volatile java.lang.Object resource_;
  /**
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resource_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 195806222, resource_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(499220029, optionsRequestedPolicyVersion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(195806222, resource_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(499220029, optionsRequestedPolicyVersion_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest other = (com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest) obj;

    if (hasOptionsRequestedPolicyVersion() != other.hasOptionsRequestedPolicyVersion()) return false;
    if (hasOptionsRequestedPolicyVersion()) {
      if (getOptionsRequestedPolicyVersion()
          != other.getOptionsRequestedPolicyVersion()) return false;
    }
    if (!getResource()
        .equals(other.getResource())) return false;
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
    if (hasOptionsRequestedPolicyVersion()) {
      hash = (37 * hash) + OPTIONS_REQUESTED_POLICY_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getOptionsRequestedPolicyVersion();
    }
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest prototype) {
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
   * A request message for FirewallPolicies.GetIamPolicy. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest)
      com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetIamPolicyFirewallPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetIamPolicyFirewallPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest.class, com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest.newBuilder()
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
      optionsRequestedPolicyVersion_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      resource_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetIamPolicyFirewallPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest build() {
      com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest buildPartial() {
      com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest result = new com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.optionsRequestedPolicyVersion_ = optionsRequestedPolicyVersion_;
        to_bitField0_ |= 0x00000001;
      }
      result.resource_ = resource_;
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
      if (other instanceof com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest) {
        return mergeFrom((com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest other) {
      if (other == com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest.getDefaultInstance()) return this;
      if (other.hasOptionsRequestedPolicyVersion()) {
        setOptionsRequestedPolicyVersion(other.getOptionsRequestedPolicyVersion());
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
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
      com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int optionsRequestedPolicyVersion_ ;
    /**
     * <pre>
     * Requested IAM Policy version.
     * </pre>
     *
     * <code>optional int32 options_requested_policy_version = 499220029;</code>
     * @return Whether the optionsRequestedPolicyVersion field is set.
     */
    @java.lang.Override
    public boolean hasOptionsRequestedPolicyVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Requested IAM Policy version.
     * </pre>
     *
     * <code>optional int32 options_requested_policy_version = 499220029;</code>
     * @return The optionsRequestedPolicyVersion.
     */
    @java.lang.Override
    public int getOptionsRequestedPolicyVersion() {
      return optionsRequestedPolicyVersion_;
    }
    /**
     * <pre>
     * Requested IAM Policy version.
     * </pre>
     *
     * <code>optional int32 options_requested_policy_version = 499220029;</code>
     * @param value The optionsRequestedPolicyVersion to set.
     * @return This builder for chaining.
     */
    public Builder setOptionsRequestedPolicyVersion(int value) {
      bitField0_ |= 0x00000001;
      optionsRequestedPolicyVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requested IAM Policy version.
     * </pre>
     *
     * <code>optional int32 options_requested_policy_version = 499220029;</code>
     * @return This builder for chaining.
     */
    public Builder clearOptionsRequestedPolicyVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      optionsRequestedPolicyVersion_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString
        getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearResource() {
      
      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resource_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest)
  private static final com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest();
  }

  public static com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetIamPolicyFirewallPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetIamPolicyFirewallPolicyRequest>() {
    @java.lang.Override
    public GetIamPolicyFirewallPolicyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetIamPolicyFirewallPolicyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetIamPolicyFirewallPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetIamPolicyFirewallPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GetIamPolicyFirewallPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

