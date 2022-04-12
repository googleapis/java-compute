// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Configuration of preserved resources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.StatefulPolicyPreservedState}
 */
public final class StatefulPolicyPreservedState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.StatefulPolicyPreservedState)
    StatefulPolicyPreservedStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatefulPolicyPreservedState.newBuilder() to construct.
  private StatefulPolicyPreservedState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatefulPolicyPreservedState() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatefulPolicyPreservedState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StatefulPolicyPreservedState(
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
          case 764752818: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              disks_ = com.google.protobuf.MapField.newMapField(
                  DisksDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice>
            disks__ = input.readMessage(
                DisksDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            disks_.getMutableMap().put(
                disks__.getKey(), disks__.getValue());
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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedState_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 95594102:
        return internalGetDisks();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.StatefulPolicyPreservedState.class, com.google.cloud.compute.v1.StatefulPolicyPreservedState.Builder.class);
  }

  public static final int DISKS_FIELD_NUMBER = 95594102;
  private static final class DisksDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice>newDefaultInstance(
                com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedState_DisksEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> disks_;
  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice>
  internalGetDisks() {
    if (disks_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          DisksDefaultEntryHolder.defaultEntry);
    }
    return disks_;
  }

  public int getDisksCount() {
    return internalGetDisks().getMap().size();
  }
  /**
   * <pre>
   * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
   */

  @java.lang.Override
  public boolean containsDisks(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetDisks().getMap().containsKey(key);
  }
  /**
   * Use {@link #getDisksMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> getDisks() {
    return getDisksMap();
  }
  /**
   * <pre>
   * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> getDisksMap() {
    return internalGetDisks().getMap();
  }
  /**
   * <pre>
   * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
   */
  @java.lang.Override

  public com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice getDisksOrDefault(
      java.lang.String key,
      com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> map =
        internalGetDisks().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
   */
  @java.lang.Override

  public com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice getDisksOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> map =
        internalGetDisks().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetDisks(),
        DisksDefaultEntryHolder.defaultEntry,
        95594102);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> entry
         : internalGetDisks().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice>
      disks__ = DisksDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(95594102, disks__);
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
    if (!(obj instanceof com.google.cloud.compute.v1.StatefulPolicyPreservedState)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.StatefulPolicyPreservedState other = (com.google.cloud.compute.v1.StatefulPolicyPreservedState) obj;

    if (!internalGetDisks().equals(
        other.internalGetDisks())) return false;
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
    if (!internalGetDisks().getMap().isEmpty()) {
      hash = (37 * hash) + DISKS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetDisks().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.StatefulPolicyPreservedState prototype) {
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
   * Configuration of preserved resources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.StatefulPolicyPreservedState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.StatefulPolicyPreservedState)
      com.google.cloud.compute.v1.StatefulPolicyPreservedStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedState_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 95594102:
          return internalGetDisks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 95594102:
          return internalGetMutableDisks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.StatefulPolicyPreservedState.class, com.google.cloud.compute.v1.StatefulPolicyPreservedState.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.StatefulPolicyPreservedState.newBuilder()
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
      internalGetMutableDisks().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_StatefulPolicyPreservedState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.StatefulPolicyPreservedState getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.StatefulPolicyPreservedState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.StatefulPolicyPreservedState build() {
      com.google.cloud.compute.v1.StatefulPolicyPreservedState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.StatefulPolicyPreservedState buildPartial() {
      com.google.cloud.compute.v1.StatefulPolicyPreservedState result = new com.google.cloud.compute.v1.StatefulPolicyPreservedState(this);
      int from_bitField0_ = bitField0_;
      result.disks_ = internalGetDisks();
      result.disks_.makeImmutable();
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
      if (other instanceof com.google.cloud.compute.v1.StatefulPolicyPreservedState) {
        return mergeFrom((com.google.cloud.compute.v1.StatefulPolicyPreservedState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.StatefulPolicyPreservedState other) {
      if (other == com.google.cloud.compute.v1.StatefulPolicyPreservedState.getDefaultInstance()) return this;
      internalGetMutableDisks().mergeFrom(
          other.internalGetDisks());
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
      com.google.cloud.compute.v1.StatefulPolicyPreservedState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.StatefulPolicyPreservedState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> disks_;
    private com.google.protobuf.MapField<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice>
    internalGetDisks() {
      if (disks_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DisksDefaultEntryHolder.defaultEntry);
      }
      return disks_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice>
    internalGetMutableDisks() {
      onChanged();;
      if (disks_ == null) {
        disks_ = com.google.protobuf.MapField.newMapField(
            DisksDefaultEntryHolder.defaultEntry);
      }
      if (!disks_.isMutable()) {
        disks_ = disks_.copy();
      }
      return disks_;
    }

    public int getDisksCount() {
      return internalGetDisks().getMap().size();
    }
    /**
     * <pre>
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
     */

    @java.lang.Override
    public boolean containsDisks(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetDisks().getMap().containsKey(key);
    }
    /**
     * Use {@link #getDisksMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> getDisks() {
      return getDisksMap();
    }
    /**
     * <pre>
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> getDisksMap() {
      return internalGetDisks().getMap();
    }
    /**
     * <pre>
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
     */
    @java.lang.Override

    public com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice getDisksOrDefault(
        java.lang.String key,
        com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> map =
          internalGetDisks().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
     */
    @java.lang.Override

    public com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice getDisksOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> map =
          internalGetDisks().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearDisks() {
      internalGetMutableDisks().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
     */

    public Builder removeDisks(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableDisks().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice>
    getMutableDisks() {
      return internalGetMutableDisks().getMutableMap();
    }
    /**
     * <pre>
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
     */
    public Builder putDisks(
        java.lang.String key,
        com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableDisks().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice&gt; disks = 95594102;</code>
     */

    public Builder putAllDisks(
        java.util.Map<java.lang.String, com.google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice> values) {
      internalGetMutableDisks().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.StatefulPolicyPreservedState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.StatefulPolicyPreservedState)
  private static final com.google.cloud.compute.v1.StatefulPolicyPreservedState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.StatefulPolicyPreservedState();
  }

  public static com.google.cloud.compute.v1.StatefulPolicyPreservedState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatefulPolicyPreservedState>
      PARSER = new com.google.protobuf.AbstractParser<StatefulPolicyPreservedState>() {
    @java.lang.Override
    public StatefulPolicyPreservedState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StatefulPolicyPreservedState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StatefulPolicyPreservedState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatefulPolicyPreservedState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.StatefulPolicyPreservedState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

