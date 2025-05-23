/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class PutV1PartnerManagedCompaniesCompanyUuidMigrateRequestBody {

    /**
     * Email of the company signatory who is authorized to accept our [Terms of Service](https://flows.gusto.com/terms) and migration decision. You can retrieve the signatory email from the `GET /v/1/companies/{company_id}/signatories` endpoint.
     */
    @JsonProperty("email")
    private String email;

    /**
     * The IP address of the signatory who viewed and accepted the Terms of Service.
     */
    @JsonProperty("ip_address")
    private String ipAddress;

    /**
     * The signatory's user ID on your platform.
     */
    @JsonProperty("external_user_id")
    private String externalUserId;

    @JsonCreator
    public PutV1PartnerManagedCompaniesCompanyUuidMigrateRequestBody(
            @JsonProperty("email") String email,
            @JsonProperty("ip_address") String ipAddress,
            @JsonProperty("external_user_id") String externalUserId) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(ipAddress, "ipAddress");
        Utils.checkNotNull(externalUserId, "externalUserId");
        this.email = email;
        this.ipAddress = ipAddress;
        this.externalUserId = externalUserId;
    }

    /**
     * Email of the company signatory who is authorized to accept our [Terms of Service](https://flows.gusto.com/terms) and migration decision. You can retrieve the signatory email from the `GET /v/1/companies/{company_id}/signatories` endpoint.
     */
    @JsonIgnore
    public String email() {
        return email;
    }

    /**
     * The IP address of the signatory who viewed and accepted the Terms of Service.
     */
    @JsonIgnore
    public String ipAddress() {
        return ipAddress;
    }

    /**
     * The signatory's user ID on your platform.
     */
    @JsonIgnore
    public String externalUserId() {
        return externalUserId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Email of the company signatory who is authorized to accept our [Terms of Service](https://flows.gusto.com/terms) and migration decision. You can retrieve the signatory email from the `GET /v/1/companies/{company_id}/signatories` endpoint.
     */
    public PutV1PartnerManagedCompaniesCompanyUuidMigrateRequestBody withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * The IP address of the signatory who viewed and accepted the Terms of Service.
     */
    public PutV1PartnerManagedCompaniesCompanyUuidMigrateRequestBody withIpAddress(String ipAddress) {
        Utils.checkNotNull(ipAddress, "ipAddress");
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * The signatory's user ID on your platform.
     */
    public PutV1PartnerManagedCompaniesCompanyUuidMigrateRequestBody withExternalUserId(String externalUserId) {
        Utils.checkNotNull(externalUserId, "externalUserId");
        this.externalUserId = externalUserId;
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
        PutV1PartnerManagedCompaniesCompanyUuidMigrateRequestBody other = (PutV1PartnerManagedCompaniesCompanyUuidMigrateRequestBody) o;
        return 
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.ipAddress, other.ipAddress) &&
            Objects.deepEquals(this.externalUserId, other.externalUserId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email,
            ipAddress,
            externalUserId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1PartnerManagedCompaniesCompanyUuidMigrateRequestBody.class,
                "email", email,
                "ipAddress", ipAddress,
                "externalUserId", externalUserId);
    }
    
    public final static class Builder {
 
        private String email;
 
        private String ipAddress;
 
        private String externalUserId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Email of the company signatory who is authorized to accept our [Terms of Service](https://flows.gusto.com/terms) and migration decision. You can retrieve the signatory email from the `GET /v/1/companies/{company_id}/signatories` endpoint.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * The IP address of the signatory who viewed and accepted the Terms of Service.
         */
        public Builder ipAddress(String ipAddress) {
            Utils.checkNotNull(ipAddress, "ipAddress");
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * The signatory's user ID on your platform.
         */
        public Builder externalUserId(String externalUserId) {
            Utils.checkNotNull(externalUserId, "externalUserId");
            this.externalUserId = externalUserId;
            return this;
        }
        
        public PutV1PartnerManagedCompaniesCompanyUuidMigrateRequestBody build() {
            return new PutV1PartnerManagedCompaniesCompanyUuidMigrateRequestBody(
                email,
                ipAddress,
                externalUserId);
        }
    }
}

