package com.example.rohan.appbuddywinter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


public class ExploreFragment extends Fragment {
    GridView grid;
    String[] title={
            "shopping","news","recharge","travel","movies"
    };
    Integer[] image={
            R.drawable.s,
            R.drawable.n,
            R.drawable.r,
            R.drawable.travel,
            R.drawable.m

    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_explore, container, false);

        grid= view.findViewById(R.id.grid2);
        ExploreAdapter ad=  new ExploreAdapter(getActivity(), title,image);
        grid.setAdapter(ad);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                startActivity(new Intent(getActivity(), WebActivity.class)
                        .putExtra("key","https://rsrohanverma.wixsite.com/shoppingbyappbuddy"));


            }
        });

        return view;
    }

}
