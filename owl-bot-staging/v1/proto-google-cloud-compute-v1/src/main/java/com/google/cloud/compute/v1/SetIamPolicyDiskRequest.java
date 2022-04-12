// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * A request message for Disks.SetIamPolicy. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SetIamPolicyDiskRequest}
 */
public final class SetIamPolicyDiskRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SetIamPolicyDiskRequest)
    SetIamPolicyDiskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetIamPolicyDiskRequest.newBuilder() to construct.
  private SetIamPolicyDiskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetIamPolicyDiskRequest() {
    project_ = "";
    resource_ = "";
    zone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetIamPolicyDiskRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetIamPolicyDiskRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 29957474: {
            java.lang.String s = input.readStringRequireUtf8();

            zone_ = s;
            break;
          }
          case 1566449778: {
            java.lang.String s = input.readStringRequireUtf8();

            resource_ = s;
            break;
          }
          case 1820481738: {
            java.lang.String s = input.readStringRequireUtf8();

            project_ = s;
            break;
          }
          case -1238310438: {
            com.google.cloud.compute.v1.ZoneSetPolicyRequest.Builder subBuilder = null;
            if (zoneSetPolicyRequestResource_ != null) {
              subBuilder = zoneSetPolicyRequestResource_.toBuilder();
            }
            zoneSetPolicyRequestResource_ = input.readMessage(com.google.cloud.compute.v1.ZoneSetPolicyRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(zoneSetPolicyRequestResource_);
              zoneSetPolicyRequestResource_ = subBuilder.buildPartial();
            }

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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SetIamPolicyDiskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SetIamPolicyDiskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SetIamPolicyDiskRequest.class, com.google.cloud.compute.v1.SetIamPolicyDiskRequest.Builder.class);
  }

  public static final int PROJECT_FIELD_NUMBER = 227560217;
  private volatile java.lang.Object project_;
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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

  public static final int ZONE_FIELD_NUMBER = 3744684;
  private volatile java.lang.Object zone_;
  /**
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The zone.
   */
  @java.lang.Override
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for zone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_SET_POLICY_REQUEST_RESOURCE_FIELD_NUMBER = 382082107;
  private com.google.cloud.compute.v1.ZoneSetPolicyRequest zoneSetPolicyRequestResource_;
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the zoneSetPolicyRequestResource field is set.
   */
  @java.lang.Override
  public boolean hasZoneSetPolicyRequestResource() {
    return zoneSetPolicyRequestResource_ != null;
  }
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The zoneSetPolicyRequestResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ZoneSetPolicyRequest getZoneSetPolicyRequestResource() {
    return zoneSetPolicyRequestResource_ == null ? com.google.cloud.compute.v1.ZoneSetPolicyRequest.getDefaultInstance() : zoneSetPolicyRequestResource_;
  }
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ZoneSetPolicyRequestOrBuilder getZoneSetPolicyRequestResourceOrBuilder() {
    return getZoneSetPolicyRequestResource();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3744684, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 195806222, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    if (zoneSetPolicyRequestResource_ != null) {
      output.writeMessage(382082107, getZoneSetPolicyRequestResource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3744684, zone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(195806222, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
    }
    if (zoneSetPolicyRequestResource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(382082107, getZoneSetPolicyRequestResource());
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
    if (!(obj instanceof com.google.cloud.compute.v1.SetIamPolicyDiskRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SetIamPolicyDiskRequest other = (com.google.cloud.compute.v1.SetIamPolicyDiskRequest) obj;

    if (!getProject()
        .equals(other.getProject())) return false;
    if (!getResource()
        .equals(other.getResource())) return false;
    if (!getZone()
        .equals(other.getZone())) return false;
    if (hasZoneSetPolicyRequestResource() != other.hasZoneSetPolicyRequestResource()) return false;
    if (hasZoneSetPolicyRequestResource()) {
      if (!getZoneSetPolicyRequestResource()
          .equals(other.getZoneSetPolicyRequestResource())) return false;
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
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    if (hasZoneSetPolicyRequestResource()) {
      hash = (37 * hash) + ZONE_SET_POLICY_REQUEST_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getZoneSetPolicyRequestResource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.SetIamPolicyDiskRequest prototype) {
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
   * A request message for Disks.SetIamPolicy. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SetIamPolicyDiskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SetIamPolicyDiskRequest)
      com.google.cloud.compute.v1.SetIamPolicyDiskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SetIamPolicyDiskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SetIamPolicyDiskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SetIamPolicyDiskRequest.class, com.google.cloud.compute.v1.SetIamPolicyDiskRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SetIamPolicyDiskRequest.newBuilder()
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
      project_ = "";

      resource_ = "";

      zone_ = "";

      if (zoneSetPolicyRequestResourceBuilder_ == null) {
        zoneSetPolicyRequestResource_ = null;
      } else {
        zoneSetPolicyRequestResource_ = null;
        zoneSetPolicyRequestResourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_SetIamPolicyDiskRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetIamPolicyDiskRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SetIamPolicyDiskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetIamPolicyDiskRequest build() {
      com.google.cloud.compute.v1.SetIamPolicyDiskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetIamPolicyDiskRequest buildPartial() {
      com.google.cloud.compute.v1.SetIamPolicyDiskRequest result = new com.google.cloud.compute.v1.SetIamPolicyDiskRequest(this);
      result.project_ = project_;
      result.resource_ = resource_;
      result.zone_ = zone_;
      if (zoneSetPolicyRequestResourceBuilder_ == null) {
        result.zoneSetPolicyRequestResource_ = zoneSetPolicyRequestResource_;
      } else {
        result.zoneSetPolicyRequestResource_ = zoneSetPolicyRequestResourceBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.compute.v1.SetIamPolicyDiskRequest) {
        return mergeFrom((com.google.cloud.compute.v1.SetIamPolicyDiskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SetIamPolicyDiskRequest other) {
      if (other == com.google.cloud.compute.v1.SetIamPolicyDiskRequest.getDefaultInstance()) return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        onChanged();
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        onChanged();
      }
      if (other.hasZoneSetPolicyRequestResource()) {
        mergeZoneSetPolicyRequestResource(other.getZoneSetPolicyRequestResource());
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
      com.google.cloud.compute.v1.SetIamPolicyDiskRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.SetIamPolicyDiskRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object project_ = "";
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString
        getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      project_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      
      project_ = getDefaultInstance().getProject();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      project_ = value;
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

    private java.lang.Object zone_ = "";
    /**
     * <pre>
     * The name of the zone for this request.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The zone.
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the zone for this request.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for zone.
     */
    public com.google.protobuf.ByteString
        getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the zone for this request.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    public Builder setZone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the zone for this request.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearZone() {
      
      zone_ = getDefaultInstance().getZone();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the zone for this request.
     * </pre>
     *
     * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    public Builder setZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zone_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.ZoneSetPolicyRequest zoneSetPolicyRequestResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ZoneSetPolicyRequest, com.google.cloud.compute.v1.ZoneSetPolicyRequest.Builder, com.google.cloud.compute.v1.ZoneSetPolicyRequestOrBuilder> zoneSetPolicyRequestResourceBuilder_;
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the zoneSetPolicyRequestResource field is set.
     */
    public boolean hasZoneSetPolicyRequestResource() {
      return zoneSetPolicyRequestResourceBuilder_ != null || zoneSetPolicyRequestResource_ != null;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The zoneSetPolicyRequestResource.
     */
    public com.google.cloud.compute.v1.ZoneSetPolicyRequest getZoneSetPolicyRequestResource() {
      if (zoneSetPolicyRequestResourceBuilder_ == null) {
        return zoneSetPolicyRequestResource_ == null ? com.google.cloud.compute.v1.ZoneSetPolicyRequest.getDefaultInstance() : zoneSetPolicyRequestResource_;
      } else {
        return zoneSetPolicyRequestResourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setZoneSetPolicyRequestResource(com.google.cloud.compute.v1.ZoneSetPolicyRequest value) {
      if (zoneSetPolicyRequestResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        zoneSetPolicyRequestResource_ = value;
        onChanged();
      } else {
        zoneSetPolicyRequestResourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setZoneSetPolicyRequestResource(
        com.google.cloud.compute.v1.ZoneSetPolicyRequest.Builder builderForValue) {
      if (zoneSetPolicyRequestResourceBuilder_ == null) {
        zoneSetPolicyRequestResource_ = builderForValue.build();
        onChanged();
      } else {
        zoneSetPolicyRequestResourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeZoneSetPolicyRequestResource(com.google.cloud.compute.v1.ZoneSetPolicyRequest value) {
      if (zoneSetPolicyRequestResourceBuilder_ == null) {
        if (zoneSetPolicyRequestResource_ != null) {
          zoneSetPolicyRequestResource_ =
            com.google.cloud.compute.v1.ZoneSetPolicyRequest.newBuilder(zoneSetPolicyRequestResource_).mergeFrom(value).buildPartial();
        } else {
          zoneSetPolicyRequestResource_ = value;
        }
        onChanged();
      } else {
        zoneSetPolicyRequestResourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearZoneSetPolicyRequestResource() {
      if (zoneSetPolicyRequestResourceBuilder_ == null) {
        zoneSetPolicyRequestResource_ = null;
        onChanged();
      } else {
        zoneSetPolicyRequestResource_ = null;
        zoneSetPolicyRequestResourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.compute.v1.ZoneSetPolicyRequest.Builder getZoneSetPolicyRequestResourceBuilder() {
      
      onChanged();
      return getZoneSetPolicyRequestResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.compute.v1.ZoneSetPolicyRequestOrBuilder getZoneSetPolicyRequestResourceOrBuilder() {
      if (zoneSetPolicyRequestResourceBuilder_ != null) {
        return zoneSetPolicyRequestResourceBuilder_.getMessageOrBuilder();
      } else {
        return zoneSetPolicyRequestResource_ == null ?
            com.google.cloud.compute.v1.ZoneSetPolicyRequest.getDefaultInstance() : zoneSetPolicyRequestResource_;
      }
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.ZoneSetPolicyRequest zone_set_policy_request_resource = 382082107 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ZoneSetPolicyRequest, com.google.cloud.compute.v1.ZoneSetPolicyRequest.Builder, com.google.cloud.compute.v1.ZoneSetPolicyRequestOrBuilder> 
        getZoneSetPolicyRequestResourceFieldBuilder() {
      if (zoneSetPolicyRequestResourceBuilder_ == null) {
        zoneSetPolicyRequestResourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.ZoneSetPolicyRequest, com.google.cloud.compute.v1.ZoneSetPolicyRequest.Builder, com.google.cloud.compute.v1.ZoneSetPolicyRequestOrBuilder>(
                getZoneSetPolicyRequestResource(),
                getParentForChildren(),
                isClean());
        zoneSetPolicyRequestResource_ = null;
      }
      return zoneSetPolicyRequestResourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SetIamPolicyDiskRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SetIamPolicyDiskRequest)
  private static final com.google.cloud.compute.v1.SetIamPolicyDiskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SetIamPolicyDiskRequest();
  }

  public static com.google.cloud.compute.v1.SetIamPolicyDiskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetIamPolicyDiskRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetIamPolicyDiskRequest>() {
    @java.lang.Override
    public SetIamPolicyDiskRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetIamPolicyDiskRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetIamPolicyDiskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetIamPolicyDiskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SetIamPolicyDiskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

