package app.sunset.sunrise.sunrisesunsetapp.data.network;

import app.sunset.sunrise.sunrisesunsetapp.data.network.model.SunRiseSet;
import io.reactivex.Single;

/**
 * Created by papaandrii on 09.03.2018.
 */

public interface ApiHelper {

    Single<SunRiseSet> getSunRiseSetCallRetrofit(double lat, double lng);

}
