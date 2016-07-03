package com.florianf.gwtcordova.client.plugin.filetransfer;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public interface FileTransferError {

    @JsProperty(name = "code")
    String getCode();

}
