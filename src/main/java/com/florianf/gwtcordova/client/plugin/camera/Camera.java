package com.florianf.gwtcordova.client.plugin.camera;


import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "navigator", name="camera")
public class Camera {

    public static native void getPicture(Function<Void, String> successCallback, Function<Void, String> errorCallback, CameraOptions cameraOptions);
}
