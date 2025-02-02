/*
 * Copyright 2014 DataGenerator Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.finra.datagenerator.engine;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Represents a partial search produced by an Engine's bootstrapping.
 */
public interface Frontier {

    /**
     * Fills the queue with Maps of variable assignments produced by a DFS strategy;
     * the DFS is performed on a possible state bound up inside the Frontier and will
     * stop early if flag is set to true
     *
     * @param queue the queue
     * @param flag the exit flag
     */
    void searchForScenarios(Queue<Map<String, String>> queue, AtomicBoolean flag);

}
