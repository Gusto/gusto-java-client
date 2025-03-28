/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * CurrentEmploymentStatus
 * 
 * <p>The current employment status of the employee. Full-time employees work 30+ hours per week. Part-time employees are split into two groups: those that work 20-29 hours a week, and those that work under 20 hours a week. Variable employees have hours that vary each week. Seasonal employees are hired for 6 months of the year or less.
 */
public enum CurrentEmploymentStatus {
    FULL_TIME("full_time"),
    PART_TIME_UNDER_TWENTY_HOURS("part_time_under_twenty_hours"),
    PART_TIME_TWENTY_PLUS_HOURS("part_time_twenty_plus_hours"),
    VARIABLE("variable"),
    SEASONAL("seasonal");

    @JsonValue
    private final String value;

    private CurrentEmploymentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CurrentEmploymentStatus> fromValue(String value) {
        for (CurrentEmploymentStatus o: CurrentEmploymentStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
