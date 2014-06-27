package com.colabug.dmc.lc;

import android.app.Fragment;

import com.colabug.dmc.lc.navigation.BaseViewEvent;

/**
 * Base fragment
 *
 * @since 1.0
 */
public class BaseFragment extends Fragment
{
    public void postToBus( BaseViewEvent event )
    {
        getApp().getBus().post( event );
    }

    private LooselyCoupledApplication getApp()
    {
        return (LooselyCoupledApplication) getActivity().getApplication();
    }
}
