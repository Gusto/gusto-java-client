/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * PaymentUnit - The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
 */
public enum PaymentUnit {
    HOUR("Hour"),
    WEEK("Week"),
    MONTH("Month"),
    YEAR("Year"),
    PAYCHECK("Paycheck");

    @JsonValue
    private final String value;

    private PaymentUnit(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PaymentUnit> fromValue(String value) {
        for (PaymentUnit o: PaymentUnit.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
