package com.example.ojooapp;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return new FirstFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

/*    @Nullable
   @Override
    public CharSequence getPageTitle(int position) {

        switch (position){

            case 0:
                return "Page1";
            case 1:
                return "Page2";
            case 2:
                return "Page3";
            default:
                return "Unknown page!";
        }

    }*/
}
