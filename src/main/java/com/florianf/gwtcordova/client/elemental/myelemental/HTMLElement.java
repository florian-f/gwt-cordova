package com.florianf.gwtcordova.client.elemental.myelemental;

import com.florianf.gwtcordova.client.elemental.myelemental.Element;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative=true, namespace=GLOBAL)
public class HTMLElement extends Element {
    /**
     * Polymer’s custom property shim evaluates and applies custom property values once at element creation time.
     * In order to have an element (and its subtree) re- evaluate custom property values due to dynamic changes
     * such as application of CSS classes, etc., call updateStyles().
     */
    public static native void updateStyles();
}
