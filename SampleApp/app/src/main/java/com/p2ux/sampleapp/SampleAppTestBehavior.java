package com.p2ux.sampleapp;

import android.content.Context;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.CalendarView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.p2i.uxcore.components.UXElementInstance;
import com.p2i.uxcore.containers.UXViewContainerDelegate;
import com.p2i.uxmobileapp.components.UXMobileAppBehavior;

import java.util.HashMap;

/**
 * Created by han.nguyen on 7/7/17.
 */

class SampleAppTestBehavior extends UXMobileAppBehavior{

    private Context mContext;
    SampleAppTestBehavior (Context context){
        mContext = context;


    }

    /*
    @brief Create a custom control
    @discussion This is called from a request to a custom control.

    @param type The type of the custom control
    @param elemInstance
    @param Rect Rect representing size of the custom control area
    @param viewDelegate The current viewDelegate
    @param index An index value to pass to the control
    @param data Additional data to pass to the control.
    @return custom control


    */
    @Override
    public View createControlWithType(String type, UXElementInstance elemInstance, RectF rect, UXViewContainerDelegate viewDelegate, Object index, Object data)
    {
        View ctrl = null;
        if (type != null && !type.isEmpty()) {
            if (type.equals("calendar")) {

                //This is where you would add your custom control code. Below is an example of implementing a calendar using CalendarView


                /*ctrl = new CalendarView(mContext);
                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams((int)rect.width(), (int)rect.height());
                //params.leftMargin = (int)rect.left;
                //params.topMargin = (int)rect.top;
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
        return super.createControlWithType(type, elemInstance, rect, viewDelegate, index, data);
    }
    /*
    @brief Creates a viewcontroller
    @discussion This is called from a request to show a view.

    @param type The type of view
    @param context
    @param def The view definition
    @param fragmentDelegate The current fragment delegate
    @param rect Rect representing size of viewFragment
    @param cache Whether or not the to cache
    @param index An index value to pass to viewcontroller
    @param data Additional data to pass to viewcontroller
    @return A custom viewFragment

    @Override
    public UXFragment createViewFragment(int type, Context context, UXScreenDefinition def, UXFragment.UXFragmentDelegate fragmentDelegate, RectF rect, boolean cache, Object index, Object data, UXViewContainerDelegate viewDelegate)
    {
        return super.createViewFragment(type, context, def, fragmentDelegate, rect, cache, index, data, viewDelegate);
    }
    */

    /*
    @brief Create a custom panel
    @discussion This is called from a request to show a panel when a cached version of a panel isn't available.

    @param context
    @param def  Panel Defintion
    @param rect Rect representing size of panel
    @param index An index value to pass to panel
    @param data Additional data to pass to panel.
    @param viewDelegate The current view delegate
    @return A P2UXPanel instance of the panel

    @Override
    public UXPanel createPanelWithDef(Context context, UXScreenDefinition def, RectF rect, Object index, Object data, UXViewContainerDelegate viewDelegate)
    {
        return new UXPanel(context, rect, def, viewDelegate, index, data);
    }



     */

    /*
    @brief Setup Data auth
    @discussion This is called upon a request for auth

    @param type Type of auth
    @param Service Service requiring auth
    @param params Required params for auth
    @response
    @return Auth info
    @Override
    public void authRequiresParams(UXDataAuth.AuthType type, String service, HashMap<String, Object> params, UXDataAuth.UXAuthParamResponse response) {
        HashMap<String, Object> paramData = new HashMap<>();
        if (type == UXDataAuth.AuthType.OAuth) {
            switch (service) {
                case "Google":
                    paramData.put("client_id", "123456789");
                    paramData.put("client_secret", "abcdefghijk");
                    paramData.put("scope", "https://www.googleapis.com/auth/drive.readonly");
                    setParamResponse(response);
                    response.paramCallback(paramData);
                    return;
            }
        }
        super.authRequiresParams(type, service, params, response);
    }*/

}
