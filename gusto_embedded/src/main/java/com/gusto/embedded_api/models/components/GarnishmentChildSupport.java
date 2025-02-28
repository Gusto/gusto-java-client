/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * GarnishmentChildSupport - Additional child support order details
 */

public class GarnishmentChildSupport {

    /**
     * The two letter state abbreviation for the state issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<String> state;

    /**
     * How often the agency collects the withholding amount. e.g. $500 monthly -&gt; `Monthly`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_period")
    private Optional<? extends PaymentPeriod> paymentPeriod;

    /**
     * The FIPS code associated with the state or county agency issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fips_code")
    private Optional<String> fipsCode;

    /**
     * Child Support Enforcement Case Number associated with this child support obligation - required for most states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("case_number")
    private JsonNullable<String> caseNumber;

    /**
     * Order Identifier or Order ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_number")
    private JsonNullable<String> orderNumber;

    /**
     * Child Support Enforcement Remittance ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remittance_number")
    private JsonNullable<String> remittanceNumber;

    @JsonCreator
    public GarnishmentChildSupport(
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("payment_period") Optional<? extends PaymentPeriod> paymentPeriod,
            @JsonProperty("fips_code") Optional<String> fipsCode,
            @JsonProperty("case_number") JsonNullable<String> caseNumber,
            @JsonProperty("order_number") JsonNullable<String> orderNumber,
            @JsonProperty("remittance_number") JsonNullable<String> remittanceNumber) {
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(paymentPeriod, "paymentPeriod");
        Utils.checkNotNull(fipsCode, "fipsCode");
        Utils.checkNotNull(caseNumber, "caseNumber");
        Utils.checkNotNull(orderNumber, "orderNumber");
        Utils.checkNotNull(remittanceNumber, "remittanceNumber");
        this.state = state;
        this.paymentPeriod = paymentPeriod;
        this.fipsCode = fipsCode;
        this.caseNumber = caseNumber;
        this.orderNumber = orderNumber;
        this.remittanceNumber = remittanceNumber;
    }
    
    public GarnishmentChildSupport() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The two letter state abbreviation for the state issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
     */
    @JsonIgnore
    public Optional<String> state() {
        return state;
    }

    /**
     * How often the agency collects the withholding amount. e.g. $500 monthly -&gt; `Monthly`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentPeriod> paymentPeriod() {
        return (Optional<PaymentPeriod>) paymentPeriod;
    }

    /**
     * The FIPS code associated with the state or county agency issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
     */
    @JsonIgnore
    public Optional<String> fipsCode() {
        return fipsCode;
    }

    /**
     * Child Support Enforcement Case Number associated with this child support obligation - required for most states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    @JsonIgnore
    public JsonNullable<String> caseNumber() {
        return caseNumber;
    }

    /**
     * Order Identifier or Order ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    @JsonIgnore
    public JsonNullable<String> orderNumber() {
        return orderNumber;
    }

    /**
     * Child Support Enforcement Remittance ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    @JsonIgnore
    public JsonNullable<String> remittanceNumber() {
        return remittanceNumber;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The two letter state abbreviation for the state issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
     */
    public GarnishmentChildSupport withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * The two letter state abbreviation for the state issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
     */
    public GarnishmentChildSupport withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    /**
     * How often the agency collects the withholding amount. e.g. $500 monthly -&gt; `Monthly`.
     */
    public GarnishmentChildSupport withPaymentPeriod(PaymentPeriod paymentPeriod) {
        Utils.checkNotNull(paymentPeriod, "paymentPeriod");
        this.paymentPeriod = Optional.ofNullable(paymentPeriod);
        return this;
    }

    /**
     * How often the agency collects the withholding amount. e.g. $500 monthly -&gt; `Monthly`.
     */
    public GarnishmentChildSupport withPaymentPeriod(Optional<? extends PaymentPeriod> paymentPeriod) {
        Utils.checkNotNull(paymentPeriod, "paymentPeriod");
        this.paymentPeriod = paymentPeriod;
        return this;
    }

    /**
     * The FIPS code associated with the state or county agency issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
     */
    public GarnishmentChildSupport withFipsCode(String fipsCode) {
        Utils.checkNotNull(fipsCode, "fipsCode");
        this.fipsCode = Optional.ofNullable(fipsCode);
        return this;
    }

    /**
     * The FIPS code associated with the state or county agency issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
     */
    public GarnishmentChildSupport withFipsCode(Optional<String> fipsCode) {
        Utils.checkNotNull(fipsCode, "fipsCode");
        this.fipsCode = fipsCode;
        return this;
    }

