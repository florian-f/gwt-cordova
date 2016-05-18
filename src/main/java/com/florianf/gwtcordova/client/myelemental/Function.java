package com.florianf.gwtcordova.client.myelemental;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface Function<RET, ARG>  {
    public RET call(ARG arg);
}

