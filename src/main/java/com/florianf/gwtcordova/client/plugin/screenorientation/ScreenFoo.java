package com.florianf.gwtcordova.client.plugin.screenorientation;

import com.florianf.gwtcordova.client.plugin.screenorientation.ios.ScreenOrientationIOS;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 28/06/16.
 */
public class ScreenFoo {

    private static ScreenFoo instance;

    private Screen screen;

    private ScreenFoo() {
        this.screen = GWT.create(Screen.class);
    }

    public static ScreenFoo getInstance() {
        if (instance == null) {
            instance = new ScreenFoo();
        }
        return instance;
    }

    public void lockOrientation(String orientation) {
        this.screen.lockOrientation(orientation);
    }

    public void unLockOrientation() {
        this.screen.unlockOrientation();
    }

    public String getOrientation() {
        return this.screen.getOrientation();
    }
}