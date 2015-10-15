package com.florianf.gwtcordova.client;

import com.florianf.gwtcordova.client.elemental.Document;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.florianf.gwtcordova.client.plugin.camera.Camera;
import com.florianf.gwtcordova.client.plugin.device.Device;
import com.florianf.gwtcordova.client.plugin.dialogs.Notification;
import com.florianf.gwtcordova.client.plugin.network.Connection;
import com.florianf.gwtcordova.client.plugin.statusbar.StatusBar;

/**
 * Created by florian on 09.08.15.
 */
public abstract class Cordova {

//    <script type="text/javascript" src="cordova.js"></script>

//    var requester ='http://192.168.0.17:9876/recompile-requester/gwtcordovashowcase';
//    var tag = document.createElement('script');
//    tag.src = requester;
//    document.head.insertBefore(tag, document.head.firstElementChild);

    private static boolean deviceReady;

    /*
     * This is necessary until JSInterop 1.0 is ready.
     */
    public static native Device getDevice()/*-{
        return $wnd.device;
    }-*/;

    public static native Connection getConnection()/*-{
        return $wnd.navigator.connection;
    }-*/;

    public static native Notification getNotification()/*-{
        return $wnd.navigator.notification;
    }-*/;

    public static native StatusBar getStatusBar()/*-{
        return $wnd.StatusBar;
    }-*/;

    public static native Camera getCamera()/*-{
        return $wnd.navigator.camera;
    }-*/;

    // same as in com.google.gwt.dom.client.Document;
    private static native Document getDocument() /*-{
        return $doc;
    }-*/;

    // gwtphonegap
    public static native boolean isDeviceAvailable() /*-{
        return typeof(device) != 'undefined';
    }-*/;

    /**
     * from gwt-api-generator:
     * Returns the JsInterop instance of Document
     */

    public static void init(EventListener listener) {

        getDocument().addEventListener("deviceready", event -> {
            deviceReady = true;
            return null;
        }, true);
    }

    public static boolean isDeviceReady() {
        return deviceReady;
    }
}
