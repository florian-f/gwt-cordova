package com.florianf.gwtcordova.client.plugin.contacts;

import com.florianf.gwtcordova.client.elemental.Function;
import com.google.gwt.core.client.JsArrayString;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "navigator", name = "contacts")
public class Contacts {

	public static native void find(JsArrayString fields, Function<Void, Contact[]> success, Function<Void, ContactError> error, ContactFindOptions contactOptions);

	public static native void pickContact(Function<Void, Contact> success, Function<Void, ContactError> error);

	public static native Contact create();

	@JsOverlay
	public static void find(String[] fields, Function<Void, Contact[]> success, Function<Void, ContactError> error, ContactFindOptions contactOptions) {
		JsArrayString jsa = JsArrayString.createArray().cast();
		for (String s : fields) {
			jsa.push(s);
		}
		find(jsa, success, error, contactOptions);
	}
}
