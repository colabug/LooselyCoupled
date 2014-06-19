package com.colabug.dmc.lc.support;

import org.robolectric.Robolectric;

/**
 * Locates resources for testing.
 *
 * @since 1.0
 */
public class ResourceLocator
{
    public static String getResourceString( int resourceId )
    {
        return Robolectric.application.getApplicationContext().getString( resourceId );
    }
}
