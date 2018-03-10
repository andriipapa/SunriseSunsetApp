package app.sunset.sunrise.sunrisesunsetapp.dependency_injection.module;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by papaandrii on 10.03.2018.
 */

@Module
public class ActivityModule {

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

}
