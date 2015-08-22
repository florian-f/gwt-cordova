package com.florianf.client.cordova.plugin.dialogs;

import com.google.gwt.core.client.js.JsFunction;
import com.google.gwt.core.client.js.JsType;

/**
 * Created by florian on 22.08.15.
 */
@JsFunction
public interface PromptCallback {
    void apply(Results results);
}
