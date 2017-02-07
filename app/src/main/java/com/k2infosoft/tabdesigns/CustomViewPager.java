package com.k2infosoft.tabdesigns;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/*
* @author:kaushal kishore
* Created on:07:02:2017
*/
public class CustomViewPager extends ViewPager {
    private boolean enabled;

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.enabled = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (enabled)
            return super.onTouchEvent(event);
        else
            return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return enabled && super.onInterceptTouchEvent(event);
    }

    public void setPagingEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isPagingEnabled() {
        return enabled;
    }

}
