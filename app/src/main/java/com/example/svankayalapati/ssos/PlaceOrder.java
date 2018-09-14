package com.example.svankayalapati.ssos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.svankayalapati.ssos.db.Item;
import com.example.svankayalapati.ssos.db.ItemDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlaceOrder extends AppCompatActivity {
ItemDetails itemDetails = new ItemDetails();

Button rightpane_button;
TextView itemDescription_textview;
Button button_itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
        itemDetails.init();

        itemDescription_textview = (TextView) findViewById(R.id.itemsDescription_textview);
        button_itemImage = (Button) findViewById(R.id.button_itemImage);

        final ListView listview = (ListView) findViewById(R.id.place_order_listview);
        String[] values = new String[]{"Butter", "Cane Sugar", "Cheese", "Eggs", "Milk",
                "Nescafe", "Oil", "Pasta", "Rice", "Salt", "Sugar", "Wheat Bread",
        };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }
        final StableArrayAdapter adapter = new StableArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);

                Item var = itemDetails.getItemMap().get(item);
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append("Brand: ").append(var.getBrand()).append("\n\r").
                        append("Price:").append(var.getPrice()).append("\n\r").
                        append("Weight:").append(var.getWeight()).append("\r\n").
                        append("Container").append(var.getContainerType()).append("\r\n").
                        append("Description").append(var.getDescription());

                itemDescription_textview.setText(stringBuilder.toString());
            }
        });
    }

    class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
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
