package com.florianf.gwtcordova.client.plugin.file;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsType;

@JsType
public interface DirectoryEntry {

    boolean isFile();

    boolean isDirectory();

    String getName();

    String getFullPath();

    FileSystem getFileSystem();

    void getDirectory(String Path, FileOptions options, Function<Void, DirectoryEntry> success, Function<Void, FileError> error);

    void removeRecursively(Function<Void, Void> success, Function<Void, FileError> error);

    void getFile(String path, FileOptions options, Function<Void, FileEntry> success, Function<Void, FileError> error);

}
