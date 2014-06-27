package com.colabug.dmc.lc.activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.colabug.dmc.lc.LooselyCoupledApplication;
import com.colabug.dmc.lc.R;
import com.colabug.dmc.lc.fragments.BaseFragment;
import com.squareup.otto.Bus;

/**
 * Base Activity
 *
 * @since 1.0
 */
public class BaseActivity extends Activity
{
    private BaseFragment currentFragment;

    private Bus bus;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        bus = getApp().getBus();
    }

    private LooselyCoupledApplication getApp()
    {
        return (LooselyCoupledApplication) getApplication();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        bus.register( this );
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        bus.unregister( this );
    }

    /**
     * Updates the main content by replacing fragments.
     *
     * @param fragment       - fragment to show
     * @param addToBackStack - add to system stack
     */
    protected void swapFragment( BaseFragment fragment,
                                 boolean addToBackStack )
    {
        currentFragment = fragment;
        createFragmentTransaction( addToBackStack ).commit();
    }

    private FragmentTransaction createFragmentTransaction( boolean addToBackStack )
    {
        FragmentTransaction transaction = getReplaceTransaction();

        if ( addToBackStack )
        {
            transaction.addToBackStack( currentFragment.getClass().getSimpleName() );
        }

        return transaction;
    }

    private FragmentTransaction getReplaceTransaction()
    {
        return getFragmentManager().beginTransaction()
                                   .replace( R.id.fragment_holder,
                                             currentFragment );
    }

    protected boolean isSinglePane()
    {
        return !hasAStar() && !hasACircle();
    }

    protected boolean isDualPane()
    {
        return false;
    }

    protected boolean isTriPane()
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
}
