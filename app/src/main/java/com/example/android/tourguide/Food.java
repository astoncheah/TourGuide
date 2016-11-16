package com.example.android.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by cheah on 18/10/16.
 */

public class Food extends Fragment {
    private ListView rootView;
    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getActivity();
        rootView = new ListView(context);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<TourInfomation> list = new ArrayList<TourInfomation>();
        list.add(new TourInfomation(context.getString(R.string.food_heritage),0));
        list.add(new TourInfomation(context.getString(R.string.food_home_cook),0));
        list.add(new TourInfomation(context.getString(R.string.food_kuih),0));
        list.add(new TourInfomation(context.getString(R.string.food_nazlina),0));
        list.add(new TourInfomation(context.getString(R.string.food_simply_enak),0));
        list.add(new TourInfomation(context.getString(R.string.food_tour),0));
        list.add(new TourInfomation(context.getString(R.string.food_tropical_spice),0));

        MyListAdaptor listAdaptor = new MyListAdaptor(context,list);
        rootView.setAdapter(listAdaptor);
    }
}
