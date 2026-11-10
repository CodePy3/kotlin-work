// Task 12.1: Point class
// class Point constructor(ix: Double, iy: Double) {
//     var x = ix
//     var y = iy
// }
// more concise version

import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance(dx: Double, dy: Double) = hypot(dx, dy)

    fun distanceTo(ix: Double, iy: Double): Double {
        val dx = x - ix
        val dy = y - iy
        return distance(dx, dy)
   
    }
}  

