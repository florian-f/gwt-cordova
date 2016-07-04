package com.florianf.gwtcordova.client.plugin.camera;

public interface CameraConstants {

    enum DestinationType {
        DATA_URL(0), FILE_URI(1), NATIVE_URL(2);

        private int value;

        DestinationType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }


    enum EncodingType {
        JPEG(0), PNG(1);
        private int value;

        EncodingType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum MediaType {
        PICTURE(0), VIDEO(1), ALLMEDIA(2);
        private int value;

        MediaType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum PictureSourceType {
        PHOTOLIBRARY(0), CAMERA(1), SAVEDPHOTOALBUM(2);

        private int value;

        PictureSourceType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum PopoverArrowDirection {
        ARROW_UP(1), ARROW_DOWN(2), ARROW_LEFT(4), ARROW_RIGHT(8), ARROW_ANY(15);
        private int value;

        PopoverArrowDirection(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum Direction {

        BACK(0), FRONT(1);

        private int value;

        Direction(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    //    @JsType(isNative = true)

//    @JsType(isNative = true, namespace = "Camera", name="DestinationType")
//    static class DestinationType {
//
//        @JsProperty
//        public static int DATA_URL;
//        @JsProperty
//        public static int FILE_URI;
//        @JsProperty
//        public static int NATIVE_URI;
//    }
//    @JsType(isNative = true)
//    static class EncodingType {
//        @JsProperty
//        public static int JPEG;
//        @JsProperty
//        public static int PNG;
//    }
//    @JsType(isNative = true)
//    static class MediaType {
//        public static int PICTURE;
//        public static int VIDEO;
//        public static int ALLMEDIA;
//    }
//    @JsType(isNative = true)
//    static class PictureSourceType {
//        public static int PHOTOLIBRARY;
//        public static int CAMERA;
//        public static int SAVEDPHOTOALBUM;
//    }
//    @JsType(isNative = true)
//    static class PopoverArrowDirection {
//        public static int ARROW_UP;
//        public static int ARROW_DOWN;
//        public static int ARROW_LEFT;
//        public static int ARROW_RIGHT;
//        public static int ARROW_ANY;
//    }
//    @JsType(isNative = true)
//    static class Direction {
//        public static int BACK;
//        public static int FRONT;
//    }
}