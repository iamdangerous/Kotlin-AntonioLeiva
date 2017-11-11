package com.rahul.kotlinantonioleiva.Ch9DataClass

import android.util.Log
import com.rahul.kotlinantonioleiva.ch10Parsing.Forecast
import java.util.*

/**
 * Created by rkrde on 17-09-2017.
 */

class Ch9{

    fun main(args: Array<String>) {

        val f1 = Forecast(Date(), 27.5f, "Shiny day")

        /*
        * multi-declaration
        * */
        val(date,temp,details) = f1
        //=============OR===============

        val d = f1.date
        val t = f1.temperature
        val de = f1.details

        val map = mapOf("a" to 1, "b" to 2, "c" to 3)
        for ((key, value) in map) {
            Log.d("map", "key:$key, value:$value")
        }

}
}