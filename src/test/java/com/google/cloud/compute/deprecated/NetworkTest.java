/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.deprecated;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.createStrictMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.junit.Test;

public class NetworkTest {

  private static final String GENERATED_ID = "42";
  private static final Long CREATION_TIMESTAMP = 1453293540000L;
  private static final String DESCRIPTION = "description";
  private static final SubnetworkId SUBNETWORK1 = SubnetworkId.of("project", "region1", "network1");
  private static final SubnetworkId SUBNETWORK2 = SubnetworkId.of("project", "region2", "network2");
  private static final List<SubnetworkId> SUBNETWORKS = ImmutableList.of(SUBNETWORK1, SUBNETWORK2);
  private static final String GATEWAY_ADDRESS = "192.168.1.1";
  private static final NetworkId NETWORK_ID = NetworkId.of("project", "network");
  private static final String IP_RANGE = "192.168.0.0/16";
  private static final Boolean AUTO_CREATE_SUBNETWORKS = true;
  private static final StandardNetworkConfiguration NETWORK_CONFIGURATION =
      new StandardNetworkConfiguration(IP_RANGE, GATEWAY_ADDRESS);
  private static final SubnetNetworkConfiguration SUBNET_NETWORK_CONFIGURATION =
      new SubnetNetworkConfiguration(AUTO_CREATE_SUBNETWORKS, SUBNETWORKS);

  private final Compute serviceMockReturnsOptions = createStrictMock(Compute.class);
  private final ComputeOptions mockOptions = createMock(ComputeOptions.class);
  private Compute compute;
  private Network network;
  private Network standardNetwork;
  private Network subnetNetwork;

  private void initializeExpectedNetwork(int optionsCalls) {
    expect(serviceMockReturnsOptions.getOptions()).andReturn(mockOptions).times(optionsCalls);
    replay(serviceMockReturnsOptions);
    standardNetwork =
        new Network.Builder(serviceMockReturnsOptions, NETWORK_ID, NETWORK_CONFIGURATION)
            .setGeneratedId(GENERATED_ID)
            .setCreationTimestamp(CREATION_TIMESTAMP)
            .setDescription(DESCRIPTION)
            .build();
    subnetNetwork =
        new Network.Builder(serviceMockReturnsOptions, NETWORK_ID, SUBNET_NETWORK_CONFIGURATION)
            .setGeneratedId(GENERATED_ID)
            .setCreationTimestamp(CREATION_TIMESTAMP)
            .setDescription(DESCRIPTION)
            .build();
    compute = createStrictMock(Compute.class);
  }

  private void initializeNetwork() {
    network =
        new Network.Builder(compute, NETWORK_ID, NETWORK_CONFIGURATION)
            .setGeneratedId(GENERATED_ID)
            .setCreationTimestamp(CREATION_TIMESTAMP)
            .setDescription(DESCRIPTION)
            .build();
  }

  @Test
  public void testToBuilder() {
    initializeExpectedNetwork(9);
    compareNetwork(standardNetwork, standardNetwork.toBuilder().build());
    Network newNetwork = standardNetwork.toBuilder().setDescription("newDescription").build();
    assertEquals("newDescription", newNetwork.getDescription());
    newNetwork = newNetwork.toBuilder().setDescription("description").build();
    compareNetwork(standardNetwork, newNetwork);
  }

  @Test
  public void testToBuilderIncomplete() {
    initializeExpectedNetwork(6);
    NetworkInfo networkInfo = NetworkInfo.of(NETWORK_ID, NETWORK_CONFIGURATION);
    Network network =
        new Network(serviceMockReturnsOptions, new NetworkInfo.BuilderImpl(networkInfo));
    compareNetwork(network, network.toBuilder().build());
  }

  @Test
  public void testBuilder() {
    initializeExpectedNetwork(2);
    assertEquals(GENERATED_ID, standardNetwork.getGeneratedId());
    assertEquals(NETWORK_ID, standardNetwork.getNetworkId());
    assertEquals(CREATION_TIMESTAMP, standardNetwork.getCreationTimestamp());
    assertEquals(DESCRIPTION, standardNetwork.getDescription());
    assertEquals(NETWORK_CONFIGURATION, standardNetwork.getConfiguration());
    assertSame(serviceMockReturnsOptions, standardNetwork.getCompute());
    assertEquals(GENERATED_ID, subnetNetwork.getGeneratedId());
    assertEquals(NETWORK_ID, subnetNetwork.getNetworkId());
    assertEquals(CREATION_TIMESTAMP, subnetNetwork.getCreationTimestamp());
    assertEquals(DESCRIPTION, subnetNetwork.getDescription());
    assertEquals(SUBNET_NETWORK_CONFIGURATION, subnetNetwork.getConfiguration());
    assertSame(serviceMockReturnsOptions, subnetNetwork.getCompute());
  }

