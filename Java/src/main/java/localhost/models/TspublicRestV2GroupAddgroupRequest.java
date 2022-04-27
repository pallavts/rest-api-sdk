/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for TspublicRestV2GroupAddgroupRequest type.
 */
public class TspublicRestV2GroupAddgroupRequest {
    private String name;
    private String id;
    private List<GroupNameAndIDInput> groups;

    /**
     * Default constructor.
     */
    public TspublicRestV2GroupAddgroupRequest() {
    }

    /**
     * Initialization constructor.
     * @param  groups  List of GroupNameAndIDInput value for groups.
     * @param  name  String value for name.
     * @param  id  String value for id.
     */
    public TspublicRestV2GroupAddgroupRequest(
            List<GroupNameAndIDInput> groups,
            String name,
            String id) {
        this.name = name;
        this.id = id;
        this.groups = groups;
    }

    /**
     * Getter for Name.
     * Name of the group
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the group
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * The GUID of the group
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The GUID of the group
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Groups.
     * A JSON array of group names or GUIDs or both. When both are given then id is considered
     * @return Returns the List of GroupNameAndIDInput
     */
    @JsonGetter("groups")
    public List<GroupNameAndIDInput> getGroups() {
        return groups;
    }

    /**
     * Setter for Groups.
     * A JSON array of group names or GUIDs or both. When both are given then id is considered
     * @param groups Value for List of GroupNameAndIDInput
     */
    @JsonSetter("groups")
    public void setGroups(List<GroupNameAndIDInput> groups) {
        this.groups = groups;
    }

    /**
     * Converts this TspublicRestV2GroupAddgroupRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2GroupAddgroupRequest [" + "groups=" + groups + ", name=" + name
                + ", id=" + id + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2GroupAddgroupRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2GroupAddgroupRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(groups)
                .name(getName())
                .id(getId());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2GroupAddgroupRequest}.
     */
    public static class Builder {
        private List<GroupNameAndIDInput> groups;
        private String name;
        private String id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  groups  List of GroupNameAndIDInput value for groups.
         */
        public Builder(List<GroupNameAndIDInput> groups) {
            this.groups = groups;
        }

        /**
         * Setter for groups.
         * @param  groups  List of GroupNameAndIDInput value for groups.
         * @return Builder
         */
        public Builder groups(List<GroupNameAndIDInput> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2GroupAddgroupRequest} object using the set fields.
         * @return {@link TspublicRestV2GroupAddgroupRequest}
         */
        public TspublicRestV2GroupAddgroupRequest build() {
            return new TspublicRestV2GroupAddgroupRequest(groups, name, id);
        }
    }
}
