package com.example.svankayalapati.ssos.listeners;

import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.svankayalapati.ssos.MainActivity;
import com.example.svankayalapati.ssos.R;

public class PlaceOrderListener implements View.OnClickListener {
    MainActivity activity;

    public PlaceOrderListener(MainActivity activity) {
        this.activity = activity;


    }

    @Override
    public void onClick(View view) {
        if (activity.flag) {
            if (activity.flag_smartapps == false) {
                activity.smartapps_gridlayout.setVisibility(View.INVISIBLE);
                activity.flag_smartapps = !activity.flag_smartapps;
            }
            activity.place_order_linearlayout.setVisibility(View.VISIBLE);


            RelativeLayout.LayoutParams params0 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            activity.placeorder_relativeLayout.removeView(activity.place_order);
            activity.placeorder_relativeLayout.removeView(activity.smart_apps);
            activity.placeorder_relativeLayout.removeView(activity.place_order_linearlayout);
            activity.placeorder_relativeLayout.addView(activity.place_order, params0);

            RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            params1.addRule(RelativeLayout.BELOW, R.id.place_order);

            activity.placeorder_relativeLayout.addView(activity.place_order_linearlayout, params1);
            activity.place_order_linearlayout.setVisibility(View.VISIBLE);


            RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            params2.addRule(RelativeLayout.BELOW, R.id.place_order_linearlayout);
            activity.placeorder_relativeLayout.addView(activity.smart_apps, params2);
            activity.flag = !activity.flag;
        } else {
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
    }
}

