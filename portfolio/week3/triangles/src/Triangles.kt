// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(t: Triangle): Boolean {
    val(a,b,c) = t
    val aVal = if (a < b+c) true else false
    val bVal = if (b < a+c) true else false
    val cVal = if (c < b+a) true else false

    if (aVal && bVal && cVal) {
        return true
    }
    else {
        return false
    }
}

fun triangleArea(t: Triangle): Double {
    if (isValidTriangle(t) == false) { // Checks that triangle is valid and throws illegal argument exception if it returns false
        throw IllegalArgumentException("Invalid Triangle!")
    }

    val(a,b,c) = t
    val s = 0.5*(a+b+c)
    val area = sqrt(s*(s-a)*(s-b)*(s-c))
    return area
}
