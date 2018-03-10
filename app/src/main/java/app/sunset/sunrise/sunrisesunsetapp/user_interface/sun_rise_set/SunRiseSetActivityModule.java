package app.sunset.sunrise.sunrisesunsetapp.user_interface.sun_rise_set;

import dagger.Module;
import dagger.Provides;

/**
 * Created by papaandrii on 10.03.2018.
 */

@Module
public class SunRiseSetActivityModule {

    @Provides
    SunRiseSetMvpPresenter<SunRiseSetMvpView> provideSunRiseSetPresenter(
            SunRiseSetPresenter<SunRiseSetMvpView> presenter) {
        return presenter;
    }

}
