package com.example.ojooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent splashtoViewpager = new Intent(SplashActivity.this,MainActivity.class);

        //Do Next: send to ViewpagerActivity
        startActivity(splashtoViewpager);
    }
},3000);




    }
}
