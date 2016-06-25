package com.florianf.gwtcordova.client.plugin.deviceorientation;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "navigator", name = "compass")
public class Compass {
    public static native void getCurrentHeading(Function<Void, CompassHeading> successCallback, Function<Void, CompassError> errorCallback, CompassOptions options);
    public static native void getCurrentHeading(Function<Void, CompassHeading> successCallback, Function<Void, CompassError> errorCallback);

    public static native String watchHeading(Function<Void, CompassHeading> successCallback, Function<Void, CompassError> errorCallback, CompassOptions options);
    public static native String watchHeading(Function<Void, CompassHeading> successCallback, Function<Void, CompassError> errorCallback);

    public static native void clearWatch(String watchId);
}
