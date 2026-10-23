// Task 7.7.1: program to compute stats for a numeric dataset
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Invalid num of args")
    }

    val filename = args[0]
    val floatList = readData(filename)
    displayStats(floatList)

}