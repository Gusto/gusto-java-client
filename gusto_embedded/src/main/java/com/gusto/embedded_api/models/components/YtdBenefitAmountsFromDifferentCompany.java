/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
/**
 * YtdBenefitAmountsFromDifferentCompany
 * 
 * <p>Ytd Benefit Amounts From Different Company
 */

public class YtdBenefitAmountsFromDifferentCompany {

    /**
     * The unique identifier for this benefit amount record.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * The benefit type supported by Gusto. See [Benefit Types](https://docs.gusto.com/embedded-payroll/reference/get-v1-benefits) for more information.
     */
    @JsonProperty("benefit_type")
    private long benefitType;

    /**
     * The year-to-date employee deduction made outside the current company.
     */
    @JsonProperty("ytd_employee_deduction_amount")
    private String ytdEmployeeDeductionAmount;

    /**
     * The year-to-date company contribution made outside the current company.
     */
    @JsonProperty("ytd_company_contribution_amount")
    private String ytdCompanyContributionAmount;

    @JsonCreator
    public YtdBenefitAmountsFromDifferentCompany(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("benefit_type") long benefitType,
            @JsonProperty("ytd_employee_deduction_amount") String ytdEmployeeDeductionAmount,
            @JsonProperty("ytd_company_contribution_amount") String ytdCompanyContributionAmount) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(benefitType, "benefitType");
        Utils.checkNotNull(ytdEmployeeDeductionAmount, "ytdEmployeeDeductionAmount");
        Utils.checkNotNull(ytdCompanyContributionAmount, "ytdCompanyContributionAmount");
        this.uuid = uuid;
        this.benefitType = benefitType;
        this.ytdEmployeeDeductionAmount = ytdEmployeeDeductionAmount;
        this.ytdCompanyContributionAmount = ytdCompanyContributionAmount;
    }

    /**
     * The unique identifier for this benefit amount record.
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * The benefit type supported by Gusto. See [Benefit Types](https://docs.gusto.com/embedded-payroll/reference/get-v1-benefits) for more information.
     */
    @JsonIgnore
    public long benefitType() {
        return benefitType;
    }

    /**
     * The year-to-date employee deduction made outside the current company.
     */
    @JsonIgnore
    public String ytdEmployeeDeductionAmount() {
        return ytdEmployeeDeductionAmount;
    }

    /**
     * The year-to-date company contribution made outside the current company.
     */
    @JsonIgnore
    public String ytdCompanyContributionAmount() {
        return ytdCompanyContributionAmount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier for this benefit amount record.
     */
    public YtdBenefitAmountsFromDifferentCompany withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The benefit type supported by Gusto. See [Benefit Types](https://docs.gusto.com/embedded-payroll/reference/get-v1-benefits) for more information.
     */
    public YtdBenefitAmountsFromDifferentCompany withBenefitType(long benefitType) {
        Utils.checkNotNull(benefitType, "benefitType");
        this.benefitType = benefitType;
        return this;
    }

    /**
     * The year-to-date employee deduction made outside the current company.
     */
    public YtdBenefitAmountsFromDifferentCompany withYtdEmployeeDeductionAmount(String ytdEmployeeDeductionAmount) {
        Utils.checkNotNull(ytdEmployeeDeductionAmount, "ytdEmployeeDeductionAmount");
        this.ytdEmployeeDeductionAmount = ytdEmployeeDeductionAmount;
        return this;
    }

    /**
     * The year-to-date company contribution made outside the current company.
     */
    public YtdBenefitAmountsFromDifferentCompany withYtdCompanyContributionAmount(String ytdCompanyContributionAmount) {
        Utils.checkNotNull(ytdCompanyContributionAmount, "ytdCompanyContributionAmount");
        this.ytdCompanyContributionAmount = ytdCompanyContributionAmount;
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
        YtdBenefitAmountsFromDifferentCompany other = (YtdBenefitAmountsFromDifferentCompany) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.benefitType, other.benefitType) &&
            Objects.deepEquals(this.ytdEmployeeDeductionAmount, other.ytdEmployeeDeductionAmount) &&
            Objects.deepEquals(this.ytdCompanyContributionAmount, other.ytdCompanyContributionAmount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            benefitType,
            ytdEmployeeDeductionAmount,
            ytdCompanyContributionAmount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(YtdBenefitAmountsFromDifferentCompany.class,
                "uuid", uuid,
                "benefitType", benefitType,
                "ytdEmployeeDeductionAmount", ytdEmployeeDeductionAmount,
                "ytdCompanyContributionAmount", ytdCompanyContributionAmount);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Long benefitType;
 
        private String ytdEmployeeDeductionAmount;
 
        private String ytdCompanyContributionAmount;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier for this benefit amount record.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The benefit type supported by Gusto. See [Benefit Types](https://docs.gusto.com/embedded-payroll/reference/get-v1-benefits) for more information.
         */
        public Builder benefitType(long benefitType) {
            Utils.checkNotNull(benefitType, "benefitType");
            this.benefitType = benefitType;
            return this;
        }

        /**
         * The year-to-date employee deduction made outside the current company.
         */
        public Builder ytdEmployeeDeductionAmount(String ytdEmployeeDeductionAmount) {
            Utils.checkNotNull(ytdEmployeeDeductionAmount, "ytdEmployeeDeductionAmount");
            this.ytdEmployeeDeductionAmount = ytdEmployeeDeductionAmount;
            return this;
        }

        /**
         * The year-to-date company contribution made outside the current company.
         */
        public Builder ytdCompanyContributionAmount(String ytdCompanyContributionAmount) {
            Utils.checkNotNull(ytdCompanyContributionAmount, "ytdCompanyContributionAmount");
            this.ytdCompanyContributionAmount = ytdCompanyContributionAmount;
            return this;
        }
        
        public YtdBenefitAmountsFromDifferentCompany build() {
            return new YtdBenefitAmountsFromDifferentCompany(
                uuid,
                benefitType,
                ytdEmployeeDeductionAmount,
                ytdCompanyContributionAmount);
        }
    }
}

