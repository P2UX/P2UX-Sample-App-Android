package com.p2ux.sampleapp;

import android.os.Bundle;

import com.p2i.uxmobileapp.UXMobileAppFragmentActivity;
import com.p2i.uxmobileapp.components.UXMobileAppBehavior;

public class MainActivity extends UXMobileAppFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //You can get the app key or license key from builder for your app. This is required to link your builder up to your local app
        mAppKey = "0006.f058b95ac4e851b47424d19ff2cd4bf69ec70383187cb5fd0b02a2978f08d13e";

        super.onCreate(savedInstanceState);
        applyTranslucentStatusBar();
    }

    //This is a method from UXMobileAppBehavior
    // Here you call on your custom app behavior class
    @Override
    public UXMobileAppBehavior createBehavior(String appId) { return new SampleAppTestBehavior(getApplicationContext());}

}
