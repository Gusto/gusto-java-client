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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
/**
 * EmploymentHistoryList - Example response
 */

public class EmploymentHistoryList {

    /**
     * The employee's start day of work for an employment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hire_date")
    private Optional<String> hireDate;

    /**
     * The employee's last day of work for an employment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("termination_date")
    private Optional<String> terminationDate;

    /**
     * The boolean flag indicating whether Gusto will file a new hire report for the employee.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_new_hire_report")
    private Optional<Boolean> fileNewHireReport;

    /**
     * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("two_percent_shareholder")
    private Optional<Boolean> twoPercentShareholder;

    /**
     * The employee's employment status. Supplying an invalid option will set the employment_status to *not_set*.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employment_status")
    private Optional<? extends EmploymentHistoryListEmploymentStatus> employmentStatus;

    @JsonCreator
    public EmploymentHistoryList(
            @JsonProperty("hire_date") Optional<String> hireDate,
            @JsonProperty("termination_date") Optional<String> terminationDate,
            @JsonProperty("file_new_hire_report") Optional<Boolean> fileNewHireReport,
            @JsonProperty("two_percent_shareholder") Optional<Boolean> twoPercentShareholder,
            @JsonProperty("employment_status") Optional<? extends EmploymentHistoryListEmploymentStatus> employmentStatus) {
        Utils.checkNotNull(hireDate, "hireDate");
        Utils.checkNotNull(terminationDate, "terminationDate");
        Utils.checkNotNull(fileNewHireReport, "fileNewHireReport");
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        Utils.checkNotNull(employmentStatus, "employmentStatus");
        this.hireDate = hireDate;
        this.terminationDate = terminationDate;
        this.fileNewHireReport = fileNewHireReport;
        this.twoPercentShareholder = twoPercentShareholder;
        this.employmentStatus = employmentStatus;
    }
    
    public EmploymentHistoryList() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The employee's start day of work for an employment.
     */
    @JsonIgnore
    public Optional<String> hireDate() {
        return hireDate;
    }

    /**
     * The employee's last day of work for an employment.
     */
    @JsonIgnore
    public Optional<String> terminationDate() {
        return terminationDate;
    }

    /**
     * The boolean flag indicating whether Gusto will file a new hire report for the employee.
     */
    @JsonIgnore
    public Optional<Boolean> fileNewHireReport() {
        return fileNewHireReport;
    }

    /**
     * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
     */
    @JsonIgnore
    public Optional<Boolean> twoPercentShareholder() {
        return twoPercentShareholder;
    }

    /**
     * The employee's employment status. Supplying an invalid option will set the employment_status to *not_set*.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EmploymentHistoryListEmploymentStatus> employmentStatus() {
        return (Optional<EmploymentHistoryListEmploymentStatus>) employmentStatus;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The employee's start day of work for an employment.
     */
    public EmploymentHistoryList withHireDate(String hireDate) {
        Utils.checkNotNull(hireDate, "hireDate");
        this.hireDate = Optional.ofNullable(hireDate);
        return this;
    }

    /**
     * The employee's start day of work for an employment.
     */
    public EmploymentHistoryList withHireDate(Optional<String> hireDate) {
        Utils.checkNotNull(hireDate, "hireDate");
        this.hireDate = hireDate;
        return this;
    }

    /**
     * The employee's last day of work for an employment.
     */
    public EmploymentHistoryList withTerminationDate(String terminationDate) {
        Utils.checkNotNull(terminationDate, "terminationDate");
        this.terminationDate = Optional.ofNullable(terminationDate);
        return this;
    }

    /**
     * The employee's last day of work for an employment.
     */
    public EmploymentHistoryList withTerminationDate(Optional<String> terminationDate) {
        Utils.checkNotNull(terminationDate, "terminationDate");
        this.terminationDate = terminationDate;
        return this;
    }

    /**
     * The boolean flag indicating whether Gusto will file a new hire report for the employee.
     */
    public EmploymentHistoryList withFileNewHireReport(boolean fileNewHireReport) {
        Utils.checkNotNull(fileNewHireReport, "fileNewHireReport");
        this.fileNewHireReport = Optional.ofNullable(fileNewHireReport);
        return this;
    }

    /**
     * The boolean flag indicating whether Gusto will file a new hire report for the employee.
     */
    public EmploymentHistoryList withFileNewHireReport(Optional<Boolean> fileNewHireReport) {
        Utils.checkNotNull(fileNewHireReport, "fileNewHireReport");
        this.fileNewHireReport = fileNewHireReport;
        return this;
    }

    /**
     * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
     */
    public EmploymentHistoryList withTwoPercentShareholder(boolean twoPercentShareholder) {
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        this.twoPercentShareholder = Optional.ofNullable(twoPercentShareholder);
        return this;
    }

    /**
     * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
     */
    public EmploymentHistoryList withTwoPercentShareholder(Optional<Boolean> twoPercentShareholder) {
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        this.twoPercentShareholder = twoPercentShareholder;
        return this;
    }

