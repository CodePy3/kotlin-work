// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val filename = args[0]
    val record = fetchData(filename)
    val lowest = record.minBy { it.second }
    val highest = record.maxBy { it.second }
    val mean = record.sumOf { it.second } / record.size
    println("Lowest Temp | Highest Temp")
    println("Name: %s, Temp: %f.2 | Name: %s, Temp: %f.2".format(lowest.first, lowest.second, highest.first, highest.second))
    println("Overall Mean: %f.2".format(mean))
    exitProcess(0)


}
