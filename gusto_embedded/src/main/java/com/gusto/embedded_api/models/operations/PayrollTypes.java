/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum PayrollTypes {
    REGULAR("regular"),
    OFF_CYCLE("off_cycle"),
    EXTERNAL("external");

    @JsonValue
    private final String value;

    private PayrollTypes(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PayrollTypes> fromValue(String value) {
        for (PayrollTypes o: PayrollTypes.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
