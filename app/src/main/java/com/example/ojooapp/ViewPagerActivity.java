package com.example.ojooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

public class ViewPagerActivity extends AppCompatActivity {

    Toolbar toolbarViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        getSupportActionBar().hide();

        toolbarViewPager = findViewById(R.id.toolbarViewPager);




    }
}
