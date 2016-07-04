package com.florianf.gwtcordova.client.plugin.screenorientation.ios;

import com.florianf.gwtcordova.client.plugin.screenorientation.ScreenI;

public class Screeny implements ScreenI{

    public void lockOrientation(String orientation) {
        Screen.lockOrientation(orientation);
    }

    public void unlockOrientation() {
        Screen.unlockOrientation();
    }

    public String getOrientation() {
        return Screen.getOrientation();
    }
}
