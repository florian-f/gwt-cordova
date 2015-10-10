package com.florianf.gwtcordova.client.widget.event;

import com.florianf.gwtcordova.client.elemental.Event;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by florian on 08.10.15.
 */
public class BackButtonPressedEvent extends GwtEvent<BackButtonPressedEventHandler> {

    public static Type<BackButtonPressedEventHandler> TYPE = new Type<>();

    private com.florianf.gwtcordova.client.element.event.BackButtonPressedEvent nativeEvent;

    public BackButtonPressedEvent(Event nativeEvent) {
        this.nativeEvent = (com.florianf.gwtcordova.client.element.event.BackButtonPressedEvent) nativeEvent;
    }

    public Type<BackButtonPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(BackButtonPressedEventHandler handler) {
        handler.onBackButtonPressed(this);
    }

    public com.florianf.gwtcordova.client.element.event.BackButtonPressedEvent getNativeEvent() {
        return nativeEvent;
    }
}