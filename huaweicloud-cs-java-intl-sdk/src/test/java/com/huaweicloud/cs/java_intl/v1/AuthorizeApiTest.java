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

package com.huaweicloud.cs.java_intl.v1;

import com.huaweicloud.cs.java_intl.v1.client.ApiException;
import com.huaweicloud.cs.java_intl.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java_intl.v1.model.GlobalResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorizeApi
 */
@Ignore
public class AuthorizeApiTest {

    private final AuthorizeApi api = new AuthorizeApi();

    
    /**
     * 用户主动授权起OBS桶的操作权限给CS服务, 用于保存用户作业的checkpoint、作业的运行日志等
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizeBucketTest() throws ApiException {
        String xProjectId = null;
        List<String> body = null;
        GlobalResponse response = api.authorizeBucket(xProjectId, body);

        // TODO: test validations
    }
    
}
