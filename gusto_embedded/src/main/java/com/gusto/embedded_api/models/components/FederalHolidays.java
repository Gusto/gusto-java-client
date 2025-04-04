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

public class FederalHolidays {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("new_years_day")
    private Optional<? extends NewYearsDay> newYearsDay;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mlk_day")
    private Optional<? extends MlkDay> mlkDay;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("presidents_day")
    private Optional<? extends PresidentsDay> presidentsDay;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memorial_day")
    private Optional<? extends MemorialDay> memorialDay;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("juneteenth")
    private Optional<? extends Juneteenth> juneteenth;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("independence_day")
    private Optional<? extends IndependenceDay> independenceDay;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("labor_day")
    private Optional<? extends LaborDay> laborDay;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("columbus_day")
    private Optional<? extends ColumbusDay> columbusDay;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("veterans_day")
    private Optional<? extends VeteransDay> veteransDay;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thanksgiving")
    private Optional<? extends Thanksgiving> thanksgiving;

    @JsonCreator
    public FederalHolidays(
            @JsonProperty("new_years_day") Optional<? extends NewYearsDay> newYearsDay,
            @JsonProperty("mlk_day") Optional<? extends MlkDay> mlkDay,
            @JsonProperty("presidents_day") Optional<? extends PresidentsDay> presidentsDay,
            @JsonProperty("memorial_day") Optional<? extends MemorialDay> memorialDay,
            @JsonProperty("juneteenth") Optional<? extends Juneteenth> juneteenth,
            @JsonProperty("independence_day") Optional<? extends IndependenceDay> independenceDay,
            @JsonProperty("labor_day") Optional<? extends LaborDay> laborDay,
            @JsonProperty("columbus_day") Optional<? extends ColumbusDay> columbusDay,
            @JsonProperty("veterans_day") Optional<? extends VeteransDay> veteransDay,
            @JsonProperty("thanksgiving") Optional<? extends Thanksgiving> thanksgiving) {
        Utils.checkNotNull(newYearsDay, "newYearsDay");
        Utils.checkNotNull(mlkDay, "mlkDay");
        Utils.checkNotNull(presidentsDay, "presidentsDay");
        Utils.checkNotNull(memorialDay, "memorialDay");
        Utils.checkNotNull(juneteenth, "juneteenth");
        Utils.checkNotNull(independenceDay, "independenceDay");
        Utils.checkNotNull(laborDay, "laborDay");
        Utils.checkNotNull(columbusDay, "columbusDay");
        Utils.checkNotNull(veteransDay, "veteransDay");
        Utils.checkNotNull(thanksgiving, "thanksgiving");
        this.newYearsDay = newYearsDay;
        this.mlkDay = mlkDay;
        this.presidentsDay = presidentsDay;
        this.memorialDay = memorialDay;
        this.juneteenth = juneteenth;
        this.independenceDay = independenceDay;
        this.laborDay = laborDay;
        this.columbusDay = columbusDay;
        this.veteransDay = veteransDay;
        this.thanksgiving = thanksgiving;
    }
    
