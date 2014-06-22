package com.colabug.dmc.lc;

import android.widget.ImageView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static com.colabug.dmc.lc.support.Assert.assertViewIsVisible;
import static com.colabug.dmc.lc.support.FragmentUtil.startFragment;
import static com.colabug.dmc.lc.support.ResourceLocator.getResourceDrawable;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class PuzzleFragmentTest
{
    PuzzleFragment fragment;

    @Before
    public void setUp() throws Exception
    {
        fragment = PuzzleFragment.newInstance();
        startFragment( fragment );
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( fragment );
    }

    @Test
    public void shouldHaveHeart() throws Exception
    {
        ImageView puzzle = (ImageView) fragment.getView().findViewById( R.id.puzzle );
        assertViewIsVisible( puzzle );
        assertThat( puzzle.getDrawable(),
                    equalTo( getResourceDrawable( R.drawable.puzzle ) ) );
    }

}
