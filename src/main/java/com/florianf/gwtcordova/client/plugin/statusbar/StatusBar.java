package com.florianf.gwtcordova.client.plugin.statusbar;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "StatusBar")
public class StatusBar {

    @JsProperty
    public static native boolean isVisible();

    public static native void overlaysWebView(boolean ios); // only useful on ios

    public static native void styleDefault();

    public static native void styleLightContent();

    public static native void styleBlackTranslucent();

    public static native void styleBlackOpaque();

    public static native void backgroundColorByName(String name);

    public static native void backgroundColorByHexString(String hexString);

    public static native void hide();

    public static native void show();
}
