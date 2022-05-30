package com.b11101.mybugly;

import android.app.Application;
import android.content.Context;

import com.tencent.bugly.Bugly;

public class AJMyBugly {

  public static void initBugly(int appThemeMode, Context context, boolean isCn) {
        if (isCn) {
            Bugly.init(context, "f44e91d01e", true);
            return;
        }
        if (appThemeMode == 5) {
            Bugly.init(context, "afe17696da", true);
        } else {
            Bugly.init(context, "c5654d972e", true);
        }

    }

}
