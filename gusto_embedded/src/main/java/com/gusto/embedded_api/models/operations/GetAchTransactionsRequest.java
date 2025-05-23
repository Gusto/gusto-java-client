/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class GetAchTransactionsRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_uuid")
    private String companyUuid;

    /**
     * The UUID of the contractor payment
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=contractor_payment_uuid")
    private Optional<String> contractorPaymentUuid;

    /**
     * The UUID of the payroll
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=payroll_uuid")
    private Optional<String> payrollUuid;

    /**
     * Used to filter the ACH transactions to only include those with a specific transaction type, such as "Credit employee pay".
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=transaction_type")
    private Optional<String> transactionType;

    /**
     * Used to filter the ACH transactions to only include those with a specific payment direction, either "credit" or "debit".
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=payment_direction")
    private Optional<String> paymentDirection;

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<Long> page;

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=per")
    private Optional<Long> per;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetAchTransactionsRequest(
            String companyUuid,
            Optional<String> contractorPaymentUuid,
            Optional<String> payrollUuid,
            Optional<String> transactionType,
            Optional<String> paymentDirection,
            Optional<Long> page,
            Optional<Long> per,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(contractorPaymentUuid, "contractorPaymentUuid");
        Utils.checkNotNull(payrollUuid, "payrollUuid");
        Utils.checkNotNull(transactionType, "transactionType");
        Utils.checkNotNull(paymentDirection, "paymentDirection");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(per, "per");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.companyUuid = companyUuid;
        this.contractorPaymentUuid = contractorPaymentUuid;
        this.payrollUuid = payrollUuid;
        this.transactionType = transactionType;
        this.paymentDirection = paymentDirection;
        this.page = page;
        this.per = per;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetAchTransactionsRequest(
            String companyUuid) {
        this(companyUuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyUuid() {
        return companyUuid;
    }

    /**
     * The UUID of the contractor payment
     */
    @JsonIgnore
    public Optional<String> contractorPaymentUuid() {
        return contractorPaymentUuid;
    }

    /**
     * The UUID of the payroll
     */
    @JsonIgnore
    public Optional<String> payrollUuid() {
        return payrollUuid;
    }

    /**
     * Used to filter the ACH transactions to only include those with a specific transaction type, such as "Credit employee pay".
     */
    @JsonIgnore
    public Optional<String> transactionType() {
        return transactionType;
    }

    /**
     * Used to filter the ACH transactions to only include those with a specific payment direction, either "credit" or "debit".
     */
    @JsonIgnore
    public Optional<String> paymentDirection() {
        return paymentDirection;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    @JsonIgnore
    public Optional<Long> page() {
        return page;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    @JsonIgnore
    public Optional<Long> per() {
        return per;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VersionHeader> xGustoAPIVersion() {
        return (Optional<VersionHeader>) xGustoAPIVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the company
     */
    public GetAchTransactionsRequest withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * The UUID of the contractor payment
     */
    public GetAchTransactionsRequest withContractorPaymentUuid(String contractorPaymentUuid) {
        Utils.checkNotNull(contractorPaymentUuid, "contractorPaymentUuid");
        this.contractorPaymentUuid = Optional.ofNullable(contractorPaymentUuid);
        return this;
    }

    /**
     * The UUID of the contractor payment
     */
    public GetAchTransactionsRequest withContractorPaymentUuid(Optional<String> contractorPaymentUuid) {
        Utils.checkNotNull(contractorPaymentUuid, "contractorPaymentUuid");
        this.contractorPaymentUuid = contractorPaymentUuid;
        return this;
    }

    /**
     * The UUID of the payroll
     */
    public GetAchTransactionsRequest withPayrollUuid(String payrollUuid) {
        Utils.checkNotNull(payrollUuid, "payrollUuid");
        this.payrollUuid = Optional.ofNullable(payrollUuid);
        return this;
    }

    /**
     * The UUID of the payroll
     */
    public GetAchTransactionsRequest withPayrollUuid(Optional<String> payrollUuid) {
        Utils.checkNotNull(payrollUuid, "payrollUuid");
        this.payrollUuid = payrollUuid;
        return this;
    }

    /**
     * Used to filter the ACH transactions to only include those with a specific transaction type, such as "Credit employee pay".
     */
    public GetAchTransactionsRequest withTransactionType(String transactionType) {
        Utils.checkNotNull(transactionType, "transactionType");
        this.transactionType = Optional.ofNullable(transactionType);
        return this;
    }

    /**
     * Used to filter the ACH transactions to only include those with a specific transaction type, such as "Credit employee pay".
     */
    public GetAchTransactionsRequest withTransactionType(Optional<String> transactionType) {
        Utils.checkNotNull(transactionType, "transactionType");
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Used to filter the ACH transactions to only include those with a specific payment direction, either "credit" or "debit".
     */
    public GetAchTransactionsRequest withPaymentDirection(String paymentDirection) {
        Utils.checkNotNull(paymentDirection, "paymentDirection");
        this.paymentDirection = Optional.ofNullable(paymentDirection);
        return this;
    }

    /**
     * Used to filter the ACH transactions to only include those with a specific payment direction, either "credit" or "debit".
     */
    public GetAchTransactionsRequest withPaymentDirection(Optional<String> paymentDirection) {
        Utils.checkNotNull(paymentDirection, "paymentDirection");
        this.paymentDirection = paymentDirection;
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetAchTransactionsRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetAchTransactionsRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetAchTransactionsRequest withPer(long per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.ofNullable(per);
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetAchTransactionsRequest withPer(Optional<Long> per) {
        Utils.checkNotNull(per, "per");
        this.per = per;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetAchTransactionsRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetAchTransactionsRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
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
        GetAchTransactionsRequest other = (GetAchTransactionsRequest) o;
        return 
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.contractorPaymentUuid, other.contractorPaymentUuid) &&
            Objects.deepEquals(this.payrollUuid, other.payrollUuid) &&
            Objects.deepEquals(this.transactionType, other.transactionType) &&
            Objects.deepEquals(this.paymentDirection, other.paymentDirection) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.per, other.per) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyUuid,
            contractorPaymentUuid,
            payrollUuid,
            transactionType,
            paymentDirection,
            page,
            per,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAchTransactionsRequest.class,
                "companyUuid", companyUuid,
                "contractorPaymentUuid", contractorPaymentUuid,
                "payrollUuid", payrollUuid,
                "transactionType", transactionType,
                "paymentDirection", paymentDirection,
                "page", page,
                "per", per,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String companyUuid;
 
        private Optional<String> contractorPaymentUuid = Optional.empty();
 
        private Optional<String> payrollUuid = Optional.empty();
 
        private Optional<String> transactionType = Optional.empty();
 
        private Optional<String> paymentDirection = Optional.empty();
 
        private Optional<Long> page = Optional.empty();
 
        private Optional<Long> per = Optional.empty();
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the company
         */
        public Builder companyUuid(String companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = companyUuid;
            return this;
        }

        /**
         * The UUID of the contractor payment
         */
        public Builder contractorPaymentUuid(String contractorPaymentUuid) {
            Utils.checkNotNull(contractorPaymentUuid, "contractorPaymentUuid");
            this.contractorPaymentUuid = Optional.ofNullable(contractorPaymentUuid);
            return this;
        }

        /**
         * The UUID of the contractor payment
         */
        public Builder contractorPaymentUuid(Optional<String> contractorPaymentUuid) {
            Utils.checkNotNull(contractorPaymentUuid, "contractorPaymentUuid");
            this.contractorPaymentUuid = contractorPaymentUuid;
            return this;
        }

        /**
         * The UUID of the payroll
         */
        public Builder payrollUuid(String payrollUuid) {
            Utils.checkNotNull(payrollUuid, "payrollUuid");
            this.payrollUuid = Optional.ofNullable(payrollUuid);
            return this;
        }

        /**
         * The UUID of the payroll
         */
        public Builder payrollUuid(Optional<String> payrollUuid) {
            Utils.checkNotNull(payrollUuid, "payrollUuid");
            this.payrollUuid = payrollUuid;
            return this;
        }

        /**
         * Used to filter the ACH transactions to only include those with a specific transaction type, such as "Credit employee pay".
         */
        public Builder transactionType(String transactionType) {
            Utils.checkNotNull(transactionType, "transactionType");
            this.transactionType = Optional.ofNullable(transactionType);
            return this;
        }

        /**
         * Used to filter the ACH transactions to only include those with a specific transaction type, such as "Credit employee pay".
         */
        public Builder transactionType(Optional<String> transactionType) {
            Utils.checkNotNull(transactionType, "transactionType");
            this.transactionType = transactionType;
            return this;
        }

        /**
         * Used to filter the ACH transactions to only include those with a specific payment direction, either "credit" or "debit".
         */
        public Builder paymentDirection(String paymentDirection) {
            Utils.checkNotNull(paymentDirection, "paymentDirection");
            this.paymentDirection = Optional.ofNullable(paymentDirection);
            return this;
        }

        /**
         * Used to filter the ACH transactions to only include those with a specific payment direction, either "credit" or "debit".
         */
        public Builder paymentDirection(Optional<String> paymentDirection) {
            Utils.checkNotNull(paymentDirection, "paymentDirection");
            this.paymentDirection = paymentDirection;
            return this;
        }

        /**
         * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
         */
        public Builder page(long page) {
            Utils.checkNotNull(page, "page");
            this.page = Optional.ofNullable(page);
            return this;
        }

        /**
         * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
         */
        public Builder page(Optional<Long> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * Number of objects per page. For majority of endpoints will default to 25
         */
        public Builder per(long per) {
            Utils.checkNotNull(per, "per");
            this.per = Optional.ofNullable(per);
            return this;
        }

        /**
         * Number of objects per page. For majority of endpoints will default to 25
         */
        public Builder per(Optional<Long> per) {
            Utils.checkNotNull(per, "per");
            this.per = per;
            return this;
        }

        /**
         * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
         */
        public Builder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
            Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
            this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
            return this;
        }

        /**
         * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
         */
        public Builder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
            Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
            this.xGustoAPIVersion = xGustoAPIVersion;
            return this;
        }
        
        public GetAchTransactionsRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new GetAchTransactionsRequest(
                companyUuid,
                contractorPaymentUuid,
                payrollUuid,
                transactionType,
                paymentDirection,
                page,
                per,
                xGustoAPIVersion);
        }

        private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
                new LazySingletonValue<>(
                        "X-Gusto-API-Version",
                        "\"2024-04-01\"",
                        new TypeReference<Optional<? extends VersionHeader>>() {});
    }
}

