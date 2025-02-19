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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

/**
 * EarningTypeList - Example response
 */

public class EarningTypeList {

    /**
     * The default earning types for the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    private Optional<? extends List<EarningType>> default_;

    /**
     * The custom earning types for the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom")
    private Optional<? extends List<EarningType>> custom;

    @JsonCreator
    public EarningTypeList(
            @JsonProperty("default") Optional<? extends List<EarningType>> default_,
            @JsonProperty("custom") Optional<? extends List<EarningType>> custom) {
        Utils.checkNotNull(default_, "default_");
        Utils.checkNotNull(custom, "custom");
        this.default_ = default_;
        this.custom = custom;
    }
    
    public EarningTypeList() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The default earning types for the company.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<EarningType>> default_() {
        return (Optional<List<EarningType>>) default_;
    }

    /**
     * The custom earning types for the company.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<EarningType>> custom() {
        return (Optional<List<EarningType>>) custom;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The default earning types for the company.
     */
    public EarningTypeList withDefault(List<EarningType> default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = Optional.ofNullable(default_);
        return this;
    }

    /**
     * The default earning types for the company.
     */
    public EarningTypeList withDefault(Optional<? extends List<EarningType>> default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = default_;
        return this;
    }

    /**
     * The custom earning types for the company.
     */
    public EarningTypeList withCustom(List<EarningType> custom) {
        Utils.checkNotNull(custom, "custom");
        this.custom = Optional.ofNullable(custom);
        return this;
    }

    /**
     * The custom earning types for the company.
     */
    public EarningTypeList withCustom(Optional<? extends List<EarningType>> custom) {
        Utils.checkNotNull(custom, "custom");
        this.custom = custom;
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
        EarningTypeList other = (EarningTypeList) o;
        return 
            Objects.deepEquals(this.default_, other.default_) &&
            Objects.deepEquals(this.custom, other.custom);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            default_,
            custom);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EarningTypeList.class,
                "default_", default_,
                "custom", custom);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<EarningType>> default_ = Optional.empty();
 
        private Optional<? extends List<EarningType>> custom = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The default earning types for the company.
         */
        public Builder default_(List<EarningType> default_) {
            Utils.checkNotNull(default_, "default_");
            this.default_ = Optional.ofNullable(default_);
            return this;
        }

        /**
         * The default earning types for the company.
         */
        public Builder default_(Optional<? extends List<EarningType>> default_) {
            Utils.checkNotNull(default_, "default_");
            this.default_ = default_;
            return this;
        }

        /**
         * The custom earning types for the company.
         */
        public Builder custom(List<EarningType> custom) {
            Utils.checkNotNull(custom, "custom");
            this.custom = Optional.ofNullable(custom);
            return this;
        }

        /**
         * The custom earning types for the company.
         */
        public Builder custom(Optional<? extends List<EarningType>> custom) {
            Utils.checkNotNull(custom, "custom");
            this.custom = custom;
            return this;
        }
        
        public EarningTypeList build() {
            return new EarningTypeList(
                default_,
                custom);
        }
    }
}

