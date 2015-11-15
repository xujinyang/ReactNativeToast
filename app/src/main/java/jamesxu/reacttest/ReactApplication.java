package jamesxu.reacttest;

import android.app.Application;
import android.content.Context;

/**
 * Created by james on 14/11/15.
 */
public class ReactApplication extends Application {

    private static Application context;

    @Override
    public void onCreate() {
        super.onCreate();
        this.context = this;
    }

    public static Context getContext() {
        return context;
    }
}
