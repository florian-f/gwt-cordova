package com.florianf.gwtcordova.client.plugin.screenorientation;

import jsinterop.annotations.JsProperty;

public interface ScreenOrientation {

    @JsProperty(name = "angle")
    int getAngle();

    @JsProperty(name = "type")
    String getType();

}

