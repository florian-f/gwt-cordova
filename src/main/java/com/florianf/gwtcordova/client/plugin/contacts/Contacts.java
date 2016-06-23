package com.florianf.gwtcordova.client.plugin.contacts;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "navigator", name = "contacts")
public class Contacts {

    public static native void find(String[] fields, Function<Void, Contact[]> success, Function<Void, ContactError> error, ContactOptions contactOptions);

    public static native void pickContact(Function<Void, Contact> success, Function<Void, ContactError> error);

}
