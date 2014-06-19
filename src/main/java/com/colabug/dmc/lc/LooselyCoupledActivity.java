package com.colabug.dmc.lc;

import android.app.Activity;
import android.os.Bundle;

public class LooselyCoupledActivity extends Activity
{
    @Override
    public void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main );
    }
}
