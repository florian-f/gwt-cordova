package com.florianf.gwtcordova.client.plugin.screenorientation;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "screen")
public class Screen {

    @JsMethod(name = "lockOrientation")
    public static native void lockOrientation(String orientation);

    @JsMethod(name = "unlockOrientation")
    public static native void unlockOrientation();

    @JsProperty(name = "orientation")
    public static native ScreenOrientation getOrientation();

}
