/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * RateType - [for `workers_compensation_rate`] The type of rate being collected. Either:
 *  - `percent`: A percentage formatted as a decimal, e.g. `0.01` for 1%
 *  - `currency_per_hour`: A dollar amount per hour, e.g. `3.24` for $3.24/hr
 * 
 */
public enum RateType {
    PERCENT("percent"),
    CURRENCY_PER_HOUR("currency_per_hour");

    @JsonValue
    private final String value;

    private RateType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<RateType> fromValue(String value) {
        for (RateType o: RateType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
