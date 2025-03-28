/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum VersionHeader {
    TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01("2024-04-01");

    @JsonValue
    private final String value;

    private VersionHeader(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<VersionHeader> fromValue(String value) {
        for (VersionHeader o: VersionHeader.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
