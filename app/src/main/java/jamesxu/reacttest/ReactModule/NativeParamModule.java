package jamesxu.reacttest.ReactModule;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;

/**
 * Created by james on 16/11/15.
 */
public class NativeParamModule extends ReactContextBaseJavaModule {
    public NativeParamModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "NativeManageTest";
    }

    @ReactMethod
    public void getParam(Callback callback) {
        WritableMap map = new WritableNativeMap();
        map.putString("name", "我是传递的参数");
        callback.invoke(map);
    }
}
