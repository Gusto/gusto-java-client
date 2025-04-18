/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * PayrollSubmissionBlockersTypeStatus
 * 
 * <p>The status of the submission blocker.
 */
public enum PayrollSubmissionBlockersTypeStatus {
    UNRESOLVED("unresolved"),
    RESOLVED("resolved");

    @JsonValue
    private final String value;

    private PayrollSubmissionBlockersTypeStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PayrollSubmissionBlockersTypeStatus> fromValue(String value) {
        for (PayrollSubmissionBlockersTypeStatus o: PayrollSubmissionBlockersTypeStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
