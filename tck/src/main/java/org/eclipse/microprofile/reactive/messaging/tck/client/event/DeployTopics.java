/**
 * Copyright (c) 2018-2019 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.microprofile.reactive.messaging.tck.client.event;

import org.jboss.arquillian.container.spi.client.container.DeployableContainer;

import java.util.List;

public class DeployTopics extends TopicEvent {
    private final List<String> topics;

    public DeployTopics(DeployableContainer<?> deployableContainer, List<String> topics) {
        super(deployableContainer);
        this.topics = topics;
    }

    public List<String> getTopics() {
        return topics;
    }
}