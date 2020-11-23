package ca.koho.cordova.plugin.firebase.messaging;

import android.annotation.SuppressLint;
import android.util.Log;

import org.apache.cordova.CordovaPlugin;

public class FirebaseMessagingExtensionPlugin extends CordovaPlugin {
    private static final String TAG = "FirebaseMessagingExtensionPlugin";
    @SuppressLint("LongLogTag")
    @Override
    protected void pluginInitialize() {
        Log.d(TAG, "pluginInitialize");
    }
}