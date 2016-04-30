package com.florianf.gwtcordova.client.plugin.network;


import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by florian on 21.08.15.
 * <p/>
 * https://github.com/apache/cordova-plugin-network-information
 */
@JsType(isNative = true, namespace = "navigator", name = "network")
public class Connection {

    public static final String TYPE_UNKNOWN = "unknown";
    public static final String TYPE_ETHERNET = "ethernet";
    public static final String TYPE_WIFI = "wifi";
    public static final String TYPE_2G = "2g";
    public static final String TYPE_3G = "3g";
    public static final String TYPE_4G = "4g";
    public static final String TYPE_NONE = "none";

    @JsProperty(name = "type")
    public static native String getType();

    @JsIgnore
    public static boolean onMobileData() {
        String connection = getType();
        return (connection.equals(TYPE_2G) || connection.equals(TYPE_3G) || connection.equals(TYPE_4G));
    }

    @JsIgnore
    public static boolean onWifi() {
        return getType().equals(TYPE_WIFI);
    }
}
