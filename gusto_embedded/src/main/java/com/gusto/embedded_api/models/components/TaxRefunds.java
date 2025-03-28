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
import java.util.Objects;
import java.util.Optional;
/**
 * TaxRefunds
 * 
 * <p>Describes the taxes which are refundable to the company for this suspension. These may be refunded, or paid
 * by Gusto, depending on the value in `reconcile_tax_method`.
 */

public class TaxRefunds {

    /**
     * Dollar amount.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<String> amount;

    /**
     * What kind of tax this is.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonCreator
    public TaxRefunds(
            @JsonProperty("amount") Optional<String> amount,
            @JsonProperty("description") Optional<String> description) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(description, "description");
        this.amount = amount;
        this.description = description;
    }
    
    public TaxRefunds() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Dollar amount.
     */
    @JsonIgnore
    public Optional<String> amount() {
        return amount;
    }

    /**
     * What kind of tax this is.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Dollar amount.
     */
    public TaxRefunds withAmount(String amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    /**
     * Dollar amount.
     */
    public TaxRefunds withAmount(Optional<String> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * What kind of tax this is.
     */
    public TaxRefunds withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * What kind of tax this is.
     */
    public TaxRefunds withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
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
        TaxRefunds other = (TaxRefunds) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.description, other.description);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            description);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxRefunds.class,
                "amount", amount,
                "description", description);
    }
    
    public final static class Builder {
 
        private Optional<String> amount = Optional.empty();
 
        private Optional<String> description = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Dollar amount.
         */
        public Builder amount(String amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        /**
         * Dollar amount.
         */
        public Builder amount(Optional<String> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * What kind of tax this is.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * What kind of tax this is.
         */
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }
        
        public TaxRefunds build() {
            return new TaxRefunds(
                amount,
                description);
        }
    }
}

