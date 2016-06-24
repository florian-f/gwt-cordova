package com.florianf.gwtcordova.client.plugin.globalization;

import jsinterop.annotations.JsType;

@JsType
public interface GlobalizationError {

    String getCode();

    String getMessage();

}
