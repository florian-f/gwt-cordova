package com.florianf.gwtcordova.client.plugin.devicemotion;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 22/06/16.
 */
@JsType(isNative=true)
public interface Acceleration {

    @JsProperty(name = "x")
    double getX();

    @JsProperty(name = "y")
    double getY();

    @JsProperty(name = "z")
    double getZ();

    @JsProperty(name = "timestamp")
    String getTimeStamp();
}

