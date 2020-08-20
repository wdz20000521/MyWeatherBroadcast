package com.myweatherbroadcast.android.logic.network

import com.myweatherbroadcast.android.MyWeatherBroadcastApplication
import com.myweatherbroadcast.android.logic.model.DailyResponse
import com.myweatherbroadcast.android.logic.model.RealTimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

    @GET("v2.5/${MyWeatherBroadcastApplication.token}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String) : Call<DailyResponse>

    @GET("v2.5/${MyWeatherBroadcastApplication.token}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String) : Call<RealTimeResponse>

}