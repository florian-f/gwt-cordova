package com.florianf.gwtcordova.client.widget.event;

import com.florianf.gwtcordova.client.elemental.Event;
import com.google.gwt.event.shared.GwtEvent;

/**
 * Created by florian on 08.10.15.
 */
public class ResumeEvent extends GwtEvent<ResumeEventHandler> {

    public static Type<ResumeEventHandler> TYPE = new Type<>();

    private com.florianf.gwtcordova.client.element.event.ResumeEvent nativeEvent;

    public ResumeEvent(Event nativeEvent) {
        this.nativeEvent = (com.florianf.gwtcordova.client.element.event.ResumeEvent) nativeEvent;
    }

    public Type<ResumeEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(ResumeEventHandler handler) {
        handler.onResume(this);
    }

    public com.florianf.gwtcordova.client.element.event.ResumeEvent getNativeEvent() {
        return nativeEvent;
    }
}