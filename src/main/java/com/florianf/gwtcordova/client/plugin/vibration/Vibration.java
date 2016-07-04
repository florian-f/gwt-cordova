package com.florianf.gwtcordova.client.plugin.vibration;

import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsNamespace.GLOBAL, name = "navigator")
public class Vibration {

    public static native void vibrate(int time);

    public static native void vibrate(int[] Pattern);

    public static native void vibrateWithPattern(int[] time, int repeat);

    public static native void cancelVibration();

}
