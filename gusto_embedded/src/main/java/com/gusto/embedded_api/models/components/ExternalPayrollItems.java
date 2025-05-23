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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ExternalPayrollItems {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_uuid")
    private Optional<String> employeeUuid;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("earnings")
    private Optional<? extends List<Earnings>> earnings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("benefits")
    private Optional<? extends List<ExternalPayrollBenefits>> benefits;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxes")
    private Optional<? extends List<ExternalPayrollTaxes>> taxes;

    @JsonCreator
    public ExternalPayrollItems(
            @JsonProperty("employee_uuid") Optional<String> employeeUuid,
            @JsonProperty("earnings") Optional<? extends List<Earnings>> earnings,
            @JsonProperty("benefits") Optional<? extends List<ExternalPayrollBenefits>> benefits,
            @JsonProperty("taxes") Optional<? extends List<ExternalPayrollTaxes>> taxes) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        Utils.checkNotNull(earnings, "earnings");
        Utils.checkNotNull(benefits, "benefits");
        Utils.checkNotNull(taxes, "taxes");
        this.employeeUuid = employeeUuid;
        this.earnings = earnings;
        this.benefits = benefits;
        this.taxes = taxes;
    }
    
    public ExternalPayrollItems() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> employeeUuid() {
        return employeeUuid;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Earnings>> earnings() {
        return (Optional<List<Earnings>>) earnings;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ExternalPayrollBenefits>> benefits() {
        return (Optional<List<ExternalPayrollBenefits>>) benefits;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ExternalPayrollTaxes>> taxes() {
        return (Optional<List<ExternalPayrollTaxes>>) taxes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ExternalPayrollItems withEmployeeUuid(String employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = Optional.ofNullable(employeeUuid);
        return this;
    }

    public ExternalPayrollItems withEmployeeUuid(Optional<String> employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = employeeUuid;
        return this;
    }

    public ExternalPayrollItems withEarnings(List<Earnings> earnings) {
        Utils.checkNotNull(earnings, "earnings");
        this.earnings = Optional.ofNullable(earnings);
        return this;
    }

    public ExternalPayrollItems withEarnings(Optional<? extends List<Earnings>> earnings) {
        Utils.checkNotNull(earnings, "earnings");
        this.earnings = earnings;
        return this;
    }

    public ExternalPayrollItems withBenefits(List<ExternalPayrollBenefits> benefits) {
        Utils.checkNotNull(benefits, "benefits");
        this.benefits = Optional.ofNullable(benefits);
        return this;
    }

    public ExternalPayrollItems withBenefits(Optional<? extends List<ExternalPayrollBenefits>> benefits) {
        Utils.checkNotNull(benefits, "benefits");
        this.benefits = benefits;
        return this;
    }

    public ExternalPayrollItems withTaxes(List<ExternalPayrollTaxes> taxes) {
        Utils.checkNotNull(taxes, "taxes");
        this.taxes = Optional.ofNullable(taxes);
        return this;
    }

    public ExternalPayrollItems withTaxes(Optional<? extends List<ExternalPayrollTaxes>> taxes) {
        Utils.checkNotNull(taxes, "taxes");
        this.taxes = taxes;
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
        ExternalPayrollItems other = (ExternalPayrollItems) o;
        return 
            Objects.deepEquals(this.employeeUuid, other.employeeUuid) &&
            Objects.deepEquals(this.earnings, other.earnings) &&
            Objects.deepEquals(this.benefits, other.benefits) &&
            Objects.deepEquals(this.taxes, other.taxes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employeeUuid,
            earnings,
            benefits,
            taxes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExternalPayrollItems.class,
                "employeeUuid", employeeUuid,
                "earnings", earnings,
                "benefits", benefits,
                "taxes", taxes);
    }
    
    public final static class Builder {
 
        private Optional<String> employeeUuid = Optional.empty();
 
        private Optional<? extends List<Earnings>> earnings = Optional.empty();
 
        private Optional<? extends List<ExternalPayrollBenefits>> benefits = Optional.empty();
 
        private Optional<? extends List<ExternalPayrollTaxes>> taxes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder employeeUuid(String employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = Optional.ofNullable(employeeUuid);
            return this;
        }

        public Builder employeeUuid(Optional<String> employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = employeeUuid;
            return this;
        }

        public Builder earnings(List<Earnings> earnings) {
            Utils.checkNotNull(earnings, "earnings");
            this.earnings = Optional.ofNullable(earnings);
            return this;
        }

        public Builder earnings(Optional<? extends List<Earnings>> earnings) {
            Utils.checkNotNull(earnings, "earnings");
            this.earnings = earnings;
            return this;
        }

        public Builder benefits(List<ExternalPayrollBenefits> benefits) {
            Utils.checkNotNull(benefits, "benefits");
            this.benefits = Optional.ofNullable(benefits);
            return this;
        }

        public Builder benefits(Optional<? extends List<ExternalPayrollBenefits>> benefits) {
            Utils.checkNotNull(benefits, "benefits");
            this.benefits = benefits;
            return this;
        }

        public Builder taxes(List<ExternalPayrollTaxes> taxes) {
            Utils.checkNotNull(taxes, "taxes");
            this.taxes = Optional.ofNullable(taxes);
            return this;
        }

        public Builder taxes(Optional<? extends List<ExternalPayrollTaxes>> taxes) {
            Utils.checkNotNull(taxes, "taxes");
            this.taxes = taxes;
            return this;
        }
        
        public ExternalPayrollItems build() {
            return new ExternalPayrollItems(
                employeeUuid,
                earnings,
                benefits,
                taxes);
        }
    }
}

