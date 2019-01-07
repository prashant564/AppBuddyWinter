package com.example.rohan.appbuddywinter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {
    CircleImageView imageUser;
    TextView nameUser, emailUser;
    FirebaseAuth firebaseAuth;
    Button logOut;
    FirebaseAuth.AuthStateListener stateListener;


    FirebaseAuth.AuthStateListener mAuthListner;


    String name, email; Uri image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageUser=findViewById(R.id.imageUser);
        nameUser=findViewById(R.id.nameUser);
        emailUser=findViewById(R.id.emailUser);
        logOut=findViewById(R.id.logout);


        //firebaseAuth.getCurrentUser();

        final FirebaseUser firebaseUser=FirebaseAuth.getInstance().getCurrentUser();
        if(firebaseUser!=null)
        {
            // assert firebaseUser != null;
            name=firebaseUser.getDisplayName();
            nameUser.setText(name);
            email=firebaseUser.getEmail();
            emailUser.setText(email);
            image=firebaseUser.getPhotoUrl();
            //imageUser.setImageURI(null);
            //imageUser.setImageURI(image);
            if (image!=null)
            {
                Glide.with(getApplicationContext()).load(image).into(imageUser);
            }else{
                Glide.with(getApplicationContext()).load(R.mipmap.ic_launcher).into(imageUser);
            }


        }


    }
    public void logOut(View view)
    {
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        mAuth.signOut();
        startActivity(new Intent(ProfileActivity.this, MainActivity.class));
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ProfileActivity.this,MainActivity.class));
        finish();
    }
}
