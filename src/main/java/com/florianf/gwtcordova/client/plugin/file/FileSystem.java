package com.florianf.gwtcordova.client.plugin.file;

import com.florianf.gwtcordova.client.elemental.myelemental.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class FileSystem {

    @JsProperty(name = "root")
    public native DirectoryEntry getRoot();

    @JsProperty(name = "name")
    public native String getName();

    public native String toJSON();

    public native String encodeURIPath();

}
