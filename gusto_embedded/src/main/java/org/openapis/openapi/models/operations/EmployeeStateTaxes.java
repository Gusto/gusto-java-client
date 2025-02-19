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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;


public class EmployeeStateTaxes {

    /**
     * Whether this job is eligible for workers' compensation coverage in the states of Washington (WA) or Wyoming (WY).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wc_covered")
    private Optional<Boolean> wcCovered;

    /**
     * The risk class code for workers' compensation in Washington or Wyoming state. For Washington, visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more. For Wyoming you can search for the code online using [WY Workforce Services website](https://dws.wyo.gov/dws-division/workers-compensation/) or call the agency at (307) 235-3217.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wc_class_code")
    private Optional<String> wcClassCode;

    @JsonCreator
    public EmployeeStateTaxes(
            @JsonProperty("wc_covered") Optional<Boolean> wcCovered,
            @JsonProperty("wc_class_code") Optional<String> wcClassCode) {
        Utils.checkNotNull(wcCovered, "wcCovered");
        Utils.checkNotNull(wcClassCode, "wcClassCode");
        this.wcCovered = wcCovered;
        this.wcClassCode = wcClassCode;
    }
    
    public EmployeeStateTaxes() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Whether this job is eligible for workers' compensation coverage in the states of Washington (WA) or Wyoming (WY).
     */
    @JsonIgnore
    public Optional<Boolean> wcCovered() {
        return wcCovered;
    }

    /**
     * The risk class code for workers' compensation in Washington or Wyoming state. For Washington, visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more. For Wyoming you can search for the code online using [WY Workforce Services website](https://dws.wyo.gov/dws-division/workers-compensation/) or call the agency at (307) 235-3217.
     */
    @JsonIgnore
    public Optional<String> wcClassCode() {
        return wcClassCode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether this job is eligible for workers' compensation coverage in the states of Washington (WA) or Wyoming (WY).
     */
    public EmployeeStateTaxes withWcCovered(boolean wcCovered) {
        Utils.checkNotNull(wcCovered, "wcCovered");
        this.wcCovered = Optional.ofNullable(wcCovered);
        return this;
    }

    /**
     * Whether this job is eligible for workers' compensation coverage in the states of Washington (WA) or Wyoming (WY).
     */
    public EmployeeStateTaxes withWcCovered(Optional<Boolean> wcCovered) {
        Utils.checkNotNull(wcCovered, "wcCovered");
        this.wcCovered = wcCovered;
        return this;
    }

    /**
     * The risk class code for workers' compensation in Washington or Wyoming state. For Washington, visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more. For Wyoming you can search for the code online using [WY Workforce Services website](https://dws.wyo.gov/dws-division/workers-compensation/) or call the agency at (307) 235-3217.
     */
    public EmployeeStateTaxes withWcClassCode(String wcClassCode) {
        Utils.checkNotNull(wcClassCode, "wcClassCode");
        this.wcClassCode = Optional.ofNullable(wcClassCode);
        return this;
    }

    /**
     * The risk class code for workers' compensation in Washington or Wyoming state. For Washington, visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more. For Wyoming you can search for the code online using [WY Workforce Services website](https://dws.wyo.gov/dws-division/workers-compensation/) or call the agency at (307) 235-3217.
     */
    public EmployeeStateTaxes withWcClassCode(Optional<String> wcClassCode) {
        Utils.checkNotNull(wcClassCode, "wcClassCode");
        this.wcClassCode = wcClassCode;
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
        EmployeeStateTaxes other = (EmployeeStateTaxes) o;
        return 
            Objects.deepEquals(this.wcCovered, other.wcCovered) &&
            Objects.deepEquals(this.wcClassCode, other.wcClassCode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            wcCovered,
            wcClassCode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmployeeStateTaxes.class,
                "wcCovered", wcCovered,
                "wcClassCode", wcClassCode);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> wcCovered = Optional.empty();
 
        private Optional<String> wcClassCode = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether this job is eligible for workers' compensation coverage in the states of Washington (WA) or Wyoming (WY).
         */
        public Builder wcCovered(boolean wcCovered) {
            Utils.checkNotNull(wcCovered, "wcCovered");
            this.wcCovered = Optional.ofNullable(wcCovered);
            return this;
        }

        /**
         * Whether this job is eligible for workers' compensation coverage in the states of Washington (WA) or Wyoming (WY).
         */
        public Builder wcCovered(Optional<Boolean> wcCovered) {
            Utils.checkNotNull(wcCovered, "wcCovered");
            this.wcCovered = wcCovered;
            return this;
        }

        /**
         * The risk class code for workers' compensation in Washington or Wyoming state. For Washington, visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more. For Wyoming you can search for the code online using [WY Workforce Services website](https://dws.wyo.gov/dws-division/workers-compensation/) or call the agency at (307) 235-3217.
         */
        public Builder wcClassCode(String wcClassCode) {
            Utils.checkNotNull(wcClassCode, "wcClassCode");
            this.wcClassCode = Optional.ofNullable(wcClassCode);
            return this;
        }

        /**
         * The risk class code for workers' compensation in Washington or Wyoming state. For Washington, visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more. For Wyoming you can search for the code online using [WY Workforce Services website](https://dws.wyo.gov/dws-division/workers-compensation/) or call the agency at (307) 235-3217.
         */
        public Builder wcClassCode(Optional<String> wcClassCode) {
            Utils.checkNotNull(wcClassCode, "wcClassCode");
            this.wcClassCode = wcClassCode;
            return this;
        }
        
        public EmployeeStateTaxes build() {
            return new EmployeeStateTaxes(
                wcCovered,
                wcClassCode);
        }
    }
}

