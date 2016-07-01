package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "name")
public interface ContactName {
    @JsProperty(name = "familyName")
    String getFamilyName();

    @JsProperty(name = "formatted")
    String getFormattedName();

    @JsProperty(name = "givenName")
    String getGivenName();

    @JsProperty(name = "honoricPrefix")
    String getHonoricPrefix();

    @JsProperty(name = "honoricSuffix")
    String getHonoricSuffix();

    @JsProperty(name = "middleName")
    String getMiddleName();
}
