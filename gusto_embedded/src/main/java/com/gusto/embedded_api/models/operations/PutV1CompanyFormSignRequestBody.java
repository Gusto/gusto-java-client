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

public class PutV1CompanyFormSignRequestBody {

    /**
     * The signature
     */
    @JsonProperty("signature_text")
    private String signatureText;

    /**
     * Whether you agree to sign electronically
     */
    @JsonProperty("agree")
    private boolean agree;

    /**
     * The IP address of the signatory who signed the form. Both IPv4 AND IPv6 are supported. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signed_by_ip_address")
    private Optional<String> signedByIpAddress;

    @JsonCreator
    public PutV1CompanyFormSignRequestBody(
            @JsonProperty("signature_text") String signatureText,
            @JsonProperty("agree") boolean agree,
            @JsonProperty("signed_by_ip_address") Optional<String> signedByIpAddress) {
        Utils.checkNotNull(signatureText, "signatureText");
        Utils.checkNotNull(agree, "agree");
        Utils.checkNotNull(signedByIpAddress, "signedByIpAddress");
        this.signatureText = signatureText;
        this.agree = agree;
        this.signedByIpAddress = signedByIpAddress;
    }
    
    public PutV1CompanyFormSignRequestBody(
            String signatureText,
            boolean agree) {
        this(signatureText, agree, Optional.empty());
    }

    /**
     * The signature
     */
    @JsonIgnore
    public String signatureText() {
        return signatureText;
    }

    /**
     * Whether you agree to sign electronically
     */
    @JsonIgnore
    public boolean agree() {
        return agree;
    }

    /**
     * The IP address of the signatory who signed the form. Both IPv4 AND IPv6 are supported. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
     */
    @JsonIgnore
    public Optional<String> signedByIpAddress() {
        return signedByIpAddress;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The signature
     */
    public PutV1CompanyFormSignRequestBody withSignatureText(String signatureText) {
        Utils.checkNotNull(signatureText, "signatureText");
        this.signatureText = signatureText;
        return this;
    }

    /**
     * Whether you agree to sign electronically
     */
    public PutV1CompanyFormSignRequestBody withAgree(boolean agree) {
        Utils.checkNotNull(agree, "agree");
        this.agree = agree;
        return this;
    }

    /**
     * The IP address of the signatory who signed the form. Both IPv4 AND IPv6 are supported. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
     */
    public PutV1CompanyFormSignRequestBody withSignedByIpAddress(String signedByIpAddress) {
        Utils.checkNotNull(signedByIpAddress, "signedByIpAddress");
        this.signedByIpAddress = Optional.ofNullable(signedByIpAddress);
        return this;
    }

    /**
     * The IP address of the signatory who signed the form. Both IPv4 AND IPv6 are supported. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
     */
    public PutV1CompanyFormSignRequestBody withSignedByIpAddress(Optional<String> signedByIpAddress) {
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
        PutV1CompanyFormSignRequestBody other = (PutV1CompanyFormSignRequestBody) o;
        return 
            Objects.deepEquals(this.signatureText, other.signatureText) &&
            Objects.deepEquals(this.agree, other.agree) &&
            Objects.deepEquals(this.signedByIpAddress, other.signedByIpAddress);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            signatureText,
            agree,
            signedByIpAddress);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1CompanyFormSignRequestBody.class,
                "signatureText", signatureText,
                "agree", agree,
                "signedByIpAddress", signedByIpAddress);
    }
    
    public final static class Builder {
 
        private String signatureText;
 
        private Boolean agree;
 
        private Optional<String> signedByIpAddress = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The signature
         */
        public Builder signatureText(String signatureText) {
            Utils.checkNotNull(signatureText, "signatureText");
            this.signatureText = signatureText;
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
         * The IP address of the signatory who signed the form. Both IPv4 AND IPv6 are supported. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
         */
        public Builder signedByIpAddress(String signedByIpAddress) {
            Utils.checkNotNull(signedByIpAddress, "signedByIpAddress");
            this.signedByIpAddress = Optional.ofNullable(signedByIpAddress);
            return this;
        }

        /**
         * The IP address of the signatory who signed the form. Both IPv4 AND IPv6 are supported. You must provide the IP address with either this parameter OR you can leave out this parameter and set the IP address in the request header using the `x-gusto-client-ip` header instead.
         */
        public Builder signedByIpAddress(Optional<String> signedByIpAddress) {
            Utils.checkNotNull(signedByIpAddress, "signedByIpAddress");
            this.signedByIpAddress = signedByIpAddress;
            return this;
        }
        
        public PutV1CompanyFormSignRequestBody build() {
            return new PutV1CompanyFormSignRequestBody(
                signatureText,
                agree,
                signedByIpAddress);
        }
    }
}