    /**
     * Child Support Enforcement Case Number associated with this child support obligation - required for most states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    public GarnishmentChildSupport withCaseNumber(String caseNumber) {
        Utils.checkNotNull(caseNumber, "caseNumber");
        this.caseNumber = JsonNullable.of(caseNumber);
        return this;
    }

    /**
     * Child Support Enforcement Case Number associated with this child support obligation - required for most states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    public GarnishmentChildSupport withCaseNumber(JsonNullable<String> caseNumber) {
        Utils.checkNotNull(caseNumber, "caseNumber");
        this.caseNumber = caseNumber;
        return this;
    }

    /**
     * Order Identifier or Order ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    public GarnishmentChildSupport withOrderNumber(String orderNumber) {
        Utils.checkNotNull(orderNumber, "orderNumber");
        this.orderNumber = JsonNullable.of(orderNumber);
        return this;
    }

    /**
     * Order Identifier or Order ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    public GarnishmentChildSupport withOrderNumber(JsonNullable<String> orderNumber) {
        Utils.checkNotNull(orderNumber, "orderNumber");
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * Child Support Enforcement Remittance ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    public GarnishmentChildSupport withRemittanceNumber(String remittanceNumber) {
        Utils.checkNotNull(remittanceNumber, "remittanceNumber");
        this.remittanceNumber = JsonNullable.of(remittanceNumber);
        return this;
    }

    /**
     * Child Support Enforcement Remittance ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
     */
    public GarnishmentChildSupport withRemittanceNumber(JsonNullable<String> remittanceNumber) {
        Utils.checkNotNull(remittanceNumber, "remittanceNumber");
        this.remittanceNumber = remittanceNumber;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GarnishmentChildSupport other = (GarnishmentChildSupport) o;
        return 
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.paymentPeriod, other.paymentPeriod) &&
            Objects.deepEquals(this.fipsCode, other.fipsCode) &&
            Objects.deepEquals(this.caseNumber, other.caseNumber) &&
            Objects.deepEquals(this.orderNumber, other.orderNumber) &&
            Objects.deepEquals(this.remittanceNumber, other.remittanceNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            state,
            paymentPeriod,
            fipsCode,
            caseNumber,
            orderNumber,
            remittanceNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GarnishmentChildSupport.class,
                "state", state,
                "paymentPeriod", paymentPeriod,
                "fipsCode", fipsCode,
                "caseNumber", caseNumber,
                "orderNumber", orderNumber,
                "remittanceNumber", remittanceNumber);
    }
    
    public final static class Builder {
 
        private Optional<String> state = Optional.empty();
 
        private Optional<? extends PaymentPeriod> paymentPeriod = Optional.empty();
 
        private Optional<String> fipsCode = Optional.empty();
 
        private JsonNullable<String> caseNumber = JsonNullable.undefined();
 
        private JsonNullable<String> orderNumber = JsonNullable.undefined();
 
        private JsonNullable<String> remittanceNumber = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The two letter state abbreviation for the state issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
         */
        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        /**
         * The two letter state abbreviation for the state issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
         */
        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        /**
         * How often the agency collects the withholding amount. e.g. $500 monthly -&gt; `Monthly`.
         */
        public Builder paymentPeriod(PaymentPeriod paymentPeriod) {
            Utils.checkNotNull(paymentPeriod, "paymentPeriod");
            this.paymentPeriod = Optional.ofNullable(paymentPeriod);
            return this;
        }

        /**
         * How often the agency collects the withholding amount. e.g. $500 monthly -&gt; `Monthly`.
         */
        public Builder paymentPeriod(Optional<? extends PaymentPeriod> paymentPeriod) {
            Utils.checkNotNull(paymentPeriod, "paymentPeriod");
            this.paymentPeriod = paymentPeriod;
            return this;
        }

        /**
         * The FIPS code associated with the state or county agency issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
         */
        public Builder fipsCode(String fipsCode) {
            Utils.checkNotNull(fipsCode, "fipsCode");
            this.fipsCode = Optional.ofNullable(fipsCode);
            return this;
        }

        /**
         * The FIPS code associated with the state or county agency issuing the child support order. Agency data is available in the `GET /v1/garnishments/child_support` API.
         */
        public Builder fipsCode(Optional<String> fipsCode) {
            Utils.checkNotNull(fipsCode, "fipsCode");
            this.fipsCode = fipsCode;
            return this;
        }

        /**
         * Child Support Enforcement Case Number associated with this child support obligation - required for most states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
         */
        public Builder caseNumber(String caseNumber) {
            Utils.checkNotNull(caseNumber, "caseNumber");
            this.caseNumber = JsonNullable.of(caseNumber);
            return this;
        }

        /**
         * Child Support Enforcement Case Number associated with this child support obligation - required for most states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
         */
        public Builder caseNumber(JsonNullable<String> caseNumber) {
            Utils.checkNotNull(caseNumber, "caseNumber");
            this.caseNumber = caseNumber;
            return this;
        }

        /**
         * Order Identifier or Order ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
         */
        public Builder orderNumber(String orderNumber) {
            Utils.checkNotNull(orderNumber, "orderNumber");
            this.orderNumber = JsonNullable.of(orderNumber);
            return this;
        }

        /**
         * Order Identifier or Order ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
         */
        public Builder orderNumber(JsonNullable<String> orderNumber) {
            Utils.checkNotNull(orderNumber, "orderNumber");
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * Child Support Enforcement Remittance ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
         */
        public Builder remittanceNumber(String remittanceNumber) {
            Utils.checkNotNull(remittanceNumber, "remittanceNumber");
            this.remittanceNumber = JsonNullable.of(remittanceNumber);
            return this;
        }

        /**
         * Child Support Enforcement Remittance ID associated with this child support obligation - required for some states. Agency specific requirements are available in the `GET /v1/garnishments/child_support` API.
         */
        public Builder remittanceNumber(JsonNullable<String> remittanceNumber) {
            Utils.checkNotNull(remittanceNumber, "remittanceNumber");
            this.remittanceNumber = remittanceNumber;
            return this;
        }
        
        public GarnishmentChildSupport build() {
            return new GarnishmentChildSupport(
                state,
                paymentPeriod,
                fipsCode,
                caseNumber,
                orderNumber,
                remittanceNumber);
        }
    }
}

