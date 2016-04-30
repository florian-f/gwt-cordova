package com.florianf.gwtcordova.client.plugin.device;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by florian on 09.08.15.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "device")
public class Device {

    @JsProperty(name = "available")
    public static native String getAvailable();

    @JsProperty(name = "platform")
    public static native String getPlatform();

    @JsProperty(name = "version")
    public static native String getVersion();

    @JsProperty(name = "uuid")
    public static native String getUuid();

    @JsProperty(name = "cordova")
    public static native String getCordova();

    @JsProperty(name = "model")
    public static native String getModel();

    @JsProperty(name = "manufacturer")
    public static native String getManufacturer();

}
