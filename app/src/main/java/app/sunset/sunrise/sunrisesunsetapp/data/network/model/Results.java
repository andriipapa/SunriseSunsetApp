package app.sunset.sunrise.sunrisesunsetapp.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by papaandrii on 09.03.2018.
 */

public class Results {

    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("solar_noon")
    @Expose
    private String solarNoon;
    @SerializedName("day_length")
    @Expose
    private String dayLength;
    @SerializedName("civil_twilight_begin")
    @Expose
    private String civilTwilightBegin;
    @SerializedName("civil_twilight_end")
    @Expose
    private String civilTwilightEnd;
    @SerializedName("nautical_twilight_begin")
    @Expose
    private String nauticalTwilightBegin;
    @SerializedName("nautical_twilight_end")
    @Expose
    private String nauticalTwilightEnd;
    @SerializedName("astronomical_twilight_begin")
    @Expose
    private String astronomicalTwilightBegin;
    @SerializedName("astronomical_twilight_end")
    @Expose
    private String astronomicalTwilightEnd;

    /**
     * No args constructor for use in serialization
     *
     */
    public Results() {
    }

    /**
     *
     * @param nauticalTwilightEnd
     * @param dayLength
     * @param solarNoon
     * @param astronomicalTwilightEnd
     * @param astronomicalTwilightBegin
     * @param sunset
     * @param nauticalTwilightBegin
     * @param civilTwilightBegin
     * @param sunrise
     * @param civilTwilightEnd
     */
    public Results(String sunrise, String sunset, String solarNoon, String dayLength, String civilTwilightBegin, String civilTwilightEnd, String nauticalTwilightBegin, String nauticalTwilightEnd, String astronomicalTwilightBegin, String astronomicalTwilightEnd) {
        super();
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.solarNoon = solarNoon;
        this.dayLength = dayLength;
        this.civilTwilightBegin = civilTwilightBegin;
        this.civilTwilightEnd = civilTwilightEnd;
        this.nauticalTwilightBegin = nauticalTwilightBegin;
        this.nauticalTwilightEnd = nauticalTwilightEnd;
        this.astronomicalTwilightBegin = astronomicalTwilightBegin;
        this.astronomicalTwilightEnd = astronomicalTwilightEnd;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Results withSunrise(String sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Results withSunset(String sunset) {
        this.sunset = sunset;
        return this;
    }

    public String getSolarNoon() {
        return solarNoon;
    }

    public void setSolarNoon(String solarNoon) {
        this.solarNoon = solarNoon;
    }

    public Results withSolarNoon(String solarNoon) {
        this.solarNoon = solarNoon;
        return this;
    }

    public String getDayLength() {
        return dayLength;
    }

    public void setDayLength(String dayLength) {
        this.dayLength = dayLength;
    }

    public Results withDayLength(String dayLength) {
        this.dayLength = dayLength;
        return this;
    }

    public String getCivilTwilightBegin() {
        return civilTwilightBegin;
    }

    public void setCivilTwilightBegin(String civilTwilightBegin) {
        this.civilTwilightBegin = civilTwilightBegin;
    }

    public Results withCivilTwilightBegin(String civilTwilightBegin) {
        this.civilTwilightBegin = civilTwilightBegin;
        return this;
    }

    public String getCivilTwilightEnd() {
        return civilTwilightEnd;
    }

    public void setCivilTwilightEnd(String civilTwilightEnd) {
        this.civilTwilightEnd = civilTwilightEnd;
    }

    public Results withCivilTwilightEnd(String civilTwilightEnd) {
        this.civilTwilightEnd = civilTwilightEnd;
        return this;
    }

    public String getNauticalTwilightBegin() {
        return nauticalTwilightBegin;
    }

    public void setNauticalTwilightBegin(String nauticalTwilightBegin) {
        this.nauticalTwilightBegin = nauticalTwilightBegin;
    }

    public Results withNauticalTwilightBegin(String nauticalTwilightBegin) {
        this.nauticalTwilightBegin = nauticalTwilightBegin;
        return this;
    }

    public String getNauticalTwilightEnd() {
        return nauticalTwilightEnd;
    }

    public void setNauticalTwilightEnd(String nauticalTwilightEnd) {
        this.nauticalTwilightEnd = nauticalTwilightEnd;
    }

    public Results withNauticalTwilightEnd(String nauticalTwilightEnd) {
        this.nauticalTwilightEnd = nauticalTwilightEnd;
        return this;
    }

    public String getAstronomicalTwilightBegin() {
        return astronomicalTwilightBegin;
    }

    public void setAstronomicalTwilightBegin(String astronomicalTwilightBegin) {
        this.astronomicalTwilightBegin = astronomicalTwilightBegin;
    }

    public Results withAstronomicalTwilightBegin(String astronomicalTwilightBegin) {
        this.astronomicalTwilightBegin = astronomicalTwilightBegin;
        return this;
    }

    public String getAstronomicalTwilightEnd() {
        return astronomicalTwilightEnd;
    }

    public void setAstronomicalTwilightEnd(String astronomicalTwilightEnd) {
        this.astronomicalTwilightEnd = astronomicalTwilightEnd;
    }

    public Results withAstronomicalTwilightEnd(String astronomicalTwilightEnd) {
        this.astronomicalTwilightEnd = astronomicalTwilightEnd;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sunrise", sunrise).append("sunset", sunset).append("solarNoon", solarNoon).append("dayLength", dayLength).append("civilTwilightBegin", civilTwilightBegin).append("civilTwilightEnd", civilTwilightEnd).append("nauticalTwilightBegin", nauticalTwilightBegin).append("nauticalTwilightEnd", nauticalTwilightEnd).append("astronomicalTwilightBegin", astronomicalTwilightBegin).append("astronomicalTwilightEnd", astronomicalTwilightEnd).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nauticalTwilightEnd).append(dayLength).append(solarNoon).append(astronomicalTwilightEnd).append(astronomicalTwilightBegin).append(sunset).append(nauticalTwilightBegin).append(civilTwilightBegin).append(sunrise).append(civilTwilightEnd).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Results) == false) {
            return false;
        }
        Results rhs = ((Results) other);
        return new EqualsBuilder().append(nauticalTwilightEnd, rhs.nauticalTwilightEnd).append(dayLength, rhs.dayLength).append(solarNoon, rhs.solarNoon).append(astronomicalTwilightEnd, rhs.astronomicalTwilightEnd).append(astronomicalTwilightBegin, rhs.astronomicalTwilightBegin).append(sunset, rhs.sunset).append(nauticalTwilightBegin, rhs.nauticalTwilightBegin).append(civilTwilightBegin, rhs.civilTwilightBegin).append(sunrise, rhs.sunrise).append(civilTwilightEnd, rhs.civilTwilightEnd).isEquals();
    }

}
