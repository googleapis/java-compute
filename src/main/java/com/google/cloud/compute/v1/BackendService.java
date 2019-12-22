/*
 * Copyright 2019 Google LLC
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
 * Represents a Backend Service resource.
 *
 * <p>A backend service contains configuration values for Google Cloud Platform load balancing
 * services.
 *
 * <p>For more information, read Backend Services.
 *
 * <p>(== resource_for v1.backendService ==) (== resource_for beta.backendService ==)
 */
public final class BackendService implements ApiMessage {
  private final Integer affinityCookieTtlSec;
  private final List<Backend> backends;
  private final BackendServiceCdnPolicy cdnPolicy;
  private final CircuitBreakers circuitBreakers;
  private final ConnectionDraining connectionDraining;
  private final ConsistentHashLoadBalancerSettings consistentHash;
  private final String creationTimestamp;
  private final List<String> customRequestHeaders;
  private final String description;
  private final Boolean enableCDN;
  private final String fingerprint;
  private final List<String> healthChecks;
  private final BackendServiceIAP iap;
  private final String id;
  private final String kind;
  private final String loadBalancingScheme;
  private final String localityLbPolicy;
  private final String name;
  private final OutlierDetection outlierDetection;
  private final Integer port;
  private final String portName;
  private final String protocol;
  private final String region;
  private final String securityPolicy;
  private final String selfLink;
  private final String sessionAffinity;
  private final Integer timeoutSec;

  private BackendService() {
    this.affinityCookieTtlSec = null;
    this.backends = null;
    this.cdnPolicy = null;
    this.circuitBreakers = null;
    this.connectionDraining = null;
    this.consistentHash = null;
    this.creationTimestamp = null;
    this.customRequestHeaders = null;
    this.description = null;
    this.enableCDN = null;
    this.fingerprint = null;
    this.healthChecks = null;
    this.iap = null;
    this.id = null;
    this.kind = null;
    this.loadBalancingScheme = null;
    this.localityLbPolicy = null;
    this.name = null;
    this.outlierDetection = null;
    this.port = null;
    this.portName = null;
    this.protocol = null;
    this.region = null;
    this.securityPolicy = null;
    this.selfLink = null;
    this.sessionAffinity = null;
    this.timeoutSec = null;
  }

