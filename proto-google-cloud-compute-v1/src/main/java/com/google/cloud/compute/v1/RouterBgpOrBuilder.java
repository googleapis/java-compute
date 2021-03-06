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

public interface RouterBgpOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterBgp)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterBgp.AdvertiseMode advertise_mode = 312134331;</code>
   *
   * @return Whether the advertiseMode field is set.
   */
  boolean hasAdvertiseMode();
  /**
   *
   *
   * <pre>
   * User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterBgp.AdvertiseMode advertise_mode = 312134331;</code>
   *
   * @return The enum numeric value on the wire for advertiseMode.
   */
  int getAdvertiseModeValue();
  /**
   *
   *
   * <pre>
   * User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.RouterBgp.AdvertiseMode advertise_mode = 312134331;</code>
   *
   * @return The advertiseMode.
   */
  com.google.cloud.compute.v1.RouterBgp.AdvertiseMode getAdvertiseMode();

  /**
   *
   *
   * <pre>
   * User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterBgp.AdvertisedGroups advertised_groups = 21065526;
   * </code>
   *
   * @return A list containing the advertisedGroups.
   */
  java.util.List<com.google.cloud.compute.v1.RouterBgp.AdvertisedGroups> getAdvertisedGroupsList();
  /**
   *
   *
   * <pre>
   * User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterBgp.AdvertisedGroups advertised_groups = 21065526;
   * </code>
   *
   * @return The count of advertisedGroups.
   */
  int getAdvertisedGroupsCount();
  /**
   *
   *
   * <pre>
   * User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterBgp.AdvertisedGroups advertised_groups = 21065526;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The advertisedGroups at the given index.
   */
  com.google.cloud.compute.v1.RouterBgp.AdvertisedGroups getAdvertisedGroups(int index);
  /**
   *
   *
   * <pre>
   * User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterBgp.AdvertisedGroups advertised_groups = 21065526;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for advertisedGroups.
   */
  java.util.List<java.lang.Integer> getAdvertisedGroupsValueList();
  /**
   *
   *
   * <pre>
   * User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterBgp.AdvertisedGroups advertised_groups = 21065526;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of advertisedGroups at the given index.
   */
  int getAdvertisedGroupsValue(int index);

  /**
   *
   *
   * <pre>
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterAdvertisedIpRange advertised_ip_ranges = 35449932;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterAdvertisedIpRange> getAdvertisedIpRangesList();
  /**
   *
   *
   * <pre>
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterAdvertisedIpRange advertised_ip_ranges = 35449932;
   * </code>
   */
  com.google.cloud.compute.v1.RouterAdvertisedIpRange getAdvertisedIpRanges(int index);
  /**
   *
   *
   * <pre>
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterAdvertisedIpRange advertised_ip_ranges = 35449932;
   * </code>
   */
  int getAdvertisedIpRangesCount();
  /**
   *
   *
   * <pre>
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterAdvertisedIpRange advertised_ip_ranges = 35449932;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterAdvertisedIpRangeOrBuilder>
      getAdvertisedIpRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterAdvertisedIpRange advertised_ip_ranges = 35449932;
   * </code>
   */
  com.google.cloud.compute.v1.RouterAdvertisedIpRangeOrBuilder getAdvertisedIpRangesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
   * </pre>
   *
   * <code>uint32 asn = 96892;</code>
   *
   * @return Whether the asn field is set.
   */
  boolean hasAsn();
  /**
   *
   *
   * <pre>
   * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to this router will have the same local ASN.
   * </pre>
   *
   * <code>uint32 asn = 96892;</code>
   *
   * @return The asn.
   */
  int getAsn();
}
