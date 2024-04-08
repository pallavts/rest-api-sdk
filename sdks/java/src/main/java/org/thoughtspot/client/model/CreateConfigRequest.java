/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.thoughtspot.client.JSON;

/**
 * CreateConfigRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-08T19:35:10.437517Z[Etc/UTC]")
public class CreateConfigRequest {
  public static final String SERIALIZED_NAME_REPOSITORY_URL = "repository_url";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_URL)
  private String repositoryUrl;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_ORG_IDENTIFIER = "org_identifier";
  @SerializedName(SERIALIZED_NAME_ORG_IDENTIFIER)
  private String orgIdentifier;

  public static final String SERIALIZED_NAME_BRANCH_NAMES = "branch_names";
  @SerializedName(SERIALIZED_NAME_BRANCH_NAMES)
  private List<String> branchNames;

  public static final String SERIALIZED_NAME_COMMIT_BRANCH_NAME = "commit_branch_name";
  @SerializedName(SERIALIZED_NAME_COMMIT_BRANCH_NAME)
  private String commitBranchName;

  public static final String SERIALIZED_NAME_DEFAULT_BRANCH_NAME = "default_branch_name";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_DEFAULT_BRANCH_NAME)
  private String defaultBranchName;

  public static final String SERIALIZED_NAME_ENABLE_GUID_MAPPING = "enable_guid_mapping";
  @SerializedName(SERIALIZED_NAME_ENABLE_GUID_MAPPING)
  private Boolean enableGuidMapping = true;

  public static final String SERIALIZED_NAME_CONFIGURATION_BRANCH_NAME = "configuration_branch_name";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_BRANCH_NAME)
  private String configurationBranchName;

  public static final String SERIALIZED_NAME_GUID_MAPPING_BRANCH_NAME = "guid_mapping_branch_name";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_GUID_MAPPING_BRANCH_NAME)
  private String guidMappingBranchName;

  public CreateConfigRequest() {
  }

  public CreateConfigRequest repositoryUrl(String repositoryUrl) {
    
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * URL for connecting to remote repository
   * @return repositoryUrl
  **/
  @javax.annotation.Nonnull
  public String getRepositoryUrl() {
    return repositoryUrl;
  }


  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }


  public CreateConfigRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username to authenticate connection to remote repository
   * @return username
  **/
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public CreateConfigRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Access token corresponding to the user to authenticate connection to remote repository
   * @return accessToken
  **/
  @javax.annotation.Nonnull
  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public CreateConfigRequest orgIdentifier(String orgIdentifier) {
    
    this.orgIdentifier = orgIdentifier;
    return this;
  }

   /**
   *    Applicable when Orgs is enabled in the cluster      List of Org ids or name. Provide value -1 for cluster level. Example : [\&quot;OrgID1-or-Name1\&quot;, \&quot;OrgID2-or-Name2\&quot;]         Note: If no value is specified, then the configurations will be returned for all orgs the user has access to     Version: 9.5.0.cl or later 
   * @return orgIdentifier
  **/
  @javax.annotation.Nullable
  public String getOrgIdentifier() {
    return orgIdentifier;
  }


  public void setOrgIdentifier(String orgIdentifier) {
    this.orgIdentifier = orgIdentifier;
  }


  public CreateConfigRequest branchNames(List<String> branchNames) {
    
    this.branchNames = branchNames;
    return this;
  }

  public CreateConfigRequest addBranchNamesItem(String branchNamesItem) {
    if (this.branchNames == null) {
      this.branchNames = new ArrayList<>();
    }
    this.branchNames.add(branchNamesItem);
    return this;
  }

   /**
   * List the remote branches to configure. Example:[development, production]
   * @return branchNames
  **/
  @javax.annotation.Nullable
  public List<String> getBranchNames() {
    return branchNames;
  }


  public void setBranchNames(List<String> branchNames) {
    this.branchNames = branchNames;
  }


  public CreateConfigRequest commitBranchName(String commitBranchName) {
    
    this.commitBranchName = commitBranchName;
    return this;
  }

   /**
   * Name of the remote branch where objects from this Thoughtspot instance will be versioned.    Version: 9.7.0.cl or later 
   * @return commitBranchName
  **/
  @javax.annotation.Nullable
  public String getCommitBranchName() {
    return commitBranchName;
  }


  public void setCommitBranchName(String commitBranchName) {
    this.commitBranchName = commitBranchName;
  }


  @Deprecated
  public CreateConfigRequest defaultBranchName(String defaultBranchName) {
    
    this.defaultBranchName = defaultBranchName;
    return this;
  }

   /**
   *    Use commit_branch_name instead.      Name of the remote branch where objects from this Thoughtspot instance will be versioned.        *Deprecated from 10.0.0.cl : Replaced by commit_branch_name* 
   * @return defaultBranchName
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getDefaultBranchName() {
    return defaultBranchName;
  }


  @Deprecated
  public void setDefaultBranchName(String defaultBranchName) {
    this.defaultBranchName = defaultBranchName;
  }


  public CreateConfigRequest enableGuidMapping(Boolean enableGuidMapping) {
    
    this.enableGuidMapping = enableGuidMapping;
    return this;
  }

   /**
   * Maintain mapping of guid for the deployment to an instance    Version: 9.4.0.cl or later 
   * @return enableGuidMapping
  **/
  @javax.annotation.Nullable
  public Boolean getEnableGuidMapping() {
    return enableGuidMapping;
  }


  public void setEnableGuidMapping(Boolean enableGuidMapping) {
    this.enableGuidMapping = enableGuidMapping;
  }


  public CreateConfigRequest configurationBranchName(String configurationBranchName) {
    
    this.configurationBranchName = configurationBranchName;
    return this;
  }

   /**
   *    Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.      Note: If no branch name is specified, then by default, ts_config_files branch is considered. Ensure this branch exists before configuration.    Version: 9.7.0.cl or later 
   * @return configurationBranchName
  **/
  @javax.annotation.Nullable
  public String getConfigurationBranchName() {
    return configurationBranchName;
  }


  public void setConfigurationBranchName(String configurationBranchName) {
    this.configurationBranchName = configurationBranchName;
  }


  @Deprecated
  public CreateConfigRequest guidMappingBranchName(String guidMappingBranchName) {
    
    this.guidMappingBranchName = guidMappingBranchName;
    return this;
  }

   /**
   *    Use configuration_branch_name instead.      Name of the branch where the configuration files related to operations between Thoughtspot and version control repo should be maintained.        Note: If no branch name is specified, then by default, ts_config_files branch is considered. Ensure this branch exists before configuration.         *Deprecated from 10.0.0.cl : Replaced by configuration_branch_name*     Version: 9.4.0.cl or later 
   * @return guidMappingBranchName
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getGuidMappingBranchName() {
    return guidMappingBranchName;
  }


  @Deprecated
  public void setGuidMappingBranchName(String guidMappingBranchName) {
    this.guidMappingBranchName = guidMappingBranchName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConfigRequest createConfigRequest = (CreateConfigRequest) o;
    return Objects.equals(this.repositoryUrl, createConfigRequest.repositoryUrl) &&
        Objects.equals(this.username, createConfigRequest.username) &&
        Objects.equals(this.accessToken, createConfigRequest.accessToken) &&
        Objects.equals(this.orgIdentifier, createConfigRequest.orgIdentifier) &&
        Objects.equals(this.branchNames, createConfigRequest.branchNames) &&
        Objects.equals(this.commitBranchName, createConfigRequest.commitBranchName) &&
        Objects.equals(this.defaultBranchName, createConfigRequest.defaultBranchName) &&
        Objects.equals(this.enableGuidMapping, createConfigRequest.enableGuidMapping) &&
        Objects.equals(this.configurationBranchName, createConfigRequest.configurationBranchName) &&
        Objects.equals(this.guidMappingBranchName, createConfigRequest.guidMappingBranchName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryUrl, username, accessToken, orgIdentifier, branchNames, commitBranchName, defaultBranchName, enableGuidMapping, configurationBranchName, guidMappingBranchName);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConfigRequest {\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    orgIdentifier: ").append(toIndentedString(orgIdentifier)).append("\n");
    sb.append("    branchNames: ").append(toIndentedString(branchNames)).append("\n");
    sb.append("    commitBranchName: ").append(toIndentedString(commitBranchName)).append("\n");
    sb.append("    defaultBranchName: ").append(toIndentedString(defaultBranchName)).append("\n");
    sb.append("    enableGuidMapping: ").append(toIndentedString(enableGuidMapping)).append("\n");
    sb.append("    configurationBranchName: ").append(toIndentedString(configurationBranchName)).append("\n");
    sb.append("    guidMappingBranchName: ").append(toIndentedString(guidMappingBranchName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("repository_url");
    openapiFields.add("username");
    openapiFields.add("access_token");
    openapiFields.add("org_identifier");
    openapiFields.add("branch_names");
    openapiFields.add("commit_branch_name");
    openapiFields.add("default_branch_name");
    openapiFields.add("enable_guid_mapping");
    openapiFields.add("configuration_branch_name");
    openapiFields.add("guid_mapping_branch_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("repository_url");
    openapiRequiredFields.add("username");
    openapiRequiredFields.add("access_token");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateConfigRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateConfigRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateConfigRequest is not found in the empty JSON string", CreateConfigRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateConfigRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateConfigRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateConfigRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("repository_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repository_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repository_url").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if (!jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if ((jsonObj.get("org_identifier") != null && !jsonObj.get("org_identifier").isJsonNull()) && !jsonObj.get("org_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_identifier").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("branch_names") != null && !jsonObj.get("branch_names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch_names` to be an array in the JSON string but got `%s`", jsonObj.get("branch_names").toString()));
      }
      if ((jsonObj.get("commit_branch_name") != null && !jsonObj.get("commit_branch_name").isJsonNull()) && !jsonObj.get("commit_branch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_branch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_branch_name").toString()));
      }
      if ((jsonObj.get("default_branch_name") != null && !jsonObj.get("default_branch_name").isJsonNull()) && !jsonObj.get("default_branch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_branch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_branch_name").toString()));
      }
      if ((jsonObj.get("configuration_branch_name") != null && !jsonObj.get("configuration_branch_name").isJsonNull()) && !jsonObj.get("configuration_branch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration_branch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configuration_branch_name").toString()));
      }
      if ((jsonObj.get("guid_mapping_branch_name") != null && !jsonObj.get("guid_mapping_branch_name").isJsonNull()) && !jsonObj.get("guid_mapping_branch_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid_mapping_branch_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid_mapping_branch_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateConfigRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateConfigRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateConfigRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateConfigRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateConfigRequest>() {
           @Override
           public void write(JsonWriter out, CreateConfigRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateConfigRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateConfigRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateConfigRequest
  * @throws IOException if the JSON string is invalid with respect to CreateConfigRequest
  */
  public static CreateConfigRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateConfigRequest.class);
  }

 /**
  * Convert an instance of CreateConfigRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

