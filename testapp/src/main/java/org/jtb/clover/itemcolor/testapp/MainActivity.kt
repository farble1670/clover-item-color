package org.jtb.clover.itemcolor.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jtb.clover.itemcolor.ItemColor
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        grid.layoutManager = GridLayoutManager(this, 4);
        grid.setHasFixedSize(true)

        val items = ArrayList<ColorItem>()
        for (i in 1..(100 * 4)) {
            val color = ItemColor.colorInt(this, UUID.randomUUID().toString());
            items += ColorItem(color)
        }

        grid.adapter = ColorItemAdapter(this, items)
    }
}
