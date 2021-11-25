package com.b11101.mybugly;

import android.app.Application;
import android.content.Context;

import com.tencent.bugly.Bugly;

public class AJMyBugly {

    public static void initBugly(int appThemeMode, Context context){
        if (appThemeMode == 5) {
            Bugly.init(context, "afe17696da", true);
        } else {
            Bugly.init(context, "c5654d972e", true);
        }

    }


}
