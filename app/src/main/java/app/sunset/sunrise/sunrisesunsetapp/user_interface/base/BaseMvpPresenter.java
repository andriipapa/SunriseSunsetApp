package app.sunset.sunrise.sunrisesunsetapp.user_interface.base;

/**
 * Created by papaandrii on 09.03.2018.
 */

public interface BaseMvpPresenter<V extends BaseMvpView> {

    void onAttach(V baseMvpView);

    void onDetach();

}
