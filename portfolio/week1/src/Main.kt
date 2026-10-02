// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

// My plan (essential steps):
// 1) check that their are 3 valid arguments ✅
// 2) if there isn't then print error message in correct format ✅
// 3) convert args to floats using toFloat()
// 4) calculate s 1/2(a+b+c) ✅
// 5) calculate area sqrt(s(s-a)(s-b)(s-c))✅
// 6) print area in correct format (with 5 decimal places)✅
// 7) use valid exit codes 0 = good 1 = bad✅

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()
    val s = 0.5*(a+b+c)
    val area = sqrt(s*(s-a)*(s-b)*(s-c))
    println("Area = %.5f".format(area))
    exitProcess(0)
}