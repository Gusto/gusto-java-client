/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.components.TimeOffPolicy;
import org.openapis.openapi.utils.Response;
import org.openapis.openapi.utils.Utils;


public class PostCompaniesCompanyUuidTimeOffPoliciesResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Created
     */
    private Optional<? extends TimeOffPolicy> timeOffPolicy;

    @JsonCreator
    public PostCompaniesCompanyUuidTimeOffPoliciesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends TimeOffPolicy> timeOffPolicy) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(timeOffPolicy, "timeOffPolicy");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.timeOffPolicy = timeOffPolicy;
    }
    
    public PostCompaniesCompanyUuidTimeOffPoliciesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Created
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TimeOffPolicy> timeOffPolicy() {
        return (Optional<TimeOffPolicy>) timeOffPolicy;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public PostCompaniesCompanyUuidTimeOffPoliciesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PostCompaniesCompanyUuidTimeOffPoliciesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PostCompaniesCompanyUuidTimeOffPoliciesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Created
     */
    public PostCompaniesCompanyUuidTimeOffPoliciesResponse withTimeOffPolicy(TimeOffPolicy timeOffPolicy) {
        Utils.checkNotNull(timeOffPolicy, "timeOffPolicy");
        this.timeOffPolicy = Optional.ofNullable(timeOffPolicy);
        return this;
    }

    /**
     * Created
     */
    public PostCompaniesCompanyUuidTimeOffPoliciesResponse withTimeOffPolicy(Optional<? extends TimeOffPolicy> timeOffPolicy) {
        Utils.checkNotNull(timeOffPolicy, "timeOffPolicy");
        this.timeOffPolicy = timeOffPolicy;
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
        PostCompaniesCompanyUuidTimeOffPoliciesResponse other = (PostCompaniesCompanyUuidTimeOffPoliciesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.timeOffPolicy, other.timeOffPolicy);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            timeOffPolicy);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostCompaniesCompanyUuidTimeOffPoliciesResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "timeOffPolicy", timeOffPolicy);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends TimeOffPolicy> timeOffPolicy = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Created
         */
        public Builder timeOffPolicy(TimeOffPolicy timeOffPolicy) {
            Utils.checkNotNull(timeOffPolicy, "timeOffPolicy");
            this.timeOffPolicy = Optional.ofNullable(timeOffPolicy);
            return this;
        }

        /**
         * Created
         */
        public Builder timeOffPolicy(Optional<? extends TimeOffPolicy> timeOffPolicy) {
            Utils.checkNotNull(timeOffPolicy, "timeOffPolicy");
            this.timeOffPolicy = timeOffPolicy;
            return this;
        }
        
        public PostCompaniesCompanyUuidTimeOffPoliciesResponse build() {
            return new PostCompaniesCompanyUuidTimeOffPoliciesResponse(
                contentType,
                statusCode,
                rawResponse,
                timeOffPolicy);
        }
    }
}

