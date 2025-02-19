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
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

/**
 * TimeOffActivity - Representation of a Time Off Activity
 */

public class TimeOffActivity {

    /**
     * unique identifier of a time off policy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy_uuid")
    private Optional<String> policyUuid;

    /**
     * Type of the time off activity
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time_off_type")
    private Optional<? extends TimeOffType> timeOffType;

    /**
     * The name of the time off policy for this activity
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy_name")
    private Optional<String> policyName;

    /**
     * The type of the time off event/activity
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("event_type")
    private Optional<String> eventType;

    /**
     * A description for the time off event/activity
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("event_description")
    private Optional<String> eventDescription;

    /**
     * The datetime of the time off activity
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_time")
    private Optional<String> effectiveTime;

    /**
     * The time off balance at the time of the activity
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<String> balance;

    /**
     * The amount the time off balance changed as a result of the activity
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance_change")
    private Optional<String> balanceChange;

    @JsonCreator
    public TimeOffActivity(
            @JsonProperty("policy_uuid") Optional<String> policyUuid,
            @JsonProperty("time_off_type") Optional<? extends TimeOffType> timeOffType,
            @JsonProperty("policy_name") Optional<String> policyName,
            @JsonProperty("event_type") Optional<String> eventType,
            @JsonProperty("event_description") Optional<String> eventDescription,
            @JsonProperty("effective_time") Optional<String> effectiveTime,
            @JsonProperty("balance") Optional<String> balance,
            @JsonProperty("balance_change") Optional<String> balanceChange) {
        Utils.checkNotNull(policyUuid, "policyUuid");
        Utils.checkNotNull(timeOffType, "timeOffType");
        Utils.checkNotNull(policyName, "policyName");
        Utils.checkNotNull(eventType, "eventType");
        Utils.checkNotNull(eventDescription, "eventDescription");
        Utils.checkNotNull(effectiveTime, "effectiveTime");
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(balanceChange, "balanceChange");
        this.policyUuid = policyUuid;
        this.timeOffType = timeOffType;
        this.policyName = policyName;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        this.effectiveTime = effectiveTime;
        this.balance = balance;
        this.balanceChange = balanceChange;
    }
    
    public TimeOffActivity() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * unique identifier of a time off policy
     */
    @JsonIgnore
    public Optional<String> policyUuid() {
        return policyUuid;
    }

    /**
     * Type of the time off activity
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TimeOffType> timeOffType() {
        return (Optional<TimeOffType>) timeOffType;
    }

    /**
     * The name of the time off policy for this activity
     */
    @JsonIgnore
    public Optional<String> policyName() {
        return policyName;
    }

    /**
     * The type of the time off event/activity
     */
    @JsonIgnore
    public Optional<String> eventType() {
        return eventType;
    }

    /**
     * A description for the time off event/activity
     */
    @JsonIgnore
    public Optional<String> eventDescription() {
        return eventDescription;
    }

    /**
     * The datetime of the time off activity
     */
    @JsonIgnore
    public Optional<String> effectiveTime() {
        return effectiveTime;
    }

    /**
     * The time off balance at the time of the activity
     */
    @JsonIgnore
    public Optional<String> balance() {
        return balance;
    }

