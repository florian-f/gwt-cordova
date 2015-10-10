package com.florianf.gwtcordova.client.widget.event;

import com.florianf.gwtcordova.client.elemental.Event;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by florian on 08.10.15.
 */
public class StartCallButtonPressedEvent extends GwtEvent<StartCallButtonPressedEventHandler> {

    public static Type<StartCallButtonPressedEventHandler> TYPE = new Type<>();

    private com.florianf.gwtcordova.client.element.event.StartCallButtonPressedEvent nativeEvent;

    public StartCallButtonPressedEvent(Event nativeEvent) {
        this.nativeEvent = (com.florianf.gwtcordova.client.element.event.StartCallButtonPressedEvent) nativeEvent;
    }

    public Type<StartCallButtonPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(StartCallButtonPressedEventHandler handler) {
        handler.onStartCallButtonPressed(this);
    }

    public com.florianf.gwtcordova.client.element.event.StartCallButtonPressedEvent getNativeEvent() {
        return nativeEvent;
    }
}