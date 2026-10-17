// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error to many args passed")
        exitProcess(1)
    }

    val limit = args[0].toInt()
    var sum = 0

    for (n in 1..limit) {
        if (n % 2 != 0) {
            sum += n
        }
    }
    println(sum)
    exitProcess(0)
}
