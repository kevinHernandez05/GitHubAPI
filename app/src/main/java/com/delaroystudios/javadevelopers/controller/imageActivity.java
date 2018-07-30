package com.delaroystudios.javadevelopers.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.delaroystudios.javadevelopers.R;

public class imageActivity extends AppCompatActivity {

    private String imageURL;
    private ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_image_activity);

        Intent intent = getIntent();
        imageURL = intent.getStringExtra("ImageURL");

        imageView = (ImageView) findViewById(R.id.profile);

        Glide.with(this)
                .load(imageURL)
                .placeholder(R.drawable.load)
                .into(imageView);
    }

}
