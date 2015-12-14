/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.reef.vortex.common;

import org.apache.reef.annotations.Unstable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Report of a tasklet execution result.
 */
@Unstable
public final class TaskletResultReport<TOutput extends Serializable> implements TaskletReport {
  private final List<Integer> taskletIds;
  private final TOutput result;

  /**
   * @param taskletIds of the tasklets.
   * @param result of the tasklet execution.
   */
  public TaskletResultReport(final List<Integer> taskletIds, final TOutput result) {
    this.taskletIds = Collections.unmodifiableList(new ArrayList<>(taskletIds));
    this.result = result;
  }

  /**
   * @return the type of this TaskletReport.
   */
  @Override
  public TaskletReportType getType() {
    return TaskletReportType.TaskletResult;
  }

  /**
   * Returns multiple TaskletIds if the result is from an Aggregation.
   * Returns a single TaskletId if the result is from a single Tasklet.
   * @return the TaskletId(s) of this TaskletReport
   */
  public List<Integer> getTaskletIds() {
    return taskletIds;
  }

  /**
   * @return the result of the tasklet execution.
   */
  public TOutput getResult() {
    return result;
  }

}