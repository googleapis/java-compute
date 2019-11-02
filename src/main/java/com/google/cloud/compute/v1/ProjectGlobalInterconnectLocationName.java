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
public final class ProjectGlobalInterconnectLocationName implements ResourceName {
  private final String interconnectLocation;
  private final String project;
  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "{project}/global/interconnectLocations/{interconnectLocation}");

  public static final String SERVICE_ADDRESS =
      "https://compute.googleapis.com/compute/v1/projects/";

  private volatile Map<String, String> fieldValuesMap;

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ProjectGlobalInterconnectLocationName(Builder builder) {
    interconnectLocation = Preconditions.checkNotNull(builder.getInterconnectLocation());
    project = Preconditions.checkNotNull(builder.getProject());
  }

  public static ProjectGlobalInterconnectLocationName of(
      String interconnectLocation, String project) {
    return newBuilder().setInterconnectLocation(interconnectLocation).setProject(project).build();
  }

  public static String format(String interconnectLocation, String project) {
    return of(interconnectLocation, project).toString();
  }

  public String getInterconnectLocation() {
    return interconnectLocation;
  }

  public String getProject() {
    return project;
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("interconnectLocation", interconnectLocation);
          fieldMapBuilder.put("project", project);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  public static ResourceNameFactory<ProjectGlobalInterconnectLocationName> newFactory() {
    return new ResourceNameFactory<ProjectGlobalInterconnectLocationName>() {
      public ProjectGlobalInterconnectLocationName parse(String formattedString) {
        return ProjectGlobalInterconnectLocationName.parse(formattedString);
      }
    };
  }

  public static ProjectGlobalInterconnectLocationName parse(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            resourcePath,
            "ProjectGlobalInterconnectLocationName.parse: formattedString not in valid format");
    return of(matchMap.get("interconnectLocation"), matchMap.get("project"));
  }

  public static boolean isParsableFrom(String formattedString) {
    String resourcePath = formattedString;
    if (formattedString.startsWith(SERVICE_ADDRESS)) {
      resourcePath = formattedString.substring(SERVICE_ADDRESS.length());
    }
    return PATH_TEMPLATE.matches(resourcePath);
  }

  public static class Builder {
    private String interconnectLocation;
    private String project;

    public String getInterconnectLocation() {
      return interconnectLocation;
    }

    public String getProject() {
      return project;
    }

    public Builder setInterconnectLocation(String interconnectLocation) {
      this.interconnectLocation = interconnectLocation;
      return this;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    private Builder() {}

    public Builder(ProjectGlobalInterconnectLocationName projectGlobalInterconnectLocationName) {
      interconnectLocation = projectGlobalInterconnectLocationName.interconnectLocation;
      project = projectGlobalInterconnectLocationName.project;
    }

    public ProjectGlobalInterconnectLocationName build() {
      return new ProjectGlobalInterconnectLocationName(this);
    }
  }

  @Override
  public String toString() {
    return SERVICE_ADDRESS
        + PATH_TEMPLATE.instantiate(
            "interconnectLocation", interconnectLocation,
            "project", project);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProjectGlobalInterconnectLocationName) {
      ProjectGlobalInterconnectLocationName that = (ProjectGlobalInterconnectLocationName) o;
      return Objects.equals(this.interconnectLocation, that.getInterconnectLocation())
          && Objects.equals(this.project, that.getProject());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(interconnectLocation, project);
  }
}
