package com.florianf.gwtcordova.client.plugin.file;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = JsPackage.GLOBAL)
public interface FileError {

    @JsProperty(name = "code")
    String getCode();

}
