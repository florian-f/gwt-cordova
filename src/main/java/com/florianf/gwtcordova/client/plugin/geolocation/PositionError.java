package com.florianf.gwtcordova.client.plugin.geolocation;

import jsinterop.annotations.JsProperty;

public interface PositionError {

    @JsProperty
    String getCode();

    @JsProperty
    String getMessage();

}
