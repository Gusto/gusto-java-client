/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.EmployeeBenefit;
import com.gusto.embedded_api.utils.Response;
import com.gusto.embedded_api.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetV1EmployeesEmployeeIdEmployeeBenefitsResponse implements Response {

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
     * Example response
     */
    private Optional<? extends List<EmployeeBenefit>> employeeBenefitList;

    @JsonCreator
    public GetV1EmployeesEmployeeIdEmployeeBenefitsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<EmployeeBenefit>> employeeBenefitList) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(employeeBenefitList, "employeeBenefitList");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.employeeBenefitList = employeeBenefitList;
    }
    
    public GetV1EmployeesEmployeeIdEmployeeBenefitsResponse(
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
     * Example response
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<EmployeeBenefit>> employeeBenefitList() {
        return (Optional<List<EmployeeBenefit>>) employeeBenefitList;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetV1EmployeesEmployeeIdEmployeeBenefitsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetV1EmployeesEmployeeIdEmployeeBenefitsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetV1EmployeesEmployeeIdEmployeeBenefitsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public GetV1EmployeesEmployeeIdEmployeeBenefitsResponse withEmployeeBenefitList(List<EmployeeBenefit> employeeBenefitList) {
        Utils.checkNotNull(employeeBenefitList, "employeeBenefitList");
        this.employeeBenefitList = Optional.ofNullable(employeeBenefitList);
        return this;
    }

    /**
     * Example response
     */
    public GetV1EmployeesEmployeeIdEmployeeBenefitsResponse withEmployeeBenefitList(Optional<? extends List<EmployeeBenefit>> employeeBenefitList) {
        Utils.checkNotNull(employeeBenefitList, "employeeBenefitList");
        this.employeeBenefitList = employeeBenefitList;
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
        GetV1EmployeesEmployeeIdEmployeeBenefitsResponse other = (GetV1EmployeesEmployeeIdEmployeeBenefitsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.employeeBenefitList, other.employeeBenefitList);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            employeeBenefitList);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1EmployeesEmployeeIdEmployeeBenefitsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "employeeBenefitList", employeeBenefitList);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends List<EmployeeBenefit>> employeeBenefitList = Optional.empty();  
        
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
         * Example response
         */
        public Builder employeeBenefitList(List<EmployeeBenefit> employeeBenefitList) {
            Utils.checkNotNull(employeeBenefitList, "employeeBenefitList");
            this.employeeBenefitList = Optional.ofNullable(employeeBenefitList);
            return this;
        }

        /**
         * Example response
         */
        public Builder employeeBenefitList(Optional<? extends List<EmployeeBenefit>> employeeBenefitList) {
            Utils.checkNotNull(employeeBenefitList, "employeeBenefitList");
            this.employeeBenefitList = employeeBenefitList;
            return this;
        }
        
        public GetV1EmployeesEmployeeIdEmployeeBenefitsResponse build() {
            return new GetV1EmployeesEmployeeIdEmployeeBenefitsResponse(
                contentType,
                statusCode,
                rawResponse,
                employeeBenefitList);
        }
    }
}

