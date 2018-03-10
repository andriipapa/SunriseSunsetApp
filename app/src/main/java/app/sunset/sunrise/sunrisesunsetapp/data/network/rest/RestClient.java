package app.sunset.sunrise.sunrisesunsetapp.data.network.rest;

import android.support.annotation.NonNull;

import java.util.concurrent.TimeUnit;

import app.sunset.sunrise.sunrisesunsetapp.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by papaandrii on 10.03.2018.
 */

public class RestClient {
    private static OkHttpClient getClient() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(getLogLevel());
        return new OkHttpClient.Builder()
                // be careful, produce duplicating file uploading
                .addInterceptor(loggingInterceptor)
                .addNetworkInterceptor(new SessionRequestInterceptor())
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
    }

    private static HttpLoggingInterceptor.Level getLogLevel() {
        return BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE;
    }

    @NonNull
    public static ApiService getApiService() {
        return getRetrofit().create(ApiService.class);
    }

    @NonNull
    public static ApiService getApiService(String api_endpoint) {
        return getRetrofit(api_endpoint).create(ApiService.class);
    }

    @NonNull
    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(getClient())
                .build();
    }

    @NonNull
    private static Retrofit getRetrofit(String api_endpoint) {
        return new Retrofit.Builder()
                .baseUrl(api_endpoint)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(getClient())
                .build();
    }
}
