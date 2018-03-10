package app.sunset.sunrise.sunrisesunsetapp.user_interface.sun_rise_set;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;

import javax.inject.Inject;

import app.sunset.sunrise.sunrisesunsetapp.R;
import app.sunset.sunrise.sunrisesunsetapp.data.network.model.SunRiseSet;
import app.sunset.sunrise.sunrisesunsetapp.user_interface.base.BaseActivity;
import app.sunset.sunrise.sunrisesunsetapp.utils.FormattingHelper;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SunriseSunsetActivity extends BaseActivity
        implements SunRiseSetMvpView, PlaceSelectionListener{

    private static final int REQUEST_PLACE_PICKER = 1;

    @BindView(R.id.tv_result)
    TextView mResult;

    @Inject
    SunRiseSetMvpPresenter<SunRiseSetMvpView> mPresenter;

    String mLocationName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunrise_sunset);

        setUnBinder(ButterKnife.bind(this));

        PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.autocomplete_fragment);
        autocompleteFragment.setOnPlaceSelectedListener(this);

        mPresenter.onAttach(SunriseSunsetActivity.this);

    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_PLACE_PICKER) {
            if (resultCode == Activity.RESULT_OK) {
                final Place place = PlacePicker.getPlace(data, this);
                getSunRiseSet(place);
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void updateSunriseSunsetData(SunRiseSet sunRiseSet) {
        mResult.setText(FormattingHelper.formatSunRiseSetDetails(
                getResources(),
                R.string.sunrise_sunset_details,
                mLocationName,
                sunRiseSet));
    }

    @OnClick(R.id.btn_getSunRiseSet)
    void onGetSunRiseSetByLocation(){
        openPlacePicker();
    }

    @Override
    public void onPlaceSelected(Place place) {
        getSunRiseSet(place);
    }

    @Override
    public void onError(Status status) {
        showMessage(R.string.some_error);
    }

    private void getSunRiseSet(Place place){
        mLocationName = place.getName().toString();
        double lat = place.getLatLng().latitude;
        double lng = place.getLatLng().longitude;
        mPresenter.onViewPrepared(lat, lng);
    }

    private void openPlacePicker(){
        try {
            PlacePicker.IntentBuilder intentBuilder = new PlacePicker.IntentBuilder();
            Intent intent = intentBuilder.build(this);
            // Start the Intent by requesting a result, identified by a request code.
            startActivityForResult(intent, REQUEST_PLACE_PICKER);

        } catch (GooglePlayServicesRepairableException e) {
            GooglePlayServicesUtil
                    .getErrorDialog(e.getConnectionStatusCode(), this, 0);
        } catch (GooglePlayServicesNotAvailableException e) {
            showMessage(R.string.play_service_error);
        }
    }
}
