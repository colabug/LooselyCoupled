package com.colabug.dmc.lc;

import android.app.Fragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertNotNull;
import static org.robolectric.Robolectric.buildActivity;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class StarActivityTest
{
    private StarActivity activity;

    @Before
    public void setUp() throws Exception
    {
        activity = buildActivity( StarActivity.class ).create()
                                                      .start()
                                                      .resume()
                                                      .get();
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( activity );

    }

    @Test
    public void shouldHaveStarFragment() throws Exception
    {
        Fragment starFragment = activity.getFragmentManager().findFragmentById( R.id.star_fragment );
        assertNotNull( starFragment );
    }

    // TODO: Add test for the intent
}
