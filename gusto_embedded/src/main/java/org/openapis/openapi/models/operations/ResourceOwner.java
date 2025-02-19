/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapis.openapi.utils.Utils;

/**
 * ResourceOwner - Information about the token owner
 */

public class ResourceOwner {

    @JsonProperty("type")
    private GetV1TokenInfoType type;

    /**
     * UUID of resource owner
     */
    @JsonProperty("uuid")
    private String uuid;

    @JsonCreator
    public ResourceOwner(
            @JsonProperty("type") GetV1TokenInfoType type,
            @JsonProperty("uuid") String uuid) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(uuid, "uuid");
        this.type = type;
        this.uuid = uuid;
    }

    @JsonIgnore
    public GetV1TokenInfoType type() {
        return type;
    }

    /**
     * UUID of resource owner
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ResourceOwner withType(GetV1TokenInfoType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * UUID of resource owner
     */
    public ResourceOwner withUuid(String uuid) {
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
        ResourceOwner other = (ResourceOwner) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.uuid, other.uuid);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            uuid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ResourceOwner.class,
                "type", type,
                "uuid", uuid);
    }
    
    public final static class Builder {
 
        private GetV1TokenInfoType type;
 
        private String uuid;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(GetV1TokenInfoType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * UUID of resource owner
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }
        
        public ResourceOwner build() {
            return new ResourceOwner(
                type,
                uuid);
        }
    }
}

