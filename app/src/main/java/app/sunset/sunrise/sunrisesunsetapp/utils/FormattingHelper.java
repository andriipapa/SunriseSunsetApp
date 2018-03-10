package app.sunset.sunrise.sunrisesunsetapp.utils;

import android.content.res.Resources;
import android.support.annotation.StringRes;
import android.text.Html;
import android.text.Spanned;

import app.sunset.sunrise.sunrisesunsetapp.data.network.model.SunRiseSet;

/**
 * Created by papaandrii on 10.03.2018.
 */

public final class FormattingHelper {

    private FormattingHelper(){
    }

    public static Spanned formatSunRiseSetDetails(Resources res, @StringRes int resId, String name, SunRiseSet sunRiseSet) {

        return Html.fromHtml(res.getString(resId,
                name,
                sunRiseSet.getResults().getSunrise(),
                sunRiseSet.getResults().getSunset(),
                sunRiseSet.getResults().getSolarNoon(),
                sunRiseSet.getResults().getDayLength()));

    }
}
