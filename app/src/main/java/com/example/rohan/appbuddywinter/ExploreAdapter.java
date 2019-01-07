package com.example.rohan.appbuddywinter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ExploreAdapter  extends ArrayAdapter<String> {
    Activity act;
    String[] tit;
    Integer[] img;
    public ExploreAdapter(Activity a,String[] title, Integer[] image) {
        super(a, R.layout.grid_explore, title);
        act = a;
        tit = title;
        img = image;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater li= act.getLayoutInflater();
        View v= li.inflate(R.layout.grid_explore, null);

        ImageView i1 = v.findViewById(R.id.imageView2);

        i1.setImageResource(img[position]);

        return v;
    }
}
