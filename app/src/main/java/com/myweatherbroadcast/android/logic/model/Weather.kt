package com.myweatherbroadcast.android.logic.model

data class Weather(val realtime: RealTimeResponse.Realtime, val daily: DailyResponse.Daily) {
}