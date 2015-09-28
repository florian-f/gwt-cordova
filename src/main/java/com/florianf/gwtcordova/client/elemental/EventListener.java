package com.florianf.gwtcordova.client.elemental;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsType;

@JsType
@JsExport
public interface EventListener {
    void handleEvent(Event event);
}
