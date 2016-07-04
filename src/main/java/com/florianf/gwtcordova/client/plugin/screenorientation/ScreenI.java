package com.florianf.gwtcordova.client.plugin.screenorientation;

public interface ScreenI {
    public void lockOrientation(String orientation);

    public void unlockOrientation();

    public String getOrientation();
}
