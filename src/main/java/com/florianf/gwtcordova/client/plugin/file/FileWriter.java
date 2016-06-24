package com.florianf.gwtcordova.client.plugin.file;

import jsinterop.annotations.JsType;

@JsType
public interface FileWriter {

    void write(File file, boolean isPendingBlobReadResult);

}
