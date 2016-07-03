package com.florianf.gwtcordova.client.plugin.file;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class FileReader {
    @JsProperty
    public String result;
    @JsProperty(name = "onloadend")
    public Function<Void, Void> onLoadEnd;
    @JsMethod
    public native void readAsText(File file);

}
