package com.colabug.dmc.lc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Used only for single pane views.
 *
 * @since 1.0
 */
public class StarActivity extends Activity
{
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_single_pane_star );
    }

    public static Intent createIntent( Context context )
    {
        return new Intent( context, StarActivity.class );
    }
}
