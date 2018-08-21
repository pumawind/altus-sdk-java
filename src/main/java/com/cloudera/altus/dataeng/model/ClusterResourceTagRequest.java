/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.altus.dataeng.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;

/**
 * Tag for a cluster resource.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-08-20T18:25:07.756-07:00")
public class ClusterResourceTagRequest  {

  /**
   * The key of tag.
   **/
  private String key = null;

  /**
   * The value of the tag.
   **/
  private String value = null;

  /**
   * Getter for key.
   **/
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  /**
   * Setter for key.
   **/
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Getter for value.
   **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  /**
   * Setter for value.
   **/
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterResourceTagRequest clusterResourceTagRequest = (ClusterResourceTagRequest) o;
    if (!Objects.equals(this.key, clusterResourceTagRequest.key)) {
      return false;
    }
    if (!Objects.equals(this.value, clusterResourceTagRequest.value)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterResourceTagRequest {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
