/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * EmploymentStatus - The employee's employment status. Supplying an invalid option will set the employment_status to *not_set*.
 */
public enum EmploymentStatus {
    PART_TIME("part_time"),
    FULL_TIME("full_time"),
    PART_TIME_ELIGIBLE("part_time_eligible"),
    VARIABLE("variable"),
    SEASONAL("seasonal"),
    NOT_SET("not_set");

    @JsonValue
    private final String value;

    private EmploymentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<EmploymentStatus> fromValue(String value) {
        for (EmploymentStatus o: EmploymentStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
