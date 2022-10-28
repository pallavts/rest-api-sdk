/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for TspublicRestV2CustomactionSearchRequest type.
 */
public class TspublicRestV2CustomactionSearchRequest {
    private List<String> tag;

    /**
     * Default constructor.
     */
    public TspublicRestV2CustomactionSearchRequest() {
    }

    /**
     * Initialization constructor.
     * @param  tag  List of String value for tag.
     */
    public TspublicRestV2CustomactionSearchRequest(
            List<String> tag) {
        this.tag = tag;
    }

    /**
     * Getter for Tag.
     * A JSON array of tag GUIDs. If tags are applied to worksheets, search answers, or Liveboard
     * visualizations, and custom actions are associated to these objects, you can use this
     * parameter to filter the custom action data by tags.
     * @return Returns the List of String
     */
    @JsonGetter("tag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getTag() {
        return tag;
    }

    /**
     * Setter for Tag.
     * A JSON array of tag GUIDs. If tags are applied to worksheets, search answers, or Liveboard
     * visualizations, and custom actions are associated to these objects, you can use this
     * parameter to filter the custom action data by tags.
     * @param tag Value for List of String
     */
    @JsonSetter("tag")
    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    /**
     * Converts this TspublicRestV2CustomactionSearchRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2CustomactionSearchRequest [" + "tag=" + tag + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2CustomactionSearchRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2CustomactionSearchRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .tag(getTag());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2CustomactionSearchRequest}.
     */
    public static class Builder {
        private List<String> tag;



        /**
         * Setter for tag.
         * @param  tag  List of String value for tag.
         * @return Builder
         */
        public Builder tag(List<String> tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2CustomactionSearchRequest} object using the set fields.
         * @return {@link TspublicRestV2CustomactionSearchRequest}
         */
        public TspublicRestV2CustomactionSearchRequest build() {
            return new TspublicRestV2CustomactionSearchRequest(tag);
        }
    }
}
