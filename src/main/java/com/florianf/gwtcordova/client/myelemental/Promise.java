package com.florianf.gwtcordova.client.myelemental;

import com.florianf.gwtcordova.client.myelemental.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative=true, namespace=GLOBAL)
public interface Promise {
    void then(com.florianf.gwtcordova.client.elemental.Function func);

    // Cannot use catch in java, using fail like jQuery does
    @JsMethod(name = "catch")
    void fail(com.florianf.gwtcordova.client.elemental.Function func);

    // Not in the native JS implementation
    // but used in some libs like pouchdb
    void on(Function func);
}
