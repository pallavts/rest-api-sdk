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
import org.thoughtspot.client.model.SharePermissionsInput;

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
 * ShareMetadataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-08T19:35:10.437517Z[Etc/UTC]")
public class ShareMetadataRequest {
  /**
   * Type of metadata. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view.
   */
  @JsonAdapter(MetadataTypeEnum.Adapter.class)
  public enum MetadataTypeEnum {
    LIVEBOARD("LIVEBOARD"),
    
    ANSWER("ANSWER"),
    
    LOGICAL_TABLE("LOGICAL_TABLE");

    private String value;

    MetadataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MetadataTypeEnum fromValue(String value) {
      for (MetadataTypeEnum b : MetadataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MetadataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MetadataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MetadataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MetadataTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METADATA_TYPE = "metadata_type";
  @SerializedName(SERIALIZED_NAME_METADATA_TYPE)
  private MetadataTypeEnum metadataType;

  public static final String SERIALIZED_NAME_METADATA_IDENTIFIERS = "metadata_identifiers";
  @SerializedName(SERIALIZED_NAME_METADATA_IDENTIFIERS)
  private List<String> metadataIdentifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<SharePermissionsInput> permissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS = "visualization_identifiers";
  @SerializedName(SERIALIZED_NAME_VISUALIZATION_IDENTIFIERS)
  private List<String> visualizationIdentifiers;

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<String> emails = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ENABLE_CUSTOM_URL = "enable_custom_url";
  @SerializedName(SERIALIZED_NAME_ENABLE_CUSTOM_URL)
  private Boolean enableCustomUrl = false;

  public static final String SERIALIZED_NAME_NOTIFY_ON_SHARE = "notify_on_share";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_SHARE)
  private Boolean notifyOnShare = true;

  public static final String SERIALIZED_NAME_HAS_LENIENT_DISCOVERABILITY = "has_lenient_discoverability";
  @SerializedName(SERIALIZED_NAME_HAS_LENIENT_DISCOVERABILITY)
  private Boolean hasLenientDiscoverability = false;

  public ShareMetadataRequest() {
  }

  public ShareMetadataRequest metadataType(MetadataTypeEnum metadataType) {
    
    this.metadataType = metadataType;
    return this;
  }

   /**
   * Type of metadata. 1. Liveboard 2. Answers 3. LOGICAL_TABLE for any data object such as table, worksheet or view.
   * @return metadataType
  **/
  @javax.annotation.Nullable
  public MetadataTypeEnum getMetadataType() {
    return metadataType;
  }


  public void setMetadataType(MetadataTypeEnum metadataType) {
    this.metadataType = metadataType;
  }


  public ShareMetadataRequest metadataIdentifiers(List<String> metadataIdentifiers) {
    
    this.metadataIdentifiers = metadataIdentifiers;
    return this;
  }

  public ShareMetadataRequest addMetadataIdentifiersItem(String metadataIdentifiersItem) {
    if (this.metadataIdentifiers == null) {
      this.metadataIdentifiers = new ArrayList<>();
    }
    this.metadataIdentifiers.add(metadataIdentifiersItem);
    return this;
  }

   /**
   * Unique ID or name of metadata objects. Note: All the identifiers should belong to same metadata_type
   * @return metadataIdentifiers
  **/
  @javax.annotation.Nonnull
  public List<String> getMetadataIdentifiers() {
    return metadataIdentifiers;
  }


  public void setMetadataIdentifiers(List<String> metadataIdentifiers) {
    this.metadataIdentifiers = metadataIdentifiers;
  }


  public ShareMetadataRequest permissions(List<SharePermissionsInput> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public ShareMetadataRequest addPermissionsItem(SharePermissionsInput permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Permission details for sharing the objects.
   * @return permissions
  **/
  @javax.annotation.Nonnull
  public List<SharePermissionsInput> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<SharePermissionsInput> permissions) {
    this.permissions = permissions;
  }


  public ShareMetadataRequest visualizationIdentifiers(List<String> visualizationIdentifiers) {
    
    this.visualizationIdentifiers = visualizationIdentifiers;
    return this;
  }

  public ShareMetadataRequest addVisualizationIdentifiersItem(String visualizationIdentifiersItem) {
    if (this.visualizationIdentifiers == null) {
      this.visualizationIdentifiers = new ArrayList<>();
    }
    this.visualizationIdentifiers.add(visualizationIdentifiersItem);
    return this;
  }

   /**
   * Options to specify details of Liveboard.
   * @return visualizationIdentifiers
  **/
  @javax.annotation.Nullable
  public List<String> getVisualizationIdentifiers() {
    return visualizationIdentifiers;
  }


  public void setVisualizationIdentifiers(List<String> visualizationIdentifiers) {
    this.visualizationIdentifiers = visualizationIdentifiers;
  }


  public ShareMetadataRequest emails(List<String> emails) {
    
    this.emails = emails;
    return this;
  }

  public ShareMetadataRequest addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Email IDs to which notifications will be sent.
   * @return emails
  **/
  @javax.annotation.Nonnull
  public List<String> getEmails() {
    return emails;
  }


  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  public ShareMetadataRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message to be included in notification.
   * @return message
  **/
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ShareMetadataRequest enableCustomUrl(Boolean enableCustomUrl) {
    
    this.enableCustomUrl = enableCustomUrl;
    return this;
  }

   /**
   * Sends object URLs in the customized format in email notifications.
   * @return enableCustomUrl
  **/
  @javax.annotation.Nullable
  public Boolean getEnableCustomUrl() {
    return enableCustomUrl;
  }


  public void setEnableCustomUrl(Boolean enableCustomUrl) {
    this.enableCustomUrl = enableCustomUrl;
  }


  public ShareMetadataRequest notifyOnShare(Boolean notifyOnShare) {
    
    this.notifyOnShare = notifyOnShare;
    return this;
  }

   /**
   * Flag to notify user when any object is shared.
   * @return notifyOnShare
  **/
  @javax.annotation.Nullable
  public Boolean getNotifyOnShare() {
    return notifyOnShare;
  }


  public void setNotifyOnShare(Boolean notifyOnShare) {
    this.notifyOnShare = notifyOnShare;
  }


  public ShareMetadataRequest hasLenientDiscoverability(Boolean hasLenientDiscoverability) {
    
    this.hasLenientDiscoverability = hasLenientDiscoverability;
    return this;
  }

   /**
   * Flag to make the object discoverable.
   * @return hasLenientDiscoverability
  **/
  @javax.annotation.Nullable
  public Boolean getHasLenientDiscoverability() {
    return hasLenientDiscoverability;
  }


  public void setHasLenientDiscoverability(Boolean hasLenientDiscoverability) {
    this.hasLenientDiscoverability = hasLenientDiscoverability;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareMetadataRequest shareMetadataRequest = (ShareMetadataRequest) o;
    return Objects.equals(this.metadataType, shareMetadataRequest.metadataType) &&
        Objects.equals(this.metadataIdentifiers, shareMetadataRequest.metadataIdentifiers) &&
        Objects.equals(this.permissions, shareMetadataRequest.permissions) &&
        Objects.equals(this.visualizationIdentifiers, shareMetadataRequest.visualizationIdentifiers) &&
        Objects.equals(this.emails, shareMetadataRequest.emails) &&
        Objects.equals(this.message, shareMetadataRequest.message) &&
        Objects.equals(this.enableCustomUrl, shareMetadataRequest.enableCustomUrl) &&
        Objects.equals(this.notifyOnShare, shareMetadataRequest.notifyOnShare) &&
        Objects.equals(this.hasLenientDiscoverability, shareMetadataRequest.hasLenientDiscoverability);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataType, metadataIdentifiers, permissions, visualizationIdentifiers, emails, message, enableCustomUrl, notifyOnShare, hasLenientDiscoverability);
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
    sb.append("class ShareMetadataRequest {\n");
    sb.append("    metadataType: ").append(toIndentedString(metadataType)).append("\n");
    sb.append("    metadataIdentifiers: ").append(toIndentedString(metadataIdentifiers)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    visualizationIdentifiers: ").append(toIndentedString(visualizationIdentifiers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    enableCustomUrl: ").append(toIndentedString(enableCustomUrl)).append("\n");
    sb.append("    notifyOnShare: ").append(toIndentedString(notifyOnShare)).append("\n");
    sb.append("    hasLenientDiscoverability: ").append(toIndentedString(hasLenientDiscoverability)).append("\n");
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
    openapiFields.add("metadata_type");
    openapiFields.add("metadata_identifiers");
    openapiFields.add("permissions");
    openapiFields.add("visualization_identifiers");
    openapiFields.add("emails");
    openapiFields.add("message");
    openapiFields.add("enable_custom_url");
    openapiFields.add("notify_on_share");
    openapiFields.add("has_lenient_discoverability");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata_identifiers");
    openapiRequiredFields.add("permissions");
    openapiRequiredFields.add("emails");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShareMetadataRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShareMetadataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShareMetadataRequest is not found in the empty JSON string", ShareMetadataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ShareMetadataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShareMetadataRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShareMetadataRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("metadata_type") != null && !jsonObj.get("metadata_type").isJsonNull()) && !jsonObj.get("metadata_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata_type").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("metadata_identifiers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("metadata_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("metadata_identifiers").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }

      JsonArray jsonArraypermissions = jsonObj.getAsJsonArray("permissions");
      // validate the required field `permissions` (array)
      for (int i = 0; i < jsonArraypermissions.size(); i++) {
        SharePermissionsInput.validateJsonObject(jsonArraypermissions.get(i).getAsJsonObject());
      };
      // ensure the optional json data is an array if present
      if (jsonObj.get("visualization_identifiers") != null && !jsonObj.get("visualization_identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `visualization_identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("visualization_identifiers").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("emails") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("emails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emails` to be an array in the JSON string but got `%s`", jsonObj.get("emails").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShareMetadataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShareMetadataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShareMetadataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShareMetadataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ShareMetadataRequest>() {
           @Override
           public void write(JsonWriter out, ShareMetadataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShareMetadataRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShareMetadataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShareMetadataRequest
  * @throws IOException if the JSON string is invalid with respect to ShareMetadataRequest
  */
  public static ShareMetadataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShareMetadataRequest.class);
  }

 /**
  * Convert an instance of ShareMetadataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

