/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ContractorOnboardingStatusOnboardingStatus - One of the "onboarding_status" enum values.
 */
public enum ContractorOnboardingStatusOnboardingStatus {
    ONBOARDING_COMPLETED("onboarding_completed"),
    ADMIN_ONBOARDING_REVIEW("admin_onboarding_review"),
    ADMIN_ONBOARDING_INCOMPLETE("admin_onboarding_incomplete");

    @JsonValue
    private final String value;

    private ContractorOnboardingStatusOnboardingStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ContractorOnboardingStatusOnboardingStatus> fromValue(String value) {
        for (ContractorOnboardingStatusOnboardingStatus o: ContractorOnboardingStatusOnboardingStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
