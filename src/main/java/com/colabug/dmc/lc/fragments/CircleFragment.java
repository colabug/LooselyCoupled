package com.colabug.dmc.lc.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.colabug.dmc.lc.R;
import com.colabug.dmc.lc.navigation.CircleViewEvent;

/**
 * @since 1.0
 */
public class CircleFragment extends BaseFragment
{
    private View layout;

    public static CircleFragment newInstance()
    {
        return new CircleFragment();
    }

    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState )
    {
        layout = inflater.inflate( R.layout.fragment_circle, container, false );

        configureCircle();

        return layout;
    }

    private void configureCircle()
    {
        layout.findViewById( R.id.circle ).setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                postToBus( new CircleViewEvent() );
            }
        } );
    }
}
