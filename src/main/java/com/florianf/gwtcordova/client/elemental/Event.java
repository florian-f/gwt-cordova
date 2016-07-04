package com.florianf.gwtcordova.client.elemental;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative=true, namespace=GLOBAL)
public interface Event {

    @JsProperty
    Detail getDetail();

    @JsProperty
    EventTarget getTarget();

    @JsType(isNative=true)
    interface Detail {
    }
}