    /**
     * The employee's employment status. Supplying an invalid option will set the employment_status to *not_set*.
     */
    public EmploymentHistoryList withEmploymentStatus(EmploymentHistoryListEmploymentStatus employmentStatus) {
        Utils.checkNotNull(employmentStatus, "employmentStatus");
        this.employmentStatus = Optional.ofNullable(employmentStatus);
        return this;
    }

    /**
     * The employee's employment status. Supplying an invalid option will set the employment_status to *not_set*.
     */
    public EmploymentHistoryList withEmploymentStatus(Optional<? extends EmploymentHistoryListEmploymentStatus> employmentStatus) {
        Utils.checkNotNull(employmentStatus, "employmentStatus");
        this.employmentStatus = employmentStatus;
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
        EmploymentHistoryList other = (EmploymentHistoryList) o;
        return 
            Objects.deepEquals(this.hireDate, other.hireDate) &&
            Objects.deepEquals(this.terminationDate, other.terminationDate) &&
            Objects.deepEquals(this.fileNewHireReport, other.fileNewHireReport) &&
            Objects.deepEquals(this.twoPercentShareholder, other.twoPercentShareholder) &&
            Objects.deepEquals(this.employmentStatus, other.employmentStatus);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hireDate,
            terminationDate,
            fileNewHireReport,
            twoPercentShareholder,
            employmentStatus);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmploymentHistoryList.class,
                "hireDate", hireDate,
                "terminationDate", terminationDate,
                "fileNewHireReport", fileNewHireReport,
                "twoPercentShareholder", twoPercentShareholder,
                "employmentStatus", employmentStatus);
    }
    
    public final static class Builder {
 
        private Optional<String> hireDate = Optional.empty();
 
        private Optional<String> terminationDate = Optional.empty();
 
        private Optional<Boolean> fileNewHireReport = Optional.empty();
 
        private Optional<Boolean> twoPercentShareholder = Optional.empty();
 
        private Optional<? extends EmploymentHistoryListEmploymentStatus> employmentStatus = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The employee's start day of work for an employment.
         */
        public Builder hireDate(String hireDate) {
            Utils.checkNotNull(hireDate, "hireDate");
            this.hireDate = Optional.ofNullable(hireDate);
            return this;
        }

        /**
         * The employee's start day of work for an employment.
         */
        public Builder hireDate(Optional<String> hireDate) {
            Utils.checkNotNull(hireDate, "hireDate");
            this.hireDate = hireDate;
            return this;
        }

        /**
         * The employee's last day of work for an employment.
         */
        public Builder terminationDate(String terminationDate) {
            Utils.checkNotNull(terminationDate, "terminationDate");
            this.terminationDate = Optional.ofNullable(terminationDate);
            return this;
        }

        /**
         * The employee's last day of work for an employment.
         */
        public Builder terminationDate(Optional<String> terminationDate) {
            Utils.checkNotNull(terminationDate, "terminationDate");
            this.terminationDate = terminationDate;
            return this;
        }

        /**
         * The boolean flag indicating whether Gusto will file a new hire report for the employee.
         */
        public Builder fileNewHireReport(boolean fileNewHireReport) {
            Utils.checkNotNull(fileNewHireReport, "fileNewHireReport");
            this.fileNewHireReport = Optional.ofNullable(fileNewHireReport);
            return this;
        }

        /**
         * The boolean flag indicating whether Gusto will file a new hire report for the employee.
         */
        public Builder fileNewHireReport(Optional<Boolean> fileNewHireReport) {
            Utils.checkNotNull(fileNewHireReport, "fileNewHireReport");
            this.fileNewHireReport = fileNewHireReport;
            return this;
        }

        /**
         * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
         */
        public Builder twoPercentShareholder(boolean twoPercentShareholder) {
            Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
            this.twoPercentShareholder = Optional.ofNullable(twoPercentShareholder);
            return this;
        }

        /**
         * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
         */
        public Builder twoPercentShareholder(Optional<Boolean> twoPercentShareholder) {
            Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
            this.twoPercentShareholder = twoPercentShareholder;
            return this;
        }

        /**
         * The employee's employment status. Supplying an invalid option will set the employment_status to *not_set*.
         */
        public Builder employmentStatus(EmploymentHistoryListEmploymentStatus employmentStatus) {
            Utils.checkNotNull(employmentStatus, "employmentStatus");
            this.employmentStatus = Optional.ofNullable(employmentStatus);
            return this;
        }

        /**
         * The employee's employment status. Supplying an invalid option will set the employment_status to *not_set*.
         */
        public Builder employmentStatus(Optional<? extends EmploymentHistoryListEmploymentStatus> employmentStatus) {
            Utils.checkNotNull(employmentStatus, "employmentStatus");
            this.employmentStatus = employmentStatus;
            return this;
        }
        
        public EmploymentHistoryList build() {
            return new EmploymentHistoryList(
                hireDate,
                terminationDate,
                fileNewHireReport,
                twoPercentShareholder,
                employmentStatus);
        }
    }
}

