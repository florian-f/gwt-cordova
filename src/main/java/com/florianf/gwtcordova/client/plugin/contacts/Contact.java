package com.florianf.gwtcordova.client.plugin.contacts;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by ffriemel on 23/06/16.
 */
@JsType
public interface Contact {
//    id, displayName, name, nickname, phoneNumbers, emails, addresses,
//    ims, organizations, birthday, note, photos, categories, urls
    @JsProperty(name = "id")
    String getId();

    @JsProperty(name = "rawid")
    String getRawId();

    @JsProperty(name = "name")
    String getName();

    @JsProperty(name = "displayName")
    String getDisplayName();

    @JsProperty(name = "nickname")
    String getNickName();

    @JsProperty(name = "phoneNumbers")
    ContactField[] getPhoneNumbers();

    @JsProperty(name = "emails")
    ContactField[] getEmails();

    @JsProperty(name = "addresses")
    ContactAddress[] getAddresses();

    @JsProperty(name = "ims")
    ContactField[] getIms();

    @JsProperty(name = "organizations")
    ContactOrganization[] getOrganizations();

    @JsProperty(name = "birthday")
    ContactField[] getBirthday();

    @JsProperty(name = "note")
    String getNote();

    @JsProperty(name = "photos")
    ContactField[] getPhotos();

    @JsProperty(name = "categories")
    ContactField[] getCategories();

    @JsProperty(name = "urls")
    ContactField[] getUrls();

    Contact clone();

    void save(Function<Void, Contact> success, Function<Void, ContactError> error);
}
