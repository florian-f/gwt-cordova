package com.florianf.gwtcordova.client.plugin.geolocation;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "navigator", name = "geolocation")
public class Geolocation {

    public static native void getCurrentPosition(Function<Void, Position> successCallback, Function<Void, PositionError> errorCallback, GeolocationOptions options);

    public static native void getCurrentPosition(Function<Void, Position> successCallback, Function<Void, PositionError> errorCallback);

    public static native int watchPosition(Function<Void, Position> successCallback, Function<Void, PositionError> errorCallback, GeolocationOptions options);

    public static native int watchPosition(Function<Void, Position> successCallback, Function<Void, PositionError> errorCallback);

    public static native void clearWatch(int watchId);
}
