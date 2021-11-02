/*
 * TSPublicRestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ApiRestV2GroupUpdateRequest type.
 */
public class ApiRestV2GroupUpdateRequest {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String displayName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private VisibilityEnum visibility;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Privilege1Enum> privileges;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> groupNames;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> userNames;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> assignedPinboards;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Type3Enum type;

    /**
     * Default constructor.
     */
    public ApiRestV2GroupUpdateRequest() {
        visibility = VisibilityEnum.DEFAULT;
        type = Type3Enum.LOCAL_GROUP;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  displayName  String value for displayName.
     * @param  visibility  VisibilityEnum value for visibility.
     * @param  description  String value for description.
     * @param  privileges  List of Privilege1Enum value for privileges.
     * @param  groupNames  List of String value for groupNames.
     * @param  userNames  List of String value for userNames.
     * @param  assignedPinboards  List of String value for assignedPinboards.
     * @param  type  Type3Enum value for type.
     */
    public ApiRestV2GroupUpdateRequest(
            String name,
            String id,
            String displayName,
            VisibilityEnum visibility,
            String description,
            List<Privilege1Enum> privileges,
            List<String> groupNames,
            List<String> userNames,
            List<String> assignedPinboards,
            Type3Enum type) {
        this.name = name;
        this.id = id;
        this.displayName = displayName;
        this.visibility = visibility;
        this.description = description;
        this.privileges = privileges;
        this.groupNames = groupNames;
        this.userNames = userNames;
        this.assignedPinboards = assignedPinboards;
        this.type = type;
    }

    /**
     * Getter for Name.
     * Name of the user group
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the user group
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * GUID of the group to update
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * GUID of the group to update
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for DisplayName.
     * A unique display name string for the user group, for example, Developer group.
     * @return Returns the String
     */
    @JsonGetter("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter for DisplayName.
     * A unique display name string for the user group, for example, Developer group.
     * @param displayName Value for String
     */
    @JsonSetter("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for Visibility.
     * Visibility of the user. The visibility attribute is set to DEFAULT when creating a user.
     * Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows
     * them to share objects
     * @return Returns the VisibilityEnum
     */
    @JsonGetter("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility.
     * Visibility of the user. The visibility attribute is set to DEFAULT when creating a user.
     * Setting this to DEFAULT makes a user visible to other users and user groups, and thus allows
     * them to share objects
     * @param visibility Value for VisibilityEnum
     */
    @JsonSetter("visibility")
    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    /**
     * Getter for Description.
     * Description text for the group.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description text for the group.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Privileges.
     * A JSON array of privileges assigned to the group
     * @return Returns the List of Privilege1Enum
     */
    @JsonGetter("privileges")
    public List<Privilege1Enum> getPrivileges() {
        return privileges;
    }

    /**
     * Setter for Privileges.
     * A JSON array of privileges assigned to the group
     * @param privileges Value for List of Privilege1Enum
     */
    @JsonSetter("privileges")
    public void setPrivileges(List<Privilege1Enum> privileges) {
        this.privileges = privileges;
    }

    /**
     * Getter for GroupNames.
     * A JSON array of group names
     * @return Returns the List of String
     */
    @JsonGetter("groupNames")
    public List<String> getGroupNames() {
        return groupNames;
    }

    /**
     * Setter for GroupNames.
     * A JSON array of group names
     * @param groupNames Value for List of String
     */
    @JsonSetter("groupNames")
    public void setGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
    }

    /**
     * Getter for UserNames.
     * A JSON array of user names
     * @return Returns the List of String
     */
    @JsonGetter("userNames")
    public List<String> getUserNames() {
        return userNames;
    }

    /**
     * Setter for UserNames.
     * A JSON array of user names
     * @param userNames Value for List of String
     */
    @JsonSetter("userNames")
    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    /**
     * Getter for AssignedPinboards.
     * An array of pinboard ids to be assigned to the group.
     * @return Returns the List of String
     */
    @JsonGetter("assignedPinboards")
    public List<String> getAssignedPinboards() {
        return assignedPinboards;
    }

    /**
     * Setter for AssignedPinboards.
     * An array of pinboard ids to be assigned to the group.
     * @param assignedPinboards Value for List of String
     */
    @JsonSetter("assignedPinboards")
    public void setAssignedPinboards(List<String> assignedPinboards) {
        this.assignedPinboards = assignedPinboards;
    }

    /**
     * Getter for Type.
     * Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot
     * system.
     * @return Returns the Type3Enum
     */
    @JsonGetter("type")
    public Type3Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of user group. LOCAL_GROUP indicates that the user is created locally in the ThoughtSpot
     * system.
     * @param type Value for Type3Enum
     */
    @JsonSetter("type")
    public void setType(Type3Enum type) {
        this.type = type;
    }

    /**
     * Converts this ApiRestV2GroupUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiRestV2GroupUpdateRequest [" + "name=" + name + ", id=" + id + ", displayName="
                + displayName + ", visibility=" + visibility + ", description=" + description
                + ", privileges=" + privileges + ", groupNames=" + groupNames + ", userNames="
                + userNames + ", assignedPinboards=" + assignedPinboards + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link ApiRestV2GroupUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiRestV2GroupUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .id(getId())
                .displayName(getDisplayName())
                .visibility(getVisibility())
                .description(getDescription())
                .privileges(getPrivileges())
                .groupNames(getGroupNames())
                .userNames(getUserNames())
                .assignedPinboards(getAssignedPinboards())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link ApiRestV2GroupUpdateRequest}.
     */
    public static class Builder {
        private String name;
        private String id;
        private String displayName;
        private VisibilityEnum visibility = VisibilityEnum.DEFAULT;
        private String description;
        private List<Privilege1Enum> privileges;
        private List<String> groupNames;
        private List<String> userNames;
        private List<String> assignedPinboards;
        private Type3Enum type = Type3Enum.LOCAL_GROUP;



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
         * Setter for displayName.
         * @param  displayName  String value for displayName.
         * @return Builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Setter for visibility.
         * @param  visibility  VisibilityEnum value for visibility.
         * @return Builder
         */
        public Builder visibility(VisibilityEnum visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for privileges.
         * @param  privileges  List of Privilege1Enum value for privileges.
         * @return Builder
         */
        public Builder privileges(List<Privilege1Enum> privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Setter for groupNames.
         * @param  groupNames  List of String value for groupNames.
         * @return Builder
         */
        public Builder groupNames(List<String> groupNames) {
            this.groupNames = groupNames;
            return this;
        }

        /**
         * Setter for userNames.
         * @param  userNames  List of String value for userNames.
         * @return Builder
         */
        public Builder userNames(List<String> userNames) {
            this.userNames = userNames;
            return this;
        }

        /**
         * Setter for assignedPinboards.
         * @param  assignedPinboards  List of String value for assignedPinboards.
         * @return Builder
         */
        public Builder assignedPinboards(List<String> assignedPinboards) {
            this.assignedPinboards = assignedPinboards;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  Type3Enum value for type.
         * @return Builder
         */
        public Builder type(Type3Enum type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link ApiRestV2GroupUpdateRequest} object using the set fields.
         * @return {@link ApiRestV2GroupUpdateRequest}
         */
        public ApiRestV2GroupUpdateRequest build() {
            return new ApiRestV2GroupUpdateRequest(name, id, displayName, visibility, description,
                    privileges, groupNames, userNames, assignedPinboards, type);
        }
    }
}
