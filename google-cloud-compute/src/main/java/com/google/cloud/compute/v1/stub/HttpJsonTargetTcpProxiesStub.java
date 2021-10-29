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

import static com.google.cloud.compute.v1.TargetTcpProxiesClient.ListPagedResponse;

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
import com.google.cloud.compute.v1.DeleteTargetTcpProxyRequest;
import com.google.cloud.compute.v1.GetTargetTcpProxyRequest;
import com.google.cloud.compute.v1.InsertTargetTcpProxyRequest;
import com.google.cloud.compute.v1.ListTargetTcpProxiesRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetBackendServiceTargetTcpProxyRequest;
import com.google.cloud.compute.v1.SetProxyHeaderTargetTcpProxyRequest;
import com.google.cloud.compute.v1.TargetTcpProxy;
import com.google.cloud.compute.v1.TargetTcpProxyList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the TargetTcpProxies service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonTargetTcpProxiesStub extends TargetTcpProxiesStub {
  private static final ApiMethodDescriptor<DeleteTargetTcpProxyRequest, Operation>
      deleteMethodDescriptor =
          ApiMethodDescriptor.<DeleteTargetTcpProxyRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.TargetTcpProxies/Delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteTargetTcpProxyRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/targetTcpProxies/{targetTcpProxy}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteTargetTcpProxyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(
                                fields, "targetTcpProxy", request.getTargetTcpProxy());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteTargetTcpProxyRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasRequestId()) {
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetTargetTcpProxyRequest, TargetTcpProxy>
      getMethodDescriptor =
          ApiMethodDescriptor.<GetTargetTcpProxyRequest, TargetTcpProxy>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.TargetTcpProxies/Get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetTargetTcpProxyRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/targetTcpProxies/{targetTcpProxy}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetTargetTcpProxyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(
                                fields, "targetTcpProxy", request.getTargetTcpProxy());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetTargetTcpProxyRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<TargetTcpProxy>newBuilder()
                      .setDefaultInstance(TargetTcpProxy.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<InsertTargetTcpProxyRequest, Operation>
      insertMethodDescriptor =
          ApiMethodDescriptor.<InsertTargetTcpProxyRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.TargetTcpProxies/Insert")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<InsertTargetTcpProxyRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/targetTcpProxies",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<InsertTargetTcpProxyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<InsertTargetTcpProxyRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasRequestId()) {
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "targetTcpProxyResource",
                                      request.getTargetTcpProxyResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListTargetTcpProxiesRequest, TargetTcpProxyList>
      listMethodDescriptor =
          ApiMethodDescriptor.<ListTargetTcpProxiesRequest, TargetTcpProxyList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.TargetTcpProxies/List")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListTargetTcpProxiesRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/targetTcpProxies",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListTargetTcpProxiesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListTargetTcpProxiesRequest> serializer =
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
                  ProtoMessageResponseParser.<TargetTcpProxyList>newBuilder()
                      .setDefaultInstance(TargetTcpProxyList.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<SetBackendServiceTargetTcpProxyRequest, Operation>
      setBackendServiceMethodDescriptor =
          ApiMethodDescriptor.<SetBackendServiceTargetTcpProxyRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.TargetTcpProxies/SetBackendService")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<SetBackendServiceTargetTcpProxyRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/targetTcpProxies/{targetTcpProxy}/setBackendService",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<SetBackendServiceTargetTcpProxyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(
                                fields, "targetTcpProxy", request.getTargetTcpProxy());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<SetBackendServiceTargetTcpProxyRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasRequestId()) {
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "targetTcpProxiesSetBackendServiceRequestResource",
                                      request
                                          .getTargetTcpProxiesSetBackendServiceRequestResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<SetProxyHeaderTargetTcpProxyRequest, Operation>
      setProxyHeaderMethodDescriptor =
          ApiMethodDescriptor.<SetProxyHeaderTargetTcpProxyRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.TargetTcpProxies/SetProxyHeader")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<SetProxyHeaderTargetTcpProxyRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/targetTcpProxies/{targetTcpProxy}/setProxyHeader",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<SetProxyHeaderTargetTcpProxyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(
                                fields, "targetTcpProxy", request.getTargetTcpProxy());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<SetProxyHeaderTargetTcpProxyRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasRequestId()) {
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "targetTcpProxiesSetProxyHeaderRequestResource",
                                      request.getTargetTcpProxiesSetProxyHeaderRequestResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private final UnaryCallable<DeleteTargetTcpProxyRequest, Operation> deleteCallable;
  private final UnaryCallable<GetTargetTcpProxyRequest, TargetTcpProxy> getCallable;
  private final UnaryCallable<InsertTargetTcpProxyRequest, Operation> insertCallable;
  private final UnaryCallable<ListTargetTcpProxiesRequest, TargetTcpProxyList> listCallable;
  private final UnaryCallable<ListTargetTcpProxiesRequest, ListPagedResponse> listPagedCallable;
  private final UnaryCallable<SetBackendServiceTargetTcpProxyRequest, Operation>
      setBackendServiceCallable;
  private final UnaryCallable<SetProxyHeaderTargetTcpProxyRequest, Operation>
      setProxyHeaderCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonTargetTcpProxiesStub create(TargetTcpProxiesStubSettings settings)
      throws IOException {
    return new HttpJsonTargetTcpProxiesStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonTargetTcpProxiesStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonTargetTcpProxiesStub(
        TargetTcpProxiesStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonTargetTcpProxiesStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonTargetTcpProxiesStub(
        TargetTcpProxiesStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonTargetTcpProxiesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonTargetTcpProxiesStub(
      TargetTcpProxiesStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonTargetTcpProxiesCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonTargetTcpProxiesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonTargetTcpProxiesStub(
      TargetTcpProxiesStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<DeleteTargetTcpProxyRequest, Operation> deleteTransportSettings =
        HttpJsonCallSettings.<DeleteTargetTcpProxyRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetTargetTcpProxyRequest, TargetTcpProxy> getTransportSettings =
        HttpJsonCallSettings.<GetTargetTcpProxyRequest, TargetTcpProxy>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertTargetTcpProxyRequest, Operation> insertTransportSettings =
        HttpJsonCallSettings.<InsertTargetTcpProxyRequest, Operation>newBuilder()
            .setMethodDescriptor(insertMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListTargetTcpProxiesRequest, TargetTcpProxyList> listTransportSettings =
        HttpJsonCallSettings.<ListTargetTcpProxiesRequest, TargetTcpProxyList>newBuilder()
            .setMethodDescriptor(listMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetBackendServiceTargetTcpProxyRequest, Operation>
        setBackendServiceTransportSettings =
            HttpJsonCallSettings.<SetBackendServiceTargetTcpProxyRequest, Operation>newBuilder()
                .setMethodDescriptor(setBackendServiceMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetProxyHeaderTargetTcpProxyRequest, Operation>
        setProxyHeaderTransportSettings =
            HttpJsonCallSettings.<SetProxyHeaderTargetTcpProxyRequest, Operation>newBuilder()
                .setMethodDescriptor(setProxyHeaderMethodDescriptor)
                .build();

    this.deleteCallable =
        callableFactory.createUnaryCallable(
            deleteTransportSettings, settings.deleteSettings(), clientContext);
    this.getCallable =
        callableFactory.createUnaryCallable(
            getTransportSettings, settings.getSettings(), clientContext);
    this.insertCallable =
        callableFactory.createUnaryCallable(
            insertTransportSettings, settings.insertSettings(), clientContext);
    this.listCallable =
        callableFactory.createUnaryCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.listPagedCallable =
        callableFactory.createPagedCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.setBackendServiceCallable =
        callableFactory.createUnaryCallable(
            setBackendServiceTransportSettings,
            settings.setBackendServiceSettings(),
            clientContext);
    this.setProxyHeaderCallable =
        callableFactory.createUnaryCallable(
            setProxyHeaderTransportSettings, settings.setProxyHeaderSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(deleteMethodDescriptor);
    methodDescriptors.add(getMethodDescriptor);
    methodDescriptors.add(insertMethodDescriptor);
    methodDescriptors.add(listMethodDescriptor);
    methodDescriptors.add(setBackendServiceMethodDescriptor);
    methodDescriptors.add(setProxyHeaderMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<DeleteTargetTcpProxyRequest, Operation> deleteCallable() {
    return deleteCallable;
  }

  @Override
  public UnaryCallable<GetTargetTcpProxyRequest, TargetTcpProxy> getCallable() {
    return getCallable;
  }

  @Override
  public UnaryCallable<InsertTargetTcpProxyRequest, Operation> insertCallable() {
    return insertCallable;
  }

  @Override
  public UnaryCallable<ListTargetTcpProxiesRequest, TargetTcpProxyList> listCallable() {
    return listCallable;
  }

  @Override
  public UnaryCallable<ListTargetTcpProxiesRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  @Override
  public UnaryCallable<SetBackendServiceTargetTcpProxyRequest, Operation>
      setBackendServiceCallable() {
    return setBackendServiceCallable;
  }

  @Override
  public UnaryCallable<SetProxyHeaderTargetTcpProxyRequest, Operation> setProxyHeaderCallable() {
    return setProxyHeaderCallable;
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
