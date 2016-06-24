package com.florianf.gwtcordova.client.plugin.globalization;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public interface GlobalizationError {

    @JsProperty(name = "code")
    String getCode();

    @JsProperty(name = "message")
    String getMessage();

}
