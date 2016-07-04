package com.florianf.gwtcordova.client.elemental;

import com.florianf.gwtcordova.client.elemental.Node;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative=true, namespace=GLOBAL)
public class Element extends Node {

    @JsProperty
    public static native String getInnerHTML();
    @JsProperty
    public static native void setInnerHTML(String s);

    @JsProperty
    public static native String getTextContent();
    @JsProperty
    public static native void setTextContent(String s);

}
