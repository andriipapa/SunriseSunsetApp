package app.sunset.sunrise.sunrisesunsetapp.dependency_injection.component;

import android.app.Application;

import javax.inject.Singleton;

import app.sunset.sunrise.sunrisesunsetapp.SunriseSunsetApp;
import app.sunset.sunrise.sunrisesunsetapp.dependency_injection.builder.ActivityBuilder;
import app.sunset.sunrise.sunrisesunsetapp.dependency_injection.module.AppModule;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by papaandrii on 10.03.2018.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();

    }

    void inject(SunriseSunsetApp app);

}
