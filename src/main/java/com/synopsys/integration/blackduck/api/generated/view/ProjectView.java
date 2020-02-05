/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.ProjectMappingView;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.response.AssignedUserGroupView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionView;
import java.math.BigDecimal;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.view.TagView;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.AssignedUserView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectCloneCategoriesType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectView extends ProjectViewV4 {

	public static final Map<String, LinkResponse> links = new HashMap<>();
    public static final String VERSIONS_LINK = "versions";
    public static final String TAGS_LINK = "tags";
    public static final String CANONICALVERSION_LINK = "canonicalVersion";
    public static final String USERS_LINK = "users";
    public static final String PROJECT_MAPPINGS_LINK = "project-mappings";
    public static final String USERGROUPS_LINK = "usergroups";

	public static final LinkMultipleResponses<ProjectVersionView> VERSIONS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionView>(VERSIONS_LINK, ProjectVersionView.class);
	public static final LinkMultipleResponses<TagView> TAGS_LINK_RESPONSE = new LinkMultipleResponses<TagView>(TAGS_LINK, TagView.class);
	public static final LinkSingleResponse<ProjectVersionView> CANONICALVERSION_LINK_RESPONSE = new LinkSingleResponse<ProjectVersionView>(CANONICALVERSION_LINK, ProjectVersionView.class);
	public static final LinkMultipleResponses<AssignedUserView> USERS_LINK_RESPONSE = new LinkMultipleResponses<AssignedUserView>(USERS_LINK, AssignedUserView.class);
	public static final LinkMultipleResponses<ProjectMappingView> PROJECT_MAPPINGS_LINK_RESPONSE = new LinkMultipleResponses<ProjectMappingView>(PROJECT_MAPPINGS_LINK, ProjectMappingView.class);
	public static final LinkMultipleResponses<AssignedUserGroupView> USERGROUPS_LINK_RESPONSE = new LinkMultipleResponses<AssignedUserGroupView>(USERGROUPS_LINK, AssignedUserGroupView.class);

    static {
	    links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
	    links.put(TAGS_LINK, TAGS_LINK_RESPONSE);
	    links.put(CANONICALVERSION_LINK, CANONICALVERSION_LINK_RESPONSE);
	    links.put(USERS_LINK, USERS_LINK_RESPONSE);
	    links.put(PROJECT_MAPPINGS_LINK, PROJECT_MAPPINGS_LINK_RESPONSE);
	    links.put(USERGROUPS_LINK, USERGROUPS_LINK_RESPONSE);
    }
}
