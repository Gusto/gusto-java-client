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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PayScheduleAssignmentPreview - The representation of a pay schedule assignment preview.
 */

public class PayScheduleAssignmentPreview {

    /**
     * The pay schedule assignment type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends PayScheduleAssignmentPreviewType> type;

    /**
     * A list of pay schedule changes including pay period and transition pay period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_changes")
    private Optional<? extends List<PayScheduleAssignmentEmployeeChange>> employeeChanges;

    @JsonCreator
    public PayScheduleAssignmentPreview(
            @JsonProperty("type") JsonNullable<? extends PayScheduleAssignmentPreviewType> type,
            @JsonProperty("employee_changes") Optional<? extends List<PayScheduleAssignmentEmployeeChange>> employeeChanges) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(employeeChanges, "employeeChanges");
        this.type = type;
        this.employeeChanges = employeeChanges;
    }
    
    public PayScheduleAssignmentPreview() {
        this(JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The pay schedule assignment type.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PayScheduleAssignmentPreviewType> type() {
        return (JsonNullable<PayScheduleAssignmentPreviewType>) type;
    }

    /**
     * A list of pay schedule changes including pay period and transition pay period.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PayScheduleAssignmentEmployeeChange>> employeeChanges() {
        return (Optional<List<PayScheduleAssignmentEmployeeChange>>) employeeChanges;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The pay schedule assignment type.
     */
    public PayScheduleAssignmentPreview withType(PayScheduleAssignmentPreviewType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The pay schedule assignment type.
     */
    public PayScheduleAssignmentPreview withType(JsonNullable<? extends PayScheduleAssignmentPreviewType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * A list of pay schedule changes including pay period and transition pay period.
     */
    public PayScheduleAssignmentPreview withEmployeeChanges(List<PayScheduleAssignmentEmployeeChange> employeeChanges) {
        Utils.checkNotNull(employeeChanges, "employeeChanges");
        this.employeeChanges = Optional.ofNullable(employeeChanges);
        return this;
    }

    /**
     * A list of pay schedule changes including pay period and transition pay period.
     */
    public PayScheduleAssignmentPreview withEmployeeChanges(Optional<? extends List<PayScheduleAssignmentEmployeeChange>> employeeChanges) {
        Utils.checkNotNull(employeeChanges, "employeeChanges");
        this.employeeChanges = employeeChanges;
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
        PayScheduleAssignmentPreview other = (PayScheduleAssignmentPreview) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.employeeChanges, other.employeeChanges);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            employeeChanges);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PayScheduleAssignmentPreview.class,
                "type", type,
                "employeeChanges", employeeChanges);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends PayScheduleAssignmentPreviewType> type = JsonNullable.undefined();
 
        private Optional<? extends List<PayScheduleAssignmentEmployeeChange>> employeeChanges = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The pay schedule assignment type.
         */
        public Builder type(PayScheduleAssignmentPreviewType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The pay schedule assignment type.
         */
        public Builder type(JsonNullable<? extends PayScheduleAssignmentPreviewType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * A list of pay schedule changes including pay period and transition pay period.
         */
        public Builder employeeChanges(List<PayScheduleAssignmentEmployeeChange> employeeChanges) {
            Utils.checkNotNull(employeeChanges, "employeeChanges");
            this.employeeChanges = Optional.ofNullable(employeeChanges);
            return this;
        }

        /**
         * A list of pay schedule changes including pay period and transition pay period.
         */
        public Builder employeeChanges(Optional<? extends List<PayScheduleAssignmentEmployeeChange>> employeeChanges) {
            Utils.checkNotNull(employeeChanges, "employeeChanges");
            this.employeeChanges = employeeChanges;
            return this;
        }
        
        public PayScheduleAssignmentPreview build() {
            return new PayScheduleAssignmentPreview(
                type,
                employeeChanges);
        }
    }
}

