package com.example.fsquare

import android.app.Application
import com.parse.Parse

class StarterApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG)
        Parse.initialize(Parse.Configuration.Builder(this)
            .applicationId("lptMbPlr9zLOm3Byzk9QceGYvVE25jFFI12fyPlL")
            .clientKey("Y28O28w9yB1kDp21ILWOPeLF5Wp2q4chUo9WWLUw")
            .server("https://parseapi.back4app.com/")
            .build())

    }

}