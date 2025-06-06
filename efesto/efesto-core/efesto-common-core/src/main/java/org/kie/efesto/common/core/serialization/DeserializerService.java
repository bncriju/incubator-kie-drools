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
package org.kie.efesto.common.core.serialization;

import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * This is used to dynamically discover all the implementation-specific deserializers that are present in the classloader.
 * For each custom-made deserializer, an instance of this interface has to be provided.
 * <code>JSONUtils</code> will dynamically discover them to configure the ObjectMapper
 * @param <T>
 */
public interface DeserializerService<T> {

    Class<T> type();
    JsonDeserializer<? extends T> deser();
}
