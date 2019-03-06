package com.example.ojooapp;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WeatherAdapter extends FragmentPagerAdapter {

    public WeatherAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new twoDBTFragment();
            case 1:
                return new twoDBTFragment();
            case 2:
                return new twoDBTFragment();
            case 3:
                return new twoDBTFragment();
            case 4:
                return new twoDBTFragment();

            default:
                return new twoDBTFragment();

        }
    }


    @Override
    public int getCount() {
        return 5;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "One";
            case 1:
                return "Two";
            case 2:
                return "Three";
            case 3:
                return "Four";
            case 4:
                return "Five";
            default:
                return "Six";
        }
    }
}
