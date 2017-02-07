package com.k2infosoft.tabdesigns;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.k2infosoft.tabdesigns.fragments.EightFragment;
import com.k2infosoft.tabdesigns.fragments.FiveFragment;
import com.k2infosoft.tabdesigns.fragments.FourFragment;
import com.k2infosoft.tabdesigns.fragments.NineFragment;
import com.k2infosoft.tabdesigns.fragments.OneFragment;
import com.k2infosoft.tabdesigns.fragments.SevenFragment;
import com.k2infosoft.tabdesigns.fragments.SixFragment;
import com.k2infosoft.tabdesigns.fragments.TenFragment;
import com.k2infosoft.tabdesigns.fragments.ThreeFragment;
import com.k2infosoft.tabdesigns.fragments.TwoFragment;

import java.util.ArrayList;
import java.util.List;
/*
* @author:kaushal kishore
* Created on:07:02:2017
*/
public class NonSwipeableTab extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager mViewPager;

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private int[] tabIcons = {
            R.drawable.ic_tab_call,
            R.drawable.ic_tab_contacts,
            R.drawable.ic_tab_favourite
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_swipeable_tab);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (NoSwipeViewPager) findViewById(R.id.container);
        //mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]).setText("Call");
        tabLayout.getTabAt(1).setIcon(tabIcons[1]).setText("Contacts");
        tabLayout.getTabAt(2).setIcon(tabIcons[2]).setText("Favourite");
    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            if (position == 0) {
                return new OneFragment();
            } else if (position == 1) {
                return new TwoFragment();
            } else if (position == 2) {
                return new ThreeFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }
}
