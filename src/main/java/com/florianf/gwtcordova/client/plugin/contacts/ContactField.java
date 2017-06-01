package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ContactField {

	@JsProperty
	public String type;

	@JsProperty
	public String value;

	@JsProperty
	public String pref;
}
