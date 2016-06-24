package com.florianf.gwtcordova.client.plugin.file;

import jsinterop.annotations.JsType;

@JsType
public interface File {

    String getName();

    String getFullPath();

    String getType();

    String getLastModifiedDate();

    String getSize();

    File slice(int start, int end);
}
