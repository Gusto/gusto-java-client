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

public class Schema {

    /**
     * the holiday's identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("holiday_key")
    private Optional<String> holidayKey;

    /**
     * the holiday's official name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("holiday_name")
    private Optional<String> holidayName;

    /**
     * the holiday's start date (YYYY-MM-DD)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<String> startDate;

    /**
     * the holiday's end date (YYYY-MM-DD)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<String> endDate;

    @JsonCreator
    public Schema(
            @JsonProperty("holiday_key") Optional<String> holidayKey,
            @JsonProperty("holiday_name") Optional<String> holidayName,
            @JsonProperty("start_date") Optional<String> startDate,
            @JsonProperty("end_date") Optional<String> endDate) {
        Utils.checkNotNull(holidayKey, "holidayKey");
        Utils.checkNotNull(holidayName, "holidayName");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        this.holidayKey = holidayKey;
        this.holidayName = holidayName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public Schema() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * the holiday's identifier
     */
    @JsonIgnore
    public Optional<String> holidayKey() {
        return holidayKey;
    }

    /**
     * the holiday's official name
     */
    @JsonIgnore
    public Optional<String> holidayName() {
        return holidayName;
    }

    /**
     * the holiday's start date (YYYY-MM-DD)
     */
    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    /**
     * the holiday's end date (YYYY-MM-DD)
     */
    @JsonIgnore
    public Optional<String> endDate() {
        return endDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * the holiday's identifier
     */
    public Schema withHolidayKey(String holidayKey) {
        Utils.checkNotNull(holidayKey, "holidayKey");
        this.holidayKey = Optional.ofNullable(holidayKey);
        return this;
    }

    /**
     * the holiday's identifier
     */
    public Schema withHolidayKey(Optional<String> holidayKey) {
        Utils.checkNotNull(holidayKey, "holidayKey");
        this.holidayKey = holidayKey;
        return this;
    }

    /**
     * the holiday's official name
     */
    public Schema withHolidayName(String holidayName) {
        Utils.checkNotNull(holidayName, "holidayName");
        this.holidayName = Optional.ofNullable(holidayName);
        return this;
    }

    /**
     * the holiday's official name
     */
    public Schema withHolidayName(Optional<String> holidayName) {
        Utils.checkNotNull(holidayName, "holidayName");
        this.holidayName = holidayName;
        return this;
    }

    /**
     * the holiday's start date (YYYY-MM-DD)
     */
    public Schema withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * the holiday's start date (YYYY-MM-DD)
     */
    public Schema withStartDate(Optional<String> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * the holiday's end date (YYYY-MM-DD)
     */
    public Schema withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * the holiday's end date (YYYY-MM-DD)
     */
    public Schema withEndDate(Optional<String> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
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
        Schema other = (Schema) o;
        return 
            Objects.deepEquals(this.holidayKey, other.holidayKey) &&
            Objects.deepEquals(this.holidayName, other.holidayName) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.endDate, other.endDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            holidayKey,
            holidayName,
            startDate,
            endDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Schema.class,
                "holidayKey", holidayKey,
                "holidayName", holidayName,
                "startDate", startDate,
                "endDate", endDate);
    }
    
    public final static class Builder {
 
        private Optional<String> holidayKey = Optional.empty();
 
        private Optional<String> holidayName = Optional.empty();
 
        private Optional<String> startDate = Optional.empty();
 
        private Optional<String> endDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * the holiday's identifier
         */
        public Builder holidayKey(String holidayKey) {
            Utils.checkNotNull(holidayKey, "holidayKey");
            this.holidayKey = Optional.ofNullable(holidayKey);
            return this;
        }

        /**
         * the holiday's identifier
         */
        public Builder holidayKey(Optional<String> holidayKey) {
            Utils.checkNotNull(holidayKey, "holidayKey");
            this.holidayKey = holidayKey;
            return this;
        }

        /**
         * the holiday's official name
         */
        public Builder holidayName(String holidayName) {
            Utils.checkNotNull(holidayName, "holidayName");
            this.holidayName = Optional.ofNullable(holidayName);
            return this;
        }

        /**
         * the holiday's official name
         */
        public Builder holidayName(Optional<String> holidayName) {
            Utils.checkNotNull(holidayName, "holidayName");
            this.holidayName = holidayName;
            return this;
        }

        /**
         * the holiday's start date (YYYY-MM-DD)
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * the holiday's start date (YYYY-MM-DD)
         */
        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * the holiday's end date (YYYY-MM-DD)
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * the holiday's end date (YYYY-MM-DD)
         */
        public Builder endDate(Optional<String> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }
        
        public Schema build() {
            return new Schema(
                holidayKey,
                holidayName,
                startDate,
                endDate);
        }
    }
}

