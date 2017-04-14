// (c)2016 Flipboard Inc, All Rights Reserved.

package com.rengwuxian.rxjavasamples;

import android.app.Application;

/**
 * https://github.com/rengwuxian/RxJavaSamples
 */
public class App extends Application {
    private static App INSTANCE;

    public static App getInstance() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }
}
