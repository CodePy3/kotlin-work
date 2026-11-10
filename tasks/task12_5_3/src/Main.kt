// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
    val birthDate = LocalDate(1997, 3, 21)
    val marriedPerson = Person("John", birthDate).apply {
    isMarried = true
    }
    println(marriedPerson.name)
    println(marriedPerson.birth)
    println(marriedPerson.isMarried)

    marriedPerson.name = ""
    println(marriedPerson.name)

}