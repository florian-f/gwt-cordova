package com.florianf.gwtcordova.client.plugin.contacts;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface ContactError {

	@JsProperty
	int getCode();
}
