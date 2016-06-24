package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
@JsType
public interface ContactAddress {

    @JsProperty(name = "id")
    String getId();

    @JsProperty(name = "type")
    String getType();

    @JsProperty(name = "formatted")
    String getFormatted();

    @JsProperty(name = "streetaddress")
    String getStreetAddress();

    @JsProperty(name = "locality")
    String getLocality();

    @JsProperty(name = "region")
    String getRegion();

    @JsProperty(name = "postalCode")
    String getPostalCode();

    @JsProperty(name = "country")
    String getCountry();

}
