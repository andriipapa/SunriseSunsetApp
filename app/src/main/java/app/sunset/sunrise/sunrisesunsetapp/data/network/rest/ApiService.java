package app.sunset.sunrise.sunrisesunsetapp.data.network.rest;

import app.sunset.sunrise.sunrisesunsetapp.data.network.model.SunRiseSet;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by papaandrii on 10.03.2018.
 */

public interface ApiService {

    @GET("/json")
    Single<SunRiseSet> getSunRiseSetApiCall(@Query("lat") double lat,
                                            @Query("lng") double lng);

}
