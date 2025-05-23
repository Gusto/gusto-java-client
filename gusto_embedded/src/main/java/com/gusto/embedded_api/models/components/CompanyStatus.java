/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * CompanyStatus
 * 
 * <p>The status of the company in Gusto. "Approved" companies are approved to run payroll from a risk and compliance perspective. However, an approved company may still need to resolve other [payroll blockers](https://docs.gusto.com/embedded-payroll/docs/payroll-blockers) to be able to run payroll. "Not Approved" companies may not yet run payroll with Gusto and may need to complete onboarding or contact support. "Suspended" companies may not run payroll with Gusto. In order to unsuspend their account, the company must contact support.
 */
public enum CompanyStatus {
    APPROVED("Approved"),
    NOT_APPROVED("Not Approved"),
    SUSPENDED("Suspended");

    @JsonValue
    private final String value;

    private CompanyStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CompanyStatus> fromValue(String value) {
        for (CompanyStatus o: CompanyStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