    /**
     * The amount the time off balance changed as a result of the activity
     */
    @JsonIgnore
    public Optional<String> balanceChange() {
        return balanceChange;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * unique identifier of a time off policy
     */
    public TimeOffActivity withPolicyUuid(String policyUuid) {
        Utils.checkNotNull(policyUuid, "policyUuid");
        this.policyUuid = Optional.ofNullable(policyUuid);
        return this;
    }

    /**
     * unique identifier of a time off policy
     */
    public TimeOffActivity withPolicyUuid(Optional<String> policyUuid) {
        Utils.checkNotNull(policyUuid, "policyUuid");
        this.policyUuid = policyUuid;
        return this;
    }

    /**
     * Type of the time off activity
     */
    public TimeOffActivity withTimeOffType(TimeOffType timeOffType) {
        Utils.checkNotNull(timeOffType, "timeOffType");
        this.timeOffType = Optional.ofNullable(timeOffType);
        return this;
    }

    /**
     * Type of the time off activity
     */
    public TimeOffActivity withTimeOffType(Optional<? extends TimeOffType> timeOffType) {
        Utils.checkNotNull(timeOffType, "timeOffType");
        this.timeOffType = timeOffType;
        return this;
    }

    /**
     * The name of the time off policy for this activity
     */
    public TimeOffActivity withPolicyName(String policyName) {
        Utils.checkNotNull(policyName, "policyName");
        this.policyName = Optional.ofNullable(policyName);
        return this;
    }

    /**
     * The name of the time off policy for this activity
     */
    public TimeOffActivity withPolicyName(Optional<String> policyName) {
        Utils.checkNotNull(policyName, "policyName");
        this.policyName = policyName;
        return this;
    }

    /**
     * The type of the time off event/activity
     */
    public TimeOffActivity withEventType(String eventType) {
        Utils.checkNotNull(eventType, "eventType");
        this.eventType = Optional.ofNullable(eventType);
        return this;
    }

    /**
     * The type of the time off event/activity
     */
    public TimeOffActivity withEventType(Optional<String> eventType) {
        Utils.checkNotNull(eventType, "eventType");
        this.eventType = eventType;
        return this;
    }

    /**
     * A description for the time off event/activity
     */
    public TimeOffActivity withEventDescription(String eventDescription) {
        Utils.checkNotNull(eventDescription, "eventDescription");
        this.eventDescription = Optional.ofNullable(eventDescription);
        return this;
    }

    /**
     * A description for the time off event/activity
     */
    public TimeOffActivity withEventDescription(Optional<String> eventDescription) {
        Utils.checkNotNull(eventDescription, "eventDescription");
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * The datetime of the time off activity
     */
    public TimeOffActivity withEffectiveTime(String effectiveTime) {
        Utils.checkNotNull(effectiveTime, "effectiveTime");
        this.effectiveTime = Optional.ofNullable(effectiveTime);
        return this;
    }

    /**
     * The datetime of the time off activity
     */
    public TimeOffActivity withEffectiveTime(Optional<String> effectiveTime) {
        Utils.checkNotNull(effectiveTime, "effectiveTime");
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * The time off balance at the time of the activity
     */
    public TimeOffActivity withBalance(String balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

    /**
     * The time off balance at the time of the activity
     */
    public TimeOffActivity withBalance(Optional<String> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    /**
     * The amount the time off balance changed as a result of the activity
     */
    public TimeOffActivity withBalanceChange(String balanceChange) {
        Utils.checkNotNull(balanceChange, "balanceChange");
        this.balanceChange = Optional.ofNullable(balanceChange);
        return this;
    }

    /**
     * The amount the time off balance changed as a result of the activity
     */
    public TimeOffActivity withBalanceChange(Optional<String> balanceChange) {
        Utils.checkNotNull(balanceChange, "balanceChange");
        this.balanceChange = balanceChange;
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
        TimeOffActivity other = (TimeOffActivity) o;
        return 
            Objects.deepEquals(this.policyUuid, other.policyUuid) &&
            Objects.deepEquals(this.timeOffType, other.timeOffType) &&
            Objects.deepEquals(this.policyName, other.policyName) &&
            Objects.deepEquals(this.eventType, other.eventType) &&
            Objects.deepEquals(this.eventDescription, other.eventDescription) &&
            Objects.deepEquals(this.effectiveTime, other.effectiveTime) &&
            Objects.deepEquals(this.balance, other.balance) &&
            Objects.deepEquals(this.balanceChange, other.balanceChange);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            policyUuid,
            timeOffType,
            policyName,
            eventType,
            eventDescription,
            effectiveTime,
            balance,
            balanceChange);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TimeOffActivity.class,
                "policyUuid", policyUuid,
                "timeOffType", timeOffType,
                "policyName", policyName,
                "eventType", eventType,
                "eventDescription", eventDescription,
                "effectiveTime", effectiveTime,
                "balance", balance,
                "balanceChange", balanceChange);
    }
    
    public final static class Builder {
 
        private Optional<String> policyUuid = Optional.empty();
 
        private Optional<? extends TimeOffType> timeOffType = Optional.empty();
 
        private Optional<String> policyName = Optional.empty();
 
        private Optional<String> eventType = Optional.empty();
 
        private Optional<String> eventDescription = Optional.empty();
 
        private Optional<String> effectiveTime = Optional.empty();
 
        private Optional<String> balance = Optional.empty();
 
        private Optional<String> balanceChange = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * unique identifier of a time off policy
         */
        public Builder policyUuid(String policyUuid) {
            Utils.checkNotNull(policyUuid, "policyUuid");
            this.policyUuid = Optional.ofNullable(policyUuid);
            return this;
        }

        /**
         * unique identifier of a time off policy
         */
        public Builder policyUuid(Optional<String> policyUuid) {
            Utils.checkNotNull(policyUuid, "policyUuid");
            this.policyUuid = policyUuid;
            return this;
        }

        /**
         * Type of the time off activity
         */
        public Builder timeOffType(TimeOffType timeOffType) {
            Utils.checkNotNull(timeOffType, "timeOffType");
            this.timeOffType = Optional.ofNullable(timeOffType);
            return this;
        }

        /**
         * Type of the time off activity
         */
        public Builder timeOffType(Optional<? extends TimeOffType> timeOffType) {
            Utils.checkNotNull(timeOffType, "timeOffType");
            this.timeOffType = timeOffType;
            return this;
        }

        /**
         * The name of the time off policy for this activity
         */
        public Builder policyName(String policyName) {
            Utils.checkNotNull(policyName, "policyName");
            this.policyName = Optional.ofNullable(policyName);
            return this;
        }

        /**
         * The name of the time off policy for this activity
         */
        public Builder policyName(Optional<String> policyName) {
            Utils.checkNotNull(policyName, "policyName");
            this.policyName = policyName;
            return this;
        }

        /**
         * The type of the time off event/activity
         */
        public Builder eventType(String eventType) {
            Utils.checkNotNull(eventType, "eventType");
            this.eventType = Optional.ofNullable(eventType);
            return this;
        }

        /**
         * The type of the time off event/activity
         */
        public Builder eventType(Optional<String> eventType) {
            Utils.checkNotNull(eventType, "eventType");
            this.eventType = eventType;
            return this;
        }

        /**
         * A description for the time off event/activity
         */
        public Builder eventDescription(String eventDescription) {
            Utils.checkNotNull(eventDescription, "eventDescription");
            this.eventDescription = Optional.ofNullable(eventDescription);
            return this;
        }

        /**
         * A description for the time off event/activity
         */
        public Builder eventDescription(Optional<String> eventDescription) {
            Utils.checkNotNull(eventDescription, "eventDescription");
            this.eventDescription = eventDescription;
            return this;
        }

        /**
         * The datetime of the time off activity
         */
        public Builder effectiveTime(String effectiveTime) {
            Utils.checkNotNull(effectiveTime, "effectiveTime");
            this.effectiveTime = Optional.ofNullable(effectiveTime);
            return this;
        }

        /**
         * The datetime of the time off activity
         */
        public Builder effectiveTime(Optional<String> effectiveTime) {
            Utils.checkNotNull(effectiveTime, "effectiveTime");
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * The time off balance at the time of the activity
         */
        public Builder balance(String balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }

        /**
         * The time off balance at the time of the activity
         */
        public Builder balance(Optional<String> balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = balance;
            return this;
        }

        /**
         * The amount the time off balance changed as a result of the activity
         */
        public Builder balanceChange(String balanceChange) {
            Utils.checkNotNull(balanceChange, "balanceChange");
            this.balanceChange = Optional.ofNullable(balanceChange);
            return this;
        }

        /**
         * The amount the time off balance changed as a result of the activity
         */
        public Builder balanceChange(Optional<String> balanceChange) {
            Utils.checkNotNull(balanceChange, "balanceChange");
            this.balanceChange = balanceChange;
            return this;
        }
        
        public TimeOffActivity build() {
            return new TimeOffActivity(
                policyUuid,
                timeOffType,
                policyName,
                eventType,
                eventDescription,
                effectiveTime,
                balance,
                balanceChange);
        }
    }
}

