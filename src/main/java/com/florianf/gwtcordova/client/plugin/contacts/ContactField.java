package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "ContactField")
public class ContactField {

    @JsProperty
    public String type;

    @JsProperty
    public String value;

    @JsProperty
    public boolean pref;

    @JsConstructor
    public ContactField(String type, String value, boolean pref) {
    }
}
