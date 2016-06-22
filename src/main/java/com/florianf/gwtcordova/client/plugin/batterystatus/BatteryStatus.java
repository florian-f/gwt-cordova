package com.florianf.gwtcordova.client.plugin.batterystatus;

import com.florianf.gwtcordova.client.myelemental.Event;
import jsinterop.annotations.JsProperty;

/**
 * Created by ffriemel on 21/06/16.
 */
public interface BatteryStatus extends Event
{
	@JsProperty(name = "level")
	int getLevel();

	@JsProperty(name = "isPlugged")
	boolean isPlugged();
}

