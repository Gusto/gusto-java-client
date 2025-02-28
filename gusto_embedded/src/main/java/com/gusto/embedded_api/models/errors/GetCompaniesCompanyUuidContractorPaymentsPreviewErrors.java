/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.errors;
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

public class GetCompaniesCompanyUuidContractorPaymentsPreviewErrors {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("base")
    private Optional<? extends List<GetCompaniesCompanyUuidContractorPaymentsPreviewBase>> base;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("check_date")
    private Optional<? extends List<CheckDate>> checkDate;

    @JsonCreator
    public GetCompaniesCompanyUuidContractorPaymentsPreviewErrors(
            @JsonProperty("base") Optional<? extends List<GetCompaniesCompanyUuidContractorPaymentsPreviewBase>> base,
            @JsonProperty("check_date") Optional<? extends List<CheckDate>> checkDate) {
        Utils.checkNotNull(base, "base");
        Utils.checkNotNull(checkDate, "checkDate");
        this.base = base;
        this.checkDate = checkDate;
    }
    
    public GetCompaniesCompanyUuidContractorPaymentsPreviewErrors() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetCompaniesCompanyUuidContractorPaymentsPreviewBase>> base() {
        return (Optional<List<GetCompaniesCompanyUuidContractorPaymentsPreviewBase>>) base;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CheckDate>> checkDate() {
        return (Optional<List<CheckDate>>) checkDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCompaniesCompanyUuidContractorPaymentsPreviewErrors withBase(List<GetCompaniesCompanyUuidContractorPaymentsPreviewBase> base) {
        Utils.checkNotNull(base, "base");
        this.base = Optional.ofNullable(base);
        return this;
    }

    public GetCompaniesCompanyUuidContractorPaymentsPreviewErrors withBase(Optional<? extends List<GetCompaniesCompanyUuidContractorPaymentsPreviewBase>> base) {
        Utils.checkNotNull(base, "base");
        this.base = base;
        return this;
    }

    public GetCompaniesCompanyUuidContractorPaymentsPreviewErrors withCheckDate(List<CheckDate> checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = Optional.ofNullable(checkDate);
        return this;
    }

    public GetCompaniesCompanyUuidContractorPaymentsPreviewErrors withCheckDate(Optional<? extends List<CheckDate>> checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = checkDate;
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
        GetCompaniesCompanyUuidContractorPaymentsPreviewErrors other = (GetCompaniesCompanyUuidContractorPaymentsPreviewErrors) o;
        return 
            Objects.deepEquals(this.base, other.base) &&
            Objects.deepEquals(this.checkDate, other.checkDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            base,
            checkDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCompaniesCompanyUuidContractorPaymentsPreviewErrors.class,
                "base", base,
                "checkDate", checkDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<GetCompaniesCompanyUuidContractorPaymentsPreviewBase>> base = Optional.empty();
 
        private Optional<? extends List<CheckDate>> checkDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder base(List<GetCompaniesCompanyUuidContractorPaymentsPreviewBase> base) {
            Utils.checkNotNull(base, "base");
            this.base = Optional.ofNullable(base);
            return this;
        }

        public Builder base(Optional<? extends List<GetCompaniesCompanyUuidContractorPaymentsPreviewBase>> base) {
            Utils.checkNotNull(base, "base");
            this.base = base;
            return this;
        }

        public Builder checkDate(List<CheckDate> checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = Optional.ofNullable(checkDate);
            return this;
        }

        public Builder checkDate(Optional<? extends List<CheckDate>> checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = checkDate;
            return this;
        }
        
        public GetCompaniesCompanyUuidContractorPaymentsPreviewErrors build() {
            return new GetCompaniesCompanyUuidContractorPaymentsPreviewErrors(
                base,
                checkDate);
        }
    }
}

