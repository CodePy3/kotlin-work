// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error incorrect num of args")
        exitProcess(1)
    }
    val radiusInp = args[0].toDouble()
    val area = circleArea(radiusInp)
    val perimeter = circlePerimeter(radiusInp)
    println("Area = %.2f | Perimeter = %.2f".format(area, perimeter))
    exitProcess(0)
}