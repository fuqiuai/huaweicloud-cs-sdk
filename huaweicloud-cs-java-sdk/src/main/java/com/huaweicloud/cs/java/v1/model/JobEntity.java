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
import com.huaweicloud.cs.java.v1.model.JobConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * JobEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-30T09:32:56.282+08:00")
public class JobEntity {
  @SerializedName("job_id")
  private Long jobId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("job_type")
  private String jobType = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("status_desc")
  private String statusDesc = null;

  @SerializedName("create_time")
  private Long createTime = null;

  @SerializedName("start_time")
  private Long startTime = null;

  @SerializedName("duration")
  private Long duration = null;

  @SerializedName("root_id")
  private Long rootId = null;

  @SerializedName("edge_group_ids")
  private String edgeGroupIds = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("cluster_id")
  private Integer clusterId = null;

  @SerializedName("project_id")
  private String projectId = null;

  @SerializedName("sql_body")
  private String sqlBody = null;

  /**
   * 作业运行模式，共享或者独享模式或者边缘节点, show_detail为true时独有
   */
  @JsonAdapter(RunModeEnum.Adapter.class)
  public enum RunModeEnum {
    SHARED_CLUSTER("shared_cluster"),
    
    EXCLUSIVE_CLUSTER("exclusive_cluster"),
    
    EDGE_NODE("edge_node");

    private String value;

    RunModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RunModeEnum fromValue(String text) {
      for (RunModeEnum b : RunModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RunModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RunModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RunModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RunModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("run_mode")
  private RunModeEnum runMode = null;

  @SerializedName("job_config")
  private JobConfig jobConfig = null;

  @SerializedName("jar_url")
  private String jarUrl = null;

  @SerializedName("main_class")
  private String mainClass = null;

  @SerializedName("args")
  private String args = null;

  @SerializedName("execution_graph")
  private String executionGraph = null;

  @SerializedName("update_time")
  private Long updateTime = null;

  public JobEntity jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * 作业ID
   * @return jobId
  **/
  @ApiModelProperty(value = "作业ID")
  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public JobEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 作业名称
   * @return name
  **/
  @ApiModelProperty(example = "my_job_001", value = "作业名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JobEntity desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 作业描述
   * @return desc
  **/
  @ApiModelProperty(value = "作业描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public JobEntity username(String username) {
    this.username = username;
    return this;
  }

   /**
   * 用户名, show_detail为false时独有
   * @return username
  **/
  @ApiModelProperty(value = "用户名, show_detail为false时独有")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public JobEntity jobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

   /**
   * 作业类型
   * @return jobType
  **/
  @ApiModelProperty(value = "作业类型")
  public String getJobType() {
    return jobType;
  }

  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  public JobEntity status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 作业状态
   * @return status
  **/
  @ApiModelProperty(value = "作业状态")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public JobEntity statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

   /**
   * 作业状态描述
   * @return statusDesc
  **/
  @ApiModelProperty(value = "作业状态描述")
  public String getStatusDesc() {
    return statusDesc;
  }

  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }

  public JobEntity createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 作业创建时间
   * @return createTime
  **/
  @ApiModelProperty(value = "作业创建时间")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public JobEntity startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 作业启动时间, 0尚未启动
   * @return startTime
  **/
  @ApiModelProperty(value = "作业启动时间, 0尚未启动")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public JobEntity duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * 作业运行时长, 单位ms, show_detail为false时独有
   * @return duration
  **/
  @ApiModelProperty(value = "作业运行时长, 单位ms, show_detail为false时独有")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public JobEntity rootId(Long rootId) {
    this.rootId = rootId;
    return this;
  }

   /**
   * 父作业ID, show_detail为false时独有
   * @return rootId
  **/
  @ApiModelProperty(value = "父作业ID, show_detail为false时独有")
  public Long getRootId() {
    return rootId;
  }

  public void setRootId(Long rootId) {
    this.rootId = rootId;
  }

  public JobEntity edgeGroupIds(String edgeGroupIds) {
    this.edgeGroupIds = edgeGroupIds;
    return this;
  }

   /**
   * 边缘计算组ID列表, 多个ID以逗号分隔, show_detail为false时独有
   * @return edgeGroupIds
  **/
  @ApiModelProperty(value = "边缘计算组ID列表, 多个ID以逗号分隔, show_detail为false时独有")
  public String getEdgeGroupIds() {
    return edgeGroupIds;
  }

  public void setEdgeGroupIds(String edgeGroupIds) {
    this.edgeGroupIds = edgeGroupIds;
  }

  public JobEntity userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 作业所属用户标识, show_detail为true时独有
   * @return userId
  **/
  @ApiModelProperty(value = "作业所属用户标识, show_detail为true时独有")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public JobEntity clusterId(Integer clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * 独享集群资源ID, 当前用户有该独享资源的使用权限, show_detail为true时独有
   * @return clusterId
  **/
  @ApiModelProperty(value = "独享集群资源ID, 当前用户有该独享资源的使用权限, show_detail为true时独有")
  public Integer getClusterId() {
    return clusterId;
  }

  public void setClusterId(Integer clusterId) {
    this.clusterId = clusterId;
  }

  public JobEntity projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 作业所属项目标识, show_detail为true时独有
   * @return projectId
  **/
  @ApiModelProperty(value = "作业所属项目标识, show_detail为true时独有")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public JobEntity sqlBody(String sqlBody) {
    this.sqlBody = sqlBody;
    return this;
  }

   /**
   * Stream SQL语句, show_detail为true时独有
   * @return sqlBody
  **/
  @ApiModelProperty(example = "select * from source_table", value = "Stream SQL语句, show_detail为true时独有")
  public String getSqlBody() {
    return sqlBody;
  }

  public void setSqlBody(String sqlBody) {
    this.sqlBody = sqlBody;
  }

  public JobEntity runMode(RunModeEnum runMode) {
    this.runMode = runMode;
    return this;
  }

   /**
   * 作业运行模式，共享或者独享模式或者边缘节点, show_detail为true时独有
   * @return runMode
  **/
  @ApiModelProperty(example = "shared_cluster", value = "作业运行模式，共享或者独享模式或者边缘节点, show_detail为true时独有")
  public RunModeEnum getRunMode() {
    return runMode;
  }

  public void setRunMode(RunModeEnum runMode) {
    this.runMode = runMode;
  }

  public JobEntity jobConfig(JobConfig jobConfig) {
    this.jobConfig = jobConfig;
    return this;
  }

   /**
   * Get jobConfig
   * @return jobConfig
  **/
  @ApiModelProperty(value = "")
  public JobConfig getJobConfig() {
    return jobConfig;
  }

  public void setJobConfig(JobConfig jobConfig) {
    this.jobConfig = jobConfig;
  }

  public JobEntity jarUrl(String jarUrl) {
    this.jarUrl = jarUrl;
    return this;
  }

   /**
   * jar包的OBS路径, show_detail为true时独有
   * @return jarUrl
  **/
  @ApiModelProperty(value = "jar包的OBS路径, show_detail为true时独有")
  public String getJarUrl() {
    return jarUrl;
  }

  public void setJarUrl(String jarUrl) {
    this.jarUrl = jarUrl;
  }

  public JobEntity mainClass(String mainClass) {
    this.mainClass = mainClass;
    return this;
  }

   /**
   * checkpoint_enabled&#x3D;&#x3D;true是, 用户授权保存快照的OBS路径, show_detail为true时独有
   * @return mainClass
  **/
  @ApiModelProperty(value = "checkpoint_enabled==true是, 用户授权保存快照的OBS路径, show_detail为true时独有")
  public String getMainClass() {
    return mainClass;
  }

  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  public JobEntity args(String args) {
    this.args = args;
    return this;
  }

   /**
   * jar包作业运行参数, show_detail为true时独有
   * @return args
  **/
  @ApiModelProperty(value = "jar包作业运行参数, show_detail为true时独有")
  public String getArgs() {
    return args;
  }

  public void setArgs(String args) {
    this.args = args;
  }

  public JobEntity executionGraph(String executionGraph) {
    this.executionGraph = executionGraph;
    return this;
  }

   /**
   * 作业执行计划, show_detail为true时独有
   * @return executionGraph
  **/
  @ApiModelProperty(value = "作业执行计划, show_detail为true时独有")
  public String getExecutionGraph() {
    return executionGraph;
  }

  public void setExecutionGraph(String executionGraph) {
    this.executionGraph = executionGraph;
  }

  public JobEntity updateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 作业更新时间, show_detail为true时独有
   * @return updateTime
  **/
  @ApiModelProperty(value = "作业更新时间, show_detail为true时独有")
  public Long getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobEntity jobEntity = (JobEntity) o;
    return Objects.equals(this.jobId, jobEntity.jobId) &&
        Objects.equals(this.name, jobEntity.name) &&
        Objects.equals(this.desc, jobEntity.desc) &&
        Objects.equals(this.username, jobEntity.username) &&
        Objects.equals(this.jobType, jobEntity.jobType) &&
        Objects.equals(this.status, jobEntity.status) &&
        Objects.equals(this.statusDesc, jobEntity.statusDesc) &&
        Objects.equals(this.createTime, jobEntity.createTime) &&
        Objects.equals(this.startTime, jobEntity.startTime) &&
        Objects.equals(this.duration, jobEntity.duration) &&
        Objects.equals(this.rootId, jobEntity.rootId) &&
        Objects.equals(this.edgeGroupIds, jobEntity.edgeGroupIds) &&
        Objects.equals(this.userId, jobEntity.userId) &&
        Objects.equals(this.clusterId, jobEntity.clusterId) &&
        Objects.equals(this.projectId, jobEntity.projectId) &&
        Objects.equals(this.sqlBody, jobEntity.sqlBody) &&
        Objects.equals(this.runMode, jobEntity.runMode) &&
        Objects.equals(this.jobConfig, jobEntity.jobConfig) &&
        Objects.equals(this.jarUrl, jobEntity.jarUrl) &&
        Objects.equals(this.mainClass, jobEntity.mainClass) &&
        Objects.equals(this.args, jobEntity.args) &&
        Objects.equals(this.executionGraph, jobEntity.executionGraph) &&
        Objects.equals(this.updateTime, jobEntity.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, name, desc, username, jobType, status, statusDesc, createTime, startTime, duration, rootId, edgeGroupIds, userId, clusterId, projectId, sqlBody, runMode, jobConfig, jarUrl, mainClass, args, executionGraph, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobEntity {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
    sb.append("    edgeGroupIds: ").append(toIndentedString(edgeGroupIds)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
    sb.append("    runMode: ").append(toIndentedString(runMode)).append("\n");
    sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
    sb.append("    jarUrl: ").append(toIndentedString(jarUrl)).append("\n");
    sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    executionGraph: ").append(toIndentedString(executionGraph)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

