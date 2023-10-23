/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.authz.valve.internal;

import org.wso2.carbon.identity.authz.service.AuthorizationManager;
import org.wso2.carbon.identity.organization.management.service.OrganizationManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Service Holder.
 */
public class AuthorizationValveServiceHolder {

    private static AuthorizationValveServiceHolder authorizationValveServiceHolder = new
            AuthorizationValveServiceHolder();
    private OrganizationManager organizationManager;

    private List<AuthorizationManager> authorizationManagerList = new ArrayList<>();

    private AuthorizationValveServiceHolder() {
    }

    public static AuthorizationValveServiceHolder getInstance() {
        return AuthorizationValveServiceHolder.authorizationValveServiceHolder;
    }

    public List<AuthorizationManager> getAuthorizationManagerList() {
        return authorizationManagerList;
    }

    public void setAuthorizationManagerList(List<AuthorizationManager> authorizationManagerList) {
        this.authorizationManagerList = authorizationManagerList;
    }

    public OrganizationManager getOrganizationManager() {

        return organizationManager;
    }

    public void setOrganizationManager(
            OrganizationManager organizationManager) {

        this.organizationManager = organizationManager;
    }
}
