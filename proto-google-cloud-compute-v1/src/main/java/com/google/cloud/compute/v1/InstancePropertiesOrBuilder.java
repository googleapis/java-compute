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

public interface InstancePropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Enables instances created based on these properties to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
   * </pre>
   *
   * <code>bool can_ip_forward = 199295868;</code>
   *
   * @return The canIpForward.
   */
  boolean getCanIpForward();

  /**
   *
   *
   * <pre>
   * Specifies the Confidential Instance options.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ConfidentialInstanceConfig confidential_instance_config = 222202229;
   * </code>
   *
   * @return Whether the confidentialInstanceConfig field is set.
   */
  boolean hasConfidentialInstanceConfig();
  /**
   *
   *
   * <pre>
   * Specifies the Confidential Instance options.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ConfidentialInstanceConfig confidential_instance_config = 222202229;
   * </code>
   *
   * @return The confidentialInstanceConfig.
   */
  com.google.cloud.compute.v1.ConfidentialInstanceConfig getConfidentialInstanceConfig();
  /**
   *
   *
   * <pre>
   * Specifies the Confidential Instance options.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ConfidentialInstanceConfig confidential_instance_config = 222202229;
   * </code>
   */
  com.google.cloud.compute.v1.ConfidentialInstanceConfigOrBuilder
      getConfidentialInstanceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * An optional text description for the instances that are created from these properties.
   * </pre>
   *
   * <code>string description = 154502140;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional text description for the instances that are created from these properties.
   * </pre>
   *
   * <code>string description = 154502140;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * An array of disks that are associated with the instances that are created from these properties.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AttachedDisk disks = 95594102;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AttachedDisk> getDisksList();
  /**
   *
   *
   * <pre>
   * An array of disks that are associated with the instances that are created from these properties.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AttachedDisk disks = 95594102;</code>
   */
  com.google.cloud.compute.v1.AttachedDisk getDisks(int index);
  /**
   *
   *
   * <pre>
   * An array of disks that are associated with the instances that are created from these properties.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AttachedDisk disks = 95594102;</code>
   */
  int getDisksCount();
  /**
   *
   *
   * <pre>
   * An array of disks that are associated with the instances that are created from these properties.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AttachedDisk disks = 95594102;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AttachedDiskOrBuilder>
      getDisksOrBuilderList();
  /**
   *
   *
   * <pre>
   * An array of disks that are associated with the instances that are created from these properties.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AttachedDisk disks = 95594102;</code>
   */
  com.google.cloud.compute.v1.AttachedDiskOrBuilder getDisksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of guest accelerator cards' type and count to use for instances created from these properties.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 195159663;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.AcceleratorConfig> getGuestAcceleratorsList();
  /**
   *
   *
   * <pre>
   * A list of guest accelerator cards' type and count to use for instances created from these properties.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 195159663;
   * </code>
   */
  com.google.cloud.compute.v1.AcceleratorConfig getGuestAccelerators(int index);
  /**
   *
   *
   * <pre>
   * A list of guest accelerator cards' type and count to use for instances created from these properties.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 195159663;
   * </code>
   */
  int getGuestAcceleratorsCount();
  /**
   *
   *
   * <pre>
   * A list of guest accelerator cards' type and count to use for instances created from these properties.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 195159663;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>
      getGuestAcceleratorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of guest accelerator cards' type and count to use for instances created from these properties.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 195159663;
   * </code>
   */
  com.google.cloud.compute.v1.AcceleratorConfigOrBuilder getGuestAcceleratorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Labels to apply to instances that are created from these properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to apply to instances that are created from these properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels to apply to instances that are created from these properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to apply to instances that are created from these properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels to apply to instances that are created from these properties.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The machine type to use for instances that are created from these properties.
   * </pre>
   *
   * <code>string machine_type = 227711026;</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * The machine type to use for instances that are created from these properties.
   * </pre>
   *
   * <code>string machine_type = 227711026;</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Metadata metadata = 86866735;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Metadata metadata = 86866735;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.compute.v1.Metadata getMetadata();
  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to instances that are created from these properties. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Metadata metadata = 86866735;</code>
   */
  com.google.cloud.compute.v1.MetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Minimum cpu/platform to be used by instances. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
   * </pre>
   *
   * <code>string min_cpu_platform = 242912759;</code>
   *
   * @return The minCpuPlatform.
   */
  java.lang.String getMinCpuPlatform();
  /**
   *
   *
   * <pre>
   * Minimum cpu/platform to be used by instances. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
   * </pre>
   *
   * <code>string min_cpu_platform = 242912759;</code>
   *
   * @return The bytes for minCpuPlatform.
   */
  com.google.protobuf.ByteString getMinCpuPlatformBytes();

  /**
   *
   *
   * <pre>
   * An array of network access configurations for this interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NetworkInterface> getNetworkInterfacesList();
  /**
   *
   *
   * <pre>
   * An array of network access configurations for this interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  com.google.cloud.compute.v1.NetworkInterface getNetworkInterfaces(int index);
  /**
   *
   *
   * <pre>
   * An array of network access configurations for this interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  int getNetworkInterfacesCount();
  /**
   *
   *
   * <pre>
   * An array of network access configurations for this interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NetworkInterfaceOrBuilder>
      getNetworkInterfacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * An array of network access configurations for this interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  com.google.cloud.compute.v1.NetworkInterfaceOrBuilder getNetworkInterfacesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The private IPv6 google access type for VMs. If not specified, use  INHERIT_FROM_SUBNETWORK as default.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceProperties.PrivateIpv6GoogleAccess private_ipv6_google_access = 48277006;
   * </code>
   *
   * @return The enum numeric value on the wire for privateIpv6GoogleAccess.
   */
  int getPrivateIpv6GoogleAccessValue();
  /**
   *
   *
   * <pre>
   * The private IPv6 google access type for VMs. If not specified, use  INHERIT_FROM_SUBNETWORK as default.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceProperties.PrivateIpv6GoogleAccess private_ipv6_google_access = 48277006;
   * </code>
   *
   * @return The privateIpv6GoogleAccess.
   */
  com.google.cloud.compute.v1.InstanceProperties.PrivateIpv6GoogleAccess
      getPrivateIpv6GoogleAccess();

  /**
   *
   *
   * <pre>
   * Specifies the reservations that instances can consume from.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ReservationAffinity reservation_affinity = 157850683;</code>
   *
   * @return Whether the reservationAffinity field is set.
   */
  boolean hasReservationAffinity();
  /**
   *
   *
   * <pre>
   * Specifies the reservations that instances can consume from.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ReservationAffinity reservation_affinity = 157850683;</code>
   *
   * @return The reservationAffinity.
   */
  com.google.cloud.compute.v1.ReservationAffinity getReservationAffinity();
  /**
   *
   *
   * <pre>
   * Specifies the reservations that instances can consume from.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.ReservationAffinity reservation_affinity = 157850683;</code>
   */
  com.google.cloud.compute.v1.ReservationAffinityOrBuilder getReservationAffinityOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource policies (names, not ULRs) applied to instances created from these properties.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @return A list containing the resourcePolicies.
   */
  java.util.List<java.lang.String> getResourcePoliciesList();
  /**
   *
   *
   * <pre>
   * Resource policies (names, not ULRs) applied to instances created from these properties.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @return The count of resourcePolicies.
   */
  int getResourcePoliciesCount();
  /**
   *
   *
   * <pre>
   * Resource policies (names, not ULRs) applied to instances created from these properties.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @param index The index of the element to return.
   * @return The resourcePolicies at the given index.
   */
  java.lang.String getResourcePolicies(int index);
  /**
   *
   *
   * <pre>
   * Resource policies (names, not ULRs) applied to instances created from these properties.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourcePolicies at the given index.
   */
  com.google.protobuf.ByteString getResourcePoliciesBytes(int index);

  /**
   *
   *
   * <pre>
   * Specifies the scheduling options for the instances that are created from these properties.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Scheduling scheduling = 118252948;</code>
   *
   * @return Whether the scheduling field is set.
   */
  boolean hasScheduling();
  /**
   *
   *
   * <pre>
   * Specifies the scheduling options for the instances that are created from these properties.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Scheduling scheduling = 118252948;</code>
   *
   * @return The scheduling.
   */
  com.google.cloud.compute.v1.Scheduling getScheduling();
  /**
   *
   *
   * <pre>
   * Specifies the scheduling options for the instances that are created from these properties.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Scheduling scheduling = 118252948;</code>
   */
  com.google.cloud.compute.v1.SchedulingOrBuilder getSchedulingOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 9101872;</code>
   */
  java.util.List<com.google.cloud.compute.v1.ServiceAccount> getServiceAccountsList();
  /**
   *
   *
   * <pre>
   * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 9101872;</code>
   */
  com.google.cloud.compute.v1.ServiceAccount getServiceAccounts(int index);
  /**
   *
   *
   * <pre>
   * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 9101872;</code>
   */
  int getServiceAccountsCount();
  /**
   *
   *
   * <pre>
   * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 9101872;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ServiceAccountOrBuilder>
      getServiceAccountsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from these properties. Use metadata queries to obtain the access tokens for these instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 9101872;</code>
   */
  com.google.cloud.compute.v1.ServiceAccountOrBuilder getServiceAccountsOrBuilder(int index);

  /**
   * <code>.google.cloud.compute.v1.ShieldedInstanceConfig shielded_instance_config = 12862901;
   * </code>
   *
   * @return Whether the shieldedInstanceConfig field is set.
   */
  boolean hasShieldedInstanceConfig();
  /**
   * <code>.google.cloud.compute.v1.ShieldedInstanceConfig shielded_instance_config = 12862901;
   * </code>
   *
   * @return The shieldedInstanceConfig.
   */
  com.google.cloud.compute.v1.ShieldedInstanceConfig getShieldedInstanceConfig();
  /**
   * <code>.google.cloud.compute.v1.ShieldedInstanceConfig shielded_instance_config = 12862901;
   * </code>
   */
  com.google.cloud.compute.v1.ShieldedInstanceConfigOrBuilder getShieldedInstanceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Tags tags = 3552281;</code>
   *
   * @return Whether the tags field is set.
   */
  boolean hasTags();
  /**
   *
   *
   * <pre>
   * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Tags tags = 3552281;</code>
   *
   * @return The tags.
   */
  com.google.cloud.compute.v1.Tags getTags();
  /**
   *
   *
   * <pre>
   * A list of tags to apply to the instances that are created from these properties. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Tags tags = 3552281;</code>
   */
  com.google.cloud.compute.v1.TagsOrBuilder getTagsOrBuilder();
}