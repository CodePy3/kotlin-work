// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main (args: Array<String>) {
    if (args.size != 2) {
        println("Error incorrect num of args")
        exitProcess(1)
    }
    val string0 = args[0]
    val string1 = args[1]
    val outcome = anagrams(string0, string1)
    println(outcome)
    exitProcess(0)
}