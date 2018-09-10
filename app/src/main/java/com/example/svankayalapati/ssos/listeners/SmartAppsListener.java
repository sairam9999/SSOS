package com.example.svankayalapati.ssos.listeners;

import android.view.View;
import android.widget.RelativeLayout;

import com.example.svankayalapati.ssos.MainActivity;
import com.example.svankayalapati.ssos.R;

public class SmartAppsListener implements View.OnClickListener {

    private final MainActivity activity;

    public SmartAppsListener(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        if (activity.flag_smartapps) {
            if (activity.flag == false) {
                activity.place_order_linearlayout.setVisibility(View.INVISIBLE);


                RelativeLayout.LayoutParams params0 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                activity.placeorder_relativeLayout.removeView(activity.place_order);
                activity.placeorder_relativeLayout.removeView(activity.smart_apps);
                activity.placeorder_relativeLayout.removeView(activity.place_order_linearlayout);
                activity.placeorder_relativeLayout.addView(activity.place_order, params0);


                RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                params2.addRule(RelativeLayout.BELOW, R.id.place_order);
                activity.placeorder_relativeLayout.addView(activity.smart_apps, params2);
                activity.flag = !activity.flag;
            }
            activity.smartapps_gridlayout.setVisibility(View.VISIBLE);
            activity.flag_smartapps = !activity.flag_smartapps;
        } else {
            activity.smartapps_gridlayout.setVisibility(View.INVISIBLE);
            activity.flag_smartapps = !activity.flag_smartapps;
        }

    }
}
