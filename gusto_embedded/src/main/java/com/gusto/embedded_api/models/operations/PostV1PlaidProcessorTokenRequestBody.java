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
import java.util.Objects;

public class PostV1PlaidProcessorTokenRequestBody {

    /**
     * The owner type of the bank account
     */
    @JsonProperty("owner_type")
    private OwnerType ownerType;

    /**
     * The owner UUID of the bank account
     */
    @JsonProperty("owner_id")
    private String ownerId;

    /**
     * The Plaid processor token
     */
    @JsonProperty("processor_token")
    private String processorToken;

    @JsonCreator
    public PostV1PlaidProcessorTokenRequestBody(
            @JsonProperty("owner_type") OwnerType ownerType,
            @JsonProperty("owner_id") String ownerId,
            @JsonProperty("processor_token") String processorToken) {
        Utils.checkNotNull(ownerType, "ownerType");
        Utils.checkNotNull(ownerId, "ownerId");
        Utils.checkNotNull(processorToken, "processorToken");
        this.ownerType = ownerType;
        this.ownerId = ownerId;
        this.processorToken = processorToken;
    }

    /**
     * The owner type of the bank account
     */
    @JsonIgnore
    public OwnerType ownerType() {
        return ownerType;
    }

    /**
     * The owner UUID of the bank account
     */
    @JsonIgnore
    public String ownerId() {
        return ownerId;
    }

    /**
     * The Plaid processor token
     */
    @JsonIgnore
    public String processorToken() {
        return processorToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The owner type of the bank account
     */
    public PostV1PlaidProcessorTokenRequestBody withOwnerType(OwnerType ownerType) {
        Utils.checkNotNull(ownerType, "ownerType");
        this.ownerType = ownerType;
        return this;
    }

    /**
     * The owner UUID of the bank account
     */
    public PostV1PlaidProcessorTokenRequestBody withOwnerId(String ownerId) {
        Utils.checkNotNull(ownerId, "ownerId");
        this.ownerId = ownerId;
        return this;
    }

    /**
     * The Plaid processor token
     */
    public PostV1PlaidProcessorTokenRequestBody withProcessorToken(String processorToken) {
        Utils.checkNotNull(processorToken, "processorToken");
        this.processorToken = processorToken;
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
        PostV1PlaidProcessorTokenRequestBody other = (PostV1PlaidProcessorTokenRequestBody) o;
        return 
            Objects.deepEquals(this.ownerType, other.ownerType) &&
            Objects.deepEquals(this.ownerId, other.ownerId) &&
            Objects.deepEquals(this.processorToken, other.processorToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ownerType,
            ownerId,
            processorToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1PlaidProcessorTokenRequestBody.class,
                "ownerType", ownerType,
                "ownerId", ownerId,
                "processorToken", processorToken);
    }
    
    public final static class Builder {
 
        private OwnerType ownerType;
 
        private String ownerId;
 
        private String processorToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The owner type of the bank account
         */
        public Builder ownerType(OwnerType ownerType) {
            Utils.checkNotNull(ownerType, "ownerType");
            this.ownerType = ownerType;
            return this;
        }

        /**
         * The owner UUID of the bank account
         */
        public Builder ownerId(String ownerId) {
            Utils.checkNotNull(ownerId, "ownerId");
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The Plaid processor token
         */
        public Builder processorToken(String processorToken) {
            Utils.checkNotNull(processorToken, "processorToken");
            this.processorToken = processorToken;
            return this;
        }
        
        public PostV1PlaidProcessorTokenRequestBody build() {
            return new PostV1PlaidProcessorTokenRequestBody(
                ownerType,
                ownerId,
                processorToken);
        }
    }
}

