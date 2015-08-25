package com.florianf.gwtcordova.client;

import com.florianf.gwtcordova.client.plugin.device.Device;
import com.florianf.gwtcordova.client.plugin.dialogs.Notification;
import com.florianf.gwtcordova.client.plugin.network.Connection;
import com.florianf.gwtcordova.client.plugin.statusbar.StatusBar;
import com.google.gwt.user.client.Timer;
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

    // gwtphonegap
    public static void initializeCordova(){
        initializeCordova(10000);
    }

    // gwtphonegap
    public static void initializeCordova(final int timeoutInMs) {

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

    // gwtphonegap
    private native void setupReadyHook() /*-{
        var that = this;
        var f = function() {
            that.@com.florianf.gwtcordova.client.Cordova::nativeDeviceReady()();
        };
        $doc.addEventListener("deviceready", $entry(f), false);
    }-*/;


    // gwtphonegap
//    private void firePhoneGapAvailable() {
//        if (!getDevice().isAvailable()) {
//            log("Device API is not available - logging will not work");
//            log("e.g.: plugman install --platform android  --project ./platforms/android/ --plugin org.apache.cordova.device");
//        } else {
//            phoneGapLog.setClientId(getDevice().getUuid());
//        }
//        handlerManager.fireEvent(new PhoneGapAvailableEvent());
//    }
}
