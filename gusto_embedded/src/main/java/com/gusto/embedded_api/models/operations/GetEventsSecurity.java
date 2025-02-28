/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class GetEventsSecurity {

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    private String systemAccessAuth;

    @JsonCreator
    public GetEventsSecurity(
            String systemAccessAuth) {
        Utils.checkNotNull(systemAccessAuth, "systemAccessAuth");
        this.systemAccessAuth = systemAccessAuth;
    }

    @JsonIgnore
    public String systemAccessAuth() {
        return systemAccessAuth;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetEventsSecurity withSystemAccessAuth(String systemAccessAuth) {
        Utils.checkNotNull(systemAccessAuth, "systemAccessAuth");
        this.systemAccessAuth = systemAccessAuth;
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
        GetEventsSecurity other = (GetEventsSecurity) o;
        return 
            Objects.deepEquals(this.systemAccessAuth, other.systemAccessAuth);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            systemAccessAuth);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetEventsSecurity.class,
                "systemAccessAuth", systemAccessAuth);
    }
    
    public final static class Builder {
 
        private String systemAccessAuth;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder systemAccessAuth(String systemAccessAuth) {
            Utils.checkNotNull(systemAccessAuth, "systemAccessAuth");
            this.systemAccessAuth = systemAccessAuth;
            return this;
        }
        
        public GetEventsSecurity build() {
            return new GetEventsSecurity(
                systemAccessAuth);
        }
    }
}

