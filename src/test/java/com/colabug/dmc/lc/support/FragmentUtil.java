package com.colabug.dmc.lc.support;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import org.robolectric.Robolectric;

/**
 * @since 1.0
 */
public class FragmentUtil
{
    public static void startFragment( Fragment fragment )
    {
        Activity activity = Robolectric.buildActivity( Activity.class )
                                               .create()
                                               .start()
                                               .resume()
                                               .get();

        FragmentManager fragmentManager = activity.getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add( fragment, null );
        fragmentTransaction.commit();
    }
}
