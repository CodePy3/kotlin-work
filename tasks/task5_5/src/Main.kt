// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main (args: Array<String>) {
    if (args.size != 2) {
        println("Error incorrect num of args")
        exitProcess(1)
    }
    val string0 = args[0]
    val string1 = args[1]
    if (string0 anagramOf string1) {
        println("${args[0]} and ${args[1]} are anagrams!")
    }


   
    exitProcess(0)
}