// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupsScopedList}
 */
public final class InstanceGroupsScopedList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupsScopedList)
    InstanceGroupsScopedListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstanceGroupsScopedList.newBuilder() to construct.
  private InstanceGroupsScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstanceGroupsScopedList() {
    instanceGroups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstanceGroupsScopedList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InstanceGroupsScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InstanceGroupsScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupsScopedList.class, com.google.cloud.compute.v1.InstanceGroupsScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int INSTANCE_GROUPS_FIELD_NUMBER = 366469310;
  private java.util.List<com.google.cloud.compute.v1.InstanceGroup> instanceGroups_;
  /**
   * <pre>
   * [Output Only] The list of instance groups that are contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.InstanceGroup> getInstanceGroupsList() {
    return instanceGroups_;
  }
  /**
   * <pre>
   * [Output Only] The list of instance groups that are contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.InstanceGroupOrBuilder> 
      getInstanceGroupsOrBuilderList() {
    return instanceGroups_;
  }
  /**
   * <pre>
   * [Output Only] The list of instance groups that are contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
   */
  @java.lang.Override
  public int getInstanceGroupsCount() {
    return instanceGroups_.size();
  }
  /**
   * <pre>
   * [Output Only] The list of instance groups that are contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroup getInstanceGroups(int index) {
    return instanceGroups_.get(index);
  }
  /**
   * <pre>
   * [Output Only] The list of instance groups that are contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupOrBuilder getInstanceGroupsOrBuilder(
      int index) {
    return instanceGroups_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;
  /**
   * <pre>
   * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
   * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
   * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
    for (int i = 0; i < instanceGroups_.size(); i++) {
      output.writeMessage(366469310, instanceGroups_.get(i));
    }
    getUnknownFields().writeTo(output);
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
    for (int i = 0; i < instanceGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(366469310, instanceGroups_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceGroupsScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupsScopedList other = (com.google.cloud.compute.v1.InstanceGroupsScopedList) obj;

    if (!getInstanceGroupsList()
        .equals(other.getInstanceGroupsList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning()
          .equals(other.getWarning())) return false;
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
    if (getInstanceGroupsCount() > 0) {
      hash = (37 * hash) + INSTANCE_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getInstanceGroupsList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.InstanceGroupsScopedList parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.InstanceGroupsScopedList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupsScopedList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupsScopedList)
      com.google.cloud.compute.v1.InstanceGroupsScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InstanceGroupsScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InstanceGroupsScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupsScopedList.class, com.google.cloud.compute.v1.InstanceGroupsScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstanceGroupsScopedList.newBuilder()
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
        getInstanceGroupsFieldBuilder();
        getWarningFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (instanceGroupsBuilder_ == null) {
        instanceGroups_ = java.util.Collections.emptyList();
      } else {
        instanceGroups_ = null;
        instanceGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
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
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_InstanceGroupsScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupsScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupsScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupsScopedList build() {
      com.google.cloud.compute.v1.InstanceGroupsScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupsScopedList buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupsScopedList result = new com.google.cloud.compute.v1.InstanceGroupsScopedList(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (instanceGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          instanceGroups_ = java.util.Collections.unmodifiableList(instanceGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.instanceGroups_ = instanceGroups_;
      } else {
        result.instanceGroups_ = instanceGroupsBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.InstanceGroupsScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.InstanceGroupsScopedList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstanceGroupsScopedList other) {
      if (other == com.google.cloud.compute.v1.InstanceGroupsScopedList.getDefaultInstance()) return this;
      if (instanceGroupsBuilder_ == null) {
        if (!other.instanceGroups_.isEmpty()) {
          if (instanceGroups_.isEmpty()) {
            instanceGroups_ = other.instanceGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInstanceGroupsIsMutable();
            instanceGroups_.addAll(other.instanceGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.instanceGroups_.isEmpty()) {
          if (instanceGroupsBuilder_.isEmpty()) {
            instanceGroupsBuilder_.dispose();
            instanceGroupsBuilder_ = null;
            instanceGroups_ = other.instanceGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            instanceGroupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInstanceGroupsFieldBuilder() : null;
          } else {
            instanceGroupsBuilder_.addAllMessages(other.instanceGroups_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
            case 405634274: {
              input.readMessage(
                  getWarningFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 405634274
            case -1363212814: {
              com.google.cloud.compute.v1.InstanceGroup m =
                  input.readMessage(
                      com.google.cloud.compute.v1.InstanceGroup.parser(),
                      extensionRegistry);
              if (instanceGroupsBuilder_ == null) {
                ensureInstanceGroupsIsMutable();
                instanceGroups_.add(m);
              } else {
                instanceGroupsBuilder_.addMessage(m);
              }
              break;
            } // case -1363212814
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

    private java.util.List<com.google.cloud.compute.v1.InstanceGroup> instanceGroups_ =
      java.util.Collections.emptyList();
    private void ensureInstanceGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        instanceGroups_ = new java.util.ArrayList<com.google.cloud.compute.v1.InstanceGroup>(instanceGroups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.InstanceGroup, com.google.cloud.compute.v1.InstanceGroup.Builder, com.google.cloud.compute.v1.InstanceGroupOrBuilder> instanceGroupsBuilder_;

    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.InstanceGroup> getInstanceGroupsList() {
      if (instanceGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instanceGroups_);
      } else {
        return instanceGroupsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public int getInstanceGroupsCount() {
      if (instanceGroupsBuilder_ == null) {
        return instanceGroups_.size();
      } else {
        return instanceGroupsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public com.google.cloud.compute.v1.InstanceGroup getInstanceGroups(int index) {
      if (instanceGroupsBuilder_ == null) {
        return instanceGroups_.get(index);
      } else {
        return instanceGroupsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public Builder setInstanceGroups(
        int index, com.google.cloud.compute.v1.InstanceGroup value) {
      if (instanceGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstanceGroupsIsMutable();
        instanceGroups_.set(index, value);
        onChanged();
      } else {
        instanceGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public Builder setInstanceGroups(
        int index, com.google.cloud.compute.v1.InstanceGroup.Builder builderForValue) {
      if (instanceGroupsBuilder_ == null) {
        ensureInstanceGroupsIsMutable();
        instanceGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        instanceGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public Builder addInstanceGroups(com.google.cloud.compute.v1.InstanceGroup value) {
      if (instanceGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstanceGroupsIsMutable();
        instanceGroups_.add(value);
        onChanged();
      } else {
        instanceGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public Builder addInstanceGroups(
        int index, com.google.cloud.compute.v1.InstanceGroup value) {
      if (instanceGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstanceGroupsIsMutable();
        instanceGroups_.add(index, value);
        onChanged();
      } else {
        instanceGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public Builder addInstanceGroups(
        com.google.cloud.compute.v1.InstanceGroup.Builder builderForValue) {
      if (instanceGroupsBuilder_ == null) {
        ensureInstanceGroupsIsMutable();
        instanceGroups_.add(builderForValue.build());
        onChanged();
      } else {
        instanceGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public Builder addInstanceGroups(
        int index, com.google.cloud.compute.v1.InstanceGroup.Builder builderForValue) {
      if (instanceGroupsBuilder_ == null) {
        ensureInstanceGroupsIsMutable();
        instanceGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        instanceGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public Builder addAllInstanceGroups(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.InstanceGroup> values) {
      if (instanceGroupsBuilder_ == null) {
        ensureInstanceGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, instanceGroups_);
        onChanged();
      } else {
        instanceGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public Builder clearInstanceGroups() {
      if (instanceGroupsBuilder_ == null) {
        instanceGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        instanceGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public Builder removeInstanceGroups(int index) {
      if (instanceGroupsBuilder_ == null) {
        ensureInstanceGroupsIsMutable();
        instanceGroups_.remove(index);
        onChanged();
      } else {
        instanceGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public com.google.cloud.compute.v1.InstanceGroup.Builder getInstanceGroupsBuilder(
        int index) {
      return getInstanceGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public com.google.cloud.compute.v1.InstanceGroupOrBuilder getInstanceGroupsOrBuilder(
        int index) {
      if (instanceGroupsBuilder_ == null) {
        return instanceGroups_.get(index);  } else {
        return instanceGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.InstanceGroupOrBuilder> 
         getInstanceGroupsOrBuilderList() {
      if (instanceGroupsBuilder_ != null) {
        return instanceGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instanceGroups_);
      }
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public com.google.cloud.compute.v1.InstanceGroup.Builder addInstanceGroupsBuilder() {
      return getInstanceGroupsFieldBuilder().addBuilder(
          com.google.cloud.compute.v1.InstanceGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public com.google.cloud.compute.v1.InstanceGroup.Builder addInstanceGroupsBuilder(
        int index) {
      return getInstanceGroupsFieldBuilder().addBuilder(
          index, com.google.cloud.compute.v1.InstanceGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * [Output Only] The list of instance groups that are contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.InstanceGroup instance_groups = 366469310;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.InstanceGroup.Builder> 
         getInstanceGroupsBuilderList() {
      return getInstanceGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.InstanceGroup, com.google.cloud.compute.v1.InstanceGroup.Builder, com.google.cloud.compute.v1.InstanceGroupOrBuilder> 
        getInstanceGroupsFieldBuilder() {
      if (instanceGroupsBuilder_ == null) {
        instanceGroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.InstanceGroup, com.google.cloud.compute.v1.InstanceGroup.Builder, com.google.cloud.compute.v1.InstanceGroupOrBuilder>(
                instanceGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        instanceGroups_ = null;
      }
      return instanceGroupsBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Warning, com.google.cloud.compute.v1.Warning.Builder, com.google.cloud.compute.v1.WarningOrBuilder> warningBuilder_;
    /**
     * <pre>
     * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
     * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
     * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
     * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
     * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
     * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
     * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
     * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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
     * [Output Only] An informational warning that replaces the list of instance groups when the list is empty.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupsScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupsScopedList)
  private static final com.google.cloud.compute.v1.InstanceGroupsScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceGroupsScopedList();
  }

  public static com.google.cloud.compute.v1.InstanceGroupsScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupsScopedList>
      PARSER = new com.google.protobuf.AbstractParser<InstanceGroupsScopedList>() {
    @java.lang.Override
    public InstanceGroupsScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceGroupsScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupsScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupsScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

