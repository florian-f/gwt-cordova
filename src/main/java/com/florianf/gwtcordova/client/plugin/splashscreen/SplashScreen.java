package com.florianf.gwtcordova.client.plugin.splashscreen;

import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
@JsType(isNative = true, namespace = "navigator", name = "splashscreen")
public class SplashScreen {

    public static native void hide();

    public static native void show();

}
