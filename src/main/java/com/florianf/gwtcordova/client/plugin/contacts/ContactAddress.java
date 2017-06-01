package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ContactAddress {
	@JsProperty
	public String id;

	@JsProperty
	public String type;

	@JsProperty
	public String formatted;

	@JsProperty
	public String streetAddress;

	@JsProperty
	public String locality;

	@JsProperty
	public String region;

	@JsProperty
	public String postalCode;

	@JsProperty
	public String country;
}
