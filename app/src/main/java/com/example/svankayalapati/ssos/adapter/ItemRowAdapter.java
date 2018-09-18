package com.example.svankayalapati.ssos.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.svankayalapati.ssos.R;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemRowAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<String> mArrSchoolData;

    HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

    public ItemRowAdapter(Context context, ArrayList<String> objects) {
        super();
        mContext = context;
        mArrSchoolData = objects;
        for (int i = 0; i < objects.size(); ++i) {
            mIdMap.put(objects.get(i), i);
        }
    }

    public int getCount() {
        // return the number of records
        return mArrSchoolData.size();
    }

    // getView method is called for each item of ListView
    public View getView(int position, View view, ViewGroup parent) {
        // inflate the layout for each item of listView
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.layout_itemrow, parent, false);


        // get the reference of textView and button
        TextView txtSchoolTitle = (TextView) view.findViewById(R.id.txtSchoolTitle);
        Button btnAction = (Button) view.findViewById(R.id.btnAction);

        // Set the title and button name
        txtSchoolTitle.setText(mArrSchoolData.get(position));
       btnAction.setBackgroundResource(R.drawable.icon_list_cart);

        // Click listener of button
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logic goes here
            }
        });

        return view;
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mArrSchoolData.get(position);
        //return position;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        String item = (String)getItem(position);
        return mIdMap.get(item);

    }}
