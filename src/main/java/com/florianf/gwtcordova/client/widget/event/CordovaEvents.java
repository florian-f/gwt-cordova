package com.florianf.gwtcordova.client.widget.event;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created by florian on 13.10.15.
 */
public class CordovaEvents extends Widget {
    private static native com.florianf.gwtcordova.client.elemental.Document getDocument() /*-{
        return $doc;
    }-*/;

    public CordovaEvents() {
        super();
        getDocument().addEventListener(com.florianf.gwtcordova.client.element.event.PauseEvent.NAME, event -> {
            CordovaEvents.this.fireEvent(new PauseEvent(event));
            return null;
        }, true);
        getDocument().addEventListener(com.florianf.gwtcordova.client.element.event.ResumeEvent.NAME, event -> {
            CordovaEvents.this.fireEvent(new ResumeEvent(event));
            return null;
        }, true);
    }


    public HandlerRegistration addPauseHandler(PauseEventHandler handler) {
        return addHandler(handler, PauseEvent.TYPE);
    }
    public HandlerRegistration addResumeHandler(ResumeEventHandler handler) {
        return addHandler(handler, ResumeEvent.TYPE);
    }
}
