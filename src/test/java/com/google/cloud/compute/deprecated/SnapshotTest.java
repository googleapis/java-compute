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

public class SnapshotTest {

  private static final String GENERATED_ID = "42";
  private static final DiskId SOURCE_DISK = DiskId.of("project", "zone", "disk");
  private static final Long CREATION_TIMESTAMP = 1453293540000L;
  private static final String DESCRIPTION = "description";
  private static final List<LicenseId> LICENSES =
      ImmutableList.of(LicenseId.of("project", "license1"), LicenseId.of("project", "license2"));
  private static final SnapshotId SNAPSHOT_ID = SnapshotId.of("project", "snapshot");
  private static final SnapshotInfo.Status STATUS = SnapshotInfo.Status.CREATING;
  private static final Long DISK_SIZE_GB = 42L;
  private static final String SOURCE_DISK_ID = "diskId";
  private static final Long STORAGE_BYTES = 24L;
  private static final SnapshotInfo.StorageBytesStatus STORAGE_BYTES_STATUS =
      SnapshotInfo.StorageBytesStatus.UP_TO_DATE;

  private final Compute serviceMockReturnsOptions = createStrictMock(Compute.class);
  private final ComputeOptions mockOptions = createMock(ComputeOptions.class);
  private Compute compute;
  private Snapshot snapshot;
  private Snapshot expectedSnapshot;

  private void initializeExpectedSnapshot(int optionsCalls) {
    expect(serviceMockReturnsOptions.getOptions()).andReturn(mockOptions).times(optionsCalls);
    replay(serviceMockReturnsOptions);
    expectedSnapshot =
        new Snapshot.Builder(serviceMockReturnsOptions, SNAPSHOT_ID, SOURCE_DISK)
            .setGeneratedId(GENERATED_ID)
            .setCreationTimestamp(CREATION_TIMESTAMP)
            .setDescription(DESCRIPTION)
            .setStatus(STATUS)
            .setDiskSizeGb(DISK_SIZE_GB)
            .setLicenses(LICENSES)
            .setSourceDiskId(SOURCE_DISK_ID)
            .setStorageBytes(STORAGE_BYTES)
            .setStorageBytesStatus(STORAGE_BYTES_STATUS)
            .build();
    compute = createStrictMock(Compute.class);
  }

  private void initializeSnapshot() {
    snapshot =
        new Snapshot.Builder(compute, SNAPSHOT_ID, SOURCE_DISK)
            .setGeneratedId(GENERATED_ID)
            .setCreationTimestamp(CREATION_TIMESTAMP)
            .setDescription(DESCRIPTION)
            .setStatus(STATUS)
            .setDiskSizeGb(DISK_SIZE_GB)
            .setLicenses(LICENSES)
            .setSourceDiskId(SOURCE_DISK_ID)
            .setStorageBytes(STORAGE_BYTES)
            .setStorageBytesStatus(STORAGE_BYTES_STATUS)
            .build();
  }

  @Test
  public void testToBuilder() {
    initializeExpectedSnapshot(8);
    compareSnapshot(expectedSnapshot, expectedSnapshot.toBuilder().build());
    Snapshot newSnapshot = expectedSnapshot.toBuilder().setDescription("newDescription").build();
    assertEquals("newDescription", newSnapshot.getDescription());
    newSnapshot = newSnapshot.toBuilder().setDescription("description").build();
    compareSnapshot(expectedSnapshot, newSnapshot);
  }

  @Test
  public void testToBuilderIncomplete() {
    initializeExpectedSnapshot(5);
    SnapshotInfo snapshotInfo = SnapshotInfo.of(SNAPSHOT_ID, SOURCE_DISK);
    Snapshot snapshot =
        new Snapshot(serviceMockReturnsOptions, new SnapshotInfo.BuilderImpl(snapshotInfo));
    compareSnapshot(snapshot, snapshot.toBuilder().build());
  }

  @Test
  public void testToAndFromPb() {
    initializeExpectedSnapshot(8);
    compareSnapshot(
        expectedSnapshot, Snapshot.fromPb(serviceMockReturnsOptions, expectedSnapshot.toPb()));
    Snapshot snapshot =
        new Snapshot.Builder(serviceMockReturnsOptions, SNAPSHOT_ID, SOURCE_DISK).build();
    compareSnapshot(snapshot, Snapshot.fromPb(serviceMockReturnsOptions, snapshot.toPb()));
  }

