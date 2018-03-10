package app.sunset.sunrise.sunrisesunsetapp.user_interface.sun_rise_set;

import app.sunset.sunrise.sunrisesunsetapp.data.network.model.SunRiseSet;
import app.sunset.sunrise.sunrisesunsetapp.user_interface.base.BaseMvpView;

/**
 * Created by papaandrii on 10.03.2018.
 */

public interface SunRiseSetMvpView extends BaseMvpView {
    void updateSunriseSunsetData(SunRiseSet sunRiseSet);
}
