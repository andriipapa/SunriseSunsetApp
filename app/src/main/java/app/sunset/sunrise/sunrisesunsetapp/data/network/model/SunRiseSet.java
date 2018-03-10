package app.sunset.sunrise.sunrisesunsetapp.data.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by papaandrii on 09.03.2018.
 */

public class SunRiseSet {

    @SerializedName("results")
    @Expose
    private Results results;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     *
     */
    public SunRiseSet() {
    }

    /**
     *
     * @param results
     * @param status
     */
    public SunRiseSet(Results results, String status) {
        super();
        this.results = results;
        this.status = status;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    public SunRiseSet withResults(Results results) {
        this.results = results;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SunRiseSet withStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("results", results).append("status", status).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(results).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SunRiseSet) == false) {
            return false;
        }
        SunRiseSet rhs = ((SunRiseSet) other);
        return new EqualsBuilder().append(results, rhs.results).append(status, rhs.status).isEquals();
    }

}
