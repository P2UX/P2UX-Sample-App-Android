package com.p2ux.sampleapp;

import android.os.Bundle;

import com.p2ux.app.P2UXAppCreator;
import com.p2ux.app.P2UXAppFragmentActivity;
import com.p2ux.app.components.P2UXAppBehavior;
import com.p2ux.core.utils.P2UXLog;

/**
 * MainActivity
 * SampleApp
 *
 * Copyright © 2017 P2UX, Inc. All rights reserved.
 */

public class MainActivity extends P2UXAppFragmentActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        //You can get the app key or license key from builder for your app. This is required to link your builder up to your local app
        // This is the key generated from Builder for the application. This key is needed to initialize the P2UX rendering framework.
        mAppKey = "0006.f058b95ac4e851b47424d19ff2cd4bf69ec70383187cb5fd0b02a2978f08d13e";      // Adopt A Pet app
        if (savedInstanceState == null) {
            savedInstanceState = new Bundle();
        }
        savedInstanceState.putString(P2UXAppCreator.P2UXAppCreator_Opt_Env, P2UXAppCreator.P2UXAppCreator_Opt_Env_Prototype);
        savedInstanceState.putLong(P2UXAppCreator.P2UXAppCreator_Opt_LogLevel, P2UXLog.P2UXCoreLogFlagVerbose);

        super.onCreate(savedInstanceState);
        applyTranslucentStatusBar();
    }

    /*
       This is the method from P2UXAppBehavior
       Here you can return an instance of your custom P2UXAppBehavior subclass from the behavior
       You can begin to override other parts of the application creation process
     */
    @Override
    public P2UXAppBehavior createBehavior(String appId)
    {
        return new SampleAppBehavior();
    }
}
