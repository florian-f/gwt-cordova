package com.florianf.gwtcordova.client.plugin.mediacapture;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsType;

import java.util.List;

@JsType(isNative = true, namespace = "navigator.device", name = "capture")
public class Capture {

    public static native void captureAudio(Function<Void, List<MediaFile>> success, Function<Void, CaptureError> error);

    public static native void captureImage(Function<Void, List<MediaFile>> success, Function<Void, CaptureError> error);

    public static native void captureVideo(Function<Void, List<MediaFile>> success, Function<Void, CaptureError> error);

}
