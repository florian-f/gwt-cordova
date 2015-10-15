package com.florianf.gwtcordova.client.plugin.camera;

import com.google.gwt.core.client.js.JsType;

/**
 * Created by florian on 15.10.15.
 */
@JsType
public interface Camera {
    void getPicture(CameraCallback successCallback, CameraCallback errorCallback, CameraOptions cameraOptions);
}
