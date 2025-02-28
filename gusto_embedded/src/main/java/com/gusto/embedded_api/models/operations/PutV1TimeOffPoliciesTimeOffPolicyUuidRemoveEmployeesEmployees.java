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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesEmployees {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    private Optional<String> uuid;

    @JsonCreator
    public PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesEmployees(
            @JsonProperty("uuid") Optional<String> uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
    }
    
    public PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesEmployees() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> uuid() {
        return uuid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesEmployees withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = Optional.ofNullable(uuid);
        return this;
    }

    public PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesEmployees withUuid(Optional<String> uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
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
        PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesEmployees other = (PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesEmployees) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesEmployees.class,
                "uuid", uuid);
    }
    
    public final static class Builder {
 
        private Optional<String> uuid = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = Optional.ofNullable(uuid);
            return this;
        }

        public Builder uuid(Optional<String> uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }
        
        public PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesEmployees build() {
            return new PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesEmployees(
                uuid);
        }
    }
}

