package com.example.svankayalapati.ssos.listeners;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.example.svankayalapati.ssos.CheckoutActivity;
import com.example.svankayalapati.ssos.PlaceOrder;

import java.util.ArrayList;


public class CheckOutListener implements View.OnClickListener {

    Intent intent;
    PlaceOrder placeOrder;
    public CheckOutListener(PlaceOrder activity) {
        this.placeOrder = activity;
            }

    @Override
    public void onClick(View view) {
       intent= new Intent(placeOrder, CheckoutActivity.class);

        intent.putExtra("mylist", placeOrder.checkout_arrayList);
        placeOrder.startActivity(intent);
    }

}
