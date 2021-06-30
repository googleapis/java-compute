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

import static com.google.cloud.compute.v1.MachineTypesClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.MachineTypesClient.ListPagedResponse;

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
import com.google.cloud.compute.v1.AggregatedListMachineTypesRequest;
import com.google.cloud.compute.v1.GetMachineTypeRequest;
import com.google.cloud.compute.v1.ListMachineTypesRequest;
import com.google.cloud.compute.v1.MachineType;
import com.google.cloud.compute.v1.MachineTypeAggregatedList;
import com.google.cloud.compute.v1.MachineTypeList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the MachineTypes service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonMachineTypesStub extends MachineTypesStub {
  private static final ApiMethodDescriptor<
          AggregatedListMachineTypesRequest, MachineTypeAggregatedList>
      aggregatedListMethodDescriptor =
          ApiMethodDescriptor
              .<AggregatedListMachineTypesRequest, MachineTypeAggregatedList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.MachineTypes/AggregatedList")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<AggregatedListMachineTypesRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/aggregated/machineTypes",
                          new FieldsExtractor<
                              AggregatedListMachineTypesRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                AggregatedListMachineTypesRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<AggregatedListMachineTypesRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              AggregatedListMachineTypesRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                AggregatedListMachineTypesRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<AggregatedListMachineTypesRequest> serializer =
                                  ProtoRestSerializer.create();
                              if (request.hasFilter()) {
                                serializer.putQueryParam(fields, "filter", request.getFilter());
                              }
                              if (request.hasIncludeAllScopes()) {
                                serializer.putQueryParam(
                                    fields, "includeAllScopes", request.getIncludeAllScopes());
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
                          new FieldsExtractor<AggregatedListMachineTypesRequest, String>() {
                            @Override
                            public String extract(AggregatedListMachineTypesRequest request) {
                              return null;
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<MachineTypeAggregatedList>newBuilder()
                      .setDefaultInstance(MachineTypeAggregatedList.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetMachineTypeRequest, MachineType> getMethodDescriptor =
      ApiMethodDescriptor.<GetMachineTypeRequest, MachineType>newBuilder()
          .setFullMethodName("google.cloud.compute.v1.MachineTypes/Get")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetMachineTypeRequest>newBuilder()
                  .setPath(
                      "/compute/v1/projects/{project}/zones/{zone}/machineTypes/{machineType}",
                      new FieldsExtractor<GetMachineTypeRequest, Map<String, String>>() {
                        @Override
                        public Map<String, String> extract(GetMachineTypeRequest request) {
                          Map<String, String> fields = new HashMap<>();
                          ProtoRestSerializer<GetMachineTypeRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putPathParam(fields, "machineType", request.getMachineType());
                          serializer.putPathParam(fields, "project", request.getProject());
                          serializer.putPathParam(fields, "zone", request.getZone());
                          return fields;
                        }
                      })
                  .setQueryParamsExtractor(
                      new FieldsExtractor<GetMachineTypeRequest, Map<String, List<String>>>() {
                        @Override
                        public Map<String, List<String>> extract(GetMachineTypeRequest request) {
                          Map<String, List<String>> fields = new HashMap<>();
                          ProtoRestSerializer<GetMachineTypeRequest> serializer =
                              ProtoRestSerializer.create();
                          return fields;
                        }
                      })
                  .setRequestBodyExtractor(
                      new FieldsExtractor<GetMachineTypeRequest, String>() {
                        @Override
                        public String extract(GetMachineTypeRequest request) {
                          return null;
                        }
                      })
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<MachineType>newBuilder()
                  .setDefaultInstance(MachineType.getDefaultInstance())
                  .build())
          .build();

  private static final ApiMethodDescriptor<ListMachineTypesRequest, MachineTypeList>
      listMethodDescriptor =
          ApiMethodDescriptor.<ListMachineTypesRequest, MachineTypeList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.MachineTypes/List")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListMachineTypesRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/zones/{zone}/machineTypes",
                          new FieldsExtractor<ListMachineTypesRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(ListMachineTypesRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<ListMachineTypesRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "zone", request.getZone());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              ListMachineTypesRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                ListMachineTypesRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<ListMachineTypesRequest> serializer =
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
                          new FieldsExtractor<ListMachineTypesRequest, String>() {
                            @Override
                            public String extract(ListMachineTypesRequest request) {
                              return null;
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<MachineTypeList>newBuilder()
                      .setDefaultInstance(MachineTypeList.getDefaultInstance())
                      .build())
              .build();

  private final UnaryCallable<AggregatedListMachineTypesRequest, MachineTypeAggregatedList>
      aggregatedListCallable;
  private final UnaryCallable<AggregatedListMachineTypesRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable;
  private final UnaryCallable<GetMachineTypeRequest, MachineType> getCallable;
  private final UnaryCallable<ListMachineTypesRequest, MachineTypeList> listCallable;
  private final UnaryCallable<ListMachineTypesRequest, ListPagedResponse> listPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonMachineTypesStub create(MachineTypesStubSettings settings)
      throws IOException {
    return new HttpJsonMachineTypesStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonMachineTypesStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonMachineTypesStub(
        MachineTypesStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonMachineTypesStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonMachineTypesStub(
        MachineTypesStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonMachineTypesStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonMachineTypesStub(MachineTypesStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonMachineTypesCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonMachineTypesStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonMachineTypesStub(
      MachineTypesStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AggregatedListMachineTypesRequest, MachineTypeAggregatedList>
        aggregatedListTransportSettings =
            HttpJsonCallSettings
                .<AggregatedListMachineTypesRequest, MachineTypeAggregatedList>newBuilder()
                .setMethodDescriptor(aggregatedListMethodDescriptor)
                .build();
    HttpJsonCallSettings<GetMachineTypeRequest, MachineType> getTransportSettings =
        HttpJsonCallSettings.<GetMachineTypeRequest, MachineType>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListMachineTypesRequest, MachineTypeList> listTransportSettings =
        HttpJsonCallSettings.<ListMachineTypesRequest, MachineTypeList>newBuilder()
            .setMethodDescriptor(listMethodDescriptor)
            .build();

    this.aggregatedListCallable =
        callableFactory.createUnaryCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.aggregatedListPagedCallable =
        callableFactory.createPagedCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
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
    methodDescriptors.add(aggregatedListMethodDescriptor);
    methodDescriptors.add(getMethodDescriptor);
    methodDescriptors.add(listMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<AggregatedListMachineTypesRequest, MachineTypeAggregatedList>
      aggregatedListCallable() {
    return aggregatedListCallable;
  }

  @Override
  public UnaryCallable<AggregatedListMachineTypesRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    return aggregatedListPagedCallable;
  }

  @Override
  public UnaryCallable<GetMachineTypeRequest, MachineType> getCallable() {
    return getCallable;
  }

  @Override
  public UnaryCallable<ListMachineTypesRequest, MachineTypeList> listCallable() {
    return listCallable;
  }

  @Override
  public UnaryCallable<ListMachineTypesRequest, ListPagedResponse> listPagedCallable() {
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
