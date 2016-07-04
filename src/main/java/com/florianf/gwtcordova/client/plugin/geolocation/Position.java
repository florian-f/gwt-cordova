package com.florianf.gwtcordova.client.plugin.geolocation;

import jsinterop.annotations.JsProperty;

public interface Position {

    @JsProperty(name = "coords")
    Coordinates getCoordinations();

    @JsProperty()
    String getTimestamp();
}

