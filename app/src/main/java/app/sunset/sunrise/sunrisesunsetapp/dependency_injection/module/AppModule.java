package app.sunset.sunrise.sunrisesunsetapp.dependency_injection.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import app.sunset.sunrise.sunrisesunsetapp.data.Data;
import app.sunset.sunrise.sunrisesunsetapp.data.DataManager;
import app.sunset.sunrise.sunrisesunsetapp.utils.AppSchedulerHelper;
import app.sunset.sunrise.sunrisesunsetapp.utils.SchedulerHelper;
import dagger.Module;
import dagger.Provides;

/**
 * Created by papaandrii on 10.03.2018.
 */

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    SchedulerHelper provideSchedulerHelper() {
        return new AppSchedulerHelper();
    }

    @Provides
    @Singleton
    Data provideDataManager(DataManager dataManager) {
        return dataManager;
    }
}
