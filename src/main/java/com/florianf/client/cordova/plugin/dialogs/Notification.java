package com.florianf.client.cordova.plugin.dialogs;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.js.JsType;

/**
 * Created by florian on 22.08.15.
 */
@JsType
public interface Notification {

    void alert(String message, Callback alertCallback, String title, String buttonName);

    void confirm(String message, ConfirmCallback confirmCallback, String title, String[] buttonLabels);

}
