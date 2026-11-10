// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main() {
    val birthDate = LocalDate(1972, 3, 21)
    val p1 = Person.create("Joe", birthDate)
    println(p1)
    val p2 = Person.create("Joe", birthDate)
    println(p2)
}