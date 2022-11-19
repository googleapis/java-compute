// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Time window specified for hourly operations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ResourcePolicyHourlyCycle}
 */
public final class ResourcePolicyHourlyCycle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ResourcePolicyHourlyCycle)
    ResourcePolicyHourlyCycleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourcePolicyHourlyCycle.newBuilder() to construct.
  private ResourcePolicyHourlyCycle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourcePolicyHourlyCycle() {
    duration_ = "";
    startTime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourcePolicyHourlyCycle();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyHourlyCycle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyHourlyCycle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.class, com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.Builder.class);
  }

  private int bitField0_;
  public static final int DURATION_FIELD_NUMBER = 155471252;
  private volatile java.lang.Object duration_;
  /**
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   * @return Whether the duration field is set.
   */
  @java.lang.Override
  public boolean hasDuration() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   * @return The duration.
   */
  @java.lang.Override
  public java.lang.String getDuration() {
    java.lang.Object ref = duration_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      duration_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
   * </pre>
   *
   * <code>optional string duration = 155471252;</code>
   * @return The bytes for duration.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDurationBytes() {
    java.lang.Object ref = duration_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      duration_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOURS_IN_CYCLE_FIELD_NUMBER = 526763132;
  private int hoursInCycle_;
  /**
   * <pre>
   * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
   * </pre>
   *
   * <code>optional int32 hours_in_cycle = 526763132;</code>
   * @return Whether the hoursInCycle field is set.
   */
  @java.lang.Override
  public boolean hasHoursInCycle() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
   * </pre>
   *
   * <code>optional int32 hours_in_cycle = 526763132;</code>
   * @return The hoursInCycle.
   */
  @java.lang.Override
  public int getHoursInCycle() {
    return hoursInCycle_;
  }

  public static final int START_TIME_FIELD_NUMBER = 37467274;
  private volatile java.lang.Object startTime_;
  /**
   * <pre>
   * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public java.lang.String getStartTime() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   * @return The bytes for startTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartTimeBytes() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startTime_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 37467274, startTime_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 155471252, duration_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(526763132, hoursInCycle_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(37467274, startTime_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(155471252, duration_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(526763132, hoursInCycle_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ResourcePolicyHourlyCycle)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ResourcePolicyHourlyCycle other = (com.google.cloud.compute.v1.ResourcePolicyHourlyCycle) obj;

    if (hasDuration() != other.hasDuration()) return false;
    if (hasDuration()) {
      if (!getDuration()
          .equals(other.getDuration())) return false;
    }
    if (hasHoursInCycle() != other.hasHoursInCycle()) return false;
    if (hasHoursInCycle()) {
      if (getHoursInCycle()
          != other.getHoursInCycle()) return false;
    }
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime()
          .equals(other.getStartTime())) return false;
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
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    if (hasHoursInCycle()) {
      hash = (37 * hash) + HOURS_IN_CYCLE_FIELD_NUMBER;
      hash = (53 * hash) + getHoursInCycle();
    }
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.ResourcePolicyHourlyCycle prototype) {
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
   * Time window specified for hourly operations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ResourcePolicyHourlyCycle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ResourcePolicyHourlyCycle)
      com.google.cloud.compute.v1.ResourcePolicyHourlyCycleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyHourlyCycle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyHourlyCycle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.class, com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      duration_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      hoursInCycle_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      startTime_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ResourcePolicyHourlyCycle_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyHourlyCycle getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyHourlyCycle build() {
      com.google.cloud.compute.v1.ResourcePolicyHourlyCycle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyHourlyCycle buildPartial() {
      com.google.cloud.compute.v1.ResourcePolicyHourlyCycle result = new com.google.cloud.compute.v1.ResourcePolicyHourlyCycle(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.duration_ = duration_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hoursInCycle_ = hoursInCycle_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.startTime_ = startTime_;
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
      if (other instanceof com.google.cloud.compute.v1.ResourcePolicyHourlyCycle) {
        return mergeFrom((com.google.cloud.compute.v1.ResourcePolicyHourlyCycle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ResourcePolicyHourlyCycle other) {
      if (other == com.google.cloud.compute.v1.ResourcePolicyHourlyCycle.getDefaultInstance()) return this;
      if (other.hasDuration()) {
        bitField0_ |= 0x00000001;
        duration_ = other.duration_;
        onChanged();
      }
      if (other.hasHoursInCycle()) {
        setHoursInCycle(other.getHoursInCycle());
      }
      if (other.hasStartTime()) {
        bitField0_ |= 0x00000004;
        startTime_ = other.startTime_;
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
            case 299738194: {
              startTime_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 299738194
            case 1243770018: {
              duration_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 1243770018
            case -80862240: {
              hoursInCycle_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case -80862240
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

    private java.lang.Object duration_ = "";
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional string duration = 155471252;</code>
     * @return Whether the duration field is set.
     */
    public boolean hasDuration() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional string duration = 155471252;</code>
     * @return The duration.
     */
    public java.lang.String getDuration() {
      java.lang.Object ref = duration_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        duration_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional string duration = 155471252;</code>
     * @return The bytes for duration.
     */
    public com.google.protobuf.ByteString
        getDurationBytes() {
      java.lang.Object ref = duration_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        duration_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional string duration = 155471252;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional string duration = 155471252;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      duration_ = getDefaultInstance().getDuration();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * </pre>
     *
     * <code>optional string duration = 155471252;</code>
     * @param value The bytes for duration to set.
     * @return This builder for chaining.
     */
    public Builder setDurationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      duration_ = value;
      onChanged();
      return this;
    }

    private int hoursInCycle_ ;
    /**
     * <pre>
     * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
     * </pre>
     *
     * <code>optional int32 hours_in_cycle = 526763132;</code>
     * @return Whether the hoursInCycle field is set.
     */
    @java.lang.Override
    public boolean hasHoursInCycle() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
     * </pre>
     *
     * <code>optional int32 hours_in_cycle = 526763132;</code>
     * @return The hoursInCycle.
     */
    @java.lang.Override
    public int getHoursInCycle() {
      return hoursInCycle_;
    }
    /**
     * <pre>
     * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
     * </pre>
     *
     * <code>optional int32 hours_in_cycle = 526763132;</code>
     * @param value The hoursInCycle to set.
     * @return This builder for chaining.
     */
    public Builder setHoursInCycle(int value) {
      bitField0_ |= 0x00000002;
      hoursInCycle_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
     * </pre>
     *
     * <code>optional int32 hours_in_cycle = 526763132;</code>
     * @return This builder for chaining.
     */
    public Builder clearHoursInCycle() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hoursInCycle_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object startTime_ = "";
    /**
     * <pre>
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @return The startTime.
     */
    public java.lang.String getStartTime() {
      java.lang.Object ref = startTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @return The bytes for startTime.
     */
    public com.google.protobuf.ByteString
        getStartTimeBytes() {
      java.lang.Object ref = startTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      startTime_ = getDefaultInstance().getStartTime();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * </pre>
     *
     * <code>optional string start_time = 37467274;</code>
     * @param value The bytes for startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      startTime_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ResourcePolicyHourlyCycle)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ResourcePolicyHourlyCycle)
  private static final com.google.cloud.compute.v1.ResourcePolicyHourlyCycle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ResourcePolicyHourlyCycle();
  }

  public static com.google.cloud.compute.v1.ResourcePolicyHourlyCycle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourcePolicyHourlyCycle>
      PARSER = new com.google.protobuf.AbstractParser<ResourcePolicyHourlyCycle>() {
    @java.lang.Override
    public ResourcePolicyHourlyCycle parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourcePolicyHourlyCycle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourcePolicyHourlyCycle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyHourlyCycle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

