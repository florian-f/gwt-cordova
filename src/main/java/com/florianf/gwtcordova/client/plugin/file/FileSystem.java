package com.florianf.gwtcordova.client.plugin.file;

import com.florianf.gwtcordova.client.myelemental.Function;
import com.google.gwt.core.client.js.JsNamespace;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType()
public interface FileSystem {

    DirectoryEntry getRoot();

    String getName();

    String toJSON();

    String encodeURIPath();

    @JsMethod(namespace = "window")
    void requestFileSystem(int type, int size, Function<Void, FileSystem> success, Function<Void, FileError> error);

}
