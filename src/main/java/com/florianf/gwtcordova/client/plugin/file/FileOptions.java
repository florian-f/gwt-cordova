package com.florianf.gwtcordova.client.plugin.file;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = false)
public class FileOptions {
    @JsProperty
    public boolean create;
    @JsProperty
    public boolean exclusive;
}
