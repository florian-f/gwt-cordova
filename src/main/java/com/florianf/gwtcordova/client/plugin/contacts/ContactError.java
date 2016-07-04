package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public interface ContactError {

    @JsProperty(name = "code")
    int getCode();

}
