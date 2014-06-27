package com.colabug.dmc.lc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.colabug.dmc.lc.navigation.CircleViewEvent;
import com.colabug.dmc.lc.navigation.HeartViewEvent;

import com.squareup.otto.Subscribe;

/**
 * TODO: Handle the 3 configurations
 *
 * @since 1.0
 */
public class ViewSystemActivity extends BaseActivity
{
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );

        setContentView( R.layout.activity_view_system );
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
        else if ( isDualPane() )
        {
        }
        else if ( isSinglePane() )
        {
            startStar();
        }
    }

    private void startStar()
    {
        startActivity( getStarIntent() );
    }

    private Intent getStarIntent()
    {
        return StarActivity.createIntent( ViewSystemActivity.this );
    }

    public static Intent createIntent( Context context )
    {
        return new Intent( context, ViewSystemActivity.class );
    }

    public boolean isSinglePane()
    {
        return hasAHeart() && !hasAStar() && !hasACircle();
    }

    private boolean isDualPane()
    {
        return false;
    }

    public boolean isTriPane()
    {
        return hasAHeart() && hasAStar() && hasACircle();
    }

    private boolean hasAHeart()
    {
        return findViewById( R.id.heart_fragment ) != null;
    }

    private boolean hasAStar()
    {
        return findViewById( R.id.star_fragment ) != null;
    }

    private boolean hasACircle()
    {
        return findViewById( R.id.circle_fragment ) != null;
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

    private void startPuzzle()
    {
        startActivity( PuzzleActivity.createIntent( this ) );
    }
}
