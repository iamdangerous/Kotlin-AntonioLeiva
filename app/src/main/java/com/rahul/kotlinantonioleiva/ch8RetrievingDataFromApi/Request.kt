package com.rahul.kotlinantonioleiva.ch8RetrievingDataFromApi

import android.util.Log
import java.net.URL

/**
 * Created by rkrde on 17-09-2017.
 */
class Request(val url:String) {

    val TAG = javaClass.simpleName
    fun run(){
        val forecastJsonStr = URL(url).readText()
        Log.d(TAG,forecastJsonStr)
    }
}