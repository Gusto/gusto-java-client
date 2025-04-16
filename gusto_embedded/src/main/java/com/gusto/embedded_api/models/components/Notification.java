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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
/**
 * Notification
 * 
 * <p>Representation of a notification
 */

public class Notification {

    /**
     * Unique identifier of a notification.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Unique identifier of the company to which the notification belongs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_uuid")
    private Optional<String> companyUuid;

    /**
     * The title of the notification. This highlights the actionable component of the notification.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    /**
     * The message of the notification. This provides additional context for the user and recommends a specific action to resolve the notification.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<String> message;

    /**
     * The notification's category.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("category")
    private Optional<String> category;

    /**
     * Indicates whether a notification requires action or not. If false, the notification provides critical information only.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("actionable")
    private Optional<Boolean> actionable;

    /**
     * Indicates whether a notification may block ability to run payroll. If true, we suggest that these notifications are prioritized to your end users.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_block_payroll")
    private Optional<Boolean> canBlockPayroll;

    /**
     * Timestamp of when the notification was published.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("published_at")
    private Optional<String> publishedAt;

    /**
     * Timestamp of when the notification is due. If the notification has no due date, this field will be null.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("due_at")
    private Optional<String> dueAt;

    /**
     * An array of entities relevant to the notification
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resources")
    private Optional<? extends List<Resources>> resources;

    @JsonCreator
    public Notification(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("company_uuid") Optional<String> companyUuid,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("message") Optional<String> message,
            @JsonProperty("category") Optional<String> category,
            @JsonProperty("actionable") Optional<Boolean> actionable,
            @JsonProperty("can_block_payroll") Optional<Boolean> canBlockPayroll,
            @JsonProperty("published_at") Optional<String> publishedAt,
            @JsonProperty("due_at") Optional<String> dueAt,
            @JsonProperty("resources") Optional<? extends List<Resources>> resources) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(category, "category");
        Utils.checkNotNull(actionable, "actionable");
        Utils.checkNotNull(canBlockPayroll, "canBlockPayroll");
        Utils.checkNotNull(publishedAt, "publishedAt");
        Utils.checkNotNull(dueAt, "dueAt");
        Utils.checkNotNull(resources, "resources");
        this.uuid = uuid;
        this.companyUuid = companyUuid;
        this.title = title;
        this.message = message;
        this.category = category;
        this.actionable = actionable;
        this.canBlockPayroll = canBlockPayroll;
        this.publishedAt = publishedAt;
        this.dueAt = dueAt;
        this.resources = resources;
    }
    
    public Notification(
            String uuid) {
        this(uuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier of a notification.
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * Unique identifier of the company to which the notification belongs.
     */
    @JsonIgnore
    public Optional<String> companyUuid() {
        return companyUuid;
    }

    /**
     * The title of the notification. This highlights the actionable component of the notification.
     */
    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    /**
     * The message of the notification. This provides additional context for the user and recommends a specific action to resolve the notification.
     */
    @JsonIgnore
    public Optional<String> message() {
        return message;
    }

    /**
     * The notification's category.
     */
    @JsonIgnore
    public Optional<String> category() {
        return category;
    }

    /**
     * Indicates whether a notification requires action or not. If false, the notification provides critical information only.
     */
    @JsonIgnore
    public Optional<Boolean> actionable() {
        return actionable;
    }

    /**
     * Indicates whether a notification may block ability to run payroll. If true, we suggest that these notifications are prioritized to your end users.
     */
    @JsonIgnore
    public Optional<Boolean> canBlockPayroll() {
        return canBlockPayroll;
    }

    /**
     * Timestamp of when the notification was published.
     */
    @JsonIgnore
    public Optional<String> publishedAt() {
        return publishedAt;
    }

    /**
     * Timestamp of when the notification is due. If the notification has no due date, this field will be null.
     */
    @JsonIgnore
    public Optional<String> dueAt() {
        return dueAt;
    }

