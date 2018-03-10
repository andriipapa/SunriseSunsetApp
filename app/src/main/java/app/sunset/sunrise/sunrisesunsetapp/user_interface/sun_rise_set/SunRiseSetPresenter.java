package app.sunset.sunrise.sunrisesunsetapp.user_interface.sun_rise_set;

import javax.inject.Inject;

import app.sunset.sunrise.sunrisesunsetapp.R;
import app.sunset.sunrise.sunrisesunsetapp.data.Data;
import app.sunset.sunrise.sunrisesunsetapp.data.network.model.SunRiseSet;
import app.sunset.sunrise.sunrisesunsetapp.user_interface.base.BasePresenter;
import app.sunset.sunrise.sunrisesunsetapp.utils.SchedulerHelper;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by papaandrii on 10.03.2018.
 */

public class SunRiseSetPresenter<V extends SunRiseSetMvpView>  extends BasePresenter<V>
        implements SunRiseSetMvpPresenter<V> {

    @Inject
    public SunRiseSetPresenter(Data dataManager,
                                SchedulerHelper schedulerHelper,
                                CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerHelper, compositeDisposable);
    }

    @Override
    public void onViewPrepared(double lat, double lng) {
        getMvpView().showLoading();
        getCompositeDisposable().add(getDataManager()
                .getSunRiseSetCallRetrofit(lat, lng)
                .subscribeOn(getSchedulerHelper().io())
                .observeOn(getSchedulerHelper().ui())
                .subscribe(new Consumer<SunRiseSet>() {
                    @Override
                    public void accept(@NonNull SunRiseSet result){
                        if (result != null) {
                            getMvpView().updateSunriseSunsetData(result);
                        }
                        getMvpView().hideLoading();
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable)
                            throws Exception {
                        getMvpView().hideLoading();
                        getMvpView().showMessage(R.string.api_default_error);
                    }
                })
        );
    }
}
