package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
@JsType
public interface ContactAddress {

    String getId();

    String getType();

    String getFormatted();

    String getStreetAddress();

    String getLocality();

    String getRegion();

    String getPostalCode();

    String getCountry();

}
