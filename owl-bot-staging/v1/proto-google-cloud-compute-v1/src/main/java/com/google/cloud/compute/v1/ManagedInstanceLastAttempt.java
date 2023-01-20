// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ManagedInstanceLastAttempt}
 */
public final class ManagedInstanceLastAttempt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ManagedInstanceLastAttempt)
    ManagedInstanceLastAttemptOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ManagedInstanceLastAttempt.newBuilder() to construct.
  private ManagedInstanceLastAttempt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ManagedInstanceLastAttempt() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ManagedInstanceLastAttempt();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ManagedInstanceLastAttempt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ManagedInstanceLastAttempt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ManagedInstanceLastAttempt.class, com.google.cloud.compute.v1.ManagedInstanceLastAttempt.Builder.class);
  }

  private int bitField0_;
  public static final int ERRORS_FIELD_NUMBER = 315977579;
  private com.google.cloud.compute.v1.Errors errors_;
  /**
   * <pre>
   * [Output Only] Encountered errors during the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
   * @return Whether the errors field is set.
   */
  @java.lang.Override
  public boolean hasErrors() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * [Output Only] Encountered errors during the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
   * @return The errors.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Errors getErrors() {
    return errors_ == null ? com.google.cloud.compute.v1.Errors.getDefaultInstance() : errors_;
  }
  /**
   * <pre>
   * [Output Only] Encountered errors during the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ErrorsOrBuilder getErrorsOrBuilder() {
    return errors_ == null ? com.google.cloud.compute.v1.Errors.getDefaultInstance() : errors_;
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
      output.writeMessage(315977579, getErrors());
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
        .computeMessageSize(315977579, getErrors());
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
    if (!(obj instanceof com.google.cloud.compute.v1.ManagedInstanceLastAttempt)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ManagedInstanceLastAttempt other = (com.google.cloud.compute.v1.ManagedInstanceLastAttempt) obj;

    if (hasErrors() != other.hasErrors()) return false;
    if (hasErrors()) {
      if (!getErrors()
          .equals(other.getErrors())) return false;
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
    if (hasErrors()) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getErrors().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.ManagedInstanceLastAttempt prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.ManagedInstanceLastAttempt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ManagedInstanceLastAttempt)
      com.google.cloud.compute.v1.ManagedInstanceLastAttemptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ManagedInstanceLastAttempt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ManagedInstanceLastAttempt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ManagedInstanceLastAttempt.class, com.google.cloud.compute.v1.ManagedInstanceLastAttempt.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ManagedInstanceLastAttempt.newBuilder()
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
        getErrorsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      errors_ = null;
      if (errorsBuilder_ != null) {
        errorsBuilder_.dispose();
        errorsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ManagedInstanceLastAttempt_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ManagedInstanceLastAttempt getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ManagedInstanceLastAttempt.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ManagedInstanceLastAttempt build() {
      com.google.cloud.compute.v1.ManagedInstanceLastAttempt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ManagedInstanceLastAttempt buildPartial() {
      com.google.cloud.compute.v1.ManagedInstanceLastAttempt result = new com.google.cloud.compute.v1.ManagedInstanceLastAttempt(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.ManagedInstanceLastAttempt result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.errors_ = errorsBuilder_ == null
            ? errors_
            : errorsBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.ManagedInstanceLastAttempt) {
        return mergeFrom((com.google.cloud.compute.v1.ManagedInstanceLastAttempt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ManagedInstanceLastAttempt other) {
      if (other == com.google.cloud.compute.v1.ManagedInstanceLastAttempt.getDefaultInstance()) return this;
      if (other.hasErrors()) {
        mergeErrors(other.getErrors());
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
            case -1767146662: {
              input.readMessage(
                  getErrorsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case -1767146662
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

    private com.google.cloud.compute.v1.Errors errors_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Errors, com.google.cloud.compute.v1.Errors.Builder, com.google.cloud.compute.v1.ErrorsOrBuilder> errorsBuilder_;
    /**
     * <pre>
     * [Output Only] Encountered errors during the last attempt to create or delete the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
     * @return Whether the errors field is set.
     */
    public boolean hasErrors() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * [Output Only] Encountered errors during the last attempt to create or delete the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
     * @return The errors.
     */
    public com.google.cloud.compute.v1.Errors getErrors() {
      if (errorsBuilder_ == null) {
        return errors_ == null ? com.google.cloud.compute.v1.Errors.getDefaultInstance() : errors_;
      } else {
        return errorsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * [Output Only] Encountered errors during the last attempt to create or delete the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder setErrors(com.google.cloud.compute.v1.Errors value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        errors_ = value;
      } else {
        errorsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Encountered errors during the last attempt to create or delete the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder setErrors(
        com.google.cloud.compute.v1.Errors.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        errors_ = builderForValue.build();
      } else {
        errorsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Encountered errors during the last attempt to create or delete the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder mergeErrors(com.google.cloud.compute.v1.Errors value) {
      if (errorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          errors_ != null &&
          errors_ != com.google.cloud.compute.v1.Errors.getDefaultInstance()) {
          getErrorsBuilder().mergeFrom(value);
        } else {
          errors_ = value;
        }
      } else {
        errorsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Encountered errors during the last attempt to create or delete the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public Builder clearErrors() {
      bitField0_ = (bitField0_ & ~0x00000001);
      errors_ = null;
      if (errorsBuilder_ != null) {
        errorsBuilder_.dispose();
        errorsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Encountered errors during the last attempt to create or delete the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public com.google.cloud.compute.v1.Errors.Builder getErrorsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getErrorsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * [Output Only] Encountered errors during the last attempt to create or delete the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    public com.google.cloud.compute.v1.ErrorsOrBuilder getErrorsOrBuilder() {
      if (errorsBuilder_ != null) {
        return errorsBuilder_.getMessageOrBuilder();
      } else {
        return errors_ == null ?
            com.google.cloud.compute.v1.Errors.getDefaultInstance() : errors_;
      }
    }
    /**
     * <pre>
     * [Output Only] Encountered errors during the last attempt to create or delete the instance.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Errors, com.google.cloud.compute.v1.Errors.Builder, com.google.cloud.compute.v1.ErrorsOrBuilder> 
        getErrorsFieldBuilder() {
      if (errorsBuilder_ == null) {
        errorsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Errors, com.google.cloud.compute.v1.Errors.Builder, com.google.cloud.compute.v1.ErrorsOrBuilder>(
                getErrors(),
                getParentForChildren(),
                isClean());
        errors_ = null;
      }
      return errorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ManagedInstanceLastAttempt)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ManagedInstanceLastAttempt)
  private static final com.google.cloud.compute.v1.ManagedInstanceLastAttempt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ManagedInstanceLastAttempt();
  }

  public static com.google.cloud.compute.v1.ManagedInstanceLastAttempt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagedInstanceLastAttempt>
      PARSER = new com.google.protobuf.AbstractParser<ManagedInstanceLastAttempt>() {
    @java.lang.Override
    public ManagedInstanceLastAttempt parsePartialFrom(
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

  public static com.google.protobuf.Parser<ManagedInstanceLastAttempt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagedInstanceLastAttempt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ManagedInstanceLastAttempt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

