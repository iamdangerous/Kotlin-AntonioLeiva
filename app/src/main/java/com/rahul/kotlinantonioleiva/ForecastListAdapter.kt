package com.rahul.kotlinantonioleiva

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text

/**
 * Created by rkrde on 16-09-2017.
 */

class ForecastListAdapter(private val items:List<String>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder  =
       ViewHolder(TextView(parent?.context))

    override fun getItemCount(): Int  = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        val h = holder as ViewHolder
        h.textView.text = items[position]
    }

    class ViewHolder(val textView:TextView): RecyclerView.ViewHolder(textView)

}
