package app.sunset.sunrise.sunrisesunsetapp.user_interface.base;

import android.support.annotation.StringRes;

/**
 * Created by papaandrii on 09.03.2018.
 */

public interface BaseMvpView {

    void showLoading();

    void hideLoading();

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

}
