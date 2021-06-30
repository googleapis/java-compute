/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.InterconnectLocationsClient.ListPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.FieldsExtractor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.GetInterconnectLocationRequest;
import com.google.cloud.compute.v1.InterconnectLocation;
import com.google.cloud.compute.v1.InterconnectLocationList;
import com.google.cloud.compute.v1.ListInterconnectLocationsRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the InterconnectLocations service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonInterconnectLocationsStub extends InterconnectLocationsStub {
  private static final ApiMethodDescriptor<GetInterconnectLocationRequest, InterconnectLocation>
      getMethodDescriptor =
          ApiMethodDescriptor.<GetInterconnectLocationRequest, InterconnectLocation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.InterconnectLocations/Get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetInterconnectLocationRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/interconnectLocations/{interconnectLocation}",
                          new FieldsExtractor<
                              GetInterconnectLocationRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                GetInterconnectLocationRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<GetInterconnectLocationRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(
                                  fields,
                                  "interconnectLocation",
                                  request.getInterconnectLocation());
                              serializer.putPathParam(fields, "project", request.getProject());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              GetInterconnectLocationRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                GetInterconnectLocationRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<GetInterconnectLocationRequest> serializer =
                                  ProtoRestSerializer.create();
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<GetInterconnectLocationRequest, String>() {
                            @Override
                            public String extract(GetInterconnectLocationRequest request) {
                              return null;
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<InterconnectLocation>newBuilder()
                      .setDefaultInstance(InterconnectLocation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<
          ListInterconnectLocationsRequest, InterconnectLocationList>
      listMethodDescriptor =
          ApiMethodDescriptor
              .<ListInterconnectLocationsRequest, InterconnectLocationList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.InterconnectLocations/List")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListInterconnectLocationsRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/interconnectLocations",
                          new FieldsExtractor<
                              ListInterconnectLocationsRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                ListInterconnectLocationsRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<ListInterconnectLocationsRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              ListInterconnectLocationsRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                ListInterconnectLocationsRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<ListInterconnectLocationsRequest> serializer =
                                  ProtoRestSerializer.create();
                              if (request.hasFilter()) {
                                serializer.putQueryParam(fields, "filter", request.getFilter());
                              }
                              if (request.hasMaxResults()) {
                                serializer.putQueryParam(
                                    fields, "maxResults", request.getMaxResults());
                              }
                              if (request.hasOrderBy()) {
                                serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                              }
                              if (request.hasPageToken()) {
                                serializer.putQueryParam(
                                    fields, "pageToken", request.getPageToken());
                              }
                              if (request.hasReturnPartialSuccess()) {
                                serializer.putQueryParam(
                                    fields,
                                    "returnPartialSuccess",
                                    request.getReturnPartialSuccess());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<ListInterconnectLocationsRequest, String>() {
                            @Override
                            public String extract(ListInterconnectLocationsRequest request) {
                              return null;
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<InterconnectLocationList>newBuilder()
                      .setDefaultInstance(InterconnectLocationList.getDefaultInstance())
                      .build())
              .build();

  private final UnaryCallable<GetInterconnectLocationRequest, InterconnectLocation> getCallable;
  private final UnaryCallable<ListInterconnectLocationsRequest, InterconnectLocationList>
      listCallable;
  private final UnaryCallable<ListInterconnectLocationsRequest, ListPagedResponse>
      listPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonInterconnectLocationsStub create(
      InterconnectLocationsStubSettings settings) throws IOException {
    return new HttpJsonInterconnectLocationsStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonInterconnectLocationsStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonInterconnectLocationsStub(
        InterconnectLocationsStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonInterconnectLocationsStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonInterconnectLocationsStub(
        InterconnectLocationsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonInterconnectLocationsStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonInterconnectLocationsStub(
      InterconnectLocationsStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonInterconnectLocationsCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonInterconnectLocationsStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonInterconnectLocationsStub(
      InterconnectLocationsStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<GetInterconnectLocationRequest, InterconnectLocation>
        getTransportSettings =
            HttpJsonCallSettings.<GetInterconnectLocationRequest, InterconnectLocation>newBuilder()
                .setMethodDescriptor(getMethodDescriptor)
                .build();
    HttpJsonCallSettings<ListInterconnectLocationsRequest, InterconnectLocationList>
        listTransportSettings =
            HttpJsonCallSettings
                .<ListInterconnectLocationsRequest, InterconnectLocationList>newBuilder()
                .setMethodDescriptor(listMethodDescriptor)
                .build();

    this.getCallable =
        callableFactory.createUnaryCallable(
            getTransportSettings, settings.getSettings(), clientContext);
    this.listCallable =
        callableFactory.createUnaryCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.listPagedCallable =
        callableFactory.createPagedCallable(
            listTransportSettings, settings.listSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(getMethodDescriptor);
    methodDescriptors.add(listMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<GetInterconnectLocationRequest, InterconnectLocation> getCallable() {
    return getCallable;
  }

  @Override
  public UnaryCallable<ListInterconnectLocationsRequest, InterconnectLocationList> listCallable() {
    return listCallable;
  }

  @Override
  public UnaryCallable<ListInterconnectLocationsRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
