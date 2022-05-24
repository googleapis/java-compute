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
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupsListInstancesRequest}
 */
public final class InstanceGroupsListInstancesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupsListInstancesRequest)
    InstanceGroupsListInstancesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceGroupsListInstancesRequest.newBuilder() to construct.
  private InstanceGroupsListInstancesRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupsListInstancesRequest() {
    instanceState_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupsListInstancesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InstanceGroupsListInstancesRequest(
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
          case 737788730:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              instanceState_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupsListInstancesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupsListInstancesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest.class,
            com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.InstanceGroupsListInstancesRequest.InstanceState}
   */
  public enum InstanceState implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_INSTANCE_STATE = 0;</code>
     */
    UNDEFINED_INSTANCE_STATE(0),
    /**
     *
     *
     * <pre>
     * Includes all instances in the generated list regardless of their state.
     * </pre>
     *
     * <code>ALL = 64897;</code>
     */
    ALL(64897),
    /**
     *
     *
     * <pre>
     * Includes instances in the generated list only if they have a RUNNING state.
     * </pre>
     *
     * <code>RUNNING = 121282975;</code>
     */
    RUNNING(121282975),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_INSTANCE_STATE = 0;</code>
     */
    public static final int UNDEFINED_INSTANCE_STATE_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Includes all instances in the generated list regardless of their state.
     * </pre>
     *
     * <code>ALL = 64897;</code>
     */
    public static final int ALL_VALUE = 64897;
    /**
     *
     *
     * <pre>
     * Includes instances in the generated list only if they have a RUNNING state.
     * </pre>
     *
     * <code>RUNNING = 121282975;</code>
     */
    public static final int RUNNING_VALUE = 121282975;

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
    public static InstanceState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InstanceState forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_INSTANCE_STATE;
        case 64897:
          return ALL;
        case 121282975:
          return RUNNING;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InstanceState> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<InstanceState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InstanceState>() {
          public InstanceState findValueByNumber(int number) {
            return InstanceState.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final InstanceState[] VALUES = values();

    public static InstanceState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private InstanceState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.InstanceGroupsListInstancesRequest.InstanceState)
  }

  private int bitField0_;
  public static final int INSTANCE_STATE_FIELD_NUMBER = 92223591;
  private volatile java.lang.Object instanceState_;
  /**
   *
   *
   * <pre>
   * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
   * Check the InstanceState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_state = 92223591;</code>
   *
   * @return Whether the instanceState field is set.
   */
  @java.lang.Override
  public boolean hasInstanceState() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
   * Check the InstanceState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_state = 92223591;</code>
   *
   * @return The instanceState.
   */
  @java.lang.Override
  public java.lang.String getInstanceState() {
    java.lang.Object ref = instanceState_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceState_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
   * Check the InstanceState enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_state = 92223591;</code>
   *
   * @return The bytes for instanceState.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstanceStateBytes() {
    java.lang.Object ref = instanceState_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceState_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 92223591, instanceState_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(92223591, instanceState_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest other =
        (com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest) obj;

    if (hasInstanceState() != other.hasInstanceState()) return false;
    if (hasInstanceState()) {
      if (!getInstanceState().equals(other.getInstanceState())) return false;
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
    if (hasInstanceState()) {
      hash = (37 * hash) + INSTANCE_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getInstanceState().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupsListInstancesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupsListInstancesRequest)
      com.google.cloud.compute.v1.InstanceGroupsListInstancesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupsListInstancesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupsListInstancesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest.class,
              com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      instanceState_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupsListInstancesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest build() {
      com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest result =
          new com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.instanceState_ = instanceState_;
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
      if (other instanceof com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest) {
        return mergeFrom((com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest.getDefaultInstance())
        return this;
      if (other.hasInstanceState()) {
        bitField0_ |= 0x00000001;
        instanceState_ = other.instanceState_;
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
      com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object instanceState_ = "";
    /**
     *
     *
     * <pre>
     * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
     * Check the InstanceState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string instance_state = 92223591;</code>
     *
     * @return Whether the instanceState field is set.
     */
    public boolean hasInstanceState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
     * Check the InstanceState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string instance_state = 92223591;</code>
     *
     * @return The instanceState.
     */
    public java.lang.String getInstanceState() {
      java.lang.Object ref = instanceState_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceState_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
     * Check the InstanceState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string instance_state = 92223591;</code>
     *
     * @return The bytes for instanceState.
     */
    public com.google.protobuf.ByteString getInstanceStateBytes() {
      java.lang.Object ref = instanceState_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceState_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
     * Check the InstanceState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string instance_state = 92223591;</code>
     *
     * @param value The instanceState to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceState(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      instanceState_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
     * Check the InstanceState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string instance_state = 92223591;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstanceState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      instanceState_ = getDefaultInstance().getInstanceState();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of their state.
     * Check the InstanceState enum for the list of possible values.
     * </pre>
     *
     * <code>optional string instance_state = 92223591;</code>
     *
     * @param value The bytes for instanceState to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceStateBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      instanceState_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupsListInstancesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupsListInstancesRequest)
  private static final com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest();
  }

  public static com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupsListInstancesRequest> PARSER =
      new com.google.protobuf.AbstractParser<InstanceGroupsListInstancesRequest>() {
        @java.lang.Override
        public InstanceGroupsListInstancesRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InstanceGroupsListInstancesRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InstanceGroupsListInstancesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupsListInstancesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
