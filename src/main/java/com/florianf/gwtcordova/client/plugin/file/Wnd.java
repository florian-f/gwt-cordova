package com.florianf.gwtcordova.client.plugin.file;

import com.florianf.gwtcordova.client.elemental.myelemental.Function;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "window")
public class Wnd {
    public static native void requestFileSystem(int type, int size, Function<Void, FileSystem> success, Function<Void, FileError> error);
}
