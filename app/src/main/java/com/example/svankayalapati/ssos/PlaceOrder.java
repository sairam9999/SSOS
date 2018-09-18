package com.example.svankayalapati.ssos;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.svankayalapati.ssos.adapter.ItemRowAdapter;
import com.example.svankayalapati.ssos.db.Item;
import com.example.svankayalapati.ssos.db.ItemDetails;
import com.google.android.gms.common.util.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlaceOrder extends AppCompatActivity {
ItemDetails itemDetails = new ItemDetails();

Button rightpane_button;
TextView itemDescription_textview;
Button button_itemImage;
TextView textview_itemdescription1;
TextView textview_itemdescription2;
Context applicationContext;

public static int imageId_butter;
    public static int imageId_cane_sugar;
    public static int imageId_cheese;
    public static int imageId_eggs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
applicationContext = this;

        itemDescription_textview = (TextView) findViewById(R.id.itemsDescription_textview);
        button_itemImage = (Button) findViewById(R.id.button_itemImage);
        imageId_butter = R.drawable.butter;
        imageId_cane_sugar = R.drawable.cane_sugar;
        imageId_cheese = R.drawable.cheese;
        imageId_eggs = R.drawable.icons_eggs;
        textview_itemdescription1 = (TextView) findViewById(R.id.textview_itemdescription1);
        textview_itemdescription2 = (TextView) findViewById(R.id.textview_itemdescription2);

        itemDetails.init();

        /*

        mListview = (ListView) findViewById(R.id.listSchool);

        // Set some data to array list
        mArrData = new ArrayList<String>(Arrays.asList("111,222,333,444,555,666".split(",")));

        // Initialize adapter and set adapter to list view
        mAdapter = new SchoolAdapter(ListviewActivity.this, mArrData);
        mListview.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        */



        final ListView listview = (ListView) findViewById(R.id.place_order_listview);
        String[] values = new String[]{"Butter", "Cane Sugar", "Cheese", "Eggs", "Milk",
                "Nescafe", "Oil", "Pasta", "Rice", "Salt", "Sugar", "Wheat Bread",
        };

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }
       // ItemRowAdapter itemRowAdapter = new ItemRowAdapter(this, list);
       // listview.setAdapter(itemRowAdapter);
       // itemRowAdapter.notifyDataSetChanged();

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
                button_itemImage.setBackgroundResource(var.getImageId());
                textview_itemdescription1.setText(var.getDescription1());
                textview_itemdescription2.setText(var.getDescription2());
                textview_itemdescription1.setBackgroundResource(R.drawable.border_style);
                textview_itemdescription2.setBackgroundResource(R.drawable.border_style);

            }
        });
    }

    class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();
        private Activity mContext;
        private List<String> mArrSchoolData;
        public StableArrayAdapter(Activity context, int textViewResourceId,
                                  List<String> objects) {
            super(context, textViewResourceId, objects);
            mContext = context;
            mArrSchoolData = objects;
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }
        public View getView(int position, View view, ViewGroup parent){
           // LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            LayoutInflater inflater = mContext.getLayoutInflater();
            view = inflater.inflate(R.layout.layout_itemrow, null, true);


            // get the reference of textView and button
            TextView txtSchoolTitle = (TextView) view.findViewById(R.id.txtSchoolTitle);
            Button btnAction = (Button) view.findViewById(R.id.btnAction);

            // Set the title and button name
            txtSchoolTitle.setText(mArrSchoolData.get(position));
            btnAction.setBackgroundResource(R.drawable.icon_list_cart);

            // Click listener of button
//            btnAction.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    // Logic goes here
//
//                    Toast.makeText(applicationContext, "Place an Order" +view.getId(), Toast.LENGTH_LONG).show();
//                }
//            });

            return view;
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
