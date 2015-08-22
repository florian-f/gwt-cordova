package com.florianf.client;

import com.florianf.client.cordova.plugin.Cordova;
import com.florianf.client.cordova.plugin.device.Device;
import com.florianf.client.cordova.plugin.dialogs.ConfirmCallback;
import com.florianf.client.cordova.plugin.dialogs.Notification;
import com.florianf.client.cordova.plugin.network.Connection;
import com.florianf.client.gwtphonegap.PhoneGap;
import com.florianf.client.gwtphonegap.PhoneGapAvailableEvent;
import com.florianf.client.gwtphonegap.PhoneGapAvailableHandler;
import com.florianf.client.gwtphonegap.PhoneGapStandardImpl;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtCordova implements EntryPoint {

    public void onModuleLoad() {

//      Cordova.initializeCordova();
        PhoneGap phoneGap = GWT.create(PhoneGapStandardImpl.class);
        phoneGap.addHandler((PhoneGapAvailableEvent event) -> {

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


        });
        phoneGap.initializePhoneGap();
    }
}
