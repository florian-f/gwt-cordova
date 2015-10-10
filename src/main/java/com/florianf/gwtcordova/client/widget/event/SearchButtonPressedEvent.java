package com.florianf.gwtcordova.client.widget.event;

import com.florianf.gwtcordova.client.elemental.Event;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by florian on 08.10.15.
 */
public class SearchButtonPressedEvent extends GwtEvent<SearchButtonPressedEventHandler> {

    public static Type<SearchButtonPressedEventHandler> TYPE = new Type<>();

    private com.florianf.gwtcordova.client.element.event.SearchButtonPressedEvent nativeEvent;

    public SearchButtonPressedEvent(Event nativeEvent) {
        this.nativeEvent = (com.florianf.gwtcordova.client.element.event.SearchButtonPressedEvent) nativeEvent;
    }

    public Type<SearchButtonPressedEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(SearchButtonPressedEventHandler handler) {
        handler.onSearchButtonPressed(this);
    }

    public com.florianf.gwtcordova.client.element.event.SearchButtonPressedEvent getNativeEvent() {
        return nativeEvent;
    }
}