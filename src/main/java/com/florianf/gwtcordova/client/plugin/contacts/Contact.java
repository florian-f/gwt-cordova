package com.florianf.gwtcordova.client.plugin.contacts;

import com.florianf.gwtcordova.client.elemental.Function;
import com.google.gwt.core.client.JsDate;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface Contact {
	@JsProperty
	String getId();

	@JsProperty
	ContactName getName();
	@JsProperty
	void setName(ContactName name);

	@JsProperty
	String getDisplayName();
	@JsProperty
	void setDisplayName(String s);

	@JsProperty
	String getNickName();
	@JsProperty
	void setNickName(String s);

	@JsProperty
	ContactField[] getPhoneNumbers();
	@JsProperty
	void setPhoneNumbers(ContactField[] f);

	@JsProperty
	ContactField[] getEmails();
	@JsProperty
	void setEmails(ContactField[] f);

	@JsProperty
	ContactAddress[] getAddresses();
	@JsProperty
	void setAddresses(ContactAddress[] f);

	@JsProperty
	ContactField[] getIms();
	@JsProperty
	void setIms(ContactField[] f);

	@JsProperty
	ContactOrganization[] getOrganizations();
	@JsProperty
	void setOrganizations(ContactOrganization[] f);

	@JsProperty
	JsDate getBirthday();
	@JsProperty
	void setBirthday(JsDate d);

	@JsProperty
	String getNote();
	@JsProperty
	void setNote(String s);

	@JsProperty
	ContactField[] getPhotos();
	@JsProperty
	void setPhotos(ContactField[] f);

	@JsProperty
	ContactField[] getCategories();
	@JsProperty
	void setCategories(ContactField[] f);

	@JsProperty
	ContactField[] getUrls();
	@JsProperty
	void setUrls(ContactField[] f);

	Contact clone();

	void save(Function<Void, Contact> success, Function<Void, ContactError> error);
}
