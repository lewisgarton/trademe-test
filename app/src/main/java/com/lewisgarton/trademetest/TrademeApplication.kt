package com.lewisgarton.trademetest

import android.app.Application
import com.airbnb.mvrx.Mavericks

class TrademeApplication : Application() {
    override fun onCreate() {
        Mavericks.initialize(this)
        super.onCreate()
    }
}
