/*
 * TSPublicRestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * StateEnum to be used.
 */
public enum StateEnum {
    ACTIVE,

    IN_ACTIVE;


    private static TreeMap<String, StateEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ACTIVE.value = "ACTIVE";
        IN_ACTIVE.value = "IN_ACTIVE";

        valueMap.put("ACTIVE", ACTIVE);
        valueMap.put("IN_ACTIVE", IN_ACTIVE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static StateEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of StateEnum values to list of string values.
     * @param toConvert The list of StateEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<StateEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (StateEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 