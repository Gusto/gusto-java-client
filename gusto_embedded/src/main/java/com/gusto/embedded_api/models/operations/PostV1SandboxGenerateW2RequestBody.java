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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class PostV1SandboxGenerateW2RequestBody {

    /**
     * The employee UUID.
     */
    @JsonProperty("employee_id")
    private String employeeId;

    /**
     * Must be equal to or more recent than 2015. If not specified, defaults to the previous year.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("year")
    private Optional<Long> year;

    @JsonCreator
    public PostV1SandboxGenerateW2RequestBody(
            @JsonProperty("employee_id") String employeeId,
            @JsonProperty("year") Optional<Long> year) {
        Utils.checkNotNull(employeeId, "employeeId");
        Utils.checkNotNull(year, "year");
        this.employeeId = employeeId;
        this.year = year;
    }
    
    public PostV1SandboxGenerateW2RequestBody(
            String employeeId) {
        this(employeeId, Optional.empty());
    }

    /**
     * The employee UUID.
     */
    @JsonIgnore
    public String employeeId() {
        return employeeId;
    }

    /**
     * Must be equal to or more recent than 2015. If not specified, defaults to the previous year.
     */
    @JsonIgnore
    public Optional<Long> year() {
        return year;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The employee UUID.
     */
    public PostV1SandboxGenerateW2RequestBody withEmployeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }

    /**
     * Must be equal to or more recent than 2015. If not specified, defaults to the previous year.
     */
    public PostV1SandboxGenerateW2RequestBody withYear(long year) {
        Utils.checkNotNull(year, "year");
        this.year = Optional.ofNullable(year);
        return this;
    }

    /**
     * Must be equal to or more recent than 2015. If not specified, defaults to the previous year.
     */
    public PostV1SandboxGenerateW2RequestBody withYear(Optional<Long> year) {
        Utils.checkNotNull(year, "year");
        this.year = year;
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
        PostV1SandboxGenerateW2RequestBody other = (PostV1SandboxGenerateW2RequestBody) o;
        return 
            Objects.deepEquals(this.employeeId, other.employeeId) &&
            Objects.deepEquals(this.year, other.year);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employeeId,
            year);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1SandboxGenerateW2RequestBody.class,
                "employeeId", employeeId,
                "year", year);
    }
    
    public final static class Builder {
 
        private String employeeId;
 
        private Optional<Long> year = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The employee UUID.
         */
        public Builder employeeId(String employeeId) {
            Utils.checkNotNull(employeeId, "employeeId");
            this.employeeId = employeeId;
            return this;
        }

        /**
         * Must be equal to or more recent than 2015. If not specified, defaults to the previous year.
         */
        public Builder year(long year) {
            Utils.checkNotNull(year, "year");
            this.year = Optional.ofNullable(year);
            return this;
        }

        /**
         * Must be equal to or more recent than 2015. If not specified, defaults to the previous year.
         */
        public Builder year(Optional<Long> year) {
            Utils.checkNotNull(year, "year");
            this.year = year;
            return this;
        }
        
        public PostV1SandboxGenerateW2RequestBody build() {
            return new PostV1SandboxGenerateW2RequestBody(
                employeeId,
                year);
        }
    }
}

