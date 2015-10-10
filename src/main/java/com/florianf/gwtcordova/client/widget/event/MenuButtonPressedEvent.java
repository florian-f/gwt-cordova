package com.florianf.gwtcordova.client.widget.event;

import com.florianf.gwtcordova.client.elemental.Event;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by florian on 08.10.15.
 */
public class MenuButtonPressedEvent extends GwtEvent<MenuButtonPressedEventHandler> {

    public static Type<MenuButtonPressedEventHandler> TYPE = new Type<>();

    private com.florianf.gwtcordova.client.element.event.MenuButtonPressedEvent nativeEvent;

    public MenuButtonPressedEvent(Event nativeEvent) {
        this.nativeEvent = (com.florianf.gwtcordova.client.element.event.MenuButtonPressedEvent) nativeEvent;
    }

    public Type<MenuButtonPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(MenuButtonPressedEventHandler handler) {
        handler.onMenuButtonPressed(this);
    }

    public com.florianf.gwtcordova.client.element.event.MenuButtonPressedEvent getNativeEvent() {
        return nativeEvent;
    }
}