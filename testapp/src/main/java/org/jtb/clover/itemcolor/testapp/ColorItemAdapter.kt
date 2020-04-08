package org.jtb.clover.itemcolor.testapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ColorItemAdapter(private val context: Context, private val items: List<ColorItem>): RecyclerView.Adapter<ColorItemAdapter.Holder>() {

    class Holder(val view: TextView): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: TextView = LayoutInflater.from(context).inflate(R.layout.item_color, parent, false) as TextView
        return Holder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setBackgroundColor(items[position].color)
        (holder.itemView as TextView).text = items[position].hexColor
    }
}