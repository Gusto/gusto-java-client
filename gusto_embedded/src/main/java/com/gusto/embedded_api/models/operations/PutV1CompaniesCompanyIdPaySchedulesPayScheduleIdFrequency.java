/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdFrequency - The frequency that employees on this pay schedule are paid with Gusto.
 */
public enum PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdFrequency {
    EVERY_WEEK("Every week"),
    EVERY_OTHER_WEEK("Every other week"),
    TWICE_PER_MONTH("Twice per month"),
    MONTHLY("Monthly");

    @JsonValue
    private final String value;

    private PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdFrequency(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdFrequency> fromValue(String value) {
        for (PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdFrequency o: PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdFrequency.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
