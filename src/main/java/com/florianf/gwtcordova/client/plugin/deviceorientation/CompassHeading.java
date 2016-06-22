package com.florianf.gwtcordova.client.plugin.deviceorientation;

import jsinterop.annotations.JsProperty;

public interface CompassHeading {
    @JsProperty
    public String getMagneticHeading();

    @JsProperty
    public String getTrueHeading();

    @JsProperty
    public String getHeadingAccuracy();

    @JsProperty
    public String getTimeStamp();
}
