// Task 15.4.1: Shape class, a superclass for different kinds of shape

import java.awt.Color
import java.awt.Graphics2D

abstract class Shape(val x: Int, val y: Int, val color: Color) {
    abstract fun draw(context: Graphics2D)
}
