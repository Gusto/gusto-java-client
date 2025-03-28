/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
/**
 * CompanyBenefitWithEmployeeBenefits
 * 
 * <p>The representation of a company benefit.
 */

public class CompanyBenefitWithEmployeeBenefits {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    private Optional<String> version;

    /**
     * The UUID of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_uuid")
    private Optional<String> companyUuid;

    /**
     * The UUID of the company benefit.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * The type of the benefit to which the company benefit belongs (same as benefit_id).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("benefit_type")
    private Optional<Long> benefitType;

    /**
     * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<Boolean> active;

    /**
     * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    /**
     * Whether this company benefit can be deleted. Deletable will be set to true if the benefit has not been used in payroll, has no employee benefits associated, and the benefit is not owned by Gusto or a Partner
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deletable")
    private Optional<Boolean> deletable;

    /**
     * Whether employee deductions and company contributions can be set as percentages of payroll for an individual employee. This is determined by the type of benefit and is not configurable by the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supports_percentage_amounts")
    private Optional<Boolean> supportsPercentageAmounts;

    /**
     * Whether the employer is subject to pay employer taxes when an employee is on leave. Only applicable to third party sick pay benefits.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("responsible_for_employer_taxes")
    private Optional<Boolean> responsibleForEmployerTaxes;

    /**
     * Whether the employer is subject to file W-2 forms for an employee on leave. Only applicable to third party sick pay benefits.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("responsible_for_employee_w2")
    private Optional<Boolean> responsibleForEmployeeW2;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_benefits")
    private Optional<? extends List<EmployeeBenefits>> employeeBenefits;

    @JsonCreator
    public CompanyBenefitWithEmployeeBenefits(
            @JsonProperty("version") Optional<String> version,
            @JsonProperty("company_uuid") Optional<String> companyUuid,
            @JsonProperty("uuid") String uuid,
            @JsonProperty("benefit_type") Optional<Long> benefitType,
            @JsonProperty("active") Optional<Boolean> active,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("deletable") Optional<Boolean> deletable,
            @JsonProperty("supports_percentage_amounts") Optional<Boolean> supportsPercentageAmounts,
            @JsonProperty("responsible_for_employer_taxes") Optional<Boolean> responsibleForEmployerTaxes,
            @JsonProperty("responsible_for_employee_w2") Optional<Boolean> responsibleForEmployeeW2,
            @JsonProperty("employee_benefits") Optional<? extends List<EmployeeBenefits>> employeeBenefits) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(benefitType, "benefitType");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(deletable, "deletable");
        Utils.checkNotNull(supportsPercentageAmounts, "supportsPercentageAmounts");
        Utils.checkNotNull(responsibleForEmployerTaxes, "responsibleForEmployerTaxes");
        Utils.checkNotNull(responsibleForEmployeeW2, "responsibleForEmployeeW2");
        Utils.checkNotNull(employeeBenefits, "employeeBenefits");
        this.version = version;
        this.companyUuid = companyUuid;
        this.uuid = uuid;
        this.benefitType = benefitType;
        this.active = active;
        this.description = description;
        this.deletable = deletable;
        this.supportsPercentageAmounts = supportsPercentageAmounts;
        this.responsibleForEmployerTaxes = responsibleForEmployerTaxes;
        this.responsibleForEmployeeW2 = responsibleForEmployeeW2;
        this.employeeBenefits = employeeBenefits;
    }
    
    public CompanyBenefitWithEmployeeBenefits(
            String uuid) {
        this(Optional.empty(), Optional.empty(), uuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonIgnore
    public Optional<String> version() {
        return version;
    }

    /**
     * The UUID of the company.
     */
    @JsonIgnore
    public Optional<String> companyUuid() {
        return companyUuid;
    }

    /**
     * The UUID of the company benefit.
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * The type of the benefit to which the company benefit belongs (same as benefit_id).
     */
    @JsonIgnore
    public Optional<Long> benefitType() {
        return benefitType;
    }

    /**
     * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
     */
    @JsonIgnore
    public Optional<Boolean> active() {
        return active;
    }

    /**
     * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * Whether this company benefit can be deleted. Deletable will be set to true if the benefit has not been used in payroll, has no employee benefits associated, and the benefit is not owned by Gusto or a Partner
     */
    @JsonIgnore
    public Optional<Boolean> deletable() {
        return deletable;
    }

    /**
     * Whether employee deductions and company contributions can be set as percentages of payroll for an individual employee. This is determined by the type of benefit and is not configurable by the company.
     */
    @JsonIgnore
    public Optional<Boolean> supportsPercentageAmounts() {
        return supportsPercentageAmounts;
    }

