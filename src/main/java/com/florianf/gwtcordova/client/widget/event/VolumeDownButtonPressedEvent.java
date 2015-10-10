package com.florianf.gwtcordova.client.widget.event;

import com.florianf.gwtcordova.client.elemental.Event;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by florian on 08.10.15.
 */
public class VolumeDownButtonPressedEvent extends GwtEvent<VolumeDownButtonPressedEventHandler> {

    public static Type<VolumeDownButtonPressedEventHandler> TYPE = new Type<>();

    private com.florianf.gwtcordova.client.element.event.VolumeDownButtonPressedEvent nativeEvent;

    public VolumeDownButtonPressedEvent(Event nativeEvent) {
        this.nativeEvent = (com.florianf.gwtcordova.client.element.event.VolumeDownButtonPressedEvent) nativeEvent;
    }

    public Type<VolumeDownButtonPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(VolumeDownButtonPressedEventHandler handler) {
        handler.onVolumeDownButtonPressed(this);
    }

    public com.florianf.gwtcordova.client.element.event.VolumeDownButtonPressedEvent getNativeEvent() {
        return nativeEvent;
    }
}