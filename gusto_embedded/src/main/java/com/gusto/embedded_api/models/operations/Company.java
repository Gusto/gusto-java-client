/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class Company {

    /**
     * The legal name of the company.
     */
    @JsonProperty("name")
    private String name;

    /**
     * The name of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trade_name")
    private Optional<String> tradeName;

    /**
     * The employer identification number (EIN) of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ein")
    private Optional<String> ein;

    /**
     * Whether the company only supports contractors. Should be set to true if the company has no W-2 employees. If not passed, will default to false (i.e. the company will support both contractors and employees).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contractor_only")
    private Optional<Boolean> contractorOnly;

    @JsonCreator
    public Company(
            @JsonProperty("name") String name,
            @JsonProperty("trade_name") Optional<String> tradeName,
            @JsonProperty("ein") Optional<String> ein,
            @JsonProperty("contractor_only") Optional<Boolean> contractorOnly) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(tradeName, "tradeName");
        Utils.checkNotNull(ein, "ein");
        Utils.checkNotNull(contractorOnly, "contractorOnly");
        this.name = name;
        this.tradeName = tradeName;
        this.ein = ein;
        this.contractorOnly = contractorOnly;
    }
    
    public Company(
            String name) {
        this(name, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The legal name of the company.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The name of the company.
     */
    @JsonIgnore
    public Optional<String> tradeName() {
        return tradeName;
    }

    /**
     * The employer identification number (EIN) of the company.
     */
    @JsonIgnore
    public Optional<String> ein() {
        return ein;
    }

    /**
     * Whether the company only supports contractors. Should be set to true if the company has no W-2 employees. If not passed, will default to false (i.e. the company will support both contractors and employees).
     */
    @JsonIgnore
    public Optional<Boolean> contractorOnly() {
        return contractorOnly;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The legal name of the company.
     */
    public Company withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The name of the company.
     */
    public Company withTradeName(String tradeName) {
        Utils.checkNotNull(tradeName, "tradeName");
        this.tradeName = Optional.ofNullable(tradeName);
        return this;
    }

    /**
     * The name of the company.
     */
    public Company withTradeName(Optional<String> tradeName) {
        Utils.checkNotNull(tradeName, "tradeName");
        this.tradeName = tradeName;
        return this;
    }

    /**
     * The employer identification number (EIN) of the company.
     */
    public Company withEin(String ein) {
        Utils.checkNotNull(ein, "ein");
        this.ein = Optional.ofNullable(ein);
        return this;
    }

    /**
     * The employer identification number (EIN) of the company.
     */
    public Company withEin(Optional<String> ein) {
        Utils.checkNotNull(ein, "ein");
        this.ein = ein;
        return this;
    }

    /**
     * Whether the company only supports contractors. Should be set to true if the company has no W-2 employees. If not passed, will default to false (i.e. the company will support both contractors and employees).
     */
    public Company withContractorOnly(boolean contractorOnly) {
        Utils.checkNotNull(contractorOnly, "contractorOnly");
        this.contractorOnly = Optional.ofNullable(contractorOnly);
        return this;
    }

    /**
     * Whether the company only supports contractors. Should be set to true if the company has no W-2 employees. If not passed, will default to false (i.e. the company will support both contractors and employees).
     */
    public Company withContractorOnly(Optional<Boolean> contractorOnly) {
        Utils.checkNotNull(contractorOnly, "contractorOnly");
        this.contractorOnly = contractorOnly;
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
        Company other = (Company) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.tradeName, other.tradeName) &&
            Objects.deepEquals(this.ein, other.ein) &&
            Objects.deepEquals(this.contractorOnly, other.contractorOnly);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            tradeName,
            ein,
            contractorOnly);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Company.class,
                "name", name,
                "tradeName", tradeName,
                "ein", ein,
                "contractorOnly", contractorOnly);
    }
    
    public final static class Builder {
 
        private String name;
 
        private Optional<String> tradeName = Optional.empty();
 
        private Optional<String> ein = Optional.empty();
 
        private Optional<Boolean> contractorOnly = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The legal name of the company.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The name of the company.
         */
        public Builder tradeName(String tradeName) {
            Utils.checkNotNull(tradeName, "tradeName");
            this.tradeName = Optional.ofNullable(tradeName);
            return this;
        }

        /**
         * The name of the company.
         */
        public Builder tradeName(Optional<String> tradeName) {
            Utils.checkNotNull(tradeName, "tradeName");
            this.tradeName = tradeName;
            return this;
        }

        /**
         * The employer identification number (EIN) of the company.
         */
        public Builder ein(String ein) {
            Utils.checkNotNull(ein, "ein");
            this.ein = Optional.ofNullable(ein);
            return this;
        }

        /**
         * The employer identification number (EIN) of the company.
         */
        public Builder ein(Optional<String> ein) {
            Utils.checkNotNull(ein, "ein");
            this.ein = ein;
            return this;
        }

        /**
         * Whether the company only supports contractors. Should be set to true if the company has no W-2 employees. If not passed, will default to false (i.e. the company will support both contractors and employees).
         */
        public Builder contractorOnly(boolean contractorOnly) {
            Utils.checkNotNull(contractorOnly, "contractorOnly");
            this.contractorOnly = Optional.ofNullable(contractorOnly);
            return this;
        }

        /**
         * Whether the company only supports contractors. Should be set to true if the company has no W-2 employees. If not passed, will default to false (i.e. the company will support both contractors and employees).
         */
        public Builder contractorOnly(Optional<Boolean> contractorOnly) {
            Utils.checkNotNull(contractorOnly, "contractorOnly");
            this.contractorOnly = contractorOnly;
            return this;
        }
        
        public Company build() {
            return new Company(
                name,
                tradeName,
                ein,
                contractorOnly);
        }
    }
}

