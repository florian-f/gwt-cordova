package com.florianf.gwtcordova.client.plugin.devicemotion;

import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 22/06/16.
 */
@JsType(isNative=false)
public interface Acceleration {

    double getX();

    double getY();

    double getZ();

    String getTimeStamp();
}

