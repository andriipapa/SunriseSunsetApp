package app.sunset.sunrise.sunrisesunsetapp.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by papaandrii on 10.03.2018.
 */

public final class NetworkUtils {
    private NetworkUtils(){

    }

    public static boolean isNetworkConnected(Context context) {
        try{
            ConnectivityManager cm =
                    (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
            return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
