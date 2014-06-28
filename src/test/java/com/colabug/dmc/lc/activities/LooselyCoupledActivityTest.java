package com.colabug.dmc.lc.activities;

import android.widget.Button;

import com.colabug.dmc.lc.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.robolectric.RobolectricTestRunner;

import static com.colabug.dmc.lc.support.Assert.assertViewIsVisible;
import static com.colabug.dmc.lc.support.ResourceLocator.*;
import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
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

    @Test
    public void shouldHaveActivityButton() throws Exception
    {
        Button activityButton = getButton( R.id.activity_button );
        assertViewIsVisible( activityButton );
        assertThat( activityButton.getText().toString(),
                    equalTo( getResourceString( R.string.ACTIVITY_BUTTON_TEXT ) ) );
    }

    @Test
    public void shouldHaveServiceButton() throws Exception
    {
        Button serviceButton = getButton( R.id.service_button );
        assertViewIsVisible( serviceButton );
        assertThat( serviceButton.getText().toString(),
                    equalTo( getResourceString( R.string.SERVICE_BUTTON_TEXT ) ) );
    }

    private Button getButton( int viewId )
    {
        return (Button) activity.findViewById( viewId );
    }
}
