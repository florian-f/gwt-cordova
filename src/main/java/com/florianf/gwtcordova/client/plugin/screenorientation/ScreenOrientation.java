package com.florianf.gwtcordova.client.plugin.screenorientation;

import jsinterop.annotations.JsProperty;

/**
 * Created by ffriemel on 25/06/16.
 */
public interface ScreenOrientation {

    @JsProperty(name = "angle")
    double getAngle();

    @JsProperty(name = "type")
    String getType();

}

