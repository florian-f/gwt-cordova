package com.florianf.gwtcordova.client.elemental.myelemental;

import com.florianf.gwtcordova.client.elemental.myelemental.Node;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative=true, namespace=GLOBAL)
public class NodeList {

    @JsProperty
    public static native int getLength();

    public static native <T extends Node> T item(int index);
}
