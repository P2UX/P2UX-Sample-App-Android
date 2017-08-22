package com.p2ux.sampleapp;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;

import com.p2ux.app.P2UXAppCreator;
import com.p2ux.app.P2UXAppFragmentActivity;
import com.p2ux.app.components.P2UXAppBehavior;
import com.p2ux.app.utils.P2UXAppTypes;
import com.p2ux.core.utils.P2UXLog;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * MainActivity
 * SampleApp
 *
 * Copyright © 2017 P2UX, Inc. All rights reserved.
 */

public class MainActivity extends P2UXAppFragmentActivity
{
    private static final String TAG = "MainActivity";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        // This is the key generated from Builder for the application. This key is needed to initialize the P2UX rendering framework.
        mAppKey = "0006.f058b95ac4e851b47424d19ff2cd4bf69ec70383187cb5fd0b02a2978f08d13e";      // Adopt A Pet app

        try {
            mResources = new JSONArray();
            JSONObject resource = new JSONObject();
            resource.put(P2UXAppTypes.P2UXApp_PackageAttrib_FormFactor, 0);
            resource.put(P2UXAppTypes.P2UXApp_PackageAttrib_Type, P2UXAppTypes.P2UXApp_PackageType_Static);
            resource.put(P2UXAppTypes.P2UXApp_PackageAttrib_Package, "shellui_phone");
            resource.put(P2UXAppTypes.P2UXApp_PackageAttrib_Update, P2UXAppTypes.P2UXApp_PackageUpdate_None);
            mResources.put(resource);
        }
        catch (JSONException e)
        {
            P2UXLog.e(TAG, "onCreate - " + e.getMessage());
        }

        if ((getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) == ApplicationInfo.FLAG_DEBUGGABLE) {
            if (savedInstanceState == null) {
                savedInstanceState = new Bundle();
            }
            savedInstanceState.putString(P2UXAppCreator.P2UXAppCreator_Opt_Env, P2UXAppCreator.P2UXAppCreator_Opt_Env_Prototype);
            savedInstanceState.putLong(P2UXAppCreator.P2UXAppCreator_Opt_LogLevel, P2UXLog.P2UXCoreLogFlagVerbose);
        }

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
