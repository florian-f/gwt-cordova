package com.florianf.gwtcordova.client.plugin.screenorientation;

import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.*;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "screen")
public class Screen {

    @JsMethod(name = "lockOrientation")
    public static native void lockOrientation(String orientation);

    @JsMethod(name = "unlockOrientation")
    public static native void unlockOrientation();

    @JsProperty(name = "orientation")
    public static native ScreenOrientation getOrientation();

}
