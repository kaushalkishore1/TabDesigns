package com.k2infosoft.k2floatingbutton.util;

import android.content.Context;
import android.util.TypedValue;
/*
* @author:kaushal kishore
* Created on:07:02:2017
*/
public class DimensionUtils {

    public static int dpToPx(Context context, int dp) {
        return (int) TypedValue
                .applyDimension(
                        TypedValue.COMPLEX_UNIT_DIP,
                        dp,
                        context.getResources().getDisplayMetrics()
                );
    }
}
