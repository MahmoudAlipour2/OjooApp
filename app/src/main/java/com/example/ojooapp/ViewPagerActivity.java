package com.example.ojooapp;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerActivity extends AppCompatActivity {
    ViewPager vpFirst;
    TabLayout tabOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        getSupportActionBar().hide();

        vpFirst = findViewById(R.id.vpFirst);
        tabOne = findViewById(R.id.tabOne);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        vpFirst.setAdapter(adapter);
        tabOne.setupWithViewPager(vpFirst);
    }
}
