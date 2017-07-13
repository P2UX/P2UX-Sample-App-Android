package com.p2ux.sampleapp;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;

import com.p2ux.app.components.P2UXAppBehavior;
import com.p2ux.app.containers.P2UXFragment;
import com.p2ux.app.containers.P2UXScreen;
import com.p2ux.core.components.P2UXDefinition;
import com.p2ux.core.components.P2UXElementInstance;
import com.p2ux.core.containers.P2UXPanel;
import com.p2ux.core.containers.P2UXViewContainerDelegate;

/**
 * SampleAppBehavior
 * SampleApp
 *
 * Copyright © 2017 P2UX, Inc. All rights reserved.
 */

class SampleAppBehavior extends P2UXAppBehavior
{
    /*
        Listed below are possible behaviors that can be customized for your app.
        Many feature the line:
        if (type.equals("xxxxx"))
        The user should replace "xxxxx" with an appropriate name of the item being customized.

        Other possible behaviors that can be customized can be found in P2UXAppBehavior.
     */
    SampleAppBehavior()
    {
        super();
    }

    /**
     * Creates a new instance of a screen.
     * This is called from a request to show a screen when a cached version of the view isn't available. Override this method to return a custom screen instance.
     *
     * @param def The view definition
     * @param rect A rect that defines the size to create the view
     * @param index An index value to pass to the view
     * @param data Additional data to pass to the view. This data can be used with linking
     * @param viewDelegate The current view delegate
     * @return A P2UXScreen instance of the view
     */
    @Override
    public P2UXScreen createScreen(Context context, P2UXDefinition def, RectF rect, Object index, Object data, P2UXViewContainerDelegate viewDelegate)
    {
        if (def.getSystemType().equals("xxxxx")) {
            //return some screen here, for example:
            return new SampleScreen(context, rect, def, viewDelegate, index, data);
        }
        return super.createScreen(context, def, rect, index, data, viewDelegate);
    }

    /**
     * Creates a fragment
     * This is called from a request to show a view.
     *
     * @param type The type of view
     * @param context The application context
     * @param def The view definition
     * @param fragmentDelegate The current fragment delegate
     * @param rect Rect representing size of viewFragment
     * @param cache Whether or not the to cache the view
     * @param index An index value to pass to the view fragment
     * @param data Additional data to pass to the view fragment
     * @param viewDelegate The current view delegate
     * @return a custom view fragment
     */
    public P2UXFragment createViewFragment(int type, Context context, P2UXDefinition def, P2UXFragment.UXFragmentDelegate fragmentDelegate, RectF rect, boolean cache, Object index, Object data, P2UXViewContainerDelegate viewDelegate)
    {
        if (def.getSystemType().equals("xxxxx")) {
            // return SampleFragment(type, context, def, fragmentDelegate, rect, cache, index, data, viewDelegate);
        }
        return super.createViewFragment(type, context, def, fragmentDelegate, rect, cache, index, data, viewDelegate);
    }

    /**
     * Create a custom panel
     * This is called from a request to show a panel when a cached version of a panel isn't available.
     *
     * @param context The application context
     * @param def The Panel definition
     * @param rect Rect representing size of panel
     * @param index An index value to pass to panel
     * @param data Additional data to pass to panel
     * @param viewDelegate The current view delegate
     * @return a custom panel
     */
    @Override
    public P2UXPanel createPanel(Context context, P2UXDefinition def, RectF rect, Object index, Object data, P2UXViewContainerDelegate viewDelegate)
    {
        if (def.getSystemType().equals("xxxxx")) {
            //return some screen here, for example:
            //return new SamplePanel(context, rect, def, viewDelegate, index, data);
        }
        return super.createPanel(context, def, rect, index, data, viewDelegate);
    }

    /**
     * Create a custom control
     * This is called from a request to a custom control.
     * @param type The type of the custom control
     * @param elemInstance
     * @param rect Rect representing size of the custom control area
     * @param viewDelegate The current viewDelegate
     * @param index An index value to pass to the control
     * @param data Additional data to pass to the control.
     * @return custom control
    */
    @Override
    public View createControl(String type, P2UXElementInstance elemInstance, RectF rect, P2UXViewContainerDelegate viewDelegate, Object index, Object data)
    {
        if (type != null && !type.isEmpty()) {
            if (type.equals("calendar")) {

                //This is where you would add your custom control code. Below is an example of implementing a calendar using CalendarView
                /*View ctrl = new CalendarView(mContext);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams((int)rect.width(), (int)rect.height());
                params.leftMargin = (int)rect.left;
                params.topMargin = (int)rect.top;
                ctrl.setLayoutParams(params);
                ((CalendarView) ctrl).setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                    @Override
                    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                        Toast.makeText(mContext, month+1 + "/" + dayOfMonth + "/" + year, Toast.LENGTH_SHORT).show();
                    }
                });
                return ctrl;*/
            }
        }
        return super.createControl(type, elemInstance, rect, viewDelegate, index, data);
    }
}
