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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Industry - Example response
 */

public class Industry {

    /**
     * Company uuid
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_uuid")
    private Optional<String> companyUuid;

    /**
     * North American Industry Classification System (NAICS) is used to classify businesses with a six digit number based on the primary type of work the business performs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("naics_code")
    private JsonNullable<String> naicsCode;

    /**
     * A list of Standard Industrial Classification (SIC) codes, which are four digit number that categorize the industries that companies belong to based on their business activities.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sic_codes")
    private Optional<? extends List<String>> sicCodes;

    /**
     * Industry title
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    @JsonCreator
    public Industry(
            @JsonProperty("company_uuid") Optional<String> companyUuid,
            @JsonProperty("naics_code") JsonNullable<String> naicsCode,
            @JsonProperty("sic_codes") Optional<? extends List<String>> sicCodes,
            @JsonProperty("title") JsonNullable<String> title) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(naicsCode, "naicsCode");
        Utils.checkNotNull(sicCodes, "sicCodes");
        Utils.checkNotNull(title, "title");
        this.companyUuid = companyUuid;
        this.naicsCode = naicsCode;
        this.sicCodes = sicCodes;
        this.title = title;
    }
    
    public Industry() {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined());
    }

    /**
     * Company uuid
     */
    @JsonIgnore
    public Optional<String> companyUuid() {
        return companyUuid;
    }

    /**
     * North American Industry Classification System (NAICS) is used to classify businesses with a six digit number based on the primary type of work the business performs.
     */
    @JsonIgnore
    public JsonNullable<String> naicsCode() {
        return naicsCode;
    }

    /**
     * A list of Standard Industrial Classification (SIC) codes, which are four digit number that categorize the industries that companies belong to based on their business activities.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> sicCodes() {
        return (Optional<List<String>>) sicCodes;
    }

    /**
     * Industry title
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Company uuid
     */
    public Industry withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = Optional.ofNullable(companyUuid);
        return this;
    }

    /**
     * Company uuid
     */
    public Industry withCompanyUuid(Optional<String> companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * North American Industry Classification System (NAICS) is used to classify businesses with a six digit number based on the primary type of work the business performs.
     */
    public Industry withNaicsCode(String naicsCode) {
        Utils.checkNotNull(naicsCode, "naicsCode");
        this.naicsCode = JsonNullable.of(naicsCode);
        return this;
    }

    /**
     * North American Industry Classification System (NAICS) is used to classify businesses with a six digit number based on the primary type of work the business performs.
     */
    public Industry withNaicsCode(JsonNullable<String> naicsCode) {
        Utils.checkNotNull(naicsCode, "naicsCode");
        this.naicsCode = naicsCode;
        return this;
    }

    /**
     * A list of Standard Industrial Classification (SIC) codes, which are four digit number that categorize the industries that companies belong to based on their business activities.
     */
    public Industry withSicCodes(List<String> sicCodes) {
        Utils.checkNotNull(sicCodes, "sicCodes");
        this.sicCodes = Optional.ofNullable(sicCodes);
        return this;
    }

    /**
     * A list of Standard Industrial Classification (SIC) codes, which are four digit number that categorize the industries that companies belong to based on their business activities.
     */
    public Industry withSicCodes(Optional<? extends List<String>> sicCodes) {
        Utils.checkNotNull(sicCodes, "sicCodes");
        this.sicCodes = sicCodes;
        return this;
    }

    /**
     * Industry title
     */
    public Industry withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * Industry title
     */
    public Industry withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
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
        Industry other = (Industry) o;
        return 
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.naicsCode, other.naicsCode) &&
            Objects.deepEquals(this.sicCodes, other.sicCodes) &&
            Objects.deepEquals(this.title, other.title);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyUuid,
            naicsCode,
            sicCodes,
            title);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Industry.class,
                "companyUuid", companyUuid,
                "naicsCode", naicsCode,
                "sicCodes", sicCodes,
                "title", title);
    }
    
    public final static class Builder {
 
        private Optional<String> companyUuid = Optional.empty();
 
        private JsonNullable<String> naicsCode = JsonNullable.undefined();
 
        private Optional<? extends List<String>> sicCodes = Optional.empty();
 
        private JsonNullable<String> title = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Company uuid
         */
        public Builder companyUuid(String companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = Optional.ofNullable(companyUuid);
            return this;
        }

        /**
         * Company uuid
         */
        public Builder companyUuid(Optional<String> companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = companyUuid;
            return this;
        }

        /**
         * North American Industry Classification System (NAICS) is used to classify businesses with a six digit number based on the primary type of work the business performs.
         */
        public Builder naicsCode(String naicsCode) {
            Utils.checkNotNull(naicsCode, "naicsCode");
            this.naicsCode = JsonNullable.of(naicsCode);
            return this;
        }

        /**
         * North American Industry Classification System (NAICS) is used to classify businesses with a six digit number based on the primary type of work the business performs.
         */
        public Builder naicsCode(JsonNullable<String> naicsCode) {
            Utils.checkNotNull(naicsCode, "naicsCode");
            this.naicsCode = naicsCode;
            return this;
        }

        /**
         * A list of Standard Industrial Classification (SIC) codes, which are four digit number that categorize the industries that companies belong to based on their business activities.
         */
        public Builder sicCodes(List<String> sicCodes) {
            Utils.checkNotNull(sicCodes, "sicCodes");
            this.sicCodes = Optional.ofNullable(sicCodes);
            return this;
        }

        /**
         * A list of Standard Industrial Classification (SIC) codes, which are four digit number that categorize the industries that companies belong to based on their business activities.
         */
        public Builder sicCodes(Optional<? extends List<String>> sicCodes) {
            Utils.checkNotNull(sicCodes, "sicCodes");
            this.sicCodes = sicCodes;
            return this;
        }

        /**
         * Industry title
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * Industry title
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }
        
        public Industry build() {
            return new Industry(
                companyUuid,
                naicsCode,
                sicCodes,
                title);
        }
    }
}

