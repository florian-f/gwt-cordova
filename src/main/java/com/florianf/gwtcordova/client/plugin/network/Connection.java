package com.florianf.gwtcordova.client.plugin.network;

import jsinterop.annotations.JsProperty;

public class Connection {

    public static final String TYPE_UNKNOWN = "unknown";
    public static final String TYPE_ETHERNET = "ethernet";
    public static final String TYPE_WIFI = "wifi";
    public static final String TYPE_2G = "2g";
    public static final String TYPE_3G = "3g";
    public static final String TYPE_4G = "4g";
    public static final String TYPE_NONE = "none";

    @JsProperty(namespace = "navigator.network.connection", name = "type")
    public static native String getType();

    public static boolean onMobileData() {
        String connection = getType();
        return (connection.equals(TYPE_2G) || connection.equals(TYPE_3G) || connection.equals(TYPE_4G));
    }

    public static boolean onWifi() {
        return getType().equals(TYPE_WIFI);
    }
}