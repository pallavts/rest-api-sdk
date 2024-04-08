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
import org.thoughtspot.client.model.APIKey;
import org.thoughtspot.client.model.BasicAuth;

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
 * Authorization type for the custom action.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-08T19:35:10.437517Z[Etc/UTC]")
public class Authentication {
  public static final String SERIALIZED_NAME_AP_I_KEY = "API_Key";
  @SerializedName(SERIALIZED_NAME_AP_I_KEY)
  private APIKey apIKey;

  public static final String SERIALIZED_NAME_BASIC_AUTH = "Basic_Auth";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
  private BasicAuth basicAuth;

  public static final String SERIALIZED_NAME_BEARER_TOKEN = "Bearer_Token";
  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN)
  private String bearerToken;

  public static final String SERIALIZED_NAME_NO_AUTH = "No_Auth";
  @SerializedName(SERIALIZED_NAME_NO_AUTH)
  private String noAuth;

  public Authentication() {
  }

  public Authentication apIKey(APIKey apIKey) {
    
    this.apIKey = apIKey;
    return this;
  }

   /**
   * Get apIKey
   * @return apIKey
  **/
  @javax.annotation.Nullable
  public APIKey getApIKey() {
    return apIKey;
  }


  public void setApIKey(APIKey apIKey) {
    this.apIKey = apIKey;
  }


  public Authentication basicAuth(BasicAuth basicAuth) {
    
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @javax.annotation.Nullable
  public BasicAuth getBasicAuth() {
    return basicAuth;
  }


  public void setBasicAuth(BasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }


  public Authentication bearerToken(String bearerToken) {
    
    this.bearerToken = bearerToken;
    return this;
  }

   /**
   * Bearer tokens enable requests to authenticate using an access key.
   * @return bearerToken
  **/
  @javax.annotation.Nullable
  public String getBearerToken() {
    return bearerToken;
  }


  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }


  public Authentication noAuth(String noAuth) {
    
    this.noAuth = noAuth;
    return this;
  }

   /**
   * No authorization. If your request doesn&#39;t require authorization.
   * @return noAuth
  **/
  @javax.annotation.Nullable
  public String getNoAuth() {
    return noAuth;
  }


  public void setNoAuth(String noAuth) {
    this.noAuth = noAuth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authentication authentication = (Authentication) o;
    return Objects.equals(this.apIKey, authentication.apIKey) &&
        Objects.equals(this.basicAuth, authentication.basicAuth) &&
        Objects.equals(this.bearerToken, authentication.bearerToken) &&
        Objects.equals(this.noAuth, authentication.noAuth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apIKey, basicAuth, bearerToken, noAuth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authentication {\n");
    sb.append("    apIKey: ").append(toIndentedString(apIKey)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    noAuth: ").append(toIndentedString(noAuth)).append("\n");
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
    openapiFields.add("API_Key");
    openapiFields.add("Basic_Auth");
    openapiFields.add("Bearer_Token");
    openapiFields.add("No_Auth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Authentication
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Authentication.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Authentication is not found in the empty JSON string", Authentication.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Authentication.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Authentication` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `API_Key`
      if (jsonObj.get("API_Key") != null && !jsonObj.get("API_Key").isJsonNull()) {
        APIKey.validateJsonObject(jsonObj.getAsJsonObject("API_Key"));
      }
      // validate the optional field `Basic_Auth`
      if (jsonObj.get("Basic_Auth") != null && !jsonObj.get("Basic_Auth").isJsonNull()) {
        BasicAuth.validateJsonObject(jsonObj.getAsJsonObject("Basic_Auth"));
      }
      if ((jsonObj.get("Bearer_Token") != null && !jsonObj.get("Bearer_Token").isJsonNull()) && !jsonObj.get("Bearer_Token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Bearer_Token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Bearer_Token").toString()));
      }
      if ((jsonObj.get("No_Auth") != null && !jsonObj.get("No_Auth").isJsonNull()) && !jsonObj.get("No_Auth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `No_Auth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("No_Auth").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Authentication.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Authentication' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Authentication> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Authentication.class));

       return (TypeAdapter<T>) new TypeAdapter<Authentication>() {
           @Override
           public void write(JsonWriter out, Authentication value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Authentication read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Authentication given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Authentication
  * @throws IOException if the JSON string is invalid with respect to Authentication
  */
  public static Authentication fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Authentication.class);
  }

 /**
  * Convert an instance of Authentication to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

