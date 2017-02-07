package com.k2infosoft.tabdesigns;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
* @author:kaushal kishore
* Created on:07:02:2017
*/
public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_simpletab)
    com.k2infosoft.k2floatingbutton.FloatingTextButton msimpletab;
    @BindView(R.id.tv_scroable)
    com.k2infosoft.k2floatingbutton.FloatingTextButton mscroable;
    @BindView(R.id.tv_nonscroable)
    com.k2infosoft.k2floatingbutton.FloatingTextButton micon_nonscroltab;
    @BindView(R.id.action_icontab)
    com.k2infosoft.k2floatingbutton.FloatingTextButton micontab;
    @BindView(R.id.action_icontexttab)
    com.k2infosoft.k2floatingbutton.FloatingTextButton micontexttab;
    @BindView(R.id.action_nonscroltab)
    com.k2infosoft.k2floatingbutton.FloatingTextButton mnonScroltab;
    @BindView(R.id.action_nonbottomtab)
    com.k2infosoft.k2floatingbutton.FloatingTextButton mbottomtab;
    @BindView(R.id.action_collapsetab)
    com.k2infosoft.k2floatingbutton.FloatingTextButton mcollapsetab;
    @BindView(R.id.action_navtab)
    com.k2infosoft.k2floatingbutton.FloatingTextButton mnavtab;
    @BindView(R.id.action_navstriptab)
    com.k2infosoft.k2floatingbutton.FloatingTextButton mnavstriptab;
    @BindView(R.id.action_spacetab)
    com.k2infosoft.k2floatingbutton.FloatingTextButton mspacetab;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.toolbar)
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


    @OnClick(R.id.tv_simpletab)
    public void setMsimpletab(View view) {
        // TODO submit data to server...
        Intent intent = new Intent(MainActivity.this, SimpleTabsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.tv_scroable)
    public void setMscroable(View view) {
        // TODO submit data to server...
        Intent intent = new Intent(MainActivity.this, ScrollableTabsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.tv_nonscroable)
    public void setMicon_nonscroltab(View view) {
        // TODO submit data to server...
        Intent intent = new Intent(MainActivity.this, IconTabsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.action_icontab)
    public void setMicontab(View view) {
        // TODO submit data to server...
        Intent intent = new Intent(MainActivity.this, IconTextTabsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.action_icontexttab)
    public void setMicontexttab(View view) {
        // TODO submit data to server...
        Intent intent = new Intent(MainActivity.this, SimpleTabsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.action_nonscroltab)
    public void setMnonScroltab(View view) {
        // TODO submit data to server...
        Intent intent = new Intent(MainActivity.this, NonSwipeableTab.class);
        startActivity(intent);
    }

    @OnClick(R.id.action_navtab)
    public void setMnavtab(View view) {
        // TODO submit data to server...
        Intent intent = new Intent(MainActivity.this, DemoActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.action_navstriptab)
    public void setMnavstriptab(View view) {
        Intent intent = new Intent(MainActivity.this, CustomStripTab.class);
        startActivity(intent);
    }

    @OnClick(R.id.action_nonbottomtab)
    public void setMbottomtab(View view) {
        // TODO submit data to server...
        Intent intent = new Intent(MainActivity.this, BottonTab.class);
        startActivity(intent);
    }

    @OnClick(R.id.action_collapsetab)
    public void setMcollapsetab(View view) {
        Intent intent = new Intent(MainActivity.this, CollapseTabActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.action_spacetab)
    public void setMspacetab(View view) {
        Intent intent = new Intent(MainActivity.this, SpaceTab.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
