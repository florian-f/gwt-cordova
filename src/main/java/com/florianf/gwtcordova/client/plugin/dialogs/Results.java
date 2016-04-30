package com.florianf.gwtcordova.client.plugin.dialogs;

import jsinterop.annotations.JsType;


/**
 * Created by florian on 22.08.15.
 */
@JsType(isNative=true)
public class Results {
    public native int getButtonIndex();
    public native String getInput1();
}
