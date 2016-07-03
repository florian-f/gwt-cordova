package com.florianf.gwtcordova.client.plugin.media;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Media {
    public native void play();
    public native void pause();
}
