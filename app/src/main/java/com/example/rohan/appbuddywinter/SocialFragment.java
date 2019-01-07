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


public class SocialFragment extends Fragment {
    GridView grid;



    String[] icon={
            "Google",
            "Facebook",
            "Twitter",
            "Instagram",
            "YouTube",
            "CricBuzz",
            "LinkedIn",
            "Wittyfeed",
            "RVCJ",
            "Hotstar",
            "OLA",
            "Uber",
            "Outlook"};
    Integer[] image={
            R.drawable.google,
            R.drawable.fb_,
            R.drawable.twitter,
            R.drawable.instagram,
            R.drawable.youtube2,
            R.drawable.cricbuzz,
            R.drawable.linkedinlogo,
            R.drawable.witty,
            R.drawable.rvcj,
            R.drawable.hotstar2,
            R.drawable.mini_olaola,
            R.drawable.mini_uberlogodesign,
            R.drawable.mini_outlook };
    String[] url={
            "https://www.google.com",
            "https://www.facebook.com",
            "https://www.twitter.com",
            "https://www.instagram.com",
            "https://www.youtube.com",
            "https://www.cricbuzz.com",
            "https://www.linkedin.com",
            "https://www.wittyfeed.com",
            "https://www.rvcj.com",
            "https://www.hotstar.com",
            "https://www.olacabs.com/",
            "https://www.uber.com/en-IN/",
            "https://outlook.live.com/owa/?authRedirect=true"

    };




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_social, container, false);

        grid= view.findViewById(R.id.grid);
        SocialAdapter ad=  new SocialAdapter(getActivity(), icon, image);
        grid.setAdapter(ad);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i= new Intent(getActivity(), WebActivity.class);
                i.putExtra("key", url[position]);
                startActivity(i);


            }
        });

        return view;
    }



}
