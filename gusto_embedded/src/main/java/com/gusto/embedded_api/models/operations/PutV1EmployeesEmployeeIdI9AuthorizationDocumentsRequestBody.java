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

public class PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody {

    /**
     * An array of I-9 verification documents
     */
    @JsonProperty("documents")
    private List<Documents> documents;

    @JsonCreator
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody(
            @JsonProperty("documents") List<Documents> documents) {
        Utils.checkNotNull(documents, "documents");
        this.documents = documents;
    }

    /**
     * An array of I-9 verification documents
     */
    @JsonIgnore
    public List<Documents> documents() {
        return documents;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An array of I-9 verification documents
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody withDocuments(List<Documents> documents) {
        Utils.checkNotNull(documents, "documents");
        this.documents = documents;
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
        PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody other = (PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody) o;
        return 
            Objects.deepEquals(this.documents, other.documents);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            documents);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody.class,
                "documents", documents);
    }
    
    public final static class Builder {
 
        private List<Documents> documents;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An array of I-9 verification documents
         */
        public Builder documents(List<Documents> documents) {
            Utils.checkNotNull(documents, "documents");
            this.documents = documents;
            return this;
        }
        
        public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody build() {
            return new PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody(
                documents);
        }
    }
}

