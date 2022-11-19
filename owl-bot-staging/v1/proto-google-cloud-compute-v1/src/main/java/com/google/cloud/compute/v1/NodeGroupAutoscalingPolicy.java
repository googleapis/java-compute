// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NodeGroupAutoscalingPolicy}
 */
public final class NodeGroupAutoscalingPolicy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NodeGroupAutoscalingPolicy)
    NodeGroupAutoscalingPolicyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeGroupAutoscalingPolicy.newBuilder() to construct.
  private NodeGroupAutoscalingPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeGroupAutoscalingPolicy() {
    mode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodeGroupAutoscalingPolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeGroupAutoscalingPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeGroupAutoscalingPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy.class, com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy.Builder.class);
  }

  /**
   * <pre>
   * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.NodeGroupAutoscalingPolicy.Mode}
   */
  public enum Mode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_MODE = 0;</code>
     */
    UNDEFINED_MODE(0),
    /**
     * <code>MODE_UNSPECIFIED = 371348091;</code>
     */
    MODE_UNSPECIFIED(371348091),
    /**
     * <pre>
     * Autoscaling is disabled.
     * </pre>
     *
     * <code>OFF = 78159;</code>
     */
    OFF(78159),
    /**
     * <pre>
     * Autocaling is fully enabled.
     * </pre>
     *
     * <code>ON = 2527;</code>
     */
    ON(2527),
    /**
     * <pre>
     * Autoscaling will only scale out and will not remove nodes.
     * </pre>
     *
     * <code>ONLY_SCALE_OUT = 152713670;</code>
     */
    ONLY_SCALE_OUT(152713670),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_MODE = 0;</code>
     */
    public static final int UNDEFINED_MODE_VALUE = 0;
    /**
     * <code>MODE_UNSPECIFIED = 371348091;</code>
     */
    public static final int MODE_UNSPECIFIED_VALUE = 371348091;
    /**
     * <pre>
     * Autoscaling is disabled.
     * </pre>
     *
     * <code>OFF = 78159;</code>
     */
    public static final int OFF_VALUE = 78159;
    /**
     * <pre>
     * Autocaling is fully enabled.
     * </pre>
     *
     * <code>ON = 2527;</code>
     */
    public static final int ON_VALUE = 2527;
    /**
     * <pre>
     * Autoscaling will only scale out and will not remove nodes.
     * </pre>
     *
     * <code>ONLY_SCALE_OUT = 152713670;</code>
     */
    public static final int ONLY_SCALE_OUT_VALUE = 152713670;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Mode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Mode forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_MODE;
        case 371348091: return MODE_UNSPECIFIED;
        case 78159: return OFF;
        case 2527: return ON;
        case 152713670: return ONLY_SCALE_OUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Mode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Mode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Mode>() {
            public Mode findValueByNumber(int number) {
              return Mode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy.getDescriptor().getEnumTypes().get(0);
    }

    private static final Mode[] VALUES = values();

    public static Mode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Mode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.NodeGroupAutoscalingPolicy.Mode)
  }

  private int bitField0_;
  public static final int MAX_NODES_FIELD_NUMBER = 297762838;
  private int maxNodes_;
  /**
   * <pre>
   * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
   * </pre>
   *
   * <code>optional int32 max_nodes = 297762838;</code>
   * @return Whether the maxNodes field is set.
   */
  @java.lang.Override
  public boolean hasMaxNodes() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
   * </pre>
   *
   * <code>optional int32 max_nodes = 297762838;</code>
   * @return The maxNodes.
   */
  @java.lang.Override
  public int getMaxNodes() {
    return maxNodes_;
  }

  public static final int MIN_NODES_FIELD_NUMBER = 533370500;
  private int minNodes_;
  /**
   * <pre>
   * The minimum number of nodes that the group should have.
   * </pre>
   *
   * <code>optional int32 min_nodes = 533370500;</code>
   * @return Whether the minNodes field is set.
   */
  @java.lang.Override
  public boolean hasMinNodes() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The minimum number of nodes that the group should have.
   * </pre>
   *
   * <code>optional int32 min_nodes = 533370500;</code>
   * @return The minNodes.
   */
  @java.lang.Override
  public int getMinNodes() {
    return minNodes_;
  }

  public static final int MODE_FIELD_NUMBER = 3357091;
  private volatile java.lang.Object mode_;
  /**
   * <pre>
   * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   * @return Whether the mode field is set.
   */
  @java.lang.Override
  public boolean hasMode() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   * @return The mode.
   */
  @java.lang.Override
  public java.lang.String getMode() {
    java.lang.Object ref = mode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   * @return The bytes for mode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModeBytes() {
    java.lang.Object ref = mode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mode_ = b;
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
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3357091, mode_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(297762838, maxNodes_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(533370500, minNodes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3357091, mode_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(297762838, maxNodes_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(533370500, minNodes_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy other = (com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy) obj;

    if (hasMaxNodes() != other.hasMaxNodes()) return false;
    if (hasMaxNodes()) {
      if (getMaxNodes()
          != other.getMaxNodes()) return false;
    }
    if (hasMinNodes() != other.hasMinNodes()) return false;
    if (hasMinNodes()) {
      if (getMinNodes()
          != other.getMinNodes()) return false;
    }
    if (hasMode() != other.hasMode()) return false;
    if (hasMode()) {
      if (!getMode()
          .equals(other.getMode())) return false;
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
    if (hasMaxNodes()) {
      hash = (37 * hash) + MAX_NODES_FIELD_NUMBER;
      hash = (53 * hash) + getMaxNodes();
    }
    if (hasMinNodes()) {
      hash = (37 * hash) + MIN_NODES_FIELD_NUMBER;
      hash = (53 * hash) + getMinNodes();
    }
    if (hasMode()) {
      hash = (37 * hash) + MODE_FIELD_NUMBER;
      hash = (53 * hash) + getMode().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.NodeGroupAutoscalingPolicy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NodeGroupAutoscalingPolicy)
      com.google.cloud.compute.v1.NodeGroupAutoscalingPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeGroupAutoscalingPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeGroupAutoscalingPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy.class, com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      maxNodes_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      minNodes_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      mode_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_NodeGroupAutoscalingPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy build() {
      com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy buildPartial() {
      com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy result = new com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxNodes_ = maxNodes_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minNodes_ = minNodes_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.mode_ = mode_;
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
      if (other instanceof com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy) {
        return mergeFrom((com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy other) {
      if (other == com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy.getDefaultInstance()) return this;
      if (other.hasMaxNodes()) {
        setMaxNodes(other.getMaxNodes());
      }
      if (other.hasMinNodes()) {
        setMinNodes(other.getMinNodes());
      }
      if (other.hasMode()) {
        bitField0_ |= 0x00000004;
        mode_ = other.mode_;
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
            case 26856730: {
              mode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26856730
            case -1912864592: {
              maxNodes_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case -1912864592
            case -28003296: {
              minNodes_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case -28003296
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

    private int maxNodes_ ;
    /**
     * <pre>
     * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
     * </pre>
     *
     * <code>optional int32 max_nodes = 297762838;</code>
     * @return Whether the maxNodes field is set.
     */
    @java.lang.Override
    public boolean hasMaxNodes() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
     * </pre>
     *
     * <code>optional int32 max_nodes = 297762838;</code>
     * @return The maxNodes.
     */
    @java.lang.Override
    public int getMaxNodes() {
      return maxNodes_;
    }
    /**
     * <pre>
     * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
     * </pre>
     *
     * <code>optional int32 max_nodes = 297762838;</code>
     * @param value The maxNodes to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNodes(int value) {
      bitField0_ |= 0x00000001;
      maxNodes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
     * </pre>
     *
     * <code>optional int32 max_nodes = 297762838;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxNodes() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxNodes_ = 0;
      onChanged();
      return this;
    }

    private int minNodes_ ;
    /**
     * <pre>
     * The minimum number of nodes that the group should have.
     * </pre>
     *
     * <code>optional int32 min_nodes = 533370500;</code>
     * @return Whether the minNodes field is set.
     */
    @java.lang.Override
    public boolean hasMinNodes() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The minimum number of nodes that the group should have.
     * </pre>
     *
     * <code>optional int32 min_nodes = 533370500;</code>
     * @return The minNodes.
     */
    @java.lang.Override
    public int getMinNodes() {
      return minNodes_;
    }
    /**
     * <pre>
     * The minimum number of nodes that the group should have.
     * </pre>
     *
     * <code>optional int32 min_nodes = 533370500;</code>
     * @param value The minNodes to set.
     * @return This builder for chaining.
     */
    public Builder setMinNodes(int value) {
      bitField0_ |= 0x00000002;
      minNodes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The minimum number of nodes that the group should have.
     * </pre>
     *
     * <code>optional int32 min_nodes = 533370500;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinNodes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minNodes_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object mode_ = "";
    /**
     * <pre>
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * Check the Mode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string mode = 3357091;</code>
     * @return Whether the mode field is set.
     */
    public boolean hasMode() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * Check the Mode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string mode = 3357091;</code>
     * @return The mode.
     */
    public java.lang.String getMode() {
      java.lang.Object ref = mode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * Check the Mode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string mode = 3357091;</code>
     * @return The bytes for mode.
     */
    public com.google.protobuf.ByteString
        getModeBytes() {
      java.lang.Object ref = mode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * Check the Mode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string mode = 3357091;</code>
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      mode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * Check the Mode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string mode = 3357091;</code>
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      mode_ = getDefaultInstance().getMode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * Check the Mode enum for the list of possible values.
     * </pre>
     *
     * <code>optional string mode = 3357091;</code>
     * @param value The bytes for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      mode_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NodeGroupAutoscalingPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NodeGroupAutoscalingPolicy)
  private static final com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy();
  }

  public static com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeGroupAutoscalingPolicy>
      PARSER = new com.google.protobuf.AbstractParser<NodeGroupAutoscalingPolicy>() {
    @java.lang.Override
    public NodeGroupAutoscalingPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodeGroupAutoscalingPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeGroupAutoscalingPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

