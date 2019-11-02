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
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameFactory;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

@Generated("by GAPIC")
@BetaApi
public final class ProjectZoneNetworkEndpointGroupName implements ResourceName {
  private final String networkEndpointGroup;
  private final String project;
  private final String zone;
  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "{project}/zones/{zone}/networkEndpointGroups/{networkEndpointGroup}");

  public static final String SERVICE_ADDRESS =
      "https://compute.googleapis.com/compute/v1/projects/";

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ProjectZoneNetworkEndpointGroupName(Builder builder) {
    networkEndpointGroup = Preconditions.checkNotNull(builder.getNetworkEndpointGroup());
    project = Preconditions.checkNotNull(builder.getProject());
    zone = Preconditions.checkNotNull(builder.getZone());
  }

  public static ProjectZoneNetworkEndpointGroupName of(
      String networkEndpointGroup, String project, String zone) {
    return newBuilder()
        .setNetworkEndpointGroup(networkEndpointGroup)
        .setProject(project)
        .setZone(zone)
        .build();
  }

  public static String format(String networkEndpointGroup, String project, String zone) {
    return of(networkEndpointGroup, project, zone).toString();
  }

  public String getNetworkEndpointGroup() {
    return networkEndpointGroup;
  }

  public String getProject() {
    return project;
  }

  public String getZone() {
    return zone;
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("networkEndpointGroup", networkEndpointGroup);
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("zone", zone);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  public static ResourceNameFactory<ProjectZoneNetworkEndpointGroupName> newFactory() {
    return new ResourceNameFactory<ProjectZoneNetworkEndpointGroupName>() {
      public ProjectZoneNetworkEndpointGroupName parse(String formattedString) {
        return ProjectZoneNetworkEndpointGroupName.parse(formattedString);
      }
    };
  }

  public static ProjectZoneNetworkEndpointGroupName parse(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            resourcePath,
            "ProjectZoneNetworkEndpointGroupName.parse: formattedString not in valid format");
    return of(matchMap.get("networkEndpointGroup"), matchMap.get("project"), matchMap.get("zone"));
  }

  public static boolean isParsableFrom(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    return PATH_TEMPLATE.matches(resourcePath);
  }

  public static class Builder {
    private String networkEndpointGroup;
    private String project;
    private String zone;

    public String getNetworkEndpointGroup() {
      return networkEndpointGroup;
    }

    public String getProject() {
      return project;
    }

    public String getZone() {
      return zone;
    }

    public Builder setNetworkEndpointGroup(String networkEndpointGroup) {
      this.networkEndpointGroup = networkEndpointGroup;
      return this;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setZone(String zone) {
      this.zone = zone;
      return this;
    }

    private Builder() {}

    public Builder(ProjectZoneNetworkEndpointGroupName projectZoneNetworkEndpointGroupName) {
      networkEndpointGroup = projectZoneNetworkEndpointGroupName.networkEndpointGroup;
      project = projectZoneNetworkEndpointGroupName.project;
      zone = projectZoneNetworkEndpointGroupName.zone;
    }

    public ProjectZoneNetworkEndpointGroupName build() {
      return new ProjectZoneNetworkEndpointGroupName(this);
    }
  }

  @Override
  public String toString() {
    return SERVICE_ADDRESS
        + PATH_TEMPLATE.instantiate(
            "networkEndpointGroup", networkEndpointGroup,
            "project", project,
            "zone", zone);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProjectZoneNetworkEndpointGroupName) {
      ProjectZoneNetworkEndpointGroupName that = (ProjectZoneNetworkEndpointGroupName) o;
      return Objects.equals(this.networkEndpointGroup, that.getNetworkEndpointGroup())
          && Objects.equals(this.project, that.getProject())
          && Objects.equals(this.zone, that.getZone());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkEndpointGroup, project, zone);
  }
}
