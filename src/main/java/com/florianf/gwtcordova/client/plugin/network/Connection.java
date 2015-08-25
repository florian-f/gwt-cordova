package com.florianf.gwtcordova.client.plugin.network;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * Created by florian on 21.08.15.
 *
 * https://github.com/apache/cordova-plugin-network-information
 *
 */
@JsType
public interface Connection {

    public static final String TYPE_UNKNOWN = "unknown";
    public static final String TYPE_ETHERNET = "ethernet";
    public static final String TYPE_WIFI = "wifi";
    public static final String TYPE_2G = "2g";
    public static final String TYPE_3G = "3g";
    public static final String TYPE_4G = "4g";
    public static final String TYPE_NONE = "none";

    @JsProperty
    public String getType();

    default public boolean onMobileData() {
        String connection = getType();
        return (connection.equals(TYPE_2G) || connection.equals(TYPE_3G) || connection.equals(TYPE_4G));
    }

    default public boolean onWifi() {
        return getType().equals(TYPE_WIFI);
    }
}
