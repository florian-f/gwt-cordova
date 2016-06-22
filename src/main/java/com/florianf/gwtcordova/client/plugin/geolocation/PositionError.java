package com.florianf.gwtcordova.client.plugin.geolocation;

import com.google.gwt.core.client.js.JsProperty;

/**
 * Created by ffriemel on 22/06/16.
 */
public interface PositionError {

    @JsProperty
    String getCode();

    @JsProperty
    String getMessage();

}
