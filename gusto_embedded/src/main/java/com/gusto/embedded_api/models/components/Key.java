/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * Key
 * 
 * <p>A required attribute when creating a garnishment for this state agency. The current values are listed as an enum; though unlikely, values could be added if state agency requirements change in the future.
 */
public enum Key {
    CASE_NUMBER("case_number"),
    ORDER_NUMBER("order_number"),
    REMITTANCE_NUMBER("remittance_number");

    @JsonValue
    private final String value;

    private Key(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Key> fromValue(String value) {
        for (Key o: Key.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
