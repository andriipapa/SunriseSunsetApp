package app.sunset.sunrise.sunrisesunsetapp.dependency_injection.builder;

import app.sunset.sunrise.sunrisesunsetapp.dependency_injection.module.ActivityModule;
import app.sunset.sunrise.sunrisesunsetapp.user_interface.sun_rise_set.SunRiseSetActivityModule;
import app.sunset.sunrise.sunrisesunsetapp.user_interface.sun_rise_set.SunriseSunsetActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by papaandrii on 10.03.2018.
 */

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {SunRiseSetActivityModule.class,
            ActivityModule.class})
    abstract SunriseSunsetActivity buildSunriseSunsetActivity();

}
