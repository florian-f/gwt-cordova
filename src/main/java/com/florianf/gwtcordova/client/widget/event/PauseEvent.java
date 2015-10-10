package com.florianf.gwtcordova.client.widget.event;

import com.florianf.gwtcordova.client.elemental.Event;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by florian on 08.10.15.
 */
public class PauseEvent extends GwtEvent<PauseEventHandler> {

    public static Type<PauseEventHandler> TYPE = new Type<>();

    private com.florianf.gwtcordova.client.element.event.PauseEvent nativeEvent;

    public PauseEvent(Event nativeEvent) {
        this.nativeEvent = (com.florianf.gwtcordova.client.element.event.PauseEvent) nativeEvent;
    }

    public com.google.gwt.event.shared.GwtEvent.Type<PauseEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(PauseEventHandler handler) {
        handler.onPause(this);
    }

    public com.florianf.gwtcordova.client.element.event.PauseEvent getNativeEvent() {
        return nativeEvent;
    }
}