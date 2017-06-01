package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ContactName {
	@JsProperty
	public String familyName;

	@JsProperty
	public String formatted;

	@JsProperty
	public String givenName;

	@JsProperty
	public String honoricPrefix;

	@JsProperty
	public String honoricSuffix;

	@JsProperty
	public String middleName;
}
