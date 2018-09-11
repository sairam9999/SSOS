package com.example.svankayalapati.ssos.listeners;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.svankayalapati.ssos.MainActivity;

public class NewOrderListener implements View.OnClickListener {

    Button place_order;
    Context applicationContext;
    LinearLayout layout_placeorder;
    MainActivity activity;


    public NewOrderListener(Context applicationContext, MainActivity activity) {

        this.activity = activity;
        this.applicationContext = applicationContext;

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(applicationContext, "Place an Order", Toast.LENGTH_LONG).show();

        Intent createorder_intent = new Intent(activity, com.example.svankayalapati.ssos.PlaceOrder.class);
        activity.startActivity(createorder_intent);
    }



}



