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

import static com.google.cloud.compute.v1.AcceleratorTypesClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.AcceleratorTypesClient.ListPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AcceleratorType;
import com.google.cloud.compute.v1.AcceleratorTypeAggregatedList;
import com.google.cloud.compute.v1.AcceleratorTypeList;
import com.google.cloud.compute.v1.AggregatedListAcceleratorTypesRequest;
import com.google.cloud.compute.v1.GetAcceleratorTypeRequest;
import com.google.cloud.compute.v1.ListAcceleratorTypesRequest;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the AcceleratorTypes service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonAcceleratorTypesStub extends AcceleratorTypesStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<
          AggregatedListAcceleratorTypesRequest, AcceleratorTypeAggregatedList>
      aggregatedListMethodDescriptor =
          ApiMethodDescriptor
              .<AggregatedListAcceleratorTypesRequest, AcceleratorTypeAggregatedList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.AcceleratorTypes/AggregatedList")
              .setHttpMethod(HttpMethods.GET)
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<AggregatedListAcceleratorTypesRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/aggregated/acceleratorTypes",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<AggregatedListAcceleratorTypesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<AggregatedListAcceleratorTypesRequest> serializer =
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
                              serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            }
                            if (request.hasReturnPartialSuccess()) {
                              serializer.putQueryParam(
                                  fields,
                                  "returnPartialSuccess",
                                  request.getReturnPartialSuccess());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<AcceleratorTypeAggregatedList>newBuilder()
                      .setDefaultInstance(AcceleratorTypeAggregatedList.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetAcceleratorTypeRequest, AcceleratorType>
      getMethodDescriptor =
          ApiMethodDescriptor.<GetAcceleratorTypeRequest, AcceleratorType>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.AcceleratorTypes/Get")
              .setHttpMethod(HttpMethods.GET)
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetAcceleratorTypeRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/zones/{zone}/acceleratorTypes/{acceleratorType}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetAcceleratorTypeRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "acceleratorType", request.getAcceleratorType());
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "zone", request.getZone());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetAcceleratorTypeRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<AcceleratorType>newBuilder()
                      .setDefaultInstance(AcceleratorType.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListAcceleratorTypesRequest, AcceleratorTypeList>
      listMethodDescriptor =
          ApiMethodDescriptor.<ListAcceleratorTypesRequest, AcceleratorTypeList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.AcceleratorTypes/List")
              .setHttpMethod(HttpMethods.GET)
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListAcceleratorTypesRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/zones/{zone}/acceleratorTypes",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListAcceleratorTypesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "zone", request.getZone());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListAcceleratorTypesRequest> serializer =
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
                              serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            }
                            if (request.hasReturnPartialSuccess()) {
                              serializer.putQueryParam(
                                  fields,
                                  "returnPartialSuccess",
                                  request.getReturnPartialSuccess());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<AcceleratorTypeList>newBuilder()
                      .setDefaultInstance(AcceleratorTypeList.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<AggregatedListAcceleratorTypesRequest, AcceleratorTypeAggregatedList>
      aggregatedListCallable;
  private final UnaryCallable<AggregatedListAcceleratorTypesRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable;
  private final UnaryCallable<GetAcceleratorTypeRequest, AcceleratorType> getCallable;
  private final UnaryCallable<ListAcceleratorTypesRequest, AcceleratorTypeList> listCallable;
  private final UnaryCallable<ListAcceleratorTypesRequest, ListPagedResponse> listPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonAcceleratorTypesStub create(AcceleratorTypesStubSettings settings)
      throws IOException {
    return new HttpJsonAcceleratorTypesStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonAcceleratorTypesStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonAcceleratorTypesStub(
        AcceleratorTypesStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonAcceleratorTypesStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonAcceleratorTypesStub(
        AcceleratorTypesStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonAcceleratorTypesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonAcceleratorTypesStub(
      AcceleratorTypesStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonAcceleratorTypesCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonAcceleratorTypesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonAcceleratorTypesStub(
      AcceleratorTypesStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AggregatedListAcceleratorTypesRequest, AcceleratorTypeAggregatedList>
        aggregatedListTransportSettings =
            HttpJsonCallSettings
                .<AggregatedListAcceleratorTypesRequest, AcceleratorTypeAggregatedList>newBuilder()
                .setMethodDescriptor(aggregatedListMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetAcceleratorTypeRequest, AcceleratorType> getTransportSettings =
        HttpJsonCallSettings.<GetAcceleratorTypeRequest, AcceleratorType>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ListAcceleratorTypesRequest, AcceleratorTypeList> listTransportSettings =
        HttpJsonCallSettings.<ListAcceleratorTypesRequest, AcceleratorTypeList>newBuilder()
            .setMethodDescriptor(listMethodDescriptor)
            .setTypeRegistry(typeRegistry)
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
  public UnaryCallable<AggregatedListAcceleratorTypesRequest, AcceleratorTypeAggregatedList>
      aggregatedListCallable() {
    return aggregatedListCallable;
  }

  @Override
  public UnaryCallable<AggregatedListAcceleratorTypesRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    return aggregatedListPagedCallable;
  }

  @Override
  public UnaryCallable<GetAcceleratorTypeRequest, AcceleratorType> getCallable() {
    return getCallable;
  }

  @Override
  public UnaryCallable<ListAcceleratorTypesRequest, AcceleratorTypeList> listCallable() {
    return listCallable;
  }

  @Override
  public UnaryCallable<ListAcceleratorTypesRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
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
