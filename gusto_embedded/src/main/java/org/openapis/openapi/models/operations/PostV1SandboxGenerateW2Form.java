/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PostV1SandboxGenerateW2Form - OK
 */

public class PostV1SandboxGenerateW2Form {

    /**
     * The UUID of the employee
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_uuid")
    private Optional<String> employeeUuid;

    /**
     * The UUID of the form
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * The type identifier of the form
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * The title of the form
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    /**
     * The description of the form
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    /**
     * If the form is in a draft state. E.g. End of year tax forms may be provided in a draft state prior to being finalized.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("draft")
    private Optional<Boolean> draft;

    /**
     * The year of this form. For some forms, e.g. tax forms, this is the year which the form represents. A W2 for January - December 2022 would be delivered in January 2023 and have a year value of 2022. This value is nullable and will not be present on all forms.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("year")
    private JsonNullable<Long> year;

    /**
     * The quarter of this form. For some forms, e.g. tax forms, this is the calendar quarter which this form represents. An Employer's Quarterly Federal Tax Return (Form 941) for April, May, June 2022 would have a quarter value of 2 (and a year value of 2022). This value is nullable and will not be present on all forms.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quarter")
    private JsonNullable<Long> quarter;

    /**
     * A boolean flag that indicates whether the form needs signing or not. Note that this value will change after the form is signed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requires_signing")
    private Optional<Boolean> requiresSigning;

    @JsonCreator
    public PostV1SandboxGenerateW2Form(
            @JsonProperty("employee_uuid") Optional<String> employeeUuid,
            @JsonProperty("uuid") String uuid,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("draft") Optional<Boolean> draft,
            @JsonProperty("year") JsonNullable<Long> year,
            @JsonProperty("quarter") JsonNullable<Long> quarter,
            @JsonProperty("requires_signing") Optional<Boolean> requiresSigning) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(draft, "draft");
        Utils.checkNotNull(year, "year");
        Utils.checkNotNull(quarter, "quarter");
        Utils.checkNotNull(requiresSigning, "requiresSigning");
        this.employeeUuid = employeeUuid;
        this.uuid = uuid;
        this.name = name;
        this.title = title;
        this.description = description;
        this.draft = draft;
        this.year = year;
        this.quarter = quarter;
        this.requiresSigning = requiresSigning;
    }
    
    public PostV1SandboxGenerateW2Form(
            String uuid) {
        this(Optional.empty(), uuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The UUID of the employee
     */
    @JsonIgnore
    public Optional<String> employeeUuid() {
        return employeeUuid;
    }

    /**
     * The UUID of the form
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * The type identifier of the form
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * The title of the form
     */
    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    /**
     * The description of the form
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    /**
     * If the form is in a draft state. E.g. End of year tax forms may be provided in a draft state prior to being finalized.
     */
    @JsonIgnore
    public Optional<Boolean> draft() {
        return draft;
    }

    /**
     * The year of this form. For some forms, e.g. tax forms, this is the year which the form represents. A W2 for January - December 2022 would be delivered in January 2023 and have a year value of 2022. This value is nullable and will not be present on all forms.
     */
    @JsonIgnore
    public JsonNullable<Long> year() {
        return year;
    }

    /**
     * The quarter of this form. For some forms, e.g. tax forms, this is the calendar quarter which this form represents. An Employer's Quarterly Federal Tax Return (Form 941) for April, May, June 2022 would have a quarter value of 2 (and a year value of 2022). This value is nullable and will not be present on all forms.
     */
    @JsonIgnore
    public JsonNullable<Long> quarter() {
        return quarter;
    }

