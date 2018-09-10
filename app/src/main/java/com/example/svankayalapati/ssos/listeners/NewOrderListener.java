package com.example.svankayalapati.ssos.listeners;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewOrderListener implements View.OnClickListener {

    Button place_order;
    Context applicationContext;

    public NewOrderListener(Context applicationContext, Button create_neworder) {

        this.place_order = create_neworder;
        this.applicationContext = applicationContext;

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(applicationContext, "Place an Order", Toast.LENGTH_LONG).show();
    }

}



