package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
@JsType
public interface ContactError {

    @JsProperty(name = "code")
    int getCode();

}
