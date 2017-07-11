package com.p2ux.sampleapp;

import android.os.Bundle;

import com.p2i.uxcore.utils.UXLog;
import com.p2i.uxmobileapp.UXMobileAppFragmentActivity;

public class MainActivity extends UXMobileAppFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAppKey = ""; // APP KEY
        mLogLevel = UXLog.UXCoreLogLevelVerbose;
        setStaged(true);

        super.onCreate(savedInstanceState);
    }
}
