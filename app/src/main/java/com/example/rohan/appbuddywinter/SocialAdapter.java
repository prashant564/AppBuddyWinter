package com.example.rohan.appbuddywinter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class SocialAdapter extends ArrayAdapter<String> {
    Activity act;
    String[] tit;
    Integer[] img;

    public SocialAdapter(Activity a, String[] title, Integer[] image) {
        super(a, R.layout.grid_social, title);
        act = a;
        tit = title;
        img = image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater li= act.getLayoutInflater();
        View v= li.inflate(R.layout.grid_social, null);
        TextView t1 = v.findViewById(R.id.textView2);
        ImageView i1 = v.findViewById(R.id.imageView2);
        t1.setText(tit[position]);
        i1.setImageResource(img[position]);

        return v;
    }
}
