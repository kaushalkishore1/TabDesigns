package com.k2infosoft.k2floatingbutton.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.util.AttributeSet;
import android.view.View;

import com.k2infosoft.k2floatingbutton.FloatingTextButton;

/*
* @author:kaushal kishore
* Created on:07:02:2017
*/
public class SnackbarBehavior extends CoordinatorLayout.Behavior<FloatingTextButton> {

    public SnackbarBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(
            CoordinatorLayout parent,
            FloatingTextButton child,
            View dependency
    ) {
        return dependency instanceof Snackbar.SnackbarLayout;
    }

    @Override
    public boolean onDependentViewChanged(
            CoordinatorLayout parent,
            FloatingTextButton child,
            View dependency
    ) {
        if (child.getTranslationY() > 0) {
            return true;
        }

        child.setTranslationY(
                Math.min(0f, dependency.getTranslationY() - dependency.getHeight())
        );
        return true;
    }
}