package com.florianf.gwtcordova.client.elemental;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface Function<RET, ARG>  {
    public RET call(ARG arg);
}

