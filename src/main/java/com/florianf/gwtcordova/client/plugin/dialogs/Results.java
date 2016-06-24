package com.florianf.gwtcordova.client.plugin.dialogs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

public class Results {

    @JsProperty(name = "buttonIndex")
    public native int getButtonIndex();

    @JsProperty(name = "getInput1")
    public native String getInput1();
}
