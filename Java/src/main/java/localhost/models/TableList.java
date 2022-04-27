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
 * This is a model class for TableList type.
 */
public class TableList {
    private String name;
    private String type;
    private String id;
    private String databaseStripe;
    private String schemaStripe;
    private TableListIsExternalEnum isExternal;
    private TableListIsDeprecatedEnum isDeprecated;
    private TableListIsDeletedEnum isDeleted;
    private TableListIsHiddenEnum isHidden;
    private Double indexVersion;
    private Double generationNum;
    private String created;
    private String modified;
    private UserNameAndID author;
    private UserNameAndID modifiedBy;
    private UserNameAndID owner;
    private List<String> tags;

    /**
     * Default constructor.
     */
    public TableList() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  type  String value for type.
     * @param  id  String value for id.
     * @param  databaseStripe  String value for databaseStripe.
     * @param  schemaStripe  String value for schemaStripe.
     * @param  isExternal  TableListIsExternalEnum value for isExternal.
     * @param  isDeprecated  TableListIsDeprecatedEnum value for isDeprecated.
     * @param  isDeleted  TableListIsDeletedEnum value for isDeleted.
     * @param  isHidden  TableListIsHiddenEnum value for isHidden.
     * @param  indexVersion  Double value for indexVersion.
     * @param  generationNum  Double value for generationNum.
     * @param  created  String value for created.
     * @param  modified  String value for modified.
     * @param  author  UserNameAndID value for author.
     * @param  modifiedBy  UserNameAndID value for modifiedBy.
     * @param  owner  UserNameAndID value for owner.
     * @param  tags  List of String value for tags.
     */
    public TableList(
            String name,
            String type,
            String id,
            String databaseStripe,
            String schemaStripe,
            TableListIsExternalEnum isExternal,
            TableListIsDeprecatedEnum isDeprecated,
            TableListIsDeletedEnum isDeleted,
            TableListIsHiddenEnum isHidden,
            Double indexVersion,
            Double generationNum,
            String created,
            String modified,
            UserNameAndID author,
            UserNameAndID modifiedBy,
            UserNameAndID owner,
            List<String> tags) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.databaseStripe = databaseStripe;
        this.schemaStripe = schemaStripe;
        this.isExternal = isExternal;
        this.isDeprecated = isDeprecated;
        this.isDeleted = isDeleted;
        this.isHidden = isHidden;
        this.indexVersion = indexVersion;
        this.generationNum = generationNum;
        this.created = created;
        this.modified = modified;
        this.author = author;
        this.modifiedBy = modifiedBy;
        this.owner = owner;
        this.tags = tags;
    }

    /**
     * Getter for Name.
     * Name of the table
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the table
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Type.
     * Type of the table
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the table
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Id.
     * GUID of the table
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * GUID of the table
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for DatabaseStripe.
     * Name of the database to which the table belongs
     * @return Returns the String
     */
    @JsonGetter("databaseStripe")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDatabaseStripe() {
        return databaseStripe;
    }

    /**
     * Setter for DatabaseStripe.
     * Name of the database to which the table belongs
     * @param databaseStripe Value for String
     */
    @JsonSetter("databaseStripe")
    public void setDatabaseStripe(String databaseStripe) {
        this.databaseStripe = databaseStripe;
    }

    /**
     * Getter for SchemaStripe.
     * Name of the schema to which the table belongs
     * @return Returns the String
     */
    @JsonGetter("schemaStripe")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSchemaStripe() {
        return schemaStripe;
    }

    /**
     * Setter for SchemaStripe.
     * Name of the schema to which the table belongs
     * @param schemaStripe Value for String
     */
    @JsonSetter("schemaStripe")
    public void setSchemaStripe(String schemaStripe) {
        this.schemaStripe = schemaStripe;
    }

    /**
     * Getter for IsExternal.
     * @return Returns the TableListIsExternalEnum
     */
    @JsonGetter("isExternal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TableListIsExternalEnum getIsExternal() {
        return isExternal;
    }

    /**
     * Setter for IsExternal.
     * @param isExternal Value for TableListIsExternalEnum
     */
    @JsonSetter("isExternal")
    public void setIsExternal(TableListIsExternalEnum isExternal) {
        this.isExternal = isExternal;
    }

    /**
     * Getter for IsDeprecated.
     * Indicates if the table is deprecated
     * @return Returns the TableListIsDeprecatedEnum
     */
    @JsonGetter("isDeprecated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TableListIsDeprecatedEnum getIsDeprecated() {
        return isDeprecated;
    }

    /**
     * Setter for IsDeprecated.
     * Indicates if the table is deprecated
     * @param isDeprecated Value for TableListIsDeprecatedEnum
     */
    @JsonSetter("isDeprecated")
    public void setIsDeprecated(TableListIsDeprecatedEnum isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    /**
     * Getter for IsDeleted.
     * Indicates if the table is deleted
     * @return Returns the TableListIsDeletedEnum
     */
    @JsonGetter("isDeleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TableListIsDeletedEnum getIsDeleted() {
        return isDeleted;
    }

    /**
     * Setter for IsDeleted.
     * Indicates if the table is deleted
     * @param isDeleted Value for TableListIsDeletedEnum
     */
    @JsonSetter("isDeleted")
    public void setIsDeleted(TableListIsDeletedEnum isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for IsHidden.
     * Indicates if the table is hideen
     * @return Returns the TableListIsHiddenEnum
     */
    @JsonGetter("isHidden")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TableListIsHiddenEnum getIsHidden() {
        return isHidden;
    }

    /**
     * Setter for IsHidden.
     * Indicates if the table is hideen
     * @param isHidden Value for TableListIsHiddenEnum
     */
    @JsonSetter("isHidden")
    public void setIsHidden(TableListIsHiddenEnum isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Getter for IndexVersion.
     * @return Returns the Double
     */
    @JsonGetter("indexVersion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getIndexVersion() {
        return indexVersion;
    }

    /**
     * Setter for IndexVersion.
     * @param indexVersion Value for Double
     */
    @JsonSetter("indexVersion")
    public void setIndexVersion(Double indexVersion) {
        this.indexVersion = indexVersion;
    }

    /**
     * Getter for GenerationNum.
     * @return Returns the Double
     */
    @JsonGetter("generationNum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getGenerationNum() {
        return generationNum;
    }

    /**
     * Setter for GenerationNum.
     * @param generationNum Value for Double
     */
    @JsonSetter("generationNum")
    public void setGenerationNum(Double generationNum) {
        this.generationNum = generationNum;
    }

    /**
     * Getter for Created.
     * Date and time when the table was created
     * @return Returns the String
     */
    @JsonGetter("created")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreated() {
        return created;
    }

    /**
     * Setter for Created.
     * Date and time when the table was created
     * @param created Value for String
     */
    @JsonSetter("created")
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Getter for Modified.
     * Date and time of last modification of the table
     * @return Returns the String
     */
    @JsonGetter("modified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getModified() {
        return modified;
    }

    /**
     * Setter for Modified.
     * Date and time of last modification of the table
     * @param modified Value for String
     */
    @JsonSetter("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Getter for Author.
     * @return Returns the UserNameAndID
     */
    @JsonGetter("author")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserNameAndID getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for UserNameAndID
     */
    @JsonSetter("author")
    public void setAuthor(UserNameAndID author) {
        this.author = author;
    }

    /**
     * Getter for ModifiedBy.
     * @return Returns the UserNameAndID
     */
    @JsonGetter("modifiedBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserNameAndID getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Setter for ModifiedBy.
     * @param modifiedBy Value for UserNameAndID
     */
    @JsonSetter("modifiedBy")
    public void setModifiedBy(UserNameAndID modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for Owner.
     * @return Returns the UserNameAndID
     */
    @JsonGetter("owner")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UserNameAndID getOwner() {
        return owner;
    }

    /**
     * Setter for Owner.
     * @param owner Value for UserNameAndID
     */
    @JsonSetter("owner")
    public void setOwner(UserNameAndID owner) {
        this.owner = owner;
    }

    /**
     * Getter for Tags.
     * List of tags assigned to the table
     * @return Returns the List of String
     */
    @JsonGetter("tags")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getTags() {
        return tags;
    }

    /**
     * Setter for Tags.
     * List of tags assigned to the table
     * @param tags Value for List of String
     */
    @JsonSetter("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Converts this TableList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TableList [" + "name=" + name + ", type=" + type + ", id=" + id
                + ", databaseStripe=" + databaseStripe + ", schemaStripe=" + schemaStripe
                + ", isExternal=" + isExternal + ", isDeprecated=" + isDeprecated + ", isDeleted="
                + isDeleted + ", isHidden=" + isHidden + ", indexVersion=" + indexVersion
                + ", generationNum=" + generationNum + ", created=" + created + ", modified="
                + modified + ", author=" + author + ", modifiedBy=" + modifiedBy + ", owner="
                + owner + ", tags=" + tags + "]";
    }

    /**
     * Builds a new {@link TableList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TableList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .type(getType())
                .id(getId())
                .databaseStripe(getDatabaseStripe())
                .schemaStripe(getSchemaStripe())
                .isExternal(getIsExternal())
                .isDeprecated(getIsDeprecated())
                .isDeleted(getIsDeleted())
                .isHidden(getIsHidden())
                .indexVersion(getIndexVersion())
                .generationNum(getGenerationNum())
                .created(getCreated())
                .modified(getModified())
                .author(getAuthor())
                .modifiedBy(getModifiedBy())
                .owner(getOwner())
                .tags(getTags());
        return builder;
    }

    /**
     * Class to build instances of {@link TableList}.
     */
    public static class Builder {
        private String name;
        private String type;
        private String id;
        private String databaseStripe;
        private String schemaStripe;
        private TableListIsExternalEnum isExternal;
        private TableListIsDeprecatedEnum isDeprecated;
        private TableListIsDeletedEnum isDeleted;
        private TableListIsHiddenEnum isHidden;
        private Double indexVersion;
        private Double generationNum;
        private String created;
        private String modified;
        private UserNameAndID author;
        private UserNameAndID modifiedBy;
        private UserNameAndID owner;
        private List<String> tags;



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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
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
         * Setter for databaseStripe.
         * @param  databaseStripe  String value for databaseStripe.
         * @return Builder
         */
        public Builder databaseStripe(String databaseStripe) {
            this.databaseStripe = databaseStripe;
            return this;
        }

        /**
         * Setter for schemaStripe.
         * @param  schemaStripe  String value for schemaStripe.
         * @return Builder
         */
        public Builder schemaStripe(String schemaStripe) {
            this.schemaStripe = schemaStripe;
            return this;
        }

        /**
         * Setter for isExternal.
         * @param  isExternal  TableListIsExternalEnum value for isExternal.
         * @return Builder
         */
        public Builder isExternal(TableListIsExternalEnum isExternal) {
            this.isExternal = isExternal;
            return this;
        }

        /**
         * Setter for isDeprecated.
         * @param  isDeprecated  TableListIsDeprecatedEnum value for isDeprecated.
         * @return Builder
         */
        public Builder isDeprecated(TableListIsDeprecatedEnum isDeprecated) {
            this.isDeprecated = isDeprecated;
            return this;
        }

        /**
         * Setter for isDeleted.
         * @param  isDeleted  TableListIsDeletedEnum value for isDeleted.
         * @return Builder
         */
        public Builder isDeleted(TableListIsDeletedEnum isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * Setter for isHidden.
         * @param  isHidden  TableListIsHiddenEnum value for isHidden.
         * @return Builder
         */
        public Builder isHidden(TableListIsHiddenEnum isHidden) {
            this.isHidden = isHidden;
            return this;
        }

        /**
         * Setter for indexVersion.
         * @param  indexVersion  Double value for indexVersion.
         * @return Builder
         */
        public Builder indexVersion(Double indexVersion) {
            this.indexVersion = indexVersion;
            return this;
        }

        /**
         * Setter for generationNum.
         * @param  generationNum  Double value for generationNum.
         * @return Builder
         */
        public Builder generationNum(Double generationNum) {
            this.generationNum = generationNum;
            return this;
        }

        /**
         * Setter for created.
         * @param  created  String value for created.
         * @return Builder
         */
        public Builder created(String created) {
            this.created = created;
            return this;
        }

        /**
         * Setter for modified.
         * @param  modified  String value for modified.
         * @return Builder
         */
        public Builder modified(String modified) {
            this.modified = modified;
            return this;
        }

        /**
         * Setter for author.
         * @param  author  UserNameAndID value for author.
         * @return Builder
         */
        public Builder author(UserNameAndID author) {
            this.author = author;
            return this;
        }

        /**
         * Setter for modifiedBy.
         * @param  modifiedBy  UserNameAndID value for modifiedBy.
         * @return Builder
         */
        public Builder modifiedBy(UserNameAndID modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        /**
         * Setter for owner.
         * @param  owner  UserNameAndID value for owner.
         * @return Builder
         */
        public Builder owner(UserNameAndID owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Setter for tags.
         * @param  tags  List of String value for tags.
         * @return Builder
         */
        public Builder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Builds a new {@link TableList} object using the set fields.
         * @return {@link TableList}
         */
        public TableList build() {
            return new TableList(name, type, id, databaseStripe, schemaStripe, isExternal,
                    isDeprecated, isDeleted, isHidden, indexVersion, generationNum, created,
                    modified, author, modifiedBy, owner, tags);
        }
    }
}
