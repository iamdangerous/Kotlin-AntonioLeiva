package com.rahul.kotlinantonioleiva.ch10Parsing

import java.util.*

/**
 * Created by rkrde on 17-09-2017.
 */
data class Forecast(val dt: Long, val temp: Temperature, val pressure: Float,
                     val humidity: Int, val weather: List<Weather>,
                    val speed: Float, val deg: Int, val clouds: Int,
                    val rain: Float)