package com.rahul.kotlinantonioleiva.ch10Parsing.domain

/**
 * Created by rkrde on 17-09-2017.
 */
interface Command<out T> {
    fun execute():T
}