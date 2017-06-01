package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ContactOrganization {
	@JsProperty
	public boolean pref;

	@JsProperty
	public String type;

	@JsProperty
	public String name;

	@JsProperty
	public String department;

	@JsProperty
	public String tytle;
}
