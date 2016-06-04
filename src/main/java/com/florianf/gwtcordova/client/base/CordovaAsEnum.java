package com.florianf.gwtcordova.client.base;

import com.florianf.gwtcordova.client.elemental.Document;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.florianf.gwtcordova.client.plugin.camera.Camera;
import com.florianf.gwtcordova.client.plugin.device.Device;
import com.florianf.gwtcordova.client.plugin.dialogs.Notification;
import com.florianf.gwtcordova.client.plugin.network.Connection;
import com.florianf.gwtcordova.client.plugin.statusbar.StatusBar;

/**
 * Created by florian on 14.10.15.
 */
public enum CordovaAsEnum {
    INSTANCE;
    private boolean deviceReady;

    {
        getDocument().addEventListener("deviceready", event -> {
            deviceReady = true;
        });
    }

    /*
     * This is necessary until JSInterop 1.0 is ready.
     */
    private native Device getNativeDevice()/*-{
        return $wnd.device;
    }-*/;

    private native Connection getNativeConnection()/*-{
        return $wnd.navigator.connection;
    }-*/;

    private native Notification getNativeNotification()/*-{
        return $wnd.navigator.notification;
    }-*/;

    private native StatusBar getNativeStatusBar()/*-{
        return $wnd.StatusBar;
    }-*/;

    private native Camera getNativeCamera()/*-{
        return $wnd.navigator.camera;
    }-*/;

    // same as in com.google.gwt.dom.client.Document;
    private native Document getDocument() /*-{
        return $doc;
    }-*/;

    public boolean isDeviceReady() {
        return deviceReady;
    }

    public Device getDevice() {
        return getNativeDevice();
    }

    public Connection getConnection() {
        return getNativeConnection();
    }

    public Notification getNotification() {
        return getNativeNotification();
    }

    public StatusBar getStatusBar() {
        return getNativeStatusBar();
    }

    public Camera getCamera() { return getNativeCamera(); }
}
