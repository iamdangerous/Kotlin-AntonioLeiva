package com.rahul.kotlinantonioleiva.ch8RetrievingDataFromApi

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future

/**
 * Created by rkrde on 17-09-2017.
 */
fun main(args: Array<String>) {

    val executor = Executors.newFixedThreadPool(10)
    val future = executor.submit(object :Callable<String>{
        override fun call(): String {
            return "Rahul Lohra"
        }
    })
    val s2 = future.get()
    val s1 = displayOtherThings()
    println(s1)
    println(s2)
}

fun displayOtherThings():String{
    return "kumar"
}