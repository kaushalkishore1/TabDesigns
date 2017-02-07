package com.k2infosoft.tabdesigns;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.k2infosoft.tabdesigns.fragments.OneFragment;
import com.k2infosoft.tabdesigns.fragments.ThreeFragment;
import com.k2infosoft.tabdesigns.fragments.TwoFragment;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;
import com.luseen.spacenavigation.SpaceOnLongClickListener;
/*
* @author:kaushal kishore
* Created on:07:02:2017
*/
public class SpaceTab extends AppCompatActivity {
    private SpaceNavigationView spaceNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_tab);

        spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("HOME", R.drawable.home));
        spaceNavigationView.addSpaceItem(new SpaceItem("SEARCH", R.drawable.magnify));
        spaceNavigationView.shouldShowFullBadgeText(true);
        spaceNavigationView.setCentreButtonIconColorFilterEnabled(false);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.containerview, new ThreeFragment()).commit();

        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {

                                                        @Override
                                                        public void onCentreButtonClick() {
                                                            Log.d("onCentreButtonClick ", "onCentreButtonClick");
                                                            spaceNavigationView.shouldShowFullBadgeText(true);
                                                            FragmentManager mFragmentManager = getSupportFragmentManager();
                                                            FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                                                            fragmentTransaction.replace(R.id.containerview, new ThreeFragment()).commit();
                                                        }

                                                        @Override
                                                        public void onItemClick(int itemIndex, String itemName) {
                                                            //Log.d("onItemClick ", "" + itemIndex + " " + itemName);
                                                            switch (itemName) {

                                                                case "HOME":
                                                                    FragmentManager mFragmentManager = getSupportFragmentManager();
                                                                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                                                                    fragmentTransaction.replace(R.id.containerview, new OneFragment()).commit();
                                                                    break;

                                                                case "SEARCH": /** AlerDialog when click on Exit */
                                                                    mFragmentManager = getSupportFragmentManager();
                                                                    fragmentTransaction = mFragmentManager.beginTransaction();
                                                                    fragmentTransaction.replace(R.id.containerview, new TwoFragment()).commit();
                                                                    break;
                                                                default:
                                                                    mFragmentManager = getSupportFragmentManager();
                                                                    fragmentTransaction = mFragmentManager.beginTransaction();
                                                                    fragmentTransaction.replace(R.id.containerview, new OneFragment()).commit();
                                                                    break;
                                                            }

                                                        }

                                                        @Override
                                                        public void onItemReselected(int itemIndex, String itemName) {
                                                            //Log.d("onItemReselected ", "" + itemIndex + " " + itemName);
                                                            switch (itemName) {
                                                                case "HOME":
                                                                    FragmentManager mFragmentManager = getSupportFragmentManager();
                                                                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                                                                    fragmentTransaction.replace(R.id.containerview, new OneFragment()).commit();
                                                                    break;

                                                                case "SEARCH":
                                                                    mFragmentManager = getSupportFragmentManager();
                                                                    fragmentTransaction = mFragmentManager.beginTransaction();
                                                                    fragmentTransaction.replace(R.id.containerview, new TwoFragment()).commit();
                                                                    break;
                                                                default:
                                                                    mFragmentManager = getSupportFragmentManager();
                                                                    fragmentTransaction = mFragmentManager.beginTransaction();
                                                                    fragmentTransaction.replace(R.id.containerview, new OneFragment()).commit();
                                                                    break;
                                                            }
                                                        }
                                                    }

        );

        spaceNavigationView.setSpaceOnLongClickListener(new

                                                                SpaceOnLongClickListener() {
                                                                    @Override
                                                                    public void onCentreButtonLongClick() {
                                                                        FragmentManager mFragmentManager = getSupportFragmentManager();
                                                                        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                                                                        fragmentTransaction.replace(R.id.containerview, new OneFragment()).commit();
                                                                    }

                                                                    @Override
                                                                    public void onItemLongClick(int itemIndex, String itemName) {
                                                                        Toast.makeText(SpaceTab.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                                                                    }
                                                                }

        );
    }
}
