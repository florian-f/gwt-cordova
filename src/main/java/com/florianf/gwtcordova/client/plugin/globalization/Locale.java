package com.florianf.gwtcordova.client.plugin.globalization;

import jsinterop.annotations.JsProperty;

public interface Locale {
    @JsProperty(name = "value")
    String getValue();
}
