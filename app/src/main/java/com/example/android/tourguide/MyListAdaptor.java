package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cheah on 18/10/16.
 */

public class MyListAdaptor extends ArrayAdapter<TourInfomation> {
    public MyListAdaptor(Context context, ArrayList<TourInfomation> list) {
        super(context, 0 , list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }
        TourInfomation tourInfo = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textView);
        nameTextView.setText(tourInfo.getName());

        int id = tourInfo.getImgResId();
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageView);
        //if id is not 0, add image
        if(id!=0){
            iconView.setImageResource(tourInfo.getImgResId());
        }else{
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
