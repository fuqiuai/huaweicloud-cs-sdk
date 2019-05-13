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

package com.huaweicloud.cs.java.v1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Body1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-13T17:15:11.676+08:00")
public class Body1 {
  @SerializedName("hosts_id")
  private List<Long> hostsId = null;

  public Body1 hostsId(List<Long> hostsId) {
    this.hostsId = hostsId;
    return this;
  }

  public Body1 addHostsIdItem(Long hostsIdItem) {
    if (this.hostsId == null) {
      this.hostsId = new ArrayList<Long>();
    }
    this.hostsId.add(hostsIdItem);
    return this;
  }

   /**
   * 域名ID列表
   * @return hostsId
  **/
  @ApiModelProperty(value = "域名ID列表")
  public List<Long> getHostsId() {
    return hostsId;
  }

  public void setHostsId(List<Long> hostsId) {
    this.hostsId = hostsId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(this.hostsId, body1.hostsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostsId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    hostsId: ").append(toIndentedString(hostsId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

