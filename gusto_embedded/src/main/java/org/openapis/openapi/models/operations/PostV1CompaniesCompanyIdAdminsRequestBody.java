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


public class PostV1CompaniesCompanyIdAdminsRequestBody {

    /**
     * The first name of the admin.
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * The last name of the admin.
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * The email of the admin for Gusto's system. If the email matches an existing user, this will create an admin account for them.
     */
    @JsonProperty("email")
    private String email;

    @JsonCreator
    public PostV1CompaniesCompanyIdAdminsRequestBody(
            @JsonProperty("first_name") String firstName,
            @JsonProperty("last_name") String lastName,
            @JsonProperty("email") String email) {
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(email, "email");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * The first name of the admin.
     */
    @JsonIgnore
    public String firstName() {
        return firstName;
    }

    /**
     * The last name of the admin.
     */
    @JsonIgnore
    public String lastName() {
        return lastName;
    }

    /**
     * The email of the admin for Gusto's system. If the email matches an existing user, this will create an admin account for them.
     */
    @JsonIgnore
    public String email() {
        return email;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The first name of the admin.
     */
    public PostV1CompaniesCompanyIdAdminsRequestBody withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * The last name of the admin.
     */
    public PostV1CompaniesCompanyIdAdminsRequestBody withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * The email of the admin for Gusto's system. If the email matches an existing user, this will create an admin account for them.
     */
    public PostV1CompaniesCompanyIdAdminsRequestBody withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
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
        PostV1CompaniesCompanyIdAdminsRequestBody other = (PostV1CompaniesCompanyIdAdminsRequestBody) o;
        return 
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            firstName,
            lastName,
            email);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1CompaniesCompanyIdAdminsRequestBody.class,
                "firstName", firstName,
                "lastName", lastName,
                "email", email);
    }
    
    public final static class Builder {
 
        private String firstName;
 
        private String lastName;
 
        private String email;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The first name of the admin.
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * The last name of the admin.
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * The email of the admin for Gusto's system. If the email matches an existing user, this will create an admin account for them.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }
        
        public PostV1CompaniesCompanyIdAdminsRequestBody build() {
            return new PostV1CompaniesCompanyIdAdminsRequestBody(
                firstName,
                lastName,
                email);
        }
    }
}

