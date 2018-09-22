package com.example.svankayalapati.ssos;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        final ListView listview = (ListView) findViewById(R.id.checkout_listview);

        ArrayList<String> myList = (ArrayList<String>) getIntent().getSerializableExtra("mylist");
        Toast.makeText(this, "Added to Cart: " +myList.toString(), Toast.LENGTH_LONG).show();
        final StableArrayAdapter1 adapter = new StableArrayAdapter1(this,
                android.R.layout.simple_list_item_1, myList);
        listview.setAdapter(adapter);


    }
    class StableArrayAdapter1 extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter1(Context context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            String item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }

}
