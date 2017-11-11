package com.rahul.kotlinantonioleiva.ch10Parsing

/**
 * Created by rkrde on 17-09-2017.
 */
class ForecastRequest(zip:String) {
    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val URL = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "${URL}&APPID=${APP_ID}&q="
    }


}