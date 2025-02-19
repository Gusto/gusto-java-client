/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PaymentUuid - Unique identifier of the payment
 */
public enum PaymentUuid {
    PAYROLL("payroll");

    @JsonValue
    private final String value;

    private PaymentUuid(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PaymentUuid> fromValue(String value) {
        for (PaymentUuid o: PaymentUuid.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
