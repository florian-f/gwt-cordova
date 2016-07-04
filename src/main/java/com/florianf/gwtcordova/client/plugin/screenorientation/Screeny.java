package com.florianf.gwtcordova.client.plugin.screenorientation;

public class Screeny implements ScreenI{

    public void lockOrientation(String orientation) {
        Screen.lockOrientation(orientation);
    }

    public void unlockOrientation() {
        Screen.unlockOrientation();
    }

    public String getOrientation() {
        return Screen.getOrientation().getType();
    }
}
