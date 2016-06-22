package com.florianf.gwtcordova.client.plugin.devicemotion;

/**
 * Created by ffriemel on 22/06/16.
 */

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "navigator", name="accelerometer")
public class Accelerometer {
    public static native void getCurrentAcceleration(Function<Void, Acceleration> successCallback, Function<Void, String> errorCallback, AccelerometerOptions options);

    public static native void getCurrentAcceleration(Function<Void, Acceleration> successCallback, Function<Void, String> errorCallback);

    public static native int watchAcceleration(Function<Void, Acceleration> successCallback, Function<Void, String> errorCallback, AccelerometerOptions options);

    public static native int watchAcceleration(Function<Void, Acceleration> successCallback, Function<Void, String> errorCallback);

    public static native void clearWatch(int watchID);
}
