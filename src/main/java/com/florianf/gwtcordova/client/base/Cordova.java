package com.florianf.gwtcordova.client.base;

public abstract class Cordova {

    class Event {
        public static final String DEVICE_READY = "deviceready";
        public static final String BACK_BUTTON = "backbutton";
        public static final String PAUSE = "pause";
        public static final String RESUME = "resume";
        public static final String MENU_BUTTON = "menubutton";
        public static final String START_CALL_BUTTON = "startcallbutton";
        public static final String END_CALL_BUTTON = "endcallbutton";
        public static final String VOLUME_UP_BUTTON = "volumeupbutton";
        public static final String VOLUME_DOWN_BUTTON = "volumedownbutton";
    }
}
