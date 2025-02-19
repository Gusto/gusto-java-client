/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

/**
 * HourlyCompensations - An array of hourly compensations for the employee. Hourly compensations include regular, overtime, and double overtime hours.
 */

public class HourlyCompensations {

    /**
     * The name of the compensation. This also serves as the unique, immutable identifier for this compensation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * The number of hours to be compensated for this pay period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours")
    private Optional<String> hours;

    /**
     * The UUIDs of the job for the compensation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("job_uuid")
    private Optional<String> jobUuid;

    @JsonCreator
    public HourlyCompensations(
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("hours") Optional<String> hours,
            @JsonProperty("job_uuid") Optional<String> jobUuid) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(hours, "hours");
        Utils.checkNotNull(jobUuid, "jobUuid");
        this.name = name;
        this.hours = hours;
        this.jobUuid = jobUuid;
    }
    
    public HourlyCompensations() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The name of the compensation. This also serves as the unique, immutable identifier for this compensation.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * The number of hours to be compensated for this pay period.
     */
    @JsonIgnore
    public Optional<String> hours() {
        return hours;
    }

    /**
     * The UUIDs of the job for the compensation.
     */
    @JsonIgnore
    public Optional<String> jobUuid() {
        return jobUuid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the compensation. This also serves as the unique, immutable identifier for this compensation.
     */
    public HourlyCompensations withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the compensation. This also serves as the unique, immutable identifier for this compensation.
     */
    public HourlyCompensations withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The number of hours to be compensated for this pay period.
     */
    public HourlyCompensations withHours(String hours) {
        Utils.checkNotNull(hours, "hours");
        this.hours = Optional.ofNullable(hours);
        return this;
    }

    /**
     * The number of hours to be compensated for this pay period.
     */
    public HourlyCompensations withHours(Optional<String> hours) {
        Utils.checkNotNull(hours, "hours");
        this.hours = hours;
        return this;
    }

    /**
     * The UUIDs of the job for the compensation.
     */
    public HourlyCompensations withJobUuid(String jobUuid) {
        Utils.checkNotNull(jobUuid, "jobUuid");
        this.jobUuid = Optional.ofNullable(jobUuid);
        return this;
    }

    /**
     * The UUIDs of the job for the compensation.
     */
    public HourlyCompensations withJobUuid(Optional<String> jobUuid) {
        Utils.checkNotNull(jobUuid, "jobUuid");
        this.jobUuid = jobUuid;
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
        HourlyCompensations other = (HourlyCompensations) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.hours, other.hours) &&
            Objects.deepEquals(this.jobUuid, other.jobUuid);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            hours,
            jobUuid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HourlyCompensations.class,
                "name", name,
                "hours", hours,
                "jobUuid", jobUuid);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> hours = Optional.empty();
 
        private Optional<String> jobUuid = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the compensation. This also serves as the unique, immutable identifier for this compensation.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of the compensation. This also serves as the unique, immutable identifier for this compensation.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The number of hours to be compensated for this pay period.
         */
        public Builder hours(String hours) {
            Utils.checkNotNull(hours, "hours");
            this.hours = Optional.ofNullable(hours);
            return this;
        }

        /**
         * The number of hours to be compensated for this pay period.
         */
        public Builder hours(Optional<String> hours) {
            Utils.checkNotNull(hours, "hours");
            this.hours = hours;
            return this;
        }

        /**
         * The UUIDs of the job for the compensation.
         */
        public Builder jobUuid(String jobUuid) {
            Utils.checkNotNull(jobUuid, "jobUuid");
            this.jobUuid = Optional.ofNullable(jobUuid);
            return this;
        }

        /**
         * The UUIDs of the job for the compensation.
         */
        public Builder jobUuid(Optional<String> jobUuid) {
            Utils.checkNotNull(jobUuid, "jobUuid");
            this.jobUuid = jobUuid;
            return this;
        }
        
        public HourlyCompensations build() {
            return new HourlyCompensations(
                name,
                hours,
                jobUuid);
        }
    }
}

