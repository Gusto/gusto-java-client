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
 * CreateReport
 * 
 * <p>Example response
 */

public class CreateReport {

    /**
     * A unique identifier of the report request
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("request_uuid")
    private Optional<String> requestUuid;

    /**
     * Company UUID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_uuid")
    private Optional<String> companyUuid;

    /**
     * Title of the report
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_name")
    private Optional<String> customName;

    /**
     * File type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_type")
    private Optional<String> fileType;

    @JsonCreator
    public CreateReport(
            @JsonProperty("request_uuid") Optional<String> requestUuid,
            @JsonProperty("company_uuid") Optional<String> companyUuid,
            @JsonProperty("custom_name") Optional<String> customName,
            @JsonProperty("file_type") Optional<String> fileType) {
        Utils.checkNotNull(requestUuid, "requestUuid");
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(customName, "customName");
        Utils.checkNotNull(fileType, "fileType");
        this.requestUuid = requestUuid;
        this.companyUuid = companyUuid;
        this.customName = customName;
        this.fileType = fileType;
    }
    
    public CreateReport() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A unique identifier of the report request
     */
    @JsonIgnore
    public Optional<String> requestUuid() {
        return requestUuid;
    }

    /**
     * Company UUID
     */
    @JsonIgnore
    public Optional<String> companyUuid() {
        return companyUuid;
    }

    /**
     * Title of the report
     */
    @JsonIgnore
    public Optional<String> customName() {
        return customName;
    }

    /**
     * File type
     */
    @JsonIgnore
    public Optional<String> fileType() {
        return fileType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier of the report request
     */
    public CreateReport withRequestUuid(String requestUuid) {
        Utils.checkNotNull(requestUuid, "requestUuid");
        this.requestUuid = Optional.ofNullable(requestUuid);
        return this;
    }

    /**
     * A unique identifier of the report request
     */
    public CreateReport withRequestUuid(Optional<String> requestUuid) {
        Utils.checkNotNull(requestUuid, "requestUuid");
        this.requestUuid = requestUuid;
        return this;
    }

    /**
     * Company UUID
     */
    public CreateReport withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = Optional.ofNullable(companyUuid);
        return this;
    }

    /**
     * Company UUID
     */
    public CreateReport withCompanyUuid(Optional<String> companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * Title of the report
     */
    public CreateReport withCustomName(String customName) {
        Utils.checkNotNull(customName, "customName");
        this.customName = Optional.ofNullable(customName);
        return this;
    }

    /**
     * Title of the report
     */
    public CreateReport withCustomName(Optional<String> customName) {
        Utils.checkNotNull(customName, "customName");
        this.customName = customName;
        return this;
    }

    /**
     * File type
     */
    public CreateReport withFileType(String fileType) {
        Utils.checkNotNull(fileType, "fileType");
        this.fileType = Optional.ofNullable(fileType);
        return this;
    }

    /**
     * File type
     */
    public CreateReport withFileType(Optional<String> fileType) {
        Utils.checkNotNull(fileType, "fileType");
        this.fileType = fileType;
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
        CreateReport other = (CreateReport) o;
        return 
            Objects.deepEquals(this.requestUuid, other.requestUuid) &&
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.customName, other.customName) &&
            Objects.deepEquals(this.fileType, other.fileType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestUuid,
            companyUuid,
            customName,
            fileType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateReport.class,
                "requestUuid", requestUuid,
                "companyUuid", companyUuid,
                "customName", customName,
                "fileType", fileType);
    }
    
    public final static class Builder {
 
        private Optional<String> requestUuid = Optional.empty();
 
        private Optional<String> companyUuid = Optional.empty();
 
        private Optional<String> customName = Optional.empty();
 
        private Optional<String> fileType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier of the report request
         */
        public Builder requestUuid(String requestUuid) {
            Utils.checkNotNull(requestUuid, "requestUuid");
            this.requestUuid = Optional.ofNullable(requestUuid);
            return this;
        }

        /**
         * A unique identifier of the report request
         */
        public Builder requestUuid(Optional<String> requestUuid) {
            Utils.checkNotNull(requestUuid, "requestUuid");
            this.requestUuid = requestUuid;
            return this;
        }

        /**
         * Company UUID
         */
        public Builder companyUuid(String companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = Optional.ofNullable(companyUuid);
            return this;
        }

        /**
         * Company UUID
         */
        public Builder companyUuid(Optional<String> companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = companyUuid;
            return this;
        }

        /**
         * Title of the report
         */
        public Builder customName(String customName) {
            Utils.checkNotNull(customName, "customName");
            this.customName = Optional.ofNullable(customName);
            return this;
        }

        /**
         * Title of the report
         */
        public Builder customName(Optional<String> customName) {
            Utils.checkNotNull(customName, "customName");
            this.customName = customName;
            return this;
        }

        /**
         * File type
         */
        public Builder fileType(String fileType) {
            Utils.checkNotNull(fileType, "fileType");
            this.fileType = Optional.ofNullable(fileType);
            return this;
        }

        /**
         * File type
         */
        public Builder fileType(Optional<String> fileType) {
            Utils.checkNotNull(fileType, "fileType");
            this.fileType = fileType;
            return this;
        }
        
        public CreateReport build() {
            return new CreateReport(
                requestUuid,
                companyUuid,
                customName,
                fileType);
        }
    }
}