    /**
     * An array of entities relevant to the notification
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Resources>> resources() {
        return (Optional<List<Resources>>) resources;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier of a notification.
     */
    public Notification withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * Unique identifier of the company to which the notification belongs.
     */
    public Notification withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = Optional.ofNullable(companyUuid);
        return this;
    }

    /**
     * Unique identifier of the company to which the notification belongs.
     */
    public Notification withCompanyUuid(Optional<String> companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * The title of the notification. This highlights the actionable component of the notification.
     */
    public Notification withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * The title of the notification. This highlights the actionable component of the notification.
     */
    public Notification withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * The message of the notification. This provides additional context for the user and recommends a specific action to resolve the notification.
     */
    public Notification withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * The message of the notification. This provides additional context for the user and recommends a specific action to resolve the notification.
     */
    public Notification withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * The notification's category.
     */
    public Notification withCategory(String category) {
        Utils.checkNotNull(category, "category");
        this.category = Optional.ofNullable(category);
        return this;
    }

    /**
     * The notification's category.
     */
    public Notification withCategory(Optional<String> category) {
        Utils.checkNotNull(category, "category");
        this.category = category;
        return this;
    }

    /**
     * Indicates whether a notification requires action or not. If false, the notification provides critical information only.
     */
    public Notification withActionable(boolean actionable) {
        Utils.checkNotNull(actionable, "actionable");
        this.actionable = Optional.ofNullable(actionable);
        return this;
    }

    /**
     * Indicates whether a notification requires action or not. If false, the notification provides critical information only.
     */
    public Notification withActionable(Optional<Boolean> actionable) {
        Utils.checkNotNull(actionable, "actionable");
        this.actionable = actionable;
        return this;
    }

    /**
     * Indicates whether a notification may block ability to run payroll. If true, we suggest that these notifications are prioritized to your end users.
     */
    public Notification withCanBlockPayroll(boolean canBlockPayroll) {
        Utils.checkNotNull(canBlockPayroll, "canBlockPayroll");
        this.canBlockPayroll = Optional.ofNullable(canBlockPayroll);
        return this;
    }

    /**
     * Indicates whether a notification may block ability to run payroll. If true, we suggest that these notifications are prioritized to your end users.
     */
    public Notification withCanBlockPayroll(Optional<Boolean> canBlockPayroll) {
        Utils.checkNotNull(canBlockPayroll, "canBlockPayroll");
        this.canBlockPayroll = canBlockPayroll;
        return this;
    }

    /**
     * Timestamp of when the notification was published.
     */
    public Notification withPublishedAt(String publishedAt) {
        Utils.checkNotNull(publishedAt, "publishedAt");
        this.publishedAt = Optional.ofNullable(publishedAt);
        return this;
    }

    /**
     * Timestamp of when the notification was published.
     */
    public Notification withPublishedAt(Optional<String> publishedAt) {
        Utils.checkNotNull(publishedAt, "publishedAt");
        this.publishedAt = publishedAt;
        return this;
    }

    /**
     * Timestamp of when the notification is due. If the notification has no due date, this field will be null.
     */
    public Notification withDueAt(String dueAt) {
        Utils.checkNotNull(dueAt, "dueAt");
        this.dueAt = Optional.ofNullable(dueAt);
        return this;
    }

    /**
     * Timestamp of when the notification is due. If the notification has no due date, this field will be null.
     */
    public Notification withDueAt(Optional<String> dueAt) {
        Utils.checkNotNull(dueAt, "dueAt");
        this.dueAt = dueAt;
        return this;
    }

    /**
     * An array of entities relevant to the notification
     */
    public Notification withResources(List<Resources> resources) {
        Utils.checkNotNull(resources, "resources");
        this.resources = Optional.ofNullable(resources);
        return this;
    }

    /**
     * An array of entities relevant to the notification
     */
    public Notification withResources(Optional<? extends List<Resources>> resources) {
        Utils.checkNotNull(resources, "resources");
        this.resources = resources;
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
        Notification other = (Notification) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.message, other.message) &&
            Objects.deepEquals(this.category, other.category) &&
            Objects.deepEquals(this.actionable, other.actionable) &&
            Objects.deepEquals(this.canBlockPayroll, other.canBlockPayroll) &&
            Objects.deepEquals(this.publishedAt, other.publishedAt) &&
            Objects.deepEquals(this.dueAt, other.dueAt) &&
            Objects.deepEquals(this.resources, other.resources);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            companyUuid,
            title,
            message,
            category,
            actionable,
            canBlockPayroll,
            publishedAt,
            dueAt,
            resources);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Notification.class,
                "uuid", uuid,
                "companyUuid", companyUuid,
                "title", title,
                "message", message,
                "category", category,
                "actionable", actionable,
                "canBlockPayroll", canBlockPayroll,
                "publishedAt", publishedAt,
                "dueAt", dueAt,
                "resources", resources);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<String> companyUuid = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> message = Optional.empty();
 
        private Optional<String> category = Optional.empty();
 
        private Optional<Boolean> actionable = Optional.empty();
 
        private Optional<Boolean> canBlockPayroll = Optional.empty();
 
        private Optional<String> publishedAt = Optional.empty();
 
        private Optional<String> dueAt = Optional.empty();
 
        private Optional<? extends List<Resources>> resources = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier of a notification.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * Unique identifier of the company to which the notification belongs.
         */
        public Builder companyUuid(String companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = Optional.ofNullable(companyUuid);
            return this;
        }

        /**
         * Unique identifier of the company to which the notification belongs.
         */
        public Builder companyUuid(Optional<String> companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = companyUuid;
            return this;
        }

        /**
         * The title of the notification. This highlights the actionable component of the notification.
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        /**
         * The title of the notification. This highlights the actionable component of the notification.
         */
        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * The message of the notification. This provides additional context for the user and recommends a specific action to resolve the notification.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        /**
         * The message of the notification. This provides additional context for the user and recommends a specific action to resolve the notification.
         */
        public Builder message(Optional<String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * The notification's category.
         */
        public Builder category(String category) {
            Utils.checkNotNull(category, "category");
            this.category = Optional.ofNullable(category);
            return this;
        }

        /**
         * The notification's category.
         */
        public Builder category(Optional<String> category) {
            Utils.checkNotNull(category, "category");
            this.category = category;
            return this;
        }

        /**
         * Indicates whether a notification requires action or not. If false, the notification provides critical information only.
         */
        public Builder actionable(boolean actionable) {
            Utils.checkNotNull(actionable, "actionable");
            this.actionable = Optional.ofNullable(actionable);
            return this;
        }

        /**
         * Indicates whether a notification requires action or not. If false, the notification provides critical information only.
         */
        public Builder actionable(Optional<Boolean> actionable) {
            Utils.checkNotNull(actionable, "actionable");
            this.actionable = actionable;
            return this;
        }

        /**
         * Indicates whether a notification may block ability to run payroll. If true, we suggest that these notifications are prioritized to your end users.
         */
        public Builder canBlockPayroll(boolean canBlockPayroll) {
            Utils.checkNotNull(canBlockPayroll, "canBlockPayroll");
            this.canBlockPayroll = Optional.ofNullable(canBlockPayroll);
            return this;
        }

        /**
         * Indicates whether a notification may block ability to run payroll. If true, we suggest that these notifications are prioritized to your end users.
         */
        public Builder canBlockPayroll(Optional<Boolean> canBlockPayroll) {
            Utils.checkNotNull(canBlockPayroll, "canBlockPayroll");
            this.canBlockPayroll = canBlockPayroll;
            return this;
        }

        /**
         * Timestamp of when the notification was published.
         */
        public Builder publishedAt(String publishedAt) {
            Utils.checkNotNull(publishedAt, "publishedAt");
            this.publishedAt = Optional.ofNullable(publishedAt);
            return this;
        }

        /**
         * Timestamp of when the notification was published.
         */
        public Builder publishedAt(Optional<String> publishedAt) {
            Utils.checkNotNull(publishedAt, "publishedAt");
            this.publishedAt = publishedAt;
            return this;
        }

        /**
         * Timestamp of when the notification is due. If the notification has no due date, this field will be null.
         */
        public Builder dueAt(String dueAt) {
            Utils.checkNotNull(dueAt, "dueAt");
            this.dueAt = Optional.ofNullable(dueAt);
            return this;
        }

        /**
         * Timestamp of when the notification is due. If the notification has no due date, this field will be null.
         */
        public Builder dueAt(Optional<String> dueAt) {
            Utils.checkNotNull(dueAt, "dueAt");
            this.dueAt = dueAt;
            return this;
        }

        /**
         * An array of entities relevant to the notification
         */
        public Builder resources(List<Resources> resources) {
            Utils.checkNotNull(resources, "resources");
            this.resources = Optional.ofNullable(resources);
            return this;
        }

        /**
         * An array of entities relevant to the notification
         */
        public Builder resources(Optional<? extends List<Resources>> resources) {
            Utils.checkNotNull(resources, "resources");
            this.resources = resources;
            return this;
        }
        
        public Notification build() {
            return new Notification(
                uuid,
                companyUuid,
                title,
                message,
                category,
                actionable,
                canBlockPayroll,
                publishedAt,
                dueAt,
                resources);
        }
    }
}

