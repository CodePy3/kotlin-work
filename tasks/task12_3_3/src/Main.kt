// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val birthDate = "2002-10-21"
    val marriedPerson = Person("     ", birthDate).apply {
    isMarried = true
    }
    println(marriedPerson.name)
    println(marriedPerson.birth)
    println(marriedPerson.isMarried) 
}