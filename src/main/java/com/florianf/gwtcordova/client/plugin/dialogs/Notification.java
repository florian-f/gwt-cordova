package com.florianf.gwtcordova.client.plugin.dialogs;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "notification")
public class Notification {

    public static native void alert(String message, Function<Void, Void> alertCallback, String title, String buttonName);

    public static native void confirm(String message, Function<Integer, Void> confirmCallback, String title, String[] buttonLabels);

    public static native void prompt(String message, Function<Results, Void> PromptCallback, String title, String[] buttonLabels, String defaultText);

    public static native void beep(int times);

}
