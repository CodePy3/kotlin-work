// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = (sideA + sideB + sideC) / 2
    val area: Double get() {
        val s = 0.5*(sideA+sideB+sideC)
        val area = sqrt(s*(s-sideA)*(s-sideB)*(s-sideC))
        return area
        }


    init {
            val aVal = if (sideA < sideB+sideC) true else false
            val bVal = if (sideB < sideA+sideC) true else false
            val cVal = if (sideC < sideB+sideA) true else false

            require(aVal && bVal && cVal) {"Invalid Sides"}
    }

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}