package app.sunset.sunrise.sunrisesunsetapp;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import app.sunset.sunrise.sunrisesunsetapp.dependency_injection.component.DaggerAppComponent;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by papaandrii on 09.03.2018.
 */

public class SunriseSunsetApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate(){
        super.onCreate();

        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);

    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }

}