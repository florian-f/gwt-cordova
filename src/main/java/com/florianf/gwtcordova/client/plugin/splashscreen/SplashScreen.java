package com.florianf.gwtcordova.client.plugin.splashscreen;

import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "navigator", name = "splashscreen")
public class SplashScreen {

    public static native void hide();

    public static native void show();

}
