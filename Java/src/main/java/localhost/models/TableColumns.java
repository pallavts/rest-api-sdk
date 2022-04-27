/*
 * RESTAPISDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TableColumns type.
 */
public class TableColumns {
    private String name;
    private String dataType;

    /**
     * Default constructor.
     */
    public TableColumns() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  dataType  String value for dataType.
     */
    public TableColumns(
            String name,
            String dataType) {
        this.name = name;
        this.dataType = dataType;
    }

    /**
     * Getter for Name.
     * Name of the column
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the column
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for DataType.
     * Datatype of the column
     * @return Returns the String
     */
    @JsonGetter("dataType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDataType() {
        return dataType;
    }

    /**
     * Setter for DataType.
     * Datatype of the column
     * @param dataType Value for String
     */
    @JsonSetter("dataType")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Converts this TableColumns into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TableColumns [" + "name=" + name + ", dataType=" + dataType + "]";
    }

    /**
     * Builds a new {@link TableColumns.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TableColumns.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .dataType(getDataType());
        return builder;
    }

    /**
     * Class to build instances of {@link TableColumns}.
     */
    public static class Builder {
        private String name;
        private String dataType;



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
         * Setter for dataType.
         * @param  dataType  String value for dataType.
         * @return Builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Builds a new {@link TableColumns} object using the set fields.
         * @return {@link TableColumns}
         */
        public TableColumns build() {
            return new TableColumns(name, dataType);
        }
    }
}
