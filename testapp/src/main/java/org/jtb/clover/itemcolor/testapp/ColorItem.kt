package org.jtb.clover.itemcolor.testapp


class ColorItem(val color: Int) {
    val hexColor: String = String.format("#%06X", 0xFFFFFF and color)
}