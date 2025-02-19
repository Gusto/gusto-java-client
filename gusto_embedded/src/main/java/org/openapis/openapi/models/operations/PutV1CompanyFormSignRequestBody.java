/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapis.openapi.utils.Utils;


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
     * The IP address of the signatory who signed the form. Both IPv4 AND IPv6 are supported.
     */
    @JsonProperty("signed_by_ip_address")
    private String signedByIpAddress;

    @JsonCreator
    public PutV1CompanyFormSignRequestBody(
            @JsonProperty("signature_text") String signatureText,
            @JsonProperty("agree") boolean agree,
            @JsonProperty("signed_by_ip_address") String signedByIpAddress) {
        Utils.checkNotNull(signatureText, "signatureText");
        Utils.checkNotNull(agree, "agree");
        Utils.checkNotNull(signedByIpAddress, "signedByIpAddress");
        this.signatureText = signatureText;
        this.agree = agree;
        this.signedByIpAddress = signedByIpAddress;
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
     * The IP address of the signatory who signed the form. Both IPv4 AND IPv6 are supported.
     */
    @JsonIgnore
    public String signedByIpAddress() {
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
     * The IP address of the signatory who signed the form. Both IPv4 AND IPv6 are supported.
     */
    public PutV1CompanyFormSignRequestBody withSignedByIpAddress(String signedByIpAddress) {
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
 
        private String signedByIpAddress;  
        
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
         * The IP address of the signatory who signed the form. Both IPv4 AND IPv6 are supported.
         */
        public Builder signedByIpAddress(String signedByIpAddress) {
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

