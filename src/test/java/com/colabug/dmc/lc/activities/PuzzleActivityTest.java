package com.colabug.dmc.lc.activities;

import android.app.Fragment;

import com.colabug.dmc.lc.R;

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

public class PuzzleActivityTest
{
    private PuzzleActivity activity;

    @Before
    public void setUp() throws Exception
    {
        activity = buildActivity( PuzzleActivity.class ).create()
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
    public void shouldHavePuzzleFragment() throws Exception
    {
        Fragment puzzleFragment = activity.getFragmentManager()
                                          .findFragmentById( R.id.puzzle_fragment );
        assertNotNull( puzzleFragment );
    }
}
