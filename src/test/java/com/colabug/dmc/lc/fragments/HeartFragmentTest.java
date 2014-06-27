package com.colabug.dmc.lc.fragments;

import android.widget.ImageView;

import com.colabug.dmc.lc.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static com.colabug.dmc.lc.support.Assert.assertViewIsVisible;
import static com.colabug.dmc.lc.support.FragmentUtil.startFragment;
import static com.colabug.dmc.lc.support.ResourceLocator.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class HeartFragmentTest
{
    HeartFragment fragment;

    @Before
    public void setUp() throws Exception
    {
        fragment = HeartFragment.newInstance();
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
        ImageView heart = (ImageView) fragment.getView().findViewById( R.id.heart );
        assertViewIsVisible( heart );
        assertThat( heart.getDrawable(),
                    equalTo( getResourceDrawable( R.drawable.heart ) ) );
    }

    // TODO: Add test for the intent
}
