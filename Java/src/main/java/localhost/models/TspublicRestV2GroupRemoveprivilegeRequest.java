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
 * This is a model class for TspublicRestV2GroupRemoveprivilegeRequest type.
 */
public class TspublicRestV2GroupRemoveprivilegeRequest {
    private String name;
    private String id;
    private List<PrivilegeEnum> privileges;

    /**
     * Default constructor.
     */
    public TspublicRestV2GroupRemoveprivilegeRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  privileges  List of PrivilegeEnum value for privileges.
     */
    public TspublicRestV2GroupRemoveprivilegeRequest(
            String name,
            String id,
            List<PrivilegeEnum> privileges) {
        this.name = name;
        this.id = id;
        this.privileges = privileges;
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
     * The GUID of the group to query.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The GUID of the group to query.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Privileges.
     * A JSON array of name of users or GUIDs of users or both. When both are given then id is
     * considered
     * @return Returns the List of PrivilegeEnum
     */
    @JsonGetter("privileges")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PrivilegeEnum> getPrivileges() {
        return privileges;
    }

    /**
     * Setter for Privileges.
     * A JSON array of name of users or GUIDs of users or both. When both are given then id is
     * considered
     * @param privileges Value for List of PrivilegeEnum
     */
    @JsonSetter("privileges")
    public void setPrivileges(List<PrivilegeEnum> privileges) {
        this.privileges = privileges;
    }

    /**
     * Converts this TspublicRestV2GroupRemoveprivilegeRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TspublicRestV2GroupRemoveprivilegeRequest [" + "name=" + name + ", id=" + id
                + ", privileges=" + privileges + "]";
    }

    /**
     * Builds a new {@link TspublicRestV2GroupRemoveprivilegeRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TspublicRestV2GroupRemoveprivilegeRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .id(getId())
                .privileges(getPrivileges());
        return builder;
    }

    /**
     * Class to build instances of {@link TspublicRestV2GroupRemoveprivilegeRequest}.
     */
    public static class Builder {
        private String name;
        private String id;
        private List<PrivilegeEnum> privileges;



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
         * Setter for privileges.
         * @param  privileges  List of PrivilegeEnum value for privileges.
         * @return Builder
         */
        public Builder privileges(List<PrivilegeEnum> privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Builds a new {@link TspublicRestV2GroupRemoveprivilegeRequest} object using the set
         * fields.
         * @return {@link TspublicRestV2GroupRemoveprivilegeRequest}
         */
        public TspublicRestV2GroupRemoveprivilegeRequest build() {
            return new TspublicRestV2GroupRemoveprivilegeRequest(name, id, privileges);
        }
    }
}
