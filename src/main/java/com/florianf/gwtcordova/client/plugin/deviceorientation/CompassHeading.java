package com.florianf.gwtcordova.client.plugin.deviceorientation;

import jsinterop.annotations.JsProperty;

public interface CompassHeading {
    @JsProperty(name = "magneticHeading")
    public String getMagneticHeading();

    @JsProperty(name = "trueHeading")
    public String getTrueHeading();

    @JsProperty(name = "headingAccuracy")
    public String getHeadingAccuracy();

    @JsProperty(name = "timeStamp")
    public String getTimeStamp();
}
