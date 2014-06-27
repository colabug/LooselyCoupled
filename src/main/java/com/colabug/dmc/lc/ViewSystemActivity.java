package com.colabug.dmc.lc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.colabug.dmc.lc.navigation.CircleViewEvent;

import com.squareup.otto.Subscribe;

/**
 * TODO: Handle the 3 configurations
 *
 * @since 1.0
 */
public class ViewSystemActivity extends BaseActivity
{
    private boolean singlePane = true;
    private boolean dualPane   = false;
    private boolean triPane = false;

    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_view_system );

        configureStar();
        configureHeart();
    }

    /**
     * Handles the selection of the circle.
     *
     * @param event - circle view event
     */
    @Subscribe
    public void onCircleSelected (CircleViewEvent event)
    {
        startActivity( PuzzleActivity.createIntent( this ) );
    }

    // TODO: Move click handling to the fragment with an Otto notification
    private void configureHeart()
    {
        View heart = findViewById( R.id.heart );
        if ( triPane )
        {
//            heart.setOnClickListener( generatePuzzleOnClickListener() );
        }
        else if ( dualPane )
        {
            // TODO: Do something
        }
        else if ( singlePane )
        {
            heart.setOnClickListener( generateStarOnClickListener() );
        }
    }

    // TODO: Move click handling to the fragment with an Otto notification
    private void configureStar()
    {
        View star = findViewById( R.id.star );
        if ( star != null )
        {
//            star.setOnClickListener( generatePuzzleOnClickListener() );
            dualPane = true;
        }
    }

    private View.OnClickListener generateStarOnClickListener()
    {
        return new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                startActivity( getStarIntent() );
            }
        };
    }


    private Intent getStarIntent()
    {
        return StarActivity.createIntent( ViewSystemActivity.this );
    }

    public static Intent createIntent( Context context )
    {
        return new Intent( context, ViewSystemActivity.class );
    }
}
