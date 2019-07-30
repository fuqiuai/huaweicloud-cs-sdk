/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huaweicloud.cs.java.v1;

import com.huaweicloud.cs.java.v1.client.ApiException;
import com.huaweicloud.cs.java.v1.model.AuditLogResponse;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogApi
 */
@Ignore
public class LogApiTest {

    private final LogApi api = new LogApi();

    
    /**
     * 查询审计日志
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditLogsTest() throws ApiException {
        String projectId = null;
        String resourceType = null;
        String cursor = null;
        String resourceId = null;
        Integer pageNumber = null;
        Integer limit = null;
        AuditLogResponse response = api.getAuditLogs(projectId, resourceType, cursor, resourceId, pageNumber, limit);

        // TODO: test validations
    }
    
}