  private BackendService(
      Integer affinityCookieTtlSec,
      List<Backend> backends,
      BackendServiceCdnPolicy cdnPolicy,
      CircuitBreakers circuitBreakers,
      ConnectionDraining connectionDraining,
      ConsistentHashLoadBalancerSettings consistentHash,
      String creationTimestamp,
      List<String> customRequestHeaders,
      String description,
      Boolean enableCDN,
      String fingerprint,
      List<String> healthChecks,
      BackendServiceIAP iap,
      String id,
      String kind,
      String loadBalancingScheme,
      String localityLbPolicy,
      String name,
      OutlierDetection outlierDetection,
      Integer port,
      String portName,
      String protocol,
      String region,
      String securityPolicy,
      String selfLink,
      String sessionAffinity,
      Integer timeoutSec) {
    this.affinityCookieTtlSec = affinityCookieTtlSec;
    this.backends = backends;
    this.cdnPolicy = cdnPolicy;
    this.circuitBreakers = circuitBreakers;
    this.connectionDraining = connectionDraining;
    this.consistentHash = consistentHash;
    this.creationTimestamp = creationTimestamp;
    this.customRequestHeaders = customRequestHeaders;
    this.description = description;
    this.enableCDN = enableCDN;
    this.fingerprint = fingerprint;
    this.healthChecks = healthChecks;
    this.iap = iap;
    this.id = id;
    this.kind = kind;
    this.loadBalancingScheme = loadBalancingScheme;
    this.localityLbPolicy = localityLbPolicy;
    this.name = name;
    this.outlierDetection = outlierDetection;
    this.port = port;
    this.portName = portName;
    this.protocol = protocol;
    this.region = region;
    this.securityPolicy = securityPolicy;
    this.selfLink = selfLink;
    this.sessionAffinity = sessionAffinity;
    this.timeoutSec = timeoutSec;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("affinityCookieTtlSec".equals(fieldName)) {
      return affinityCookieTtlSec;
    }
    if ("backends".equals(fieldName)) {
      return backends;
    }
    if ("cdnPolicy".equals(fieldName)) {
      return cdnPolicy;
    }
    if ("circuitBreakers".equals(fieldName)) {
      return circuitBreakers;
    }
    if ("connectionDraining".equals(fieldName)) {
      return connectionDraining;
    }
    if ("consistentHash".equals(fieldName)) {
      return consistentHash;
    }
    if ("creationTimestamp".equals(fieldName)) {
      return creationTimestamp;
    }
    if ("customRequestHeaders".equals(fieldName)) {
      return customRequestHeaders;
    }
    if ("description".equals(fieldName)) {
      return description;
    }
    if ("enableCDN".equals(fieldName)) {
      return enableCDN;
    }
    if ("fingerprint".equals(fieldName)) {
      return fingerprint;
    }
    if ("healthChecks".equals(fieldName)) {
      return healthChecks;
    }
    if ("iap".equals(fieldName)) {
      return iap;
    }
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("loadBalancingScheme".equals(fieldName)) {
      return loadBalancingScheme;
    }
    if ("localityLbPolicy".equals(fieldName)) {
      return localityLbPolicy;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("outlierDetection".equals(fieldName)) {
      return outlierDetection;
    }
    if ("port".equals(fieldName)) {
      return port;
    }
    if ("portName".equals(fieldName)) {
      return portName;
    }
    if ("protocol".equals(fieldName)) {
      return protocol;
    }
    if ("region".equals(fieldName)) {
      return region;
    }
    if ("securityPolicy".equals(fieldName)) {
      return securityPolicy;
    }
    if ("selfLink".equals(fieldName)) {
      return selfLink;
    }
    if ("sessionAffinity".equals(fieldName)) {
      return sessionAffinity;
    }
    if ("timeoutSec".equals(fieldName)) {
      return timeoutSec;
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
   * If set to 0, the cookie is non-persistent and lasts only until the end of the browser session
   * (or equivalent). The maximum allowed value is one day (86,400).
   */
  public Integer getAffinityCookieTtlSec() {
    return affinityCookieTtlSec;
  }

  /** The list of backends that serve this BackendService. */
  public List<Backend> getBackendsList() {
    return backends;
  }

  /** Cloud CDN configuration for this BackendService. */
  public BackendServiceCdnPolicy getCdnPolicy() {
    return cdnPolicy;
  }

  /**
   * Settings controlling the volume of connections to a backend service. If not set, this feature
   * is considered disabled.
   *
   * <p>This field is applicable to either: - A regional backend service with the service_protocol
   * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
   * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
   */
  public CircuitBreakers getCircuitBreakers() {
    return circuitBreakers;
  }

  public ConnectionDraining getConnectionDraining() {
    return connectionDraining;
  }

  /**
   * Consistent Hash-based load balancing can be used to provide soft session affinity based on HTTP
   * headers, cookies or other properties. This load balancing policy is applicable only for HTTP
   * connections. The affinity to a particular destination host will be lost when one or more hosts
   * are added/removed from the destination service. This field specifies parameters that control
   * consistent hashing. This field is only applicable when localityLbPolicy is set to MAGLEV or
   * RING_HASH.
   *
   * <p>This field is applicable to either: - A regional backend service with the service_protocol
   * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
   * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
   */
  public ConsistentHashLoadBalancerSettings getConsistentHash() {
    return consistentHash;
  }

  /** [Output Only] Creation timestamp in RFC3339 text format. */
  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  /** Headers that the HTTP/S load balancer should add to proxied requests. */
  public List<String> getCustomRequestHeadersList() {
    return customRequestHeaders;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   */
  public String getDescription() {
    return description;
  }

  /**
   * If true, enables Cloud CDN for the backend service. Only applicable if the loadBalancingScheme
   * is EXTERNAL and the protocol is HTTP or HTTPS.
   */
  public Boolean getEnableCDN() {
    return enableCDN;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a BackendService. An
   * up-to-date fingerprint must be provided in order to update the BackendService, otherwise the
   * request will fail with error 412 conditionNotMet.
   *
   * <p>To see the latest fingerprint, make a get() request to retrieve a BackendService.
   */
  public String getFingerprint() {
    return fingerprint;
  }

  /**
   * The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for health checking this
   * BackendService. Currently at most one health check can be specified, and a health check is
   * required for Compute Engine backend services. A health check must not be specified for App
   * Engine backend and Cloud Function backend.
   *
   * <p>For internal load balancing, a URL to a HealthCheck resource must be specified instead.
   */
  public List<String> getHealthChecksList() {
    return healthChecks;
  }

  public BackendServiceIAP getIap() {
    return iap;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   */
  public String getId() {
    return id;
  }

  /** [Output Only] Type of resource. Always compute#backendService for backend services. */
  public String getKind() {
    return kind;
  }

  /**
   * Specifies the load balancer type. Choose EXTERNAL for load balancers that receive traffic from
   * external clients. Choose INTERNAL for Internal TCP/UDP Load Balancing. Choose INTERNAL_MANAGED
   * for Internal HTTP(S) Load Balancing. Choose INTERNAL_SELF_MANAGED for Traffic Director. A
   * backend service created for one type of load balancing cannot be used with another. For more
   * information, refer to Choosing a load balancer.
   */
  public String getLoadBalancingScheme() {
    return loadBalancingScheme;
  }

  /**
   * The load balancing algorithm used within the scope of the locality. The possible values are: -
   * ROUND_ROBIN: This is a simple policy in which each healthy backend is selected in round robin
   * order. This is the default. - LEAST_REQUEST: An O(1) algorithm which selects two random healthy
   * hosts and picks the host which has fewer active requests. - RING_HASH: The ring/modulo hash
   * load balancer implements consistent hashing to backends. The algorithm has the property that
   * the addition/removal of a host from a set of N hosts only affects 1/N of the requests. -
   * RANDOM: The load balancer selects a random healthy host. - ORIGINAL_DESTINATION: Backend host
   * is selected based on the client connection metadata, i.e., connections are opened to the same
   * address as the destination address of the incoming connection before the connection was
   * redirected to the load balancer. - MAGLEV: used as a drop in replacement for the ring hash load
   * balancer. Maglev is not as stable as ring hash but has faster table lookup build times and host
   * selection times. For more information about Maglev, refer to
   * https://ai.google/research/pubs/pub44824
   *
   * <p>This field is applicable to either: - A regional backend service with the service_protocol
   * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
   * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
   *
   * <p>If sessionAffinity is not NONE, and this field is not set to &gt;MAGLEV or RING_HASH,
   * session affinity settings will not take effect.
   */
  public String getLocalityLbPolicy() {
    return localityLbPolicy;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   */
  public String getName() {
    return name;
  }

  /**
   * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the
   * backend service. If not set, this feature is considered disabled.
   *
   * <p>This field is applicable to either: - A regional backend service with the service_protocol
   * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
   * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
   */
  public OutlierDetection getOutlierDetection() {
    return outlierDetection;
  }

  /**
   * Deprecated in favor of portName. The TCP port to connect on the backend. The default value is
   * 80.
   *
   * <p>This cannot be used if the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load
   * Balancing).
   */
  public Integer getPort() {
    return port;
  }

  /**
   * A named port on a backend instance group representing the port for communication to the backend
   * VMs in that group. Required when the loadBalancingScheme is EXTERNAL and the backends are
   * instance groups. The named port must be defined on each backend instance group. This parameter
   * has no meaning if the backends are NEGs.
   *
   * <p>Must be omitted when the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load Blaancing).
   */
  public String getPortName() {
    return portName;
  }

  /**
   * The protocol this BackendService uses to communicate with backends.
   *
   * <p>Possible values are HTTP, HTTPS, HTTP2, TCP, SSL, or UDP, depending on the chosen load
   * balancer or Traffic Director configuration. Refer to the documentation for the load balancer or
   * for Traffic Director for more information.
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * [Output Only] URL of the region where the regional backend service resides. This field is not
   * applicable to global backend services. You must specify this field as part of the HTTP request
   * URL. It is not settable as a field in the request body.
   */
  public String getRegion() {
    return region;
  }

  /**
   * [Output Only] The resource URL for the security policy associated with this backend service.
   */
  public String getSecurityPolicy() {
    return securityPolicy;
  }

  /** [Output Only] Server-defined URL for the resource. */
  public String getSelfLink() {
    return selfLink;
  }

  /**
   * Type of session affinity to use. The default is NONE. Session affinity is not applicable if the
   * --protocol is UDP.
   *
   * <p>When the loadBalancingScheme is EXTERNAL, possible values are NONE, CLIENT_IP, or
   * GENERATED_COOKIE. You can use GENERATED_COOKIE if the protocol is HTTP or HTTPS.
   *
   * <p>When the loadBalancingScheme is INTERNAL, possible values are NONE, CLIENT_IP,
   * CLIENT_IP_PROTO, or CLIENT_IP_PORT_PROTO.
   *
   * <p>When the loadBalancingScheme is INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED, possible values
   * are NONE, CLIENT_IP, GENERATED_COOKIE, HEADER_FIELD, or HTTP_COOKIE.
   */
  public String getSessionAffinity() {
    return sessionAffinity;
  }

  /**
   * The backend service timeout has a different meaning depending on the type of load balancer. For
   * more information read, Backend service settings The default is 30 seconds.
   */
  public Integer getTimeoutSec() {
    return timeoutSec;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(BackendService prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static BackendService getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final BackendService DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new BackendService();
  }

  public static class Builder {
    private Integer affinityCookieTtlSec;
    private List<Backend> backends;
    private BackendServiceCdnPolicy cdnPolicy;
    private CircuitBreakers circuitBreakers;
    private ConnectionDraining connectionDraining;
    private ConsistentHashLoadBalancerSettings consistentHash;
    private String creationTimestamp;
    private List<String> customRequestHeaders;
    private String description;
    private Boolean enableCDN;
    private String fingerprint;
    private List<String> healthChecks;
    private BackendServiceIAP iap;
    private String id;
    private String kind;
    private String loadBalancingScheme;
    private String localityLbPolicy;
    private String name;
    private OutlierDetection outlierDetection;
    private Integer port;
    private String portName;
    private String protocol;
    private String region;
    private String securityPolicy;
    private String selfLink;
    private String sessionAffinity;
    private Integer timeoutSec;

    Builder() {}

    public Builder mergeFrom(BackendService other) {
      if (other == BackendService.getDefaultInstance()) return this;
      if (other.getAffinityCookieTtlSec() != null) {
        this.affinityCookieTtlSec = other.affinityCookieTtlSec;
      }
      if (other.getBackendsList() != null) {
        this.backends = other.backends;
      }
      if (other.getCdnPolicy() != null) {
        this.cdnPolicy = other.cdnPolicy;
      }
      if (other.getCircuitBreakers() != null) {
        this.circuitBreakers = other.circuitBreakers;
      }
      if (other.getConnectionDraining() != null) {
        this.connectionDraining = other.connectionDraining;
      }
      if (other.getConsistentHash() != null) {
        this.consistentHash = other.consistentHash;
      }
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getCustomRequestHeadersList() != null) {
        this.customRequestHeaders = other.customRequestHeaders;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getEnableCDN() != null) {
        this.enableCDN = other.enableCDN;
      }
      if (other.getFingerprint() != null) {
        this.fingerprint = other.fingerprint;
      }
      if (other.getHealthChecksList() != null) {
        this.healthChecks = other.healthChecks;
      }
      if (other.getIap() != null) {
        this.iap = other.iap;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getLoadBalancingScheme() != null) {
        this.loadBalancingScheme = other.loadBalancingScheme;
      }
      if (other.getLocalityLbPolicy() != null) {
        this.localityLbPolicy = other.localityLbPolicy;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getOutlierDetection() != null) {
        this.outlierDetection = other.outlierDetection;
      }
      if (other.getPort() != null) {
        this.port = other.port;
      }
      if (other.getPortName() != null) {
        this.portName = other.portName;
      }
      if (other.getProtocol() != null) {
        this.protocol = other.protocol;
      }
      if (other.getRegion() != null) {
        this.region = other.region;
      }
      if (other.getSecurityPolicy() != null) {
        this.securityPolicy = other.securityPolicy;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getSessionAffinity() != null) {
        this.sessionAffinity = other.sessionAffinity;
      }
      if (other.getTimeoutSec() != null) {
        this.timeoutSec = other.timeoutSec;
      }
      return this;
    }

    Builder(BackendService source) {
      this.affinityCookieTtlSec = source.affinityCookieTtlSec;
      this.backends = source.backends;
      this.cdnPolicy = source.cdnPolicy;
      this.circuitBreakers = source.circuitBreakers;
      this.connectionDraining = source.connectionDraining;
      this.consistentHash = source.consistentHash;
      this.creationTimestamp = source.creationTimestamp;
      this.customRequestHeaders = source.customRequestHeaders;
      this.description = source.description;
      this.enableCDN = source.enableCDN;
      this.fingerprint = source.fingerprint;
      this.healthChecks = source.healthChecks;
      this.iap = source.iap;
      this.id = source.id;
      this.kind = source.kind;
      this.loadBalancingScheme = source.loadBalancingScheme;
      this.localityLbPolicy = source.localityLbPolicy;
      this.name = source.name;
      this.outlierDetection = source.outlierDetection;
      this.port = source.port;
      this.portName = source.portName;
      this.protocol = source.protocol;
      this.region = source.region;
      this.securityPolicy = source.securityPolicy;
      this.selfLink = source.selfLink;
      this.sessionAffinity = source.sessionAffinity;
      this.timeoutSec = source.timeoutSec;
    }

    /**
     * If set to 0, the cookie is non-persistent and lasts only until the end of the browser session
     * (or equivalent). The maximum allowed value is one day (86,400).
     */
    public Integer getAffinityCookieTtlSec() {
      return affinityCookieTtlSec;
    }

    /**
     * If set to 0, the cookie is non-persistent and lasts only until the end of the browser session
     * (or equivalent). The maximum allowed value is one day (86,400).
     */
    public Builder setAffinityCookieTtlSec(Integer affinityCookieTtlSec) {
      this.affinityCookieTtlSec = affinityCookieTtlSec;
      return this;
    }

    /** The list of backends that serve this BackendService. */
    public List<Backend> getBackendsList() {
      return backends;
    }

    /** The list of backends that serve this BackendService. */
    public Builder addAllBackends(List<Backend> backends) {
      if (this.backends == null) {
        this.backends = new LinkedList<>();
      }
      this.backends.addAll(backends);
      return this;
    }

    /** The list of backends that serve this BackendService. */
    public Builder addBackends(Backend backends) {
      if (this.backends == null) {
        this.backends = new LinkedList<>();
      }
      this.backends.add(backends);
      return this;
    }

    /** Cloud CDN configuration for this BackendService. */
    public BackendServiceCdnPolicy getCdnPolicy() {
      return cdnPolicy;
    }

    /** Cloud CDN configuration for this BackendService. */
    public Builder setCdnPolicy(BackendServiceCdnPolicy cdnPolicy) {
      this.cdnPolicy = cdnPolicy;
      return this;
    }

    /**
     * Settings controlling the volume of connections to a backend service. If not set, this feature
     * is considered disabled.
     *
     * <p>This field is applicable to either: - A regional backend service with the service_protocol
     * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
     * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     */
    public CircuitBreakers getCircuitBreakers() {
      return circuitBreakers;
    }

    /**
     * Settings controlling the volume of connections to a backend service. If not set, this feature
     * is considered disabled.
     *
     * <p>This field is applicable to either: - A regional backend service with the service_protocol
     * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
     * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     */
    public Builder setCircuitBreakers(CircuitBreakers circuitBreakers) {
      this.circuitBreakers = circuitBreakers;
      return this;
    }

    public ConnectionDraining getConnectionDraining() {
      return connectionDraining;
    }

    public Builder setConnectionDraining(ConnectionDraining connectionDraining) {
      this.connectionDraining = connectionDraining;
      return this;
    }

    /**
     * Consistent Hash-based load balancing can be used to provide soft session affinity based on
     * HTTP headers, cookies or other properties. This load balancing policy is applicable only for
     * HTTP connections. The affinity to a particular destination host will be lost when one or more
     * hosts are added/removed from the destination service. This field specifies parameters that
     * control consistent hashing. This field is only applicable when localityLbPolicy is set to
     * MAGLEV or RING_HASH.
     *
     * <p>This field is applicable to either: - A regional backend service with the service_protocol
     * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
     * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     */
    public ConsistentHashLoadBalancerSettings getConsistentHash() {
      return consistentHash;
    }

    /**
     * Consistent Hash-based load balancing can be used to provide soft session affinity based on
     * HTTP headers, cookies or other properties. This load balancing policy is applicable only for
     * HTTP connections. The affinity to a particular destination host will be lost when one or more
     * hosts are added/removed from the destination service. This field specifies parameters that
     * control consistent hashing. This field is only applicable when localityLbPolicy is set to
     * MAGLEV or RING_HASH.
     *
     * <p>This field is applicable to either: - A regional backend service with the service_protocol
     * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
     * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     */
    public Builder setConsistentHash(ConsistentHashLoadBalancerSettings consistentHash) {
      this.consistentHash = consistentHash;
      return this;
    }

    /** [Output Only] Creation timestamp in RFC3339 text format. */
    public String getCreationTimestamp() {
      return creationTimestamp;
    }

    /** [Output Only] Creation timestamp in RFC3339 text format. */
    public Builder setCreationTimestamp(String creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    /** Headers that the HTTP/S load balancer should add to proxied requests. */
    public List<String> getCustomRequestHeadersList() {
      return customRequestHeaders;
    }

    /** Headers that the HTTP/S load balancer should add to proxied requests. */
    public Builder addAllCustomRequestHeaders(List<String> customRequestHeaders) {
      if (this.customRequestHeaders == null) {
        this.customRequestHeaders = new LinkedList<>();
      }
      this.customRequestHeaders.addAll(customRequestHeaders);
      return this;
    }

    /** Headers that the HTTP/S load balancer should add to proxied requests. */
    public Builder addCustomRequestHeaders(String customRequestHeaders) {
      if (this.customRequestHeaders == null) {
        this.customRequestHeaders = new LinkedList<>();
      }
      this.customRequestHeaders.add(customRequestHeaders);
      return this;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     */
    public String getDescription() {
      return description;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * If true, enables Cloud CDN for the backend service. Only applicable if the
     * loadBalancingScheme is EXTERNAL and the protocol is HTTP or HTTPS.
     */
    public Boolean getEnableCDN() {
      return enableCDN;
    }

    /**
     * If true, enables Cloud CDN for the backend service. Only applicable if the
     * loadBalancingScheme is EXTERNAL and the protocol is HTTP or HTTPS.
     */
    public Builder setEnableCDN(Boolean enableCDN) {
      this.enableCDN = enableCDN;
      return this;
    }

    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is
     * used in optimistic locking. This field will be ignored when inserting a BackendService. An
     * up-to-date fingerprint must be provided in order to update the BackendService, otherwise the
     * request will fail with error 412 conditionNotMet.
     *
     * <p>To see the latest fingerprint, make a get() request to retrieve a BackendService.
     */
    public String getFingerprint() {
      return fingerprint;
    }

    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is
     * used in optimistic locking. This field will be ignored when inserting a BackendService. An
     * up-to-date fingerprint must be provided in order to update the BackendService, otherwise the
     * request will fail with error 412 conditionNotMet.
     *
     * <p>To see the latest fingerprint, make a get() request to retrieve a BackendService.
     */
    public Builder setFingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
      return this;
    }

    /**
     * The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for health checking this
     * BackendService. Currently at most one health check can be specified, and a health check is
     * required for Compute Engine backend services. A health check must not be specified for App
     * Engine backend and Cloud Function backend.
     *
     * <p>For internal load balancing, a URL to a HealthCheck resource must be specified instead.
     */
    public List<String> getHealthChecksList() {
      return healthChecks;
    }

    /**
     * The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for health checking this
     * BackendService. Currently at most one health check can be specified, and a health check is
     * required for Compute Engine backend services. A health check must not be specified for App
     * Engine backend and Cloud Function backend.
     *
     * <p>For internal load balancing, a URL to a HealthCheck resource must be specified instead.
     */
    public Builder addAllHealthChecks(List<String> healthChecks) {
      if (this.healthChecks == null) {
        this.healthChecks = new LinkedList<>();
      }
      this.healthChecks.addAll(healthChecks);
      return this;
    }

    /**
     * The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for health checking this
     * BackendService. Currently at most one health check can be specified, and a health check is
     * required for Compute Engine backend services. A health check must not be specified for App
     * Engine backend and Cloud Function backend.
     *
     * <p>For internal load balancing, a URL to a HealthCheck resource must be specified instead.
     */
    public Builder addHealthChecks(String healthChecks) {
      if (this.healthChecks == null) {
        this.healthChecks = new LinkedList<>();
      }
      this.healthChecks.add(healthChecks);
      return this;
    }

    public BackendServiceIAP getIap() {
      return iap;
    }

    public Builder setIap(BackendServiceIAP iap) {
      this.iap = iap;
      return this;
    }

    /**
     * [Output Only] The unique identifier for the resource. This identifier is defined by the
     * server.
     */
    public String getId() {
      return id;
    }

    /**
     * [Output Only] The unique identifier for the resource. This identifier is defined by the
     * server.
     */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /** [Output Only] Type of resource. Always compute#backendService for backend services. */
    public String getKind() {
      return kind;
    }

    /** [Output Only] Type of resource. Always compute#backendService for backend services. */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Specifies the load balancer type. Choose EXTERNAL for load balancers that receive traffic
     * from external clients. Choose INTERNAL for Internal TCP/UDP Load Balancing. Choose
     * INTERNAL_MANAGED for Internal HTTP(S) Load Balancing. Choose INTERNAL_SELF_MANAGED for
     * Traffic Director. A backend service created for one type of load balancing cannot be used
     * with another. For more information, refer to Choosing a load balancer.
     */
    public String getLoadBalancingScheme() {
      return loadBalancingScheme;
    }

    /**
     * Specifies the load balancer type. Choose EXTERNAL for load balancers that receive traffic
     * from external clients. Choose INTERNAL for Internal TCP/UDP Load Balancing. Choose
     * INTERNAL_MANAGED for Internal HTTP(S) Load Balancing. Choose INTERNAL_SELF_MANAGED for
     * Traffic Director. A backend service created for one type of load balancing cannot be used
     * with another. For more information, refer to Choosing a load balancer.
     */
    public Builder setLoadBalancingScheme(String loadBalancingScheme) {
      this.loadBalancingScheme = loadBalancingScheme;
      return this;
    }

    /**
     * The load balancing algorithm used within the scope of the locality. The possible values are:
     * - ROUND_ROBIN: This is a simple policy in which each healthy backend is selected in round
     * robin order. This is the default. - LEAST_REQUEST: An O(1) algorithm which selects two random
     * healthy hosts and picks the host which has fewer active requests. - RING_HASH: The
     * ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has
     * the property that the addition/removal of a host from a set of N hosts only affects 1/N of
     * the requests. - RANDOM: The load balancer selects a random healthy host. -
     * ORIGINAL_DESTINATION: Backend host is selected based on the client connection metadata, i.e.,
     * connections are opened to the same address as the destination address of the incoming
     * connection before the connection was redirected to the load balancer. - MAGLEV: used as a
     * drop in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but
     * has faster table lookup build times and host selection times. For more information about
     * Maglev, refer to https://ai.google/research/pubs/pub44824
     *
     * <p>This field is applicable to either: - A regional backend service with the service_protocol
     * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
     * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     *
     * <p>If sessionAffinity is not NONE, and this field is not set to &gt;MAGLEV or RING_HASH,
     * session affinity settings will not take effect.
     */
    public String getLocalityLbPolicy() {
      return localityLbPolicy;
    }

    /**
     * The load balancing algorithm used within the scope of the locality. The possible values are:
     * - ROUND_ROBIN: This is a simple policy in which each healthy backend is selected in round
     * robin order. This is the default. - LEAST_REQUEST: An O(1) algorithm which selects two random
     * healthy hosts and picks the host which has fewer active requests. - RING_HASH: The
     * ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has
     * the property that the addition/removal of a host from a set of N hosts only affects 1/N of
     * the requests. - RANDOM: The load balancer selects a random healthy host. -
     * ORIGINAL_DESTINATION: Backend host is selected based on the client connection metadata, i.e.,
     * connections are opened to the same address as the destination address of the incoming
     * connection before the connection was redirected to the load balancer. - MAGLEV: used as a
     * drop in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but
     * has faster table lookup build times and host selection times. For more information about
     * Maglev, refer to https://ai.google/research/pubs/pub44824
     *
     * <p>This field is applicable to either: - A regional backend service with the service_protocol
     * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
     * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     *
     * <p>If sessionAffinity is not NONE, and this field is not set to &gt;MAGLEV or RING_HASH,
     * session affinity settings will not take effect.
     */
    public Builder setLocalityLbPolicy(String localityLbPolicy) {
      this.localityLbPolicy = localityLbPolicy;
      return this;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be
     * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must be a dash, lowercase
     * letter, or digit, except the last character, which cannot be a dash.
     */
    public String getName() {
      return name;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be
     * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first
     * character must be a lowercase letter, and all following characters must be a dash, lowercase
     * letter, or digit, except the last character, which cannot be a dash.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the
     * backend service. If not set, this feature is considered disabled.
     *
     * <p>This field is applicable to either: - A regional backend service with the service_protocol
     * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
     * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     */
    public OutlierDetection getOutlierDetection() {
      return outlierDetection;
    }

    /**
     * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the
     * backend service. If not set, this feature is considered disabled.
     *
     * <p>This field is applicable to either: - A regional backend service with the service_protocol
     * set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global
     * backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     */
    public Builder setOutlierDetection(OutlierDetection outlierDetection) {
      this.outlierDetection = outlierDetection;
      return this;
    }

    /**
     * Deprecated in favor of portName. The TCP port to connect on the backend. The default value is
     * 80.
     *
     * <p>This cannot be used if the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load
     * Balancing).
     */
    public Integer getPort() {
      return port;
    }

    /**
     * Deprecated in favor of portName. The TCP port to connect on the backend. The default value is
     * 80.
     *
     * <p>This cannot be used if the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load
     * Balancing).
     */
    public Builder setPort(Integer port) {
      this.port = port;
      return this;
    }

    /**
     * A named port on a backend instance group representing the port for communication to the
     * backend VMs in that group. Required when the loadBalancingScheme is EXTERNAL and the backends
     * are instance groups. The named port must be defined on each backend instance group. This
     * parameter has no meaning if the backends are NEGs.
     *
     * <p>Must be omitted when the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load
     * Blaancing).
     */
    public String getPortName() {
      return portName;
    }

    /**
     * A named port on a backend instance group representing the port for communication to the
     * backend VMs in that group. Required when the loadBalancingScheme is EXTERNAL and the backends
     * are instance groups. The named port must be defined on each backend instance group. This
     * parameter has no meaning if the backends are NEGs.
     *
     * <p>Must be omitted when the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load
     * Blaancing).
     */
    public Builder setPortName(String portName) {
      this.portName = portName;
      return this;
    }

    /**
     * The protocol this BackendService uses to communicate with backends.
     *
     * <p>Possible values are HTTP, HTTPS, HTTP2, TCP, SSL, or UDP, depending on the chosen load
     * balancer or Traffic Director configuration. Refer to the documentation for the load balancer
     * or for Traffic Director for more information.
     */
    public String getProtocol() {
      return protocol;
    }

    /**
     * The protocol this BackendService uses to communicate with backends.
     *
     * <p>Possible values are HTTP, HTTPS, HTTP2, TCP, SSL, or UDP, depending on the chosen load
     * balancer or Traffic Director configuration. Refer to the documentation for the load balancer
     * or for Traffic Director for more information.
     */
    public Builder setProtocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * [Output Only] URL of the region where the regional backend service resides. This field is not
     * applicable to global backend services. You must specify this field as part of the HTTP
     * request URL. It is not settable as a field in the request body.
     */
    public String getRegion() {
      return region;
    }

    /**
     * [Output Only] URL of the region where the regional backend service resides. This field is not
     * applicable to global backend services. You must specify this field as part of the HTTP
     * request URL. It is not settable as a field in the request body.
     */
    public Builder setRegion(String region) {
      this.region = region;
      return this;
    }

    /**
     * [Output Only] The resource URL for the security policy associated with this backend service.
     */
    public String getSecurityPolicy() {
      return securityPolicy;
    }

    /**
     * [Output Only] The resource URL for the security policy associated with this backend service.
     */
    public Builder setSecurityPolicy(String securityPolicy) {
      this.securityPolicy = securityPolicy;
      return this;
    }

    /** [Output Only] Server-defined URL for the resource. */
    public String getSelfLink() {
      return selfLink;
    }

    /** [Output Only] Server-defined URL for the resource. */
    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    /**
     * Type of session affinity to use. The default is NONE. Session affinity is not applicable if
     * the --protocol is UDP.
     *
     * <p>When the loadBalancingScheme is EXTERNAL, possible values are NONE, CLIENT_IP, or
     * GENERATED_COOKIE. You can use GENERATED_COOKIE if the protocol is HTTP or HTTPS.
     *
     * <p>When the loadBalancingScheme is INTERNAL, possible values are NONE, CLIENT_IP,
     * CLIENT_IP_PROTO, or CLIENT_IP_PORT_PROTO.
     *
     * <p>When the loadBalancingScheme is INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED, possible
     * values are NONE, CLIENT_IP, GENERATED_COOKIE, HEADER_FIELD, or HTTP_COOKIE.
     */
    public String getSessionAffinity() {
      return sessionAffinity;
    }

    /**
     * Type of session affinity to use. The default is NONE. Session affinity is not applicable if
     * the --protocol is UDP.
     *
     * <p>When the loadBalancingScheme is EXTERNAL, possible values are NONE, CLIENT_IP, or
     * GENERATED_COOKIE. You can use GENERATED_COOKIE if the protocol is HTTP or HTTPS.
     *
     * <p>When the loadBalancingScheme is INTERNAL, possible values are NONE, CLIENT_IP,
     * CLIENT_IP_PROTO, or CLIENT_IP_PORT_PROTO.
     *
     * <p>When the loadBalancingScheme is INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED, possible
     * values are NONE, CLIENT_IP, GENERATED_COOKIE, HEADER_FIELD, or HTTP_COOKIE.
     */
    public Builder setSessionAffinity(String sessionAffinity) {
      this.sessionAffinity = sessionAffinity;
      return this;
    }

    /**
     * The backend service timeout has a different meaning depending on the type of load balancer.
     * For more information read, Backend service settings The default is 30 seconds.
     */
    public Integer getTimeoutSec() {
      return timeoutSec;
    }

    /**
     * The backend service timeout has a different meaning depending on the type of load balancer.
     * For more information read, Backend service settings The default is 30 seconds.
     */
    public Builder setTimeoutSec(Integer timeoutSec) {
      this.timeoutSec = timeoutSec;
      return this;
    }

    public BackendService build() {

      return new BackendService(
          affinityCookieTtlSec,
          backends,
          cdnPolicy,
          circuitBreakers,
          connectionDraining,
          consistentHash,
          creationTimestamp,
          customRequestHeaders,
          description,
          enableCDN,
          fingerprint,
          healthChecks,
          iap,
          id,
          kind,
          loadBalancingScheme,
          localityLbPolicy,
          name,
          outlierDetection,
          port,
          portName,
          protocol,
          region,
          securityPolicy,
          selfLink,
          sessionAffinity,
          timeoutSec);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAffinityCookieTtlSec(this.affinityCookieTtlSec);
      newBuilder.addAllBackends(this.backends);
      newBuilder.setCdnPolicy(this.cdnPolicy);
      newBuilder.setCircuitBreakers(this.circuitBreakers);
      newBuilder.setConnectionDraining(this.connectionDraining);
      newBuilder.setConsistentHash(this.consistentHash);
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.addAllCustomRequestHeaders(this.customRequestHeaders);
      newBuilder.setDescription(this.description);
      newBuilder.setEnableCDN(this.enableCDN);
      newBuilder.setFingerprint(this.fingerprint);
      newBuilder.addAllHealthChecks(this.healthChecks);
      newBuilder.setIap(this.iap);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setLoadBalancingScheme(this.loadBalancingScheme);
      newBuilder.setLocalityLbPolicy(this.localityLbPolicy);
      newBuilder.setName(this.name);
      newBuilder.setOutlierDetection(this.outlierDetection);
      newBuilder.setPort(this.port);
      newBuilder.setPortName(this.portName);
      newBuilder.setProtocol(this.protocol);
      newBuilder.setRegion(this.region);
      newBuilder.setSecurityPolicy(this.securityPolicy);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setSessionAffinity(this.sessionAffinity);
      newBuilder.setTimeoutSec(this.timeoutSec);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "BackendService{"
        + "affinityCookieTtlSec="
        + affinityCookieTtlSec
        + ", "
        + "backends="
        + backends
        + ", "
        + "cdnPolicy="
        + cdnPolicy
        + ", "
        + "circuitBreakers="
        + circuitBreakers
        + ", "
        + "connectionDraining="
        + connectionDraining
        + ", "
        + "consistentHash="
        + consistentHash
        + ", "
        + "creationTimestamp="
        + creationTimestamp
        + ", "
        + "customRequestHeaders="
        + customRequestHeaders
        + ", "
        + "description="
        + description
        + ", "
        + "enableCDN="
        + enableCDN
        + ", "
        + "fingerprint="
        + fingerprint
        + ", "
        + "healthChecks="
        + healthChecks
        + ", "
        + "iap="
        + iap
        + ", "
        + "id="
        + id
        + ", "
        + "kind="
        + kind
        + ", "
        + "loadBalancingScheme="
        + loadBalancingScheme
        + ", "
        + "localityLbPolicy="
        + localityLbPolicy
        + ", "
        + "name="
        + name
        + ", "
        + "outlierDetection="
        + outlierDetection
        + ", "
        + "port="
        + port
        + ", "
        + "portName="
        + portName
        + ", "
        + "protocol="
        + protocol
        + ", "
        + "region="
        + region
        + ", "
        + "securityPolicy="
        + securityPolicy
        + ", "
        + "selfLink="
        + selfLink
        + ", "
        + "sessionAffinity="
        + sessionAffinity
        + ", "
        + "timeoutSec="
        + timeoutSec
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BackendService) {
      BackendService that = (BackendService) o;
      return Objects.equals(this.affinityCookieTtlSec, that.getAffinityCookieTtlSec())
          && Objects.equals(this.backends, that.getBackendsList())
          && Objects.equals(this.cdnPolicy, that.getCdnPolicy())
          && Objects.equals(this.circuitBreakers, that.getCircuitBreakers())
          && Objects.equals(this.connectionDraining, that.getConnectionDraining())
          && Objects.equals(this.consistentHash, that.getConsistentHash())
          && Objects.equals(this.creationTimestamp, that.getCreationTimestamp())
          && Objects.equals(this.customRequestHeaders, that.getCustomRequestHeadersList())
          && Objects.equals(this.description, that.getDescription())
          && Objects.equals(this.enableCDN, that.getEnableCDN())
          && Objects.equals(this.fingerprint, that.getFingerprint())
          && Objects.equals(this.healthChecks, that.getHealthChecksList())
          && Objects.equals(this.iap, that.getIap())
          && Objects.equals(this.id, that.getId())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.loadBalancingScheme, that.getLoadBalancingScheme())
          && Objects.equals(this.localityLbPolicy, that.getLocalityLbPolicy())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.outlierDetection, that.getOutlierDetection())
          && Objects.equals(this.port, that.getPort())
          && Objects.equals(this.portName, that.getPortName())
          && Objects.equals(this.protocol, that.getProtocol())
          && Objects.equals(this.region, that.getRegion())
          && Objects.equals(this.securityPolicy, that.getSecurityPolicy())
          && Objects.equals(this.selfLink, that.getSelfLink())
          && Objects.equals(this.sessionAffinity, that.getSessionAffinity())
          && Objects.equals(this.timeoutSec, that.getTimeoutSec());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        affinityCookieTtlSec,
        backends,
        cdnPolicy,
        circuitBreakers,
        connectionDraining,
        consistentHash,
        creationTimestamp,
        customRequestHeaders,
        description,
        enableCDN,
        fingerprint,
        healthChecks,
        iap,
        id,
        kind,
        loadBalancingScheme,
        localityLbPolicy,
        name,
        outlierDetection,
        port,
        portName,
        protocol,
        region,
        securityPolicy,
        selfLink,
        sessionAffinity,
        timeoutSec);
  }
}
