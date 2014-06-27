package com.colabug.dmc.lc;

import android.app.Activity;
import android.os.Bundle;

import com.squareup.otto.Bus;

/**
 * Base Activity
 *
 * @since 1.0
 */
public class BaseActivity extends Activity
{
    private Bus bus;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        bus = getApp().getBus();
    }

    private LooselyCoupledApplication getApp()
    {
        return (LooselyCoupledApplication) getApplication();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        bus.register( this );
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        bus.unregister( this );
    }
}
