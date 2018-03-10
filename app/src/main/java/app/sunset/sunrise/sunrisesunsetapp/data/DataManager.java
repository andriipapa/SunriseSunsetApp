package app.sunset.sunrise.sunrisesunsetapp.data;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import app.sunset.sunrise.sunrisesunsetapp.data.network.ApiHelper;
import app.sunset.sunrise.sunrisesunsetapp.data.network.model.SunRiseSet;
import app.sunset.sunrise.sunrisesunsetapp.data.network.rest.RestClient;
import io.reactivex.Single;

/**
 * Created by papaandrii on 09.03.2018.
 */

@Singleton
public class DataManager implements Data {

    private final Context mContext;

    @Inject
    public DataManager(Context context) {
        mContext = context;
    }

    @Override
    public Single<SunRiseSet> getSunRiseSetCallRetrofit(double lat, double lng) {
        return RestClient.getApiService().getSunRiseSetApiCall(lat, lng);
    }
}
