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
 * Time window specified for weekly operations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ResourcePolicyWeeklyCycle}
 */
public final class ResourcePolicyWeeklyCycle extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ResourcePolicyWeeklyCycle)
    ResourcePolicyWeeklyCycleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResourcePolicyWeeklyCycle.newBuilder() to construct.
  private ResourcePolicyWeeklyCycle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResourcePolicyWeeklyCycle() {
    dayOfWeeks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResourcePolicyWeeklyCycle();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ResourcePolicyWeeklyCycle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ResourcePolicyWeeklyCycle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.class,
            com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.Builder.class);
  }

  public static final int DAY_OF_WEEKS_FIELD_NUMBER = 257871834;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek>
      dayOfWeeks_;
  /**
   *
   *
   * <pre>
   * Up to 7 intervals/windows, one for each day of the week.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek>
      getDayOfWeeksList() {
    return dayOfWeeks_;
  }
  /**
   *
   *
   * <pre>
   * Up to 7 intervals/windows, one for each day of the week.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeekOrBuilder>
      getDayOfWeeksOrBuilderList() {
    return dayOfWeeks_;
  }
  /**
   *
   *
   * <pre>
   * Up to 7 intervals/windows, one for each day of the week.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
   * </code>
   */
  @java.lang.Override
  public int getDayOfWeeksCount() {
    return dayOfWeeks_.size();
  }
  /**
   *
   *
   * <pre>
   * Up to 7 intervals/windows, one for each day of the week.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek getDayOfWeeks(int index) {
    return dayOfWeeks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Up to 7 intervals/windows, one for each day of the week.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeekOrBuilder
      getDayOfWeeksOrBuilder(int index) {
    return dayOfWeeks_.get(index);
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
    for (int i = 0; i < dayOfWeeks_.size(); i++) {
      output.writeMessage(257871834, dayOfWeeks_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dayOfWeeks_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(257871834, dayOfWeeks_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle other =
        (com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle) obj;

    if (!getDayOfWeeksList().equals(other.getDayOfWeeksList())) return false;
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
    if (getDayOfWeeksCount() > 0) {
      hash = (37 * hash) + DAY_OF_WEEKS_FIELD_NUMBER;
      hash = (53 * hash) + getDayOfWeeksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle parseFrom(
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
      com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle prototype) {
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
   * Time window specified for weekly operations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ResourcePolicyWeeklyCycle}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ResourcePolicyWeeklyCycle)
      com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ResourcePolicyWeeklyCycle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ResourcePolicyWeeklyCycle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.class,
              com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (dayOfWeeksBuilder_ == null) {
        dayOfWeeks_ = java.util.Collections.emptyList();
      } else {
        dayOfWeeks_ = null;
        dayOfWeeksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ResourcePolicyWeeklyCycle_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle build() {
      com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle buildPartial() {
      com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle result =
          new com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle result) {
      if (dayOfWeeksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dayOfWeeks_ = java.util.Collections.unmodifiableList(dayOfWeeks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dayOfWeeks_ = dayOfWeeks_;
      } else {
        result.dayOfWeeks_ = dayOfWeeksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle result) {
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
      if (other instanceof com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle) {
        return mergeFrom((com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle other) {
      if (other == com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle.getDefaultInstance())
        return this;
      if (dayOfWeeksBuilder_ == null) {
        if (!other.dayOfWeeks_.isEmpty()) {
          if (dayOfWeeks_.isEmpty()) {
            dayOfWeeks_ = other.dayOfWeeks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDayOfWeeksIsMutable();
            dayOfWeeks_.addAll(other.dayOfWeeks_);
          }
          onChanged();
        }
      } else {
        if (!other.dayOfWeeks_.isEmpty()) {
          if (dayOfWeeksBuilder_.isEmpty()) {
            dayOfWeeksBuilder_.dispose();
            dayOfWeeksBuilder_ = null;
            dayOfWeeks_ = other.dayOfWeeks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dayOfWeeksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDayOfWeeksFieldBuilder()
                    : null;
          } else {
            dayOfWeeksBuilder_.addAllMessages(other.dayOfWeeks_);
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
            case 2062974674:
              {
                com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek m =
                    input.readMessage(
                        com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.parser(),
                        extensionRegistry);
                if (dayOfWeeksBuilder_ == null) {
                  ensureDayOfWeeksIsMutable();
                  dayOfWeeks_.add(m);
                } else {
                  dayOfWeeksBuilder_.addMessage(m);
                }
                break;
              } // case 2062974674
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

    private java.util.List<com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek>
        dayOfWeeks_ = java.util.Collections.emptyList();

    private void ensureDayOfWeeksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dayOfWeeks_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek>(
                dayOfWeeks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek,
            com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.Builder,
            com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeekOrBuilder>
        dayOfWeeksBuilder_;

    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek>
        getDayOfWeeksList() {
      if (dayOfWeeksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dayOfWeeks_);
      } else {
        return dayOfWeeksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public int getDayOfWeeksCount() {
      if (dayOfWeeksBuilder_ == null) {
        return dayOfWeeks_.size();
      } else {
        return dayOfWeeksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek getDayOfWeeks(int index) {
      if (dayOfWeeksBuilder_ == null) {
        return dayOfWeeks_.get(index);
      } else {
        return dayOfWeeksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public Builder setDayOfWeeks(
        int index, com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek value) {
      if (dayOfWeeksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDayOfWeeksIsMutable();
        dayOfWeeks_.set(index, value);
        onChanged();
      } else {
        dayOfWeeksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public Builder setDayOfWeeks(
        int index,
        com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.Builder builderForValue) {
      if (dayOfWeeksBuilder_ == null) {
        ensureDayOfWeeksIsMutable();
        dayOfWeeks_.set(index, builderForValue.build());
        onChanged();
      } else {
        dayOfWeeksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public Builder addDayOfWeeks(
        com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek value) {
      if (dayOfWeeksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDayOfWeeksIsMutable();
        dayOfWeeks_.add(value);
        onChanged();
      } else {
        dayOfWeeksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public Builder addDayOfWeeks(
        int index, com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek value) {
      if (dayOfWeeksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDayOfWeeksIsMutable();
        dayOfWeeks_.add(index, value);
        onChanged();
      } else {
        dayOfWeeksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public Builder addDayOfWeeks(
        com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.Builder builderForValue) {
      if (dayOfWeeksBuilder_ == null) {
        ensureDayOfWeeksIsMutable();
        dayOfWeeks_.add(builderForValue.build());
        onChanged();
      } else {
        dayOfWeeksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public Builder addDayOfWeeks(
        int index,
        com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.Builder builderForValue) {
      if (dayOfWeeksBuilder_ == null) {
        ensureDayOfWeeksIsMutable();
        dayOfWeeks_.add(index, builderForValue.build());
        onChanged();
      } else {
        dayOfWeeksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public Builder addAllDayOfWeeks(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek>
            values) {
      if (dayOfWeeksBuilder_ == null) {
        ensureDayOfWeeksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dayOfWeeks_);
        onChanged();
      } else {
        dayOfWeeksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public Builder clearDayOfWeeks() {
      if (dayOfWeeksBuilder_ == null) {
        dayOfWeeks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dayOfWeeksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public Builder removeDayOfWeeks(int index) {
      if (dayOfWeeksBuilder_ == null) {
        ensureDayOfWeeksIsMutable();
        dayOfWeeks_.remove(index);
        onChanged();
      } else {
        dayOfWeeksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.Builder
        getDayOfWeeksBuilder(int index) {
      return getDayOfWeeksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeekOrBuilder
        getDayOfWeeksOrBuilder(int index) {
      if (dayOfWeeksBuilder_ == null) {
        return dayOfWeeks_.get(index);
      } else {
        return dayOfWeeksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeekOrBuilder>
        getDayOfWeeksOrBuilderList() {
      if (dayOfWeeksBuilder_ != null) {
        return dayOfWeeksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dayOfWeeks_);
      }
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.Builder
        addDayOfWeeksBuilder() {
      return getDayOfWeeksFieldBuilder()
          .addBuilder(
              com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.Builder
        addDayOfWeeksBuilder(int index) {
      return getDayOfWeeksFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Up to 7 intervals/windows, one for each day of the week.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.Builder>
        getDayOfWeeksBuilderList() {
      return getDayOfWeeksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek,
            com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.Builder,
            com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeekOrBuilder>
        getDayOfWeeksFieldBuilder() {
      if (dayOfWeeksBuilder_ == null) {
        dayOfWeeksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek,
                com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek.Builder,
                com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeekOrBuilder>(
                dayOfWeeks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        dayOfWeeks_ = null;
      }
      return dayOfWeeksBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ResourcePolicyWeeklyCycle)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ResourcePolicyWeeklyCycle)
  private static final com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle();
  }

  public static com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourcePolicyWeeklyCycle> PARSER =
      new com.google.protobuf.AbstractParser<ResourcePolicyWeeklyCycle>() {
        @java.lang.Override
        public ResourcePolicyWeeklyCycle parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourcePolicyWeeklyCycle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourcePolicyWeeklyCycle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicyWeeklyCycle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
