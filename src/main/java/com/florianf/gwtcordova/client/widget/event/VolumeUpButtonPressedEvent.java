package com.florianf.gwtcordova.client.widget.event;

import com.florianf.gwtcordova.client.elemental.Event;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by florian on 08.10.15.
 */
public class VolumeUpButtonPressedEvent extends GwtEvent<VolumeUpButtonPressedEventHandler> {

    public static Type<VolumeUpButtonPressedEventHandler> TYPE = new Type<>();

    private com.florianf.gwtcordova.client.element.event.VolumeUpButtonPressedEvent nativeEvent;

    public VolumeUpButtonPressedEvent(Event nativeEvent) {
        this.nativeEvent = (com.florianf.gwtcordova.client.element.event.VolumeUpButtonPressedEvent) nativeEvent;
    }

    public Type<VolumeUpButtonPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(VolumeUpButtonPressedEventHandler handler) {
        handler.onVolumeUpButtonPressed(this);
    }

    public com.florianf.gwtcordova.client.element.event.VolumeUpButtonPressedEvent getNativeEvent() {
        return nativeEvent;
    }
}