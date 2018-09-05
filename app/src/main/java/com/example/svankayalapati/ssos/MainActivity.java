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
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView androidGridView;
    Button place_order;
    LinearLayout place_order_linearlayout;
    RelativeLayout placeorder_relativeLayout;
    Button more_apps_button;
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
        more_apps_button = (Button) findViewById(R.id.more_apps_button);

        place_order.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                place_order_linearlayout.setVisibility(View.VISIBLE);

                RelativeLayout.LayoutParams params0 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);

                RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                params1.addRule(RelativeLayout.BELOW, R.id.place_order);

                RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                params2.addRule(RelativeLayout.BELOW, R.id.place_order_linearlayout);

                placeorder_relativeLayout.addView(place_order, params0);
                placeorder_relativeLayout.addView(place_order_linearlayout, params1);
                placeorder_relativeLayout.addView(more_apps_button, params2);




            }
        });
    }
}
