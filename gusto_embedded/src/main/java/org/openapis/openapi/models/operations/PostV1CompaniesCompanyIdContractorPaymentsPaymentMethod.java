/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum PostV1CompaniesCompanyIdContractorPaymentsPaymentMethod {
    DIRECT_DEPOSIT("Direct Deposit"),
    CHECK("Check"),
    HISTORICAL_PAYMENT("Historical Payment");

    @JsonValue
    private final String value;

    private PostV1CompaniesCompanyIdContractorPaymentsPaymentMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PostV1CompaniesCompanyIdContractorPaymentsPaymentMethod> fromValue(String value) {
        for (PostV1CompaniesCompanyIdContractorPaymentsPaymentMethod o: PostV1CompaniesCompanyIdContractorPaymentsPaymentMethod.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
