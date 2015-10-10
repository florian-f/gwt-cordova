package com.florianf.gwtcordova.client.widget.event;

import com.google.gwt.event.shared.EventHandler;

/**
 * Created by florian on 08.10.15.
 */
public interface SearchButtonPressedEventHandler extends EventHandler {
    void onSearchButtonPressed(SearchButtonPressedEvent event);
}