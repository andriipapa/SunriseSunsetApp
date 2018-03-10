package app.sunset.sunrise.sunrisesunsetapp.user_interface.base;

import javax.inject.Inject;

import app.sunset.sunrise.sunrisesunsetapp.data.Data;
import app.sunset.sunrise.sunrisesunsetapp.utils.SchedulerHelper;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by papaandrii on 09.03.2018.
 */

public class BasePresenter<V extends BaseMvpView>
        implements BaseMvpPresenter<V> {

    private final Data mDataManager;
    private final SchedulerHelper mSchedulerHelper;
    private final CompositeDisposable mCompositeDisposable;

    private V mMvpView;

    @Inject
    public BasePresenter(Data dataManager,
                         SchedulerHelper schedulerHelper,
                         CompositeDisposable compositeDisposable) {
        this.mDataManager = dataManager;
        this.mSchedulerHelper = schedulerHelper;
        this.mCompositeDisposable = compositeDisposable;
    }

    @Override
    public void onAttach(V baseMvpView) {
        mMvpView = baseMvpView;
    }

    @Override
    public void onDetach() {
        mCompositeDisposable.dispose();
        mMvpView = null;
    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public Data getDataManager() {
        return mDataManager;
    }

    public SchedulerHelper getSchedulerHelper() {
        return mSchedulerHelper;
    }

    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }
}
