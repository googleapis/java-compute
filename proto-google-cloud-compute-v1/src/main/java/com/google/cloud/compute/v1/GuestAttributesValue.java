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
 * Array of guest attribute namespace/key/value tuples.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GuestAttributesValue}
 */
public final class GuestAttributesValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GuestAttributesValue)
    GuestAttributesValueOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GuestAttributesValue.newBuilder() to construct.
  private GuestAttributesValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GuestAttributesValue() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GuestAttributesValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_GuestAttributesValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_GuestAttributesValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GuestAttributesValue.class,
            com.google.cloud.compute.v1.GuestAttributesValue.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 100526016;
  private java.util.List<com.google.cloud.compute.v1.GuestAttributesEntry> items_;
  /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.GuestAttributesEntry> getItemsList() {
    return items_;
  }
  /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.GuestAttributesEntryOrBuilder>
      getItemsOrBuilderList() {
    return items_;
  }
  /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
  @java.lang.Override
  public com.google.cloud.compute.v1.GuestAttributesEntry getItems(int index) {
    return items_.get(index);
  }
  /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
  @java.lang.Override
  public com.google.cloud.compute.v1.GuestAttributesEntryOrBuilder getItemsOrBuilder(int index) {
    return items_.get(index);
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
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(100526016, items_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(100526016, items_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.GuestAttributesValue)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GuestAttributesValue other =
        (com.google.cloud.compute.v1.GuestAttributesValue) obj;

    if (!getItemsList().equals(other.getItemsList())) return false;
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
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.GuestAttributesValue prototype) {
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
   * Array of guest attribute namespace/key/value tuples.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GuestAttributesValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GuestAttributesValue)
      com.google.cloud.compute.v1.GuestAttributesValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GuestAttributesValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GuestAttributesValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GuestAttributesValue.class,
              com.google.cloud.compute.v1.GuestAttributesValue.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GuestAttributesValue.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
      } else {
        items_ = null;
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GuestAttributesValue_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GuestAttributesValue getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GuestAttributesValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GuestAttributesValue build() {
      com.google.cloud.compute.v1.GuestAttributesValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GuestAttributesValue buildPartial() {
      com.google.cloud.compute.v1.GuestAttributesValue result =
          new com.google.cloud.compute.v1.GuestAttributesValue(this);
      int from_bitField0_ = bitField0_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.compute.v1.GuestAttributesValue) {
        return mergeFrom((com.google.cloud.compute.v1.GuestAttributesValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GuestAttributesValue other) {
      if (other == com.google.cloud.compute.v1.GuestAttributesValue.getDefaultInstance())
        return this;
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getItemsFieldBuilder()
                    : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
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
            case 804208130:
              {
                com.google.cloud.compute.v1.GuestAttributesEntry m =
                    input.readMessage(
                        com.google.cloud.compute.v1.GuestAttributesEntry.parser(),
                        extensionRegistry);
                if (itemsBuilder_ == null) {
                  ensureItemsIsMutable();
                  items_.add(m);
                } else {
                  itemsBuilder_.addMessage(m);
                }
                break;
              } // case 804208130
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

    private java.util.List<com.google.cloud.compute.v1.GuestAttributesEntry> items_ =
        java.util.Collections.emptyList();

    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<com.google.cloud.compute.v1.GuestAttributesEntry>(items_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.GuestAttributesEntry,
            com.google.cloud.compute.v1.GuestAttributesEntry.Builder,
            com.google.cloud.compute.v1.GuestAttributesEntryOrBuilder>
        itemsBuilder_;

    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public java.util.List<com.google.cloud.compute.v1.GuestAttributesEntry> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public com.google.cloud.compute.v1.GuestAttributesEntry getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public Builder setItems(int index, com.google.cloud.compute.v1.GuestAttributesEntry value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public Builder setItems(
        int index, com.google.cloud.compute.v1.GuestAttributesEntry.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public Builder addItems(com.google.cloud.compute.v1.GuestAttributesEntry value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public Builder addItems(int index, com.google.cloud.compute.v1.GuestAttributesEntry value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public Builder addItems(
        com.google.cloud.compute.v1.GuestAttributesEntry.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public Builder addItems(
        int index, com.google.cloud.compute.v1.GuestAttributesEntry.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.GuestAttributesEntry> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public com.google.cloud.compute.v1.GuestAttributesEntry.Builder getItemsBuilder(int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public com.google.cloud.compute.v1.GuestAttributesEntryOrBuilder getItemsOrBuilder(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public java.util.List<? extends com.google.cloud.compute.v1.GuestAttributesEntryOrBuilder>
        getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public com.google.cloud.compute.v1.GuestAttributesEntry.Builder addItemsBuilder() {
      return getItemsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.GuestAttributesEntry.getDefaultInstance());
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public com.google.cloud.compute.v1.GuestAttributesEntry.Builder addItemsBuilder(int index) {
      return getItemsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.GuestAttributesEntry.getDefaultInstance());
    }
    /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
    public java.util.List<com.google.cloud.compute.v1.GuestAttributesEntry.Builder>
        getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.GuestAttributesEntry,
            com.google.cloud.compute.v1.GuestAttributesEntry.Builder,
            com.google.cloud.compute.v1.GuestAttributesEntryOrBuilder>
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.GuestAttributesEntry,
                com.google.cloud.compute.v1.GuestAttributesEntry.Builder,
                com.google.cloud.compute.v1.GuestAttributesEntryOrBuilder>(
                items_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        items_ = null;
      }
      return itemsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GuestAttributesValue)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GuestAttributesValue)
  private static final com.google.cloud.compute.v1.GuestAttributesValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GuestAttributesValue();
  }

  public static com.google.cloud.compute.v1.GuestAttributesValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuestAttributesValue> PARSER =
      new com.google.protobuf.AbstractParser<GuestAttributesValue>() {
        @java.lang.Override
        public GuestAttributesValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<GuestAttributesValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuestAttributesValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GuestAttributesValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
