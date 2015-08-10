/*
 * Copyright 2010 Daniel Kurka
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.florianf.client.gwtphonegap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Timer;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.google.web.bindery.event.shared.SimpleEventBus;


import java.util.HashMap;
import java.util.Map;

public class PhoneGapStandardImpl implements PhoneGap {

  private static final int INIT_TICK = 10;


//  private Map<String, PhoneGapPlugin> plugins = new HashMap<String, PhoneGapPlugin>();

  private boolean hasHandlers = false;
  private EventBus handlerManager = new SimpleEventBus();


  private boolean deviceReady;


  public PhoneGapStandardImpl() {
    // log configures it self
//    getLog();

    setupReadyHook();
  }

  @Override
  public boolean isPhoneGapInitialized() {
    return deviceReady;
  }

  @Override
  public void initializePhoneGap() {
    initializePhoneGap(10000);
  }

  @Override
  public void initializePhoneGap(final int timeoutInMs) {

    final long end = System.currentTimeMillis() + timeoutInMs;
    if (isPhoneGapInitialized()) {

      firePhoneGapAvailable();

    } else {
      Timer timer = new Timer() {

        @Override
        public void run() {
          if (isPhoneGapInitialized()) {
            firePhoneGapAvailable();
            return;
          }

          if (System.currentTimeMillis() - end > 0) {
            handlerManager.fireEvent(new PhoneGapTimeoutEvent());
          } else {
            schedule(INIT_TICK);
          }

        }
      };

      timer.schedule(INIT_TICK);
    }
  }

  @Override
  public HandlerRegistration addHandler(PhoneGapAvailableHandler handler) {
    hasHandlers = true;
    return handlerManager.addHandler(PhoneGapAvailableEvent.TYPE, handler);
  }

  @Override
  public HandlerRegistration addHandler(PhoneGapTimeoutHandler handler) {
    hasHandlers = true;
    return handlerManager.addHandler(PhoneGapTimeoutEvent.TYPE, handler);
  }



  private void firePhoneGapAvailable() {
//    if (!getDevice().isAvailable()) {
//      log("Device API is not available - logging will not work");
//      log("e.g.: plugman install --platform android  --project ./platforms/android/ --plugin org.apache.cordova.device");
//    } else {
//      phoneGapLog.setClientId(getDevice().getUuid());
//    }
    handlerManager.fireEvent(new PhoneGapAvailableEvent());
  }


  @Override
  public boolean isPhoneGapDevice() {
    return true;
  }

//  protected Device constructDevice() {
//    return GWT.create(Device.class);
//  }


  protected void nativeDeviceReady() {
    deviceReady = true;
  }

  private native void setupReadyHook() /*-{
		var that = this;
		var f = function() {
			that.@com.florianf.client.gwtphonegap.PhoneGapStandardImpl::nativeDeviceReady()();
		};
		$doc.addEventListener("deviceready", $entry(f), false);

  }-*/;

  @Override
  public void setEventBus(EventBus eventBus) {
    assert !hasHandlers : "The handlerManager can not be replaced because it has got handlers";
    handlerManager = eventBus;
    // We force the event construction so as the app can add events directly
    // to the eventBus instead of through the phoneGap.getEvent() method;
//    event = constructEvent();
  }

}
