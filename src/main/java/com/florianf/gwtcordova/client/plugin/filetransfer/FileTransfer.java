package com.florianf.gwtcordova.client.plugin.filetransfer;

import com.florianf.gwtcordova.client.elemental.Function;
import com.florianf.gwtcordova.client.plugin.file.FileEntry;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class FileTransfer {

    public native void download(String uri, String fileUrl, Function<Void, FileEntry> success, Function<Void, FileTransferError> error);
}
