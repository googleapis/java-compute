/*
 * Copyright 2018 Google LLC
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
package com.google.cloud.compute.v1.it;

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

import com.google.api.core.ApiFuture;
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.api.gax.paging.Page;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.ServiceOptions;
import com.google.cloud.compute.v1.AcceleratorType;
import com.google.cloud.compute.v1.AcceleratorTypeClient;
import com.google.cloud.compute.v1.AcceleratorTypeClient.AggregatedListAcceleratorTypesPagedResponse;
import com.google.cloud.compute.v1.AcceleratorTypeSettings;
import com.google.cloud.compute.v1.AcceleratorTypesScopedList;
import com.google.cloud.compute.v1.Address;
import com.google.cloud.compute.v1.AddressClient;
import com.google.cloud.compute.v1.AddressClient.ListAddressesPagedResponse;
import com.google.cloud.compute.v1.AddressSettings;
import com.google.cloud.compute.v1.AddressesScopedList;
import com.google.cloud.compute.v1.Allowed;
import com.google.cloud.compute.v1.Autoscaler;
import com.google.cloud.compute.v1.AutoscalerClient;
import com.google.cloud.compute.v1.AutoscalerSettings;
import com.google.cloud.compute.v1.AutoscalersScopedList;
import com.google.cloud.compute.v1.BackendBucket;
import com.google.cloud.compute.v1.BackendBucketClient;
import com.google.cloud.compute.v1.BackendBucketSettings;
import com.google.cloud.compute.v1.BackendService;
import com.google.cloud.compute.v1.Commitment;
import com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest;
import com.google.cloud.compute.v1.DeprecationStatus;
import com.google.cloud.compute.v1.Disk;
import com.google.cloud.compute.v1.DiskClient;
import com.google.cloud.compute.v1.DiskSettings;
import com.google.cloud.compute.v1.DiskType;
import com.google.cloud.compute.v1.DiskTypeClient;
import com.google.cloud.compute.v1.DiskTypeClient.AggregatedListDiskTypesPagedResponse;
import com.google.cloud.compute.v1.DiskTypeSettings;
import com.google.cloud.compute.v1.DiskTypesScopedList;
import com.google.cloud.compute.v1.DisksAddResourcePoliciesRequest;
import com.google.cloud.compute.v1.DisksRemoveResourcePoliciesRequest;
import com.google.cloud.compute.v1.DisksResizeRequest;
import com.google.cloud.compute.v1.DisksScopedList;
import com.google.cloud.compute.v1.ExternalVpnGateway;
import com.google.cloud.compute.v1.ExternalVpnGatewayClient;
import com.google.cloud.compute.v1.ExternalVpnGatewayInterface;
import com.google.cloud.compute.v1.ExternalVpnGatewaySettings;
import com.google.cloud.compute.v1.Firewall;
import com.google.cloud.compute.v1.FirewallClient;
import com.google.cloud.compute.v1.FirewallSettings;
import com.google.cloud.compute.v1.ForwardingRule;
import com.google.cloud.compute.v1.ForwardingRuleClient;
import com.google.cloud.compute.v1.ForwardingRuleSettings;
import com.google.cloud.compute.v1.ForwardingRulesScopedList;
import com.google.cloud.compute.v1.GetHttpHealthCheckHttpRequest;
import com.google.cloud.compute.v1.GlobalAddressClient;
import com.google.cloud.compute.v1.GlobalAddressSettings;
import com.google.cloud.compute.v1.GlobalForwardingRuleClient;
import com.google.cloud.compute.v1.GlobalForwardingRuleSettings;
import com.google.cloud.compute.v1.GlobalOperationClient;
import com.google.cloud.compute.v1.GlobalOperationSettings;
import com.google.cloud.compute.v1.HealthCheck;
import com.google.cloud.compute.v1.HealthCheckClient;
import com.google.cloud.compute.v1.HealthCheckSettings;
import com.google.cloud.compute.v1.HealthChecksScopedList;
import com.google.cloud.compute.v1.HttpHealthCheck2;
import com.google.cloud.compute.v1.HttpHealthCheckClient;
import com.google.cloud.compute.v1.HttpHealthCheckSettings;
import com.google.cloud.compute.v1.HttpsHealthCheck2;
import com.google.cloud.compute.v1.HttpsHealthCheckClient;
import com.google.cloud.compute.v1.HttpsHealthCheckSettings;
import com.google.cloud.compute.v1.Image;
import com.google.cloud.compute.v1.ImageClient;
import com.google.cloud.compute.v1.ImageSettings;
import com.google.cloud.compute.v1.InsertHealthCheckHttpRequest;
import com.google.cloud.compute.v1.InsertTargetPoolHttpRequest;
import com.google.cloud.compute.v1.Instance;
import com.google.cloud.compute.v1.InstanceClient;
import com.google.cloud.compute.v1.InstanceGroup;
import com.google.cloud.compute.v1.InstanceGroupClient;
import com.google.cloud.compute.v1.InstanceGroupManager;
import com.google.cloud.compute.v1.InstanceGroupManagerClient;
import com.google.cloud.compute.v1.InstanceGroupManagerSettings;
import com.google.cloud.compute.v1.InstanceGroupManagersScopedList;
import com.google.cloud.compute.v1.InstanceGroupSettings;
import com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest;
import com.google.cloud.compute.v1.InstanceGroupsScopedList;
import com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest;
import com.google.cloud.compute.v1.InstanceSettings;
import com.google.cloud.compute.v1.InstanceTemplate;
import com.google.cloud.compute.v1.InstanceTemplateClient;
import com.google.cloud.compute.v1.InstanceTemplateSettings;
import com.google.cloud.compute.v1.InstanceWithNamedPorts;
import com.google.cloud.compute.v1.Interconnect;
import com.google.cloud.compute.v1.InterconnectAttachment;
import com.google.cloud.compute.v1.InterconnectAttachmentClient;
import com.google.cloud.compute.v1.InterconnectAttachmentSettings;
import com.google.cloud.compute.v1.InterconnectClient;
import com.google.cloud.compute.v1.InterconnectLocation;
import com.google.cloud.compute.v1.InterconnectLocationClient;
import com.google.cloud.compute.v1.InterconnectLocationSettings;
import com.google.cloud.compute.v1.InterconnectSettings;
import com.google.cloud.compute.v1.License;
import com.google.cloud.compute.v1.LicenseClient;
import com.google.cloud.compute.v1.LicenseSettings;
import com.google.cloud.compute.v1.ListDiskTypesHttpRequest;
import com.google.cloud.compute.v1.MachineType;
import com.google.cloud.compute.v1.MachineTypeClient;
import com.google.cloud.compute.v1.MachineTypeSettings;
import com.google.cloud.compute.v1.MachineTypesScopedList;
import com.google.cloud.compute.v1.Network;
import com.google.cloud.compute.v1.NetworkClient;
import com.google.cloud.compute.v1.NetworkEndpointGroup;
import com.google.cloud.compute.v1.NetworkEndpointGroupClient;
import com.google.cloud.compute.v1.NetworkEndpointGroupSettings;
import com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest;
import com.google.cloud.compute.v1.NetworkEndpointGroupsScopedList;
import com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus;
import com.google.cloud.compute.v1.NetworkSettings;
import com.google.cloud.compute.v1.NodeGroup;
import com.google.cloud.compute.v1.NodeGroupClient;
import com.google.cloud.compute.v1.NodeGroupSettings;
import com.google.cloud.compute.v1.NodeGroupsScopedList;
import com.google.cloud.compute.v1.NodeTemplate;
import com.google.cloud.compute.v1.NodeTemplateClient;
import com.google.cloud.compute.v1.NodeTemplateSettings;
import com.google.cloud.compute.v1.NodeTemplatesScopedList;
import com.google.cloud.compute.v1.NodeType;
import com.google.cloud.compute.v1.NodeTypeClient;
import com.google.cloud.compute.v1.NodeTypeSettings;
import com.google.cloud.compute.v1.NodeTypesScopedList;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.OperationsScopedList;
import com.google.cloud.compute.v1.Policy;
import com.google.cloud.compute.v1.Project;
import com.google.cloud.compute.v1.ProjectClient;
import com.google.cloud.compute.v1.ProjectGlobalBackendBucketName;
import com.google.cloud.compute.v1.ProjectGlobalFirewallName;
import com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName;
import com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName;
import com.google.cloud.compute.v1.ProjectGlobalImageName;
import com.google.cloud.compute.v1.ProjectGlobalImageResourceName;
import com.google.cloud.compute.v1.ProjectGlobalLicenseName;
import com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName;
import com.google.cloud.compute.v1.ProjectName;
import com.google.cloud.compute.v1.ProjectRegionAddressName;
import com.google.cloud.compute.v1.ProjectRegionDiskTypeName;
import com.google.cloud.compute.v1.ProjectRegionForwardingRuleName;
import com.google.cloud.compute.v1.ProjectRegionName;
import com.google.cloud.compute.v1.ProjectRegionTargetPoolName;
import com.google.cloud.compute.v1.ProjectSettings;
import com.google.cloud.compute.v1.ProjectZoneDiskName;
import com.google.cloud.compute.v1.ProjectZoneDiskResourceName;
import com.google.cloud.compute.v1.ProjectZoneDiskTypeName;
import com.google.cloud.compute.v1.ProjectZoneInstanceGroupName;
import com.google.cloud.compute.v1.ProjectZoneMachineTypeName;
import com.google.cloud.compute.v1.ProjectZoneName;
import com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName;
import com.google.cloud.compute.v1.Region;
import com.google.cloud.compute.v1.RegionAutoscalerClient;
import com.google.cloud.compute.v1.RegionAutoscalerSettings;
import com.google.cloud.compute.v1.RegionBackendServiceClient;
import com.google.cloud.compute.v1.RegionBackendServiceSettings;
import com.google.cloud.compute.v1.RegionClient;
import com.google.cloud.compute.v1.RegionCommitmentClient;
import com.google.cloud.compute.v1.RegionCommitmentSettings;
import com.google.cloud.compute.v1.RegionDiskClient;
import com.google.cloud.compute.v1.RegionDiskSettings;
import com.google.cloud.compute.v1.RegionSettings;
import com.google.cloud.compute.v1.SetBackupTargetPoolHttpRequest;
import com.google.cloud.compute.v1.Snapshot;
import com.google.cloud.compute.v1.TCPHealthCheck;
import com.google.cloud.compute.v1.TargetHttpProxiesScopedList;
import com.google.cloud.compute.v1.TargetHttpProxy;
import com.google.cloud.compute.v1.TargetHttpProxyClient;
import com.google.cloud.compute.v1.TargetHttpProxySettings;
import com.google.cloud.compute.v1.TargetHttpsProxy;
import com.google.cloud.compute.v1.TargetHttpsProxyClient;
import com.google.cloud.compute.v1.TargetHttpsProxyClient.ListTargetHttpsProxiesPagedResponse;
import com.google.cloud.compute.v1.TargetHttpsProxySettings;
import com.google.cloud.compute.v1.TargetInstance;
import com.google.cloud.compute.v1.TargetInstanceClient;
import com.google.cloud.compute.v1.TargetInstanceClient.ListTargetInstancesPagedResponse;
import com.google.cloud.compute.v1.TargetInstanceSettings;
import com.google.cloud.compute.v1.TargetInstancesScopedList;
import com.google.cloud.compute.v1.TargetPool;
import com.google.cloud.compute.v1.TargetPoolClient;
import com.google.cloud.compute.v1.TargetPoolClient.ListTargetPoolsPagedResponse;
import com.google.cloud.compute.v1.TargetPoolSettings;
import com.google.cloud.compute.v1.TargetPoolsAddHealthCheckRequest;
import com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest;
import com.google.cloud.compute.v1.TargetPoolsScopedList;
import com.google.cloud.compute.v1.TargetReference;
import com.google.cloud.compute.v1.TargetSslProxy;
import com.google.cloud.compute.v1.TargetSslProxyClient;
import com.google.cloud.compute.v1.TargetSslProxyClient.ListTargetSslProxiesPagedResponse;
import com.google.cloud.compute.v1.TargetSslProxySettings;
import com.google.cloud.compute.v1.TargetTcpProxy;
import com.google.cloud.compute.v1.TargetTcpProxyClient;
import com.google.cloud.compute.v1.TargetTcpProxyClient.ListTargetTcpProxiesPagedResponse;
import com.google.cloud.compute.v1.TargetTcpProxySettings;
import com.google.cloud.compute.v1.TargetVpnGateway;
import com.google.cloud.compute.v1.TargetVpnGatewayClient;
import com.google.cloud.compute.v1.TargetVpnGatewayClient.ListTargetVpnGatewaysPagedResponse;
import com.google.cloud.compute.v1.TargetVpnGatewaySettings;
import com.google.cloud.compute.v1.UrlMap;
import com.google.cloud.compute.v1.UrlMapClient;
import com.google.cloud.compute.v1.UrlMapClient.AggregatedListUrlMapsPagedResponse;
import com.google.cloud.compute.v1.UrlMapClient.ListUrlMapsPagedResponse;
import com.google.cloud.compute.v1.UrlMapSettings;
import com.google.cloud.compute.v1.UrlMapsScopedList;
import com.google.cloud.compute.v1.VpnGateway;
import com.google.cloud.compute.v1.VpnGatewayClient;
import com.google.cloud.compute.v1.VpnGatewayClient.ListVpnGatewaysPagedResponse;
import com.google.cloud.compute.v1.VpnGatewaySettings;
import com.google.cloud.compute.v1.VpnTunnel;
import com.google.cloud.compute.v1.VpnTunnelClient;
import com.google.cloud.compute.v1.VpnTunnelClient.ListVpnTunnelsPagedResponse;
import com.google.cloud.compute.v1.VpnTunnelSettings;
import com.google.cloud.compute.v1.Zone;
import com.google.cloud.compute.v1.ZoneClient;
import com.google.cloud.compute.v1.ZoneClient.ListZonesPagedResponse;
import com.google.cloud.compute.v1.ZoneSettings;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.testing.RemoteStorageHelper;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ITComputeTest {

  private static AcceleratorTypeClient acceleratorTypeClient;
  private static AcceleratorTypeSettings acceleratorTypeSettings;

  private static AddressClient addressClient;
  private static AddressSettings addressSettings;

  private static AutoscalerClient autoscalerClient;
  private static AutoscalerSettings autoscalerSettings;

  private static BackendBucketClient backendBucketClient;
  private static BackendBucketSettings backendBucketSettings;

  private static DiskClient diskClient;
  private static DiskSettings diskSettings;

  private static DiskTypeClient diskTypeClient;
  private static DiskTypeSettings diskTypeSettings;

  private static ExternalVpnGatewayClient externalVpnGatewayClient;
  private static ExternalVpnGatewaySettings externalVpnGatewaySettings;

  private static FirewallClient firewallClient;
  private static FirewallSettings firewallSettings;

  private static ForwardingRuleClient forwardingRuleClient;
  private static ForwardingRuleSettings forwardingRuleSettings;

  private static GlobalAddressClient globalAddressClient;
  private static GlobalAddressSettings globalAddressSettings;

  private static GlobalForwardingRuleClient globalForwardingRuleClient;
  private static GlobalForwardingRuleSettings globalForwardingRuleSettings;

  private static GlobalOperationClient globalOperationClient;
  private static GlobalOperationSettings globalOperationSettings;

  private static HealthCheckClient healthCheckClient;
  private static HealthCheckSettings healthCheckSettings;

  private static HttpHealthCheckClient httpHealthCheckClient;
  private static HttpHealthCheckSettings httpHealthCheckSettings;

  private static HttpsHealthCheckClient httpsHealthCheckClient;
  private static HttpsHealthCheckSettings httpsHealthCheckSettings;

  private static ImageClient imageClient;
  private static ImageSettings imageSettings;

  private static InstanceClient instanceClient;
  private static InstanceSettings instanceSettings;

  private static InstanceGroupClient instanceGroupClient;
  private static InstanceGroupSettings instanceGroupSettings;

  private static InstanceGroupManagerClient instanceGroupManagerClient;
  private static InstanceGroupManagerSettings instanceGroupManagerSettings;

  private static InstanceTemplateClient instanceTemplateClient;
  private static InstanceTemplateSettings instanceTemplateSettings;

  private static InterconnectAttachmentClient interconnectAttachmentClient;
  private static InterconnectAttachmentSettings interconnectAttachmentSettings;

  private static InterconnectClient interconnectClient;
  private static InterconnectSettings interconnectSettings;

  private static InterconnectLocationClient interconnectLocationClient;
  private static InterconnectLocationSettings interconnectLocationSettings;

  private static LicenseClient licenseClient;
  private static LicenseSettings licenseSettings;

  private static MachineTypeClient machineTypeClient;
  private static MachineTypeSettings machineTypeSettings;

  private static NetworkClient networkClient;
  private static NetworkSettings networkSettings;

  private static NetworkEndpointGroupClient networkEndpointGroupClient;
  private static NetworkEndpointGroupSettings networkEndpointGroupSettings;

  private static NodeGroupClient nodeGroupClient;
  private static NodeGroupSettings nodeGroupSettings;

  private static NodeTemplateClient nodeTemplateClient;
  private static NodeTemplateSettings nodeTemplateSettings;

  private static NodeTypeClient nodeTypeClient;
  private static NodeTypeSettings nodeTypeSettings;

  private static ProjectClient projectClient;
  private static ProjectSettings projectSettings;

  private static RegionAutoscalerClient regionAutoscalerClient;
  private static RegionAutoscalerSettings regionAutoscalerSettings;

  private static RegionBackendServiceClient regionBackendServiceClient;
  private static RegionBackendServiceSettings regionBackendServiceSettings;

  private static RegionClient regionClient;
  private static RegionSettings regionSettings;

  private static RegionCommitmentClient regionCommitmentClient;
  private static RegionCommitmentSettings regionCommitmentSettings;

  private static RegionDiskClient regionDiskClient;
  private static RegionDiskSettings regionDiskSettings;

  private static TargetHttpProxyClient targetHttpProxyClient;
  private static TargetHttpProxySettings targetHttpProxySettings;

  private static TargetHttpsProxyClient targetHttpsProxyClient;
  private static TargetHttpsProxySettings targetHttpsProxySettings;

  private static TargetInstanceClient targetInstanceClient;
  private static TargetInstanceSettings targetInstanceSettings;

  private static TargetPoolClient targetPoolClient;
  private static TargetPoolSettings targetPoolSettings;

  private static TargetSslProxyClient targetSslProxyClient;
  private static TargetSslProxySettings targetSslProxySettings;

  private static TargetTcpProxyClient targetTcpProxyClient;
  private static TargetTcpProxySettings targetTcpProxySettings;

  private static TargetVpnGatewayClient targetVpnGatewayClient;
  private static TargetVpnGatewaySettings targetVpnGatewaySettings;

  private static UrlMapClient urlMapClient;
  private static UrlMapSettings urlMapSettings;

  private static VpnGatewayClient vpnGatewayClient;
  private static VpnGatewaySettings vpnGatewaySettings;

  private static VpnTunnelClient vpnTunnelClient;
  private static VpnTunnelSettings vpnTunnelSettings;

  private static ZoneClient zoneClient;
  private static ZoneSettings zoneSettings;
  private static Storage storage;

  private static final Logger LOG = Logger.getLogger(ITComputeTest.class.getName());
  private static final String DEFAULT_PROJECT = ServiceOptions.getDefaultProjectId();
  private static final String UID = UUID.randomUUID().toString();
  private static final String ZONE = "us-central1-a";
  private static final String DISK_TYPE = "local-ssd";
  private static final String REGION = "us-central1";
  private static final String PROJECT_LINK =
      String.format("https://www.googleapis.com/compute/v1/projects/%s", DEFAULT_PROJECT);
  private static final String REGION_LINK = String.format("%s/regions/%s", PROJECT_LINK, REGION);
  private static final String ZONE_SELF_LINK = String.format("%s/zones/%s", PROJECT_LINK, ZONE);
  private static final String STATUS = "UP";
  private static final String ID = UID.substring(0, 8);
  private static final String TARGET_POOL_NAME = "test-target-pool-" + ID;
  private static final String TARGET_POOL_SELF_LINK =
      String.format("%s/targetPools/%s", REGION_LINK, TARGET_POOL_NAME);
  private static final String SESSION_AFFINITY = "NONE";
  private static final String ADDRESS_NAME = "test-address-" + ID;
  private static final String ADDRESS_SELF_LINK =
      String.format("%s/addresses/%s", REGION_LINK, ADDRESS_NAME);
  private static final String GLOBAL_ADDRESS_LINK =
      String.format("%s/global/addresses/%s", PROJECT_LINK, ADDRESS_NAME);
  private static final String ADDRESS_TYPE = "EXTERNAL";
  private static final String ADDRESS_OPERATION_STATUS = "RESERVED";
  private static final String BUCKET = RemoteStorageHelper.generateBucketName();
  private static final String BACKEND_BUCKET_NAME = "test-backend-bucket-" + ID;
  private static final String BACKEND_BUCKET_TARGET_LINK =
      String.format("%s/global/backendBuckets/%s", PROJECT_LINK, BACKEND_BUCKET_NAME);
  private static final String DISK_NAME = "test-disk-" + ID;
  private static final String DISK_SIZE = "1";
  private static final String DISK_SELF_LINK =
      String.format("%s/disks/%s", ZONE_SELF_LINK, DISK_NAME);
  private static final String EXTERNAL_VPN_GATEWAY_NAME = "external-test-vpn-gateway-" + ID;
  private static final String REDUNDANCY_TYPE = "SINGLE_IP_INTERNALLY_REDUNDANT";
  private static final String EXTERNAL_VPN_GATEWAY_DESCRIPTION = "ExternalVpnGateway";
  private static final String EXTERNAL_VPN_GATEWAY_TARGET_LINK =
      String.format("%s/global/externalVpnGateways/%s", PROJECT_LINK, EXTERNAL_VPN_GATEWAY_NAME);
  private static final List<ExternalVpnGatewayInterface> VPN_GATEWAY_INTERFACE =
      Arrays.asList(
          ExternalVpnGatewayInterface.newBuilder().setId(0).setIpAddress("8.8.8.8").build());
  private static final String FIREWALL_NAME = "firewall-test-" + ID;
  private static final String FIREWALL_DESCRIPTION = "firewall";
  private static final String DIRECTION = "INGRESS";
  private static final String IP_PROTOCOL = "TCP";
  private static final String DEFAULT_NETWORK =
      String.format("%s/global/networks/default", PROJECT_LINK);
  private static final String FIREWALL_LINK =
      String.format("%s/global/firewalls/%s", PROJECT_LINK, FIREWALL_NAME);
  private static final int FIREWALL_PRIORITY = 1000;
  private static final List<Allowed> ALLOWEDS =
      Arrays.asList(Allowed.newBuilder().setIPProtocol(IP_PROTOCOL.toLowerCase()).build());
  private static final String FORWARDING_RULE_NAME = "forwarding-rule-us-east1-" + ID;
  private static final String FORWARDING_RULE_LINK =
      String.format("%s/forwardingRules/%s", REGION_LINK, FORWARDING_RULE_NAME);
  private static final String HEALTH_CHECK_NAME = "test-health-check-" + ID;
  private static final String HEALTH_CHECK_LINK =
      String.format("%s/global/healthChecks/%s", PROJECT_LINK, HEALTH_CHECK_NAME);
  private static final String HTTP_HEALTH_CHECK_2 = "test-http-health-check2-" + ID;
  private static final String HTTP_HEALTH_CHECK_LINK =
      String.format("%s/global/httpHealthChecks/%s", PROJECT_LINK, HTTP_HEALTH_CHECK_2);
  private static final String HTTPS_HEALTH_CHECK_2 = "test-https-health-check2-" + ID;
  private static final String HTTPS_HEALTH_CHECK_LINK =
      String.format("%s/global/httpsHealthChecks/%s", PROJECT_LINK, HTTPS_HEALTH_CHECK_2);
  private static final Integer PORT = 80;
  private static final Integer UNHEALTHY_THRESHOLD = 2;
  private static final String IMAGE_NAME = "test-image-" + ID;
  private static final String IMAGE_LINK =
      String.format("%s/global/images/%s", PROJECT_LINK, IMAGE_NAME);
  private static final String INSTANCE_GROUP = "test-instance-group-" + ID;
  private static final String INSTANCE_GROUP_LINK =
      String.format("%s/instanceGroups/%s", ZONE_SELF_LINK, INSTANCE_GROUP);
  private static final String LOCATION =
      String.format("%s/global/interconnectLocations/den-zone2-389", PROJECT_LINK);
  private static final String INTER_CONNECT = "test-inter-connect-" + ID;
  private static final String INTER_CONNECT_TYPE = "IT_PRIVATE";
  private static final String INTER_CONNECT_LINK_TYPE = "LINK_TYPE_ETHERNET_10G_LR";
  private static final Integer INTER_CONNECT_REQUESTED_LINK_COUNT = 1;
  private static final String INTER_CONNECT_LINK =
      String.format("%s/global/interconnects/%s", PROJECT_LINK, INTER_CONNECT);
  private static final String CUSTOMER_NAME = "customer";
  private static final String OPERATIONAL_STATUS = "OS_ACTIVE";
  private static final String LICENSE = "test-license-" + ID;
  private static final String LICENSE_LINK =
      String.format("%s/global/licenses/%s", PROJECT_LINK, LICENSE);
  private static final String MACHINE_TYPE = "n1-standard-1";
  private static final String MACHINE_TYPE_LINK =
      String.format("%s/machineTypes/%s", ZONE_SELF_LINK, MACHINE_TYPE);
  private static final String NETWORK_TIER = "PREMIUM";
  private static final String NETWORK = "test-network-" + ID;
  private static final String NETWORK_ENDPOINT_GROUP = "test-network-endpoint-group-" + ID;
  private static final String NETWORK_ENDPOINT_GROUP_LINK =
      String.format("%s/networkEndpointGroups/%s", ZONE_SELF_LINK, NETWORK_ENDPOINT_GROUP);
  private static final String NETWORK_ENDPOINT_TYPE = "GCE_VM_IP_PORT";
  private static final String NETWORK_ENDPOINT_SUB_NETWORK =
      String.format("%s/subnetworks/default", REGION_LINK);

  private static final ProjectName PROJECT_NAME = ProjectName.of(DEFAULT_PROJECT);
  private static final ProjectRegionTargetPoolName REGION_TARGET_POOL_NAME =
      ProjectRegionTargetPoolName.of(DEFAULT_PROJECT, REGION, TARGET_POOL_NAME);
  private static final ProjectRegionName PROJECT_REGION_NAME =
      ProjectRegionName.of(DEFAULT_PROJECT, REGION);
  private static final ProjectZoneName PROJECT_ZONE_NAME =
      ProjectZoneName.of(DEFAULT_PROJECT, ZONE);
  private static final ProjectZoneDiskName PROJECT_ZONE_DISK_NAME =
      ProjectZoneDiskName.of(DISK_NAME, DEFAULT_PROJECT, ZONE);
  private static final ProjectZoneDiskResourceName PROJECT_ZONE_DISK_RESOURCE_NAME =
      ProjectZoneDiskResourceName.of(DEFAULT_PROJECT, DISK_NAME, ZONE);
  private static final ProjectZoneInstanceGroupName INSTANCE_GROUP_NAME =
      ProjectZoneInstanceGroupName.of(INSTANCE_GROUP, DEFAULT_PROJECT, ZONE);
  private static final ProjectGlobalBackendBucketName PROJECT_BACKEND_BUCKET_NAME =
      ProjectGlobalBackendBucketName.of(BACKEND_BUCKET_NAME, DEFAULT_PROJECT);
  private static final ProjectGlobalFirewallName FIREWALL =
      ProjectGlobalFirewallName.of(FIREWALL_NAME, DEFAULT_PROJECT);
  private static final ProjectRegionForwardingRuleName PROJECT_REGION_FORWARDING_RULE_NAME =
      ProjectRegionForwardingRuleName.of(FORWARDING_RULE_NAME, DEFAULT_PROJECT, REGION);
  private static final ProjectGlobalHttpHealthCheckName HTTP_HEALTH_CHECK_NAME =
      ProjectGlobalHttpHealthCheckName.of(HTTP_HEALTH_CHECK_2, DEFAULT_PROJECT);
  private static final ProjectGlobalHttpsHealthCheckName HTTPS_HEALTH_CHECK_NAME =
      ProjectGlobalHttpsHealthCheckName.of(HTTPS_HEALTH_CHECK_2, DEFAULT_PROJECT);
  private static final ProjectGlobalImageName PROJECT_GLOBAL_IMAGE_NAME =
      ProjectGlobalImageName.of(IMAGE_NAME, DEFAULT_PROJECT);
  private static final ProjectGlobalImageResourceName IMAGE_RESOURCE_NAME =
      ProjectGlobalImageResourceName.of(DEFAULT_PROJECT, IMAGE_NAME);
  private static final ProjectGlobalLicenseName LICENSE_NAME =
      ProjectGlobalLicenseName.of(LICENSE, DEFAULT_PROJECT);
  private static final ProjectZoneNetworkEndpointGroupName NETWORK_ENDPOINT_GROUP_NAME =
      ProjectZoneNetworkEndpointGroupName.of(NETWORK_ENDPOINT_GROUP, DEFAULT_PROJECT, ZONE);
  private static final Address ADDRESS =
      Address.newBuilder()
          .setName(ADDRESS_NAME)
          .setNetworkTier(NETWORK_TIER)
          .setRegion(REGION_LINK)
          .build();
  private static final TCPHealthCheck TCP_HEALTH_CHECK =
      TCPHealthCheck.newBuilder().setPort(80).setProxyHeader("NONE").build();

  @Rule public Timeout globalTimeout = Timeout.seconds(1000);

  @BeforeClass
  public static void beforeClass() throws Exception {

    Credentials credentials =
        GoogleCredentials.getApplicationDefault()
            .createScoped(DiskTypeSettings.getDefaultServiceScopes());
    FixedCredentialsProvider credentialsProvider = FixedCredentialsProvider.create(credentials);

    /** create acceleratorTypeClient */
    acceleratorTypeSettings =
        AcceleratorTypeSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    acceleratorTypeClient = AcceleratorTypeClient.create(acceleratorTypeSettings);

    /** create addressClient */
    addressSettings =
        AddressSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    addressClient = AddressClient.create(addressSettings);
    addressClient.insertAddress(PROJECT_REGION_NAME, ADDRESS);

    /** create autoscalerClient */
    autoscalerSettings =
        AutoscalerSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    autoscalerClient = AutoscalerClient.create(autoscalerSettings);

    /** create backendBucketClient */
    backendBucketSettings =
        BackendBucketSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    backendBucketClient = BackendBucketClient.create(backendBucketSettings);
    RemoteStorageHelper storageHelper = RemoteStorageHelper.create();
    storage = storageHelper.getOptions().getService();
    storage.create(BucketInfo.of(BUCKET));
    BackendBucket backendBucketResource =
        BackendBucket.newBuilder().setName(BACKEND_BUCKET_NAME).setBucketName(BUCKET).build();
    backendBucketClient.insertBackendBucket(PROJECT_NAME, backendBucketResource);

    /** create diskClient */
    diskSettings = DiskSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    diskClient = DiskClient.create(diskSettings);
    Disk diskResource =
        Disk.newBuilder().setName(DISK_NAME).setRegion(REGION_LINK).setSizeGb(DISK_SIZE).build();
    diskClient.insertDisk(PROJECT_ZONE_NAME, diskResource);

    /** create diskTypeClient */
    diskTypeSettings =
        DiskTypeSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    diskTypeClient = DiskTypeClient.create(diskTypeSettings);

    /** create externalVpnGatewayClient */
    Thread.sleep(TimeUnit.MINUTES.toMillis(2));
    externalVpnGatewaySettings =
        ExternalVpnGatewaySettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    externalVpnGatewayClient = ExternalVpnGatewayClient.create(externalVpnGatewaySettings);
    ExternalVpnGateway.Builder externalVpnGatewayResource =
        ExternalVpnGateway.newBuilder()
            .setName(EXTERNAL_VPN_GATEWAY_NAME)
            .setRedundancyType(REDUNDANCY_TYPE)
            .setDescription(EXTERNAL_VPN_GATEWAY_DESCRIPTION)
            .addAllInterfaces(VPN_GATEWAY_INTERFACE);
    externalVpnGatewayClient.insertExternalVpnGateway(
        PROJECT_NAME, externalVpnGatewayResource.build());

    /** create firewallClient */
    firewallSettings =
        FirewallSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    firewallClient = FirewallClient.create(firewallSettings);
    Firewall firewallResource =
        Firewall.newBuilder()
            .setName(FIREWALL_NAME)
            .setPriority(FIREWALL_PRIORITY)
            .setDescription(FIREWALL_DESCRIPTION)
            .addAllAllowed(ALLOWEDS)
            .setNetwork(DEFAULT_NETWORK)
            .build();
    firewallClient.insertFirewall(PROJECT_NAME, firewallResource);

    /** create targetPoolClient */
    targetPoolSettings =
        TargetPoolSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    targetPoolClient = TargetPoolClient.create(targetPoolSettings);
    TargetPool targetPool =
        TargetPool.newBuilder()
            .setName(TARGET_POOL_NAME)
            .setRegion(PROJECT_REGION_NAME.toString())
            .setSessionAffinity(SESSION_AFFINITY)
            .build();
    InsertTargetPoolHttpRequest request =
        InsertTargetPoolHttpRequest.newBuilder()
            .setTargetPoolResource(targetPool)
            .setRegion(PROJECT_REGION_NAME.toString())
            .setRequestId(UID)
            .build();
    ApiFuture<Operation> targetApiFuture =
        targetPoolClient.insertTargetPoolCallable().futureCall(request);

    /** create forwardingRuleClient */
    Thread.sleep(30000);
    forwardingRuleSettings =
        ForwardingRuleSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    forwardingRuleClient = ForwardingRuleClient.create(forwardingRuleSettings);
    ForwardingRule forwardingRule =
        ForwardingRule.newBuilder()
            .setName(FORWARDING_RULE_NAME)
            .setTarget(TARGET_POOL_SELF_LINK)
            .setIPProtocol(IP_PROTOCOL)
            .build();
    if (targetApiFuture.isDone()) {
      forwardingRuleClient.insertForwardingRule(PROJECT_REGION_NAME, forwardingRule);
    }

    /** create globalAddressClient */
    globalAddressSettings =
        GlobalAddressSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    globalAddressClient = GlobalAddressClient.create(globalAddressSettings);
    Address address =
        Address.newBuilder()
            .setName(ADDRESS_NAME)
            .setAddressType(ADDRESS_TYPE)
            .setRegion(PROJECT_REGION_NAME.toString())
            .build();
    globalAddressClient.insertGlobalAddress(PROJECT_NAME, address);
    Thread.sleep(TimeUnit.MINUTES.toMillis(1));

    /** create globalForwardingRuleClient */
    globalForwardingRuleSettings =
        GlobalForwardingRuleSettings.newBuilder()
            .setCredentialsProvider(credentialsProvider)
            .build();
    globalForwardingRuleClient = GlobalForwardingRuleClient.create(globalForwardingRuleSettings);

    /** create globalOperationClient */
    globalOperationSettings =
        GlobalOperationSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    globalOperationClient = GlobalOperationClient.create(globalOperationSettings);

    /** create healthCheckClient */
    healthCheckSettings =
        HealthCheckSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    healthCheckClient = HealthCheckClient.create(healthCheckSettings);
    HealthCheck healthCheckResource =
        HealthCheck.newBuilder()
            .setName(HEALTH_CHECK_NAME)
            .setType(IP_PROTOCOL)
            .setTcpHealthCheck(TCP_HEALTH_CHECK)
            .setCheckIntervalSec(1)
            .setTimeoutSec(5)
            .setUnhealthyThreshold(UNHEALTHY_THRESHOLD)
            .build();
    InsertHealthCheckHttpRequest insertHealthCheckHttpRequest =
        InsertHealthCheckHttpRequest.newBuilder()
            .setProject(PROJECT_NAME.toString())
            .setHealthCheckResource(healthCheckResource)
            .build();
    ApiFuture<Operation> insertHealthCheckFuture =
        healthCheckClient.insertHealthCheckCallable().futureCall(insertHealthCheckHttpRequest);

    /** create httpHealthCheckClient */
    httpHealthCheckSettings =
        HttpHealthCheckSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    httpHealthCheckClient = HttpHealthCheckClient.create(httpHealthCheckSettings);
    HttpHealthCheck2 httpHealthCheckResource =
        HttpHealthCheck2.newBuilder()
            .setName(HTTP_HEALTH_CHECK_2)
            .setPort(PORT)
            .setUnhealthyThreshold(UNHEALTHY_THRESHOLD)
            .build();
    httpHealthCheckClient.insertHttpHealthCheck(PROJECT_NAME, httpHealthCheckResource);
    Thread.sleep(TimeUnit.MINUTES.toMillis(1));

    /** create httpsHealthCheckClient */
    httpsHealthCheckSettings =
        HttpsHealthCheckSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    httpsHealthCheckClient = HttpsHealthCheckClient.create(httpsHealthCheckSettings);
    HttpsHealthCheck2 httpsHealthCheckResource =
        HttpsHealthCheck2.newBuilder()
            .setName(HTTPS_HEALTH_CHECK_2)
            .setPort(PORT)
            .setHealthyThreshold(UNHEALTHY_THRESHOLD)
            .build();
    httpsHealthCheckClient.insertHttpsHealthCheck(PROJECT_NAME, httpsHealthCheckResource);
    Thread.sleep(TimeUnit.MINUTES.toMillis(1));

    /** create imageClient */
    imageSettings = ImageSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    imageClient = ImageClient.create(imageSettings);
    Image imageResource =
        Image.newBuilder().setName(IMAGE_NAME).setSourceDisk(DISK_SELF_LINK).build();
    imageClient.insertImage(Boolean.TRUE, PROJECT_NAME, imageResource);

    /** create instanceClient */
    instanceSettings =
        InstanceSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    instanceClient = InstanceClient.create(instanceSettings);

    /** create instanceGroupClient */
    instanceGroupSettings =
        InstanceGroupSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    instanceGroupClient = InstanceGroupClient.create(instanceGroupSettings);
    InstanceGroup instanceGroupResource =
        InstanceGroup.newBuilder().setName(INSTANCE_GROUP).build();
    instanceGroupClient.insertInstanceGroup(PROJECT_ZONE_NAME, instanceGroupResource);

    /** create instanceTemplateClient */
    instanceTemplateSettings =
        InstanceTemplateSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    instanceTemplateClient = InstanceTemplateClient.create(instanceTemplateSettings);

    /** create instanceGroupManagerClient */
    instanceGroupManagerSettings =
        InstanceGroupManagerSettings.newBuilder()
            .setCredentialsProvider(credentialsProvider)
            .build();
    instanceGroupManagerClient = InstanceGroupManagerClient.create(instanceGroupManagerSettings);

    /** create interconnectAttachmentClient */
    interconnectAttachmentSettings =
        InterconnectAttachmentSettings.newBuilder()
            .setCredentialsProvider(credentialsProvider)
            .build();
    interconnectAttachmentClient =
        InterconnectAttachmentClient.create(interconnectAttachmentSettings);

    /** create interconnectClient */
    interconnectSettings =
        InterconnectSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    interconnectClient = InterconnectClient.create(interconnectSettings);
    Interconnect interconnectResource =
        Interconnect.newBuilder()
            .setName(INTER_CONNECT)
            .setInterconnectType(INTER_CONNECT_TYPE)
            .setLinkType(INTER_CONNECT_LINK_TYPE)
            .setRequestedLinkCount(INTER_CONNECT_REQUESTED_LINK_COUNT)
            .setAdminEnabled(Boolean.TRUE)
            .setCustomerName(CUSTOMER_NAME)
            .setOperationalStatus(OPERATIONAL_STATUS)
            .setLocation(LOCATION)
            .build();
    interconnectClient.insertInterconnect(PROJECT_NAME, interconnectResource);
    Thread.sleep(TimeUnit.MINUTES.toMillis(1));

    /** create interconnectLocationClient */
    interconnectLocationSettings =
        InterconnectLocationSettings.newBuilder()
            .setCredentialsProvider(credentialsProvider)
            .build();
    interconnectLocationClient = InterconnectLocationClient.create(interconnectLocationSettings);

    /** create licenseClient */
    licenseSettings =
        LicenseSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    licenseClient = LicenseClient.create(licenseSettings);
    License license = License.newBuilder().setName(LICENSE).build();
    licenseClient.insertLicense(PROJECT_NAME, license);

    /** create machineTypeClient */
    machineTypeSettings =
        MachineTypeSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    machineTypeClient = MachineTypeClient.create(machineTypeSettings);

    /** create networkClient */
    networkSettings =
        NetworkSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    networkClient = NetworkClient.create(networkSettings);
    Network networkResource = Network.newBuilder().setName(NETWORK).build();
    networkClient.insertNetwork(PROJECT_NAME, networkResource);
    Thread.sleep(TimeUnit.MINUTES.toMillis(1));

    /** create networkEndpointGroupClient */
    networkEndpointGroupSettings =
        NetworkEndpointGroupSettings.newBuilder()
            .setCredentialsProvider(credentialsProvider)
            .build();
    networkEndpointGroupClient = NetworkEndpointGroupClient.create(networkEndpointGroupSettings);
    NetworkEndpointGroup networkEndpointGroupResource =
        NetworkEndpointGroup.newBuilder()
            .setName(NETWORK_ENDPOINT_GROUP)
            .setNetwork(DEFAULT_NETWORK)
            .setNetworkEndpointType(NETWORK_ENDPOINT_TYPE)
            .build();
    networkEndpointGroupClient.insertNetworkEndpointGroup(
        PROJECT_ZONE_NAME, networkEndpointGroupResource);

    /** create nodeTypeClient */
    nodeTypeSettings =
        NodeTypeSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    nodeTypeClient = NodeTypeClient.create(nodeTypeSettings);

    /** create nodeTemplateClient */
    nodeTemplateSettings =
        NodeTemplateSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    nodeTemplateClient = NodeTemplateClient.create(nodeTemplateSettings);

    /** create nodeGroupClient */
    nodeGroupSettings =
        NodeGroupSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    nodeGroupClient = NodeGroupClient.create(nodeGroupSettings);

    /** create projectClient */
    projectSettings =
        ProjectSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    projectClient = ProjectClient.create(projectSettings);

    /** create regionAutoscalerClient */
    regionAutoscalerSettings =
        RegionAutoscalerSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    regionAutoscalerClient = RegionAutoscalerClient.create(regionAutoscalerSettings);

    /** create regionClient */
    regionSettings =
        RegionSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    regionClient = RegionClient.create(regionSettings);

    /** create regionBackendServiceClient */
    Thread.sleep(TimeUnit.MINUTES.toMillis(1));
    regionBackendServiceSettings =
        RegionBackendServiceSettings.newBuilder()
            .setCredentialsProvider(credentialsProvider)
            .build();
    regionBackendServiceClient = RegionBackendServiceClient.create(regionBackendServiceSettings);

    /** create regionCommitmentClient */
    regionCommitmentSettings =
        RegionCommitmentSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    regionCommitmentClient = RegionCommitmentClient.create(regionCommitmentSettings);

    /** create regionDiskClient */
    regionDiskSettings =
        RegionDiskSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    regionDiskClient = RegionDiskClient.create(regionDiskSettings);

    /** create targetHttpProxyClient */
    targetHttpProxySettings =
        TargetHttpProxySettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    targetHttpProxyClient = TargetHttpProxyClient.create(targetHttpProxySettings);

    /** create targetHttpsProxyClient */
    targetHttpsProxySettings =
        TargetHttpsProxySettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    targetHttpsProxyClient = TargetHttpsProxyClient.create(targetHttpsProxySettings);

    /** create targetInstanceClient */
    targetInstanceSettings =
        TargetInstanceSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    targetInstanceClient = TargetInstanceClient.create(targetInstanceSettings);

    /** targetSslProxyClient */
    targetSslProxySettings =
        TargetSslProxySettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    targetSslProxyClient = TargetSslProxyClient.create(targetSslProxySettings);

    /** create targetTcpProxyClient */
    targetTcpProxySettings =
        TargetTcpProxySettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    targetTcpProxyClient = TargetTcpProxyClient.create(targetTcpProxySettings);

    /** create targetVpnGatewayClient */
    targetVpnGatewaySettings =
        TargetVpnGatewaySettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    targetVpnGatewayClient = TargetVpnGatewayClient.create(targetVpnGatewaySettings);

    /** create urlMapClient */
    urlMapSettings =
        UrlMapSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    urlMapClient = UrlMapClient.create(urlMapSettings);

    /** create vpnGatewayClient */
    vpnGatewaySettings =
        VpnGatewaySettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    vpnGatewayClient = VpnGatewayClient.create(vpnGatewaySettings);

    /** create vpnTunnelClient */
    vpnTunnelSettings =
        VpnTunnelSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    vpnTunnelClient = VpnTunnelClient.create(vpnTunnelSettings);

    /** create zoneClient */
    zoneSettings = ZoneSettings.newBuilder().setCredentialsProvider(credentialsProvider).build();
    zoneClient = ZoneClient.create(zoneSettings);
  }

  @AfterClass
  public static void tearDown() throws Exception {
    Thread.sleep(3000);
    acceleratorTypeClient.close();
    addressClient.deleteAddress(ADDRESS_SELF_LINK);
    addressClient.close();
    autoscalerClient.close();
    backendBucketClient.deleteBackendBucket(PROJECT_BACKEND_BUCKET_NAME);
    backendBucketClient.close();
    imageClient.deleteImage(PROJECT_GLOBAL_IMAGE_NAME);
    imageClient.close();
    Thread.sleep(30000);
    diskClient.deleteDisk(DISK_SELF_LINK);
    diskClient.close();
    diskTypeClient.close();
    externalVpnGatewayClient.close();
    firewallClient.deleteFirewall(FIREWALL);
    firewallClient.close();
    forwardingRuleClient.deleteForwardingRule(PROJECT_REGION_FORWARDING_RULE_NAME);
    forwardingRuleClient.close();
    globalAddressClient.close();
    globalForwardingRuleClient.close();
    globalOperationClient.close();
    healthCheckClient.close();
    httpHealthCheckClient.deleteHttpHealthCheck(HTTP_HEALTH_CHECK_NAME);
    httpHealthCheckClient.close();
    httpsHealthCheckClient.deleteHttpsHealthCheck(HTTPS_HEALTH_CHECK_NAME);
    httpsHealthCheckClient.close();
    instanceClient.close();
    instanceGroupClient.deleteInstanceGroup(INSTANCE_GROUP_NAME);
    instanceGroupClient.close();
    instanceTemplateClient.close();
    instanceGroupManagerClient.close();
    interconnectAttachmentClient.close();
    interconnectLocationClient.close();
    interconnectClient.close();
    licenseClient.deleteLicense(LICENSE_NAME);
    licenseClient.close();
    machineTypeClient.close();
    networkEndpointGroupClient.deleteNetworkEndpointGroup(NETWORK_ENDPOINT_GROUP_NAME);
    networkEndpointGroupClient.close();
    networkClient.close();
    nodeTemplateClient.close();
    nodeTypeClient.close();
    nodeGroupClient.close();
    projectClient.close();
    regionAutoscalerClient.close();
    regionClient.close();
    regionCommitmentClient.close();
    regionDiskClient.close();
    regionBackendServiceClient.close();
    targetHttpProxyClient.close();
    targetHttpsProxyClient.close();
    targetInstanceClient.close();
    Thread.sleep(30000);
    targetPoolClient.deleteTargetPool(REGION_TARGET_POOL_NAME);
    targetPoolClient.close();
    targetSslProxyClient.close();
    targetTcpProxyClient.close();
    targetVpnGatewayClient.close();
    urlMapClient.close();
    vpnGatewayClient.close();
    vpnTunnelClient.close();
    zoneClient.close();
    if (storage != null) {
      boolean wasDeleted = RemoteStorageHelper.forceDelete(storage, BUCKET, 10, TimeUnit.SECONDS);
      if (!wasDeleted && LOG.isLoggable(Level.WARNING)) {
        LOG.log(Level.WARNING, "Deletion of bucket {0} timed out, bucket is not empty", BUCKET);
      }
    }
  }

  @Test
  public void listAcceleratorTypesTest() {
    AcceleratorTypeClient.ListAcceleratorTypesPagedResponse listAcceleratorTypes =
        acceleratorTypeClient.listAcceleratorTypes(PROJECT_ZONE_NAME);
    List<AcceleratorType> acceleratorTypes = Lists.newArrayList(listAcceleratorTypes.iterateAll());
    assertThat(acceleratorTypes).isNotNull();
    assertTrue(acceleratorTypes.iterator().hasNext());
    assertNotNull(acceleratorTypes.iterator().next());
  }

  @Test
  public void aggregatedListAcceleratorTypesTest() {
    AggregatedListAcceleratorTypesPagedResponse aggregatedListAcceleratorTypes =
        acceleratorTypeClient.aggregatedListAcceleratorTypes(PROJECT_NAME);
    List<AcceleratorTypesScopedList> typesScopedLists =
        Lists.newArrayList(aggregatedListAcceleratorTypes.iterateAll());
    assertThat(typesScopedLists).isNotNull();
    assertTrue(typesScopedLists.iterator().hasNext());
    assertNotNull(typesScopedLists.iterator().next());
  }

  @Test
  public void getAddressesTest() {
    ProjectRegionAddressName projectRegionAddressName =
        ProjectRegionAddressName.of(ADDRESS_NAME, DEFAULT_PROJECT, REGION);
    Address address = addressClient.getAddress(projectRegionAddressName);
    assertThat(address).isNotNull();
    assertEquals(ADDRESS_TYPE, address.getAddressType());
    assertEquals(ADDRESS_NAME, address.getName());
    assertEquals(NETWORK_TIER, address.getNetworkTier());
    assertEquals(REGION_LINK, address.getRegion());
    assertEquals(ADDRESS_OPERATION_STATUS, address.getStatus());
    assertEquals(ADDRESS_SELF_LINK, address.getSelfLink());
  }

  @Test
  public void listAddressesTest() {
    ListAddressesPagedResponse listAddresses = addressClient.listAddresses(PROJECT_REGION_NAME);
    List<Address> addresses = Lists.newArrayList(listAddresses.iterateAll());
    assertThat(addresses).isNotNull();
    for (Address address : addresses) {
      if (ADDRESS_NAME.equals(address.getName())) {
        assertEquals(ADDRESS_TYPE, address.getAddressType());
        assertEquals(ADDRESS_NAME, address.getName());
        assertEquals(NETWORK_TIER, address.getNetworkTier());
        assertEquals(REGION_LINK, address.getRegion());
        assertEquals(ADDRESS_OPERATION_STATUS, address.getStatus());
        assertEquals(ADDRESS_SELF_LINK, address.getSelfLink());
      }
    }
  }

  @Test
  public void aggregatedListAddressesTest() {
    AddressClient.AggregatedListAddressesPagedResponse pagedListResponse =
        addressClient.aggregatedListAddresses(PROJECT_NAME);
    List<AddressesScopedList> addressesScopedLists =
        Lists.newArrayList(pagedListResponse.iterateAll());
    for (AddressesScopedList addressesScopedList : addressesScopedLists) {
      List<Address> addresses = addressesScopedList.getAddressesList();
      if (addresses != null) {
        for (Address address : addresses) {
          if (ADDRESS_NAME.equals(address.getName())) {
            assertEquals(ADDRESS_TYPE, address.getAddressType());
            assertEquals(ADDRESS_NAME, address.getName());
            assertEquals(NETWORK_TIER, address.getNetworkTier());
            assertEquals(ADDRESS_OPERATION_STATUS, address.getStatus());
          }
        }
      }
    }
  }

  @Test
  public void listAutoscalersTest() {
    AutoscalerClient.ListAutoscalersPagedResponse listAutoscalers =
        autoscalerClient.listAutoscalers(PROJECT_ZONE_NAME);
    List<Autoscaler> autoscalers = Lists.newArrayList(listAutoscalers.iterateAll());
    assertThat(autoscalers).isNotNull();
  }

  @Test
  public void aggregatedListAutoscalersTest() {
    AutoscalerClient.AggregatedListAutoscalersPagedResponse aggregatedListAutoscalers =
        autoscalerClient.aggregatedListAutoscalers(PROJECT_NAME);
    List<AutoscalersScopedList> autoscalersScopedLists =
        Lists.newArrayList(aggregatedListAutoscalers.iterateAll());
    assertThat(autoscalersScopedLists).isNotNull();
    assertTrue(autoscalersScopedLists.iterator().hasNext());
    assertNotNull(autoscalersScopedLists.iterator().next());
  }

  @Test
  public void getBackendBucketTest() {
    BackendBucket backendBucket = backendBucketClient.getBackendBucket(PROJECT_BACKEND_BUCKET_NAME);
    assertEquals(BACKEND_BUCKET_NAME, backendBucket.getName());
    assertEquals(BUCKET, backendBucket.getBucketName());
    assertEquals(BACKEND_BUCKET_TARGET_LINK, backendBucket.getSelfLink());
    assertEquals(Boolean.FALSE, backendBucket.getEnableCdn());
  }

  @Test
  public void listBackendBucketsTest() {
    BackendBucketClient.ListBackendBucketsPagedResponse backendBucketsList =
        backendBucketClient.listBackendBuckets(PROJECT_NAME);
    List<BackendBucket> backendBuckets = Lists.newArrayList(backendBucketsList.iterateAll());
    assertThat(backendBuckets).isNotNull();
    for (BackendBucket backendBucket : backendBuckets) {
      if (BUCKET.equals(backendBucket.getBucketName())) {
        assertEquals(BACKEND_BUCKET_NAME, backendBucket.getName());
        assertEquals(BUCKET, backendBucket.getBucketName());
        assertEquals(BACKEND_BUCKET_TARGET_LINK, backendBucket.getSelfLink());
        assertEquals(Boolean.FALSE, backendBucket.getEnableCdn());
      }
    }
  }

  @Test
  public void addResourcePoliciesDiskTest() {
    DisksAddResourcePoliciesRequest resourcePoliciesRequest =
        DisksAddResourcePoliciesRequest.newBuilder().build();
    Operation resourcePoliciesDisk =
        diskClient.addResourcePoliciesDisk(PROJECT_ZONE_DISK_NAME, resourcePoliciesRequest);
    assertThat(resourcePoliciesDisk).isNotNull();
    assertEquals("RUNNING", resourcePoliciesDisk.getStatus());
    assertEquals("addResourcePolicies", resourcePoliciesDisk.getOperationType());
    assertEquals(DISK_SELF_LINK, resourcePoliciesDisk.getTargetLink());
    assertEquals(ZONE_SELF_LINK, resourcePoliciesDisk.getZone());
  }

  @Test
  public void removeResourcePoliciesDiskTest() {
    DisksRemoveResourcePoliciesRequest resourcePoliciesRequest =
        DisksRemoveResourcePoliciesRequest.newBuilder().build();
    Operation resourcePoliciesDisk =
        diskClient.removeResourcePoliciesDisk(PROJECT_ZONE_DISK_NAME, resourcePoliciesRequest);
    assertEquals("RUNNING", resourcePoliciesDisk.getStatus());
    assertEquals("removeResourcePolicies", resourcePoliciesDisk.getOperationType());
    assertEquals(DISK_SELF_LINK, resourcePoliciesDisk.getTargetLink());
    assertEquals(ZONE_SELF_LINK, resourcePoliciesDisk.getZone());
  }

  @Test
  public void aggregatedListDisksTest() {
    DiskClient.AggregatedListDisksPagedResponse pagedListResponse =
        diskClient.aggregatedListDisks(PROJECT_NAME);
    List<DisksScopedList> disksScopedLists = Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(disksScopedLists).isNotNull();
    assertTrue(disksScopedLists.iterator().hasNext());
    assertNotNull(disksScopedLists.iterator().next());
  }

  @Test
  public void createSnapshotDiskTest() {
    Snapshot snapshotResource =
        Snapshot.newBuilder().setName("test-snapshot-" + ID).setDiskSizeGb(DISK_SIZE).build();
    CreateSnapshotDiskHttpRequest diskHttpRequest =
        CreateSnapshotDiskHttpRequest.newBuilder()
            .setDisk(PROJECT_ZONE_DISK_NAME.toString())
            .setGuestFlush(Boolean.FALSE)
            .setSnapshotResource(snapshotResource)
            .build();
    Operation snapshotDisk = diskClient.createSnapshotDisk(diskHttpRequest);
    assertEquals("RUNNING", snapshotDisk.getStatus());
    assertEquals("createSnapshot", snapshotDisk.getOperationType());
    assertEquals(DISK_SELF_LINK, snapshotDisk.getTargetLink());
    assertEquals(ZONE_SELF_LINK, snapshotDisk.getZone());
  }

  @Test
  public void getDiskTest() {
    Disk disk = diskClient.getDisk(PROJECT_ZONE_DISK_NAME);
    assertThat(disk).isNotNull();
    assertEquals(DISK_NAME, disk.getName());
    assertEquals(DISK_SIZE, disk.getSizeGb());
    assertEquals(DISK_SELF_LINK, disk.getSelfLink());
    assertEquals("READY", disk.getStatus());
  }

  @Test
  public void getIamPolicyDiskTest() {
    Policy policy = diskClient.getIamPolicyDisk(PROJECT_ZONE_DISK_RESOURCE_NAME);
    assertNotNull(policy);
    assertEquals(1, (int) policy.getVersion());
  }

  @Test
  public void resizeDiskTest() throws Exception {
    String diskSize = "2";
    DisksResizeRequest disksResizeRequestResource =
        DisksResizeRequest.newBuilder().setSizeGb(diskSize).build();
    Operation resizeDisk =
        diskClient.resizeDisk(PROJECT_ZONE_DISK_NAME, disksResizeRequestResource);
    Thread.sleep(2000);
    assertThat(resizeDisk).isNotNull();
    Disk disk = diskClient.getDisk(PROJECT_ZONE_DISK_NAME);
    assertEquals(DISK_NAME, disk.getName());
    assertEquals(diskSize, disk.getSizeGb());
    assertEquals(DISK_SELF_LINK, disk.getSelfLink());
    assertEquals("READY", disk.getStatus());
  }

  @Test
  public void listDisksTest() {
    DiskClient.ListDisksPagedResponse diskList = diskClient.listDisks(PROJECT_ZONE_NAME);
    List<Disk> disks = Lists.newArrayList(diskList.iterateAll());
    assertThat(disks).isNotNull();
    for (Disk disk : disks) {
      if (DISK_NAME.equals(disk.getName())) {
        assertEquals(DISK_NAME, disk.getName());
        assertEquals(DISK_SIZE, disk.getSizeGb());
        assertEquals(DISK_SELF_LINK, disk.getSelfLink());
        assertEquals("READY", disk.getStatus());
      }
    }
  }

  @Test
  public void testGetDiskType() {
    DiskType diskType =
        diskTypeClient.getDiskType(ProjectZoneDiskTypeName.of(DISK_TYPE, DEFAULT_PROJECT, ZONE));
    ProjectZoneDiskTypeName returnDiskName = ProjectZoneDiskTypeName.parse(diskType.getSelfLink());
    assertThat(returnDiskName.getZone()).isEqualTo(ZONE);
    assertThat(returnDiskName.getDiskType()).isEqualTo(DISK_TYPE);
    assertThat(diskType.getCreationTimestamp()).isNotNull();
    assertThat(diskType.getDescription()).isNotNull();
    assertThat(diskType.getValidDiskSize()).isNotNull();
    assertThat(diskType.getDefaultDiskSizeGb()).isNotNull();
  }

  @Test
  public void listExternalVpnGatewaysTest() {
    List<ExternalVpnGateway> vpnGateways =
        Lists.newArrayList(
            externalVpnGatewayClient.listExternalVpnGateways(PROJECT_NAME).iterateAll());
    assertThat(vpnGateways).isNotNull();
    for (ExternalVpnGateway vpnGateway : vpnGateways) {
      if (EXTERNAL_VPN_GATEWAY_NAME.equals(vpnGateway.getName())) {
        assertEquals(EXTERNAL_VPN_GATEWAY_NAME, vpnGateway.getName());
        assertEquals(REDUNDANCY_TYPE, vpnGateway.getRedundancyType());
        assertEquals(EXTERNAL_VPN_GATEWAY_TARGET_LINK, vpnGateway.getSelfLink());
        assertEquals(VPN_GATEWAY_INTERFACE, vpnGateway.getInterfacesList());
        assertEquals(EXTERNAL_VPN_GATEWAY_DESCRIPTION, vpnGateway.getDescription());
      }
    }
  }

  @Test
  public void getFirewallTest() {
    Firewall firewall = firewallClient.getFirewall(FIREWALL);
    assertEquals(ALLOWEDS, firewall.getAllowedList());
    assertEquals(FIREWALL_DESCRIPTION, firewall.getDescription());
    assertEquals(DIRECTION, firewall.getDirection());
    assertEquals(Boolean.FALSE, firewall.getDisabled());
    assertEquals(DEFAULT_NETWORK, firewall.getNetwork());
    assertEquals(FIREWALL_PRIORITY, (int) firewall.getPriority());
    assertEquals(FIREWALL_LINK, firewall.getSelfLink());
  }

  @Test
  public void listFirewallsTest() {
    List<Firewall> firewalls =
        Lists.newArrayList(firewallClient.listFirewalls(PROJECT_NAME).iterateAll());
    for (Firewall firewall : firewalls) {
      if (FIREWALL_NAME.equals(firewall.getName())) {
        assertEquals(ALLOWEDS, firewall.getAllowedList());
        assertEquals(FIREWALL_DESCRIPTION, firewall.getDescription());
        assertEquals(DIRECTION, firewall.getDirection());
        assertEquals(Boolean.FALSE, firewall.getDisabled());
        assertEquals(DEFAULT_NETWORK, firewall.getNetwork());
        assertEquals(FIREWALL_PRIORITY, (int) firewall.getPriority());
        assertEquals(FIREWALL_LINK, firewall.getSelfLink());
      }
    }
  }

  @Test
  public void getForwardingRuleTest() throws Exception {
    Thread.sleep(50000);
    ForwardingRule forwardingRule =
        forwardingRuleClient.getForwardingRule(PROJECT_REGION_FORWARDING_RULE_NAME);
    assertEquals(IP_PROTOCOL, forwardingRule.getIPProtocol());
    assertEquals(FORWARDING_RULE_NAME, forwardingRule.getName());
    assertEquals(NETWORK_TIER, forwardingRule.getNetworkTier());
    assertEquals(REGION_LINK, forwardingRule.getRegion());
    assertEquals(FORWARDING_RULE_LINK, forwardingRule.getSelfLink());
    assertEquals(TARGET_POOL_SELF_LINK, forwardingRule.getTarget());
  }

  @Test
  public void listForwardingRulesTest() {
    List<ForwardingRule> forwardingRules =
        Lists.newArrayList(
            forwardingRuleClient.listForwardingRules(PROJECT_REGION_NAME).iterateAll());
    for (ForwardingRule forwardingRule : forwardingRules) {
      if (FORWARDING_RULE_NAME.equals(forwardingRule.getName())) {
        assertEquals(IP_PROTOCOL, forwardingRule.getIPProtocol());
        assertEquals(FORWARDING_RULE_NAME, forwardingRule.getName());
        assertEquals(NETWORK_TIER, forwardingRule.getNetworkTier());
        assertEquals(REGION_LINK, forwardingRule.getRegion());
        assertEquals(FORWARDING_RULE_LINK, forwardingRule.getSelfLink());
        assertEquals(TARGET_POOL_SELF_LINK, forwardingRule.getTarget());
      }
    }
  }

  @Test
  public void setTargetForwardingRuleTest() throws Exception {
    Thread.sleep(50000);
    TargetReference targetReferenceResource =
        TargetReference.newBuilder().setTarget(TARGET_POOL_SELF_LINK).build();
    Operation setTargetForwardingRule =
        forwardingRuleClient.setTargetForwardingRule(
            PROJECT_REGION_FORWARDING_RULE_NAME, targetReferenceResource);
    assertEquals("SetTarget", setTargetForwardingRule.getOperationType());
    assertEquals(REGION_LINK, setTargetForwardingRule.getRegion());
    assertEquals(FORWARDING_RULE_LINK, setTargetForwardingRule.getTargetLink());
  }

  @Test
  public void aggregatedListForwardingRulesTest() {
    List<ForwardingRulesScopedList> forwardingRulesScopedLists =
        Lists.newArrayList(
            forwardingRuleClient.aggregatedListForwardingRules(PROJECT_NAME).iterateAll());
    assertThat(forwardingRulesScopedLists).isNotNull();
  }

  @Test
  public void listGlobalAddressesTest() {
    List<Address> addresses =
        Lists.newArrayList(globalAddressClient.listGlobalAddresses(PROJECT_NAME).iterateAll());
    for (Address address : addresses) {
      if (ADDRESS_NAME.equals(address.getName())) {
        assertEquals(ADDRESS_TYPE, address.getAddressType());
        assertEquals(ADDRESS_NAME, address.getName());
        assertEquals(NETWORK_TIER, address.getNetworkTier());
        assertEquals(ADDRESS_OPERATION_STATUS, address.getStatus());
        assertEquals(GLOBAL_ADDRESS_LINK, address.getSelfLink());
      }
    }
  }

  @Test
  public void listGlobalForwardingRulesTest() {
    List<ForwardingRule> forwardingRules =
        Lists.newArrayList(
            globalForwardingRuleClient.listGlobalForwardingRules(PROJECT_NAME).iterateAll());
    assertThat(forwardingRules).isNotNull();
  }

  @Test
  public void listGlobalOperationsTest() {
    GlobalOperationClient.ListGlobalOperationsPagedResponse listGlobalOperations =
        globalOperationClient.listGlobalOperations(PROJECT_NAME);
    List<Operation> operations = Lists.newArrayList(listGlobalOperations.iterateAll());
    assertThat(operations).isNotNull();
    assertTrue(operations.iterator().hasNext());
    assertNotNull(operations.iterator().next());
  }

  @Test
  public void aggregatedListGlobalOperationsTest() {
    GlobalOperationClient.AggregatedListGlobalOperationsPagedResponse listGlobalOperations =
        globalOperationClient.aggregatedListGlobalOperations(PROJECT_NAME);
    List<OperationsScopedList> operationsScopedLists =
        Lists.newArrayList(listGlobalOperations.iterateAll());
    assertThat(operationsScopedLists).isNotNull();
    assertTrue(operationsScopedLists.iterator().hasNext());
    assertNotNull(operationsScopedLists.iterator().next());
  }

  @Test
  public void listHealthChecksTest() {
    List<HealthCheck> healthChecks =
        Lists.newArrayList(healthCheckClient.listHealthChecks(PROJECT_NAME).iterateAll());
    for (HealthCheck healthCheck : healthChecks) {
      if (HEALTH_CHECK_NAME.equals(healthCheck.getName())) {
        assertEquals(HEALTH_CHECK_NAME, healthCheck.getName());
        assertEquals(HEALTH_CHECK_LINK, healthCheck.getSelfLink());
        assertEquals(TCP_HEALTH_CHECK, healthCheck.getTcpHealthCheck());
        assertEquals(IP_PROTOCOL, healthCheck.getType());
      }
    }
  }

  @Test
  public void aggregatedListHealthChecksTest() {
    List<HealthChecksScopedList> scopedLists =
        Lists.newArrayList(healthCheckClient.aggregatedListHealthChecks(PROJECT_NAME).iterateAll());
    Iterator<HealthChecksScopedList> iterator = scopedLists.iterator();
    while (iterator.hasNext()) {
      List<HealthCheck> checkList = iterator.next().getHealthChecksList();
      if (null != checkList && checkList.size() > 0) {
        for (HealthCheck healthCheck : checkList) {
          if (HEALTH_CHECK_NAME.equals(healthCheck.getName())) {
            assertEquals(HEALTH_CHECK_NAME, healthCheck.getName());
            assertEquals(HEALTH_CHECK_LINK, healthCheck.getSelfLink());
            assertEquals(TCP_HEALTH_CHECK, healthCheck.getTcpHealthCheck());
            assertEquals(IP_PROTOCOL, healthCheck.getType());
          }
        }
      }
    }
  }

  @Test
  public void getHttpHealthCheckTest() throws Exception {
    Thread.sleep(60000);
    GetHttpHealthCheckHttpRequest request =
        GetHttpHealthCheckHttpRequest.newBuilder()
            .setHttpHealthCheck(HTTP_HEALTH_CHECK_NAME.toString())
            .build();
    HttpHealthCheck2 httpHealthCheck = httpHealthCheckClient.getHttpHealthCheck(request);
    assertEquals(HTTP_HEALTH_CHECK_2, httpHealthCheck.getName());
    assertEquals(UNHEALTHY_THRESHOLD, httpHealthCheck.getHealthyThreshold());
    assertEquals(PORT, httpHealthCheck.getPort());
    assertEquals(HTTP_HEALTH_CHECK_LINK, httpHealthCheck.getSelfLink());
  }

  @Test
  public void listHttpHealthChecksTest() {
    List<HttpHealthCheck2> healthCheck2s =
        Lists.newArrayList(httpHealthCheckClient.listHttpHealthChecks(PROJECT_NAME).iterateAll());
    for (HttpHealthCheck2 httpHealthCheck : healthCheck2s) {
      if (HTTP_HEALTH_CHECK_2.equals(httpHealthCheck.getName())) {
        assertEquals(HTTP_HEALTH_CHECK_2, httpHealthCheck.getName());
        assertEquals(UNHEALTHY_THRESHOLD, httpHealthCheck.getHealthyThreshold());
        assertEquals(PORT, httpHealthCheck.getPort());
        assertEquals(HTTP_HEALTH_CHECK_LINK, httpHealthCheck.getSelfLink());
      }
    }
  }

  @Test
  public void getHttpsHealthCheckTest() throws Exception {
    Thread.sleep(60000);
    HttpsHealthCheck2 httpsHealthCheck =
        httpsHealthCheckClient.getHttpsHealthCheck(HTTPS_HEALTH_CHECK_NAME);
    assertEquals(HTTPS_HEALTH_CHECK_2, httpsHealthCheck.getName());
    assertEquals(UNHEALTHY_THRESHOLD, httpsHealthCheck.getHealthyThreshold());
    assertEquals(PORT, httpsHealthCheck.getPort());
    assertEquals(HTTPS_HEALTH_CHECK_LINK, httpsHealthCheck.getSelfLink());
  }

  @Test
  public void listHttpsHealthChecksTest() {
    List<HttpsHealthCheck2> httpsHealthCheck2s =
        Lists.newArrayList(httpsHealthCheckClient.listHttpsHealthChecks(PROJECT_NAME).iterateAll());
    assertThat(httpsHealthCheck2s).isNotNull();
    for (HttpsHealthCheck2 httpsHealthCheck : httpsHealthCheck2s) {
      if (HTTPS_HEALTH_CHECK_2.equals(httpsHealthCheck.getName())) {
        assertEquals(HTTPS_HEALTH_CHECK_2, httpsHealthCheck.getName());
        assertEquals(UNHEALTHY_THRESHOLD, httpsHealthCheck.getHealthyThreshold());
        assertEquals(PORT, httpsHealthCheck.getPort());
        assertEquals(HTTPS_HEALTH_CHECK_LINK, httpsHealthCheck.getSelfLink());
      }
    }
  }

  @Test
  public void getImageTest() {
    Image image = imageClient.getImage(PROJECT_GLOBAL_IMAGE_NAME);
    assertThat(image).isNotNull();
    assertEquals(IMAGE_NAME, image.getName());
    assertEquals(IMAGE_LINK, image.getSelfLink());
    assertEquals(DISK_SIZE, image.getDiskSizeGb());
  }

  @Test
  public void listImagesTest() {
    List<Image> images = Lists.newArrayList(imageClient.listImages(PROJECT_NAME).iterateAll());
    for (Image image : images) {
      if (IMAGE_NAME.equals(image.getName())) {
        assertEquals(IMAGE_NAME, image.getName());
        assertEquals(IMAGE_LINK, image.getSelfLink());
        assertEquals(DISK_SIZE, image.getDiskSizeGb());
      }
    }
  }

  @Test
  public void getIamPolicyImageTest() {
    Policy policy = imageClient.getIamPolicyImage(IMAGE_RESOURCE_NAME);
    assertNotNull(policy);
    assertEquals(1, (int) policy.getVersion());
  }

  @Test
  public void deprecateImageTest() {
    DeprecationStatus deprecationStatusResource = DeprecationStatus.newBuilder().build();
    Operation deprecateImage =
        imageClient.deprecateImage(PROJECT_GLOBAL_IMAGE_NAME, deprecationStatusResource);
    assertEquals("deprecateImage", deprecateImage.getOperationType());
    assertEquals("DONE", deprecateImage.getStatus());
    assertEquals(IMAGE_LINK, deprecateImage.getTargetLink());
  }

  @Test
  public void testInsertInstance() {
    String machineType =
        ProjectZoneMachineTypeName.of("n1-standard-1", DEFAULT_PROJECT, ZONE).toString();
    Instance instance =
        Instance.newBuilder().setName("mytestinstancetemplate").setMachineType(machineType).build();
    try {
      instanceClient.insertInstance(ProjectZoneName.of(DEFAULT_PROJECT, ZONE), instance);
    } catch (InvalidArgumentException e) {
      // Expect a Bad Request HTTP 400 error, but it should NOT be because of a resource name
      // problem.
      assertThat(e.getMessage()).contains("Bad Request");
      assertThat(e.getCause().getMessage())
          .contains("Invalid value for field 'resource.networkInterfaces'");
      return;
    }

    fail("Expected HTTP Bad Request to be returned, but it was not returned.");
  }

  @Test
  public void testListDiskTypes() {
    Page<DiskType> diskPage = diskTypeClient.listDiskTypes(PROJECT_ZONE_NAME).getPage();
    Iterator<DiskType> diskTypeIterator = diskPage.iterateAll().iterator();
    assertThat(diskTypeIterator.hasNext()).isTrue();
    while (diskTypeIterator.hasNext()) {
      DiskType diskType = diskTypeIterator.next();
      assertThat(diskType.getSelfLink()).isNotNull();
      ProjectZoneDiskTypeName returnDiskName =
          ProjectZoneDiskTypeName.parse(diskType.getSelfLink());
      assertThat(returnDiskName.getZone()).isEqualTo(ZONE);
      assertThat(diskType.getCreationTimestamp()).isNotNull();
      assertThat(diskType.getDescription()).isNotNull();
      assertThat(diskType.getValidDiskSize()).isNotNull();
      assertThat(diskType.getDefaultDiskSizeGb()).isNotNull();
    }
  }

  @Test
  public void testListDiskTypesWithFilter() {
    ListDiskTypesHttpRequest request =
        ListDiskTypesHttpRequest.newBuilder()
            .setZone(PROJECT_ZONE_NAME.toString())
            .setFilter("(defaultDiskSizeGb = 375)")
            .build();
    Page<DiskType> diskPage = diskTypeClient.listDiskTypes(request).getPage();
    Iterator<DiskType> diskTypeIterator = diskPage.iterateAll().iterator();
    assertThat(diskTypeIterator.hasNext()).isTrue();
    while (diskTypeIterator.hasNext()) {
      DiskType diskType = diskTypeIterator.next();
      assertThat(diskType.getZone()).isNotNull();
      ProjectZoneName zoneName = ProjectZoneName.parse(diskType.getZone());
      assertThat(zoneName.getZone()).isEqualTo(ZONE);
      assertThat(diskType.getCreationTimestamp()).isNotNull();
      assertThat(diskType.getDescription()).isNotNull();
      assertThat(diskType.getValidDiskSize()).isNotNull();
      assertThat(diskType.getDefaultDiskSizeGb()).isNotNull();
    }
  }

  @Test
  public void testAggregatedListDiskTypes() {
    AggregatedListDiskTypesPagedResponse pagedListResponse =
        diskTypeClient.aggregatedListDiskTypes(PROJECT_NAME);
    List<DiskTypesScopedList> diskTypeScopedListIterator =
        Lists.newArrayList(pagedListResponse.iterateAll());
    List<DiskType> diskTypeIterator = new LinkedList<>();
    for (DiskTypesScopedList scopedList : diskTypeScopedListIterator) {
      diskTypeIterator.addAll(scopedList.getDiskTypesList());
    }
    assertThat(diskTypeIterator.size()).isGreaterThan(0);
    for (DiskType diskType : diskTypeIterator) {
      assertThat(diskType.getRegion() != null || diskType.getZone() != null).isTrue();
      if (diskType.getRegion() != null) {
        ProjectRegionDiskTypeName zoneName =
            ProjectRegionDiskTypeName.parse(diskType.getSelfLink());
        assertThat(zoneName.getDiskType()).isNotNull();
        assertThat(zoneName.getRegion()).isNotNull();
      } else {
        ProjectZoneDiskTypeName zoneName = ProjectZoneDiskTypeName.parse(diskType.getSelfLink());
        assertThat(zoneName.getDiskType()).isNotNull();
        assertThat(zoneName.getZone()).isNotNull();
      }
      assertThat(diskType.getCreationTimestamp()).isNotNull();
      assertThat(diskType.getDescription()).isNotNull();
      assertThat(diskType.getValidDiskSize()).isNotNull();
      assertThat(diskType.getDefaultDiskSizeGb()).isNotNull();
    }
  }

  @Test
  public void getInstanceGroupTest() {
    InstanceGroup instanceGroup = instanceGroupClient.getInstanceGroup(INSTANCE_GROUP_NAME);
    assertNotNull(instanceGroup);
    assertEquals(INSTANCE_GROUP, instanceGroup.getName());
    assertEquals(INSTANCE_GROUP_LINK, instanceGroup.getSelfLink());
    assertEquals(ZONE_SELF_LINK, instanceGroup.getZone());
  }

  @Test
  public void listInstanceGroupsTest() {
    List<InstanceGroup> instanceGroups =
        Lists.newArrayList(instanceGroupClient.listInstanceGroups(PROJECT_ZONE_NAME).iterateAll());
    for (InstanceGroup instanceGroup : instanceGroups) {
      if (INSTANCE_GROUP.equals(instanceGroup.getName())) {
        assertEquals(INSTANCE_GROUP, instanceGroup.getName());
        assertEquals(INSTANCE_GROUP_LINK, instanceGroup.getSelfLink());
        assertEquals(ZONE_SELF_LINK, instanceGroup.getZone());
      }
    }
  }

  @Test
  public void listInstancesInstanceGroupsTest() {
    ProjectZoneInstanceGroupName instanceGroup =
        ProjectZoneInstanceGroupName.of(INSTANCE_GROUP, DEFAULT_PROJECT, ZONE);
    InstanceGroupsListInstancesRequest instancesRequest =
        InstanceGroupsListInstancesRequest.newBuilder().build();
    List<InstanceWithNamedPorts> instanceWithNamedPorts =
        Lists.newArrayList(
            instanceGroupClient
                .listInstancesInstanceGroups(instanceGroup, instancesRequest)
                .iterateAll());
    assertThat(instanceWithNamedPorts).isNotNull();
  }

  @Test
  public void aggregatedListInstanceGroupsTest() {
    List<InstanceGroupsScopedList> scopedLists =
        Lists.newArrayList(
            instanceGroupClient.aggregatedListInstanceGroups(PROJECT_NAME).iterateAll());
    for (InstanceGroupsScopedList instanceGroupsScopedList : scopedLists) {
      List<InstanceGroup> instanceGroups = instanceGroupsScopedList.getInstanceGroupsList();
      if (null != instanceGroups && instanceGroups.size() > 0) {
        for (InstanceGroup instanceGroup : instanceGroups) {
          if (INSTANCE_GROUP.equals(instanceGroup.getName())) {
            assertEquals(INSTANCE_GROUP, instanceGroup.getName());
            assertEquals(INSTANCE_GROUP_LINK, instanceGroup.getSelfLink());
            assertEquals(ZONE_SELF_LINK, instanceGroup.getZone());
          }
        }
      }
    }
  }

  @Test
  public void setNamedPortsInstanceGroupTest() {
    ProjectZoneInstanceGroupName instanceGroup =
        ProjectZoneInstanceGroupName.of(INSTANCE_GROUP, DEFAULT_PROJECT, ZONE);
    InstanceGroupsSetNamedPortsRequest instanceGroupsSetNamedPortsRequestResource =
        InstanceGroupsSetNamedPortsRequest.newBuilder().build();
    Operation portsInstanceGroup =
        instanceGroupClient.setNamedPortsInstanceGroup(
            instanceGroup, instanceGroupsSetNamedPortsRequestResource);
    assertNotNull(portsInstanceGroup);
    assertEquals("compute.instanceGroups.setNamedPorts", portsInstanceGroup.getOperationType());
    assertEquals("DONE", portsInstanceGroup.getStatus());
    assertEquals(ZONE_SELF_LINK, portsInstanceGroup.getZone());
    assertEquals(INSTANCE_GROUP_LINK, portsInstanceGroup.getTargetLink());
  }

  @Test
  public void listTargetSslProxiesTest() {
    ListTargetSslProxiesPagedResponse pagedListResponse =
        targetSslProxyClient.listTargetSslProxies(PROJECT_NAME);
    List<TargetSslProxy> targetSslProxies = Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(targetSslProxies).isNotNull();
  }

  @Test
  public void listTargetHttpProxiesTest() {
    TargetHttpProxyClient.ListTargetHttpProxiesPagedResponse listTargetHttpProxies =
        targetHttpProxyClient.listTargetHttpProxies(PROJECT_NAME);
    List<TargetHttpProxy> targetHttpProxies =
        Lists.newArrayList(listTargetHttpProxies.iterateAll());
    assertThat(targetHttpProxies).isNotNull();
  }

  @Test
  public void aggregatedListTargetHttpProxiesTest() {
    TargetHttpProxyClient.AggregatedListTargetHttpProxiesPagedResponse listTargetHttpProxies =
        targetHttpProxyClient.aggregatedListTargetHttpProxies(PROJECT_NAME);
    List<TargetHttpProxiesScopedList> targetHttpProxiesScopedLists =
        Lists.newArrayList(listTargetHttpProxies.iterateAll());
    assertThat(targetHttpProxiesScopedLists).isNotNull();
  }

  @Test
  public void listTargetHttpsProxiesTest() {
    ListTargetHttpsProxiesPagedResponse listTargetHttpsProxies =
        targetHttpsProxyClient.listTargetHttpsProxies(PROJECT_NAME);
    List<TargetHttpsProxy> targetHttpsProxies =
        Lists.newArrayList(listTargetHttpsProxies.iterateAll());
    assertThat(targetHttpsProxies).isNotNull();
  }

  @Test
  public void listTargetInstancesTest() {
    ListTargetInstancesPagedResponse listTargetInstances =
        targetInstanceClient.listTargetInstances(PROJECT_ZONE_NAME);
    List<TargetInstance> targetInstances = Lists.newArrayList(listTargetInstances.iterateAll());
    assertThat(targetInstances).isNotNull();
  }

  @Test
  public void aggregatedListTargetInstancesTest() {
    TargetInstanceClient.AggregatedListTargetInstancesPagedResponse aggregatedListTargetInstances =
        targetInstanceClient.aggregatedListTargetInstances(PROJECT_NAME);
    List<TargetInstancesScopedList> targetInstancesScopedLists =
        Lists.newArrayList(aggregatedListTargetInstances.iterateAll());
    assertThat(targetInstancesScopedLists).isNotNull();
  }

  @Test
  public void getTargetPoolTest() {
    ProjectRegionTargetPoolName regionTargetPoolName =
        ProjectRegionTargetPoolName.of(DEFAULT_PROJECT, REGION, TARGET_POOL_NAME);
    TargetPool targetPool = targetPoolClient.getTargetPool(regionTargetPoolName);
    assertThat(targetPool).isNotNull();
    assertEquals(TARGET_POOL_NAME, targetPool.getName());
    assertEquals(REGION_LINK, targetPool.getRegion());
    assertEquals(TARGET_POOL_SELF_LINK, targetPool.getSelfLink());
    assertEquals(SESSION_AFFINITY, targetPool.getSessionAffinity());
  }

  @Test
  public void listTargetPoolsTest() {
    ListTargetPoolsPagedResponse pagedListResponse =
        targetPoolClient.listTargetPools(PROJECT_REGION_NAME);
    List<TargetPool> targetPools = Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(targetPools).isNotNull();
    for (TargetPool targetPool : targetPools) {
      if (TARGET_POOL_NAME.equals(targetPool.getName())) {
        assertEquals(TARGET_POOL_NAME, targetPool.getName());
        assertEquals(REGION_LINK, targetPool.getRegion());
        assertEquals(TARGET_POOL_SELF_LINK, targetPool.getSelfLink());
        assertEquals(SESSION_AFFINITY, targetPool.getSessionAffinity());
      }
    }
  }

  @Test
  public void addInstanceTargetPoolTest() throws Exception {
    Thread.sleep(2000);
    TargetPoolsAddInstanceRequest targetPoolsAddInstanceRequestResource =
        TargetPoolsAddInstanceRequest.newBuilder().build();
    Operation instanceTargetPool =
        targetPoolClient.addInstanceTargetPool(
            REGION_TARGET_POOL_NAME, targetPoolsAddInstanceRequestResource);
    assertThat(instanceTargetPool).isNotNull();
    assertEquals("AddInstance", instanceTargetPool.getOperationType());
    assertEquals(REGION_LINK, instanceTargetPool.getRegion());
    assertEquals(TARGET_POOL_SELF_LINK, instanceTargetPool.getTargetLink());
  }

  @Test
  public void setBackupTargetPoolTest() throws Exception {
    Thread.sleep(2000);
    TargetReference targetReferenceResource = TargetReference.newBuilder().build();
    SetBackupTargetPoolHttpRequest request =
        SetBackupTargetPoolHttpRequest.newBuilder()
            .setTargetPool(REGION_TARGET_POOL_NAME.toString())
            .setTargetReferenceResource(targetReferenceResource)
            .build();
    Operation response = targetPoolClient.setBackupTargetPool(request);
    assertThat(response).isNotNull();
    assertEquals("SetBackup", response.getOperationType());
    assertEquals("RUNNING", response.getStatus());
    assertEquals(REGION_LINK, response.getRegion());
    assertEquals(TARGET_POOL_SELF_LINK, response.getTargetLink());
  }

  @Test
  public void aggregatedListTargetPoolsTest() {
    TargetPoolClient.AggregatedListTargetPoolsPagedResponse pagedListResponse =
        targetPoolClient.aggregatedListTargetPools(PROJECT_NAME);
    List<TargetPoolsScopedList> targetPoolsScopedLists =
        Lists.newArrayList(pagedListResponse.iterateAll());
    for (TargetPoolsScopedList targetPoolsScopedList : targetPoolsScopedLists) {
      List<TargetPool> targetPools = targetPoolsScopedList.getTargetPoolsList();
      if (targetPools != null) {
        for (TargetPool targetPool : targetPools) {
          if (TARGET_POOL_NAME.equals(targetPool.getName())) {
            assertEquals(TARGET_POOL_NAME, targetPool.getName());
            assertEquals(REGION_LINK, targetPool.getRegion());
            assertEquals(TARGET_POOL_SELF_LINK, targetPool.getSelfLink());
            assertEquals(SESSION_AFFINITY, targetPool.getSessionAffinity());
          }
        }
      }
    }
  }

  @Test
  public void addHealthCheckTargetPoolTest() {
    TargetPoolsAddHealthCheckRequest targetPoolsAddHealthCheckRequestResource =
        TargetPoolsAddHealthCheckRequest.newBuilder().build();
    Operation response =
        targetPoolClient.addHealthCheckTargetPool(
            REGION_TARGET_POOL_NAME, targetPoolsAddHealthCheckRequestResource);
    assertThat(response).isNotNull();
    assertEquals("AddHealthCheck", response.getOperationType());
    assertEquals("DONE", response.getStatus());
    assertEquals(REGION_LINK, response.getRegion());
    assertEquals(TARGET_POOL_SELF_LINK, response.getTargetLink());
  }

  @Test
  public void listTargetTcpProxiesTest() {
    ListTargetTcpProxiesPagedResponse pagedListResponse =
        targetTcpProxyClient.listTargetTcpProxies(PROJECT_NAME);
    List<TargetTcpProxy> proxies = Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(proxies).isNotNull();
  }

  @Test
  public void listTargetVpnGatewaysTest() {
    ListTargetVpnGatewaysPagedResponse pagedListResponse =
        targetVpnGatewayClient.listTargetVpnGateways(PROJECT_REGION_NAME);
    List<TargetVpnGateway> targetVpnGateways = Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(targetVpnGateways).isNotNull();
  }

  @Test
  public void listUrlMapsTest() {
    ListUrlMapsPagedResponse listUrlMaps = urlMapClient.listUrlMaps(PROJECT_NAME);
    List<UrlMap> urlMaps = Lists.newArrayList(listUrlMaps.iterateAll());
    assertThat(urlMaps).isNotNull();
  }

  @Test
  public void aggregatedListUrlMapsTest() {
    AggregatedListUrlMapsPagedResponse pagedListResponse =
        urlMapClient.aggregatedListUrlMaps(PROJECT_NAME);
    List<UrlMapsScopedList> urlMapsScopedLists = Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(urlMapsScopedLists).isNotNull();
  }

  @Test
  public void listVpnGatewaysTest() {
    ListVpnGatewaysPagedResponse listVpnGatewaysPagedResponse =
        vpnGatewayClient.listVpnGateways(PROJECT_REGION_NAME);
    Iterator<VpnGateway> vpnGatewayIterator = listVpnGatewaysPagedResponse.iterateAll().iterator();
    assertThat(vpnGatewayIterator).isNotNull();
  }

  @Test
  public void listVpnTunnelsTest() {
    ListVpnTunnelsPagedResponse listVpnTunnels =
        vpnTunnelClient.listVpnTunnels(PROJECT_REGION_NAME);
    List<VpnTunnel> vpnTunnels = Lists.newArrayList(listVpnTunnels.iterateAll());
    assertThat(vpnTunnels).isNotNull();
  }

  @Test
  public void getZoneTest() {
    Zone actualZone = zoneClient.getZone(PROJECT_ZONE_NAME);
    assertEquals(ZONE, actualZone.getName());
    assertEquals(REGION_LINK, actualZone.getRegion());
    assertEquals(ZONE_SELF_LINK, actualZone.getSelfLink());
    assertEquals(STATUS, actualZone.getStatus());
    assertEquals(ZONE, actualZone.getDescription());
  }

  @Test
  public void listZonesTest() {
    ListZonesPagedResponse pagedListResponse = zoneClient.listZones(PROJECT_NAME);
    List<Zone> zones = Lists.newArrayList(pagedListResponse.iterateAll());
    for (Zone zone : zones) {
      if (ZONE.equals(zone.getName())) {
        assertEquals(ZONE, zone.getName());
        assertEquals(REGION_LINK, zone.getRegion());
        assertEquals(ZONE_SELF_LINK, zone.getSelfLink());
        assertEquals(STATUS, zone.getStatus());
        assertEquals(ZONE, zone.getDescription());
      }
    }
  }

  @Test
  public void listInstanceTemplatesTest() {
    InstanceTemplateClient.ListInstanceTemplatesPagedResponse pagedListResponse =
        instanceTemplateClient.listInstanceTemplates(PROJECT_NAME);
    List<InstanceTemplate> templates = Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(templates).isNotNull();
  }

  @Test
  public void listInstanceGroupManagersTest() {
    InstanceGroupManagerClient.ListInstanceGroupManagersPagedResponse pagedListResponse =
        instanceGroupManagerClient.listInstanceGroupManagers(PROJECT_ZONE_NAME);
    List<InstanceGroupManager> instanceGroupManagers =
        Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(instanceGroupManagers).isNotNull();
  }

  @Test
  public void aggregatedListInstanceGroupManagersTest() {
    InstanceGroupManagerClient.AggregatedListInstanceGroupManagersPagedResponse pagedListResponse =
        instanceGroupManagerClient.aggregatedListInstanceGroupManagers(PROJECT_NAME);
    List<InstanceGroupManagersScopedList> managersScopedLists =
        Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(managersScopedLists).isNotNull();
  }

  @Test
  public void listInterconnectsTest() {
    InterconnectClient.ListInterconnectsPagedResponse pagedListResponse =
        interconnectClient.listInterconnects(PROJECT_NAME);
    List<Interconnect> interconnects = Lists.newArrayList(pagedListResponse.iterateAll());
    for (Interconnect interconnect : interconnects) {
      if (INTER_CONNECT.equals(interconnect.getName())) {
        assertEquals(CUSTOMER_NAME, interconnect.getCustomerName());
        assertEquals(Boolean.TRUE, interconnect.getAdminEnabled());
        assertEquals(INTER_CONNECT_TYPE, interconnect.getInterconnectType());
        assertEquals(INTER_CONNECT_LINK_TYPE, interconnect.getLinkType());
        assertEquals(INTER_CONNECT, interconnect.getName());
        assertEquals(INTER_CONNECT_REQUESTED_LINK_COUNT, interconnect.getRequestedLinkCount());
        assertEquals(INTER_CONNECT_LINK, interconnect.getSelfLink());
      }
    }
  }

  @Test
  public void listInterconnectAttachmentsTest() {
    InterconnectAttachmentClient.ListInterconnectAttachmentsPagedResponse pagedListResponse =
        interconnectAttachmentClient.listInterconnectAttachments(PROJECT_REGION_NAME);
    List<InterconnectAttachment> attachments = Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(attachments).isNotNull();
  }

  @Test
  public void listInterconnectLocationsTest() {
    InterconnectLocationClient.ListInterconnectLocationsPagedResponse pagedListResponse =
        interconnectLocationClient.listInterconnectLocations(PROJECT_NAME);
    List<InterconnectLocation> locations = Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(locations).isNotNull();
  }

  @Test
  public void getLicenseTest() {
    License license = licenseClient.getLicense(LICENSE_NAME);
    assertEquals(Boolean.FALSE, license.getChargesUseFee());
    assertEquals(LICENSE, license.getName());
    assertEquals(LICENSE_LINK, license.getSelfLink());
    assertEquals(Boolean.TRUE, license.getTransferable());
  }

  @Test
  public void listLicensesTest() {
    List<License> licenses =
        Lists.newArrayList(licenseClient.listLicenses(PROJECT_NAME).iterateAll());
    for (License license : licenses) {
      if (LICENSE.equals(license.getName())) {
        assertEquals(Boolean.FALSE, license.getChargesUseFee());
        assertEquals(LICENSE, license.getName());
        assertEquals(LICENSE_LINK, license.getSelfLink());
        assertEquals(Boolean.TRUE, license.getTransferable());
      }
    }
  }

  @Test
  public void getIamPolicyLicenseTest() {
    ProjectGlobalLicenseResourceName licenseResourceName =
        ProjectGlobalLicenseResourceName.of(DEFAULT_PROJECT, LICENSE);
    Policy policy = licenseClient.getIamPolicyLicense(licenseResourceName);
    assertEquals(1, (int) policy.getVersion());
    assertEquals("ACAB", policy.getEtag());
  }

  @Test
  public void getMachineTypeTest() {
    ProjectZoneMachineTypeName machineType =
        ProjectZoneMachineTypeName.of(MACHINE_TYPE, DEFAULT_PROJECT, ZONE);
    MachineType response = machineTypeClient.getMachineType(machineType);
    assertEquals(Boolean.FALSE, response.getIsSharedCpu());
    assertEquals(MACHINE_TYPE, response.getName());
    assertEquals(MACHINE_TYPE_LINK, response.getSelfLink());
    assertEquals(ZONE, response.getZone());
  }

  @Test
  public void listMachineTypesTest() {
    List<MachineType> machineTypes =
        Lists.newArrayList(machineTypeClient.listMachineTypes(PROJECT_ZONE_NAME).iterateAll());
    for (MachineType machineType : machineTypes) {
      if (MACHINE_TYPE.equals(machineType.getName())) {
        assertEquals(Boolean.FALSE, machineType.getIsSharedCpu());
        assertEquals(MACHINE_TYPE, machineType.getName());
        assertEquals(MACHINE_TYPE_LINK, machineType.getSelfLink());
        assertEquals(ZONE, machineType.getZone());
      }
    }
  }

  @Test
  public void aggregatedListMachineTypesTest() {
    MachineTypeClient.AggregatedListMachineTypesPagedResponse pagedListResponse =
        machineTypeClient.aggregatedListMachineTypes(PROJECT_NAME);
    List<MachineTypesScopedList> scopedLists = Lists.newArrayList(pagedListResponse.iterateAll());
    for (MachineTypesScopedList scopedList : scopedLists) {
      List<MachineType> machineTypes = scopedList.getMachineTypesList();
      if (null != machineTypes && machineTypes.size() > 0) {
        for (MachineType machineType : machineTypes) {
          if (null != machineType && MACHINE_TYPE.equals(machineType.getName())) {
            assertEquals(Boolean.FALSE, machineType.getIsSharedCpu());
            assertEquals(MACHINE_TYPE, machineType.getName());
          }
        }
      }
    }
  }

  @Test
  public void listNetworkTest() {
    List<Network> networks =
        Lists.newArrayList(networkClient.listNetworks(PROJECT_NAME).iterateAll());
    assertThat(networks).isNotNull();
  }

  @Test
  public void getNetworkEndpointGroupTest() {
    NetworkEndpointGroup networkEndpointGroup =
        networkEndpointGroupClient.getNetworkEndpointGroup(NETWORK_ENDPOINT_GROUP_NAME);
    assertEquals(DEFAULT_NETWORK, networkEndpointGroup.getNetwork());
    assertEquals(NETWORK_ENDPOINT_GROUP, networkEndpointGroup.getName());
    assertEquals(NETWORK_ENDPOINT_TYPE, networkEndpointGroup.getNetworkEndpointType());
    assertEquals(NETWORK_ENDPOINT_SUB_NETWORK, networkEndpointGroup.getSubnetwork());
    assertEquals(ZONE_SELF_LINK, networkEndpointGroup.getZone());
    assertEquals(NETWORK_ENDPOINT_GROUP_LINK, networkEndpointGroup.getSelfLink());
  }

  @Test
  public void listNetworkEndpointGroupsTest() {
    List<NetworkEndpointGroup> networkEndpointGroups =
        Lists.newArrayList(
            networkEndpointGroupClient.listNetworkEndpointGroups(PROJECT_ZONE_NAME).iterateAll());
    for (NetworkEndpointGroup networkEndpointGroup : networkEndpointGroups) {
      if (NETWORK_ENDPOINT_GROUP.equals(networkEndpointGroup.getName())) {
        assertEquals(DEFAULT_NETWORK, networkEndpointGroup.getNetwork());
        assertEquals(NETWORK_ENDPOINT_GROUP, networkEndpointGroup.getName());
        assertEquals(NETWORK_ENDPOINT_TYPE, networkEndpointGroup.getNetworkEndpointType());
        assertEquals(NETWORK_ENDPOINT_SUB_NETWORK, networkEndpointGroup.getSubnetwork());
        assertEquals(ZONE_SELF_LINK, networkEndpointGroup.getZone());
        assertEquals(NETWORK_ENDPOINT_GROUP_LINK, networkEndpointGroup.getSelfLink());
      }
    }
  }

  @Test
  public void aggregatedListNetworkEndpointGroupsTest() {
    List<NetworkEndpointGroupsScopedList> endpointGroupsScopedLists =
        Lists.newArrayList(
            networkEndpointGroupClient
                .aggregatedListNetworkEndpointGroups(PROJECT_NAME)
                .iterateAll());
    for (NetworkEndpointGroupsScopedList networkEndpointGroupsScopedList :
        endpointGroupsScopedLists) {
      List<NetworkEndpointGroup> networkEndpointGroups =
          networkEndpointGroupsScopedList.getNetworkEndpointGroupsList();
      if (null != networkEndpointGroups && networkEndpointGroups.size() > 0) {
        for (NetworkEndpointGroup networkEndpointGroup : networkEndpointGroups) {
          if (NETWORK_ENDPOINT_GROUP.equals(networkEndpointGroup.getName())) {
            assertEquals(DEFAULT_NETWORK, networkEndpointGroup.getNetwork());
            assertEquals(NETWORK_ENDPOINT_GROUP, networkEndpointGroup.getName());
            assertEquals(NETWORK_ENDPOINT_TYPE, networkEndpointGroup.getNetworkEndpointType());
            assertEquals(NETWORK_ENDPOINT_SUB_NETWORK, networkEndpointGroup.getSubnetwork());
            assertEquals(ZONE_SELF_LINK, networkEndpointGroup.getZone());
            assertEquals(NETWORK_ENDPOINT_GROUP_LINK, networkEndpointGroup.getSelfLink());
          }
        }
      }
    }
  }

  @Test
  public void listNetworkEndpointsNetworkEndpointGroupsTest() {
    NetworkEndpointGroupsListEndpointsRequest request =
        NetworkEndpointGroupsListEndpointsRequest.newBuilder().build();
    List<NetworkEndpointWithHealthStatus> healthStatuses =
        Lists.newArrayList(
            networkEndpointGroupClient
                .listNetworkEndpointsNetworkEndpointGroups(NETWORK_ENDPOINT_GROUP_NAME, request)
                .iterateAll());
    assertThat(healthStatuses).isNotNull();
  }

  @Test
  public void listNodeTypesTest() {
    List<NodeType> nodeTypes =
        Lists.newArrayList(nodeTypeClient.listNodeTypes(PROJECT_ZONE_NAME).iterateAll());
    assertThat(nodeTypes).isNotNull();
  }

  @Test
  public void aggregatedListNodeTypesTest() {
    List<NodeTypesScopedList> nodeTypesScopedLists =
        Lists.newArrayList(nodeTypeClient.aggregatedListNodeTypes(PROJECT_NAME).iterateAll());
    assertThat(nodeTypesScopedLists).isNotNull();
  }

  @Test
  public void listNodeTemplatesTest() {
    List<NodeTemplate> nodeTemplates =
        Lists.newArrayList(nodeTemplateClient.listNodeTemplates(PROJECT_REGION_NAME).iterateAll());
    assertThat(nodeTemplates).isNotNull();
  }

  @Test
  public void aggregatedListNodeTemplatesTest() {
    List<NodeTemplatesScopedList> nodeTemplatesScopedLists =
        Lists.newArrayList(
            nodeTemplateClient.aggregatedListNodeTemplates(PROJECT_NAME).iterateAll());
    assertThat(nodeTemplatesScopedLists).isNotNull();
  }

  @Test
  public void listNodeGroupsTest() {
    List<NodeGroup> nodeGroups =
        Lists.newArrayList(nodeGroupClient.listNodeGroups(PROJECT_ZONE_NAME).iterateAll());
    assertThat(nodeGroups).isNotNull();
  }

  @Test
  public void aggregatedListNodeGroupsTest() {
    List<NodeGroupsScopedList> nodeGroupsScopedLists =
        Lists.newArrayList(nodeGroupClient.aggregatedListNodeGroups(PROJECT_NAME).iterateAll());
    assertThat(nodeGroupsScopedLists).isNotNull();
  }

  @Test
  public void getProjectTest() {
    Project project = projectClient.getProject(PROJECT_NAME);
    assertThat(project).isNotNull();
    assertEquals(PROJECT_LINK, project.getSelfLink());
  }

  @Test
  public void listRegionAutoscalersTest() {
    List<Autoscaler> autoscalers =
        Lists.newArrayList(
            regionAutoscalerClient.listRegionAutoscalers(PROJECT_REGION_NAME).iterateAll());
    assertThat(autoscalers).isNotNull();
  }

  @Test
  public void listRegionBackendServicesTest() {
    List<BackendService> backendServices =
        Lists.newArrayList(
            regionBackendServiceClient.listRegionBackendServices(PROJECT_REGION_NAME).iterateAll());
    assertThat(backendServices).isNotNull();
  }

  @Test
  public void getRegionTest() {
    Region region = regionClient.getRegion(PROJECT_REGION_NAME);
    assertThat(region).isNotNull();
    assertEquals(REGION, region.getName());
    assertEquals(REGION_LINK, region.getSelfLink());
    assertEquals(STATUS, region.getStatus());
  }

  @Test
  public void listRegionsTest() {
    List<Region> regions = Lists.newArrayList(regionClient.listRegions(PROJECT_NAME).iterateAll());
    assertThat(regions).isNotNull();
    for (Region region : regions) {
      if (REGION.equals(region.getName())) {
        assertEquals(REGION, region.getName());
        assertEquals(REGION_LINK, region.getSelfLink());
        assertEquals(STATUS, region.getStatus());
      }
    }
  }

  @Test
  public void listRegionCommitmentsTest() {
    RegionCommitmentClient.ListRegionCommitmentsPagedResponse pagedListResponse =
        regionCommitmentClient.listRegionCommitments(PROJECT_REGION_NAME);
    List<Commitment> commitments = Lists.newArrayList(pagedListResponse.iterateAll());
    assertThat(commitments).isNotNull();
  }
}
