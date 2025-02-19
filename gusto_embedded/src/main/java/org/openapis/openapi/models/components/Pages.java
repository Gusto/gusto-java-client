/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;


public class Pages {

    /**
     * Image URL for the page
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_url")
    private Optional<String> imageUrl;

    /**
     * Page number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("page_number")
    private Optional<Long> pageNumber;

    @JsonCreator
    public Pages(
            @JsonProperty("image_url") Optional<String> imageUrl,
            @JsonProperty("page_number") Optional<Long> pageNumber) {
        Utils.checkNotNull(imageUrl, "imageUrl");
        Utils.checkNotNull(pageNumber, "pageNumber");
        this.imageUrl = imageUrl;
        this.pageNumber = pageNumber;
    }
    
    public Pages() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Image URL for the page
     */
    @JsonIgnore
    public Optional<String> imageUrl() {
        return imageUrl;
    }

    /**
     * Page number
     */
    @JsonIgnore
    public Optional<Long> pageNumber() {
        return pageNumber;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Image URL for the page
     */
    public Pages withImageUrl(String imageUrl) {
        Utils.checkNotNull(imageUrl, "imageUrl");
        this.imageUrl = Optional.ofNullable(imageUrl);
        return this;
    }

    /**
     * Image URL for the page
     */
    public Pages withImageUrl(Optional<String> imageUrl) {
        Utils.checkNotNull(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Page number
     */
    public Pages withPageNumber(long pageNumber) {
        Utils.checkNotNull(pageNumber, "pageNumber");
        this.pageNumber = Optional.ofNullable(pageNumber);
        return this;
    }

    /**
     * Page number
     */
    public Pages withPageNumber(Optional<Long> pageNumber) {
        Utils.checkNotNull(pageNumber, "pageNumber");
        this.pageNumber = pageNumber;
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
        Pages other = (Pages) o;
        return 
            Objects.deepEquals(this.imageUrl, other.imageUrl) &&
            Objects.deepEquals(this.pageNumber, other.pageNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            imageUrl,
            pageNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Pages.class,
                "imageUrl", imageUrl,
                "pageNumber", pageNumber);
    }
    
    public final static class Builder {
 
        private Optional<String> imageUrl = Optional.empty();
 
        private Optional<Long> pageNumber = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Image URL for the page
         */
        public Builder imageUrl(String imageUrl) {
            Utils.checkNotNull(imageUrl, "imageUrl");
            this.imageUrl = Optional.ofNullable(imageUrl);
            return this;
        }

        /**
         * Image URL for the page
         */
        public Builder imageUrl(Optional<String> imageUrl) {
            Utils.checkNotNull(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Page number
         */
        public Builder pageNumber(long pageNumber) {
            Utils.checkNotNull(pageNumber, "pageNumber");
            this.pageNumber = Optional.ofNullable(pageNumber);
            return this;
        }

        /**
         * Page number
         */
        public Builder pageNumber(Optional<Long> pageNumber) {
            Utils.checkNotNull(pageNumber, "pageNumber");
            this.pageNumber = pageNumber;
            return this;
        }
        
        public Pages build() {
            return new Pages(
                imageUrl,
                pageNumber);
        }
    }
}

