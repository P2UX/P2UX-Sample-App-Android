package com.p2ux.sampleapp;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;

import com.p2ux.app.P2UXAppCreator;
import com.p2ux.app.P2UXAppFragmentActivity;
import com.p2ux.app.components.P2UXAppBehavior;
import com.p2ux.app.utils.P2UXAppTypes;
import com.p2ux.core.utils.P2UXLog;

import java.util.ArrayList;
import java.util.HashMap;

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
        super.onCreate(savedInstanceState);

        // This is the key generated from Builder for the application. This key is needed to initialize the P2UX rendering framework.
        String appKey = "0006.f058b95ac4e851b47424d19ff2cd4bf69ec70383187cb5fd0b02a2978f08d13e";    // Adopt A Pet app
        ArrayList<HashMap<String, Object>> resources = new ArrayList<>();
        // Set up external resource
        HashMap<String, Object> phoneRes = new HashMap<>();
        phoneRes.put(P2UXAppTypes.P2UXApp_PackageAttrib_FormFactor, 0);
        phoneRes.put(P2UXAppTypes.P2UXApp_PackageAttrib_Type, P2UXAppTypes.P2UXApp_PackageType_Static);
        phoneRes.put(P2UXAppTypes.P2UXApp_PackageAttrib_Package, "shellui_phone");
        phoneRes.put(P2UXAppTypes.P2UXApp_PackageAttrib_Update, P2UXAppTypes.P2UXApp_PackageUpdate_None);
        resources.add(phoneRes);

        HashMap<String, Object> options = new HashMap<>();
        options.put(P2UXAppCreator.P2UXAppCreator_Opt_Env, P2UXAppCreator.P2UXAppCreator_Opt_Env_Recent);
        if ((getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) == ApplicationInfo.FLAG_DEBUGGABLE) {
            options.put(P2UXAppCreator.P2UXAppCreator_Opt_LogLevel, P2UXLog.P2UXCoreLogFlagVerbose);
        }
        options.put(P2UXAppCreator.P2UXAppCreator_Opt_PersistData, P2UXAppCreator.P2UXAppCreator_Opt_PersistData_Internal);

        super.setupApp(savedInstanceState, appKey, options, resources);
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
