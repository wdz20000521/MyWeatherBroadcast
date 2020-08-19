package com.myweatherbroadcast.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MyWeatherBroadcastApplication : Application() {

    companion object {
        const val token = "YK8faEagFc5FB7Ic"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}