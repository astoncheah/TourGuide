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

public class Shopping extends Fragment {
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
        list.add(new TourInfomation(context.getString(R.string.shopping_avenue),0));
        list.add(new TourInfomation(context.getString(R.string.shopping_batu),0));
        list.add(new TourInfomation(context.getString(R.string.shopping_gerney_paragon),0));
        list.add(new TourInfomation(context.getString(R.string.shopping_gerney_plaza),0));
        list.add(new TourInfomation(context.getString(R.string.shopping_prangin),0));
        list.add(new TourInfomation(context.getString(R.string.shopping_queens),0));
        list.add(new TourInfomation(context.getString(R.string.shopping_straits),0));

        MyListAdaptor listAdaptor = new MyListAdaptor(context,list);
        rootView.setAdapter(listAdaptor);
    }
}
