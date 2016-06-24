package com.florianf.gwtcordova.client.plugin.deviceorientation;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = false)
public class CompassError {

    @JsProperty(name = "code")
    public native String getCode();

}