    public FederalHolidays() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<NewYearsDay> newYearsDay() {
        return (Optional<NewYearsDay>) newYearsDay;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MlkDay> mlkDay() {
        return (Optional<MlkDay>) mlkDay;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PresidentsDay> presidentsDay() {
        return (Optional<PresidentsDay>) presidentsDay;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MemorialDay> memorialDay() {
        return (Optional<MemorialDay>) memorialDay;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Juneteenth> juneteenth() {
        return (Optional<Juneteenth>) juneteenth;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IndependenceDay> independenceDay() {
        return (Optional<IndependenceDay>) independenceDay;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LaborDay> laborDay() {
        return (Optional<LaborDay>) laborDay;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ColumbusDay> columbusDay() {
        return (Optional<ColumbusDay>) columbusDay;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VeteransDay> veteransDay() {
        return (Optional<VeteransDay>) veteransDay;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Thanksgiving> thanksgiving() {
        return (Optional<Thanksgiving>) thanksgiving;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FederalHolidays withNewYearsDay(NewYearsDay newYearsDay) {
        Utils.checkNotNull(newYearsDay, "newYearsDay");
        this.newYearsDay = Optional.ofNullable(newYearsDay);
        return this;
    }

    public FederalHolidays withNewYearsDay(Optional<? extends NewYearsDay> newYearsDay) {
        Utils.checkNotNull(newYearsDay, "newYearsDay");
        this.newYearsDay = newYearsDay;
        return this;
    }

    public FederalHolidays withMlkDay(MlkDay mlkDay) {
        Utils.checkNotNull(mlkDay, "mlkDay");
        this.mlkDay = Optional.ofNullable(mlkDay);
        return this;
    }

    public FederalHolidays withMlkDay(Optional<? extends MlkDay> mlkDay) {
        Utils.checkNotNull(mlkDay, "mlkDay");
        this.mlkDay = mlkDay;
        return this;
    }

    public FederalHolidays withPresidentsDay(PresidentsDay presidentsDay) {
        Utils.checkNotNull(presidentsDay, "presidentsDay");
        this.presidentsDay = Optional.ofNullable(presidentsDay);
        return this;
    }

    public FederalHolidays withPresidentsDay(Optional<? extends PresidentsDay> presidentsDay) {
        Utils.checkNotNull(presidentsDay, "presidentsDay");
        this.presidentsDay = presidentsDay;
        return this;
    }

    public FederalHolidays withMemorialDay(MemorialDay memorialDay) {
        Utils.checkNotNull(memorialDay, "memorialDay");
        this.memorialDay = Optional.ofNullable(memorialDay);
        return this;
    }

    public FederalHolidays withMemorialDay(Optional<? extends MemorialDay> memorialDay) {
        Utils.checkNotNull(memorialDay, "memorialDay");
        this.memorialDay = memorialDay;
        return this;
    }

    public FederalHolidays withJuneteenth(Juneteenth juneteenth) {
        Utils.checkNotNull(juneteenth, "juneteenth");
        this.juneteenth = Optional.ofNullable(juneteenth);
        return this;
    }

    public FederalHolidays withJuneteenth(Optional<? extends Juneteenth> juneteenth) {
        Utils.checkNotNull(juneteenth, "juneteenth");
        this.juneteenth = juneteenth;
        return this;
    }

    public FederalHolidays withIndependenceDay(IndependenceDay independenceDay) {
        Utils.checkNotNull(independenceDay, "independenceDay");
        this.independenceDay = Optional.ofNullable(independenceDay);
        return this;
    }

    public FederalHolidays withIndependenceDay(Optional<? extends IndependenceDay> independenceDay) {
        Utils.checkNotNull(independenceDay, "independenceDay");
        this.independenceDay = independenceDay;
        return this;
    }

    public FederalHolidays withLaborDay(LaborDay laborDay) {
        Utils.checkNotNull(laborDay, "laborDay");
        this.laborDay = Optional.ofNullable(laborDay);
        return this;
    }

    public FederalHolidays withLaborDay(Optional<? extends LaborDay> laborDay) {
        Utils.checkNotNull(laborDay, "laborDay");
        this.laborDay = laborDay;
        return this;
    }

    public FederalHolidays withColumbusDay(ColumbusDay columbusDay) {
        Utils.checkNotNull(columbusDay, "columbusDay");
        this.columbusDay = Optional.ofNullable(columbusDay);
        return this;
    }

    public FederalHolidays withColumbusDay(Optional<? extends ColumbusDay> columbusDay) {
        Utils.checkNotNull(columbusDay, "columbusDay");
        this.columbusDay = columbusDay;
        return this;
    }

    public FederalHolidays withVeteransDay(VeteransDay veteransDay) {
        Utils.checkNotNull(veteransDay, "veteransDay");
        this.veteransDay = Optional.ofNullable(veteransDay);
        return this;
    }

    public FederalHolidays withVeteransDay(Optional<? extends VeteransDay> veteransDay) {
        Utils.checkNotNull(veteransDay, "veteransDay");
        this.veteransDay = veteransDay;
        return this;
    }

    public FederalHolidays withThanksgiving(Thanksgiving thanksgiving) {
        Utils.checkNotNull(thanksgiving, "thanksgiving");
        this.thanksgiving = Optional.ofNullable(thanksgiving);
        return this;
    }

    public FederalHolidays withThanksgiving(Optional<? extends Thanksgiving> thanksgiving) {
        Utils.checkNotNull(thanksgiving, "thanksgiving");
        this.thanksgiving = thanksgiving;
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
        FederalHolidays other = (FederalHolidays) o;
        return 
            Objects.deepEquals(this.newYearsDay, other.newYearsDay) &&
            Objects.deepEquals(this.mlkDay, other.mlkDay) &&
            Objects.deepEquals(this.presidentsDay, other.presidentsDay) &&
            Objects.deepEquals(this.memorialDay, other.memorialDay) &&
            Objects.deepEquals(this.juneteenth, other.juneteenth) &&
            Objects.deepEquals(this.independenceDay, other.independenceDay) &&
            Objects.deepEquals(this.laborDay, other.laborDay) &&
            Objects.deepEquals(this.columbusDay, other.columbusDay) &&
            Objects.deepEquals(this.veteransDay, other.veteransDay) &&
            Objects.deepEquals(this.thanksgiving, other.thanksgiving);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            newYearsDay,
            mlkDay,
            presidentsDay,
            memorialDay,
            juneteenth,
            independenceDay,
            laborDay,
            columbusDay,
            veteransDay,
            thanksgiving);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FederalHolidays.class,
                "newYearsDay", newYearsDay,
                "mlkDay", mlkDay,
                "presidentsDay", presidentsDay,
                "memorialDay", memorialDay,
                "juneteenth", juneteenth,
                "independenceDay", independenceDay,
                "laborDay", laborDay,
                "columbusDay", columbusDay,
                "veteransDay", veteransDay,
                "thanksgiving", thanksgiving);
    }
    
    public final static class Builder {
 
        private Optional<? extends NewYearsDay> newYearsDay = Optional.empty();
 
        private Optional<? extends MlkDay> mlkDay = Optional.empty();
 
        private Optional<? extends PresidentsDay> presidentsDay = Optional.empty();
 
        private Optional<? extends MemorialDay> memorialDay = Optional.empty();
 
        private Optional<? extends Juneteenth> juneteenth = Optional.empty();
 
        private Optional<? extends IndependenceDay> independenceDay = Optional.empty();
 
        private Optional<? extends LaborDay> laborDay = Optional.empty();
 
        private Optional<? extends ColumbusDay> columbusDay = Optional.empty();
 
        private Optional<? extends VeteransDay> veteransDay = Optional.empty();
 
        private Optional<? extends Thanksgiving> thanksgiving = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder newYearsDay(NewYearsDay newYearsDay) {
            Utils.checkNotNull(newYearsDay, "newYearsDay");
            this.newYearsDay = Optional.ofNullable(newYearsDay);
            return this;
        }

        public Builder newYearsDay(Optional<? extends NewYearsDay> newYearsDay) {
            Utils.checkNotNull(newYearsDay, "newYearsDay");
            this.newYearsDay = newYearsDay;
            return this;
        }

        public Builder mlkDay(MlkDay mlkDay) {
            Utils.checkNotNull(mlkDay, "mlkDay");
            this.mlkDay = Optional.ofNullable(mlkDay);
            return this;
        }

        public Builder mlkDay(Optional<? extends MlkDay> mlkDay) {
            Utils.checkNotNull(mlkDay, "mlkDay");
            this.mlkDay = mlkDay;
            return this;
        }

        public Builder presidentsDay(PresidentsDay presidentsDay) {
            Utils.checkNotNull(presidentsDay, "presidentsDay");
            this.presidentsDay = Optional.ofNullable(presidentsDay);
            return this;
        }

        public Builder presidentsDay(Optional<? extends PresidentsDay> presidentsDay) {
            Utils.checkNotNull(presidentsDay, "presidentsDay");
            this.presidentsDay = presidentsDay;
            return this;
        }

        public Builder memorialDay(MemorialDay memorialDay) {
            Utils.checkNotNull(memorialDay, "memorialDay");
            this.memorialDay = Optional.ofNullable(memorialDay);
            return this;
        }

        public Builder memorialDay(Optional<? extends MemorialDay> memorialDay) {
            Utils.checkNotNull(memorialDay, "memorialDay");
            this.memorialDay = memorialDay;
            return this;
        }

        public Builder juneteenth(Juneteenth juneteenth) {
            Utils.checkNotNull(juneteenth, "juneteenth");
            this.juneteenth = Optional.ofNullable(juneteenth);
            return this;
        }

        public Builder juneteenth(Optional<? extends Juneteenth> juneteenth) {
            Utils.checkNotNull(juneteenth, "juneteenth");
            this.juneteenth = juneteenth;
            return this;
        }

        public Builder independenceDay(IndependenceDay independenceDay) {
            Utils.checkNotNull(independenceDay, "independenceDay");
            this.independenceDay = Optional.ofNullable(independenceDay);
            return this;
        }

        public Builder independenceDay(Optional<? extends IndependenceDay> independenceDay) {
            Utils.checkNotNull(independenceDay, "independenceDay");
            this.independenceDay = independenceDay;
            return this;
        }

        public Builder laborDay(LaborDay laborDay) {
            Utils.checkNotNull(laborDay, "laborDay");
            this.laborDay = Optional.ofNullable(laborDay);
            return this;
        }

        public Builder laborDay(Optional<? extends LaborDay> laborDay) {
            Utils.checkNotNull(laborDay, "laborDay");
            this.laborDay = laborDay;
            return this;
        }

        public Builder columbusDay(ColumbusDay columbusDay) {
            Utils.checkNotNull(columbusDay, "columbusDay");
            this.columbusDay = Optional.ofNullable(columbusDay);
            return this;
        }

        public Builder columbusDay(Optional<? extends ColumbusDay> columbusDay) {
            Utils.checkNotNull(columbusDay, "columbusDay");
            this.columbusDay = columbusDay;
            return this;
        }

        public Builder veteransDay(VeteransDay veteransDay) {
            Utils.checkNotNull(veteransDay, "veteransDay");
            this.veteransDay = Optional.ofNullable(veteransDay);
            return this;
        }

        public Builder veteransDay(Optional<? extends VeteransDay> veteransDay) {
            Utils.checkNotNull(veteransDay, "veteransDay");
            this.veteransDay = veteransDay;
            return this;
        }

        public Builder thanksgiving(Thanksgiving thanksgiving) {
            Utils.checkNotNull(thanksgiving, "thanksgiving");
            this.thanksgiving = Optional.ofNullable(thanksgiving);
            return this;
        }

        public Builder thanksgiving(Optional<? extends Thanksgiving> thanksgiving) {
            Utils.checkNotNull(thanksgiving, "thanksgiving");
            this.thanksgiving = thanksgiving;
            return this;
        }
        
        public FederalHolidays build() {
            return new FederalHolidays(
                newYearsDay,
                mlkDay,
                presidentsDay,
                memorialDay,
                juneteenth,
                independenceDay,
                laborDay,
                columbusDay,
                veteransDay,
                thanksgiving);
        }
    }
}

