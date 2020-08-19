package com.myweatherbroadcast.android.logic

import androidx.lifecycle.liveData
import com.myweatherbroadcast.android.logic.network.MyWeatherBroadcastNetwork
import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext


object Respository {

    fun searchPlaces(query: String) = fire(Dispatchers.IO) {
        val placeResponse = MyWeatherBroadcastNetwork.searchPlaces(query)
        if (placeResponse.status == "ok") {
            val places = placeResponse.place
            Result.success(places)
        } else {
            Result.failure(RuntimeException("返回状态为：${placeResponse.status}"))
        }
    }

    private fun <T> fire(context: CoroutineContext, block: suspend () -> Result<T>) =
        liveData<Result<T>>(context) {
            val result = try {
                block()
            } catch (e: Exception) {
                Result.failure<T>(e)
            }
            emit(result)
        }
}