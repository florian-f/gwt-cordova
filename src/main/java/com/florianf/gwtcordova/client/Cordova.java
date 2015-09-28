package com.florianf.gwtcordova.client;

import com.florianf.gwtcordova.client.elemental.Event;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.florianf.gwtcordova.client.plugin.device.Device;
import com.florianf.gwtcordova.client.plugin.dialogs.Notification;
import com.florianf.gwtcordova.client.plugin.network.Connection;
import com.florianf.gwtcordova.client.plugin.statusbar.StatusBar;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;

/**
 * Created by florian on 09.08.15.
 */
public abstract class Cordova {

    // gwtphonegap
    private static final int INIT_TICK = 10;
    // gwtphonegap
    private static boolean deviceReady;

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

    // gwtphonegap
    public static native boolean isDeviceAvailable() /*-{
        return typeof(device) != 'undefined';
    }-*/;

    /**
     * gwt-api-generator
     * Returns the JsInterop instance of Document
     */
    public static com.florianf.gwtcordova.client.elemental.Document getDocument() {
        return ( com.florianf.gwtcordova.client.elemental.Document) Document.get();
    }
    // gwtphonegap
//    public static void initializeCordova(){
//        initializeCordova(10000);
//    }

    // gwtphonegap
    public static void initializeCordova(final int timeoutInMs,  DeviceReadyEvent.Listener listener) {

        com.florianf.gwtcordova.client.elemental.Document document = (com.florianf.gwtcordova.client.elemental.Document) Document.get();
//        document.addEventListener(DeviceReadyEvent.NAME, new DeviceReadyEvent.Listener() {
//
//            @Override
//            protected void handleEvent(DeviceReadyEvent deviceReadyEvent) {
//                deviceReady = true;
//                listener.handleEvent(deviceReadyEvent);
//            }
//        });
//        document.addEventListener("deviceready", new EventListener() {
//            public void handleEvent(Event event) {
//                Window.alert("Hi");
//            }
//
//        });
        final long end = System.currentTimeMillis() + timeoutInMs;
        if (isPhoneGapInitialized()) {

//            firePhoneGapAvailable();

        } else {
            Timer timer = new Timer() {

                @Override
                public void run() {
                    if (isPhoneGapInitialized()) {
//                        firePhoneGapAvailable();
                        return;
                    }

//                    if (System.currentTimeMillis() - end > 0) {
//                        handlerManager.fireEvent(new PhoneGapTimeoutEvent());
//                    } else {
                        schedule(INIT_TICK);
//                    }

                }
            };

            timer.schedule(INIT_TICK);
        }
    }

    // gwtphonegap
    public static boolean isPhoneGapInitialized() {
        return deviceReady;
    }

    // gwtphonegap
    protected void nativeDeviceReady() {
        deviceReady = true;
    }

}
