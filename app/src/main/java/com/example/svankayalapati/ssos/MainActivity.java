package com.example.svankayalapati.ssos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean flag = true;
    boolean flag_smartapps = true;
    GridView androidGridView;
    Button place_order;
    Button create_neworder;
    LinearLayout place_order_linearlayout;
    RelativeLayout placeorder_relativeLayout;
    Button smart_apps;
    GridLayout smartapps_gridlayout;
    Integer[] imageIDs = {
            R.drawable.grocery, R.drawable.stationary, R.drawable.electricals,
            R.drawable.medicines, R.drawable.home_services, R.drawable.smarthome,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        place_order = (Button) findViewById(R.id.place_order);
        place_order_linearlayout = (LinearLayout) findViewById(R.id.place_order_linearlayout);
        placeorder_relativeLayout = (RelativeLayout) findViewById(R.id.place_order_relativelayout);
        smart_apps = (Button) findViewById(R.id.smart_apps);
        smartapps_gridlayout = (GridLayout) findViewById(R.id.smartapps_gridlayout);
        create_neworder = (Button) findViewById(R.id.create_neworder);

        create_neworder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Place an Order",Toast.LENGTH_LONG).show();
            }
        });

        place_order.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if (flag) {
                    if (flag_smartapps == false) {
                        smartapps_gridlayout.setVisibility(View.INVISIBLE);
                        flag_smartapps = !flag_smartapps;
                    }
                    place_order_linearlayout.setVisibility(View.VISIBLE);


                    RelativeLayout.LayoutParams params0 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
                    placeorder_relativeLayout.removeView(place_order);
                    placeorder_relativeLayout.removeView(smart_apps);
                    placeorder_relativeLayout.removeView(place_order_linearlayout);
                    placeorder_relativeLayout.addView(place_order, params0);

                    RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
                    params1.addRule(RelativeLayout.BELOW, R.id.place_order);

                    placeorder_relativeLayout.addView(place_order_linearlayout, params1);
                    place_order_linearlayout.setVisibility(View.VISIBLE);


                    RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
                    params2.addRule(RelativeLayout.BELOW, R.id.place_order_linearlayout);
                    placeorder_relativeLayout.addView(smart_apps, params2);
                    flag = !flag;
                } else {
                    place_order_linearlayout.setVisibility(View.INVISIBLE);


                    RelativeLayout.LayoutParams params0 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
                    placeorder_relativeLayout.removeView(place_order);
                    placeorder_relativeLayout.removeView(smart_apps);
                    placeorder_relativeLayout.removeView(place_order_linearlayout);
                    placeorder_relativeLayout.addView(place_order, params0);


                    RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
                    params2.addRule(RelativeLayout.BELOW, R.id.place_order);
                    placeorder_relativeLayout.addView(smart_apps, params2);
                    flag = !flag;

                }
            }
        });


        //OnClick Listener for Smart Apps Button

        smart_apps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (flag_smartapps) {
                    if (flag == false) {
                        place_order_linearlayout.setVisibility(View.INVISIBLE);


                        RelativeLayout.LayoutParams params0 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                                RelativeLayout.LayoutParams.WRAP_CONTENT);
                        placeorder_relativeLayout.removeView(place_order);
                        placeorder_relativeLayout.removeView(smart_apps);
                        placeorder_relativeLayout.removeView(place_order_linearlayout);
                        placeorder_relativeLayout.addView(place_order, params0);


                        RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                                RelativeLayout.LayoutParams.WRAP_CONTENT);
                        params2.addRule(RelativeLayout.BELOW, R.id.place_order);
                        placeorder_relativeLayout.addView(smart_apps, params2);
                        flag = !flag;
                    }
                    smartapps_gridlayout.setVisibility(View.VISIBLE);
                    flag_smartapps = !flag_smartapps;
                } else {
                    smartapps_gridlayout.setVisibility(View.INVISIBLE);
                    flag_smartapps = !flag_smartapps;
                }

            }
        });
    }

}
