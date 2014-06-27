package com.colabug.dmc.lc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.colabug.dmc.lc.navigation.HeartViewEvent;
import com.colabug.dmc.lc.navigation.StarViewEvent;

/**
 * @since 1.0
 */
public class StarFragment extends BaseFragment
{
    private View layout;

    public static StarFragment newInstance()
    {
        return new StarFragment();
    }

    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState )
    {
        layout = inflater.inflate( R.layout.fragment_star, container, false );

        configureStar();

        return layout;
    }

    private void configureStar()
    {
        layout.findViewById( R.id.star ).setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                postToBus( new StarViewEvent() );
            }
        } );
    }
}
