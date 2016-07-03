package com.florianf.gwtcordova.client.plugin.file;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface File {

    @JsProperty(name = "name")
    String getName();

    @JsProperty(name = "fullpath")
    String getFullPath();

    @JsProperty(name = "type")
    String getType();

    @JsProperty(name = "lastmodifieddate")
    String getLastModifiedDate();

    @JsProperty(name = "size")
    String getSize();

    File slice(int start, int end);
}
