// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * The configuration for a built-in load balancing policy.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy}
 */
public final class BackendServiceLocalityLoadBalancingPolicyConfigPolicy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy)
    BackendServiceLocalityLoadBalancingPolicyConfigPolicyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BackendServiceLocalityLoadBalancingPolicyConfigPolicy.newBuilder() to construct.
  private BackendServiceLocalityLoadBalancingPolicyConfigPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BackendServiceLocalityLoadBalancingPolicyConfigPolicy() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BackendServiceLocalityLoadBalancingPolicyConfigPolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BackendServiceLocalityLoadBalancingPolicyConfigPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BackendServiceLocalityLoadBalancingPolicyConfigPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy.class, com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy.Builder.class);
  }

  /**
   * <pre>
   * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy.Name}
   */
  public enum Name
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_NAME = 0;</code>
     */
    UNDEFINED_NAME(0),
    /**
     * <code>INVALID_LB_POLICY = 323318707;</code>
     */
    INVALID_LB_POLICY(323318707),
    /**
     * <pre>
     * An O(1) algorithm which selects two random healthy hosts and picks the host which has fewer active requests.
     * </pre>
     *
     * <code>LEAST_REQUEST = 46604921;</code>
     */
    LEAST_REQUEST(46604921),
    /**
     * <pre>
     * This algorithm implements consistent hashing to backends. Maglev can be used as a drop in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but has faster table lookup build times and host selection times. For more information about Maglev, see https://ai.google/research/pubs/pub44824
     * </pre>
     *
     * <code>MAGLEV = 119180266;</code>
     */
    MAGLEV(119180266),
    /**
     * <pre>
     * Backend host is selected based on the client connection metadata, i.e., connections are opened to the same address as the destination address of the incoming connection before the connection was redirected to the load balancer.
     * </pre>
     *
     * <code>ORIGINAL_DESTINATION = 166297216;</code>
     */
    ORIGINAL_DESTINATION(166297216),
    /**
     * <pre>
     * The load balancer selects a random healthy host.
     * </pre>
     *
     * <code>RANDOM = 262527171;</code>
     */
    RANDOM(262527171),
    /**
     * <pre>
     * The ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has the property that the addition/removal of a host from a set of N hosts only affects 1/N of the requests.
     * </pre>
     *
     * <code>RING_HASH = 432795069;</code>
     */
    RING_HASH(432795069),
    /**
     * <pre>
     * This is a simple policy in which each healthy backend is selected in round robin order. This is the default.
     * </pre>
     *
     * <code>ROUND_ROBIN = 153895801;</code>
     */
    ROUND_ROBIN(153895801),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_NAME = 0;</code>
     */
    public static final int UNDEFINED_NAME_VALUE = 0;
    /**
     * <code>INVALID_LB_POLICY = 323318707;</code>
     */
    public static final int INVALID_LB_POLICY_VALUE = 323318707;
    /**
     * <pre>
     * An O(1) algorithm which selects two random healthy hosts and picks the host which has fewer active requests.
     * </pre>
     *
     * <code>LEAST_REQUEST = 46604921;</code>
     */
    public static final int LEAST_REQUEST_VALUE = 46604921;
    /**
     * <pre>
     * This algorithm implements consistent hashing to backends. Maglev can be used as a drop in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but has faster table lookup build times and host selection times. For more information about Maglev, see https://ai.google/research/pubs/pub44824
     * </pre>
     *
     * <code>MAGLEV = 119180266;</code>
     */
    public static final int MAGLEV_VALUE = 119180266;
    /**
     * <pre>
     * Backend host is selected based on the client connection metadata, i.e., connections are opened to the same address as the destination address of the incoming connection before the connection was redirected to the load balancer.
     * </pre>
     *
     * <code>ORIGINAL_DESTINATION = 166297216;</code>
     */
    public static final int ORIGINAL_DESTINATION_VALUE = 166297216;
    /**
     * <pre>
     * The load balancer selects a random healthy host.
     * </pre>
     *
     * <code>RANDOM = 262527171;</code>
     */
    public static final int RANDOM_VALUE = 262527171;
    /**
     * <pre>
     * The ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has the property that the addition/removal of a host from a set of N hosts only affects 1/N of the requests.
     * </pre>
     *
     * <code>RING_HASH = 432795069;</code>
     */
    public static final int RING_HASH_VALUE = 432795069;
    /**
     * <pre>
     * This is a simple policy in which each healthy backend is selected in round robin order. This is the default.
     * </pre>
     *
     * <code>ROUND_ROBIN = 153895801;</code>
     */
    public static final int ROUND_ROBIN_VALUE = 153895801;


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
    public static Name valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Name forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_NAME;
        case 323318707: return INVALID_LB_POLICY;
        case 46604921: return LEAST_REQUEST;
        case 119180266: return MAGLEV;
        case 166297216: return ORIGINAL_DESTINATION;
        case 262527171: return RANDOM;
        case 432795069: return RING_HASH;
        case 153895801: return ROUND_ROBIN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Name>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Name> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Name>() {
            public Name findValueByNumber(int number) {
              return Name.forNumber(number);
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
      return com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy.getDescriptor().getEnumTypes().get(0);
    }

    private static final Name[] VALUES = values();

    public static Name valueOf(
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

    private Name(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy.Name)
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 3373707;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
   * Check the Name enum for the list of possible values.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
   * Check the Name enum for the list of possible values.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
   * Check the Name enum for the list of possible values.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3373707, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3373707, name_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy other = (com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy) obj;

    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
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
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy prototype) {
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
   * The configuration for a built-in load balancing policy.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy)
      com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BackendServiceLocalityLoadBalancingPolicyConfigPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BackendServiceLocalityLoadBalancingPolicyConfigPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy.class, com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_BackendServiceLocalityLoadBalancingPolicyConfigPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy build() {
      com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy buildPartial() {
      com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy result = new com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
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
      if (other instanceof com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy) {
        return mergeFrom((com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy other) {
      if (other == com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy.getDefaultInstance()) return this;
      if (other.hasName()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
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
            case 26989658: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26989658
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
     * Check the Name enum for the list of possible values.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
     * Check the Name enum for the list of possible values.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
     * Check the Name enum for the list of possible values.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
     * Check the Name enum for the list of possible values.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
     * Check the Name enum for the list of possible values.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of a locality load balancer policy to be used. The value should be one of the predefined ones as supported by localityLbPolicy, although at the moment only ROUND_ROBIN is supported. This field should only be populated when the customPolicy field is not used. Note that specifying the same policy more than once for a backend is not a valid configuration and will be rejected.
     * Check the Name enum for the list of possible values.
     * </pre>
     *
     * <code>optional string name = 3373707;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy)
  private static final com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy();
  }

  public static com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackendServiceLocalityLoadBalancingPolicyConfigPolicy>
      PARSER = new com.google.protobuf.AbstractParser<BackendServiceLocalityLoadBalancingPolicyConfigPolicy>() {
    @java.lang.Override
    public BackendServiceLocalityLoadBalancingPolicyConfigPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<BackendServiceLocalityLoadBalancingPolicyConfigPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackendServiceLocalityLoadBalancingPolicyConfigPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.BackendServiceLocalityLoadBalancingPolicyConfigPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

