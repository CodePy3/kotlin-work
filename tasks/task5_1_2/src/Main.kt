// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error incorrect num of args")
        exitProcess(1)
    }
    val diceSides = args[0].toInt()

    repeat(5) {
        rollDie(diceSides)
    }
    
}