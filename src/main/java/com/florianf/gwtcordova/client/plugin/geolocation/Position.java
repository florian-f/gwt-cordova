package com.florianf.gwtcordova.client.plugin.geolocation;

import jsinterop.annotations.JsProperty;

/**
 * Created by ffriemel on 22/06/16.
 */
public interface Position {

    @JsProperty(name = "coords")
    Coordinates getCoordinations();

    @JsProperty()
    String getTimestamp();
}