    /**
     * A boolean flag that indicates whether the form needs signing or not. Note that this value will change after the form is signed.
     */
    @JsonIgnore
    public Optional<Boolean> requiresSigning() {
        return requiresSigning;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the employee
     */
    public PostV1SandboxGenerateW2Form withEmployeeUuid(String employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = Optional.ofNullable(employeeUuid);
        return this;
    }

    /**
     * The UUID of the employee
     */
    public PostV1SandboxGenerateW2Form withEmployeeUuid(Optional<String> employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = employeeUuid;
        return this;
    }

    /**
     * The UUID of the form
     */
    public PostV1SandboxGenerateW2Form withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The type identifier of the form
     */
    public PostV1SandboxGenerateW2Form withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The type identifier of the form
     */
    public PostV1SandboxGenerateW2Form withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The title of the form
     */
    public PostV1SandboxGenerateW2Form withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * The title of the form
     */
    public PostV1SandboxGenerateW2Form withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * The description of the form
     */
    public PostV1SandboxGenerateW2Form withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * The description of the form
     */
    public PostV1SandboxGenerateW2Form withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * If the form is in a draft state. E.g. End of year tax forms may be provided in a draft state prior to being finalized.
     */
    public PostV1SandboxGenerateW2Form withDraft(boolean draft) {
        Utils.checkNotNull(draft, "draft");
        this.draft = Optional.ofNullable(draft);
        return this;
    }

    /**
     * If the form is in a draft state. E.g. End of year tax forms may be provided in a draft state prior to being finalized.
     */
    public PostV1SandboxGenerateW2Form withDraft(Optional<Boolean> draft) {
        Utils.checkNotNull(draft, "draft");
        this.draft = draft;
        return this;
    }

    /**
     * The year of this form. For some forms, e.g. tax forms, this is the year which the form represents. A W2 for January - December 2022 would be delivered in January 2023 and have a year value of 2022. This value is nullable and will not be present on all forms.
     */
    public PostV1SandboxGenerateW2Form withYear(long year) {
        Utils.checkNotNull(year, "year");
        this.year = JsonNullable.of(year);
        return this;
    }

    /**
     * The year of this form. For some forms, e.g. tax forms, this is the year which the form represents. A W2 for January - December 2022 would be delivered in January 2023 and have a year value of 2022. This value is nullable and will not be present on all forms.
     */
    public PostV1SandboxGenerateW2Form withYear(JsonNullable<Long> year) {
        Utils.checkNotNull(year, "year");
        this.year = year;
        return this;
    }

    /**
     * The quarter of this form. For some forms, e.g. tax forms, this is the calendar quarter which this form represents. An Employer's Quarterly Federal Tax Return (Form 941) for April, May, June 2022 would have a quarter value of 2 (and a year value of 2022). This value is nullable and will not be present on all forms.
     */
    public PostV1SandboxGenerateW2Form withQuarter(long quarter) {
        Utils.checkNotNull(quarter, "quarter");
        this.quarter = JsonNullable.of(quarter);
        return this;
    }

    /**
     * The quarter of this form. For some forms, e.g. tax forms, this is the calendar quarter which this form represents. An Employer's Quarterly Federal Tax Return (Form 941) for April, May, June 2022 would have a quarter value of 2 (and a year value of 2022). This value is nullable and will not be present on all forms.
     */
    public PostV1SandboxGenerateW2Form withQuarter(JsonNullable<Long> quarter) {
        Utils.checkNotNull(quarter, "quarter");
        this.quarter = quarter;
        return this;
    }

    /**
     * A boolean flag that indicates whether the form needs signing or not. Note that this value will change after the form is signed.
     */
    public PostV1SandboxGenerateW2Form withRequiresSigning(boolean requiresSigning) {
        Utils.checkNotNull(requiresSigning, "requiresSigning");
        this.requiresSigning = Optional.ofNullable(requiresSigning);
        return this;
    }

    /**
     * A boolean flag that indicates whether the form needs signing or not. Note that this value will change after the form is signed.
     */
    public PostV1SandboxGenerateW2Form withRequiresSigning(Optional<Boolean> requiresSigning) {
        Utils.checkNotNull(requiresSigning, "requiresSigning");
        this.requiresSigning = requiresSigning;
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
        PostV1SandboxGenerateW2Form other = (PostV1SandboxGenerateW2Form) o;
        return 
            Objects.deepEquals(this.employeeUuid, other.employeeUuid) &&
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.draft, other.draft) &&
            Objects.deepEquals(this.year, other.year) &&
            Objects.deepEquals(this.quarter, other.quarter) &&
            Objects.deepEquals(this.requiresSigning, other.requiresSigning);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employeeUuid,
            uuid,
            name,
            title,
            description,
            draft,
            year,
            quarter,
            requiresSigning);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1SandboxGenerateW2Form.class,
                "employeeUuid", employeeUuid,
                "uuid", uuid,
                "name", name,
                "title", title,
                "description", description,
                "draft", draft,
                "year", year,
                "quarter", quarter,
                "requiresSigning", requiresSigning);
    }
    
    public final static class Builder {
 
        private Optional<String> employeeUuid = Optional.empty();
 
        private String uuid;
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> description = Optional.empty();
 
        private Optional<Boolean> draft = Optional.empty();
 
        private JsonNullable<Long> year = JsonNullable.undefined();
 
        private JsonNullable<Long> quarter = JsonNullable.undefined();
 
        private Optional<Boolean> requiresSigning = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the employee
         */
        public Builder employeeUuid(String employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = Optional.ofNullable(employeeUuid);
            return this;
        }

        /**
         * The UUID of the employee
         */
        public Builder employeeUuid(Optional<String> employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = employeeUuid;
            return this;
        }

        /**
         * The UUID of the form
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The type identifier of the form
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The type identifier of the form
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The title of the form
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        /**
         * The title of the form
         */
        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * The description of the form
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * The description of the form
         */
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * If the form is in a draft state. E.g. End of year tax forms may be provided in a draft state prior to being finalized.
         */
        public Builder draft(boolean draft) {
            Utils.checkNotNull(draft, "draft");
            this.draft = Optional.ofNullable(draft);
            return this;
        }

        /**
         * If the form is in a draft state. E.g. End of year tax forms may be provided in a draft state prior to being finalized.
         */
        public Builder draft(Optional<Boolean> draft) {
            Utils.checkNotNull(draft, "draft");
            this.draft = draft;
            return this;
        }

        /**
         * The year of this form. For some forms, e.g. tax forms, this is the year which the form represents. A W2 for January - December 2022 would be delivered in January 2023 and have a year value of 2022. This value is nullable and will not be present on all forms.
         */
        public Builder year(long year) {
            Utils.checkNotNull(year, "year");
            this.year = JsonNullable.of(year);
            return this;
        }

        /**
         * The year of this form. For some forms, e.g. tax forms, this is the year which the form represents. A W2 for January - December 2022 would be delivered in January 2023 and have a year value of 2022. This value is nullable and will not be present on all forms.
         */
        public Builder year(JsonNullable<Long> year) {
            Utils.checkNotNull(year, "year");
            this.year = year;
            return this;
        }

        /**
         * The quarter of this form. For some forms, e.g. tax forms, this is the calendar quarter which this form represents. An Employer's Quarterly Federal Tax Return (Form 941) for April, May, June 2022 would have a quarter value of 2 (and a year value of 2022). This value is nullable and will not be present on all forms.
         */
        public Builder quarter(long quarter) {
            Utils.checkNotNull(quarter, "quarter");
            this.quarter = JsonNullable.of(quarter);
            return this;
        }

        /**
         * The quarter of this form. For some forms, e.g. tax forms, this is the calendar quarter which this form represents. An Employer's Quarterly Federal Tax Return (Form 941) for April, May, June 2022 would have a quarter value of 2 (and a year value of 2022). This value is nullable and will not be present on all forms.
         */
        public Builder quarter(JsonNullable<Long> quarter) {
            Utils.checkNotNull(quarter, "quarter");
            this.quarter = quarter;
            return this;
        }

        /**
         * A boolean flag that indicates whether the form needs signing or not. Note that this value will change after the form is signed.
         */
        public Builder requiresSigning(boolean requiresSigning) {
            Utils.checkNotNull(requiresSigning, "requiresSigning");
            this.requiresSigning = Optional.ofNullable(requiresSigning);
            return this;
        }

        /**
         * A boolean flag that indicates whether the form needs signing or not. Note that this value will change after the form is signed.
         */
        public Builder requiresSigning(Optional<Boolean> requiresSigning) {
            Utils.checkNotNull(requiresSigning, "requiresSigning");
            this.requiresSigning = requiresSigning;
            return this;
        }
        
        public PostV1SandboxGenerateW2Form build() {
            return new PostV1SandboxGenerateW2Form(
                employeeUuid,
                uuid,
                name,
                title,
                description,
                draft,
                year,
                quarter,
                requiresSigning);
        }
    }
}

