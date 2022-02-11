// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NodeTypesScopedList}
 */
public final class NodeTypesScopedList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NodeTypesScopedList)
    NodeTypesScopedListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeTypesScopedList.newBuilder() to construct.
  private NodeTypesScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeTypesScopedList() {
    nodeTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodeTypesScopedList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NodeTypesScopedList(
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
          case 405634274: {
            com.google.cloud.compute.v1.Warning.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = warning_.toBuilder();
            }
            warning_ = input.readMessage(com.google.cloud.compute.v1.Warning.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(warning_);
              warning_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case -437583902: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              nodeTypes_ = new java.util.ArrayList<com.google.cloud.compute.v1.NodeType>();
              mutable_bitField0_ |= 0x00000001;
            }
            nodeTypes_.add(
                input.readMessage(com.google.cloud.compute.v1.NodeType.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        nodeTypes_ = java.util.Collections.unmodifiableList(nodeTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeTypesScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeTypesScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NodeTypesScopedList.class, com.google.cloud.compute.v1.NodeTypesScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int NODE_TYPES_FIELD_NUMBER = 482172924;
  private java.util.List<com.google.cloud.compute.v1.NodeType> nodeTypes_;
  /**
   * <pre>
   * [Output Only] A list of node types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.NodeType> getNodeTypesList() {
    return nodeTypes_;
  }
  /**
   * <pre>
   * [Output Only] A list of node types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.NodeTypeOrBuilder> 
      getNodeTypesOrBuilderList() {
    return nodeTypes_;
  }
  /**
   * <pre>
   * [Output Only] A list of node types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
   */
  @java.lang.Override
  public int getNodeTypesCount() {
    return nodeTypes_.size();
  }
  /**
   * <pre>
   * [Output Only] A list of node types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NodeType getNodeTypes(int index) {
    return nodeTypes_.get(index);
  }
  /**
   * <pre>
   * [Output Only] A list of node types contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NodeTypeOrBuilder getNodeTypesOrBuilder(
      int index) {
    return nodeTypes_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;
  /**
   * <pre>
   * [Output Only] An informational warning that appears when the node types list is empty.
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
   * [Output Only] An informational warning that appears when the node types list is empty.
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
   * [Output Only] An informational warning that appears when the node types list is empty.
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
    for (int i = 0; i < nodeTypes_.size(); i++) {
      output.writeMessage(482172924, nodeTypes_.get(i));
    }
    unknownFields.writeTo(output);
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
    for (int i = 0; i < nodeTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(482172924, nodeTypes_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.NodeTypesScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NodeTypesScopedList other = (com.google.cloud.compute.v1.NodeTypesScopedList) obj;

    if (!getNodeTypesList()
        .equals(other.getNodeTypesList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning()
          .equals(other.getWarning())) return false;
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
    if (getNodeTypesCount() > 0) {
      hash = (37 * hash) + NODE_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getNodeTypesList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NodeTypesScopedList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NodeTypesScopedList parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.NodeTypesScopedList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.NodeTypesScopedList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NodeTypesScopedList)
      com.google.cloud.compute.v1.NodeTypesScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeTypesScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeTypesScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NodeTypesScopedList.class, com.google.cloud.compute.v1.NodeTypesScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NodeTypesScopedList.newBuilder()
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
        getNodeTypesFieldBuilder();
        getWarningFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (nodeTypesBuilder_ == null) {
        nodeTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        nodeTypesBuilder_.clear();
      }
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
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeTypesScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeTypesScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NodeTypesScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeTypesScopedList build() {
      com.google.cloud.compute.v1.NodeTypesScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeTypesScopedList buildPartial() {
      com.google.cloud.compute.v1.NodeTypesScopedList result = new com.google.cloud.compute.v1.NodeTypesScopedList(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (nodeTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nodeTypes_ = java.util.Collections.unmodifiableList(nodeTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nodeTypes_ = nodeTypes_;
      } else {
        result.nodeTypes_ = nodeTypesBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.NodeTypesScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.NodeTypesScopedList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NodeTypesScopedList other) {
      if (other == com.google.cloud.compute.v1.NodeTypesScopedList.getDefaultInstance()) return this;
      if (nodeTypesBuilder_ == null) {
        if (!other.nodeTypes_.isEmpty()) {
          if (nodeTypes_.isEmpty()) {
            nodeTypes_ = other.nodeTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodeTypesIsMutable();
            nodeTypes_.addAll(other.nodeTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.nodeTypes_.isEmpty()) {
          if (nodeTypesBuilder_.isEmpty()) {
            nodeTypesBuilder_.dispose();
            nodeTypesBuilder_ = null;
            nodeTypes_ = other.nodeTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodeTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNodeTypesFieldBuilder() : null;
          } else {
            nodeTypesBuilder_.addAllMessages(other.nodeTypes_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
      com.google.cloud.compute.v1.NodeTypesScopedList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.NodeTypesScopedList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.compute.v1.NodeType> nodeTypes_ =
      java.util.Collections.emptyList();
    private void ensureNodeTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodeTypes_ = new java.util.ArrayList<com.google.cloud.compute.v1.NodeType>(nodeTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.NodeType, com.google.cloud.compute.v1.NodeType.Builder, com.google.cloud.compute.v1.NodeTypeOrBuilder> nodeTypesBuilder_;

    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.NodeType> getNodeTypesList() {
      if (nodeTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nodeTypes_);
      } else {
        return nodeTypesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public int getNodeTypesCount() {
      if (nodeTypesBuilder_ == null) {
        return nodeTypes_.size();
      } else {
        return nodeTypesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public com.google.cloud.compute.v1.NodeType getNodeTypes(int index) {
      if (nodeTypesBuilder_ == null) {
        return nodeTypes_.get(index);
      } else {
        return nodeTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public Builder setNodeTypes(
        int index, com.google.cloud.compute.v1.NodeType value) {
      if (nodeTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodeTypesIsMutable();
        nodeTypes_.set(index, value);
        onChanged();
      } else {
        nodeTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public Builder setNodeTypes(
        int index, com.google.cloud.compute.v1.NodeType.Builder builderForValue) {
      if (nodeTypesBuilder_ == null) {
        ensureNodeTypesIsMutable();
        nodeTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodeTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public Builder addNodeTypes(com.google.cloud.compute.v1.NodeType value) {
      if (nodeTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodeTypesIsMutable();
        nodeTypes_.add(value);
        onChanged();
      } else {
        nodeTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public Builder addNodeTypes(
        int index, com.google.cloud.compute.v1.NodeType value) {
      if (nodeTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodeTypesIsMutable();
        nodeTypes_.add(index, value);
        onChanged();
      } else {
        nodeTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public Builder addNodeTypes(
        com.google.cloud.compute.v1.NodeType.Builder builderForValue) {
      if (nodeTypesBuilder_ == null) {
        ensureNodeTypesIsMutable();
        nodeTypes_.add(builderForValue.build());
        onChanged();
      } else {
        nodeTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public Builder addNodeTypes(
        int index, com.google.cloud.compute.v1.NodeType.Builder builderForValue) {
      if (nodeTypesBuilder_ == null) {
        ensureNodeTypesIsMutable();
        nodeTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodeTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public Builder addAllNodeTypes(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.NodeType> values) {
      if (nodeTypesBuilder_ == null) {
        ensureNodeTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nodeTypes_);
        onChanged();
      } else {
        nodeTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public Builder clearNodeTypes() {
      if (nodeTypesBuilder_ == null) {
        nodeTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodeTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public Builder removeNodeTypes(int index) {
      if (nodeTypesBuilder_ == null) {
        ensureNodeTypesIsMutable();
        nodeTypes_.remove(index);
        onChanged();
      } else {
        nodeTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public com.google.cloud.compute.v1.NodeType.Builder getNodeTypesBuilder(
        int index) {
      return getNodeTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public com.google.cloud.compute.v1.NodeTypeOrBuilder getNodeTypesOrBuilder(
        int index) {
      if (nodeTypesBuilder_ == null) {
        return nodeTypes_.get(index);  } else {
        return nodeTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.NodeTypeOrBuilder> 
         getNodeTypesOrBuilderList() {
      if (nodeTypesBuilder_ != null) {
        return nodeTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nodeTypes_);
      }
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public com.google.cloud.compute.v1.NodeType.Builder addNodeTypesBuilder() {
      return getNodeTypesFieldBuilder().addBuilder(
          com.google.cloud.compute.v1.NodeType.getDefaultInstance());
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public com.google.cloud.compute.v1.NodeType.Builder addNodeTypesBuilder(
        int index) {
      return getNodeTypesFieldBuilder().addBuilder(
          index, com.google.cloud.compute.v1.NodeType.getDefaultInstance());
    }
    /**
     * <pre>
     * [Output Only] A list of node types contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NodeType node_types = 482172924;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.NodeType.Builder> 
         getNodeTypesBuilderList() {
      return getNodeTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.compute.v1.NodeType, com.google.cloud.compute.v1.NodeType.Builder, com.google.cloud.compute.v1.NodeTypeOrBuilder> 
        getNodeTypesFieldBuilder() {
      if (nodeTypesBuilder_ == null) {
        nodeTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.NodeType, com.google.cloud.compute.v1.NodeType.Builder, com.google.cloud.compute.v1.NodeTypeOrBuilder>(
                nodeTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nodeTypes_ = null;
      }
      return nodeTypesBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Warning, com.google.cloud.compute.v1.Warning.Builder, com.google.cloud.compute.v1.WarningOrBuilder> warningBuilder_;
    /**
     * <pre>
     * [Output Only] An informational warning that appears when the node types list is empty.
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
     * [Output Only] An informational warning that appears when the node types list is empty.
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
     * [Output Only] An informational warning that appears when the node types list is empty.
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
     * [Output Only] An informational warning that appears when the node types list is empty.
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
     * [Output Only] An informational warning that appears when the node types list is empty.
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
     * [Output Only] An informational warning that appears when the node types list is empty.
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
     * [Output Only] An informational warning that appears when the node types list is empty.
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
     * [Output Only] An informational warning that appears when the node types list is empty.
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
     * [Output Only] An informational warning that appears when the node types list is empty.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NodeTypesScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NodeTypesScopedList)
  private static final com.google.cloud.compute.v1.NodeTypesScopedList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NodeTypesScopedList();
  }

  public static com.google.cloud.compute.v1.NodeTypesScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeTypesScopedList>
      PARSER = new com.google.protobuf.AbstractParser<NodeTypesScopedList>() {
    @java.lang.Override
    public NodeTypesScopedList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NodeTypesScopedList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NodeTypesScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeTypesScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NodeTypesScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

