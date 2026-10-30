// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val result = runCatching {
        args.size == 1
    }
    if (result.isFailure) {
        println("Incorrect number of args")
    }

    val filename = args[0]
    val listOfDoubles = readData(filename)
    val variance = variance(listOfDoubles)
    println("Variance: %f.5".format(variance))

} 
