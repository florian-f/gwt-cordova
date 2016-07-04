package com.florianf.gwtcordova.client.plugin.screenorientation;

import com.google.gwt.core.client.GWT;

public class ScreenFoo {

    private static ScreenFoo instance;

    private ScreenI screeny;

    private ScreenFoo() {
        screeny = GWT.create(Screeny.class);
    }

    public static ScreenFoo getInstance() {
        if (instance == null) {
            instance = new ScreenFoo();
        }
        return instance;
    }

    public void lockOrientation(String orientation) {
        this.screeny.lockOrientation(orientation);
    }

    public void unLockOrientation() {
        this.screeny.unlockOrientation();
    }

    public String getOrientation() {
        return this.screeny.getOrientation();
    }
}