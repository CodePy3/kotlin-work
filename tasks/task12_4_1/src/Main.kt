// Task 12.4.1: main program
fun main() {
    val centre = Point(1.0, 1.0)
    val p2 = Point(1.2, 1.2)
    val c = Circle(centre, 1.0)
    val cArea = c.area()
    val cPer = c.perimeter()
    val cContains = c.contains(p2)
    println(cArea)
    println(cPer)
    println(cContains)
    println(c)
}