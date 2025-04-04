/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PostCompaniesCompanyUuidReportsRequestBody {

    /**
     * Columns to include in the report
     */
    @JsonProperty("columns")
    private List<Columns> columns;

    /**
     * How to group the report
     */
    @JsonProperty("groupings")
    private List<Groupings> groupings;

    /**
     * The title of the report
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_name")
    private Optional<String> customName;

    /**
     * The type of file to generate
     */
    @JsonProperty("file_type")
    private FileType fileType;

    /**
     * Whether to include subtotals and grand totals in the report
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("with_totals")
    private Optional<Boolean> withTotals;

    /**
     * Start date of data to filter by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<LocalDate> startDate;

    /**
     * End date of data to filter by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<LocalDate> endDate;

    /**
     * Dismissed start date of employees to filter by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dismissed_start_date")
    private Optional<LocalDate> dismissedStartDate;

    /**
     * Dismissed end date of employees to filter by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dismissed_end_date")
    private Optional<LocalDate> dismissedEndDate;

    /**
     * Payment method to filter by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_method")
    private Optional<? extends PostCompaniesCompanyUuidReportsPaymentMethod> paymentMethod;

    /**
     * Employee employment type to filter by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employment_type")
    private Optional<? extends EmploymentType> employmentType;

    /**
     * Employee employment status to filter by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employment_status")
    private Optional<? extends PostCompaniesCompanyUuidReportsEmploymentStatus> employmentStatus;

    /**
     * Employees to filter by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_uuids")
    private Optional<? extends List<String>> employeeUuids;

    /**
     * Departments to filter by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("department_uuids")
    private Optional<? extends List<String>> departmentUuids;

    /**
     * Work addresses to filter by
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("work_address_uuids")
    private Optional<? extends List<String>> workAddressUuids;

    @JsonCreator
    public PostCompaniesCompanyUuidReportsRequestBody(
            @JsonProperty("columns") List<Columns> columns,
            @JsonProperty("groupings") List<Groupings> groupings,
            @JsonProperty("custom_name") Optional<String> customName,
            @JsonProperty("file_type") FileType fileType,
            @JsonProperty("with_totals") Optional<Boolean> withTotals,
            @JsonProperty("start_date") Optional<LocalDate> startDate,
            @JsonProperty("end_date") Optional<LocalDate> endDate,
            @JsonProperty("dismissed_start_date") Optional<LocalDate> dismissedStartDate,
            @JsonProperty("dismissed_end_date") Optional<LocalDate> dismissedEndDate,
            @JsonProperty("payment_method") Optional<? extends PostCompaniesCompanyUuidReportsPaymentMethod> paymentMethod,
            @JsonProperty("employment_type") Optional<? extends EmploymentType> employmentType,
            @JsonProperty("employment_status") Optional<? extends PostCompaniesCompanyUuidReportsEmploymentStatus> employmentStatus,
            @JsonProperty("employee_uuids") Optional<? extends List<String>> employeeUuids,
            @JsonProperty("department_uuids") Optional<? extends List<String>> departmentUuids,
            @JsonProperty("work_address_uuids") Optional<? extends List<String>> workAddressUuids) {
        Utils.checkNotNull(columns, "columns");
        Utils.checkNotNull(groupings, "groupings");
        Utils.checkNotNull(customName, "customName");
        Utils.checkNotNull(fileType, "fileType");
        Utils.checkNotNull(withTotals, "withTotals");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(dismissedStartDate, "dismissedStartDate");
        Utils.checkNotNull(dismissedEndDate, "dismissedEndDate");
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        Utils.checkNotNull(employmentType, "employmentType");
        Utils.checkNotNull(employmentStatus, "employmentStatus");
        Utils.checkNotNull(employeeUuids, "employeeUuids");
        Utils.checkNotNull(departmentUuids, "departmentUuids");
        Utils.checkNotNull(workAddressUuids, "workAddressUuids");
        this.columns = columns;
        this.groupings = groupings;
        this.customName = customName;
        this.fileType = fileType;
        this.withTotals = withTotals;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dismissedStartDate = dismissedStartDate;
        this.dismissedEndDate = dismissedEndDate;
        this.paymentMethod = paymentMethod;
        this.employmentType = employmentType;
        this.employmentStatus = employmentStatus;
        this.employeeUuids = employeeUuids;
        this.departmentUuids = departmentUuids;
        this.workAddressUuids = workAddressUuids;
    }
    
    public PostCompaniesCompanyUuidReportsRequestBody(
            List<Columns> columns,
            List<Groupings> groupings,
            FileType fileType) {
        this(columns, groupings, Optional.empty(), fileType, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Columns to include in the report
     */
    @JsonIgnore
    public List<Columns> columns() {
        return columns;
    }

    /**
     * How to group the report
     */
    @JsonIgnore
    public List<Groupings> groupings() {
        return groupings;
    }

    /**
     * The title of the report
     */
    @JsonIgnore
    public Optional<String> customName() {
        return customName;
    }

    /**
     * The type of file to generate
     */
    @JsonIgnore
    public FileType fileType() {
        return fileType;
    }

    /**
     * Whether to include subtotals and grand totals in the report
     */
    @JsonIgnore
    public Optional<Boolean> withTotals() {
        return withTotals;
    }

    /**
     * Start date of data to filter by
     */
    @JsonIgnore
    public Optional<LocalDate> startDate() {
        return startDate;
    }

    /**
     * End date of data to filter by
     */
    @JsonIgnore
    public Optional<LocalDate> endDate() {
        return endDate;
    }

    /**
     * Dismissed start date of employees to filter by
     */
    @JsonIgnore
    public Optional<LocalDate> dismissedStartDate() {
        return dismissedStartDate;
    }

    /**
     * Dismissed end date of employees to filter by
     */
    @JsonIgnore
    public Optional<LocalDate> dismissedEndDate() {
        return dismissedEndDate;
    }

    /**
     * Payment method to filter by
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostCompaniesCompanyUuidReportsPaymentMethod> paymentMethod() {
        return (Optional<PostCompaniesCompanyUuidReportsPaymentMethod>) paymentMethod;
    }

    /**
     * Employee employment type to filter by
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EmploymentType> employmentType() {
        return (Optional<EmploymentType>) employmentType;
    }

    /**
     * Employee employment status to filter by
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostCompaniesCompanyUuidReportsEmploymentStatus> employmentStatus() {
        return (Optional<PostCompaniesCompanyUuidReportsEmploymentStatus>) employmentStatus;
    }

    /**
     * Employees to filter by
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> employeeUuids() {
        return (Optional<List<String>>) employeeUuids;
    }

    /**
     * Departments to filter by
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> departmentUuids() {
        return (Optional<List<String>>) departmentUuids;
    }

    /**
     * Work addresses to filter by
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> workAddressUuids() {
        return (Optional<List<String>>) workAddressUuids;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Columns to include in the report
     */
    public PostCompaniesCompanyUuidReportsRequestBody withColumns(List<Columns> columns) {
        Utils.checkNotNull(columns, "columns");
        this.columns = columns;
        return this;
    }

    /**
     * How to group the report
     */
    public PostCompaniesCompanyUuidReportsRequestBody withGroupings(List<Groupings> groupings) {
        Utils.checkNotNull(groupings, "groupings");
        this.groupings = groupings;
        return this;
    }

    /**
     * The title of the report
     */
    public PostCompaniesCompanyUuidReportsRequestBody withCustomName(String customName) {
        Utils.checkNotNull(customName, "customName");
        this.customName = Optional.ofNullable(customName);
        return this;
    }

    /**
     * The title of the report
     */
    public PostCompaniesCompanyUuidReportsRequestBody withCustomName(Optional<String> customName) {
        Utils.checkNotNull(customName, "customName");
        this.customName = customName;
        return this;
    }

    /**
     * The type of file to generate
     */
    public PostCompaniesCompanyUuidReportsRequestBody withFileType(FileType fileType) {
        Utils.checkNotNull(fileType, "fileType");
        this.fileType = fileType;
        return this;
    }

    /**
     * Whether to include subtotals and grand totals in the report
     */
    public PostCompaniesCompanyUuidReportsRequestBody withWithTotals(boolean withTotals) {
        Utils.checkNotNull(withTotals, "withTotals");
        this.withTotals = Optional.ofNullable(withTotals);
        return this;
    }

    /**
     * Whether to include subtotals and grand totals in the report
     */
    public PostCompaniesCompanyUuidReportsRequestBody withWithTotals(Optional<Boolean> withTotals) {
        Utils.checkNotNull(withTotals, "withTotals");
        this.withTotals = withTotals;
        return this;
    }

    /**
     * Start date of data to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * Start date of data to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withStartDate(Optional<LocalDate> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * End date of data to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withEndDate(LocalDate endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * End date of data to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withEndDate(Optional<LocalDate> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Dismissed start date of employees to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withDismissedStartDate(LocalDate dismissedStartDate) {
        Utils.checkNotNull(dismissedStartDate, "dismissedStartDate");
        this.dismissedStartDate = Optional.ofNullable(dismissedStartDate);
        return this;
    }

    /**
     * Dismissed start date of employees to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withDismissedStartDate(Optional<LocalDate> dismissedStartDate) {
        Utils.checkNotNull(dismissedStartDate, "dismissedStartDate");
        this.dismissedStartDate = dismissedStartDate;
        return this;
    }

    /**
     * Dismissed end date of employees to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withDismissedEndDate(LocalDate dismissedEndDate) {
        Utils.checkNotNull(dismissedEndDate, "dismissedEndDate");
        this.dismissedEndDate = Optional.ofNullable(dismissedEndDate);
        return this;
    }

    /**
     * Dismissed end date of employees to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withDismissedEndDate(Optional<LocalDate> dismissedEndDate) {
        Utils.checkNotNull(dismissedEndDate, "dismissedEndDate");
        this.dismissedEndDate = dismissedEndDate;
        return this;
    }

    /**
     * Payment method to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withPaymentMethod(PostCompaniesCompanyUuidReportsPaymentMethod paymentMethod) {
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        this.paymentMethod = Optional.ofNullable(paymentMethod);
        return this;
    }

    /**
     * Payment method to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withPaymentMethod(Optional<? extends PostCompaniesCompanyUuidReportsPaymentMethod> paymentMethod) {
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Employee employment type to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withEmploymentType(EmploymentType employmentType) {
        Utils.checkNotNull(employmentType, "employmentType");
        this.employmentType = Optional.ofNullable(employmentType);
        return this;
    }

    /**
     * Employee employment type to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withEmploymentType(Optional<? extends EmploymentType> employmentType) {
        Utils.checkNotNull(employmentType, "employmentType");
        this.employmentType = employmentType;
        return this;
    }

    /**
     * Employee employment status to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withEmploymentStatus(PostCompaniesCompanyUuidReportsEmploymentStatus employmentStatus) {
        Utils.checkNotNull(employmentStatus, "employmentStatus");
        this.employmentStatus = Optional.ofNullable(employmentStatus);
        return this;
    }

    /**
     * Employee employment status to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withEmploymentStatus(Optional<? extends PostCompaniesCompanyUuidReportsEmploymentStatus> employmentStatus) {
        Utils.checkNotNull(employmentStatus, "employmentStatus");
        this.employmentStatus = employmentStatus;
        return this;
    }

    /**
     * Employees to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withEmployeeUuids(List<String> employeeUuids) {
        Utils.checkNotNull(employeeUuids, "employeeUuids");
        this.employeeUuids = Optional.ofNullable(employeeUuids);
        return this;
    }

    /**
     * Employees to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withEmployeeUuids(Optional<? extends List<String>> employeeUuids) {
        Utils.checkNotNull(employeeUuids, "employeeUuids");
        this.employeeUuids = employeeUuids;
        return this;
    }

    /**
     * Departments to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withDepartmentUuids(List<String> departmentUuids) {
        Utils.checkNotNull(departmentUuids, "departmentUuids");
        this.departmentUuids = Optional.ofNullable(departmentUuids);
        return this;
    }

    /**
     * Departments to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withDepartmentUuids(Optional<? extends List<String>> departmentUuids) {
        Utils.checkNotNull(departmentUuids, "departmentUuids");
        this.departmentUuids = departmentUuids;
        return this;
    }

    /**
     * Work addresses to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withWorkAddressUuids(List<String> workAddressUuids) {
        Utils.checkNotNull(workAddressUuids, "workAddressUuids");
        this.workAddressUuids = Optional.ofNullable(workAddressUuids);
        return this;
    }

    /**
     * Work addresses to filter by
     */
    public PostCompaniesCompanyUuidReportsRequestBody withWorkAddressUuids(Optional<? extends List<String>> workAddressUuids) {
        Utils.checkNotNull(workAddressUuids, "workAddressUuids");
        this.workAddressUuids = workAddressUuids;
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
        PostCompaniesCompanyUuidReportsRequestBody other = (PostCompaniesCompanyUuidReportsRequestBody) o;
        return 
            Objects.deepEquals(this.columns, other.columns) &&
            Objects.deepEquals(this.groupings, other.groupings) &&
            Objects.deepEquals(this.customName, other.customName) &&
            Objects.deepEquals(this.fileType, other.fileType) &&
            Objects.deepEquals(this.withTotals, other.withTotals) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.dismissedStartDate, other.dismissedStartDate) &&
            Objects.deepEquals(this.dismissedEndDate, other.dismissedEndDate) &&
            Objects.deepEquals(this.paymentMethod, other.paymentMethod) &&
            Objects.deepEquals(this.employmentType, other.employmentType) &&
            Objects.deepEquals(this.employmentStatus, other.employmentStatus) &&
            Objects.deepEquals(this.employeeUuids, other.employeeUuids) &&
            Objects.deepEquals(this.departmentUuids, other.departmentUuids) &&
            Objects.deepEquals(this.workAddressUuids, other.workAddressUuids);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            columns,
            groupings,
            customName,
            fileType,
            withTotals,
            startDate,
            endDate,
            dismissedStartDate,
            dismissedEndDate,
            paymentMethod,
            employmentType,
            employmentStatus,
            employeeUuids,
            departmentUuids,
            workAddressUuids);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostCompaniesCompanyUuidReportsRequestBody.class,
                "columns", columns,
                "groupings", groupings,
                "customName", customName,
                "fileType", fileType,
                "withTotals", withTotals,
                "startDate", startDate,
                "endDate", endDate,
                "dismissedStartDate", dismissedStartDate,
                "dismissedEndDate", dismissedEndDate,
                "paymentMethod", paymentMethod,
                "employmentType", employmentType,
                "employmentStatus", employmentStatus,
                "employeeUuids", employeeUuids,
                "departmentUuids", departmentUuids,
                "workAddressUuids", workAddressUuids);
    }
    
    public final static class Builder {
 
        private List<Columns> columns;
 
        private List<Groupings> groupings;
 
        private Optional<String> customName = Optional.empty();
 
        private FileType fileType;
 
        private Optional<Boolean> withTotals;
 
        private Optional<LocalDate> startDate = Optional.empty();
 
        private Optional<LocalDate> endDate = Optional.empty();
 
        private Optional<LocalDate> dismissedStartDate = Optional.empty();
 
        private Optional<LocalDate> dismissedEndDate = Optional.empty();
 
        private Optional<? extends PostCompaniesCompanyUuidReportsPaymentMethod> paymentMethod = Optional.empty();
 
        private Optional<? extends EmploymentType> employmentType = Optional.empty();
 
        private Optional<? extends PostCompaniesCompanyUuidReportsEmploymentStatus> employmentStatus = Optional.empty();
 
        private Optional<? extends List<String>> employeeUuids = Optional.empty();
 
        private Optional<? extends List<String>> departmentUuids = Optional.empty();
 
        private Optional<? extends List<String>> workAddressUuids = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Columns to include in the report
         */
        public Builder columns(List<Columns> columns) {
            Utils.checkNotNull(columns, "columns");
            this.columns = columns;
            return this;
        }

        /**
         * How to group the report
         */
        public Builder groupings(List<Groupings> groupings) {
            Utils.checkNotNull(groupings, "groupings");
            this.groupings = groupings;
            return this;
        }

        /**
         * The title of the report
         */
        public Builder customName(String customName) {
            Utils.checkNotNull(customName, "customName");
            this.customName = Optional.ofNullable(customName);
            return this;
        }

        /**
         * The title of the report
         */
        public Builder customName(Optional<String> customName) {
            Utils.checkNotNull(customName, "customName");
            this.customName = customName;
            return this;
        }

        /**
         * The type of file to generate
         */
        public Builder fileType(FileType fileType) {
            Utils.checkNotNull(fileType, "fileType");
            this.fileType = fileType;
            return this;
        }

        /**
         * Whether to include subtotals and grand totals in the report
         */
        public Builder withTotals(boolean withTotals) {
            Utils.checkNotNull(withTotals, "withTotals");
            this.withTotals = Optional.ofNullable(withTotals);
            return this;
        }

        /**
         * Whether to include subtotals and grand totals in the report
         */
        public Builder withTotals(Optional<Boolean> withTotals) {
            Utils.checkNotNull(withTotals, "withTotals");
            this.withTotals = withTotals;
            return this;
        }

        /**
         * Start date of data to filter by
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * Start date of data to filter by
         */
        public Builder startDate(Optional<LocalDate> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * End date of data to filter by
         */
        public Builder endDate(LocalDate endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * End date of data to filter by
         */
        public Builder endDate(Optional<LocalDate> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * Dismissed start date of employees to filter by
         */
        public Builder dismissedStartDate(LocalDate dismissedStartDate) {
            Utils.checkNotNull(dismissedStartDate, "dismissedStartDate");
            this.dismissedStartDate = Optional.ofNullable(dismissedStartDate);
            return this;
        }

        /**
         * Dismissed start date of employees to filter by
         */
        public Builder dismissedStartDate(Optional<LocalDate> dismissedStartDate) {
            Utils.checkNotNull(dismissedStartDate, "dismissedStartDate");
            this.dismissedStartDate = dismissedStartDate;
            return this;
        }

        /**
         * Dismissed end date of employees to filter by
         */
        public Builder dismissedEndDate(LocalDate dismissedEndDate) {
            Utils.checkNotNull(dismissedEndDate, "dismissedEndDate");
            this.dismissedEndDate = Optional.ofNullable(dismissedEndDate);
            return this;
        }

        /**
         * Dismissed end date of employees to filter by
         */
        public Builder dismissedEndDate(Optional<LocalDate> dismissedEndDate) {
            Utils.checkNotNull(dismissedEndDate, "dismissedEndDate");
            this.dismissedEndDate = dismissedEndDate;
            return this;
        }

        /**
         * Payment method to filter by
         */
        public Builder paymentMethod(PostCompaniesCompanyUuidReportsPaymentMethod paymentMethod) {
            Utils.checkNotNull(paymentMethod, "paymentMethod");
            this.paymentMethod = Optional.ofNullable(paymentMethod);
            return this;
        }

        /**
         * Payment method to filter by
         */
        public Builder paymentMethod(Optional<? extends PostCompaniesCompanyUuidReportsPaymentMethod> paymentMethod) {
            Utils.checkNotNull(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Employee employment type to filter by
         */
        public Builder employmentType(EmploymentType employmentType) {
            Utils.checkNotNull(employmentType, "employmentType");
            this.employmentType = Optional.ofNullable(employmentType);
            return this;
        }

        /**
         * Employee employment type to filter by
         */
        public Builder employmentType(Optional<? extends EmploymentType> employmentType) {
            Utils.checkNotNull(employmentType, "employmentType");
            this.employmentType = employmentType;
            return this;
        }

        /**
         * Employee employment status to filter by
         */
        public Builder employmentStatus(PostCompaniesCompanyUuidReportsEmploymentStatus employmentStatus) {
            Utils.checkNotNull(employmentStatus, "employmentStatus");
            this.employmentStatus = Optional.ofNullable(employmentStatus);
            return this;
        }

        /**
         * Employee employment status to filter by
         */
        public Builder employmentStatus(Optional<? extends PostCompaniesCompanyUuidReportsEmploymentStatus> employmentStatus) {
            Utils.checkNotNull(employmentStatus, "employmentStatus");
            this.employmentStatus = employmentStatus;
            return this;
        }

        /**
         * Employees to filter by
         */
        public Builder employeeUuids(List<String> employeeUuids) {
            Utils.checkNotNull(employeeUuids, "employeeUuids");
            this.employeeUuids = Optional.ofNullable(employeeUuids);
            return this;
        }

        /**
         * Employees to filter by
         */
        public Builder employeeUuids(Optional<? extends List<String>> employeeUuids) {
            Utils.checkNotNull(employeeUuids, "employeeUuids");
            this.employeeUuids = employeeUuids;
            return this;
        }

        /**
         * Departments to filter by
         */
        public Builder departmentUuids(List<String> departmentUuids) {
            Utils.checkNotNull(departmentUuids, "departmentUuids");
            this.departmentUuids = Optional.ofNullable(departmentUuids);
            return this;
        }

        /**
         * Departments to filter by
         */
        public Builder departmentUuids(Optional<? extends List<String>> departmentUuids) {
            Utils.checkNotNull(departmentUuids, "departmentUuids");
            this.departmentUuids = departmentUuids;
            return this;
        }

        /**
         * Work addresses to filter by
         */
        public Builder workAddressUuids(List<String> workAddressUuids) {
            Utils.checkNotNull(workAddressUuids, "workAddressUuids");
            this.workAddressUuids = Optional.ofNullable(workAddressUuids);
            return this;
        }

        /**
         * Work addresses to filter by
         */
        public Builder workAddressUuids(Optional<? extends List<String>> workAddressUuids) {
            Utils.checkNotNull(workAddressUuids, "workAddressUuids");
            this.workAddressUuids = workAddressUuids;
            return this;
        }
        
        public PostCompaniesCompanyUuidReportsRequestBody build() {
            if (withTotals == null) {
                withTotals = _SINGLETON_VALUE_WithTotals.value();
            }            return new PostCompaniesCompanyUuidReportsRequestBody(
                columns,
                groupings,
                customName,
                fileType,
                withTotals,
                startDate,
                endDate,
                dismissedStartDate,
                dismissedEndDate,
                paymentMethod,
                employmentType,
                employmentStatus,
                employeeUuids,
                departmentUuids,
                workAddressUuids);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_WithTotals =
                new LazySingletonValue<>(
                        "with_totals",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

