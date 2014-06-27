package com.colabug.dmc.lc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Used only for single pane views.
 *
 * @since 1.0
 */
public class PuzzleActivity extends BaseActivity
{
    public static Intent createIntent( Context context )
    {
        return new Intent( context, PuzzleActivity.class );
    }

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_puzzle );
    }
}

