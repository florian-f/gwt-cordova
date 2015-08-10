package com.florianf.client;

import com.florianf.client.gwtphonegap.PhoneGap;
import com.florianf.client.gwtphonegap.PhoneGapAvailableEvent;
import com.florianf.client.gwtphonegap.PhoneGapAvailableHandler;
import com.florianf.client.gwtphonegap.PhoneGapStandardImpl;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.ParagraphElement;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtCordova implements EntryPoint {

//    Button button = new Button();
//
//    Device device;

    public void onModuleLoad() {

//      Cordova.initializeCordova();
        PhoneGap phoneGap = GWT.create(PhoneGapStandardImpl.class);
        phoneGap.addHandler(new PhoneGapAvailableHandler() {
            @Override
            public void onPhoneGapAvailable(PhoneGapAvailableEvent event) {
                RootPanel.get().add(new Button("meh"));
                Button button = new Button();

//                Device device = GWT.create(Device.class);
                Device device = (Device) Cordova.getDevice();

                RootPanel.get().add(button);
                button.setTitle(device.getUuid());
                button.setText(device.getPlatform());


            }
        });
        phoneGap.initializePhoneGap();
//        Timer timer = new Timer() {
//
//            @Override
//            public void run() {
//                if (Cordova.isDeviceAvailable()) {
//                    getDevice();
//                }
//
//                schedule(10);
//            }
//        };
//
//        timer.schedule(10);

//        RootPanel.get().add(button);
//        this.device = Cordova.getDevice();
//        this.button.setTitle(device.getUuid());
//        this.button.setText(device.getPlatform());
//        getDevice();
    }
//    private void getDevice() {
//        this.device = Cordova.getDevice();
//        this.button.setTitle(device.getUuid());
//        this.button.setText(device.getPlatform());
//    }
}
