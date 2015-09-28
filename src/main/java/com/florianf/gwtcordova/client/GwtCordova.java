package com.florianf.gwtcordova.client;

import com.florianf.gwtcordova.client.elemental.Event;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.florianf.gwtcordova.client.elemental.Function;
import com.florianf.gwtcordova.client.plugin.device.Device;
import com.florianf.gwtcordova.client.plugin.dialogs.Notification;
import com.florianf.gwtcordova.client.plugin.network.Connection;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtCordova implements EntryPoint {

    public void onModuleLoad() {

        com.florianf.gwtcordova.client.elemental.Document document = (com.florianf.gwtcordova.client.elemental.Document) Document.get();

        EventListener eventListener =  new EventListener() {
            @Override
            public void handleEvent(Event event) {
                Window.alert("HI");
            }
        };

        document.addEventListener("deviceready", event -> {
            RootPanel.get().add(new Button("meh"));
            Button button = new Button();

            Device device = Cordova.getDevice();
            Connection connection = Cordova.getConnection();
            RootPanel.get().add(button);
            button.setTitle(device.getUuid());
            button.setText(connection.getType());

            RootPanel.get().add(new Button(String.valueOf(connection.onMobileData())));

            final Button alertButton = new Button("alert");
            alertButton.addClickHandler(clickEvent -> {
                Notification notification = Cordova.getNotification();
                notification.alert("hello", () -> alertButton.setText("gurb"), "title", "ok");
            });
            RootPanel.get().add(alertButton);

            final Button confirmButton = new Button("confirm");
            confirmButton.addClickHandler(clickEvent -> {
                Notification notification = Cordova.getNotification();
                String[] arr = new String[]{"a", "b"};
                notification.confirm("hello", i -> confirmButton.setText("gurb"), "title", arr);
            });
            RootPanel.get().add(confirmButton);

            final Button promptButton = new Button("prompt");
            promptButton.addClickHandler(clickEvent -> {
                Notification notification = Cordova.getNotification();
                String[] arr = new String[]{"a", "b"};
                notification.prompt("hello", i -> {
                    if (i.getButtonIndex() == 1) promptButton.setText(i.getInput1());
                }, "title", arr, "adf");
            });
            RootPanel.get().add(promptButton);

            final Button beepButton = new Button("beep");
            beepButton.addClickHandler(clickEvent -> {
                Notification notification = Cordova.getNotification();
                notification.beep(1);
            });
            RootPanel.get().add(beepButton);
            return null;
        }, false);
//
//                Cordova.initializeCordova(10000, new DeviceReadyEvent.Listener() {
//                    @Override
//                    protected void handleEvent(DeviceReadyEvent deviceReadyEvent) {
//                        RootPanel.get().add(new Button("Hello"));
//
//                    }
//                });

//      Cordova.initializeCordova();
//                PhoneGap phoneGap = GWT.create(PhoneGapStandardImpl.class);
//        phoneGap.addHandler((PhoneGapAvailableEvent event) -> {
//
//            RootPanel.get().add(new Button("meh"));
//            Button button = new Button();
//
//            Device device = Cordova.getDevice();
//            Connection connection = Cordova.getConnection();
//            RootPanel.get().add(button);
//            button.setTitle(device.getUuid());
//            button.setText(connection.getType());
//
//            RootPanel.get().add(new Button(String.valueOf(connection.onMobileData())));
//
//            final Button alertButton = new Button("alert");
//            alertButton.addClickHandler(clickEvent -> {
//                Notification notification = Cordova.getNotification();
//                notification.alert("hello", () -> alertButton.setText("gurb"), "title", "ok");
//            });
//            RootPanel.get().add(alertButton);
//
//            final Button confirmButton = new Button("confirm");
//            confirmButton.addClickHandler(clickEvent -> {
//                Notification notification = Cordova.getNotification();
//                String[] arr = new String[]{"a", "b"};
//                notification.confirm("hello", i -> confirmButton.setText("gurb"), "title", arr);
//            });
//            RootPanel.get().add(confirmButton);
//
//            final Button promptButton = new Button("prompt");
//            promptButton.addClickHandler(clickEvent -> {
//                Notification notification = Cordova.getNotification();
//                String[] arr = new String[]{"a", "b"};
//                notification.prompt("hello", i -> {
//                    if (i.getButtonIndex() == 1) promptButton.setText(i.getInput1());
//                }, "title", arr, "adf");
//            });
//            RootPanel.get().add(promptButton);
//
//            final Button beepButton = new Button("beep");
//            beepButton.addClickHandler(clickEvent -> {
//                Notification notification = Cordova.getNotification();
//                notification.beep(1);
//            });
//            RootPanel.get().add(beepButton);
//
//
//        });
//        phoneGap.initializePhoneGap();
    }
}