  @Test
  public void testDeleteOperation() {
    initializeExpectedSnapshot(2);
    expect(compute.getOptions()).andReturn(mockOptions);
    Operation operation =
        new Operation.Builder(serviceMockReturnsOptions)
            .setOperationId(GlobalOperationId.of("project", "op"))
            .build();
    expect(compute.deleteSnapshot(SNAPSHOT_ID)).andReturn(operation);
    replay(compute);
    initializeSnapshot();
    assertSame(operation, snapshot.delete());
  }

  @Test
  public void testDeleteNull() {
    initializeExpectedSnapshot(1);
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.deleteSnapshot(SNAPSHOT_ID)).andReturn(null);
    replay(compute);
    initializeSnapshot();
    assertNull(snapshot.delete());
  }

  @Test
  public void testExists_True() throws Exception {
    initializeExpectedSnapshot(1);
    Compute.SnapshotOption[] expectedOptions = {Compute.SnapshotOption.fields()};
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.getSnapshot(SNAPSHOT_ID.getSnapshot(), expectedOptions))
        .andReturn(expectedSnapshot);
    replay(compute);
    initializeSnapshot();
    assertTrue(snapshot.exists());
    verify(compute);
  }

  @Test
  public void testExists_False() throws Exception {
    initializeExpectedSnapshot(1);
    Compute.SnapshotOption[] expectedOptions = {Compute.SnapshotOption.fields()};
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.getSnapshot(SNAPSHOT_ID.getSnapshot(), expectedOptions)).andReturn(null);
    replay(compute);
    initializeSnapshot();
    assertFalse(snapshot.exists());
    verify(compute);
  }

  @Test
  public void testReload() throws Exception {
    initializeExpectedSnapshot(3);
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.getSnapshot(SNAPSHOT_ID.getSnapshot())).andReturn(expectedSnapshot);
    replay(compute);
    initializeSnapshot();
    Snapshot updatedSnapshot = snapshot.reload();
    compareSnapshot(expectedSnapshot, updatedSnapshot);
    verify(compute);
  }

  @Test
  public void testReloadNull() throws Exception {
    initializeExpectedSnapshot(1);
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.getSnapshot(SNAPSHOT_ID.getSnapshot())).andReturn(null);
    replay(compute);
    initializeSnapshot();
    assertNull(snapshot.reload());
    verify(compute);
  }

  @Test
  public void testReloadWithOptions() throws Exception {
    initializeExpectedSnapshot(3);
    expect(compute.getOptions()).andReturn(mockOptions);
    expect(compute.getSnapshot(SNAPSHOT_ID.getSnapshot(), Compute.SnapshotOption.fields()))
        .andReturn(expectedSnapshot);
    replay(compute);
    initializeSnapshot();
    Snapshot updatedSnapshot = snapshot.reload(Compute.SnapshotOption.fields());
    compareSnapshot(expectedSnapshot, updatedSnapshot);
    verify(compute);
  }

  public void compareSnapshot(Snapshot expected, Snapshot value) {
    assertEquals(expected, value);
    assertEquals(expected.getCompute().getOptions(), value.getCompute().getOptions());
    assertEquals(expected.getGeneratedId(), value.getGeneratedId());
    assertEquals(expected.getSnapshotId(), value.getSnapshotId());
    assertEquals(expected.getCreationTimestamp(), value.getCreationTimestamp());
    assertEquals(expected.getDescription(), value.getDescription());
    assertEquals(expected.getStatus(), value.getStatus());
    assertEquals(expected.getDiskSizeGb(), value.getDiskSizeGb());
    assertEquals(expected.getLicenses(), value.getLicenses());
    assertEquals(expected.getSourceDisk(), value.getSourceDisk());
    assertEquals(expected.getSourceDiskId(), value.getSourceDiskId());
    assertEquals(expected.getStorageBytes(), value.getStorageBytes());
    assertEquals(expected.getStorageBytesStatus(), value.getStorageBytesStatus());
    assertEquals(expected.hashCode(), value.hashCode());
  }
}
