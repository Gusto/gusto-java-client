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
/**
 * Resource
 * 
 * <p>Information about the token resource.
 */

public class Resource {

    /**
     * Type of object
     */
    @JsonProperty("type")
    private String type;

    /**
     * UUID of object
     */
    @JsonProperty("uuid")
    private String uuid;

    @JsonCreator
    public Resource(
            @JsonProperty("type") String type,
            @JsonProperty("uuid") String uuid) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(uuid, "uuid");
        this.type = type;
        this.uuid = uuid;
    }

    /**
     * Type of object
     */
    @JsonIgnore
    public String type() {
        return type;
    }

    /**
     * UUID of object
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Type of object
     */
    public Resource withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * UUID of object
     */
    public Resource withUuid(String uuid) {
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
        Resource other = (Resource) o;
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
        return Utils.toString(Resource.class,
                "type", type,
                "uuid", uuid);
    }
    
    public final static class Builder {
 
        private String type;
 
        private String uuid;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Type of object
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * UUID of object
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }
        
        public Resource build() {
            return new Resource(
                type,
                uuid);
        }
    }
}

