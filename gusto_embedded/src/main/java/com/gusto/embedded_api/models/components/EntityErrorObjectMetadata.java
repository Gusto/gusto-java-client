/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
/**
 * EntityErrorObjectMetadata - Contains relevant data to identify the resource in question when applicable. For example, to identify an entity `entity_type` and `entity_uuid` will be provided.
 */

public class EntityErrorObjectMetadata {

    @JsonCreator
    public EntityErrorObjectMetadata() {
        
        
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(EntityErrorObjectMetadata.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public EntityErrorObjectMetadata build() {
            return new EntityErrorObjectMetadata(
                );
        }
    }
}

