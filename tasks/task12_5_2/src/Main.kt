// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val birthDate = LocalDate(1997,2,22)
    val marriedPerson = Person("Bobby Boy", birthDate).apply {
    isMarried = true
    }
    println(marriedPerson.name)
    println(marriedPerson.birth)
    println(marriedPerson.isMarried)

}