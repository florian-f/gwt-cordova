package com.florianf.gwtcordova.client.plugin.dialogs;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * Created by florian on 22.08.15.
 */
@JsType
public interface Results {
    @JsProperty int getButtonIndex();
    @JsProperty String getInput1();
}
