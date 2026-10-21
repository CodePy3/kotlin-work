// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    numbers.add(11)
    println(numbers)
    numbers.removeAt(2)
    println(numbers)
    numbers.removeAll(listOf(8))
    println(numbers)
}
