// Task 5.4.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error invalid num of args")
        exitProcess(1)
    }
    val stringCheck = args[0].isTooLong
    println(stringCheck)

}