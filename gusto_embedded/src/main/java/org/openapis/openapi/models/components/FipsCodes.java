/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


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
import org.openapitools.jackson.nullable.JsonNullable;


public class FipsCodes {

    /**
     * FIPS code for state or county
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<String> code;

    /**
     * Name of county in the state for the corresponding FIPS code. When `null` the FIPS code applies state wide.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("county")
    private JsonNullable<String> county;

    @JsonCreator
    public FipsCodes(
            @JsonProperty("code") Optional<String> code,
            @JsonProperty("county") JsonNullable<String> county) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(county, "county");
        this.code = code;
        this.county = county;
    }
    
    public FipsCodes() {
        this(Optional.empty(), JsonNullable.undefined());
    }

    /**
     * FIPS code for state or county
     */
    @JsonIgnore
    public Optional<String> code() {
        return code;
    }

    /**
     * Name of county in the state for the corresponding FIPS code. When `null` the FIPS code applies state wide.
     */
    @JsonIgnore
    public JsonNullable<String> county() {
        return county;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * FIPS code for state or county
     */
    public FipsCodes withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    /**
     * FIPS code for state or county
     */
    public FipsCodes withCode(Optional<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * Name of county in the state for the corresponding FIPS code. When `null` the FIPS code applies state wide.
     */
    public FipsCodes withCounty(String county) {
        Utils.checkNotNull(county, "county");
        this.county = JsonNullable.of(county);
        return this;
    }

    /**
     * Name of county in the state for the corresponding FIPS code. When `null` the FIPS code applies state wide.
     */
    public FipsCodes withCounty(JsonNullable<String> county) {
        Utils.checkNotNull(county, "county");
        this.county = county;
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
        FipsCodes other = (FipsCodes) o;
        return 
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.county, other.county);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            county);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FipsCodes.class,
                "code", code,
                "county", county);
    }
    
    public final static class Builder {
 
        private Optional<String> code = Optional.empty();
 
        private JsonNullable<String> county = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * FIPS code for state or county
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        /**
         * FIPS code for state or county
         */
        public Builder code(Optional<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * Name of county in the state for the corresponding FIPS code. When `null` the FIPS code applies state wide.
         */
        public Builder county(String county) {
            Utils.checkNotNull(county, "county");
            this.county = JsonNullable.of(county);
            return this;
        }

        /**
         * Name of county in the state for the corresponding FIPS code. When `null` the FIPS code applies state wide.
         */
        public Builder county(JsonNullable<String> county) {
            Utils.checkNotNull(county, "county");
            this.county = county;
            return this;
        }
        
        public FipsCodes build() {
            return new FipsCodes(
                code,
                county);
        }
    }
}

