package com.florianf.gwtcordova.client.plugin.screenorientation.ios;

import com.florianf.gwtcordova.client.plugin.screenorientation.ScreenOrientation;

/**
 * Created by ffriemel on 28/06/16.
 */
public class ScreenOrientationIOS implements ScreenOrientation {

    private int angle = 0;

    private String type = "portrait";

    public ScreenOrientationIOS(int angle, String type) {
        this.angle = angle;
        this.type = type;
    }

    @Override

    public int getAngle() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }
}