    /**
     * Whether the employer is subject to pay employer taxes when an employee is on leave. Only applicable to third party sick pay benefits.
     */
    @JsonIgnore
    public Optional<Boolean> responsibleForEmployerTaxes() {
        return responsibleForEmployerTaxes;
    }

    /**
     * Whether the employer is subject to file W-2 forms for an employee on leave. Only applicable to third party sick pay benefits.
     */
    @JsonIgnore
    public Optional<Boolean> responsibleForEmployeeW2() {
        return responsibleForEmployeeW2;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<EmployeeBenefits>> employeeBenefits() {
        return (Optional<List<EmployeeBenefits>>) employeeBenefits;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public CompanyBenefitWithEmployeeBenefits withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public CompanyBenefitWithEmployeeBenefits withVersion(Optional<String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * The UUID of the company.
     */
    public CompanyBenefitWithEmployeeBenefits withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = Optional.ofNullable(companyUuid);
        return this;
    }

    /**
     * The UUID of the company.
     */
    public CompanyBenefitWithEmployeeBenefits withCompanyUuid(Optional<String> companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * The UUID of the company benefit.
     */
    public CompanyBenefitWithEmployeeBenefits withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The type of the benefit to which the company benefit belongs (same as benefit_id).
     */
    public CompanyBenefitWithEmployeeBenefits withBenefitType(long benefitType) {
        Utils.checkNotNull(benefitType, "benefitType");
        this.benefitType = Optional.ofNullable(benefitType);
        return this;
    }

    /**
     * The type of the benefit to which the company benefit belongs (same as benefit_id).
     */
    public CompanyBenefitWithEmployeeBenefits withBenefitType(Optional<Long> benefitType) {
        Utils.checkNotNull(benefitType, "benefitType");
        this.benefitType = benefitType;
        return this;
    }

    /**
     * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
     */
    public CompanyBenefitWithEmployeeBenefits withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    /**
     * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
     */
    public CompanyBenefitWithEmployeeBenefits withActive(Optional<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
     */
    public CompanyBenefitWithEmployeeBenefits withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
     */
    public CompanyBenefitWithEmployeeBenefits withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Whether this company benefit can be deleted. Deletable will be set to true if the benefit has not been used in payroll, has no employee benefits associated, and the benefit is not owned by Gusto or a Partner
     */
    public CompanyBenefitWithEmployeeBenefits withDeletable(boolean deletable) {
        Utils.checkNotNull(deletable, "deletable");
        this.deletable = Optional.ofNullable(deletable);
        return this;
    }

    /**
     * Whether this company benefit can be deleted. Deletable will be set to true if the benefit has not been used in payroll, has no employee benefits associated, and the benefit is not owned by Gusto or a Partner
     */
    public CompanyBenefitWithEmployeeBenefits withDeletable(Optional<Boolean> deletable) {
        Utils.checkNotNull(deletable, "deletable");
        this.deletable = deletable;
        return this;
    }

    /**
     * Whether employee deductions and company contributions can be set as percentages of payroll for an individual employee. This is determined by the type of benefit and is not configurable by the company.
     */
    public CompanyBenefitWithEmployeeBenefits withSupportsPercentageAmounts(boolean supportsPercentageAmounts) {
        Utils.checkNotNull(supportsPercentageAmounts, "supportsPercentageAmounts");
        this.supportsPercentageAmounts = Optional.ofNullable(supportsPercentageAmounts);
        return this;
    }

    /**
     * Whether employee deductions and company contributions can be set as percentages of payroll for an individual employee. This is determined by the type of benefit and is not configurable by the company.
     */
    public CompanyBenefitWithEmployeeBenefits withSupportsPercentageAmounts(Optional<Boolean> supportsPercentageAmounts) {
        Utils.checkNotNull(supportsPercentageAmounts, "supportsPercentageAmounts");
        this.supportsPercentageAmounts = supportsPercentageAmounts;
        return this;
    }

    /**
     * Whether the employer is subject to pay employer taxes when an employee is on leave. Only applicable to third party sick pay benefits.
     */
    public CompanyBenefitWithEmployeeBenefits withResponsibleForEmployerTaxes(boolean responsibleForEmployerTaxes) {
        Utils.checkNotNull(responsibleForEmployerTaxes, "responsibleForEmployerTaxes");
        this.responsibleForEmployerTaxes = Optional.ofNullable(responsibleForEmployerTaxes);
        return this;
    }

    /**
     * Whether the employer is subject to pay employer taxes when an employee is on leave. Only applicable to third party sick pay benefits.
     */
    public CompanyBenefitWithEmployeeBenefits withResponsibleForEmployerTaxes(Optional<Boolean> responsibleForEmployerTaxes) {
        Utils.checkNotNull(responsibleForEmployerTaxes, "responsibleForEmployerTaxes");
        this.responsibleForEmployerTaxes = responsibleForEmployerTaxes;
        return this;
    }

    /**
     * Whether the employer is subject to file W-2 forms for an employee on leave. Only applicable to third party sick pay benefits.
     */
    public CompanyBenefitWithEmployeeBenefits withResponsibleForEmployeeW2(boolean responsibleForEmployeeW2) {
        Utils.checkNotNull(responsibleForEmployeeW2, "responsibleForEmployeeW2");
        this.responsibleForEmployeeW2 = Optional.ofNullable(responsibleForEmployeeW2);
        return this;
    }

    /**
     * Whether the employer is subject to file W-2 forms for an employee on leave. Only applicable to third party sick pay benefits.
     */
    public CompanyBenefitWithEmployeeBenefits withResponsibleForEmployeeW2(Optional<Boolean> responsibleForEmployeeW2) {
        Utils.checkNotNull(responsibleForEmployeeW2, "responsibleForEmployeeW2");
        this.responsibleForEmployeeW2 = responsibleForEmployeeW2;
        return this;
    }

    public CompanyBenefitWithEmployeeBenefits withEmployeeBenefits(List<EmployeeBenefits> employeeBenefits) {
        Utils.checkNotNull(employeeBenefits, "employeeBenefits");
        this.employeeBenefits = Optional.ofNullable(employeeBenefits);
        return this;
    }

    public CompanyBenefitWithEmployeeBenefits withEmployeeBenefits(Optional<? extends List<EmployeeBenefits>> employeeBenefits) {
        Utils.checkNotNull(employeeBenefits, "employeeBenefits");
        this.employeeBenefits = employeeBenefits;
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
        CompanyBenefitWithEmployeeBenefits other = (CompanyBenefitWithEmployeeBenefits) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.benefitType, other.benefitType) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.deletable, other.deletable) &&
            Objects.deepEquals(this.supportsPercentageAmounts, other.supportsPercentageAmounts) &&
            Objects.deepEquals(this.responsibleForEmployerTaxes, other.responsibleForEmployerTaxes) &&
            Objects.deepEquals(this.responsibleForEmployeeW2, other.responsibleForEmployeeW2) &&
            Objects.deepEquals(this.employeeBenefits, other.employeeBenefits);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            version,
            companyUuid,
            uuid,
            benefitType,
            active,
            description,
            deletable,
            supportsPercentageAmounts,
            responsibleForEmployerTaxes,
            responsibleForEmployeeW2,
            employeeBenefits);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyBenefitWithEmployeeBenefits.class,
                "version", version,
                "companyUuid", companyUuid,
                "uuid", uuid,
                "benefitType", benefitType,
                "active", active,
                "description", description,
                "deletable", deletable,
                "supportsPercentageAmounts", supportsPercentageAmounts,
                "responsibleForEmployerTaxes", responsibleForEmployerTaxes,
                "responsibleForEmployeeW2", responsibleForEmployeeW2,
                "employeeBenefits", employeeBenefits);
    }
    
