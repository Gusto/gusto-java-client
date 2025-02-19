/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PaymentStatus - The status of the ACH transaction
 */
public enum PaymentStatus {
    UNSUBMITTED("unsubmitted"),
    SUBMITTED("submitted"),
    SUCCESSFUL("successful"),
    FAILED("failed");

    @JsonValue
    private final String value;

    private PaymentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PaymentStatus> fromValue(String value) {
        for (PaymentStatus o: PaymentStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
