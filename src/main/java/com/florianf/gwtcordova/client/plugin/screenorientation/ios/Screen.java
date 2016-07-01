package com.florianf.gwtcordova.client.plugin.screenorientation.ios;

import com.florianf.gwtcordova.client.plugin.screenorientation.ScreenOrientation;
import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.*;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "screen")
public class Screen {

    @JsMethod(name = "lockOrientation")
    public static native void lockOrientation(String orientation);

    @JsMethod(name = "unlockOrientation")
    public static native void unlockOrientation();

    @JsProperty(name = "orientation")
    public static native String getOrientation();

}
