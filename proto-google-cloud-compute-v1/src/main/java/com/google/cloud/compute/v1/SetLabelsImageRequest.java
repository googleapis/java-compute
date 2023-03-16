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
 * A request message for Images.SetLabels. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SetLabelsImageRequest}
 */
public final class SetLabelsImageRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SetLabelsImageRequest)
    SetLabelsImageRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SetLabelsImageRequest.newBuilder() to construct.
  private SetLabelsImageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SetLabelsImageRequest() {
    project_ = "";
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SetLabelsImageRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SetLabelsImageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SetLabelsImageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SetLabelsImageRequest.class,
            com.google.cloud.compute.v1.SetLabelsImageRequest.Builder.class);
  }

  public static final int GLOBAL_SET_LABELS_REQUEST_RESOURCE_FIELD_NUMBER = 319917189;
  private com.google.cloud.compute.v1.GlobalSetLabelsRequest globalSetLabelsRequestResource_;
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the globalSetLabelsRequestResource field is set.
   */
  @java.lang.Override
  public boolean hasGlobalSetLabelsRequestResource() {
    return globalSetLabelsRequestResource_ != null;
  }
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The globalSetLabelsRequestResource.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.GlobalSetLabelsRequest getGlobalSetLabelsRequestResource() {
    return globalSetLabelsRequestResource_ == null
        ? com.google.cloud.compute.v1.GlobalSetLabelsRequest.getDefaultInstance()
        : globalSetLabelsRequestResource_;
  }
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.GlobalSetLabelsRequestOrBuilder
      getGlobalSetLabelsRequestResourceOrBuilder() {
    return globalSetLabelsRequestResource_ == null
        ? com.google.cloud.compute.v1.GlobalSetLabelsRequest.getDefaultInstance()
        : globalSetLabelsRequestResource_;
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
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
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
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
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

  public static final int RESOURCE_FIELD_NUMBER = 195806222;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resource_ = "";
  /**
   *
   *
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 195806222, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    if (globalSetLabelsRequestResource_ != null) {
      output.writeMessage(319917189, getGlobalSetLabelsRequestResource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(195806222, resource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
    }
    if (globalSetLabelsRequestResource_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              319917189, getGlobalSetLabelsRequestResource());
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
    if (!(obj instanceof com.google.cloud.compute.v1.SetLabelsImageRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SetLabelsImageRequest other =
        (com.google.cloud.compute.v1.SetLabelsImageRequest) obj;

    if (hasGlobalSetLabelsRequestResource() != other.hasGlobalSetLabelsRequestResource())
      return false;
    if (hasGlobalSetLabelsRequestResource()) {
      if (!getGlobalSetLabelsRequestResource().equals(other.getGlobalSetLabelsRequestResource()))
        return false;
    }
    if (!getProject().equals(other.getProject())) return false;
    if (!getResource().equals(other.getResource())) return false;
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
    if (hasGlobalSetLabelsRequestResource()) {
      hash = (37 * hash) + GLOBAL_SET_LABELS_REQUEST_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getGlobalSetLabelsRequestResource().hashCode();
    }
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.SetLabelsImageRequest prototype) {
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
   * A request message for Images.SetLabels. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SetLabelsImageRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SetLabelsImageRequest)
      com.google.cloud.compute.v1.SetLabelsImageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SetLabelsImageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SetLabelsImageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SetLabelsImageRequest.class,
              com.google.cloud.compute.v1.SetLabelsImageRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SetLabelsImageRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      globalSetLabelsRequestResource_ = null;
      if (globalSetLabelsRequestResourceBuilder_ != null) {
        globalSetLabelsRequestResourceBuilder_.dispose();
        globalSetLabelsRequestResourceBuilder_ = null;
      }
      project_ = "";
      resource_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SetLabelsImageRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetLabelsImageRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SetLabelsImageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetLabelsImageRequest build() {
      com.google.cloud.compute.v1.SetLabelsImageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SetLabelsImageRequest buildPartial() {
      com.google.cloud.compute.v1.SetLabelsImageRequest result =
          new com.google.cloud.compute.v1.SetLabelsImageRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.SetLabelsImageRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.globalSetLabelsRequestResource_ =
            globalSetLabelsRequestResourceBuilder_ == null
                ? globalSetLabelsRequestResource_
                : globalSetLabelsRequestResourceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.project_ = project_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resource_ = resource_;
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
      if (other instanceof com.google.cloud.compute.v1.SetLabelsImageRequest) {
        return mergeFrom((com.google.cloud.compute.v1.SetLabelsImageRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SetLabelsImageRequest other) {
      if (other == com.google.cloud.compute.v1.SetLabelsImageRequest.getDefaultInstance())
        return this;
      if (other.hasGlobalSetLabelsRequestResource()) {
        mergeGlobalSetLabelsRequestResource(other.getGlobalSetLabelsRequestResource());
      }
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
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
            case 1566449778:
              {
                resource_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 1566449778
            case 1820481738:
              {
                project_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 1820481738
            case -1735629782:
              {
                input.readMessage(
                    getGlobalSetLabelsRequestResourceFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case -1735629782
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

    private com.google.cloud.compute.v1.GlobalSetLabelsRequest globalSetLabelsRequestResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.GlobalSetLabelsRequest,
            com.google.cloud.compute.v1.GlobalSetLabelsRequest.Builder,
            com.google.cloud.compute.v1.GlobalSetLabelsRequestOrBuilder>
        globalSetLabelsRequestResourceBuilder_;
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the globalSetLabelsRequestResource field is set.
     */
    public boolean hasGlobalSetLabelsRequestResource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The globalSetLabelsRequestResource.
     */
    public com.google.cloud.compute.v1.GlobalSetLabelsRequest getGlobalSetLabelsRequestResource() {
      if (globalSetLabelsRequestResourceBuilder_ == null) {
        return globalSetLabelsRequestResource_ == null
            ? com.google.cloud.compute.v1.GlobalSetLabelsRequest.getDefaultInstance()
            : globalSetLabelsRequestResource_;
      } else {
        return globalSetLabelsRequestResourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGlobalSetLabelsRequestResource(
        com.google.cloud.compute.v1.GlobalSetLabelsRequest value) {
      if (globalSetLabelsRequestResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        globalSetLabelsRequestResource_ = value;
      } else {
        globalSetLabelsRequestResourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGlobalSetLabelsRequestResource(
        com.google.cloud.compute.v1.GlobalSetLabelsRequest.Builder builderForValue) {
      if (globalSetLabelsRequestResourceBuilder_ == null) {
        globalSetLabelsRequestResource_ = builderForValue.build();
      } else {
        globalSetLabelsRequestResourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGlobalSetLabelsRequestResource(
        com.google.cloud.compute.v1.GlobalSetLabelsRequest value) {
      if (globalSetLabelsRequestResourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && globalSetLabelsRequestResource_ != null
            && globalSetLabelsRequestResource_
                != com.google.cloud.compute.v1.GlobalSetLabelsRequest.getDefaultInstance()) {
          getGlobalSetLabelsRequestResourceBuilder().mergeFrom(value);
        } else {
          globalSetLabelsRequestResource_ = value;
        }
      } else {
        globalSetLabelsRequestResourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGlobalSetLabelsRequestResource() {
      bitField0_ = (bitField0_ & ~0x00000001);
      globalSetLabelsRequestResource_ = null;
      if (globalSetLabelsRequestResourceBuilder_ != null) {
        globalSetLabelsRequestResourceBuilder_.dispose();
        globalSetLabelsRequestResourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.compute.v1.GlobalSetLabelsRequest.Builder
        getGlobalSetLabelsRequestResourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGlobalSetLabelsRequestResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.compute.v1.GlobalSetLabelsRequestOrBuilder
        getGlobalSetLabelsRequestResourceOrBuilder() {
      if (globalSetLabelsRequestResourceBuilder_ != null) {
        return globalSetLabelsRequestResourceBuilder_.getMessageOrBuilder();
      } else {
        return globalSetLabelsRequestResource_ == null
            ? com.google.cloud.compute.v1.GlobalSetLabelsRequest.getDefaultInstance()
            : globalSetLabelsRequestResource_;
      }
    }
    /**
     *
     *
     * <pre>
     * The body resource for this request
     * </pre>
     *
     * <code>
     * .google.cloud.compute.v1.GlobalSetLabelsRequest global_set_labels_request_resource = 319917189 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.GlobalSetLabelsRequest,
            com.google.cloud.compute.v1.GlobalSetLabelsRequest.Builder,
            com.google.cloud.compute.v1.GlobalSetLabelsRequestOrBuilder>
        getGlobalSetLabelsRequestResourceFieldBuilder() {
      if (globalSetLabelsRequestResourceBuilder_ == null) {
        globalSetLabelsRequestResourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.GlobalSetLabelsRequest,
                com.google.cloud.compute.v1.GlobalSetLabelsRequest.Builder,
                com.google.cloud.compute.v1.GlobalSetLabelsRequestOrBuilder>(
                getGlobalSetLabelsRequestResource(), getParentForChildren(), isClean());
        globalSetLabelsRequestResource_ = null;
      }
      return globalSetLabelsRequestResourceBuilder_;
    }

    private java.lang.Object project_ = "";
    /**
     *
     *
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>
     * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
     * </code>
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
     * <code>
     * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
     * </code>
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
     * <code>
     * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
     * </code>
     *
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      project_ = value;
      bitField0_ |= 0x00000002;
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
     * <code>
     * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      project_ = getDefaultInstance().getProject();
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * <code>
     * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
     * </code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object resource_ = "";
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resource_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResource() {
      resource_ = getDefaultInstance().getResource();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name or id of the resource for this request.
     * </pre>
     *
     * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resource_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SetLabelsImageRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SetLabelsImageRequest)
  private static final com.google.cloud.compute.v1.SetLabelsImageRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SetLabelsImageRequest();
  }

  public static com.google.cloud.compute.v1.SetLabelsImageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetLabelsImageRequest> PARSER =
      new com.google.protobuf.AbstractParser<SetLabelsImageRequest>() {
        @java.lang.Override
        public SetLabelsImageRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetLabelsImageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetLabelsImageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SetLabelsImageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
