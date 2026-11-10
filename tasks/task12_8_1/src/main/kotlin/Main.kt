// Task 12.8.1: demo program for Day enum class

fun main() {
    print("Enter a day of the week: ")
    val inputDay = readln()
    try {
        val enumDay = Day.valueOf(inputDay)
        println(enumDay.ordinal)
    }
    catch (error: Exception){
        println("Input is not a day of the week starting with a capital!")
    }
}
