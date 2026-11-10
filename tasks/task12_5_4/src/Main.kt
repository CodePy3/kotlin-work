// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val birthDate = LocalDate(1972, 3, 21)
    val marriedPerson = Person("John", birthDate).apply {
    isMarried = true
    }
    println(marriedPerson.name)
    println(marriedPerson.birth)
    println(marriedPerson.isMarried)
    println(marriedPerson.age)

}