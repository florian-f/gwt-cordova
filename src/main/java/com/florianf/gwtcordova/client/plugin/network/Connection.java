package com.florianf.gwtcordova.client.plugin.network;


import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by florian on 21.08.15.
 * <p/>
 * https://github.com/apache/cordova-plugin-network-information
 */
public class Connection {

    public static final String TYPE_UNKNOWN = "unknown";
    public static final String TYPE_ETHERNET = "ethernet";
    public static final String TYPE_WIFI = "wifi";
    public static final String TYPE_2G = "2g";
    public static final String TYPE_3G = "3g";
    public static final String TYPE_4G = "4g";
    public static final String TYPE_NONE = "none";

    @JsMethod(namespace = "navigator.network", name = "type")
    public static native String getType();

    public static boolean onMobileData() {
        String connection = getType();
        return (connection.equals(TYPE_2G) || connection.equals(TYPE_3G) || connection.equals(TYPE_4G));
    }

    public static boolean onWifi() {
        return getType().equals(TYPE_WIFI);
    }
}
//@JsType(isNative = true, namespace = "navigator", name = "network")
//public class Connection {
//
//    @JsIgnore
//    public static final String TYPE_UNKNOWN = "unknown";
//    @JsIgnore
//    public static final String TYPE_ETHERNET = "ethernet";
//    @JsIgnore
//    public static final String TYPE_WIFI = "wifi";
//    @JsIgnore
//    public static final String TYPE_2G = "2g";
//    @JsIgnore
//    public static final String TYPE_3G = "3g";
//    @JsIgnore
//    public static final String TYPE_4G = "4g";
//    @JsIgnore
//    public static final String TYPE_NONE = "none";
//
//    @JsProperty(name = "type")
//    public static native String getType();
//
//    @JsIgnore
//    public static boolean onMobileData() {
//        String connection = getType();
//        return (connection.equals(TYPE_2G) || connection.equals(TYPE_3G) || connection.equals(TYPE_4G));
//    }
//
//    @JsIgnore
//    public static boolean onWifi() {
//        return getType().equals(TYPE_WIFI);
//    }
//}
/*
GET /recompile/gwtcordovashowcase
[INFO]    Job com.florianf.gwtcordovashowcase.GwtCordovaShowcase_1_1
[INFO]       starting job: com.florianf.gwtcordovashowcase.GwtCordovaShowcase_1_1
[INFO]       Compiling module com.florianf.gwtcordovashowcase.GwtCordovaShowcase
[INFO]          Ignored 4 units with compilation errors in first pass.
[INFO] Compile with -strict or with -logLevel set to TRACE or DEBUG to see all errors.
[INFO]          Unification traversed 16861 fields and methods and 1578 types. 1545 are considered part of the current module and 1545 had all of their fields and methods traversed.
[INFO]          [ERROR] Errors in com/florianf/gwtcordova/client/plugin/network/Connection.java
[INFO]             [ERROR] Line 16: Native JsType field 'String Connection.TYPE_UNKNOWN' cannot have initializer.
[INFO]             [ERROR] Line 17: Native JsType field 'String Connection.TYPE_ETHERNET' cannot have initializer.
[INFO]             [ERROR] Line 18: Native JsType field 'String Connection.TYPE_WIFI' cannot have initializer.
[INFO]             [ERROR] Line 19: Native JsType field 'String Connection.TYPE_2G' cannot have initializer.
[INFO]             [ERROR] Line 20: Native JsType field 'String Connection.TYPE_3G' cannot have initializer.
[INFO]             [ERROR] Line 21: Native JsType field 'String Connection.TYPE_4G' cannot have initializer.
[INFO]             [ERROR] Line 22: Native JsType field 'String Connection.TYPE_NONE' cannot have initializer.
[INFO]             [ERROR] Line 28: Native JsType member 'boolean Connection.onMobileData()' cannot have @JsIgnore.
[INFO]             [ERROR] Line 34: Native JsType member 'boolean Connection.onWifi()' cannot have @JsIgnore.

 */