    public final static class Builder {
 
        private Optional<String> version = Optional.empty();
 
        private Optional<String> companyUuid = Optional.empty();
 
        private String uuid;
 
        private Optional<Long> benefitType = Optional.empty();
 
        private Optional<Boolean> active;
 
        private Optional<String> description = Optional.empty();
 
        private Optional<Boolean> deletable = Optional.empty();
 
        private Optional<Boolean> supportsPercentageAmounts = Optional.empty();
 
        private Optional<Boolean> responsibleForEmployerTaxes = Optional.empty();
 
        private Optional<Boolean> responsibleForEmployeeW2 = Optional.empty();
 
        private Optional<? extends List<EmployeeBenefits>> employeeBenefits = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = Optional.ofNullable(version);
            return this;
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(Optional<String> version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        /**
         * The UUID of the company.
         */
        public Builder companyUuid(String companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = Optional.ofNullable(companyUuid);
            return this;
        }

        /**
         * The UUID of the company.
         */
        public Builder companyUuid(Optional<String> companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = companyUuid;
            return this;
        }

        /**
         * The UUID of the company benefit.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The type of the benefit to which the company benefit belongs (same as benefit_id).
         */
        public Builder benefitType(long benefitType) {
            Utils.checkNotNull(benefitType, "benefitType");
            this.benefitType = Optional.ofNullable(benefitType);
            return this;
        }

        /**
         * The type of the benefit to which the company benefit belongs (same as benefit_id).
         */
        public Builder benefitType(Optional<Long> benefitType) {
            Utils.checkNotNull(benefitType, "benefitType");
            this.benefitType = benefitType;
            return this;
        }

        /**
         * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        /**
         * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
         */
        public Builder active(Optional<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
         */
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Whether this company benefit can be deleted. Deletable will be set to true if the benefit has not been used in payroll, has no employee benefits associated, and the benefit is not owned by Gusto or a Partner
         */
        public Builder deletable(boolean deletable) {
            Utils.checkNotNull(deletable, "deletable");
            this.deletable = Optional.ofNullable(deletable);
            return this;
        }

        /**
         * Whether this company benefit can be deleted. Deletable will be set to true if the benefit has not been used in payroll, has no employee benefits associated, and the benefit is not owned by Gusto or a Partner
         */
        public Builder deletable(Optional<Boolean> deletable) {
            Utils.checkNotNull(deletable, "deletable");
            this.deletable = deletable;
            return this;
        }

        /**
         * Whether employee deductions and company contributions can be set as percentages of payroll for an individual employee. This is determined by the type of benefit and is not configurable by the company.
         */
        public Builder supportsPercentageAmounts(boolean supportsPercentageAmounts) {
            Utils.checkNotNull(supportsPercentageAmounts, "supportsPercentageAmounts");
            this.supportsPercentageAmounts = Optional.ofNullable(supportsPercentageAmounts);
            return this;
        }

        /**
         * Whether employee deductions and company contributions can be set as percentages of payroll for an individual employee. This is determined by the type of benefit and is not configurable by the company.
         */
        public Builder supportsPercentageAmounts(Optional<Boolean> supportsPercentageAmounts) {
            Utils.checkNotNull(supportsPercentageAmounts, "supportsPercentageAmounts");
            this.supportsPercentageAmounts = supportsPercentageAmounts;
            return this;
        }

        /**
         * Whether the employer is subject to pay employer taxes when an employee is on leave. Only applicable to third party sick pay benefits.
         */
        public Builder responsibleForEmployerTaxes(boolean responsibleForEmployerTaxes) {
            Utils.checkNotNull(responsibleForEmployerTaxes, "responsibleForEmployerTaxes");
            this.responsibleForEmployerTaxes = Optional.ofNullable(responsibleForEmployerTaxes);
            return this;
        }

        /**
         * Whether the employer is subject to pay employer taxes when an employee is on leave. Only applicable to third party sick pay benefits.
         */
        public Builder responsibleForEmployerTaxes(Optional<Boolean> responsibleForEmployerTaxes) {
            Utils.checkNotNull(responsibleForEmployerTaxes, "responsibleForEmployerTaxes");
            this.responsibleForEmployerTaxes = responsibleForEmployerTaxes;
            return this;
        }

        /**
         * Whether the employer is subject to file W-2 forms for an employee on leave. Only applicable to third party sick pay benefits.
         */
        public Builder responsibleForEmployeeW2(boolean responsibleForEmployeeW2) {
            Utils.checkNotNull(responsibleForEmployeeW2, "responsibleForEmployeeW2");
            this.responsibleForEmployeeW2 = Optional.ofNullable(responsibleForEmployeeW2);
            return this;
        }

        /**
         * Whether the employer is subject to file W-2 forms for an employee on leave. Only applicable to third party sick pay benefits.
         */
        public Builder responsibleForEmployeeW2(Optional<Boolean> responsibleForEmployeeW2) {
            Utils.checkNotNull(responsibleForEmployeeW2, "responsibleForEmployeeW2");
            this.responsibleForEmployeeW2 = responsibleForEmployeeW2;
            return this;
        }

        public Builder employeeBenefits(List<EmployeeBenefits> employeeBenefits) {
            Utils.checkNotNull(employeeBenefits, "employeeBenefits");
            this.employeeBenefits = Optional.ofNullable(employeeBenefits);
            return this;
        }

        public Builder employeeBenefits(Optional<? extends List<EmployeeBenefits>> employeeBenefits) {
            Utils.checkNotNull(employeeBenefits, "employeeBenefits");
            this.employeeBenefits = employeeBenefits;
            return this;
        }
        
        public CompanyBenefitWithEmployeeBenefits build() {
            if (active == null) {
                active = _SINGLETON_VALUE_Active.value();
            }            return new CompanyBenefitWithEmployeeBenefits(
                version,
                companyUuid,
                uuid,
                benefitType,
                active,
                description,
                deletable,
                supportsPercentageAmounts,
                responsibleForEmployerTaxes,
                responsibleForEmployeeW2,
                employeeBenefits);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Active =
                new LazySingletonValue<>(
                        "active",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

