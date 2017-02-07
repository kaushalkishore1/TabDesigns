package com.k2infosoft.tabdesigns;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.k2infosoft.tabdesigns.fragments.OneFragment;
import com.k2infosoft.tabdesigns.fragments.ThreeFragment;
import com.k2infosoft.tabdesigns.fragments.TwoFragment;

/*
* @author:kaushal kishore
* Created on:07:02:2017
*/
public class MainTabsAdapter extends FragmentPagerAdapter {
    MainTabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new OneFragment();

            case 1:
                return new TwoFragment();

            case 2:
                return new ThreeFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
