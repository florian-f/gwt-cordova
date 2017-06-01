package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ContactOptions {
	@JsProperty
	public boolean multiple;

	@JsProperty
	public ContactField[] desiredFields;

	@JsProperty
	public boolean hasPhoneNumber;
}
