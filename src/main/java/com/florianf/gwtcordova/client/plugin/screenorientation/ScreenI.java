package com.florianf.gwtcordova.client.plugin.screenorientation;

import com.florianf.gwtcordova.client.plugin.screenorientation.ios.*;

/**
 * Created by ffriemel on 01/07/16.
 */
public interface ScreenI {
    public void lockOrientation(String orientation);

    public void unlockOrientation();

    public String getOrientation();
}
