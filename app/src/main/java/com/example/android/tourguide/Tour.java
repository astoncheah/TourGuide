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

public class Tour extends Fragment {
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
        list.add(new TourInfomation(context.getString(R.string.tours_auch),R.drawable.tour_auch));
        list.add(new TourInfomation(context.getString(R.string.tours_entopia),R.drawable.tour_entopia));
        list.add(new TourInfomation(context.getString(R.string.tours_esca),R.drawable.tour_escape));
        list.add(new TourInfomation(context.getString(R.string.tours_kek),R.drawable.tour_kek_lok));
        list.add(new TourInfomation(context.getString(R.string.tours_khoo),R.drawable.tour_khoo_kongsi));
        list.add(new TourInfomation(context.getString(R.string.tours_museum),R.drawable.tour_museum));
        list.add(new TourInfomation(context.getString(R.string.tours_penang_hill),R.drawable.tour_penang_hill));
        list.add(new TourInfomation(context.getString(R.string.tours_street),R.drawable.tour_street));
        list.add(new TourInfomation(context.getString(R.string.tours_tropical),R.drawable.tour_tropical));

        MyListAdaptor listAdaptor = new MyListAdaptor(context,list);
        rootView.setAdapter(listAdaptor);
    }
}
