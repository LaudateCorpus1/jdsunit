/*
 *
 *
 * Copyright 2012-2016 Viant.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 *
 */
package com.viant.dsunit;

import org.codehaus.jackson.annotate .JsonIgnoreProperties;
import org.codehaus.jackson.annotate .JsonProperty;

import java.util.List;

/**
 * ExecuteScriptRequest represents sql script.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ExecuteScriptRequest {

    @JsonProperty("Scripts")
    private List<Script> scripts;

    public List<Script> getScripts() {
        return scripts;
    }

    public void setScripts(List<Script> scripts) {
        this.scripts = scripts;
    }
}
