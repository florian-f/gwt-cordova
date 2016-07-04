package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

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
