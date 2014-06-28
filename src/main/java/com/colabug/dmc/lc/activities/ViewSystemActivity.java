package com.colabug.dmc.lc.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.colabug.dmc.lc.R;
import com.colabug.dmc.lc.fragments.StarFragment;
import com.colabug.dmc.lc.fragments.CircleFragment;
import com.colabug.dmc.lc.fragments.HeartFragment;
import com.colabug.dmc.lc.navigation.CircleViewEvent;
import com.colabug.dmc.lc.navigation.HeartViewEvent;
import com.colabug.dmc.lc.navigation.StarViewEvent;

import com.squareup.otto.Subscribe;

/**
 * TODO: Handle the 3 configurations
 *
 * @since 1.0
 */
public class ViewSystemActivity extends BaseActivity
{
    public static Intent createIntent( Context context )
    {
        return new Intent( context, ViewSystemActivity.class );
    }

    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );

        setContentView( R.layout.activity_view_system );
        if ( isSinglePane() )
        {
            showFirstFragment();
        }
    }

    private void showFirstFragment()
    {
        swapFragment( HeartFragment.newInstance(), false );
    }

    /**
     * Handles the selection of the heart.
     *
     * @param event - heart view event
     */
    @Subscribe
    public void onHeartSelected( HeartViewEvent event )
    {
        if ( isTriPane() )
        {
            startPuzzle();
        }
        else if ( isSinglePane() )
        {
            swapFragment( new StarFragment(), true );
        }
    }

    /**
     * Handles the selection of the star.
     *
     * @param event - star view event
     */
    @Subscribe
    public void onStarSelected( StarViewEvent event )
    {
        if ( isTriPane() )
        {
            startPuzzle();
        }
        else if ( isSinglePane() )
        {
            swapFragment( new CircleFragment(), true );
        }
    }

    /**
     * Handles the selection of the circle.
     *
     * @param event - circle view event
     */
    @Subscribe
    public void onCircleSelected( CircleViewEvent event )
    {
        startPuzzle();
    }

    public void startPuzzle()
    {
        startActivity( PuzzleActivity.createIntent( this ) );
    }
}
