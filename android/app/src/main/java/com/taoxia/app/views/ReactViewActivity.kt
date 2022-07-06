package com.taoxia.app.views

import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.ReactRootView
import com.taoxia.app.BuildConfig

class ReactViewActivity: ReactActivity() {
    override fun getMainComponentName(): String = "taoxiaapp"

    override fun createReactActivityDelegate(): ReactActivityDelegate {
        return ReactViewActivityDelegate(this, mainComponentName)
    }

    class ReactViewActivityDelegate(
        activity: ReactActivity?,
        mainComponentName: String?
    ) :
        ReactActivityDelegate(activity, mainComponentName) {
        override fun createRootView(): ReactRootView {
            val reactRootView = ReactRootView(context)
            reactRootView.setIsFabric(BuildConfig.IS_NEW_ARCHITECTURE_ENABLED)
            return reactRootView
        }
    }
}