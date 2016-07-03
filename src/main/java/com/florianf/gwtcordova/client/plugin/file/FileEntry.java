package com.florianf.gwtcordova.client.plugin.file;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Entry")
public interface FileEntry {

    @JsProperty(name = "isFile")
    boolean isFile();

    @JsProperty(name = "isDirectory")
    boolean isDirectory();

    @JsProperty(name = "name")
    String getName();

    @JsProperty(name = "fullPath")
    String getFullPath();

    @JsProperty(name = "filesystem")
    FileSystem getFileSystem();

    String toURL();

    void createWriter(Function<Void, FileWriter> success, Function<Void, FileError> error);

    void file(Function<Void, File> success, Function<Void, FileError> error);
}
