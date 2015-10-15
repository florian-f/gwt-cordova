package com.florianf.gwtcordova.client.plugin.camera;

import com.google.gwt.core.client.js.JsFunction;
import com.google.gwt.core.client.js.JsType;

/**
 * Created by florian on 15.10.15.
 */
@JsFunction
public interface CameraCallback {
    void apply(String msg);
}
