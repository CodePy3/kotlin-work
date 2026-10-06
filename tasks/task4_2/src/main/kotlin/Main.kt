// Task 4.2: use of if and ranges

fun main() {
    println("Pizza Menu:")
    println("a. Margarita")
    println("b. Pepperoni")
    println("c. Hawaian")
    println("d. Meat Feast")
    print("Enter Your Order: ")
    val order = readln().lowercase()

    val message = if (order[0] in 'a'..'d') {
        "Order Accepted!"
    }
    else {
        "Order Invalid!"
    }
    println(message)
}
