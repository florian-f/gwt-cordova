package com.florianf.gwtcordova.client.elemental.myelemental;

import com.florianf.gwtcordova.client.elemental.myelemental.EventTarget;
import com.florianf.gwtcordova.client.elemental.myelemental.NodeList;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative=true, namespace=GLOBAL)
public class Node extends EventTarget {

    @JsProperty
    public static native NodeList getChildNodes();

    @JsProperty
    public static native Node getFirstChild();

    @JsProperty
    public static native Node getLastChild();

    public static native boolean hasChildNodes();

    public static native void appendChild(Object child);
    public static native void removeChild(Object child);
}
