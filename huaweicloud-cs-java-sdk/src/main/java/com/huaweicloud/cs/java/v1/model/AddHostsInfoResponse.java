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
import com.huaweicloud.cs.java.v1.model.AddHostsInfoResponsePayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddHostsInfoResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-13T17:15:11.676+08:00")
public class AddHostsInfoResponse {
  @SerializedName("message_id")
  private String messageId = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("current_time")
  private Long currentTime = null;

  @SerializedName("payload")
  private AddHostsInfoResponsePayload payload = null;

  public AddHostsInfoResponse messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * 消息类型ID
   * @return messageId
  **/
  @ApiModelProperty(example = "CS.22018", value = "消息类型ID")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public AddHostsInfoResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 消息内容
   * @return message
  **/
  @ApiModelProperty(example = "host信息添加成功", value = "消息内容")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AddHostsInfoResponse currentTime(Long currentTime) {
    this.currentTime = currentTime;
    return this;
  }

   /**
   * 当前时间, 毫秒数
   * @return currentTime
  **/
  @ApiModelProperty(example = "4000000", value = "当前时间, 毫秒数")
  public Long getCurrentTime() {
    return currentTime;
  }

  public void setCurrentTime(Long currentTime) {
    this.currentTime = currentTime;
  }

  public AddHostsInfoResponse payload(AddHostsInfoResponsePayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")
  public AddHostsInfoResponsePayload getPayload() {
    return payload;
  }

  public void setPayload(AddHostsInfoResponsePayload payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddHostsInfoResponse addHostsInfoResponse = (AddHostsInfoResponse) o;
    return Objects.equals(this.messageId, addHostsInfoResponse.messageId) &&
        Objects.equals(this.message, addHostsInfoResponse.message) &&
        Objects.equals(this.currentTime, addHostsInfoResponse.currentTime) &&
        Objects.equals(this.payload, addHostsInfoResponse.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, message, currentTime, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddHostsInfoResponse {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

