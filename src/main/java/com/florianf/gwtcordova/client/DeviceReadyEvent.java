package com.florianf.gwtcordova.client;

import com.florianf.gwtcordova.client.elemental.Event;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.google.gwt.core.client.js.JsType;

/**
 * Created by florian on 26.09.15.
 */
@JsType
public interface DeviceReadyEvent {

    static final String NAME = "deviceready";

    public abstract class Listener implements EventListener {
        protected abstract void handleEvent(DeviceReadyEvent deviceReadyEvent);

        @Override
        public void handleEvent(Event event) {
            handleEvent((DeviceReadyEvent) event);
        }
    }
}
