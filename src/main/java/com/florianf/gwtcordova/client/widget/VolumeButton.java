package com.florianf.gwtcordova.client.widget;

import com.florianf.gwtcordova.client.elemental.Event;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.florianf.gwtcordova.client.widget.event.VolumeDownButtonPressedEvent;
import com.florianf.gwtcordova.client.widget.event.VolumeDownButtonPressedEventHandler;
import com.florianf.gwtcordova.client.widget.event.VolumeUpButtonPressedEvent;
import com.florianf.gwtcordova.client.widget.event.VolumeUpButtonPressedEventHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by florian on 12.10.15.
 */
public class VolumeButton extends Widget{

    private static native com.florianf.gwtcordova.client.elemental.Document getDocument() /*-{
        return $doc;
    }-*/;

    public VolumeButton() {
        super();
        getDocument().addEventListener(com.florianf.gwtcordova.client.element.event.VolumeUpButtonPressedEvent.NAME, event -> {
            VolumeButton.this.fireEvent(new VolumeUpButtonPressedEvent(event));
            return null;
        }, true);

        getDocument().addEventListener(com.florianf.gwtcordova.client.element.event.VolumeDownButtonPressedEvent.NAME, event -> {
            VolumeButton.this.fireEvent(new VolumeDownButtonPressedEvent(event));
            return null;
        }, true);
    }


    public HandlerRegistration addVolumeUpButtonPressedHandler(VolumeUpButtonPressedEventHandler handler) {
        return addHandler(handler, VolumeUpButtonPressedEvent.TYPE);
    }

    public HandlerRegistration addVolumeDownButtonPressedHandler(VolumeDownButtonPressedEventHandler handler) {
        return addHandler(handler, VolumeDownButtonPressedEvent.TYPE);
    }
}
