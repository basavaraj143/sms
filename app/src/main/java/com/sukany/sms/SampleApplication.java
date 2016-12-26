package com.sukany.sms;

import android.app.Application;

import com.beardedhen.androidbootstrap.TypefaceProvider;

/**
 * Created by basavaraj on 12/21/16.
 */

public class SampleApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    TypefaceProvider.registerDefaultIconSets();
  }
}
