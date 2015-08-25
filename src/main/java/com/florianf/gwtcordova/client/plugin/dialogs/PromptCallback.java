package com.florianf.gwtcordova.client.plugin.dialogs;

import com.google.gwt.core.client.js.JsFunction;

/**
 * Created by florian on 22.08.15.
 */
@JsFunction
public interface PromptCallback {
    void apply(Results results);
}
