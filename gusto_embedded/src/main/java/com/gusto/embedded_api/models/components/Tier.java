/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * Tier - The Gusto product tier of the company (not applicable to Embedded partner managed companies).
 */
public enum Tier {
    SIMPLE("simple"),
    PLUS("plus"),
    PREMIUM("premium"),
    CORE("core"),
    COMPLETE("complete"),
    CONCIERGE("concierge"),
    CONTRACTOR_ONLY("contractor_only"),
    BASIC("basic");

    @JsonValue
    private final String value;

    private Tier(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Tier> fromValue(String value) {
        for (Tier o: Tier.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
