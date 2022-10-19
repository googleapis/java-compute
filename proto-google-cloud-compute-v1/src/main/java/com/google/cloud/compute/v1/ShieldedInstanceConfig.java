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
 * A set of Shielded Instance options.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ShieldedInstanceConfig}
 */
public final class ShieldedInstanceConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ShieldedInstanceConfig)
    ShieldedInstanceConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ShieldedInstanceConfig.newBuilder() to construct.
  private ShieldedInstanceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ShieldedInstanceConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ShieldedInstanceConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ShieldedInstanceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ShieldedInstanceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ShieldedInstanceConfig.class,
            com.google.cloud.compute.v1.ShieldedInstanceConfig.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLE_INTEGRITY_MONITORING_FIELD_NUMBER = 409071030;
  private boolean enableIntegrityMonitoring_;
  /**
   *
   *
   * <pre>
   * Defines whether the instance has integrity monitoring enabled. Enabled by default.
   * </pre>
   *
   * <code>optional bool enable_integrity_monitoring = 409071030;</code>
   *
   * @return Whether the enableIntegrityMonitoring field is set.
   */
  @java.lang.Override
  public boolean hasEnableIntegrityMonitoring() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Defines whether the instance has integrity monitoring enabled. Enabled by default.
   * </pre>
   *
   * <code>optional bool enable_integrity_monitoring = 409071030;</code>
   *
   * @return The enableIntegrityMonitoring.
   */
  @java.lang.Override
  public boolean getEnableIntegrityMonitoring() {
    return enableIntegrityMonitoring_;
  }

  public static final int ENABLE_SECURE_BOOT_FIELD_NUMBER = 123568638;
  private boolean enableSecureBoot_;
  /**
   *
   *
   * <pre>
   * Defines whether the instance has Secure Boot enabled. Disabled by default.
   * </pre>
   *
   * <code>optional bool enable_secure_boot = 123568638;</code>
   *
   * @return Whether the enableSecureBoot field is set.
   */
  @java.lang.Override
  public boolean hasEnableSecureBoot() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Defines whether the instance has Secure Boot enabled. Disabled by default.
   * </pre>
   *
   * <code>optional bool enable_secure_boot = 123568638;</code>
   *
   * @return The enableSecureBoot.
   */
  @java.lang.Override
  public boolean getEnableSecureBoot() {
    return enableSecureBoot_;
  }

  public static final int ENABLE_VTPM_FIELD_NUMBER = 181858935;
  private boolean enableVtpm_;
  /**
   *
   *
   * <pre>
   * Defines whether the instance has the vTPM enabled. Enabled by default.
   * </pre>
   *
   * <code>optional bool enable_vtpm = 181858935;</code>
   *
   * @return Whether the enableVtpm field is set.
   */
  @java.lang.Override
  public boolean hasEnableVtpm() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * Defines whether the instance has the vTPM enabled. Enabled by default.
   * </pre>
   *
   * <code>optional bool enable_vtpm = 181858935;</code>
   *
   * @return The enableVtpm.
   */
  @java.lang.Override
  public boolean getEnableVtpm() {
    return enableVtpm_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(123568638, enableSecureBoot_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(181858935, enableVtpm_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(409071030, enableIntegrityMonitoring_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(123568638, enableSecureBoot_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(181858935, enableVtpm_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              409071030, enableIntegrityMonitoring_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ShieldedInstanceConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ShieldedInstanceConfig other =
        (com.google.cloud.compute.v1.ShieldedInstanceConfig) obj;

    if (hasEnableIntegrityMonitoring() != other.hasEnableIntegrityMonitoring()) return false;
    if (hasEnableIntegrityMonitoring()) {
      if (getEnableIntegrityMonitoring() != other.getEnableIntegrityMonitoring()) return false;
    }
    if (hasEnableSecureBoot() != other.hasEnableSecureBoot()) return false;
    if (hasEnableSecureBoot()) {
      if (getEnableSecureBoot() != other.getEnableSecureBoot()) return false;
    }
    if (hasEnableVtpm() != other.hasEnableVtpm()) return false;
    if (hasEnableVtpm()) {
      if (getEnableVtpm() != other.getEnableVtpm()) return false;
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
    if (hasEnableIntegrityMonitoring()) {
      hash = (37 * hash) + ENABLE_INTEGRITY_MONITORING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableIntegrityMonitoring());
    }
    if (hasEnableSecureBoot()) {
      hash = (37 * hash) + ENABLE_SECURE_BOOT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableSecureBoot());
    }
    if (hasEnableVtpm()) {
      hash = (37 * hash) + ENABLE_VTPM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableVtpm());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.ShieldedInstanceConfig prototype) {
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
   * A set of Shielded Instance options.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ShieldedInstanceConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ShieldedInstanceConfig)
      com.google.cloud.compute.v1.ShieldedInstanceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ShieldedInstanceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ShieldedInstanceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ShieldedInstanceConfig.class,
              com.google.cloud.compute.v1.ShieldedInstanceConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ShieldedInstanceConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      enableIntegrityMonitoring_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      enableSecureBoot_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      enableVtpm_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ShieldedInstanceConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShieldedInstanceConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ShieldedInstanceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShieldedInstanceConfig build() {
      com.google.cloud.compute.v1.ShieldedInstanceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShieldedInstanceConfig buildPartial() {
      com.google.cloud.compute.v1.ShieldedInstanceConfig result =
          new com.google.cloud.compute.v1.ShieldedInstanceConfig(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableIntegrityMonitoring_ = enableIntegrityMonitoring_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.enableSecureBoot_ = enableSecureBoot_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.enableVtpm_ = enableVtpm_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.compute.v1.ShieldedInstanceConfig) {
        return mergeFrom((com.google.cloud.compute.v1.ShieldedInstanceConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ShieldedInstanceConfig other) {
      if (other == com.google.cloud.compute.v1.ShieldedInstanceConfig.getDefaultInstance())
        return this;
      if (other.hasEnableIntegrityMonitoring()) {
        setEnableIntegrityMonitoring(other.getEnableIntegrityMonitoring());
      }
      if (other.hasEnableSecureBoot()) {
        setEnableSecureBoot(other.getEnableSecureBoot());
      }
      if (other.hasEnableVtpm()) {
        setEnableVtpm(other.getEnableVtpm());
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
            case 988549104:
              {
                enableSecureBoot_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 988549104
            case 1454871480:
              {
                enableVtpm_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 1454871480
            case -1022399056:
              {
                enableIntegrityMonitoring_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case -1022399056
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

    private boolean enableIntegrityMonitoring_;
    /**
     *
     *
     * <pre>
     * Defines whether the instance has integrity monitoring enabled. Enabled by default.
     * </pre>
     *
     * <code>optional bool enable_integrity_monitoring = 409071030;</code>
     *
     * @return Whether the enableIntegrityMonitoring field is set.
     */
    @java.lang.Override
    public boolean hasEnableIntegrityMonitoring() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has integrity monitoring enabled. Enabled by default.
     * </pre>
     *
     * <code>optional bool enable_integrity_monitoring = 409071030;</code>
     *
     * @return The enableIntegrityMonitoring.
     */
    @java.lang.Override
    public boolean getEnableIntegrityMonitoring() {
      return enableIntegrityMonitoring_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has integrity monitoring enabled. Enabled by default.
     * </pre>
     *
     * <code>optional bool enable_integrity_monitoring = 409071030;</code>
     *
     * @param value The enableIntegrityMonitoring to set.
     * @return This builder for chaining.
     */
    public Builder setEnableIntegrityMonitoring(boolean value) {
      bitField0_ |= 0x00000001;
      enableIntegrityMonitoring_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has integrity monitoring enabled. Enabled by default.
     * </pre>
     *
     * <code>optional bool enable_integrity_monitoring = 409071030;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableIntegrityMonitoring() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableIntegrityMonitoring_ = false;
      onChanged();
      return this;
    }

    private boolean enableSecureBoot_;
    /**
     *
     *
     * <pre>
     * Defines whether the instance has Secure Boot enabled. Disabled by default.
     * </pre>
     *
     * <code>optional bool enable_secure_boot = 123568638;</code>
     *
     * @return Whether the enableSecureBoot field is set.
     */
    @java.lang.Override
    public boolean hasEnableSecureBoot() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has Secure Boot enabled. Disabled by default.
     * </pre>
     *
     * <code>optional bool enable_secure_boot = 123568638;</code>
     *
     * @return The enableSecureBoot.
     */
    @java.lang.Override
    public boolean getEnableSecureBoot() {
      return enableSecureBoot_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has Secure Boot enabled. Disabled by default.
     * </pre>
     *
     * <code>optional bool enable_secure_boot = 123568638;</code>
     *
     * @param value The enableSecureBoot to set.
     * @return This builder for chaining.
     */
    public Builder setEnableSecureBoot(boolean value) {
      bitField0_ |= 0x00000002;
      enableSecureBoot_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has Secure Boot enabled. Disabled by default.
     * </pre>
     *
     * <code>optional bool enable_secure_boot = 123568638;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableSecureBoot() {
      bitField0_ = (bitField0_ & ~0x00000002);
      enableSecureBoot_ = false;
      onChanged();
      return this;
    }

    private boolean enableVtpm_;
    /**
     *
     *
     * <pre>
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * </pre>
     *
     * <code>optional bool enable_vtpm = 181858935;</code>
     *
     * @return Whether the enableVtpm field is set.
     */
    @java.lang.Override
    public boolean hasEnableVtpm() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * </pre>
     *
     * <code>optional bool enable_vtpm = 181858935;</code>
     *
     * @return The enableVtpm.
     */
    @java.lang.Override
    public boolean getEnableVtpm() {
      return enableVtpm_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * </pre>
     *
     * <code>optional bool enable_vtpm = 181858935;</code>
     *
     * @param value The enableVtpm to set.
     * @return This builder for chaining.
     */
    public Builder setEnableVtpm(boolean value) {
      bitField0_ |= 0x00000004;
      enableVtpm_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * </pre>
     *
     * <code>optional bool enable_vtpm = 181858935;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableVtpm() {
      bitField0_ = (bitField0_ & ~0x00000004);
      enableVtpm_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ShieldedInstanceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ShieldedInstanceConfig)
  private static final com.google.cloud.compute.v1.ShieldedInstanceConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ShieldedInstanceConfig();
  }

  public static com.google.cloud.compute.v1.ShieldedInstanceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShieldedInstanceConfig> PARSER =
      new com.google.protobuf.AbstractParser<ShieldedInstanceConfig>() {
        @java.lang.Override
        public ShieldedInstanceConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShieldedInstanceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShieldedInstanceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ShieldedInstanceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
