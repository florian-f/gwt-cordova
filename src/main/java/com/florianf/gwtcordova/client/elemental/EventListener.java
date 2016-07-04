package com.florianf.gwtcordova.client.elemental;

import com.florianf.gwtcordova.client.elemental.Event;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface EventListener<T extends Event> {
    void handleEvent(T event);
}
