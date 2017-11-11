package com.rahul.kotlinantonioleiva

import android.content.Context
import android.widget.Toast
import java.time.Duration

/**
 * Created by rkrde on 16-09-2017.
 */
class Extension {

    fun Context.toast(msg:CharSequence,duration: Int=Toast.LENGTH_SHORT){

        Toast.makeText(this,msg,duration).show()
    }
}