package com.florianf.gwtcordova.client.elemental.myelemental;

//import com.florianf.gwtcordova.client.elemental.CSSStyleDeclaration;
//import com.florianf.gwtcordova.client.elemental.DOMTokenList;
import com.florianf.gwtcordova.client.elemental.myelemental.Node;
import com.florianf.gwtcordova.client.elemental.myelemental.NodeList;
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

//    @JsProperty
//    DOMTokenList getClassList();

//    @JsProperty
//    CSSStyleDeclaration getStyle();
//
//    void setAttribute(String name, Object value);
//    String getAttribute(String name);
//    boolean hasAttribute(String name);
//    void removeAttribute(String name);
//
//    <T extends Element> T querySelector(String selector);
//    NodeList querySelectorAll(String selector);
}
