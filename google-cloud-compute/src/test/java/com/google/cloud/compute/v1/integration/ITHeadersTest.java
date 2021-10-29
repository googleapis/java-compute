/*
 * Copyright 2021 Google LLC
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
package com.google.cloud.compute.v1.integration;

import com.google.cloud.compute.v1.Address;
import com.google.cloud.compute.v1.AddressesClient;
import com.google.cloud.compute.v1.AddressesSettings;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ITHeadersTest {

  private static HttpServer server;
  private static AddressesClient addressesClient;
  private static Headers headers;

  @BeforeClass
  public static void setUp() throws IOException {
    server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    server.createContext("/", new MyHandler());
    server.setExecutor(null);
    server.start();
    String address = server.getAddress().toString().replace("/", "http://");
    AddressesSettings addressesSettings =
        AddressesSettings.newBuilder().setEndpoint(address).build();
    addressesClient = AddressesClient.create(addressesSettings);
  }

  static class MyHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange t) throws IOException {
      headers = t.getRequestHeaders();
      byte[] response = "{\"id\":2000}".getBytes();
      t.sendResponseHeaders(200, response.length);
      t.getResponseBody().write(response);
      t.close();
    }
  }

  @AfterClass
  public static void tearDown() {
    server.stop(5);
  }

  @Test
  public void testHeaders() {
    addressesClient.insert("test", "test", Address.newBuilder().setName("test").build());
    Assert.assertTrue(headers.get("X-goog-api-client").get(0).contains("rest/"));
    Assert.assertTrue(headers.get("Content-type").get(0).contains("application/json"));
  }
}
