package com.florianf.gwtcordova.client.plugin.dialogs;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Created by florian on 22.08.15.
 *
 * https://github.com/apache/cordova-plugin-dialogs
 *
 */
public class Notification {

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native void alert(String message, Function<Void, Void> alertCallback, String title, String buttonName);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native void confirm(String message, Function<Integer, Void> confirmCallback, String title, String[] buttonLabels);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native void prompt(String message, Function<Results, Void> PromptCallback, String title, String[] buttonLabels, String defaultText);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native void beep(int times);

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
