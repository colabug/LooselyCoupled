package com.colabug.dmc.lc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @since 1.0
 */
public class StarFragment extends Fragment
{
    @Override
    public View onCreateView (LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState)
    {
        View layout = inflater.inflate( R.layout.fragment_star, container, false );

        return layout;
    }

    public static StarFragment newInstance()
    {
        return new StarFragment();
    }
}
