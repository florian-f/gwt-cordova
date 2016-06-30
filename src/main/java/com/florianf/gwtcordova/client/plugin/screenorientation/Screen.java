package com.florianf.gwtcordova.client.plugin.screenorientation;

import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
@JsType(isNative = true, namespace = JsNamespace.GLOBAL, name = "screen")
public class Screen {

    @JsMethod(name = "lockOrientation")
    public native void lockOrientation(String orientation);

    @JsMethod(name = "unlockOrientation")
    public native void unlockOrientation();

    @JsProperty(namespace = "screen", name="type")
    public native String getOrientation();

}
