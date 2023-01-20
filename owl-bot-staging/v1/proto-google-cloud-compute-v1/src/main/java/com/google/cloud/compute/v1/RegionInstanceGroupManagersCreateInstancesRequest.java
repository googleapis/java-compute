// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * RegionInstanceGroupManagers.createInstances
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest}
 */
public final class RegionInstanceGroupManagersCreateInstancesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest)
    RegionInstanceGroupManagersCreateInstancesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegionInstanceGroupManagersCreateInstancesRequest.newBuilder() to construct.
  private RegionInstanceGroupManagersCreateInstancesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegionInstanceGroupManagersCreateInstancesRequest() {
    instances_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegionInstanceGroupManagersCreateInstancesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersCreateInstancesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersCreateInstancesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest.class, com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest.Builder.class);
  }

  public static final int INSTANCES_FIELD_NUMBER = 29097598;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> instances_;
  /**
   * <pre>
   * [Required] List of specifications of per-instance configs.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> getInstancesList() {
    return instances_;
  }
  /**
   * <pre>
   * [Required] List of specifications of per-instance configs.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.PerInstanceConfigOrBuilder> 
      getInstancesOrBuilderList() {
    return instances_;
  }
  /**
   * <pre>
   * [Required] List of specifications of per-instance configs.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
   */
  @java.lang.Override
  public int getInstancesCount() {
    return instances_.size();
  }
  /**
   * <pre>
   * [Required] List of specifications of per-instance configs.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.PerInstanceConfig getInstances(int index) {
    return instances_.get(index);
  }
  /**
   * <pre>
   * [Required] List of specifications of per-instance configs.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.PerInstanceConfigOrBuilder getInstancesOrBuilder(
      int index) {
    return instances_.get(index);
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
    for (int i = 0; i < instances_.size(); i++) {
      output.writeMessage(29097598, instances_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < instances_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(29097598, instances_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest other = (com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest) obj;

    if (!getInstancesList()
        .equals(other.getInstancesList())) return false;
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
    if (getInstancesCount() > 0) {
      hash = (37 * hash) + INSTANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInstancesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest prototype) {
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
   * RegionInstanceGroupManagers.createInstances
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest)
      com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersCreateInstancesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersCreateInstancesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest.class, com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest.newBuilder()
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
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
      } else {
        instances_ = null;
        instancesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagersCreateInstancesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest build() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest buildPartial() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest result = new com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest result) {
      if (instancesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          instances_ = java.util.Collections.unmodifiableList(instances_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.instances_ = instances_;
      } else {
        result.instances_ = instancesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest) {
        return mergeFrom((com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest other) {
      if (other == com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest.getDefaultInstance()) return this;
      if (instancesBuilder_ == null) {
        if (!other.instances_.isEmpty()) {
          if (instances_.isEmpty()) {
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInstancesIsMutable();
            instances_.addAll(other.instances_);
          }
          onChanged();
        }
      } else {
        if (!other.instances_.isEmpty()) {
          if (instancesBuilder_.isEmpty()) {
            instancesBuilder_.dispose();
            instancesBuilder_ = null;
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000001);
            instancesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInstancesFieldBuilder() : null;
          } else {
            instancesBuilder_.addAllMessages(other.instances_);
          }
        }
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
            case 232780786: {
              com.google.cloud.compute.v1.PerInstanceConfig m =
                  input.readMessage(
                      com.google.cloud.compute.v1.PerInstanceConfig.parser(),
                      extensionRegistry);
              if (instancesBuilder_ == null) {
                ensureInstancesIsMutable();
                instances_.add(m);
              } else {
                instancesBuilder_.addMessage(m);
              }
              break;
            } // case 232780786
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

    private java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> instances_ =
      java.util.Collections.emptyList();
    private void ensureInstancesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        instances_ = new java.util.ArrayList<com.google.cloud.compute.v1.PerInstanceConfig>(instances_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.PerInstanceConfig, com.google.cloud.compute.v1.PerInstanceConfig.Builder, com.google.cloud.compute.v1.PerInstanceConfigOrBuilder> instancesBuilder_;

    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> getInstancesList() {
      if (instancesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instances_);
      } else {
        return instancesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public int getInstancesCount() {
      if (instancesBuilder_ == null) {
        return instances_.size();
      } else {
        return instancesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig getInstances(int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);
      } else {
        return instancesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public Builder setInstances(
        int index, com.google.cloud.compute.v1.PerInstanceConfig value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.set(index, value);
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public Builder setInstances(
        int index, com.google.cloud.compute.v1.PerInstanceConfig.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.set(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public Builder addInstances(com.google.cloud.compute.v1.PerInstanceConfig value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public Builder addInstances(
        int index, com.google.cloud.compute.v1.PerInstanceConfig value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(index, value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public Builder addInstances(
        com.google.cloud.compute.v1.PerInstanceConfig.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public Builder addInstances(
        int index, com.google.cloud.compute.v1.PerInstanceConfig.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public Builder addAllInstances(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.PerInstanceConfig> values) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, instances_);
        onChanged();
      } else {
        instancesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public Builder clearInstances() {
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        instancesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public Builder removeInstances(int index) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.remove(index);
        onChanged();
      } else {
        instancesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig.Builder getInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfigOrBuilder getInstancesOrBuilder(
        int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);  } else {
        return instancesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.PerInstanceConfigOrBuilder> 
         getInstancesOrBuilderList() {
      if (instancesBuilder_ != null) {
        return instancesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instances_);
      }
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig.Builder addInstancesBuilder() {
      return getInstancesFieldBuilder().addBuilder(
          com.google.cloud.compute.v1.PerInstanceConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig.Builder addInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().addBuilder(
          index, com.google.cloud.compute.v1.PerInstanceConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * [Required] List of specifications of per-instance configs.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig instances = 29097598;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.PerInstanceConfig.Builder> 
         getInstancesBuilderList() {
      return getInstancesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.PerInstanceConfig, com.google.cloud.compute.v1.PerInstanceConfig.Builder, com.google.cloud.compute.v1.PerInstanceConfigOrBuilder> 
        getInstancesFieldBuilder() {
      if (instancesBuilder_ == null) {
        instancesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.PerInstanceConfig, com.google.cloud.compute.v1.PerInstanceConfig.Builder, com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>(
                instances_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        instances_ = null;
      }
      return instancesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest)
  private static final com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest();
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegionInstanceGroupManagersCreateInstancesRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegionInstanceGroupManagersCreateInstancesRequest>() {
    @java.lang.Override
    public RegionInstanceGroupManagersCreateInstancesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegionInstanceGroupManagersCreateInstancesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegionInstanceGroupManagersCreateInstancesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RegionInstanceGroupManagersCreateInstancesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

