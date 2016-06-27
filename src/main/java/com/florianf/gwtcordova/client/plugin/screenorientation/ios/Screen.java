package com.florianf.gwtcordova.client.plugin.screenorientation.ios;

import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
@JsType(isNative = true, namespace = JsNamespace.GLOBAL, name = "screen")
public class Screen {

    @JsMethod(name = "lockOrientation")
    public static native void lockOrientation(String orientation);

    @JsMethod(name = "unlockOrientation")
    public static native void unlockOrientation();

    @JsProperty(name = "orientation")
    public static native String getOrientation();

}
