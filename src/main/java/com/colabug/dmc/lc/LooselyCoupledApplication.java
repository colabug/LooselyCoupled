package com.colabug.dmc.lc;

import android.app.Application;

import com.squareup.otto.Bus;

/**
 * @since 1.0
 */
public class LooselyCoupledApplication extends Application
{
    private static LooselyCoupledApplication instance = new LooselyCoupledApplication();

    private Bus bus;

    public static LooselyCoupledApplication getInstance()
    {
        return instance;
    }

    public Bus getBus()
    {
        return bus;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        bus = new Bus();
    }
}
