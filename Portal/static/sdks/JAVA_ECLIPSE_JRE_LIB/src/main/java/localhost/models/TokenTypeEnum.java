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
 * TokenTypeEnum to be used.
 */
public enum TokenTypeEnum {
    COOKIE,

    BEARER;


    private static TreeMap<String, TokenTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        COOKIE.value = "Cookie";
        BEARER.value = "Bearer";

        valueMap.put("Cookie", COOKIE);
        valueMap.put("Bearer", BEARER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static TokenTypeEnum fromString(String toConvert) {
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
     * Convert list of TokenTypeEnum values to list of string values.
     * @param toConvert The list of TokenTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TokenTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TokenTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 