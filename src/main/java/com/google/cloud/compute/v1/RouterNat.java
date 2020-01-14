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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/**
 * Represents a Nat resource. It enables the VMs within the specified subnetworks to access Internet
 * without external IP addresses. It specifies a list of subnetworks (and the ranges within) that
 * want to use NAT. Customers can also provide the external IPs that would be used for NAT. GCP
 * would auto-allocate ephemeral IPs if no external IPs are provided.
 */
public final class RouterNat implements ApiMessage {
  private final List<String> drainNatIps;
  private final Integer icmpIdleTimeoutSec;
  private final RouterNatLogConfig logConfig;
  private final Integer minPortsPerVm;
  private final String name;
  private final String natIpAllocateOption;
  private final List<String> natIps;
  private final String sourceSubnetworkIpRangesToNat;
  private final List<RouterNatSubnetworkToNat> subnetworks;
  private final Integer tcpEstablishedIdleTimeoutSec;
  private final Integer tcpTransitoryIdleTimeoutSec;
  private final Integer udpIdleTimeoutSec;

  private RouterNat() {
    this.drainNatIps = null;
    this.icmpIdleTimeoutSec = null;
    this.logConfig = null;
    this.minPortsPerVm = null;
    this.name = null;
    this.natIpAllocateOption = null;
    this.natIps = null;
    this.sourceSubnetworkIpRangesToNat = null;
    this.subnetworks = null;
    this.tcpEstablishedIdleTimeoutSec = null;
    this.tcpTransitoryIdleTimeoutSec = null;
    this.udpIdleTimeoutSec = null;
  }

