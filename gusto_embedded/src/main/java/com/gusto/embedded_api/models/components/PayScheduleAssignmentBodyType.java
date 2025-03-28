/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * PayScheduleAssignmentBodyType
 * 
 * <p>The pay schedule assignment type.
 */
public enum PayScheduleAssignmentBodyType {
    SINGLE("single"),
    HOURLY_SALARIED("hourly_salaried"),
    BY_EMPLOYEE("by_employee"),
    BY_DEPARTMENT("by_department");

    @JsonValue
    private final String value;

    private PayScheduleAssignmentBodyType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PayScheduleAssignmentBodyType> fromValue(String value) {
        for (PayScheduleAssignmentBodyType o: PayScheduleAssignmentBodyType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
