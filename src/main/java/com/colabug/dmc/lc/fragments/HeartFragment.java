package com.colabug.dmc.lc.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.colabug.dmc.lc.R;
import com.colabug.dmc.lc.navigation.HeartViewEvent;

/**
 * @since 1.0
 */
public class HeartFragment extends BaseFragment
{
    private View layout;

    public static HeartFragment newInstance()
    {
        return new HeartFragment();
    }

    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState )
    {
        layout = inflater.inflate( R.layout.fragment_heart,
                                   container,
                                   false );
        configureHeart();

        return layout;
    }

    private void configureHeart()
    {
        layout.findViewById( R.id.heart ).setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                postToBus( new HeartViewEvent() );
            }
        } );
    }
}
