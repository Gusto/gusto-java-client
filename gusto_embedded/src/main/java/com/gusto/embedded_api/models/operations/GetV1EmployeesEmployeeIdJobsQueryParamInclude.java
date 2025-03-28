/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * GetV1EmployeesEmployeeIdJobsQueryParamInclude
 * 
 * <p>Available options:
 * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
 */
public enum GetV1EmployeesEmployeeIdJobsQueryParamInclude {
    ALL_COMPENSATIONS("all_compensations");

    @JsonValue
    private final String value;

    private GetV1EmployeesEmployeeIdJobsQueryParamInclude(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetV1EmployeesEmployeeIdJobsQueryParamInclude> fromValue(String value) {
        for (GetV1EmployeesEmployeeIdJobsQueryParamInclude o: GetV1EmployeesEmployeeIdJobsQueryParamInclude.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
