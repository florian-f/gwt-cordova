package com.florianf.client.cordova.plugin.dialogs;

import com.google.gwt.core.client.js.JsType;

/**
 * Created by florian on 22.08.15.
 */
@JsType
public interface Notification {

    void alert(String message, AlertCallback alertCallback, String title, String buttonName);

    void confirm(String message, ConfirmCallback confirmCallback, String title, String[] buttonLabels);

    void prompt(String message, PromptCallback callback, String title, String[] buttonLabels, String defaultText);

    void beep(int times);

//    default void prompt(String message, Callback callback) {
//        prompt(message, callback, "Prompt", new String[]{"OK", "Cancel"}, "");
//    }
//    default void prompt(String message, Callback callback, String title) {
//        prompt(message, callback, title, new String[]{"OK", "Cancel"}, "");
//    }
//    default void prompt(String message, Callback callback, String title, String[] buttonLabels) {
//        prompt(message, callback, title, buttonLabels, "");
//    }
}
