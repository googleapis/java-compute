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
 * InstanceGroupManagers.patchPerInstanceConfigs
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq}
 */
public final class InstanceGroupManagersPatchPerInstanceConfigsReq
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq)
    InstanceGroupManagersPatchPerInstanceConfigsReqOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceGroupManagersPatchPerInstanceConfigsReq.newBuilder() to construct.
  private InstanceGroupManagersPatchPerInstanceConfigsReq(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagersPatchPerInstanceConfigsReq() {
    perInstanceConfigs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagersPatchPerInstanceConfigsReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagersPatchPerInstanceConfigsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagersPatchPerInstanceConfigsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq.class,
            com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq.Builder
                .class);
  }

  public static final int PER_INSTANCE_CONFIGS_FIELD_NUMBER = 526265001;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> perInstanceConfigs_;
  /**
   *
   *
   * <pre>
   * The list of per-instance configurations to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> getPerInstanceConfigsList() {
    return perInstanceConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The list of per-instance configurations to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>
      getPerInstanceConfigsOrBuilderList() {
    return perInstanceConfigs_;
  }
  /**
   *
   *
   * <pre>
   * The list of per-instance configurations to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
   * </code>
   */
  @java.lang.Override
  public int getPerInstanceConfigsCount() {
    return perInstanceConfigs_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of per-instance configurations to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.PerInstanceConfig getPerInstanceConfigs(int index) {
    return perInstanceConfigs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of per-instance configurations to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.PerInstanceConfigOrBuilder getPerInstanceConfigsOrBuilder(
      int index) {
    return perInstanceConfigs_.get(index);
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
    for (int i = 0; i < perInstanceConfigs_.size(); i++) {
      output.writeMessage(526265001, perInstanceConfigs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < perInstanceConfigs_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              526265001, perInstanceConfigs_.get(i));
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
    if (!(obj
        instanceof com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq other =
        (com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq) obj;

    if (!getPerInstanceConfigsList().equals(other.getPerInstanceConfigsList())) return false;
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
    if (getPerInstanceConfigsCount() > 0) {
      hash = (37 * hash) + PER_INSTANCE_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getPerInstanceConfigsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      parseFrom(
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
      com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq prototype) {
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
   * InstanceGroupManagers.patchPerInstanceConfigs
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq)
      com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagersPatchPerInstanceConfigsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagersPatchPerInstanceConfigsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq.class,
              com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (perInstanceConfigsBuilder_ == null) {
        perInstanceConfigs_ = java.util.Collections.emptyList();
      } else {
        perInstanceConfigs_ = null;
        perInstanceConfigsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagersPatchPerInstanceConfigsReq_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq build() {
      com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
        buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq result =
          new com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq result) {
      if (perInstanceConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          perInstanceConfigs_ = java.util.Collections.unmodifiableList(perInstanceConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.perInstanceConfigs_ = perInstanceConfigs_;
      } else {
        result.perInstanceConfigs_ = perInstanceConfigsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq result) {
      int from_bitField0_ = bitField0_;
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
      if (other
          instanceof com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq) {
        return mergeFrom(
            (com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
              .getDefaultInstance()) return this;
      if (perInstanceConfigsBuilder_ == null) {
        if (!other.perInstanceConfigs_.isEmpty()) {
          if (perInstanceConfigs_.isEmpty()) {
            perInstanceConfigs_ = other.perInstanceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePerInstanceConfigsIsMutable();
            perInstanceConfigs_.addAll(other.perInstanceConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.perInstanceConfigs_.isEmpty()) {
          if (perInstanceConfigsBuilder_.isEmpty()) {
            perInstanceConfigsBuilder_.dispose();
            perInstanceConfigsBuilder_ = null;
            perInstanceConfigs_ = other.perInstanceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            perInstanceConfigsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPerInstanceConfigsFieldBuilder()
                    : null;
          } else {
            perInstanceConfigsBuilder_.addAllMessages(other.perInstanceConfigs_);
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
            case -84847286:
              {
                com.google.cloud.compute.v1.PerInstanceConfig m =
                    input.readMessage(
                        com.google.cloud.compute.v1.PerInstanceConfig.parser(), extensionRegistry);
                if (perInstanceConfigsBuilder_ == null) {
                  ensurePerInstanceConfigsIsMutable();
                  perInstanceConfigs_.add(m);
                } else {
                  perInstanceConfigsBuilder_.addMessage(m);
                }
                break;
              } // case -84847286
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

    private java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> perInstanceConfigs_ =
        java.util.Collections.emptyList();

    private void ensurePerInstanceConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        perInstanceConfigs_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.PerInstanceConfig>(
                perInstanceConfigs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.PerInstanceConfig,
            com.google.cloud.compute.v1.PerInstanceConfig.Builder,
            com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>
        perInstanceConfigsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.PerInstanceConfig>
        getPerInstanceConfigsList() {
      if (perInstanceConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(perInstanceConfigs_);
      } else {
        return perInstanceConfigsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public int getPerInstanceConfigsCount() {
      if (perInstanceConfigsBuilder_ == null) {
        return perInstanceConfigs_.size();
      } else {
        return perInstanceConfigsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig getPerInstanceConfigs(int index) {
      if (perInstanceConfigsBuilder_ == null) {
        return perInstanceConfigs_.get(index);
      } else {
        return perInstanceConfigsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder setPerInstanceConfigs(
        int index, com.google.cloud.compute.v1.PerInstanceConfig value) {
      if (perInstanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.set(index, value);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder setPerInstanceConfigs(
        int index, com.google.cloud.compute.v1.PerInstanceConfig.Builder builderForValue) {
      if (perInstanceConfigsBuilder_ == null) {
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        perInstanceConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder addPerInstanceConfigs(com.google.cloud.compute.v1.PerInstanceConfig value) {
      if (perInstanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.add(value);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder addPerInstanceConfigs(
        int index, com.google.cloud.compute.v1.PerInstanceConfig value) {
      if (perInstanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.add(index, value);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder addPerInstanceConfigs(
        com.google.cloud.compute.v1.PerInstanceConfig.Builder builderForValue) {
      if (perInstanceConfigsBuilder_ == null) {
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        perInstanceConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder addPerInstanceConfigs(
        int index, com.google.cloud.compute.v1.PerInstanceConfig.Builder builderForValue) {
      if (perInstanceConfigsBuilder_ == null) {
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        perInstanceConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder addAllPerInstanceConfigs(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.PerInstanceConfig> values) {
      if (perInstanceConfigsBuilder_ == null) {
        ensurePerInstanceConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, perInstanceConfigs_);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder clearPerInstanceConfigs() {
      if (perInstanceConfigsBuilder_ == null) {
        perInstanceConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public Builder removePerInstanceConfigs(int index) {
      if (perInstanceConfigsBuilder_ == null) {
        ensurePerInstanceConfigsIsMutable();
        perInstanceConfigs_.remove(index);
        onChanged();
      } else {
        perInstanceConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig.Builder getPerInstanceConfigsBuilder(
        int index) {
      return getPerInstanceConfigsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfigOrBuilder getPerInstanceConfigsOrBuilder(
        int index) {
      if (perInstanceConfigsBuilder_ == null) {
        return perInstanceConfigs_.get(index);
      } else {
        return perInstanceConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>
        getPerInstanceConfigsOrBuilderList() {
      if (perInstanceConfigsBuilder_ != null) {
        return perInstanceConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(perInstanceConfigs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig.Builder addPerInstanceConfigsBuilder() {
      return getPerInstanceConfigsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.PerInstanceConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public com.google.cloud.compute.v1.PerInstanceConfig.Builder addPerInstanceConfigsBuilder(
        int index) {
      return getPerInstanceConfigsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.PerInstanceConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of per-instance configurations to insert or patch on this managed instance group.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.PerInstanceConfig.Builder>
        getPerInstanceConfigsBuilderList() {
      return getPerInstanceConfigsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.PerInstanceConfig,
            com.google.cloud.compute.v1.PerInstanceConfig.Builder,
            com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>
        getPerInstanceConfigsFieldBuilder() {
      if (perInstanceConfigsBuilder_ == null) {
        perInstanceConfigsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.PerInstanceConfig,
                com.google.cloud.compute.v1.PerInstanceConfig.Builder,
                com.google.cloud.compute.v1.PerInstanceConfigOrBuilder>(
                perInstanceConfigs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        perInstanceConfigs_ = null;
      }
      return perInstanceConfigsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq)
  private static final com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq();
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupManagersPatchPerInstanceConfigsReq>
      PARSER =
          new com.google.protobuf.AbstractParser<
              InstanceGroupManagersPatchPerInstanceConfigsReq>() {
            @java.lang.Override
            public InstanceGroupManagersPatchPerInstanceConfigsReq parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<InstanceGroupManagersPatchPerInstanceConfigsReq>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagersPatchPerInstanceConfigsReq>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
