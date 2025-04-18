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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class PutWireInRequestsWireInRequestUuidRequestBody {

    /**
     * The date the wire was sent
     */
    @JsonProperty("date_sent")
    private String dateSent;

    /**
     * Name of the bank sending the wire
     */
    @JsonProperty("bank_name")
    private String bankName;

    /**
     * Amount of money sent
     */
    @JsonProperty("amount_sent")
    private String amountSent;

    /**
     * Additional notes
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additional_notes")
    private Optional<String> additionalNotes;

    @JsonCreator
    public PutWireInRequestsWireInRequestUuidRequestBody(
            @JsonProperty("date_sent") String dateSent,
            @JsonProperty("bank_name") String bankName,
            @JsonProperty("amount_sent") String amountSent,
            @JsonProperty("additional_notes") Optional<String> additionalNotes) {
        Utils.checkNotNull(dateSent, "dateSent");
        Utils.checkNotNull(bankName, "bankName");
        Utils.checkNotNull(amountSent, "amountSent");
        Utils.checkNotNull(additionalNotes, "additionalNotes");
        this.dateSent = dateSent;
        this.bankName = bankName;
        this.amountSent = amountSent;
        this.additionalNotes = additionalNotes;
    }
    
    public PutWireInRequestsWireInRequestUuidRequestBody(
            String dateSent,
            String bankName,
            String amountSent) {
        this(dateSent, bankName, amountSent, Optional.empty());
    }

    /**
     * The date the wire was sent
     */
    @JsonIgnore
    public String dateSent() {
        return dateSent;
    }

    /**
     * Name of the bank sending the wire
     */
    @JsonIgnore
    public String bankName() {
        return bankName;
    }

    /**
     * Amount of money sent
     */
    @JsonIgnore
    public String amountSent() {
        return amountSent;
    }

    /**
     * Additional notes
     */
    @JsonIgnore
    public Optional<String> additionalNotes() {
        return additionalNotes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The date the wire was sent
     */
    public PutWireInRequestsWireInRequestUuidRequestBody withDateSent(String dateSent) {
        Utils.checkNotNull(dateSent, "dateSent");
        this.dateSent = dateSent;
        return this;
    }

    /**
     * Name of the bank sending the wire
     */
    public PutWireInRequestsWireInRequestUuidRequestBody withBankName(String bankName) {
        Utils.checkNotNull(bankName, "bankName");
        this.bankName = bankName;
        return this;
    }

    /**
     * Amount of money sent
     */
    public PutWireInRequestsWireInRequestUuidRequestBody withAmountSent(String amountSent) {
        Utils.checkNotNull(amountSent, "amountSent");
        this.amountSent = amountSent;
        return this;
    }

    /**
     * Additional notes
     */
    public PutWireInRequestsWireInRequestUuidRequestBody withAdditionalNotes(String additionalNotes) {
        Utils.checkNotNull(additionalNotes, "additionalNotes");
        this.additionalNotes = Optional.ofNullable(additionalNotes);
        return this;
    }

    /**
     * Additional notes
     */
    public PutWireInRequestsWireInRequestUuidRequestBody withAdditionalNotes(Optional<String> additionalNotes) {
        Utils.checkNotNull(additionalNotes, "additionalNotes");
        this.additionalNotes = additionalNotes;
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
        PutWireInRequestsWireInRequestUuidRequestBody other = (PutWireInRequestsWireInRequestUuidRequestBody) o;
        return 
            Objects.deepEquals(this.dateSent, other.dateSent) &&
            Objects.deepEquals(this.bankName, other.bankName) &&
            Objects.deepEquals(this.amountSent, other.amountSent) &&
            Objects.deepEquals(this.additionalNotes, other.additionalNotes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            dateSent,
            bankName,
            amountSent,
            additionalNotes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutWireInRequestsWireInRequestUuidRequestBody.class,
                "dateSent", dateSent,
                "bankName", bankName,
                "amountSent", amountSent,
                "additionalNotes", additionalNotes);
    }
    
    public final static class Builder {
 
        private String dateSent;
 
        private String bankName;
 
        private String amountSent;
 
        private Optional<String> additionalNotes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The date the wire was sent
         */
        public Builder dateSent(String dateSent) {
            Utils.checkNotNull(dateSent, "dateSent");
            this.dateSent = dateSent;
            return this;
        }

        /**
         * Name of the bank sending the wire
         */
        public Builder bankName(String bankName) {
            Utils.checkNotNull(bankName, "bankName");
            this.bankName = bankName;
            return this;
        }

        /**
         * Amount of money sent
         */
        public Builder amountSent(String amountSent) {
            Utils.checkNotNull(amountSent, "amountSent");
            this.amountSent = amountSent;
            return this;
        }

        /**
         * Additional notes
         */
        public Builder additionalNotes(String additionalNotes) {
            Utils.checkNotNull(additionalNotes, "additionalNotes");
            this.additionalNotes = Optional.ofNullable(additionalNotes);
            return this;
        }

        /**
         * Additional notes
         */
        public Builder additionalNotes(Optional<String> additionalNotes) {
            Utils.checkNotNull(additionalNotes, "additionalNotes");
            this.additionalNotes = additionalNotes;
            return this;
        }
        
        public PutWireInRequestsWireInRequestUuidRequestBody build() {
            return new PutWireInRequestsWireInRequestUuidRequestBody(
                dateSent,
                bankName,
                amountSent,
                additionalNotes);
        }
    }
}

