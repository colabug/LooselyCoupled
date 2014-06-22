package com.colabug.dmc.lc;

import android.widget.ImageView;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static com.colabug.dmc.lc.support.Assert.assertViewIsVisible;
import static com.colabug.dmc.lc.support.FragmentUtil.startFragment;
import static com.colabug.dmc.lc.support.ResourceLocator.getResourceDrawable;
import static com.colabug.dmc.lc.support.ResourceLocator.getResourceString;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @since 1.0
 */
@RunWith (RobolectricTestRunner.class)

public class StarFragmentTest
{
    StarFragment fragment;

    @Before
    public void setUp() throws Exception
    {
        fragment = StarFragment.newInstance();
        startFragment( fragment );
    }

    @Test
    public void shouldNotBeNull() throws Exception
    {
        assertNotNull( fragment );
    }

    @Test
    public void shouldHaveStar() throws Exception
    {
        ImageView star = (ImageView) fragment.getView().findViewById( R.id.star );
        assertViewIsVisible( star );
        assertThat( star.getDrawable(),
                    equalTo( getResourceDrawable( R.drawable.star ) ) );
    }

    @Test
    public void shouldHaveFavoriteText() throws Exception
    {
        TextView favorite = (TextView) fragment.getView().findViewById( R.id.favorite_text );
        assertViewIsVisible( favorite );
        assertThat( favorite.getText().toString(),
                    equalTo( getResourceString( R.string.FAVORITE_TEXT ) ) );
    }
}
