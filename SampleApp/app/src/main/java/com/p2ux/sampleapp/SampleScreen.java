package com.p2ux.sampleapp;

import android.content.Context;
import android.graphics.Rect;

import com.p2ux.app.containers.P2UXScreen;
import com.p2ux.core.components.P2UXDefinition;
import com.p2ux.core.containers.P2UXViewContainerDelegate;

/**
 * SampleScreen
 * SampleApp
 *
 * Copyright © 2017 P2UX, Inc. All rights reserved.
 */

public class SampleScreen extends P2UXScreen
{
    SampleScreen(Context context)
    {
        super(context);
    }

    SampleScreen (Context context, Rect rect, P2UXDefinition def, P2UXViewContainerDelegate viewDelegate, Object index, Object data)
    {
        super(context, rect, def, viewDelegate, index, data);
    }
}
