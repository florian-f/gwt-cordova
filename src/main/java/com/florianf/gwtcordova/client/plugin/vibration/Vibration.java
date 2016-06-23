package com.florianf.gwtcordova.client.plugin.vibration;

import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 22/06/16.
 */
@JsType(isNative = true, namespace = JsNamespace.GLOBAL, name = "navigator")
public class Vibration {

    public static native void vibrate(Integer time);

    public static native void vibrate(Integer[] Pattern);

    public static native void vibrateWithPattern(Integer[] time, Integer repeat);

    public static native void cancelVibration();

}
