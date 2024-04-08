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
 * SearchTagsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-08T19:35:10.437517Z[Etc/UTC]")
public class SearchTagsRequest {
  public static final String SERIALIZED_NAME_TAG_IDENTIFIER = "tag_identifier";
  @SerializedName(SERIALIZED_NAME_TAG_IDENTIFIER)
  private String tagIdentifier;

  public static final String SERIALIZED_NAME_NAME_PATTERN = "name_pattern";
  @SerializedName(SERIALIZED_NAME_NAME_PATTERN)
  private String namePattern;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public SearchTagsRequest() {
  }

  public SearchTagsRequest tagIdentifier(String tagIdentifier) {
    
    this.tagIdentifier = tagIdentifier;
    return this;
  }

   /**
   * Name or Id of the tag.
   * @return tagIdentifier
  **/
  @javax.annotation.Nullable
  public String getTagIdentifier() {
    return tagIdentifier;
  }


  public void setTagIdentifier(String tagIdentifier) {
    this.tagIdentifier = tagIdentifier;
  }


  public SearchTagsRequest namePattern(String namePattern) {
    
    this.namePattern = namePattern;
    return this;
  }

   /**
   * A pattern to match case-insensitive name of the Tag object.
   * @return namePattern
  **/
  @javax.annotation.Nullable
  public String getNamePattern() {
    return namePattern;
  }


  public void setNamePattern(String namePattern) {
    this.namePattern = namePattern;
  }


  public SearchTagsRequest color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Color of the tag.
   * @return color
  **/
  @javax.annotation.Nullable
  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTagsRequest searchTagsRequest = (SearchTagsRequest) o;
    return Objects.equals(this.tagIdentifier, searchTagsRequest.tagIdentifier) &&
        Objects.equals(this.namePattern, searchTagsRequest.namePattern) &&
        Objects.equals(this.color, searchTagsRequest.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagIdentifier, namePattern, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTagsRequest {\n");
    sb.append("    tagIdentifier: ").append(toIndentedString(tagIdentifier)).append("\n");
    sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
    openapiFields.add("tag_identifier");
    openapiFields.add("name_pattern");
    openapiFields.add("color");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchTagsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchTagsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchTagsRequest is not found in the empty JSON string", SearchTagsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchTagsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchTagsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("tag_identifier") != null && !jsonObj.get("tag_identifier").isJsonNull()) && !jsonObj.get("tag_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_identifier").toString()));
      }
      if ((jsonObj.get("name_pattern") != null && !jsonObj.get("name_pattern").isJsonNull()) && !jsonObj.get("name_pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_pattern").toString()));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchTagsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchTagsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchTagsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchTagsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchTagsRequest>() {
           @Override
           public void write(JsonWriter out, SearchTagsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchTagsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchTagsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchTagsRequest
  * @throws IOException if the JSON string is invalid with respect to SearchTagsRequest
  */
  public static SearchTagsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchTagsRequest.class);
  }

 /**
  * Convert an instance of SearchTagsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

