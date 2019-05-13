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

package com.huaweicloud.cs.java_intl.v1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NewReservedClusterRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-13T19:29:08.677+08:00")
public class NewReservedClusterRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("maximum_spu_quota")
  private Integer maximumSpuQuota = null;

  @SerializedName("vpc_cidr")
  private String vpcCidr = null;

  @SerializedName("subnet_cidr")
  private String subnetCidr = null;

  @SerializedName("subnet_gateway")
  private String subnetGateway = null;

  public NewReservedClusterRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 集群名称
   * @return name
  **/
  @ApiModelProperty(example = "my cluster", required = true, value = "集群名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewReservedClusterRequest desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 集群描述
   * @return desc
  **/
  @ApiModelProperty(example = "集群描述", value = "集群描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public NewReservedClusterRequest maximumSpuQuota(Integer maximumSpuQuota) {
    this.maximumSpuQuota = maximumSpuQuota;
    return this;
  }

   /**
   * 集群最大SPU配额
   * @return maximumSpuQuota
  **/
  @ApiModelProperty(example = "100", value = "集群最大SPU配额")
  public Integer getMaximumSpuQuota() {
    return maximumSpuQuota;
  }

  public void setMaximumSpuQuota(Integer maximumSpuQuota) {
    this.maximumSpuQuota = maximumSpuQuota;
  }

  public NewReservedClusterRequest vpcCidr(String vpcCidr) {
    this.vpcCidr = vpcCidr;
    return this;
  }

   /**
   * VPC网段
   * @return vpcCidr
  **/
  @ApiModelProperty(example = "172.16.0.0/23", value = "VPC网段")
  public String getVpcCidr() {
    return vpcCidr;
  }

  public void setVpcCidr(String vpcCidr) {
    this.vpcCidr = vpcCidr;
  }

  public NewReservedClusterRequest subnetCidr(String subnetCidr) {
    this.subnetCidr = subnetCidr;
    return this;
  }

   /**
   * 子网网段
   * @return subnetCidr
  **/
  @ApiModelProperty(example = "172.16.0.0/23", value = "子网网段")
  public String getSubnetCidr() {
    return subnetCidr;
  }

  public void setSubnetCidr(String subnetCidr) {
    this.subnetCidr = subnetCidr;
  }

  public NewReservedClusterRequest subnetGateway(String subnetGateway) {
    this.subnetGateway = subnetGateway;
    return this;
  }

   /**
   * 子网网关
   * @return subnetGateway
  **/
  @ApiModelProperty(example = "172.16.0.1", value = "子网网关")
  public String getSubnetGateway() {
    return subnetGateway;
  }

  public void setSubnetGateway(String subnetGateway) {
    this.subnetGateway = subnetGateway;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewReservedClusterRequest newReservedClusterRequest = (NewReservedClusterRequest) o;
    return Objects.equals(this.name, newReservedClusterRequest.name) &&
        Objects.equals(this.desc, newReservedClusterRequest.desc) &&
        Objects.equals(this.maximumSpuQuota, newReservedClusterRequest.maximumSpuQuota) &&
        Objects.equals(this.vpcCidr, newReservedClusterRequest.vpcCidr) &&
        Objects.equals(this.subnetCidr, newReservedClusterRequest.subnetCidr) &&
        Objects.equals(this.subnetGateway, newReservedClusterRequest.subnetGateway);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, desc, maximumSpuQuota, vpcCidr, subnetCidr, subnetGateway);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewReservedClusterRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    maximumSpuQuota: ").append(toIndentedString(maximumSpuQuota)).append("\n");
    sb.append("    vpcCidr: ").append(toIndentedString(vpcCidr)).append("\n");
    sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
    sb.append("    subnetGateway: ").append(toIndentedString(subnetGateway)).append("\n");
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

