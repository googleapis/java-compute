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
 * Protobuf type {@code google.cloud.compute.v1.HealthChecksScopedList}
 */
public final class HealthChecksScopedList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.HealthChecksScopedList)
    HealthChecksScopedListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HealthChecksScopedList.newBuilder() to construct.
  private HealthChecksScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HealthChecksScopedList() {
    healthChecks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HealthChecksScopedList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_HealthChecksScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_HealthChecksScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.HealthChecksScopedList.class,
            com.google.cloud.compute.v1.HealthChecksScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int HEALTH_CHECKS_FIELD_NUMBER = 448370606;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.HealthCheck> healthChecks_;
  /**
   *
   *
   * <pre>
   * A list of HealthChecks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.HealthCheck> getHealthChecksList() {
    return healthChecks_;
  }
  /**
   *
   *
   * <pre>
   * A list of HealthChecks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.HealthCheckOrBuilder>
      getHealthChecksOrBuilderList() {
    return healthChecks_;
  }
  /**
   *
   *
   * <pre>
   * A list of HealthChecks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
   */
  @java.lang.Override
  public int getHealthChecksCount() {
    return healthChecks_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of HealthChecks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HealthCheck getHealthChecks(int index) {
    return healthChecks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of HealthChecks contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HealthCheckOrBuilder getHealthChecksOrBuilder(int index) {
    return healthChecks_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;
  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Warning getWarning() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
  }
  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of backend services when the list is empty.
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(50704284, getWarning());
    }
    for (int i = 0; i < healthChecks_.size(); i++) {
      output.writeMessage(448370606, healthChecks_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(50704284, getWarning());
    }
    for (int i = 0; i < healthChecks_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(448370606, healthChecks_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.HealthChecksScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.HealthChecksScopedList other =
        (com.google.cloud.compute.v1.HealthChecksScopedList) obj;

    if (!getHealthChecksList().equals(other.getHealthChecksList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning().equals(other.getWarning())) return false;
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
    if (getHealthChecksCount() > 0) {
      hash = (37 * hash) + HEALTH_CHECKS_FIELD_NUMBER;
      hash = (53 * hash) + getHealthChecksList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.HealthChecksScopedList prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.HealthChecksScopedList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.HealthChecksScopedList)
      com.google.cloud.compute.v1.HealthChecksScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HealthChecksScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HealthChecksScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.HealthChecksScopedList.class,
              com.google.cloud.compute.v1.HealthChecksScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.HealthChecksScopedList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getHealthChecksFieldBuilder();
        getWarningFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (healthChecksBuilder_ == null) {
        healthChecks_ = java.util.Collections.emptyList();
      } else {
        healthChecks_ = null;
        healthChecksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HealthChecksScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HealthChecksScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.HealthChecksScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HealthChecksScopedList build() {
      com.google.cloud.compute.v1.HealthChecksScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HealthChecksScopedList buildPartial() {
      com.google.cloud.compute.v1.HealthChecksScopedList result =
          new com.google.cloud.compute.v1.HealthChecksScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.HealthChecksScopedList result) {
      if (healthChecksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          healthChecks_ = java.util.Collections.unmodifiableList(healthChecks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.healthChecks_ = healthChecks_;
      } else {
        result.healthChecks_ = healthChecksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.HealthChecksScopedList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.warning_ = warningBuilder_ == null ? warning_ : warningBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.HealthChecksScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.HealthChecksScopedList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.HealthChecksScopedList other) {
      if (other == com.google.cloud.compute.v1.HealthChecksScopedList.getDefaultInstance())
        return this;
      if (healthChecksBuilder_ == null) {
        if (!other.healthChecks_.isEmpty()) {
          if (healthChecks_.isEmpty()) {
            healthChecks_ = other.healthChecks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHealthChecksIsMutable();
            healthChecks_.addAll(other.healthChecks_);
          }
          onChanged();
        }
      } else {
        if (!other.healthChecks_.isEmpty()) {
          if (healthChecksBuilder_.isEmpty()) {
            healthChecksBuilder_.dispose();
            healthChecksBuilder_ = null;
            healthChecks_ = other.healthChecks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            healthChecksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getHealthChecksFieldBuilder()
                    : null;
          } else {
            healthChecksBuilder_.addAllMessages(other.healthChecks_);
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
            case 405634274:
              {
                input.readMessage(getWarningFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 405634274
            case -708002446:
              {
                com.google.cloud.compute.v1.HealthCheck m =
                    input.readMessage(
                        com.google.cloud.compute.v1.HealthCheck.parser(), extensionRegistry);
                if (healthChecksBuilder_ == null) {
                  ensureHealthChecksIsMutable();
                  healthChecks_.add(m);
                } else {
                  healthChecksBuilder_.addMessage(m);
                }
                break;
              } // case -708002446
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

    private java.util.List<com.google.cloud.compute.v1.HealthCheck> healthChecks_ =
        java.util.Collections.emptyList();

    private void ensureHealthChecksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        healthChecks_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.HealthCheck>(healthChecks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.HealthCheck,
            com.google.cloud.compute.v1.HealthCheck.Builder,
            com.google.cloud.compute.v1.HealthCheckOrBuilder>
        healthChecksBuilder_;

    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.HealthCheck> getHealthChecksList() {
      if (healthChecksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(healthChecks_);
      } else {
        return healthChecksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public int getHealthChecksCount() {
      if (healthChecksBuilder_ == null) {
        return healthChecks_.size();
      } else {
        return healthChecksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public com.google.cloud.compute.v1.HealthCheck getHealthChecks(int index) {
      if (healthChecksBuilder_ == null) {
        return healthChecks_.get(index);
      } else {
        return healthChecksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public Builder setHealthChecks(int index, com.google.cloud.compute.v1.HealthCheck value) {
      if (healthChecksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHealthChecksIsMutable();
        healthChecks_.set(index, value);
        onChanged();
      } else {
        healthChecksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public Builder setHealthChecks(
        int index, com.google.cloud.compute.v1.HealthCheck.Builder builderForValue) {
      if (healthChecksBuilder_ == null) {
        ensureHealthChecksIsMutable();
        healthChecks_.set(index, builderForValue.build());
        onChanged();
      } else {
        healthChecksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public Builder addHealthChecks(com.google.cloud.compute.v1.HealthCheck value) {
      if (healthChecksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHealthChecksIsMutable();
        healthChecks_.add(value);
        onChanged();
      } else {
        healthChecksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public Builder addHealthChecks(int index, com.google.cloud.compute.v1.HealthCheck value) {
      if (healthChecksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHealthChecksIsMutable();
        healthChecks_.add(index, value);
        onChanged();
      } else {
        healthChecksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public Builder addHealthChecks(
        com.google.cloud.compute.v1.HealthCheck.Builder builderForValue) {
      if (healthChecksBuilder_ == null) {
        ensureHealthChecksIsMutable();
        healthChecks_.add(builderForValue.build());
        onChanged();
      } else {
        healthChecksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public Builder addHealthChecks(
        int index, com.google.cloud.compute.v1.HealthCheck.Builder builderForValue) {
      if (healthChecksBuilder_ == null) {
        ensureHealthChecksIsMutable();
        healthChecks_.add(index, builderForValue.build());
        onChanged();
      } else {
        healthChecksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public Builder addAllHealthChecks(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.HealthCheck> values) {
      if (healthChecksBuilder_ == null) {
        ensureHealthChecksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, healthChecks_);
        onChanged();
      } else {
        healthChecksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public Builder clearHealthChecks() {
      if (healthChecksBuilder_ == null) {
        healthChecks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        healthChecksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public Builder removeHealthChecks(int index) {
      if (healthChecksBuilder_ == null) {
        ensureHealthChecksIsMutable();
        healthChecks_.remove(index);
        onChanged();
      } else {
        healthChecksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public com.google.cloud.compute.v1.HealthCheck.Builder getHealthChecksBuilder(int index) {
      return getHealthChecksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public com.google.cloud.compute.v1.HealthCheckOrBuilder getHealthChecksOrBuilder(int index) {
      if (healthChecksBuilder_ == null) {
        return healthChecks_.get(index);
      } else {
        return healthChecksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.HealthCheckOrBuilder>
        getHealthChecksOrBuilderList() {
      if (healthChecksBuilder_ != null) {
        return healthChecksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(healthChecks_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public com.google.cloud.compute.v1.HealthCheck.Builder addHealthChecksBuilder() {
      return getHealthChecksFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.HealthCheck.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public com.google.cloud.compute.v1.HealthCheck.Builder addHealthChecksBuilder(int index) {
      return getHealthChecksFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.HealthCheck.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of HealthChecks contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HealthCheck health_checks = 448370606;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.HealthCheck.Builder>
        getHealthChecksBuilderList() {
      return getHealthChecksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.HealthCheck,
            com.google.cloud.compute.v1.HealthCheck.Builder,
            com.google.cloud.compute.v1.HealthCheckOrBuilder>
        getHealthChecksFieldBuilder() {
      if (healthChecksBuilder_ == null) {
        healthChecksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.HealthCheck,
                com.google.cloud.compute.v1.HealthCheck.Builder,
                com.google.cloud.compute.v1.HealthCheckOrBuilder>(
                healthChecks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        healthChecks_ = null;
      }
      return healthChecksBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        warningBuilder_;
    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return The warning.
     */
    public com.google.cloud.compute.v1.Warning getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
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
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder mergeWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && warning_ != null
            && warning_ != com.google.cloud.compute.v1.Warning.getDefaultInstance()) {
          getWarningBuilder().mergeFrom(value);
        } else {
          warning_ = value;
        }
      } else {
        warningBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder clearWarning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
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
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      }
    }
    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of backend services when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Warning,
                com.google.cloud.compute.v1.Warning.Builder,
                com.google.cloud.compute.v1.WarningOrBuilder>(
                getWarning(), getParentForChildren(), isClean());
        warning_ = null;
      }
      return warningBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.HealthChecksScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.HealthChecksScopedList)
  private static final com.google.cloud.compute.v1.HealthChecksScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.HealthChecksScopedList();
  }

  public static com.google.cloud.compute.v1.HealthChecksScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HealthChecksScopedList> PARSER =
      new com.google.protobuf.AbstractParser<HealthChecksScopedList>() {
        @java.lang.Override
        public HealthChecksScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<HealthChecksScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HealthChecksScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.HealthChecksScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
