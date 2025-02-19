/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PutV1EmployeeBenefitsEmployeeBenefitIdLimitOption - Some benefits require additional information to determine
 * their limit.
 * 
 * `Family` or `Individual`: Applicable to HSA benefit.
 * 
 * `Joint Filing or Single` or `Married and Filing Separately`: Applicable to Dependent Care FSA benefit.
 */
public enum PutV1EmployeeBenefitsEmployeeBenefitIdLimitOption {
    FAMILY("Family"),
    INDIVIDUAL("Individual"),
    JOINT_FILING_OR_SINGLE("Joint Filing or Single"),
    MARRIED_AND_FILING_SEPARATELY("Married and Filing Separately");

    @JsonValue
    private final String value;

    private PutV1EmployeeBenefitsEmployeeBenefitIdLimitOption(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PutV1EmployeeBenefitsEmployeeBenefitIdLimitOption> fromValue(String value) {
        for (PutV1EmployeeBenefitsEmployeeBenefitIdLimitOption o: PutV1EmployeeBenefitsEmployeeBenefitIdLimitOption.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
