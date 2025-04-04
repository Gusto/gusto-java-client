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
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * PutV1JobsJobIdRequestBody
 * 
 * <p>Update a job.
 */

public class PutV1JobsJobIdRequestBody {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

    /**
     * The job title
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    /**
     * The date when the employee was hired or rehired for the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hire_date")
    private Optional<String> hireDate;

    /**
     * Whether the employee owns at least 2% of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("two_percent_shareholder")
    private Optional<Boolean> twoPercentShareholder;

    /**
     * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state_wc_covered")
    private JsonNullable<Boolean> stateWcCovered;

    /**
     * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state_wc_class_code")
    private JsonNullable<String> stateWcClassCode;

    @JsonCreator
    public PutV1JobsJobIdRequestBody(
            @JsonProperty("version") String version,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("hire_date") Optional<String> hireDate,
            @JsonProperty("two_percent_shareholder") Optional<Boolean> twoPercentShareholder,
            @JsonProperty("state_wc_covered") JsonNullable<Boolean> stateWcCovered,
            @JsonProperty("state_wc_class_code") JsonNullable<String> stateWcClassCode) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(hireDate, "hireDate");
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        Utils.checkNotNull(stateWcCovered, "stateWcCovered");
        Utils.checkNotNull(stateWcClassCode, "stateWcClassCode");
        this.version = version;
        this.title = title;
        this.hireDate = hireDate;
        this.twoPercentShareholder = twoPercentShareholder;
        this.stateWcCovered = stateWcCovered;
        this.stateWcClassCode = stateWcClassCode;
    }
    
    public PutV1JobsJobIdRequestBody(
            String version) {
        this(version, Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
    }

    /**
     * The job title
     */
    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    /**
     * The date when the employee was hired or rehired for the job.
     */
    @JsonIgnore
    public Optional<String> hireDate() {
        return hireDate;
    }

    /**
     * Whether the employee owns at least 2% of the company.
     */
    @JsonIgnore
    public Optional<Boolean> twoPercentShareholder() {
        return twoPercentShareholder;
    }

    /**
     * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
     */
    @JsonIgnore
    public JsonNullable<Boolean> stateWcCovered() {
        return stateWcCovered;
    }

    /**
     * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
     */
    @JsonIgnore
    public JsonNullable<String> stateWcClassCode() {
        return stateWcClassCode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    public PutV1JobsJobIdRequestBody withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * The job title
     */
    public PutV1JobsJobIdRequestBody withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * The job title
     */
    public PutV1JobsJobIdRequestBody withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * The date when the employee was hired or rehired for the job.
     */
    public PutV1JobsJobIdRequestBody withHireDate(String hireDate) {
        Utils.checkNotNull(hireDate, "hireDate");
        this.hireDate = Optional.ofNullable(hireDate);
        return this;
    }

    /**
     * The date when the employee was hired or rehired for the job.
     */
    public PutV1JobsJobIdRequestBody withHireDate(Optional<String> hireDate) {
        Utils.checkNotNull(hireDate, "hireDate");
        this.hireDate = hireDate;
        return this;
    }

    /**
     * Whether the employee owns at least 2% of the company.
     */
    public PutV1JobsJobIdRequestBody withTwoPercentShareholder(boolean twoPercentShareholder) {
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        this.twoPercentShareholder = Optional.ofNullable(twoPercentShareholder);
        return this;
    }

    /**
     * Whether the employee owns at least 2% of the company.
     */
    public PutV1JobsJobIdRequestBody withTwoPercentShareholder(Optional<Boolean> twoPercentShareholder) {
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        this.twoPercentShareholder = twoPercentShareholder;
        return this;
    }

    /**
     * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
     */
    public PutV1JobsJobIdRequestBody withStateWcCovered(boolean stateWcCovered) {
        Utils.checkNotNull(stateWcCovered, "stateWcCovered");
        this.stateWcCovered = JsonNullable.of(stateWcCovered);
        return this;
    }

    /**
     * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
     */
    public PutV1JobsJobIdRequestBody withStateWcCovered(JsonNullable<Boolean> stateWcCovered) {
        Utils.checkNotNull(stateWcCovered, "stateWcCovered");
        this.stateWcCovered = stateWcCovered;
        return this;
    }

    /**
     * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
     */
    public PutV1JobsJobIdRequestBody withStateWcClassCode(String stateWcClassCode) {
        Utils.checkNotNull(stateWcClassCode, "stateWcClassCode");
        this.stateWcClassCode = JsonNullable.of(stateWcClassCode);
        return this;
    }

    /**
     * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
     */
    public PutV1JobsJobIdRequestBody withStateWcClassCode(JsonNullable<String> stateWcClassCode) {
        Utils.checkNotNull(stateWcClassCode, "stateWcClassCode");
        this.stateWcClassCode = stateWcClassCode;
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
        PutV1JobsJobIdRequestBody other = (PutV1JobsJobIdRequestBody) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.hireDate, other.hireDate) &&
            Objects.deepEquals(this.twoPercentShareholder, other.twoPercentShareholder) &&
            Objects.deepEquals(this.stateWcCovered, other.stateWcCovered) &&
            Objects.deepEquals(this.stateWcClassCode, other.stateWcClassCode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            version,
            title,
            hireDate,
            twoPercentShareholder,
            stateWcCovered,
            stateWcClassCode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1JobsJobIdRequestBody.class,
                "version", version,
                "title", title,
                "hireDate", hireDate,
                "twoPercentShareholder", twoPercentShareholder,
                "stateWcCovered", stateWcCovered,
                "stateWcClassCode", stateWcClassCode);
    }
    
