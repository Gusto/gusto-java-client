/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
/**
 * CompanyAttachment
 * 
 * <p>The company attachment
 */

public class CompanyAttachment {

    /**
     * UUID of the company attachment
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    private Optional<String> uuid;

    /**
     * name of the file uploaded
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * The category of the company attachment
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("category")
    private Optional<? extends Category> category;

    /**
     * The ISO 8601 timestamp of when an attachment was uploaded
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("upload_time")
    private Optional<String> uploadTime;

    @JsonCreator
    public CompanyAttachment(
            @JsonProperty("uuid") Optional<String> uuid,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("category") Optional<? extends Category> category,
            @JsonProperty("upload_time") Optional<String> uploadTime) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(category, "category");
        Utils.checkNotNull(uploadTime, "uploadTime");
        this.uuid = uuid;
        this.name = name;
        this.category = category;
        this.uploadTime = uploadTime;
    }
    
    public CompanyAttachment() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * UUID of the company attachment
     */
    @JsonIgnore
    public Optional<String> uuid() {
        return uuid;
    }

    /**
     * name of the file uploaded
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * The category of the company attachment
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Category> category() {
        return (Optional<Category>) category;
    }

    /**
     * The ISO 8601 timestamp of when an attachment was uploaded
     */
    @JsonIgnore
    public Optional<String> uploadTime() {
        return uploadTime;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * UUID of the company attachment
     */
    public CompanyAttachment withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = Optional.ofNullable(uuid);
        return this;
    }

    /**
     * UUID of the company attachment
     */
    public CompanyAttachment withUuid(Optional<String> uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * name of the file uploaded
     */
    public CompanyAttachment withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * name of the file uploaded
     */
    public CompanyAttachment withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The category of the company attachment
     */
    public CompanyAttachment withCategory(Category category) {
        Utils.checkNotNull(category, "category");
        this.category = Optional.ofNullable(category);
        return this;
    }

    /**
     * The category of the company attachment
     */
    public CompanyAttachment withCategory(Optional<? extends Category> category) {
        Utils.checkNotNull(category, "category");
        this.category = category;
        return this;
    }

    /**
     * The ISO 8601 timestamp of when an attachment was uploaded
     */
    public CompanyAttachment withUploadTime(String uploadTime) {
        Utils.checkNotNull(uploadTime, "uploadTime");
        this.uploadTime = Optional.ofNullable(uploadTime);
        return this;
    }

    /**
     * The ISO 8601 timestamp of when an attachment was uploaded
     */
    public CompanyAttachment withUploadTime(Optional<String> uploadTime) {
        Utils.checkNotNull(uploadTime, "uploadTime");
        this.uploadTime = uploadTime;
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
        CompanyAttachment other = (CompanyAttachment) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.category, other.category) &&
            Objects.deepEquals(this.uploadTime, other.uploadTime);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            name,
            category,
            uploadTime);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyAttachment.class,
                "uuid", uuid,
                "name", name,
                "category", category,
                "uploadTime", uploadTime);
    }
    
    public final static class Builder {
 
        private Optional<String> uuid = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends Category> category = Optional.empty();
 
        private Optional<String> uploadTime = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * UUID of the company attachment
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = Optional.ofNullable(uuid);
            return this;
        }

        /**
         * UUID of the company attachment
         */
        public Builder uuid(Optional<String> uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * name of the file uploaded
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * name of the file uploaded
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The category of the company attachment
         */
        public Builder category(Category category) {
            Utils.checkNotNull(category, "category");
            this.category = Optional.ofNullable(category);
            return this;
        }

        /**
         * The category of the company attachment
         */
        public Builder category(Optional<? extends Category> category) {
            Utils.checkNotNull(category, "category");
            this.category = category;
            return this;
        }

        /**
         * The ISO 8601 timestamp of when an attachment was uploaded
         */
        public Builder uploadTime(String uploadTime) {
            Utils.checkNotNull(uploadTime, "uploadTime");
            this.uploadTime = Optional.ofNullable(uploadTime);
            return this;
        }

        /**
         * The ISO 8601 timestamp of when an attachment was uploaded
         */
        public Builder uploadTime(Optional<String> uploadTime) {
            Utils.checkNotNull(uploadTime, "uploadTime");
            this.uploadTime = uploadTime;
            return this;
        }
        
        public CompanyAttachment build() {
            return new CompanyAttachment(
                uuid,
                name,
                category,
                uploadTime);
        }
    }
}