  private RouterNat(
      List<String> drainNatIps,
      Integer icmpIdleTimeoutSec,
      RouterNatLogConfig logConfig,
      Integer minPortsPerVm,
      String name,
      String natIpAllocateOption,
      List<String> natIps,
      String sourceSubnetworkIpRangesToNat,
      List<RouterNatSubnetworkToNat> subnetworks,
      Integer tcpEstablishedIdleTimeoutSec,
      Integer tcpTransitoryIdleTimeoutSec,
      Integer udpIdleTimeoutSec) {
    this.drainNatIps = drainNatIps;
    this.icmpIdleTimeoutSec = icmpIdleTimeoutSec;
    this.logConfig = logConfig;
    this.minPortsPerVm = minPortsPerVm;
    this.name = name;
    this.natIpAllocateOption = natIpAllocateOption;
    this.natIps = natIps;
    this.sourceSubnetworkIpRangesToNat = sourceSubnetworkIpRangesToNat;
    this.subnetworks = subnetworks;
    this.tcpEstablishedIdleTimeoutSec = tcpEstablishedIdleTimeoutSec;
    this.tcpTransitoryIdleTimeoutSec = tcpTransitoryIdleTimeoutSec;
    this.udpIdleTimeoutSec = udpIdleTimeoutSec;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("drainNatIps".equals(fieldName)) {
      return drainNatIps;
    }
    if ("icmpIdleTimeoutSec".equals(fieldName)) {
      return icmpIdleTimeoutSec;
    }
    if ("logConfig".equals(fieldName)) {
      return logConfig;
    }
    if ("minPortsPerVm".equals(fieldName)) {
      return minPortsPerVm;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("natIpAllocateOption".equals(fieldName)) {
      return natIpAllocateOption;
    }
    if ("natIps".equals(fieldName)) {
      return natIps;
    }
    if ("sourceSubnetworkIpRangesToNat".equals(fieldName)) {
      return sourceSubnetworkIpRangesToNat;
    }
    if ("subnetworks".equals(fieldName)) {
      return subnetworks;
    }
    if ("tcpEstablishedIdleTimeoutSec".equals(fieldName)) {
      return tcpEstablishedIdleTimeoutSec;
    }
    if ("tcpTransitoryIdleTimeoutSec".equals(fieldName)) {
      return tcpTransitoryIdleTimeoutSec;
    }
    if ("udpIdleTimeoutSec".equals(fieldName)) {
      return udpIdleTimeoutSec;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /**
   * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs
   * that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
   */
  public List<String> getDrainNatIpsList() {
    return drainNatIps;
  }

  /** Timeout (in seconds) for ICMP connections. Defaults to 30s if not set. */
  public Integer getIcmpIdleTimeoutSec() {
    return icmpIdleTimeoutSec;
  }

  /** Configure logging on this NAT. */
  public RouterNatLogConfig getLogConfig() {
    return logConfig;
  }

  /**
   * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of
   * ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the
   * value of this field is 50, at least 64 ports are allocated to a VM.
   */
  public Integer getMinPortsPerVm() {
    return minPortsPerVm;
  }

  /**
   * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
   */
  public String getName() {
    return name;
  }

  /**
   * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY:
   * Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs,
   * the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform;
   * customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
   */
  public String getNatIpAllocateOption() {
    return natIpAllocateOption;
  }

  /**
   * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid
   * static external IP addresses assigned to the project.
   */
  public List<String> getNatIpsList() {
    return natIps;
  }

  /**
   * Specify the Nat option, which can take one of the following values: -
   * ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. -
   * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are
   * allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in
   * the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note
   * that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or
   * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in
   * any Router for this network in this region.
   */
  public String getSourceSubnetworkIpRangesToNat() {
    return sourceSubnetworkIpRangesToNat;
  }

  /**
   * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
   * only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
   */
  public List<RouterNatSubnetworkToNat> getSubnetworksList() {
    return subnetworks;
  }

  /** Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set. */
  public Integer getTcpEstablishedIdleTimeoutSec() {
    return tcpEstablishedIdleTimeoutSec;
  }

  /** Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set. */
  public Integer getTcpTransitoryIdleTimeoutSec() {
    return tcpTransitoryIdleTimeoutSec;
  }

  /** Timeout (in seconds) for UDP connections. Defaults to 30s if not set. */
  public Integer getUdpIdleTimeoutSec() {
    return udpIdleTimeoutSec;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(RouterNat prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RouterNat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final RouterNat DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new RouterNat();
  }

  public static class Builder {
    private List<String> drainNatIps;
    private Integer icmpIdleTimeoutSec;
    private RouterNatLogConfig logConfig;
    private Integer minPortsPerVm;
    private String name;
    private String natIpAllocateOption;
    private List<String> natIps;
    private String sourceSubnetworkIpRangesToNat;
    private List<RouterNatSubnetworkToNat> subnetworks;
    private Integer tcpEstablishedIdleTimeoutSec;
    private Integer tcpTransitoryIdleTimeoutSec;
    private Integer udpIdleTimeoutSec;

    Builder() {}

    public Builder mergeFrom(RouterNat other) {
      if (other == RouterNat.getDefaultInstance()) return this;
      if (other.getDrainNatIpsList() != null) {
        this.drainNatIps = other.drainNatIps;
      }
      if (other.getIcmpIdleTimeoutSec() != null) {
        this.icmpIdleTimeoutSec = other.icmpIdleTimeoutSec;
      }
      if (other.getLogConfig() != null) {
        this.logConfig = other.logConfig;
      }
      if (other.getMinPortsPerVm() != null) {
        this.minPortsPerVm = other.minPortsPerVm;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getNatIpAllocateOption() != null) {
        this.natIpAllocateOption = other.natIpAllocateOption;
      }
      if (other.getNatIpsList() != null) {
        this.natIps = other.natIps;
      }
      if (other.getSourceSubnetworkIpRangesToNat() != null) {
        this.sourceSubnetworkIpRangesToNat = other.sourceSubnetworkIpRangesToNat;
      }
      if (other.getSubnetworksList() != null) {
        this.subnetworks = other.subnetworks;
      }
      if (other.getTcpEstablishedIdleTimeoutSec() != null) {
        this.tcpEstablishedIdleTimeoutSec = other.tcpEstablishedIdleTimeoutSec;
      }
      if (other.getTcpTransitoryIdleTimeoutSec() != null) {
        this.tcpTransitoryIdleTimeoutSec = other.tcpTransitoryIdleTimeoutSec;
      }
      if (other.getUdpIdleTimeoutSec() != null) {
        this.udpIdleTimeoutSec = other.udpIdleTimeoutSec;
      }
      return this;
    }

    Builder(RouterNat source) {
      this.drainNatIps = source.drainNatIps;
      this.icmpIdleTimeoutSec = source.icmpIdleTimeoutSec;
      this.logConfig = source.logConfig;
      this.minPortsPerVm = source.minPortsPerVm;
      this.name = source.name;
      this.natIpAllocateOption = source.natIpAllocateOption;
      this.natIps = source.natIps;
      this.sourceSubnetworkIpRangesToNat = source.sourceSubnetworkIpRangesToNat;
      this.subnetworks = source.subnetworks;
      this.tcpEstablishedIdleTimeoutSec = source.tcpEstablishedIdleTimeoutSec;
      this.tcpTransitoryIdleTimeoutSec = source.tcpTransitoryIdleTimeoutSec;
      this.udpIdleTimeoutSec = source.udpIdleTimeoutSec;
    }

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs
     * that have been assigned to the NAT. These IPs should be used for updating/patching a NAT
     * only.
     */
    public List<String> getDrainNatIpsList() {
      return drainNatIps;
    }

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs
     * that have been assigned to the NAT. These IPs should be used for updating/patching a NAT
     * only.
     */
    public Builder addAllDrainNatIps(List<String> drainNatIps) {
      if (this.drainNatIps == null) {
        this.drainNatIps = new LinkedList<>();
      }
      this.drainNatIps.addAll(drainNatIps);
      return this;
    }

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs
     * that have been assigned to the NAT. These IPs should be used for updating/patching a NAT
     * only.
     */
    public Builder addDrainNatIps(String drainNatIps) {
      if (this.drainNatIps == null) {
        this.drainNatIps = new LinkedList<>();
      }
      this.drainNatIps.add(drainNatIps);
      return this;
    }

    /** Timeout (in seconds) for ICMP connections. Defaults to 30s if not set. */
    public Integer getIcmpIdleTimeoutSec() {
      return icmpIdleTimeoutSec;
    }

    /** Timeout (in seconds) for ICMP connections. Defaults to 30s if not set. */
    public Builder setIcmpIdleTimeoutSec(Integer icmpIdleTimeoutSec) {
      this.icmpIdleTimeoutSec = icmpIdleTimeoutSec;
      return this;
    }

    /** Configure logging on this NAT. */
    public RouterNatLogConfig getLogConfig() {
      return logConfig;
    }

    /** Configure logging on this NAT. */
    public Builder setLogConfig(RouterNatLogConfig logConfig) {
      this.logConfig = logConfig;
      return this;
    }

    /**
     * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number
     * of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if
     * the value of this field is 50, at least 64 ports are allocated to a VM.
     */
    public Integer getMinPortsPerVm() {
      return minPortsPerVm;
    }

    /**
     * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number
     * of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if
     * the value of this field is 50, at least 64 ports are allocated to a VM.
     */
    public Builder setMinPortsPerVm(Integer minPortsPerVm) {
      this.minPortsPerVm = minPortsPerVm;
      return this;
    }

    /**
     * Unique name of this Nat service. The name must be 1-63 characters long and comply with
     * RFC1035.
     */
    public String getName() {
      return name;
    }

    /**
     * Unique name of this Nat service. The name must be 1-63 characters long and comply with
     * RFC1035.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY:
     * Uses only Nat IP addresses provided by customers. When there are not enough specified Nat
     * IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud
     * Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be
     * empty.
     */
    public String getNatIpAllocateOption() {
      return natIpAllocateOption;
    }

    /**
     * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY:
     * Uses only Nat IP addresses provided by customers. When there are not enough specified Nat
     * IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud
     * Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be
     * empty.
     */
    public Builder setNatIpAllocateOption(String natIpAllocateOption) {
      this.natIpAllocateOption = natIpAllocateOption;
      return this;
    }

    /**
     * A list of URLs of the IP resources used for this Nat service. These IP addresses must be
     * valid static external IP addresses assigned to the project.
     */
    public List<String> getNatIpsList() {
      return natIps;
    }

    /**
     * A list of URLs of the IP resources used for this Nat service. These IP addresses must be
     * valid static external IP addresses assigned to the project.
     */
    public Builder addAllNatIps(List<String> natIps) {
      if (this.natIps == null) {
        this.natIps = new LinkedList<>();
      }
      this.natIps.addAll(natIps);
      return this;
    }

    /**
     * A list of URLs of the IP resources used for this Nat service. These IP addresses must be
     * valid static external IP addresses assigned to the project.
     */
    public Builder addNatIps(String natIps) {
      if (this.natIps == null) {
        this.natIps = new LinkedList<>();
      }
      this.natIps.add(natIps);
      return this;
    }

    /**
     * Specify the Nat option, which can take one of the following values: -
     * ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. -
     * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are
     * allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in
     * the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED.
     * Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or
     * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section
     * in any Router for this network in this region.
     */
    public String getSourceSubnetworkIpRangesToNat() {
      return sourceSubnetworkIpRangesToNat;
    }

    /**
     * Specify the Nat option, which can take one of the following values: -
     * ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. -
     * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are
     * allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in
     * the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED.
     * Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or
     * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section
     * in any Router for this network in this region.
     */
    public Builder setSourceSubnetworkIpRangesToNat(String sourceSubnetworkIpRangesToNat) {
      this.sourceSubnetworkIpRangesToNat = sourceSubnetworkIpRangesToNat;
      return this;
    }

    /**
     * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
     * only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
     */
    public List<RouterNatSubnetworkToNat> getSubnetworksList() {
      return subnetworks;
    }

    /**
     * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
     * only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
     */
    public Builder addAllSubnetworks(List<RouterNatSubnetworkToNat> subnetworks) {
      if (this.subnetworks == null) {
        this.subnetworks = new LinkedList<>();
      }
      this.subnetworks.addAll(subnetworks);
      return this;
    }

    /**
     * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used
     * only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
     */
    public Builder addSubnetworks(RouterNatSubnetworkToNat subnetworks) {
      if (this.subnetworks == null) {
        this.subnetworks = new LinkedList<>();
      }
      this.subnetworks.add(subnetworks);
      return this;
    }

    /** Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set. */
    public Integer getTcpEstablishedIdleTimeoutSec() {
      return tcpEstablishedIdleTimeoutSec;
    }

    /** Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set. */
    public Builder setTcpEstablishedIdleTimeoutSec(Integer tcpEstablishedIdleTimeoutSec) {
      this.tcpEstablishedIdleTimeoutSec = tcpEstablishedIdleTimeoutSec;
      return this;
    }

    /** Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set. */
    public Integer getTcpTransitoryIdleTimeoutSec() {
      return tcpTransitoryIdleTimeoutSec;
    }

    /** Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set. */
    public Builder setTcpTransitoryIdleTimeoutSec(Integer tcpTransitoryIdleTimeoutSec) {
      this.tcpTransitoryIdleTimeoutSec = tcpTransitoryIdleTimeoutSec;
      return this;
    }

    /** Timeout (in seconds) for UDP connections. Defaults to 30s if not set. */
    public Integer getUdpIdleTimeoutSec() {
      return udpIdleTimeoutSec;
    }

    /** Timeout (in seconds) for UDP connections. Defaults to 30s if not set. */
    public Builder setUdpIdleTimeoutSec(Integer udpIdleTimeoutSec) {
      this.udpIdleTimeoutSec = udpIdleTimeoutSec;
      return this;
    }

    public RouterNat build() {

      return new RouterNat(
          drainNatIps,
          icmpIdleTimeoutSec,
          logConfig,
          minPortsPerVm,
          name,
          natIpAllocateOption,
          natIps,
          sourceSubnetworkIpRangesToNat,
          subnetworks,
          tcpEstablishedIdleTimeoutSec,
          tcpTransitoryIdleTimeoutSec,
          udpIdleTimeoutSec);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllDrainNatIps(this.drainNatIps);
      newBuilder.setIcmpIdleTimeoutSec(this.icmpIdleTimeoutSec);
      newBuilder.setLogConfig(this.logConfig);
      newBuilder.setMinPortsPerVm(this.minPortsPerVm);
      newBuilder.setName(this.name);
      newBuilder.setNatIpAllocateOption(this.natIpAllocateOption);
      newBuilder.addAllNatIps(this.natIps);
      newBuilder.setSourceSubnetworkIpRangesToNat(this.sourceSubnetworkIpRangesToNat);
      newBuilder.addAllSubnetworks(this.subnetworks);
      newBuilder.setTcpEstablishedIdleTimeoutSec(this.tcpEstablishedIdleTimeoutSec);
      newBuilder.setTcpTransitoryIdleTimeoutSec(this.tcpTransitoryIdleTimeoutSec);
      newBuilder.setUdpIdleTimeoutSec(this.udpIdleTimeoutSec);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RouterNat{"
        + "drainNatIps="
        + drainNatIps
        + ", "
        + "icmpIdleTimeoutSec="
        + icmpIdleTimeoutSec
        + ", "
        + "logConfig="
        + logConfig
        + ", "
        + "minPortsPerVm="
        + minPortsPerVm
        + ", "
        + "name="
        + name
        + ", "
        + "natIpAllocateOption="
        + natIpAllocateOption
        + ", "
        + "natIps="
        + natIps
        + ", "
        + "sourceSubnetworkIpRangesToNat="
        + sourceSubnetworkIpRangesToNat
        + ", "
        + "subnetworks="
        + subnetworks
        + ", "
        + "tcpEstablishedIdleTimeoutSec="
        + tcpEstablishedIdleTimeoutSec
        + ", "
        + "tcpTransitoryIdleTimeoutSec="
        + tcpTransitoryIdleTimeoutSec
        + ", "
        + "udpIdleTimeoutSec="
        + udpIdleTimeoutSec
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RouterNat) {
      RouterNat that = (RouterNat) o;
      return Objects.equals(this.drainNatIps, that.getDrainNatIpsList())
          && Objects.equals(this.icmpIdleTimeoutSec, that.getIcmpIdleTimeoutSec())
          && Objects.equals(this.logConfig, that.getLogConfig())
          && Objects.equals(this.minPortsPerVm, that.getMinPortsPerVm())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.natIpAllocateOption, that.getNatIpAllocateOption())
          && Objects.equals(this.natIps, that.getNatIpsList())
          && Objects.equals(
              this.sourceSubnetworkIpRangesToNat, that.getSourceSubnetworkIpRangesToNat())
          && Objects.equals(this.subnetworks, that.getSubnetworksList())
          && Objects.equals(
              this.tcpEstablishedIdleTimeoutSec, that.getTcpEstablishedIdleTimeoutSec())
          && Objects.equals(this.tcpTransitoryIdleTimeoutSec, that.getTcpTransitoryIdleTimeoutSec())
          && Objects.equals(this.udpIdleTimeoutSec, that.getUdpIdleTimeoutSec());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        drainNatIps,
        icmpIdleTimeoutSec,
        logConfig,
        minPortsPerVm,
        name,
        natIpAllocateOption,
        natIps,
        sourceSubnetworkIpRangesToNat,
        subnetworks,
        tcpEstablishedIdleTimeoutSec,
        tcpTransitoryIdleTimeoutSec,
        udpIdleTimeoutSec);
  }
}
