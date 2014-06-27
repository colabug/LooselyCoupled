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

public class CircleFragmentTest
{
    CircleFragment fragment;

    @Before
    public void setUp() throws Exception
    {
        fragment = CircleFragment.newInstance();
        startFragment( fragment );
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( fragment );
    }

    @Test
    public void shouldHaveCircle() throws Exception
    {
        ImageView circle = (ImageView) fragment.getView().findViewById( R.id.circle );
        assertViewIsVisible( circle );
        assertThat( circle.getDrawable(),
                    equalTo( getResourceDrawable( R.drawable.circle ) ) );
    }
}
