package app.sunset.sunrise.sunrisesunsetapp.utils;

import io.reactivex.Scheduler;

/**
 * Created by papaandrii on 10.03.2018.
 */

public interface SchedulerHelper {

    Scheduler ui();

    Scheduler io();

}
