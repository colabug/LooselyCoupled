package com.colabug.dmc.lc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * TODO: Handle the 3 configurations
 *
 * @since 1.0
 */
public class ViewSystemActivity extends Activity
{
    private boolean singlePane = true;
    private boolean dualPane = false;
    private boolean triPane = false;

    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_view_system );

        configureCircle();
        configureStar();
        configureHeart();
    }

    private void configureCircle()
    {
        View circle = findViewById( R.id.circle );
        if ( circle != null )
        {
            circle.setOnClickListener( generatePuzzleOnClickListener() );
            triPane = true;
        }
    }

    // TODO: Move click handling to the fragment with an Otto notification
    private void configureHeart()
    {
        View heart = findViewById( R.id.heart );
        if ( triPane )
        {
            heart.setOnClickListener( generatePuzzleOnClickListener() );
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
            star.setOnClickListener( generatePuzzleOnClickListener() );
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

    private View.OnClickListener generatePuzzleOnClickListener()
    {
        return new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                startActivity( getPuzzleIntent() );
            }
        };
    }

    private Intent getStarIntent()
    {
        return StarActivity.createIntent( ViewSystemActivity.this );
    }

    private Intent getPuzzleIntent()
    {
        return PuzzleActivity.createIntent( ViewSystemActivity.this );
    }

    public static Intent createIntent( Context context )
    {
        return new Intent( context, ViewSystemActivity.class );
    }
}
