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

import com.example.svankayalapati.ssos.listeners.NewOrderListener;
import com.example.svankayalapati.ssos.listeners.PlaceOrderListener;
import com.example.svankayalapati.ssos.listeners.SmartAppsListener;

public class MainActivity extends AppCompatActivity {

    public boolean flag = true;
    public boolean flag_smartapps = true;
    public GridView androidGridView;
    public Button place_order;
    public Button create_neworder;
    public LinearLayout place_order_linearlayout;
    public RelativeLayout placeorder_relativeLayout;
    public Button smart_apps;
    public GridLayout smartapps_gridlayout;
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

        NewOrderListener newOrderListener = new NewOrderListener(getApplicationContext(), create_neworder);
        PlaceOrderListener placeOrderListener = new PlaceOrderListener(this);
        SmartAppsListener smartAppsListener = new SmartAppsListener(this);

        create_neworder.setOnClickListener(newOrderListener);
        place_order.setOnClickListener(placeOrderListener);
        smart_apps.setOnClickListener(smartAppsListener);

    }

}
