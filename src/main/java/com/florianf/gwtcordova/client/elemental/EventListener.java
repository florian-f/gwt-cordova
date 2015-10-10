package com.florianf.gwtcordova.client.elemental;

import com.google.gwt.core.client.js.JsFunction;

@JsFunction
public interface EventListener {
    Object call (Event event);
}