  @Test
  public void testToAndFromPb() {
    initializeExpectedNetwork(12);
    compareNetwork(
        standardNetwork, Network.fromPb(serviceMockReturnsOptions, standardNetwork.toPb()));
    compareNetwork(subnetNetwork, Network.fromPb(serviceMockReturnsOptions, subnetNetwork.toPb()));
    Network network =
        new Network.Builder(serviceMockReturnsOptions, NETWORK_ID, NETWORK_CONFIGURATION).build();
    compareNetwork(network, Network.fromPb(serviceMockReturnsOptions, network.toPb()));
  }

  @Test
  public void testDeleteOperation() {
    initializeExpectedNetwork(3);
    expect(compute.getOptions()).andReturn(mockOptions);
    Operation operation =
        new Operation.Builder(serviceMockReturnsOptions)
            .setOperationId(GlobalOperationId.of("project", "op"))
            .build();
    expect(compute.deleteNetwork(NETWORK_ID.getNetwork())).andReturn(operation);
    replay(compute);
    initializeNetwork();
    assertSame(operation, network.delete());
  }

  @Test
  public void testDeleteNull() {
    initializeExpectedNetwork(2);
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.deleteNetwork(NETWORK_ID.getNetwork())).andReturn(null);
    replay(compute);
    initializeNetwork();
    assertNull(network.delete());
  }

  @Test
  public void testExists_True() throws Exception {
    initializeExpectedNetwork(2);
    Compute.NetworkOption[] expectedOptions = {Compute.NetworkOption.fields()};
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.getNetwork(NETWORK_ID.getNetwork(), expectedOptions)).andReturn(standardNetwork);
    replay(compute);
    initializeNetwork();
    assertTrue(network.exists());
    verify(compute);
  }

  @Test
  public void testExists_False() throws Exception {
    initializeExpectedNetwork(2);
    Compute.NetworkOption[] expectedOptions = {Compute.NetworkOption.fields()};
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.getNetwork(NETWORK_ID.getNetwork(), expectedOptions)).andReturn(null);
    replay(compute);
    initializeNetwork();
    assertFalse(network.exists());
    verify(compute);
  }

  @Test
  public void testReload() throws Exception {
    initializeExpectedNetwork(4);
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.getNetwork(NETWORK_ID.getNetwork())).andReturn(standardNetwork);
    replay(compute);
    initializeNetwork();
    Network updatedNetwork = network.reload();
    compareNetwork(standardNetwork, updatedNetwork);
    verify(compute);
  }

  @Test
  public void testReloadNull() throws Exception {
    initializeExpectedNetwork(2);
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.getNetwork(NETWORK_ID.getNetwork())).andReturn(null);
    replay(compute);
    initializeNetwork();
    assertNull(network.reload());
    verify(compute);
  }

  @Test
  public void testReloadWithOptions() throws Exception {
    initializeExpectedNetwork(4);
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.getNetwork(NETWORK_ID.getNetwork(), Compute.NetworkOption.fields()))
        .andReturn(standardNetwork);
    replay(compute);
    initializeNetwork();
    Network updatedNetwork = network.reload(Compute.NetworkOption.fields());
    compareNetwork(standardNetwork, updatedNetwork);
    verify(compute);
  }

  @Test
  public void testCreateSubnetwork() throws Exception {
    initializeExpectedNetwork(3);
    Operation operation =
        new Operation.Builder(serviceMockReturnsOptions)
            .setOperationId(RegionOperationId.of(SUBNETWORK1.getRegionId(), "op"))
            .build();
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.create(SubnetworkInfo.of(SUBNETWORK1, NETWORK_ID, IP_RANGE)))
        .andReturn(operation);
    replay(compute);
    initializeNetwork();
    assertSame(operation, network.createSubnetwork(SUBNETWORK1, IP_RANGE));
    verify(compute);
  }

  @Test
  public void testCreateSubnetworkWithOptions() throws Exception {
    initializeExpectedNetwork(3);
    Operation operation =
        new Operation.Builder(serviceMockReturnsOptions)
            .setOperationId(RegionOperationId.of(SUBNETWORK1.getRegionId(), "op"))
            .build();
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(
            compute.create(
                SubnetworkInfo.of(SUBNETWORK1, NETWORK_ID, IP_RANGE),
                Compute.OperationOption.fields()))
        .andReturn(operation);
    replay(compute);
    initializeNetwork();
    assertSame(
        operation,
        network.createSubnetwork(SUBNETWORK1, IP_RANGE, Compute.OperationOption.fields()));
    verify(compute);
  }

  public void compareNetwork(Network expected, Network value) {
    assertEquals(expected, value);
    assertEquals(expected.getCompute().getOptions(), value.getCompute().getOptions());
    assertEquals(expected.getGeneratedId(), value.getGeneratedId());
    assertEquals(expected.getNetworkId(), value.getNetworkId());
    assertEquals(expected.getCreationTimestamp(), value.getCreationTimestamp());
    assertEquals(expected.getDescription(), value.getDescription());
    assertEquals(expected.getConfiguration(), value.getConfiguration());
    assertEquals(expected.hashCode(), value.hashCode());
  }
}
