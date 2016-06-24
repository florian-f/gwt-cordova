package com.florianf.gwtcordova.client.plugin.file;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsType;

@JsType
public interface FileEntry {

    boolean isFile();

    boolean isDirectory();

    String getName();

    String getFullPath();

    FileSystem getFileSystem();

    void createWriter(Function<Void, FileWriter> success, Function<Void, FileError> error);

    void file(Function<Void, File> success, Function<Void, FileError> error);
}
