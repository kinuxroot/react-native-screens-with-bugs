package com.taoxia.app

import android.app.Application
import com.facebook.react.PackageList
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.soloader.SoLoader

class MainReactApplication : Application(), ReactApplication {
    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)
    }

    private val reactNativeHost =
        object : ReactNativeHost(this) {
            override fun getUseDeveloperSupport() = BuildConfig.DEBUG
            override fun getPackages(): List<ReactPackage> {
                // Packages that cannot be autolinked yet can be added manually here
                return PackageList(this).packages.toMutableList()
            }
            override fun getJSMainModuleName() = "index";
        }

    override fun getReactNativeHost(): ReactNativeHost = reactNativeHost
}