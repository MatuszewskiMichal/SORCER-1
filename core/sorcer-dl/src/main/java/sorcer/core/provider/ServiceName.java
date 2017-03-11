/*
 * Copyright 2014 the original author or authors.
 * Copyright 2014 SorcerSoft.org.
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

package sorcer.core.provider;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mike Sobolewski on 5/22/16.
 */
public class ServiceName extends ProviderName {

//    DiscoveryGroupManagement.ALL_GROUPS;
//    DiscoveryGroupManagement.NO_GROUPS;
    // initilaize to NO_GROUPS
    private String[]  groups = new String[0];

    private  String[] locators;

    public ServiceName() {
        super();
        this.groups = new String[] {};
    }

    public ServiceName(String name, String... groups) {
        super(name);
        this.groups = groups;
    }

    public ServiceName(String name, String[] locators, String... groups) {
        super(name);
        this.locators = locators;
        this.groups = groups;
    }

    public String[] getGroups() {
        return groups;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }

    public String[] getLocators() {
        return locators;
    }

    public void setLocators(String[] locators) {
        this.locators = locators;
    }

    public void setLocators(List<String> locators) {
        this.locators = new String[locators.size()];
        this.locators = locators.toArray(this.locators);
    }

    @Override
    public String toString() {
        return name + ":" + Arrays.toString(groups);
    }

    @Override
    public void setName(String name) {
        if (name != null)
            throw  new RuntimeException("Name is not modifible!");
        else
            this.name = name;
    }
}