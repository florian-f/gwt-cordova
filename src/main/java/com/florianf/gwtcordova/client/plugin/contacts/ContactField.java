package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
@JsType
public interface ContactField {

    @JsProperty(name = "id")
    String getId();

    @JsProperty(name = "type")
    String getType();

    @JsProperty(name = "value")
    String getValue();

    @JsProperty(name = "pref")
    String getPref();
}
