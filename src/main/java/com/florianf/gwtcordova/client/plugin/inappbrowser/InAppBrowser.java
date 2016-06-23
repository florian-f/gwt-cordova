package com.florianf.gwtcordova.client.plugin.inappbrowser;

import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
@JsType(isNative = true, namespace = "cordova", name = "InAppBrowser")
public class InAppBrowser {

    public static native void open(String url);

}
