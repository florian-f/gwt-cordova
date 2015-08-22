package com.florianf.client.cordova.plugin.device;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * Created by florian on 09.08.15.
 */
@JsType
public interface Device {

    @JsProperty
    String getAvailable();
    @JsProperty
    String getPlatform();
    @JsProperty
    String getVersion();
    @JsProperty
    String getUuid();
    @JsProperty
    String getCordova();
    @JsProperty
    String getModel();
    @JsProperty
    String getManufacturer();
}
