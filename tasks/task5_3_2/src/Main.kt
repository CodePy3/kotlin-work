// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        rollDice()
    }
    else {
    val diceSides = args[0].toInt()
    val rolls = args[1].toInt()
    rollDice(diceSides, rolls)
    }
    
}