package app.sunset.sunrise.sunrisesunsetapp.user_interface.sun_rise_set;

import app.sunset.sunrise.sunrisesunsetapp.user_interface.base.BaseMvpPresenter;

/**
 * Created by papaandrii on 10.03.2018.
 */

public interface SunRiseSetMvpPresenter<V extends SunRiseSetMvpView>
        extends BaseMvpPresenter<V> {

    void onViewPrepared(double lat, double lng);
}
