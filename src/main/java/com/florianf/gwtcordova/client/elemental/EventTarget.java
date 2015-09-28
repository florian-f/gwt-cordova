package com.florianf.gwtcordova.client.elemental;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface EventTarget {
//    void addEventListener(String type, EventListener listener);
    void addEventListener(String name, Function handleEvent, boolean capture);

}
