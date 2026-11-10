// Task 12.1: program that uses a Point object
fun main() {

    val p = Point(4.0, 5.0)

    val distanceFromOrigin = p.distanceTo(0.0, 0.0)
    println("Distance from origin is: %.2f".format(distanceFromOrigin))

    val distanceFromPoint = p.distanceTo(4.5,7.0)
    println("Distance from point is: %.2f".format(distanceFromPoint))

}