package com.google.cloud.compute.v1.integration;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.google.cloud.compute.v1.ZonesClient;
import com.google.cloud.compute.v1.ZonesSettings;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ITHeadersTest {

    private static HttpServer server;
    private static ZonesClient zonesClient;
    private static Headers headers;


    @BeforeClass
    public static void setUp() throws IOException {
        server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", new MyHandler());
        server.setExecutor(null);
        server.start();
        String address = server.getAddress().toString().replace("/", "http://");
        ZonesSettings zoneSettings = ZonesSettings.newBuilder().setEndpoint(address).build();
        zonesClient = ZonesClient.create(zoneSettings);
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
        zonesClient.get("test", "test");
        Assert.assertTrue(headers.get("X-goog-api-client").get(0).contains("rest/"));
        // fails with nullpointerexception cause there is no Content-type header
        Assert.assertTrue(headers.get("Content-type").get(0).contains("application/json"));
    }

}
