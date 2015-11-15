package jamesxu.reacttest;

import android.app.Application;

import com.facebook.react.LifecycleState;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.shell.MainReactPackage;

public class ReactTestInstanceManager {
    private static ReactInstanceManager sInstance = null;

    public static synchronized ReactInstanceManager getInstance() {
        if (sInstance == null) {
            sInstance = ReactInstanceManager.builder()
                    .setApplication((Application) ReactApplication.getContext())
                    .setBundleAssetName("index.android.bundle")
                    .setJSMainModuleName("index.android")
                    .addPackage(new MainReactPackage())
                    .addPackage(new AnExampleReactPackage())
                    .setUseDeveloperSupport(BuildConfig.DEBUG)
                    .setInitialLifecycleState(LifecycleState.RESUMED)
                    .build();
        }
        return sInstance;
    }

}
