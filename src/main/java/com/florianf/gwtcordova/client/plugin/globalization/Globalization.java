package com.florianf.gwtcordova.client.plugin.globalization;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "navigator", name="globalization")
public class Globalization {

    public static native void getPreferredLanguage(Function<Void, String> success, Function<Void, GlobalizationError> error);

    public static native void getLocaleName(Function<Void, String> success, Function<Void, GlobalizationError> error);

}
