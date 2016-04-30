package com.florianf.gwtcordova.client.elemental;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface EventListener<T extends Event> {
    void handleEvent(T event);
}
