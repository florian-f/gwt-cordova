package com.florianf.gwtcordova.client.plugin.contacts;

import com.florianf.gwtcordova.client.elemental.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface Contact {
	@JsProperty
	String getId();

	@JsProperty
	String getRawId();

	@JsProperty
	ContactName getName();

	@JsProperty
	String getDisplayName();

	@JsProperty
	String getNickName();

	@JsProperty
	ContactField[] getPhoneNumbers();

	@JsProperty
	ContactField[] getEmails();

	@JsProperty
	ContactAddress[] getAddresses();

	@JsProperty
	ContactField[] getIms();

	@JsProperty
	ContactOrganization[] getOrganizations();

	@JsProperty
	ContactField[] getBirthday();

	@JsProperty
	String getNote();

	@JsProperty
	ContactField[] getPhotos();

	@JsProperty
	ContactField[] getCategories();

	@JsProperty
	ContactField[] getUrls();

	Contact clone();

	void save(Function<Void, Contact> success, Function<Void, ContactError> error);
}
