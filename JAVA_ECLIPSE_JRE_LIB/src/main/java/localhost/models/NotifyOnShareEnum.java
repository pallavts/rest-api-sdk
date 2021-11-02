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
 * NotifyOnShareEnum to be used.
 */
public enum NotifyOnShareEnum {
    TRUE,

    FALSE;


    private static TreeMap<String, NotifyOnShareEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        TRUE.value = "True";
        FALSE.value = "False";

        valueMap.put("True", TRUE);
        valueMap.put("False", FALSE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static NotifyOnShareEnum fromString(String toConvert) {
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
     * Convert list of NotifyOnShareEnum values to list of string values.
     * @param toConvert The list of NotifyOnShareEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<NotifyOnShareEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (NotifyOnShareEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 