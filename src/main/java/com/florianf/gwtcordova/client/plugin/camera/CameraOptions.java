package com.florianf.gwtcordova.client.plugin.camera;

import jsinterop.annotations.JsProperty;

/**
 * Created by florian on 15.10.15.
 */
public class CameraOptions {
    // will *not* be 'undefined' in js if not set;
    // will be defined in the prototype, so getValue does not work as intended; prevent with @JsIgnore
    // camera.js uses default values if 'undefined'

    // problem in java: shouldn't have getters if possibly uninitialized
    // solution: java POJO from which the JsType is constructed
    // problem: pattern inconsistency (some are enums, others not)

    @JsProperty
    private int destinationType = CameraConstants.DestinationType.FILE_URI.getValue();

    
    @JsProperty
    private int cameraDirection = CameraConstants.Direction.BACK.getValue();

    
    @JsProperty
    private int quality = 50;

    
    @JsProperty
    private int sourceType = CameraConstants.PictureSourceType.CAMERA.getValue();

    
    @JsProperty
    private int targetWidth = -1;

    
    @JsProperty
    private int targetHeight = -1;

    
    @JsProperty
    private int encodingType = CameraConstants.EncodingType.JPEG.getValue();

    
    @JsProperty
    private int mediaType = CameraConstants.MediaType.PICTURE.getValue();

    
    @JsProperty
    private boolean allowEdit = false;

    
    @JsProperty
    private boolean correctOrientation = false;

    
    @JsProperty
    private boolean saveToPhotoAlbum = false;

    //    var popoverOptions = getValue(options.popoverOptions, null);

    public void setDestinationType(CameraConstants.DestinationType destinationType) {
        this.destinationType = destinationType.getValue();
    }

    public void setCameraDirection(CameraConstants.Direction direction) {
        this.cameraDirection = direction.getValue();
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setSourceType(CameraConstants.PictureSourceType sourceType) {
        this.sourceType = sourceType.getValue();
    }

    public void setTargetWidth(int targetWidth) {
        this.targetWidth = targetWidth;
    }

    public void setTargetHeight(int targetHeight) {
        this.targetHeight = targetHeight;
    }

    public void setEncodingType(CameraConstants.EncodingType encodingType) {
        this.encodingType = encodingType.getValue();
    }

    public void setMediaType(CameraConstants.MediaType mediaType) {
        this.mediaType = mediaType.getValue();
    }

    public void setAllowEdit(boolean allowEdit) {
        this.allowEdit = allowEdit;
    }

    public void setCorrectOrientation(boolean correctOrientation) {
        this.correctOrientation = correctOrientation;
    }

    public void setSaveToPhotoAlbum(boolean saveToPhotoAlbum) {
        this.saveToPhotoAlbum = saveToPhotoAlbum;
    }
}