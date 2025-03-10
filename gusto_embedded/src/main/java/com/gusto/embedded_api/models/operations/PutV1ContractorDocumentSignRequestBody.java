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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PutV1ContractorDocumentSignRequestBody {

    /**
     * List of fields and the values they will be set to.
     */
    @JsonProperty("fields")
    private List<Fields> fields;

    /**
     * Whether you agree to sign electronically
     */
    @JsonProperty("agree")
    private boolean agree;

    /**
     * The IP address of the signatory who signed the form. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signed_by_ip_address")
    private Optional<String> signedByIpAddress;

    @JsonCreator
    public PutV1ContractorDocumentSignRequestBody(
            @JsonProperty("fields") List<Fields> fields,
            @JsonProperty("agree") boolean agree,
            @JsonProperty("signed_by_ip_address") Optional<String> signedByIpAddress) {
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(agree, "agree");
        Utils.checkNotNull(signedByIpAddress, "signedByIpAddress");
        this.fields = fields;
        this.agree = agree;
        this.signedByIpAddress = signedByIpAddress;
    }
    
    public PutV1ContractorDocumentSignRequestBody(
            List<Fields> fields,
            boolean agree) {
        this(fields, agree, Optional.empty());
    }

    /**
     * List of fields and the values they will be set to.
     */
    @JsonIgnore
    public List<Fields> fields() {
        return fields;
    }

    /**
     * Whether you agree to sign electronically
     */
    @JsonIgnore
    public boolean agree() {
        return agree;
    }

    /**
     * The IP address of the signatory who signed the form. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
     */
    @JsonIgnore
    public Optional<String> signedByIpAddress() {
        return signedByIpAddress;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * List of fields and the values they will be set to.
     */
    public PutV1ContractorDocumentSignRequestBody withFields(List<Fields> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Whether you agree to sign electronically
     */
    public PutV1ContractorDocumentSignRequestBody withAgree(boolean agree) {
        Utils.checkNotNull(agree, "agree");
        this.agree = agree;
        return this;
    }

    /**
     * The IP address of the signatory who signed the form. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
     */
    public PutV1ContractorDocumentSignRequestBody withSignedByIpAddress(String signedByIpAddress) {
        Utils.checkNotNull(signedByIpAddress, "signedByIpAddress");
        this.signedByIpAddress = Optional.ofNullable(signedByIpAddress);
        return this;
    }

    /**
     * The IP address of the signatory who signed the form. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
     */
    public PutV1ContractorDocumentSignRequestBody withSignedByIpAddress(Optional<String> signedByIpAddress) {
        Utils.checkNotNull(signedByIpAddress, "signedByIpAddress");
        this.signedByIpAddress = signedByIpAddress;
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
        PutV1ContractorDocumentSignRequestBody other = (PutV1ContractorDocumentSignRequestBody) o;
        return 
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.agree, other.agree) &&
            Objects.deepEquals(this.signedByIpAddress, other.signedByIpAddress);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fields,
            agree,
            signedByIpAddress);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1ContractorDocumentSignRequestBody.class,
                "fields", fields,
                "agree", agree,
                "signedByIpAddress", signedByIpAddress);
    }
    
    public final static class Builder {
 
        private List<Fields> fields;
 
        private Boolean agree;
 
        private Optional<String> signedByIpAddress = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * List of fields and the values they will be set to.
         */
        public Builder fields(List<Fields> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }

        /**
         * Whether you agree to sign electronically
         */
        public Builder agree(boolean agree) {
            Utils.checkNotNull(agree, "agree");
            this.agree = agree;
            return this;
        }

        /**
         * The IP address of the signatory who signed the form. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
         */
        public Builder signedByIpAddress(String signedByIpAddress) {
            Utils.checkNotNull(signedByIpAddress, "signedByIpAddress");
            this.signedByIpAddress = Optional.ofNullable(signedByIpAddress);
            return this;
        }

        /**
         * The IP address of the signatory who signed the form. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
         */
        public Builder signedByIpAddress(Optional<String> signedByIpAddress) {
            Utils.checkNotNull(signedByIpAddress, "signedByIpAddress");
            this.signedByIpAddress = signedByIpAddress;
            return this;
        }
        
        public PutV1ContractorDocumentSignRequestBody build() {
            return new PutV1ContractorDocumentSignRequestBody(
                fields,
                agree,
                signedByIpAddress);
        }
    }
}

