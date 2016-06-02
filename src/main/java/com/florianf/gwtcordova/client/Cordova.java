package com.florianf.gwtcordova.client;

import com.florianf.gwtcordova.client.elemental.*;
import com.florianf.gwtcordova.client.elemental.Document;
import com.florianf.gwtcordova.client.elemental.Event;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.florianf.gwtcordova.client.elemental.EventTarget;
import com.florianf.gwtcordova.client.myelemental.*;
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

    public static void init() {

        com.florianf.gwtcordova.client.myelemental.Document.addEventListener("deviceready", event1 -> {});
        com.florianf.gwtcordova.client.myelemental.Document.addEventListener("deviceready", new com.florianf.gwtcordova.client.myelemental.EventListener() {
            @Override
            public void handleEvent(Event event) {

            }
        });

        getDocument().addEventListener("deviceready", event -> {
            deviceReady = true;
        });
    }

    public static void init(EventListener eventListener) {
        getDocument().addEventListener("deviceready", eventListener);
        init();
    }

    public static void onReady(com.florianf.gwtcordova.client.myelemental.EventListener eventListener) {
        if (deviceReady) {
           eventListener.handleEvent(new Event() {
               @Override
               public Detail getDetail() {
                   return null;
               }

               @Override
               public EventTarget getTarget() {
                   return null;
               }
           });
        } else {
            com.florianf.gwtcordova.client.myelemental.Document.addEventListener("deviceready", eventListener);
        }
    }


    public static boolean isDeviceReady() {
        return deviceReady;
    }
}
