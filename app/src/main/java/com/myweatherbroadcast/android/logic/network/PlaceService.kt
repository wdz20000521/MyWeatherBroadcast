package com.myweatherbroadcast.android.logic.network

import com.myweatherbroadcast.android.MyWeatherBroadcastApplication
import com.myweatherbroadcast.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${MyWeatherBroadcastApplication.token}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}