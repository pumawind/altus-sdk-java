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
import com.cloudera.altus.dataeng.model.CreateAWSClusterRequestComputeWorkersConfiguration;
import com.cloudera.altus.dataeng.model.CreateAWSClusterRequestWorkersConfiguration;
import com.cloudera.altus.dataeng.model.JobRequest;
import java.util.*;

/**
 * Request object for a create AWS cluster request.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-05-02T12:03:45.446-07:00")
public class CreateAWSClusterRequest  {

  /**
   * The name of the cluster. This name must be unique, must have a maximum of 128 characters, and must contain only alphanumeric characters and hyphens. Names are case-sensitive.
   **/
  private String clusterName = null;

  /**
   * The CDH version.
   **/
  private String cdhVersion = null;

  /**
   * The EC2 instance type for the worker nodes.
   **/
  private String instanceType = null;

  /**
   * The service type.
   **/
  private String serviceType = null;

  /**
   * Name or CRN of the environment to use when creating the the cluster. The environment must be an AWS environment.
   **/
  private String environmentName = null;

  /**
   * The worker nodes group size.
   **/
  private Integer workersGroupSize = null;

  /**
   * The ssh private key.
   **/
  private String sshPrivateKey = null;

  /**
   * Instance bootstrap script that is executed on all the cluster instances immediately after startup before any services are configured and started. You can use it to install additional OS packages or application dependencies. This is not intended to be a mechanism for cluster configuration.
   **/
  private String instanceBootstrapScript = null;

  /**
   * 
   **/
  private CreateAWSClusterRequestComputeWorkersConfiguration computeWorkersConfiguration = null;

  /**
   * 
   **/
  private CreateAWSClusterRequestWorkersConfiguration workersConfiguration = null;

  /**
   * The username to login to cluster's Cloudera Manager as readonly user. The default is 'guest'.
   **/
  private String clouderaManagerUsername = null;

  /**
   * The password to login to cluster's Cloudera Manager as readonly user. The default is autogenerated random UUID.
   **/
  private String clouderaManagerPassword = null;

  /**
   * The condition under which a cluster should be automatically terminated. If not specified, NONE will be used. If EMPTY_JOB_QUEUE is specified, then a list of jobs must also be specified as part of the cluster creation request.
   **/
  private String automaticTerminationCondition = null;

  /**
   * A name for the group of submitted jobs. If not specified and this is a request to submit a single, named job, the job submission group name will match the job name. Otherwise, the job submission group name will match the generated job submission group ID. This name must have a maximum of 128 characters, and must contain only alphanumeric characters, spaces, colons, hyphens and underscores. Names are case-sensitive.
   **/
  private String jobSubmissionGroupName = null;

  /**
   * A list of jobs to submit to the cluster. Each job in the list should specify only one of hiveJob, sparkJob, pySparkJob, or mr2Job.
   **/
  private List<JobRequest> jobs = new ArrayList<JobRequest>();

  /**
   * The SSH public key to connect to the cluster. The user uses the private key that corresponds to the public key to SSH into the cluster.
   **/
  private String publicKey = null;

  /**
   * Getter for clusterName.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for cdhVersion.
   **/
  @JsonProperty("cdhVersion")
  public String getCdhVersion() {
    return cdhVersion;
  }

  /**
   * Setter for cdhVersion.
   **/
  public void setCdhVersion(String cdhVersion) {
    this.cdhVersion = cdhVersion;
  }

  /**
   * Getter for instanceType.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for serviceType.
   **/
  @JsonProperty("serviceType")
  public String getServiceType() {
    return serviceType;
  }

  /**
   * Setter for serviceType.
   **/
  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  /**
   * Getter for environmentName.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for workersGroupSize.
   **/
  @JsonProperty("workersGroupSize")
  public Integer getWorkersGroupSize() {
    return workersGroupSize;
  }

  /**
   * Setter for workersGroupSize.
   **/
  public void setWorkersGroupSize(Integer workersGroupSize) {
    this.workersGroupSize = workersGroupSize;
  }

  /**
   * Getter for sshPrivateKey.
   **/
  @JsonProperty("sshPrivateKey")
  public String getSshPrivateKey() {
    return sshPrivateKey;
  }

  /**
   * Setter for sshPrivateKey.
   **/
  public void setSshPrivateKey(String sshPrivateKey) {
    this.sshPrivateKey = sshPrivateKey;
  }

  /**
   * Getter for instanceBootstrapScript.
   **/
  @JsonProperty("instanceBootstrapScript")
  public String getInstanceBootstrapScript() {
    return instanceBootstrapScript;
  }

  /**
   * Setter for instanceBootstrapScript.
   **/
  public void setInstanceBootstrapScript(String instanceBootstrapScript) {
    this.instanceBootstrapScript = instanceBootstrapScript;
  }

  /**
   * Getter for computeWorkersConfiguration.
   **/
  @JsonProperty("computeWorkersConfiguration")
  public CreateAWSClusterRequestComputeWorkersConfiguration getComputeWorkersConfiguration() {
    return computeWorkersConfiguration;
  }

  /**
   * Setter for computeWorkersConfiguration.
   **/
  public void setComputeWorkersConfiguration(CreateAWSClusterRequestComputeWorkersConfiguration computeWorkersConfiguration) {
    this.computeWorkersConfiguration = computeWorkersConfiguration;
  }

  /**
   * Getter for workersConfiguration.
   **/
  @JsonProperty("workersConfiguration")
  public CreateAWSClusterRequestWorkersConfiguration getWorkersConfiguration() {
    return workersConfiguration;
  }

  /**
   * Setter for workersConfiguration.
   **/
  public void setWorkersConfiguration(CreateAWSClusterRequestWorkersConfiguration workersConfiguration) {
    this.workersConfiguration = workersConfiguration;
  }

  /**
   * Getter for clouderaManagerUsername.
   **/
  @JsonProperty("clouderaManagerUsername")
  public String getClouderaManagerUsername() {
    return clouderaManagerUsername;
  }

  /**
   * Setter for clouderaManagerUsername.
   **/
  public void setClouderaManagerUsername(String clouderaManagerUsername) {
    this.clouderaManagerUsername = clouderaManagerUsername;
  }

  /**
   * Getter for clouderaManagerPassword.
   **/
  @JsonProperty("clouderaManagerPassword")
  public String getClouderaManagerPassword() {
    return clouderaManagerPassword;
  }

  /**
   * Setter for clouderaManagerPassword.
   **/
  public void setClouderaManagerPassword(String clouderaManagerPassword) {
    this.clouderaManagerPassword = clouderaManagerPassword;
  }

  /**
   * Getter for automaticTerminationCondition.
   **/
  @JsonProperty("automaticTerminationCondition")
  public String getAutomaticTerminationCondition() {
    return automaticTerminationCondition;
  }

  /**
   * Setter for automaticTerminationCondition.
   **/
  public void setAutomaticTerminationCondition(String automaticTerminationCondition) {
    this.automaticTerminationCondition = automaticTerminationCondition;
  }

  /**
   * Getter for jobSubmissionGroupName.
   **/
  @JsonProperty("jobSubmissionGroupName")
  public String getJobSubmissionGroupName() {
    return jobSubmissionGroupName;
  }

  /**
   * Setter for jobSubmissionGroupName.
   **/
  public void setJobSubmissionGroupName(String jobSubmissionGroupName) {
    this.jobSubmissionGroupName = jobSubmissionGroupName;
  }

  /**
   * Getter for jobs.
   **/
  @JsonProperty("jobs")
  public List<JobRequest> getJobs() {
    return jobs;
  }

  /**
   * Setter for jobs.
   **/
  public void setJobs(List<JobRequest> jobs) {
    this.jobs = jobs;
  }

  /**
   * Getter for publicKey.
   **/
  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * Setter for publicKey.
   **/
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAWSClusterRequest createAWSClusterRequest = (CreateAWSClusterRequest) o;
    if (!Objects.equals(this.clusterName, createAWSClusterRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.cdhVersion, createAWSClusterRequest.cdhVersion)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, createAWSClusterRequest.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.serviceType, createAWSClusterRequest.serviceType)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, createAWSClusterRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.workersGroupSize, createAWSClusterRequest.workersGroupSize)) {
      return false;
    }
    if (!Objects.equals(this.sshPrivateKey, createAWSClusterRequest.sshPrivateKey)) {
      return false;
    }
    if (!Objects.equals(this.instanceBootstrapScript, createAWSClusterRequest.instanceBootstrapScript)) {
      return false;
    }
    if (!Objects.equals(this.computeWorkersConfiguration, createAWSClusterRequest.computeWorkersConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.workersConfiguration, createAWSClusterRequest.workersConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.clouderaManagerUsername, createAWSClusterRequest.clouderaManagerUsername)) {
      return false;
    }
    if (!Objects.equals(this.clouderaManagerPassword, createAWSClusterRequest.clouderaManagerPassword)) {
      return false;
    }
    if (!Objects.equals(this.automaticTerminationCondition, createAWSClusterRequest.automaticTerminationCondition)) {
      return false;
    }
    if (!Objects.equals(this.jobSubmissionGroupName, createAWSClusterRequest.jobSubmissionGroupName)) {
      return false;
    }
    if (!Objects.equals(this.jobs, createAWSClusterRequest.jobs)) {
      return false;
    }
    if (!Objects.equals(this.publicKey, createAWSClusterRequest.publicKey)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, cdhVersion, instanceType, serviceType, environmentName, workersGroupSize, sshPrivateKey, instanceBootstrapScript, computeWorkersConfiguration, workersConfiguration, clouderaManagerUsername, clouderaManagerPassword, automaticTerminationCondition, jobSubmissionGroupName, jobs, publicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAWSClusterRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    cdhVersion: ").append(toIndentedString(cdhVersion)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    workersGroupSize: ").append(toIndentedString(workersGroupSize)).append("\n");
    sb.append("    sshPrivateKey: ").append(toIndentedString(sshPrivateKey)).append("\n");
    sb.append("    instanceBootstrapScript: ").append(toIndentedString(instanceBootstrapScript)).append("\n");
    sb.append("    computeWorkersConfiguration: ").append(toIndentedString(computeWorkersConfiguration)).append("\n");
    sb.append("    workersConfiguration: ").append(toIndentedString(workersConfiguration)).append("\n");
    sb.append("    clouderaManagerUsername: ").append(toIndentedString(clouderaManagerUsername)).append("\n");
    sb.append("    clouderaManagerPassword: ").append(toIndentedString(clouderaManagerPassword)).append("\n");
    sb.append("    automaticTerminationCondition: ").append(toIndentedString(automaticTerminationCondition)).append("\n");
    sb.append("    jobSubmissionGroupName: ").append(toIndentedString(jobSubmissionGroupName)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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

