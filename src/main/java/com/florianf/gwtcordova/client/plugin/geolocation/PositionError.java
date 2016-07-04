package com.florianf.gwtcordova.client.plugin.geolocation;

import com.google.gwt.core.client.js.JsProperty;

public interface PositionError {

    @JsProperty
    String getCode();

    @JsProperty
    String getMessage();

}
