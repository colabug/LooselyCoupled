package com.colabug.dmc.lc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LooselyCoupledActivity extends Activity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main );

        findViewById( R.id.activity_button ).setOnClickListener( generateOnClickListener() );
    }

    private View.OnClickListener generateOnClickListener()
    {
        return new View.OnClickListener()
        {
            @Override
            public void onClick( View v )
            {
                startActivity( createViewSystemIntent() );
            }
        };
    }

    private Intent createViewSystemIntent()
    {
        return ViewSystemActivity.createIntent( LooselyCoupledActivity.this );
    }
}
