package com.microsoft.reef.runtime.common.evaluator;

import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Copyright (C) 2014 Microsoft Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Default implementation for re-establishing connection to driver after driver restart
 * By default the information about re-started driver will be obtained by querying
 * Http-server
 */

public final class DefaultDriverConnection implements DriverConnection{

  private static final Logger LOG = Logger.getLogger(DefaultDriverConnection.class.getName());

  @Inject
  public DefaultDriverConnection() {
  }

  @Override
  public String GetDriverRemoteIdentifier()
  {
    LOG.log(Level.INFO, "Trying to get driver remote identifier by querying Http server.");
    // TODO: implement a proper mechanism to obtain driver remote identifier.
    return null;
  }

  @Override
  public void close()
  {
  }

}