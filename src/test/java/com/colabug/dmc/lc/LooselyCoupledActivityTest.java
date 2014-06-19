package com.colabug.dmc.lc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertNotNull;
import static org.robolectric.Robolectric.buildActivity;

/**
 * Testing main activity.
 *
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class LooselyCoupledActivityTest
{
    private LooselyCoupledActivity activity;

    @Before
    public void setUp() throws Exception
    {
        activity = buildActivity( LooselyCoupledActivity.class ).create()
                                                                .start()
                                                                .resume()
                                                                .get();
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( activity );
    }
}
