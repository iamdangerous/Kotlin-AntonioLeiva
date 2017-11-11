package com.rahul.kotlinantonioleiva

/**
 * Created by rkrde on 16-09-2017.
 */

class Person(name: String, age: Int) : Animal(name) {
    init {
        println("name is:$name")
    }

    var someProperty: String = "defaultValue"
        get() = field.toUpperCase()
        set(value) {
            field = value + "a"
        }
}
