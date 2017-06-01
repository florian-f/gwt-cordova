package com.florianf.gwtcordova.client.plugin.contacts;

import com.google.gwt.core.client.JsArrayString;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ContactFindOptions {
	
	@JsProperty
	public String filter;
	
	@JsProperty
	public boolean multiple;

	@JsProperty
	public JsArrayString desiredFields;

	@JsProperty
	public boolean hasPhoneNumber;
	
	@JsOverlay
	public final void setDesiredFields(String[] fields) {
		this.desiredFields = JsArrayString.createArray().cast();
		for (String s : fields) {
			this.desiredFields.push(s);;
		}
	}
}
