package com.florianf.gwtcordova.client.elemental;

import com.florianf.gwtcordova.client.elemental.Element;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative=true, namespace=GLOBAL)
public class HTMLElement extends Element {
    public static native void updateStyles();
}
