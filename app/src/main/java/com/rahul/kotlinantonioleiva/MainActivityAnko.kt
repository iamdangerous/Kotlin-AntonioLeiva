package com.rahul.kotlinantonioleiva

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.rahul.kotlinantonioleiva.ch8RetrievingDataFromApi.Request
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivityAnko : AppCompatActivity() {

//    val list = arrayListOf<String>("apple","ball","cat","dog")
    private val items = listOf("apple","ball","cat","dog")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val forecastList = findViewById<RecyclerView>(R.id.forecast_list)
        val forecastList :RecyclerView = find(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)

        toast("I am Rahul")

        /*
        *
        * Chapter 8
        * */
        val url = "http://api.openweathermap.org/data/2.5/forecast/daily?" +
                "APPID=15646a06818f61f7b8d7823ca833e1ce&q=94043&mode=json&units=metric&cnt=7"

        doAsync {
            Request(url).run()
            uiThread { longToast("Request performed") }
        }


    }
}
