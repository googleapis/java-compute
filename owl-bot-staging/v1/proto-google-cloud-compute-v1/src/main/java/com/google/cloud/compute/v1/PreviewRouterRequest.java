// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * A request message for Routers.Preview. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.PreviewRouterRequest}
 */
public final class PreviewRouterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.PreviewRouterRequest)
    PreviewRouterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PreviewRouterRequest.newBuilder() to construct.
  private PreviewRouterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PreviewRouterRequest() {
    project_ = "";
    region_ = "";
    router_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PreviewRouterRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PreviewRouterRequest(
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
          case 1111570338: {
            java.lang.String s = input.readStringRequireUtf8();

            region_ = s;
            break;
          }
          case 1188870730: {
            java.lang.String s = input.readStringRequireUtf8();

            router_ = s;
            break;
          }
          case 1241776674: {
            com.google.cloud.compute.v1.Router.Builder subBuilder = null;
            if (routerResource_ != null) {
              subBuilder = routerResource_.toBuilder();
            }
            routerResource_ = input.readMessage(com.google.cloud.compute.v1.Router.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(routerResource_);
              routerResource_ = subBuilder.buildPartial();
            }

            break;
          }
          case 1820481738: {
            java.lang.String s = input.readStringRequireUtf8();

            project_ = s;
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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PreviewRouterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PreviewRouterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.PreviewRouterRequest.class, com.google.cloud.compute.v1.PreviewRouterRequest.Builder.class);
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

  public static final int REGION_FIELD_NUMBER = 138946292;
  private volatile java.lang.Object region_;
  /**
   * <pre>
   * Name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  @java.lang.Override
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      region_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROUTER_FIELD_NUMBER = 148608841;
  private volatile java.lang.Object router_;
  /**
   * <pre>
   * Name of the Router resource to query.
   * </pre>
   *
   * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The router.
   */
  @java.lang.Override
  public java.lang.String getRouter() {
    java.lang.Object ref = router_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      router_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the Router resource to query.
   * </pre>
   *
   * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for router.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRouterBytes() {
    java.lang.Object ref = router_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      router_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROUTER_RESOURCE_FIELD_NUMBER = 155222084;
  private com.google.cloud.compute.v1.Router routerResource_;
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the routerResource field is set.
   */
  @java.lang.Override
  public boolean hasRouterResource() {
    return routerResource_ != null;
  }
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The routerResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Router getRouterResource() {
    return routerResource_ == null ? com.google.cloud.compute.v1.Router.getDefaultInstance() : routerResource_;
  }
  /**
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.RouterOrBuilder getRouterResourceOrBuilder() {
    return getRouterResource();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 138946292, region_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(router_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 148608841, router_);
    }
    if (routerResource_ != null) {
      output.writeMessage(155222084, getRouterResource());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(138946292, region_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(router_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(148608841, router_);
    }
    if (routerResource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(155222084, getRouterResource());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.PreviewRouterRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.PreviewRouterRequest other = (com.google.cloud.compute.v1.PreviewRouterRequest) obj;

    if (!getProject()
        .equals(other.getProject())) return false;
    if (!getRegion()
        .equals(other.getRegion())) return false;
    if (!getRouter()
        .equals(other.getRouter())) return false;
    if (hasRouterResource() != other.hasRouterResource()) return false;
    if (hasRouterResource()) {
      if (!getRouterResource()
          .equals(other.getRouterResource())) return false;
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
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + getRegion().hashCode();
    hash = (37 * hash) + ROUTER_FIELD_NUMBER;
    hash = (53 * hash) + getRouter().hashCode();
    if (hasRouterResource()) {
      hash = (37 * hash) + ROUTER_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getRouterResource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.PreviewRouterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.PreviewRouterRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.PreviewRouterRequest prototype) {
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
   * A request message for Routers.Preview. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.PreviewRouterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.PreviewRouterRequest)
      com.google.cloud.compute.v1.PreviewRouterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PreviewRouterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PreviewRouterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.PreviewRouterRequest.class, com.google.cloud.compute.v1.PreviewRouterRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.PreviewRouterRequest.newBuilder()
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

      region_ = "";

      router_ = "";

      if (routerResourceBuilder_ == null) {
        routerResource_ = null;
      } else {
        routerResource_ = null;
        routerResourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_PreviewRouterRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreviewRouterRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.PreviewRouterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreviewRouterRequest build() {
      com.google.cloud.compute.v1.PreviewRouterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.PreviewRouterRequest buildPartial() {
      com.google.cloud.compute.v1.PreviewRouterRequest result = new com.google.cloud.compute.v1.PreviewRouterRequest(this);
      result.project_ = project_;
      result.region_ = region_;
      result.router_ = router_;
      if (routerResourceBuilder_ == null) {
        result.routerResource_ = routerResource_;
      } else {
        result.routerResource_ = routerResourceBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.PreviewRouterRequest) {
        return mergeFrom((com.google.cloud.compute.v1.PreviewRouterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.PreviewRouterRequest other) {
      if (other == com.google.cloud.compute.v1.PreviewRouterRequest.getDefaultInstance()) return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        onChanged();
      }
      if (!other.getRegion().isEmpty()) {
        region_ = other.region_;
        onChanged();
      }
      if (!other.getRouter().isEmpty()) {
        router_ = other.router_;
        onChanged();
      }
      if (other.hasRouterResource()) {
        mergeRouterResource(other.getRouterResource());
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
      com.google.cloud.compute.v1.PreviewRouterRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.PreviewRouterRequest) e.getUnfinishedMessage();
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

    private java.lang.Object region_ = "";
    /**
     * <pre>
     * Name of the region for this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The region.
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the region for this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for region.
     */
    public com.google.protobuf.ByteString
        getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the region for this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      region_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the region for this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      
      region_ = getDefaultInstance().getRegion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the region for this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      region_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object router_ = "";
    /**
     * <pre>
     * Name of the Router resource to query.
     * </pre>
     *
     * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The router.
     */
    public java.lang.String getRouter() {
      java.lang.Object ref = router_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        router_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the Router resource to query.
     * </pre>
     *
     * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for router.
     */
    public com.google.protobuf.ByteString
        getRouterBytes() {
      java.lang.Object ref = router_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        router_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the Router resource to query.
     * </pre>
     *
     * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The router to set.
     * @return This builder for chaining.
     */
    public Builder setRouter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      router_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the Router resource to query.
     * </pre>
     *
     * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearRouter() {
      
      router_ = getDefaultInstance().getRouter();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the Router resource to query.
     * </pre>
     *
     * <code>string router = 148608841 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for router to set.
     * @return This builder for chaining.
     */
    public Builder setRouterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      router_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.compute.v1.Router routerResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Router, com.google.cloud.compute.v1.Router.Builder, com.google.cloud.compute.v1.RouterOrBuilder> routerResourceBuilder_;
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the routerResource field is set.
     */
    public boolean hasRouterResource() {
      return routerResourceBuilder_ != null || routerResource_ != null;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The routerResource.
     */
    public com.google.cloud.compute.v1.Router getRouterResource() {
      if (routerResourceBuilder_ == null) {
        return routerResource_ == null ? com.google.cloud.compute.v1.Router.getDefaultInstance() : routerResource_;
      } else {
        return routerResourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRouterResource(com.google.cloud.compute.v1.Router value) {
      if (routerResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        routerResource_ = value;
        onChanged();
      } else {
        routerResourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setRouterResource(
        com.google.cloud.compute.v1.Router.Builder builderForValue) {
      if (routerResourceBuilder_ == null) {
        routerResource_ = builderForValue.build();
        onChanged();
      } else {
        routerResourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeRouterResource(com.google.cloud.compute.v1.Router value) {
      if (routerResourceBuilder_ == null) {
        if (routerResource_ != null) {
          routerResource_ =
            com.google.cloud.compute.v1.Router.newBuilder(routerResource_).mergeFrom(value).buildPartial();
        } else {
          routerResource_ = value;
        }
        onChanged();
      } else {
        routerResourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearRouterResource() {
      if (routerResourceBuilder_ == null) {
        routerResource_ = null;
        onChanged();
      } else {
        routerResource_ = null;
        routerResourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.compute.v1.Router.Builder getRouterResourceBuilder() {
      
      onChanged();
      return getRouterResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.compute.v1.RouterOrBuilder getRouterResourceOrBuilder() {
      if (routerResourceBuilder_ != null) {
        return routerResourceBuilder_.getMessageOrBuilder();
      } else {
        return routerResource_ == null ?
            com.google.cloud.compute.v1.Router.getDefaultInstance() : routerResource_;
      }
    }
    /**
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>.google.cloud.compute.v1.Router router_resource = 155222084 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Router, com.google.cloud.compute.v1.Router.Builder, com.google.cloud.compute.v1.RouterOrBuilder> 
        getRouterResourceFieldBuilder() {
      if (routerResourceBuilder_ == null) {
        routerResourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Router, com.google.cloud.compute.v1.Router.Builder, com.google.cloud.compute.v1.RouterOrBuilder>(
                getRouterResource(),
                getParentForChildren(),
                isClean());
        routerResource_ = null;
      }
      return routerResourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.PreviewRouterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.PreviewRouterRequest)
  private static final com.google.cloud.compute.v1.PreviewRouterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.PreviewRouterRequest();
  }

  public static com.google.cloud.compute.v1.PreviewRouterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreviewRouterRequest>
      PARSER = new com.google.protobuf.AbstractParser<PreviewRouterRequest>() {
    @java.lang.Override
    public PreviewRouterRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PreviewRouterRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PreviewRouterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreviewRouterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.PreviewRouterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

