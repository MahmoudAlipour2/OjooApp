package com.example.ojooapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    ViewPager vpWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        vpWeather = findViewById(R.id.vpWeather);
        TabLayout tab = findViewById(R.id.tab);

        WeatherAdapter adapter = new WeatherAdapter(getSupportFragmentManager());
        vpWeather.setAdapter(adapter);

        tab.setupWithViewPager(vpWeather);

    }
}
