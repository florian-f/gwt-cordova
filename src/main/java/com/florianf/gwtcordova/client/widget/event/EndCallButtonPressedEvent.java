package com.florianf.gwtcordova.client.widget.event;

import com.florianf.gwtcordova.client.elemental.Event;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by florian on 08.10.15.
 */
public class EndCallButtonPressedEvent extends GwtEvent<EndCallButtonPressedEventHandler> {

    public static Type<EndCallButtonPressedEventHandler> TYPE = new Type<>();

    private com.florianf.gwtcordova.client.element.event.EndCallButtonPressedEvent nativeEvent;

    public EndCallButtonPressedEvent(Event nativeEvent) {
        this.nativeEvent = (com.florianf.gwtcordova.client.element.event.EndCallButtonPressedEvent) nativeEvent;
    }

    public Type<EndCallButtonPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(EndCallButtonPressedEventHandler handler) {
        handler.onEndCallButtonPressed(this);
    }

    public com.florianf.gwtcordova.client.element.event.EndCallButtonPressedEvent getNativeEvent() {
        return nativeEvent;
    }
}