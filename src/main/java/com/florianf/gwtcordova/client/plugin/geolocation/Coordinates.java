package com.florianf.gwtcordova.client.plugin.geolocation;

import jsinterop.annotations.JsProperty;

public interface Coordinates {

    @JsProperty(name = "latitude")
    String getLatitude();

    @JsProperty
    String getLongitude();

    @JsProperty
    String getAltitude();

    @JsProperty
    String getAccuracy();

    @JsProperty()
    String getHeading();

    @JsProperty()
    String getSpeed();

    @JsProperty
    String getAltitudeAccuracy();
}

