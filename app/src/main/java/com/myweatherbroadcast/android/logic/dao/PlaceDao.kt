package com.myweatherbroadcast.android.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.myweatherbroadcast.android.MyWeatherBroadcastApplication
import com.myweatherbroadcast.android.logic.model.Place

object PlaceDao {

    private fun sharedPreferences() = MyWeatherBroadcastApplication.context.getSharedPreferences("my_weatherbroadcast", Context.MODE_PRIVATE)

    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace() :Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")
}