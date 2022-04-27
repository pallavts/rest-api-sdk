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
 * This is a model class for ConnectionTableSchema type.
 */
public class ConnectionTableSchema {
    private String name;
    private List<ConnectionColumn> table;

    /**
     * Default constructor.
     */
    public ConnectionTableSchema() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  table  List of ConnectionColumn value for table.
     */
    public ConnectionTableSchema(
            String name,
            List<ConnectionColumn> table) {
        this.name = name;
        this.table = table;
    }

    /**
     * Getter for Name.
     * Name of the schema
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the schema
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Table.
     * List of table details
     * @return Returns the List of ConnectionColumn
     */
    @JsonGetter("table")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ConnectionColumn> getTable() {
        return table;
    }

    /**
     * Setter for Table.
     * List of table details
     * @param table Value for List of ConnectionColumn
     */
    @JsonSetter("table")
    public void setTable(List<ConnectionColumn> table) {
        this.table = table;
    }

    /**
     * Converts this ConnectionTableSchema into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConnectionTableSchema [" + "name=" + name + ", table=" + table + "]";
    }

    /**
     * Builds a new {@link ConnectionTableSchema.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConnectionTableSchema.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .table(getTable());
        return builder;
    }

    /**
     * Class to build instances of {@link ConnectionTableSchema}.
     */
    public static class Builder {
        private String name;
        private List<ConnectionColumn> table;



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
         * Setter for table.
         * @param  table  List of ConnectionColumn value for table.
         * @return Builder
         */
        public Builder table(List<ConnectionColumn> table) {
            this.table = table;
            return this;
        }

        /**
         * Builds a new {@link ConnectionTableSchema} object using the set fields.
         * @return {@link ConnectionTableSchema}
         */
        public ConnectionTableSchema build() {
            return new ConnectionTableSchema(name, table);
        }
    }
}
