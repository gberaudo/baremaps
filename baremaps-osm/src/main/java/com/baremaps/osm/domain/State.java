/*
 * Copyright (C) 2020 The Baremaps Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.baremaps.osm.domain;

import java.time.LocalDateTime;

/**
 * Represents the state of an OpenStreetMap dataset, enabling its replication.
 */
public class State {

  private final long sequenceNumber;

  private final LocalDateTime timestamp;

  public State(long sequenceNumber, LocalDateTime timestamp) {
    this.sequenceNumber = sequenceNumber;
    this.timestamp = timestamp;
  }

  public long getSequenceNumber() {
    return sequenceNumber;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

}
