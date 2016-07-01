package com.florianf.gwtcordova.client.plugin.batterystatus;

import com.florianf.gwtcordova.client.myelemental.Event;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "status")
public interface BatteryStatus extends Event {
    @JsProperty(name = "level")
    int getLevel();

    @JsProperty(name = "isPlugged")
    boolean isPlugged();
}

