package com.florianf.gwtcordova.client.plugin.statusbar;


import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Created by florian on 22.08.15.
 *
 * https://github.com/apache/cordova-plugin-statusbar
 *
 */
@JsType
public interface StatusBar {

    @JsProperty
    boolean isVisible();

    void overlaysWebView(boolean ios); // only useful on ios

    void styleDefault();

    void styleLightContent();

    void styleBlackTranslucent();

    void styleBlackOpaque();

    void backgroundColorByName(String name);

    void backgroundColorByHexString(String hexString);

    void hide();

    void show();
}
