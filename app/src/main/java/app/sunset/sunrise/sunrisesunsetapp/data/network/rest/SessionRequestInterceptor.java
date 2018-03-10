package app.sunset.sunrise.sunrisesunsetapp.data.network.rest;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by papaandrii on 10.03.2018.
 */

public class SessionRequestInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        return chain.proceed(originalRequest);
    }
}
