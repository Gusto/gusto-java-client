/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class PutV1WebhookSubscriptionUuidRequestBody {

    @JsonProperty("subscription_types")
    private List<PutV1WebhookSubscriptionUuidSubscriptionTypes> subscriptionTypes;

    @JsonCreator
    public PutV1WebhookSubscriptionUuidRequestBody(
            @JsonProperty("subscription_types") List<PutV1WebhookSubscriptionUuidSubscriptionTypes> subscriptionTypes) {
        Utils.checkNotNull(subscriptionTypes, "subscriptionTypes");
        this.subscriptionTypes = subscriptionTypes;
    }

    @JsonIgnore
    public List<PutV1WebhookSubscriptionUuidSubscriptionTypes> subscriptionTypes() {
        return subscriptionTypes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PutV1WebhookSubscriptionUuidRequestBody withSubscriptionTypes(List<PutV1WebhookSubscriptionUuidSubscriptionTypes> subscriptionTypes) {
        Utils.checkNotNull(subscriptionTypes, "subscriptionTypes");
        this.subscriptionTypes = subscriptionTypes;
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
        PutV1WebhookSubscriptionUuidRequestBody other = (PutV1WebhookSubscriptionUuidRequestBody) o;
        return 
            Objects.deepEquals(this.subscriptionTypes, other.subscriptionTypes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            subscriptionTypes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1WebhookSubscriptionUuidRequestBody.class,
                "subscriptionTypes", subscriptionTypes);
    }
    
    public final static class Builder {
 
        private List<PutV1WebhookSubscriptionUuidSubscriptionTypes> subscriptionTypes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder subscriptionTypes(List<PutV1WebhookSubscriptionUuidSubscriptionTypes> subscriptionTypes) {
            Utils.checkNotNull(subscriptionTypes, "subscriptionTypes");
            this.subscriptionTypes = subscriptionTypes;
            return this;
        }
        
        public PutV1WebhookSubscriptionUuidRequestBody build() {
            return new PutV1WebhookSubscriptionUuidRequestBody(
                subscriptionTypes);
        }
    }
}