    public final static class Builder {
 
        private String version;
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> hireDate = Optional.empty();
 
        private Optional<Boolean> twoPercentShareholder = Optional.empty();
 
        private JsonNullable<Boolean> stateWcCovered = JsonNullable.undefined();
 
        private JsonNullable<String> stateWcClassCode = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        /**
         * The job title
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        /**
         * The job title
         */
        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * The date when the employee was hired or rehired for the job.
         */
        public Builder hireDate(String hireDate) {
            Utils.checkNotNull(hireDate, "hireDate");
            this.hireDate = Optional.ofNullable(hireDate);
            return this;
        }

        /**
         * The date when the employee was hired or rehired for the job.
         */
        public Builder hireDate(Optional<String> hireDate) {
            Utils.checkNotNull(hireDate, "hireDate");
            this.hireDate = hireDate;
            return this;
        }

        /**
         * Whether the employee owns at least 2% of the company.
         */
        public Builder twoPercentShareholder(boolean twoPercentShareholder) {
            Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
            this.twoPercentShareholder = Optional.ofNullable(twoPercentShareholder);
            return this;
        }

        /**
         * Whether the employee owns at least 2% of the company.
         */
        public Builder twoPercentShareholder(Optional<Boolean> twoPercentShareholder) {
            Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
            this.twoPercentShareholder = twoPercentShareholder;
            return this;
        }

        /**
         * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
         */
        public Builder stateWcCovered(boolean stateWcCovered) {
            Utils.checkNotNull(stateWcCovered, "stateWcCovered");
            this.stateWcCovered = JsonNullable.of(stateWcCovered);
            return this;
        }

        /**
         * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
         */
        public Builder stateWcCovered(JsonNullable<Boolean> stateWcCovered) {
            Utils.checkNotNull(stateWcCovered, "stateWcCovered");
            this.stateWcCovered = stateWcCovered;
            return this;
        }

        /**
         * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
         */
        public Builder stateWcClassCode(String stateWcClassCode) {
            Utils.checkNotNull(stateWcClassCode, "stateWcClassCode");
            this.stateWcClassCode = JsonNullable.of(stateWcClassCode);
            return this;
        }

        /**
         * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
         */
        public Builder stateWcClassCode(JsonNullable<String> stateWcClassCode) {
            Utils.checkNotNull(stateWcClassCode, "stateWcClassCode");
            this.stateWcClassCode = stateWcClassCode;
            return this;
        }
        
        public PutV1JobsJobIdRequestBody build() {
            return new PutV1JobsJobIdRequestBody(
                version,
                title,
                hireDate,
                twoPercentShareholder,
                stateWcCovered,
                stateWcClassCode);
        }
    }
}

